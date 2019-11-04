package com.airbnb.lottie.a.b;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.airbnb.lottie.e.c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseKeyframeAnimation */
public abstract class a<K, A> {
    private float di = 0.0f;
    final List<a> gb = new ArrayList(1);
    private boolean gg = false;
    private final List<? extends com.airbnb.lottie.e.a<K>> gh;
    @Nullable
    protected c<A> gi;
    @Nullable
    private com.airbnb.lottie.e.a<K> gj;
    @Nullable
    private com.airbnb.lottie.e.a<K> gk;
    private float gl = -1.0f;
    @Nullable
    private A gm = null;
    private float gn = -1.0f;
    private float gp = -1.0f;

    /* compiled from: BaseKeyframeAnimation */
    public interface a {
        void aB();
    }

    public abstract A a(com.airbnb.lottie.e.a<K> aVar, float f);

    a(List<? extends com.airbnb.lottie.e.a<K>> list) {
        this.gh = list;
    }

    public void aO() {
        this.gg = true;
    }

    public void b(a aVar) {
        this.gb.add(aVar);
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (!this.gh.isEmpty()) {
            com.airbnb.lottie.e.a aP = aP();
            if (f < aS()) {
                f = aS();
            } else if (f > aT()) {
                f = aT();
            }
            if (f != this.di) {
                this.di = f;
                com.airbnb.lottie.e.a aP2 = aP();
                if (!(aP == aP2 && aP2.bo())) {
                    aA();
                }
            }
        }
    }

    public void aA() {
        for (int i = 0; i < this.gb.size(); i++) {
            ((a) this.gb.get(i)).aB();
        }
    }

    /* Access modifiers changed, original: protected */
    public com.airbnb.lottie.e.a<K> aP() {
        com.airbnb.lottie.e.a aVar = this.gj;
        if (aVar != null && aVar.k(this.di)) {
            return this.gj;
        }
        List list = this.gh;
        aVar = (com.airbnb.lottie.e.a) list.get(list.size() - 1);
        if (this.di < aVar.cn()) {
            for (int size = this.gh.size() - 1; size >= 0; size--) {
                aVar = (com.airbnb.lottie.e.a) this.gh.get(size);
                if (aVar.k(this.di)) {
                    break;
                }
            }
        }
        this.gj = aVar;
        return aVar;
    }

    /* Access modifiers changed, original: 0000 */
    public float aQ() {
        if (this.gg) {
            return 0.0f;
        }
        com.airbnb.lottie.e.a aP = aP();
        if (aP.bo()) {
            return 0.0f;
        }
        return (this.di - aP.cn()) / (aP.aT() - aP.cn());
    }

    /* Access modifiers changed, original: protected */
    public float aR() {
        com.airbnb.lottie.e.a aP = aP();
        if (aP.bo()) {
            return 0.0f;
        }
        return aP.kl.getInterpolation(aQ());
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    private float aS() {
        if (this.gn == -1.0f) {
            this.gn = this.gh.isEmpty() ? 0.0f : ((com.airbnb.lottie.e.a) this.gh.get(0)).cn();
        }
        return this.gn;
    }

    /* Access modifiers changed, original: 0000 */
    @FloatRange(from = 0.0d, to = 1.0d)
    public float aT() {
        if (this.gp == -1.0f) {
            float f;
            if (this.gh.isEmpty()) {
                f = 1.0f;
            } else {
                List list = this.gh;
                f = ((com.airbnb.lottie.e.a) list.get(list.size() - 1)).aT();
            }
            this.gp = f;
        }
        return this.gp;
    }

    public A getValue() {
        com.airbnb.lottie.e.a aP = aP();
        float aR = aR();
        if (this.gi == null && aP == this.gk && this.gl == aR) {
            return this.gm;
        }
        this.gk = aP;
        this.gl = aR;
        Object a = a(aP, aR);
        this.gm = a;
        return a;
    }

    public float getProgress() {
        return this.di;
    }

    public void a(@Nullable c<A> cVar) {
        c cVar2 = this.gi;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.gi = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
