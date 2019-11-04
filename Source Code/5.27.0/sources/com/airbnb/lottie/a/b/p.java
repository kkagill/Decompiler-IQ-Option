package com.airbnb.lottie.a.b;

import androidx.annotation.Nullable;
import com.airbnb.lottie.e.a;
import com.airbnb.lottie.e.b;
import com.airbnb.lottie.e.c;
import java.util.Collections;

/* compiled from: ValueCallbackKeyframeAnimation */
public class p<K, A> extends a<K, A> {
    private final b<A> gR;
    private final A gS;

    /* Access modifiers changed, original: 0000 */
    public float aT() {
        return 1.0f;
    }

    public p(c<A> cVar) {
        this(cVar, null);
    }

    public p(c<A> cVar, @Nullable A a) {
        super(Collections.emptyList());
        this.gR = new b();
        a(cVar);
        this.gS = a;
    }

    public void aA() {
        if (this.gi != null) {
            super.aA();
        }
    }

    public A getValue() {
        c cVar = this.gi;
        Object obj = this.gS;
        return cVar.b(0.0f, 0.0f, obj, obj, getProgress(), getProgress(), getProgress());
    }

    /* Access modifiers changed, original: 0000 */
    public A a(a<K> aVar, float f) {
        return getValue();
    }
}
