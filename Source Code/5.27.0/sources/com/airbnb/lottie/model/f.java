package com.airbnb.lottie.model;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;
import com.airbnb.lottie.e;

@RestrictTo({Scope.LIBRARY})
/* compiled from: LottieCompositionCache */
public class f {
    private static final f hv = new f();
    private final LruCache<String, e> hw = new LruCache(20);

    public static f bm() {
        return hv;
    }

    @VisibleForTesting
    f() {
    }

    @Nullable
    public e z(@Nullable String str) {
        return str == null ? null : (e) this.hw.get(str);
    }

    public void a(@Nullable String str, e eVar) {
        if (str != null) {
            this.hw.put(str, eVar);
        }
    }
}
