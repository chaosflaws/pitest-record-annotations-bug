package com.example;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.time.LocalDate;

public interface DateRange {
    LocalDate start();

    @Nullable
    LocalDate end();
}
