package com.google.firebase.components;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.b.a;
import java.util.Set;

@KeepForSdk
/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
public interface e {
    @KeepForSdk
    <T> T get(Class<T> cls);

    @KeepForSdk
    <T> Set<T> p(Class<T> cls);

    @KeepForSdk
    <T> a<T> t(Class<T> cls);

    @KeepForSdk
    <T> a<Set<T>> u(Class<T> cls);
}
