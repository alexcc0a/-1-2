package com.company;

    @FunctionalInterface
    public interface OnTaskErrorListener {
        boolean onError(int i);
    }
