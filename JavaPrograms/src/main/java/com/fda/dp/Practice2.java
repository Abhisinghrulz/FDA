package com.fda.dp;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class Practice2 {
    public static void main(String[] args) {
        List<CompletableFuture<?>> lt = null;

        lt.stream().map(CompletableFuture::join).collect(Collectors.toList());
    }
}

