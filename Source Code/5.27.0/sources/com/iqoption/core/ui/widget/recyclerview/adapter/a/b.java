package com.iqoption.core.ui.widget.recyclerview.adapter.a;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.DiffUtil.DiffResult;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003B%\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0007J\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u000f"}, bng = {"Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/DiffRequest;", "T", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "", "old", "", "new", "(Ljava/util/List;Ljava/util/List;)V", "getNew", "()Ljava/util/List;", "getOld", "execute", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/DiffResult;", "diffCallback", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/DiffCallback;", "core_release"})
/* compiled from: DiffRequest.kt */
public final class b<T extends d<?>> {
    private final List<T> bPr;
    private final List<T> bPs;

    public b() {
        this(null, null, 3, null);
    }

    public b(List<? extends T> list, List<? extends T> list2) {
        kotlin.jvm.internal.i.f(list, "old");
        kotlin.jvm.internal.i.f(list2, "new");
        this.bPr = list;
        this.bPs = list2;
    }

    public /* synthetic */ b(List list, List list2, int i, f fVar) {
        if ((i & 1) != 0) {
            list = m.emptyList();
        }
        if ((i & 2) != 0) {
            list2 = m.emptyList();
        }
        this(list, list2);
    }

    public final List<T> amY() {
        return this.bPr;
    }

    public final List<T> amZ() {
        return this.bPs;
    }

    public final c<T> a(a<T> aVar) {
        c cVar;
        kotlin.jvm.internal.i.f(aVar, "diffCallback");
        synchronized (aVar) {
            aVar.a(this);
            DiffResult calculateDiff = DiffUtil.calculateDiff(aVar);
            kotlin.jvm.internal.i.e(calculateDiff, "DiffUtil.calculateDiff(diffCallback)");
            cVar = new c(this, calculateDiff);
        }
        return cVar;
    }
}
