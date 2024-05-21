package com.ibm.reactive.mutiny;

import io.smallrye.mutiny.Uni;

public class UniTransformation {
    public static void main(String[] args) {
        Uni.createFrom()
                .item("hello")
                .onItem()
                .transform(String::toUpperCase)
                .subscribe()
                .with(System.out::println);
    }
}
