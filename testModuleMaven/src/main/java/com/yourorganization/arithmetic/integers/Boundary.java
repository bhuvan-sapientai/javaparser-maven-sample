package com.yourorganization.arithmetic.integers;

import java.io.IOException;
import java.io.Writer;

public class Boundary {
    private final int below;
    private final int above;
    private final boolean between;

    public Boundary() {
        this(0, Integer.MAX_VALUE, true);
    }

    private Boundary(final int below, final int above, final boolean between) {
        this.below = below;
        this.above = above;
        this.between = between;
    }

    public boolean translate(final int codePoint, final Writer out) throws IOException {
        if (between) {
            if (codePoint < below || codePoint > above) {
                return false;
            }
        } else if (codePoint >= below && codePoint <= above) {
            return false;
        }

        out.write("&#");
        out.write(Integer.toString(codePoint, 10));
        out.write(';');
        return true;
    }
}
