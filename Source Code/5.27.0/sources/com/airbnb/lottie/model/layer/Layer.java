package com.airbnb.lottie.model.layer;

import androidx.annotation.Nullable;
import com.airbnb.lottie.e;
import com.airbnb.lottie.e.a;
import com.airbnb.lottie.model.a.j;
import com.airbnb.lottie.model.a.k;
import com.airbnb.lottie.model.a.l;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.b;
import java.util.List;
import java.util.Locale;

public class Layer {
    private final e df;
    private final float dw;
    private final boolean fq;
    private final List<Mask> gt;
    private final List<b> hp;
    private final l iw;
    private final String jf;
    private final long jg;
    private final LayerType jh;
    private final long ji;
    @Nullable
    private final String jj;
    private final int jk;
    private final int jl;
    private final int jm;
    private final float jn;
    private final int jo;
    private final int jp;
    @Nullable
    private final j jq;
    @Nullable
    private final k jr;
    @Nullable
    private final com.airbnb.lottie.model.a.b js;
    private final List<a<Float>> jt;
    private final MatteType ju;

    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        UNKNOWN
    }

    public Layer(List<b> list, e eVar, String str, long j, LayerType layerType, long j2, @Nullable String str2, List<Mask> list2, l lVar, int i, int i2, int i3, float f, float f2, int i4, int i5, @Nullable j jVar, @Nullable k kVar, List<a<Float>> list3, MatteType matteType, @Nullable com.airbnb.lottie.model.a.b bVar, boolean z) {
        this.hp = list;
        this.df = eVar;
        this.jf = str;
        this.jg = j;
        this.jh = layerType;
        this.ji = j2;
        this.jj = str2;
        this.gt = list2;
        this.iw = lVar;
        this.jk = i;
        this.jl = i2;
        this.jm = i3;
        this.jn = f;
        this.dw = f2;
        this.jo = i4;
        this.jp = i5;
        this.jq = jVar;
        this.jr = kVar;
        this.jt = list3;
        this.ju = matteType;
        this.js = bVar;
        this.fq = z;
    }

    /* Access modifiers changed, original: 0000 */
    public e getComposition() {
        return this.df;
    }

    /* Access modifiers changed, original: 0000 */
    public float cm() {
        return this.jn;
    }

    /* Access modifiers changed, original: 0000 */
    public float cn() {
        return this.dw / this.df.ap();
    }

    /* Access modifiers changed, original: 0000 */
    public List<a<Float>> co() {
        return this.jt;
    }

    public long getId() {
        return this.jg;
    }

    /* Access modifiers changed, original: 0000 */
    public String getName() {
        return this.jf;
    }

    /* Access modifiers changed, original: 0000 */
    @Nullable
    public String cp() {
        return this.jj;
    }

    /* Access modifiers changed, original: 0000 */
    public int cq() {
        return this.jo;
    }

    /* Access modifiers changed, original: 0000 */
    public int cr() {
        return this.jp;
    }

    /* Access modifiers changed, original: 0000 */
    public List<Mask> aV() {
        return this.gt;
    }

    public LayerType cs() {
        return this.jh;
    }

    /* Access modifiers changed, original: 0000 */
    public MatteType ct() {
        return this.ju;
    }

    /* Access modifiers changed, original: 0000 */
    public long cu() {
        return this.ji;
    }

    /* Access modifiers changed, original: 0000 */
    public List<b> bi() {
        return this.hp;
    }

    /* Access modifiers changed, original: 0000 */
    public l ca() {
        return this.iw;
    }

    /* Access modifiers changed, original: 0000 */
    public int getSolidColor() {
        return this.jm;
    }

    /* Access modifiers changed, original: 0000 */
    public int cv() {
        return this.jl;
    }

    /* Access modifiers changed, original: 0000 */
    public int cw() {
        return this.jk;
    }

    /* Access modifiers changed, original: 0000 */
    @Nullable
    public j cx() {
        return this.jq;
    }

    /* Access modifiers changed, original: 0000 */
    @Nullable
    public k cy() {
        return this.jr;
    }

    /* Access modifiers changed, original: 0000 */
    @Nullable
    public com.airbnb.lottie.model.a.b cz() {
        return this.js;
    }

    public String toString() {
        return toString("");
    }

    public boolean isHidden() {
        return this.fq;
    }

    public String toString(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(getName());
        String str2 = "\n";
        stringBuilder.append(str2);
        Layer b = this.df.b(cu());
        if (b != null) {
            stringBuilder.append("\t\tParents: ");
            stringBuilder.append(b.getName());
            b = this.df.b(b.cu());
            while (b != null) {
                stringBuilder.append("->");
                stringBuilder.append(b.getName());
                b = this.df.b(b.cu());
            }
            stringBuilder.append(str);
            stringBuilder.append(str2);
        }
        if (!aV().isEmpty()) {
            stringBuilder.append(str);
            stringBuilder.append("\tMasks: ");
            stringBuilder.append(aV().size());
            stringBuilder.append(str2);
        }
        if (!(cw() == 0 || cv() == 0)) {
            stringBuilder.append(str);
            stringBuilder.append("\tBackground: ");
            stringBuilder.append(String.format(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(cw()), Integer.valueOf(cv()), Integer.valueOf(getSolidColor())}));
        }
        if (!this.hp.isEmpty()) {
            stringBuilder.append(str);
            stringBuilder.append("\tShapes:\n");
            for (Object next : this.hp) {
                stringBuilder.append(str);
                stringBuilder.append("\t\t");
                stringBuilder.append(next);
                stringBuilder.append(str2);
            }
        }
        return stringBuilder.toString();
    }
}
