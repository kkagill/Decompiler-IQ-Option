package com.airbnb.lottie.model.a;

import com.airbnb.lottie.e.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: BaseAnimatableValue */
abstract class n<V, O> implements m<V, O> {
    final List<a<V>> gh;

    n(V v) {
        this(Collections.singletonList(new a(v)));
    }

    n(List<a<V>> list) {
        this.gh = list;
    }

    public List<a<V>> bp() {
        return this.gh;
    }

    public boolean bo() {
        return this.gh.isEmpty() || (this.gh.size() == 1 && ((a) this.gh.get(0)).bo());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (!this.gh.isEmpty()) {
            stringBuilder.append("values=");
            stringBuilder.append(Arrays.toString(this.gh.toArray()));
        }
        return stringBuilder.toString();
    }
}
