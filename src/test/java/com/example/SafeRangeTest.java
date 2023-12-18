package com.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class SafeRangeTest {
    private static final LocalDate D2000_01_01 = LocalDate.of(2000, Month.JANUARY, 1);
    private static final LocalDate D2000_01_02 = LocalDate.of(2000, Month.JANUARY, 2);

    @Test
    void toFinite__start_null__throws() {
        SafeRange range = new SafeRange(null, D2000_01_02);

        assertThrows(IllegalStateException.class, range::toFinite);
    }

    @Test
    void toFinite__end_null__throws() {
        SafeRange range = new SafeRange(D2000_01_02, null);

        assertThrows(IllegalStateException.class, range::toFinite);
    }

    @Test
    void toFinite__valid_value__returns_safe_finite_range_with_equal_values() {
        SafeRange range = new SafeRange(D2000_01_01, D2000_01_02);
        SafeFiniteRange expected = new SafeFiniteRange(D2000_01_01, D2000_01_02);

        assertInstanceOf(expected.getClass(), range.toFinite());
        assertEquals(expected, range.toFinite());
    }
}
