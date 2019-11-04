package io.fabric.sdk.android.services.common;

/* compiled from: ResponseParser */
public class s {
    public static int jq(int i) {
        if (i >= 200 && i <= 299) {
            return 0;
        }
        if (i >= 300 && i <= 399) {
            return 1;
        }
        if (i >= 400 && i <= 499) {
            return 0;
        }
        if (i >= 500) {
        }
        return 1;
    }
}
