package com.google.firebase.iid;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;

@KeepForSdk
public interface b {
    @KeepForSdk
    Task<Void> cc(String str);

    @KeepForSdk
    Task<Void> e(String str, String str2, String str3);

    @KeepForSdk
    Task<String> e(String str, String str2, String str3, String str4);

    @KeepForSdk
    Task<Void> f(String str, String str2, String str3);

    @KeepForSdk
    Task<Void> f(String str, String str2, String str3, String str4);

    @KeepForSdk
    boolean isAvailable();

    @KeepForSdk
    boolean wy();
}
