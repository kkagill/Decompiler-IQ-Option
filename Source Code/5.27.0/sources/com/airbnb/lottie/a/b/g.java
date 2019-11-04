package com.airbnb.lottie.a.b;

import android.graphics.Path;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.h;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MaskKeyframeAnimation */
public class g {
    private final List<a<h, Path>> gr;
    private final List<a<Integer, Integer>> gs;
    private final List<Mask> gt;

    public g(List<Mask> list) {
        this.gt = list;
        this.gr = new ArrayList(list.size());
        this.gs = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.gr.add(((Mask) list.get(i)).bP().bn());
            this.gs.add(((Mask) list.get(i)).bv().bn());
        }
    }

    public List<Mask> aV() {
        return this.gt;
    }

    public List<a<h, Path>> aW() {
        return this.gr;
    }

    public List<a<Integer, Integer>> aX() {
        return this.gs;
    }
}
