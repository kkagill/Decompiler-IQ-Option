package com.airbnb.lottie;

import android.content.Context;
import android.graphics.Rect;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.WorkerThread;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.d.d;
import com.airbnb.lottie.model.b;
import com.airbnb.lottie.model.c;
import com.airbnb.lottie.model.g;
import com.airbnb.lottie.model.layer.Layer;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: LottieComposition */
public class e {
    private Rect bounds;
    private int dA = 0;
    private final p dl = new p();
    private final HashSet<String> dm = new HashSet();
    /* renamed from: do */
    private Map<String, List<Layer>> f0do;
    private Map<String, h> dp;
    private Map<String, b> dq;
    private List<g> dr;
    private SparseArrayCompat<c> ds;
    private LongSparseArray<Layer> dt;
    private List<Layer> du;
    private float dw;
    private float dx;
    private float dy;
    private boolean dz;

    @Deprecated
    /* compiled from: LottieComposition */
    public static class a {

        /* compiled from: LottieComposition */
        private static final class a implements a, i<e> {
            private boolean cancelled;
            private final o dB;

            private a(o oVar) {
                this.cancelled = false;
                this.dB = oVar;
            }

            /* renamed from: a */
            public void onResult(e eVar) {
                if (!this.cancelled) {
                    this.dB.d(eVar);
                }
            }

            public void cancel() {
                this.cancelled = true;
            }
        }

        @Deprecated
        public static a a(Context context, String str, o oVar) {
            i aVar = new a(oVar);
            f.d(context, str).a(aVar);
            return aVar;
        }

        @Deprecated
        public static a a(InputStream inputStream, o oVar) {
            i aVar = new a(oVar);
            f.a(inputStream, null).a(aVar);
            return aVar;
        }

        @WorkerThread
        @Deprecated
        @Nullable
        public static e a(InputStream inputStream) {
            return (e) f.b(inputStream, null).getValue();
        }
    }

    @RestrictTo({Scope.LIBRARY})
    public void a(Rect rect, float f, float f2, float f3, List<Layer> list, LongSparseArray<Layer> longSparseArray, Map<String, List<Layer>> map, Map<String, h> map2, SparseArrayCompat<c> sparseArrayCompat, Map<String, b> map3, List<g> list2) {
        this.bounds = rect;
        this.dw = f;
        this.dx = f2;
        this.dy = f3;
        this.du = list;
        this.dt = longSparseArray;
        this.f0do = map;
        this.dp = map2;
        this.ds = sparseArrayCompat;
        this.dq = map3;
        this.dr = list2;
    }

    @RestrictTo({Scope.LIBRARY})
    public void l(String str) {
        d.warning(str);
        this.dm.add(str);
    }

    @RestrictTo({Scope.LIBRARY})
    public void q(boolean z) {
        this.dz = z;
    }

    @RestrictTo({Scope.LIBRARY})
    public void u(int i) {
        this.dA += i;
    }

    @RestrictTo({Scope.LIBRARY})
    public boolean ag() {
        return this.dz;
    }

    @RestrictTo({Scope.LIBRARY})
    public int ah() {
        return this.dA;
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.dl.setEnabled(z);
    }

    public p getPerformanceTracker() {
        return this.dl;
    }

    @RestrictTo({Scope.LIBRARY})
    public Layer b(long j) {
        return (Layer) this.dt.get(j);
    }

    public Rect getBounds() {
        return this.bounds;
    }

    public float ai() {
        return (float) ((long) ((ap() / this.dy) * 1000.0f));
    }

    @RestrictTo({Scope.LIBRARY})
    public float aj() {
        return this.dw;
    }

    @RestrictTo({Scope.LIBRARY})
    public float ak() {
        return this.dx;
    }

    public float getFrameRate() {
        return this.dy;
    }

    public List<Layer> al() {
        return this.du;
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY})
    public List<Layer> m(String str) {
        return (List) this.f0do.get(str);
    }

    public SparseArrayCompat<c> am() {
        return this.ds;
    }

    public Map<String, b> an() {
        return this.dq;
    }

    @Nullable
    public g n(String str) {
        this.dr.size();
        for (int i = 0; i < this.dr.size(); i++) {
            g gVar = (g) this.dr.get(i);
            if (gVar.A(str)) {
                return gVar;
            }
        }
        return null;
    }

    public Map<String, h> ao() {
        return this.dp;
    }

    public float ap() {
        return this.dx - this.dw;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LottieComposition:\n");
        for (Layer layer : this.du) {
            stringBuilder.append(layer.toString("\t"));
        }
        return stringBuilder.toString();
    }
}
