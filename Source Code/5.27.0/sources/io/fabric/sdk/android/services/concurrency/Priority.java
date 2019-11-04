package io.fabric.sdk.android.services.concurrency;

public enum Priority {
    LOW,
    NORMAL,
    HIGH,
    IMMEDIATE;

    static <Y> int compareTo(f fVar, Y y) {
        Priority fq;
        if (y instanceof f) {
            fq = ((f) y).fq();
        } else {
            fq = NORMAL;
        }
        return fq.ordinal() - fVar.fq().ordinal();
    }
}
