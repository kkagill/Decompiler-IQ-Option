package com.iqoption.charttools;

import com.google.android.gms.common.internal.ImagesContract;
import com.iqoption.charttools.model.indicator.ae;
import com.iqoption.charttools.model.indicator.v;
import com.iqoption.charttools.model.indicator.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000bR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u0015"}, bng = {"Lcom/iqoption/charttools/MergedLibrary;", "Lcom/iqoption/charttools/IndicatorsLibrary;", "remote", "Lcom/iqoption/charttools/RemoteLibrary;", "local", "Lcom/iqoption/charttools/LocalLibrary;", "(Lcom/iqoption/charttools/RemoteLibrary;Lcom/iqoption/charttools/LocalLibrary;)V", "all", "", "Lcom/iqoption/charttools/model/indicator/MetaIndicator;", "getAll", "()Ljava/util/List;", "categories", "Lcom/iqoption/charttools/model/IndicatorCategory;", "getCategories", "figures", "getFigures", "indicators", "getIndicators", "localIndicators", "getLocalIndicators", "techtools_release"})
/* compiled from: IndicatorsLibraryManager.kt */
final class m implements j {
    private final List<x> aCK;
    private final List<x> aDV;
    private final List<com.iqoption.charttools.model.a> aDW;
    private final List<x> aDX;
    private final List<x> aDY;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(Long.valueOf(((com.iqoption.charttools.model.a) t).getId()), Long.valueOf(((com.iqoption.charttools.model.a) t2).getId()));
        }
    }

    public m(o oVar, l lVar) {
        kotlin.jvm.internal.i.f(oVar, "remote");
        kotlin.jvm.internal.i.f(lVar, ImagesContract.LOCAL);
        this.aDW = u.a((Iterable) oVar.Mk(), (Comparator) new a());
        Collection arrayList = new ArrayList();
        for (ae aeVar : oVar.LV()) {
            Object obj = null;
            if (aeVar.Ox()) {
                obj = aeVar;
            } else {
                for (Object next : lVar.LV()) {
                    if (kotlin.jvm.internal.i.y(((x) next).getType(), aeVar.getType())) {
                        break;
                    }
                }
                Object next2 = null;
                x xVar = (x) next2;
                if (xVar != null) {
                    if (xVar instanceof v) {
                        obj = xVar;
                    }
                    v vVar = (v) obj;
                    if (vVar != null) {
                        vVar.i(aeVar.getCategories());
                    }
                    obj = xVar;
                }
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        this.aCK = (List) arrayList;
        this.aDX = lVar.LV();
        this.aDV = lVar.Ms();
        this.aDY = u.b((Collection) LV(), (Iterable) Ms());
    }

    public List<com.iqoption.charttools.model.a> Mk() {
        return this.aDW;
    }

    public List<x> LV() {
        return this.aCK;
    }

    public List<x> Ml() {
        return this.aDX;
    }

    public List<x> Ms() {
        return this.aDV;
    }

    public List<x> getAll() {
        return this.aDY;
    }
}
