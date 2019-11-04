package com.rd.draw.data;

import androidx.annotation.NonNull;
import com.rd.animation.type.AnimationType;

/* compiled from: Indicator */
public class a {
    private int Oy;
    private int aBo;
    private int count = 3;
    private int eHH;
    private long eHN;
    private int eIC;
    private boolean eID;
    private boolean eIE;
    private boolean eIF;
    private int eIG;
    private int eIH = -1;
    private Orientation eII;
    private AnimationType eIJ;
    private RtlMode eIK;
    private float eIc;
    private int enb;
    private int height;
    private int padding;
    private int paddingBottom;
    private int paddingLeft;
    private int paddingRight;
    private int paddingTop;
    private int radius;
    private int width;

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int i) {
        this.radius = i;
    }

    public int getPadding() {
        return this.padding;
    }

    public void setPadding(int i) {
        this.padding = i;
    }

    public int getPaddingLeft() {
        return this.paddingLeft;
    }

    public void setPaddingLeft(int i) {
        this.paddingLeft = i;
    }

    public int getPaddingTop() {
        return this.paddingTop;
    }

    public void setPaddingTop(int i) {
        this.paddingTop = i;
    }

    public int getPaddingRight() {
        return this.paddingRight;
    }

    public void setPaddingRight(int i) {
        this.paddingRight = i;
    }

    public int getPaddingBottom() {
        return this.paddingBottom;
    }

    public void setPaddingBottom(int i) {
        this.paddingBottom = i;
    }

    public int bhJ() {
        return this.eHH;
    }

    public void iM(int i) {
        this.eHH = i;
    }

    public float getScaleFactor() {
        return this.eIc;
    }

    public void setScaleFactor(float f) {
        this.eIc = f;
    }

    public int getUnselectedColor() {
        return this.eIC;
    }

    public void setUnselectedColor(int i) {
        this.eIC = i;
    }

    public int getSelectedColor() {
        return this.aBo;
    }

    public void setSelectedColor(int i) {
        this.aBo = i;
    }

    public boolean bhS() {
        return this.eID;
    }

    public void setInteractiveAnimation(boolean z) {
        this.eID = z;
    }

    public boolean bhT() {
        return this.eIE;
    }

    public void setAutoVisibility(boolean z) {
        this.eIE = z;
    }

    public boolean bhU() {
        return this.eIF;
    }

    public void setDynamicCount(boolean z) {
        this.eIF = z;
    }

    public long getAnimationDuration() {
        return this.eHN;
    }

    public void setAnimationDuration(long j) {
        this.eHN = j;
    }

    public int bhV() {
        return this.Oy;
    }

    public void dB(int i) {
        this.Oy = i;
    }

    public int bhW() {
        return this.eIG;
    }

    public void iV(int i) {
        this.eIG = i;
    }

    public int bhX() {
        return this.enb;
    }

    public void iW(int i) {
        this.enb = i;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int i) {
        this.count = i;
    }

    @NonNull
    public Orientation bhY() {
        if (this.eII == null) {
            this.eII = Orientation.HORIZONTAL;
        }
        return this.eII;
    }

    public void setOrientation(Orientation orientation) {
        this.eII = orientation;
    }

    @NonNull
    public AnimationType bhZ() {
        if (this.eIJ == null) {
            this.eIJ = AnimationType.NONE;
        }
        return this.eIJ;
    }

    public void setAnimationType(AnimationType animationType) {
        this.eIJ = animationType;
    }

    @NonNull
    public RtlMode bia() {
        if (this.eIK == null) {
            this.eIK = RtlMode.Off;
        }
        return this.eIK;
    }

    public void setRtlMode(RtlMode rtlMode) {
        this.eIK = rtlMode;
    }

    public int bib() {
        return this.eIH;
    }

    public void iX(int i) {
        this.eIH = i;
    }
}
