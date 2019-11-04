package com.airbnb.lottie.a.a;

import android.graphics.Path;
import com.airbnb.lottie.d.h;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CompoundTrimPathContent */
public class b {
    private List<s> fp = new ArrayList();

    /* Access modifiers changed, original: 0000 */
    public void a(s sVar) {
        this.fp.add(sVar);
    }

    public void a(Path path) {
        for (int size = this.fp.size() - 1; size >= 0; size--) {
            h.a(path, (s) this.fp.get(size));
        }
    }
}
