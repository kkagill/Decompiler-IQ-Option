package com.google.firebase.a;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.Executor;

@KeepForSdk
/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
public interface d {
    @KeepForSdk
    <T> void a(Class<T> cls, b<? super T> bVar);

    @KeepForSdk
    <T> void a(Class<T> cls, Executor executor, b<? super T> bVar);

    @KeepForSdk
    <T> void b(Class<T> cls, b<? super T> bVar);
}
