package com.microblink.secured;

/* compiled from: line */
public final class z {
    String euj = "licensee";
    String evP = "productVersion";
    String ewm = "licenseKey";
    String exN = "product";
    String exO = "ANDROID";
    String exP = "osVersion";
    String exQ = "userId";
    long exR = 0;
    boolean exS = false;
    String exc = "device";
    String mPackageName = "packageName";

    /* compiled from: line */
    public static class a {
        String euj = null;
        String ewm = null;
        String exQ = null;
        boolean exS = false;
        e exT = null;
        Long exU = null;
        String mPackageName = null;

        static String kr(String str) {
            return str == null ? "" : str;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Product: ");
        stringBuilder.append(this.exN);
        stringBuilder.append("\nVersion: ");
        stringBuilder.append(this.evP);
        stringBuilder.append("\nLicensee: ");
        stringBuilder.append(this.euj);
        stringBuilder.append("\nPlatform: ");
        stringBuilder.append(this.exO);
        stringBuilder.append("\nOS version: ");
        stringBuilder.append(this.exP);
        stringBuilder.append("\nDevice: ");
        stringBuilder.append(this.exc);
        stringBuilder.append("\nLicense key: ");
        stringBuilder.append(this.ewm);
        stringBuilder.append("\nUserId: ");
        stringBuilder.append(this.exQ);
        stringBuilder.append("\nScans: ");
        stringBuilder.append(this.exR);
        stringBuilder.append("\nPackageName: ");
        stringBuilder.append(this.mPackageName);
        stringBuilder.append("\nRefresh key: ");
        stringBuilder.append(this.exS);
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}
