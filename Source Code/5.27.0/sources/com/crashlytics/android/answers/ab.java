package com.crashlytics.android.answers;

/* compiled from: SessionEventMetadata */
final class ab {
    private String oY;
    public final String oZ;
    public final String pa;
    public final String pb;
    public final Boolean pc;
    public final String pd;
    public final String pe;
    public final String pf;
    public final String pg;
    public final String ph;
    public final String pi;

    public ab(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.oZ = str;
        this.pa = str2;
        this.pb = str3;
        this.pc = bool;
        this.pd = str4;
        this.pe = str5;
        this.pf = str6;
        this.pg = str7;
        this.ph = str8;
        this.pi = str9;
    }

    public String toString() {
        if (this.oY == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("appBundleId=");
            stringBuilder.append(this.oZ);
            stringBuilder.append(", executionId=");
            stringBuilder.append(this.pa);
            stringBuilder.append(", installationId=");
            stringBuilder.append(this.pb);
            stringBuilder.append(", limitAdTrackingEnabled=");
            stringBuilder.append(this.pc);
            stringBuilder.append(", betaDeviceToken=");
            stringBuilder.append(this.pd);
            stringBuilder.append(", buildId=");
            stringBuilder.append(this.pe);
            stringBuilder.append(", osVersion=");
            stringBuilder.append(this.pf);
            stringBuilder.append(", deviceModel=");
            stringBuilder.append(this.pg);
            stringBuilder.append(", appVersionCode=");
            stringBuilder.append(this.ph);
            stringBuilder.append(", appVersionName=");
            stringBuilder.append(this.pi);
            this.oY = stringBuilder.toString();
        }
        return this.oY;
    }
}
