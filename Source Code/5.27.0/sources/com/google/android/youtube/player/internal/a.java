package com.google.android.youtube.player.internal;

import android.app.Activity;
import android.content.Context;
import com.google.android.youtube.player.internal.u.b;

public abstract class a {
    private static final a Rq = pz();

    public static a pA() {
        return Rq;
    }

    private static a pz() {
        try {
            return (a) Class.forName("com.google.android.youtube.api.locallylinked.LocallyLinkedFactory").asSubclass(a.class).newInstance();
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException(e2);
        } catch (ClassNotFoundException unused) {
            return new c();
        }
    }

    public abstract d a(Context context, String str, com.google.android.youtube.player.internal.u.a aVar, b bVar);

    public abstract f a(Activity activity, d dVar, boolean z);
}
