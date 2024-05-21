package com.ibm.reactive.mutiny;

import io.smallrye.mutiny.Uni;

public class ErrorEvent {
    public static void main(String[] args) {
        Uni.createFrom().failure(new RuntimeException("Something went wrong")).subscribe().with(data->{

        },err->{
            System.out.println(err);
        });
    }
}
