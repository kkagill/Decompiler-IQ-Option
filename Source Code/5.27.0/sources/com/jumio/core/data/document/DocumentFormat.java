package com.jumio.core.data.document;

public enum DocumentFormat {
    NONE(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d),
    ID1(0.136d, 0.136d, 0.0675d, 0.0675d, 1.585185185185185d, 0.24000000000000002d, 0.09546296296296297d),
    ID2(0.0936d, 0.0936d, 0.0675d, 0.0675d, 1.4189189189189189d, 0.17162162162162162d, 0.08412162162162162d),
    ID3(0.022d, 0.022d, 0.022d, 0.022d, 1.4119318181818181d, 0.2353181818181818d, 0.0d);
    
    private double marginBottom;
    private double overlayBottom;
    private double overlayLeft;
    private double overlayRatio;
    private double overlayRight;
    private double overlayTop;
    private double roiHeight;

    private DocumentFormat(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.overlayTop = d;
        this.overlayBottom = d2;
        this.overlayLeft = d3;
        this.overlayRight = d4;
        this.overlayRatio = d5;
        this.roiHeight = d6;
        this.marginBottom = d7;
    }

    public double getOverlayTop() {
        return this.overlayTop;
    }

    public double getOverlayBottom() {
        return this.overlayBottom;
    }

    public double getOverlayLeft() {
        return this.overlayLeft;
    }

    public double getOverlayRight() {
        return this.overlayRight;
    }

    public double getOverlayRatio() {
        return this.overlayRatio;
    }

    public double getRoiHeight() {
        return this.roiHeight;
    }

    public double getMarginBottom() {
        return this.marginBottom;
    }

    public int getOverlayLeftInPx(int i) {
        double d = (double) i;
        double d2 = this.overlayLeft;
        Double.isNaN(d);
        return (int) (d * d2);
    }

    public int getOverlayRightInPx(int i) {
        double d = (double) i;
        double d2 = this.overlayRight;
        Double.isNaN(d);
        return (int) (d * d2);
    }

    public int getOverlayTopInPx(int i) {
        double d = (double) i;
        double d2 = this.overlayTop;
        Double.isNaN(d);
        return (int) (d * d2);
    }

    public int getOverlayBottomInPx(int i) {
        double d = (double) i;
        double d2 = this.overlayBottom;
        Double.isNaN(d);
        return (int) (d * d2);
    }

    public int getRoiHeightInPx(int i) {
        double overlayTopInPx = (double) (i - (getOverlayTopInPx(i) * 2));
        double d = this.roiHeight;
        Double.isNaN(overlayTopInPx);
        return (int) (overlayTopInPx * d);
    }

    public int getRoiMarginBottomPx(int i) {
        double overlayTopInPx = (double) (i - (getOverlayTopInPx(i) * 2));
        double d = this.marginBottom;
        Double.isNaN(overlayTopInPx);
        return (int) (overlayTopInPx * d);
    }
}
