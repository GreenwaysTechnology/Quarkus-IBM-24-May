package com.ibm.rest.client;

import io.quarkus.runtime.StartupEvent;
import io.vertx.core.Vertx;
import io.vertx.ext.consul.ConsulClient;
import io.vertx.ext.consul.ConsulClientOptions;
import io.vertx.ext.consul.ServiceOptions;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class BeanRegistration {
    @ConfigProperty(name = "consul.host")
    String host;
    @ConfigProperty(name = "consul.port")
    int port;
    //Service port and host
    @ConfigProperty(name = "hello-service-port", defaultValue = "9000")
    int hello;

    public void init(@Observes StartupEvent event, Vertx vertx) {
        //consul server configuration
        ConsulClient client = ConsulClient.create(vertx, new
                ConsulClientOptions().setHost(host).setPort(port));
        //service registration with consul server
        client.registerService(new ServiceOptions()
                .setPort(hello)
                .setAddress("localhost")
                .setName("hello-service")
                .setId("hello")
        );
    }
}
