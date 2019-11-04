package com.airbnb.lottie.model.a;

import android.graphics.PointF;
import com.airbnb.lottie.a.b.i;
import com.airbnb.lottie.a.b.j;
import com.airbnb.lottie.e.a;
import java.util.Collections;
import java.util.List;

/* compiled from: AnimatablePathValue */
public class e implements m<PointF, PointF> {
    private final List<a<PointF>> gh;

    public e() {
        this.gh = Collections.singletonList(new a(new PointF(0.0f, 0.0f)));
    }

    public e(List<a<PointF>> list) {
        this.gh = list;
    }

    public List<a<PointF>> bp() {
        return this.gh;
    }

    public boolean bo() {
        return this.gh.size() == 1 && ((a) this.gh.get(0)).bo();
    }

    public com.airbnb.lottie.a.b.a<PointF, PointF> bn() {
        if (((a) this.gh.get(0)).bo()) {
            return new j(this.gh);
        }
        return new i(this.gh);
    }
}
