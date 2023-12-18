package com.example;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.time.LocalDate;

public record SafeFiniteRange(@NonNull LocalDate start,
                              @NonNull LocalDate end)
        implements DateRange {
}
