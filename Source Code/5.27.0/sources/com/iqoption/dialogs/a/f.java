package com.iqoption.dialogs.a;

import android.view.ViewGroup;
import com.iqoption.core.ui.widget.recyclerview.adapter.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016¨\u0006\u000e"}, bng = {"Lcom/iqoption/dialogs/custodial/ScheduleItemsAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Lcom/iqoption/dialogs/custodial/ScheduleItemViewHolder;", "Lcom/iqoption/dialogs/custodial/ScheduleItem;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "dialogs_release"})
/* compiled from: ScheduleItemsAdapter.kt */
public final class f extends a<e, d> {
    /* renamed from: C */
    public e onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        return new e(viewGroup);
    }

    /* renamed from: a */
    public void onBindViewHolder(e eVar, int i) {
        kotlin.jvm.internal.i.f(eVar, "holder");
        eVar.bB(fp(i));
    }
}
