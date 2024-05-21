package com.ibm.reactive.mutiny;

import io.smallrye.mutiny.Uni;

class Publisher {
    public Uni<String> getData(){
        return  Uni.createFrom().item("Hello");
    }
}
class Subscriber {
    private Publisher publisher = new Publisher();
    public void getData(){
        publisher.getData().subscribe().with(item-> System.out.println(item));
    }
}


public class PublisherAndSubscriber {
    public static void main(String[] args) {
        Subscriber subscriber = new Subscriber();
        subscriber.getData();
    }
}
