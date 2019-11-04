package com.microblink.hardware.orientation;

/* compiled from: line */
public enum Orientation {
    ORIENTATION_PORTRAIT(0, true, false),
    ORIENTATION_LANDSCAPE_RIGHT(1, false, true),
    ORIENTATION_PORTRAIT_UPSIDE(2, true, false),
    ORIENTATION_LANDSCAPE_LEFT(3, false, true),
    ORIENTATION_UNKNOWN(4, false, false);
    
    private int IIIIlIllIl;
    /* renamed from: IIIIlIllIl */
    private boolean f662IIIIlIllIl;
    private boolean IlIIIlIIIl;

    private Orientation(int i, boolean z, boolean z2) {
        this.IIIIlIllIl = i;
        this.IlIIIlIIIl = z;
        this.f662IIIIlIllIl = z2;
    }

    public final int intValue() {
        return this.IIIIlIllIl;
    }

    public final boolean isVertical() {
        return this.IlIIIlIIIl;
    }

    public final boolean isHorizontal() {
        return this.f662IIIIlIllIl;
    }

    public final Orientation rotate90Clockwise() {
        return fromInt((this.IIIIlIllIl + 3) % 4);
    }

    public final Orientation rotate90CounterClockwise() {
        return fromInt((this.IIIIlIllIl + 1) % 4);
    }

    public final Orientation rotate180() {
        return fromInt((this.IIIIlIllIl + 2) % 4);
    }

    public final String toString() {
        int i = this.IIIIlIllIl;
        if (i == 0) {
            return "Portrait";
        }
        if (i == 1) {
            return "Landscape right";
        }
        if (i != 2) {
            return i != 3 ? "Unknown" : "Landscape left";
        } else {
            return "Inverse portrait";
        }
    }

    public static Orientation fromInt(int i) {
        if (i == 0) {
            return ORIENTATION_PORTRAIT;
        }
        if (i == 1) {
            return ORIENTATION_LANDSCAPE_RIGHT;
        }
        if (i == 2) {
            return ORIENTATION_PORTRAIT_UPSIDE;
        }
        if (i != 3) {
            return ORIENTATION_UNKNOWN;
        }
        return ORIENTATION_LANDSCAPE_LEFT;
    }

    public static Orientation fromActivityInfoCode(int i) {
        if (i == 0) {
            return ORIENTATION_LANDSCAPE_RIGHT;
        }
        if (i == 1) {
            return ORIENTATION_PORTRAIT;
        }
        if (i == 8) {
            return ORIENTATION_LANDSCAPE_LEFT;
        }
        if (i != 9) {
            return ORIENTATION_PORTRAIT;
        }
        return ORIENTATION_PORTRAIT_UPSIDE;
    }
}
