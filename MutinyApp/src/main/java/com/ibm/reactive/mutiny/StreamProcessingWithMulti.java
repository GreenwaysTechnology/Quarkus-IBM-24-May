package com.ibm.reactive.mutiny;

import io.smallrye.mutiny.Multi;

public class StreamProcessingWithMulti {
    public static void main(String[] args) {
        Multi.createFrom()
                .range(1, 100)
                .onItem().transform(item -> item * 3)
                .filter(item -> item % 2 != 0)
                .select().first(10)
                .filter(item->item > 5 && item < 10)
                .subscribe().with(System.out::println);
    }
}
