package com.ibm.reactive.mutiny;

import io.smallrye.mutiny.Multi;

public class MultiStream {
    public static void main(String[] args) {
        Multi.createFrom().items(1, 2, 3, 4).subscribe().with(System.out::println);
    }
}
