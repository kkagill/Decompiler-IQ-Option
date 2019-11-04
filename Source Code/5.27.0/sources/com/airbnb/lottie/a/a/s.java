package com.airbnb.lottie.a.a;

import com.airbnb.lottie.a.b.a.a;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TrimPathContent */
public class s implements c, a {
    private final boolean fq;
    private final List<a> gb = new ArrayList();
    private final Type gc;
    private final com.airbnb.lottie.a.b.a<?, Float> gd;
    private final com.airbnb.lottie.a.b.a<?, Float> ge;
    private final com.airbnb.lottie.a.b.a<?, Float> gf;
    private final String name;

    public void a(List<c> list, List<c> list2) {
    }

    public s(com.airbnb.lottie.model.layer.a aVar, ShapeTrimPath shapeTrimPath) {
        this.name = shapeTrimPath.getName();
        this.fq = shapeTrimPath.isHidden();
        this.gc = shapeTrimPath.aK();
        this.gd = shapeTrimPath.cg().bn();
        this.ge = shapeTrimPath.cf().bn();
        this.gf = shapeTrimPath.bZ().bn();
        aVar.a(this.gd);
        aVar.a(this.ge);
        aVar.a(this.gf);
        this.gd.b(this);
        this.ge.b(this);
        this.gf.b(this);
    }

    public void aB() {
        for (int i = 0; i < this.gb.size(); i++) {
            ((a) this.gb.get(i)).aB();
        }
    }

    public String getName() {
        return this.name;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(a aVar) {
        this.gb.add(aVar);
    }

    /* Access modifiers changed, original: 0000 */
    public Type aK() {
        return this.gc;
    }

    public com.airbnb.lottie.a.b.a<?, Float> aL() {
        return this.gd;
    }

    public com.airbnb.lottie.a.b.a<?, Float> aM() {
        return this.ge;
    }

    public com.airbnb.lottie.a.b.a<?, Float> aN() {
        return this.gf;
    }

    public boolean isHidden() {
        return this.fq;
    }
}
