package com.ibm.cdi.service.lifecycles;

import io.quarkus.runtime.Shutdown;
import io.quarkus.runtime.Startup;
import io.quarkus.runtime.StartupEvent;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

import java.util.List;

@ApplicationScoped
public class UserService {

    List list;

    @Startup
    public void init() {
        list = List.of("Subramanian", "Murugan", "Ram");
    }

    public void start(@Observes StartupEvent startupEvent) {
        System.out.println("Startup event");
    }

    @Shutdown
    public void destroy() {
        System.out.println("Bean destroyed");
    }

    //    public List<String> geUsers() {
//        return list;
//    }
    public Uni<List<String>> geUsers() {
        return Uni.createFrom().item(list);
    }
}
