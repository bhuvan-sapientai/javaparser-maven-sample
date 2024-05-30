package com.yourorganization.arithmetic.bytes;

import java.io.IOException;
import java.io.Writer;

public class ByteBoundary {
    private final byte below;
    private final byte above;
    private final boolean between;

    public ByteBoundary() {
        this((byte)0, Byte.MAX_VALUE, true);
    }

    private ByteBoundary(final byte below, final byte above, final boolean between) {
        this.below = below;
        this.above = above;
        this.between = between;
    }

    public boolean translate(final byte codePoint, final Writer out) throws IOException {
        if (between) {
            if (codePoint < below || codePoint > above) {
                return false;
            }
        } else if (codePoint >= below && codePoint <= above) {
            return false;
        }
        return true;
    }
}
