package com.iqoption.forexcalendar.detail.a;

import com.iqoption.core.ui.widget.recyclerview.adapter.a.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0003\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\u0007\b¨\u0006\t"}, bng = {"Lcom/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedAdapterItem;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "", "id", "(I)V", "getId", "()Ljava/lang/Integer;", "Lcom/iqoption/forexcalendar/detail/assetsaffected/LoadingItem;", "Lcom/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedItem;", "forexcalendar_release"})
/* compiled from: AssetAffectedAdapterItems.kt */
public abstract class b implements d<Integer> {
    private final int id;

    private b(int i) {
        this.id = i;
    }

    public /* synthetic */ b(int i, f fVar) {
        this(i);
    }

    /* renamed from: JR */
    public Integer getId() {
        return Integer.valueOf(this.id);
    }
}
