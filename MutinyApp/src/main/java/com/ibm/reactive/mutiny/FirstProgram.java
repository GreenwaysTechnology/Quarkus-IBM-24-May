package com.ibm.reactive.mutiny;

import io.smallrye.mutiny.Uni;

public class FirstProgram {
    public static void main(String[] args) {
        Uni.createFrom().item("Hello").subscribe().with(item-> System.out.println(item));
    }

    public static class ErrorEvent {

    }
}
