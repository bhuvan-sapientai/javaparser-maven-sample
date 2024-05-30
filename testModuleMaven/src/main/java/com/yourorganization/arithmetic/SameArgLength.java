package com.yourorganization.arithmetic;

public class SameArgLength {

    private final long value;
    private final int originallyEncodedSize;

    private SameArgLength(long value, int originallyEncodedSize) {
        this.value = value;
        this.originallyEncodedSize = originallyEncodedSize;
    }

    @Deprecated
    public SameArgLength(long value) {
        this.value = value;
        originallyEncodedSize = 0;
    }

    @Deprecated
    public SameArgLength(byte[] buf, int offset) {
        value = 0L;
        originallyEncodedSize = 0;
    }

    public long longValue() {
        return value;
    }

}
