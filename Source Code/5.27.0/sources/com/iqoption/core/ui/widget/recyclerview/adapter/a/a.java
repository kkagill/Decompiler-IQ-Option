package com.iqoption.core.ui.widget.recyclerview.adapter.a;

import androidx.recyclerview.widget.DiffUtil.Callback;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\u0014\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u001a"}, bng = {"Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/DiffCallback;", "T", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "()V", "new", "", "getNew", "()Ljava/util/List;", "setNew", "(Ljava/util/List;)V", "old", "getOld", "setOld", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "init", "", "request", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/DiffRequest;", "core_release"})
/* compiled from: DiffCallback.kt */
public class a<T extends d<?>> extends Callback {
    public List<? extends T> bPr;
    public List<? extends T> bPs;

    public final List<T> amY() {
        List list = this.bPr;
        if (list == null) {
            kotlin.jvm.internal.i.lG("old");
        }
        return list;
    }

    public final List<T> amZ() {
        List list = this.bPs;
        if (list == null) {
            kotlin.jvm.internal.i.lG("new");
        }
        return list;
    }

    public int getOldListSize() {
        List list = this.bPr;
        if (list == null) {
            kotlin.jvm.internal.i.lG("old");
        }
        return list.size();
    }

    public int getNewListSize() {
        List list = this.bPs;
        if (list == null) {
            kotlin.jvm.internal.i.lG("new");
        }
        return list.size();
    }

    public boolean areItemsTheSame(int i, int i2) {
        List list = this.bPr;
        if (list == null) {
            kotlin.jvm.internal.i.lG("old");
        }
        Object id = ((d) list.get(i)).getId();
        list = this.bPs;
        if (list == null) {
            kotlin.jvm.internal.i.lG("new");
        }
        return kotlin.jvm.internal.i.y(id, ((d) list.get(i2)).getId());
    }

    public boolean areContentsTheSame(int i, int i2) {
        List list = this.bPr;
        if (list == null) {
            kotlin.jvm.internal.i.lG("old");
        }
        d dVar = (d) list.get(i);
        list = this.bPs;
        if (list == null) {
            kotlin.jvm.internal.i.lG("new");
        }
        return kotlin.jvm.internal.i.y(dVar, (d) list.get(i2));
    }

    public final void a(b<T> bVar) {
        kotlin.jvm.internal.i.f(bVar, "request");
        this.bPr = bVar.amY();
        this.bPs = bVar.amZ();
    }
}
