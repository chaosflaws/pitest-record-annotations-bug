package com.example;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.time.LocalDate;

public record SafeRange(@Nullable LocalDate start,
                        @Nullable LocalDate end)
        implements DateRange {

    public SafeFiniteRange toFinite() {
        if (start == null)
            throw new IllegalStateException();
        if (end == null)
            throw new IllegalStateException();
        return new SafeFiniteRange(start, end);
    }
}
