package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;

public interface zzq extends IInterface {
    int id();

    void onEvent(String str, String str2, Bundle bundle, long j);
}
