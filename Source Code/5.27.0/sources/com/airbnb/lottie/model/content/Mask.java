package com.airbnb.lottie.model.content;

import com.airbnb.lottie.model.a.d;
import com.airbnb.lottie.model.a.h;

public class Mask {
    private final d hJ;
    private final MaskMode ig;
    private final h ih;
    private final boolean ii;

    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT
    }

    public Mask(MaskMode maskMode, h hVar, d dVar, boolean z) {
        this.ig = maskMode;
        this.ih = hVar;
        this.hJ = dVar;
        this.ii = z;
    }

    public MaskMode bO() {
        return this.ig;
    }

    public h bP() {
        return this.ih;
    }

    public d bv() {
        return this.hJ;
    }

    public boolean isInverted() {
        return this.ii;
    }
}
