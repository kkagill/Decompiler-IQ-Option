package com.crashlytics.android;

import com.crashlytics.android.answers.b;
import com.crashlytics.android.core.k;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.i;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* compiled from: Crashlytics */
public class a extends h<Void> implements i {
    public final b nG;
    public final com.crashlytics.android.a.a nH;
    public final k nI;
    public final Collection<? extends h> nJ;

    /* Access modifiers changed, original: protected */
    /* renamed from: dZ */
    public Void ec() {
        return null;
    }

    public String getIdentifier() {
        return "com.crashlytics.sdk.android:crashlytics";
    }

    public String getVersion() {
        return "2.10.1.34";
    }

    public a() {
        this(new b(), new com.crashlytics.android.a.a(), new k());
    }

    a(b bVar, com.crashlytics.android.a.a aVar, k kVar) {
        this.nG = bVar;
        this.nH = aVar;
        this.nI = kVar;
        this.nJ = Collections.unmodifiableCollection(Arrays.asList(new h[]{bVar, aVar, kVar}));
    }

    public Collection<? extends h> dY() {
        return this.nJ;
    }

    public static a ea() {
        return (a) c.C(a.class);
    }

    public static void d(Throwable th) {
        eb();
        ea().nI.d(th);
    }

    public static void ag(String str) {
        eb();
        ea().nI.ag(str);
    }

    public static void ah(String str) {
        eb();
        ea().nI.ah(str);
    }

    private static void eb() {
        if (ea() == null) {
            throw new IllegalStateException("Crashlytics must be initialized by calling Fabric.with(Context) prior to calling Crashlytics.getInstance()");
        }
    }
}
