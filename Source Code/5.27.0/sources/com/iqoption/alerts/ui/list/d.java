package com.iqoption.alerts.ui.list;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.iqoption.alerts.b.e;
import com.iqoption.core.ui.widget.recyclerview.a.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, bng = {"Lcom/iqoption/alerts/ui/list/AlertItemsAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "Lcom/iqoption/alerts/ui/list/AlertAdapterItem;", "callback", "Lcom/iqoption/alerts/ui/list/AlertItemViewHolder$Callback;", "(Lcom/iqoption/alerts/ui/list/AlertItemViewHolder$Callback;)V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "alerts_release"})
/* compiled from: AlertItemsAdapter.kt */
public final class d extends com.iqoption.core.ui.widget.recyclerview.adapter.a<c<?>, a> {
    public static final a aph = new a();
    private final com.iqoption.alerts.ui.list.c.a apf;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, bng = {"Lcom/iqoption/alerts/ui/list/AlertItemsAdapter$Companion;", "", "()V", "PAYLOAD_TOGGLE", "", "VIEW_TYPE_EMPTY", "VIEW_TYPE_ITEM", "VIEW_TYPE_LOADING", "VIEW_TYPE_TITLE", "alerts_release"})
    /* compiled from: AlertItemsAdapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public d(com.iqoption.alerts.ui.list.c.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "callback");
        this.apf = aVar;
    }

    /* renamed from: f */
    public c<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        if (i == -2) {
            return new com.iqoption.core.ui.widget.recyclerview.a.d(e.alerts_list_empty_item, viewGroup, null, null, 12, null);
        }
        if (i == -1) {
            return new com.iqoption.core.ui.c(viewGroup);
        }
        if (i == 1) {
            return new com.iqoption.core.ui.widget.recyclerview.a.d(e.alerts_list_title_item, viewGroup, null, null, 12, null);
        }
        if (i == 2) {
            return new c(this.apf, viewGroup, this);
        }
        com.iqoption.core.ui.widget.recyclerview.adapter.a.bPk.unsupportedViewType(i);
        throw null;
    }

    /* renamed from: a */
    public void onBindViewHolder(c<?> cVar, int i) {
        kotlin.jvm.internal.i.f(cVar, "holder");
        int itemViewType = cVar.getItemViewType();
        com.iqoption.core.ui.widget.recyclerview.adapter.a.d fp;
        if (itemViewType == -2) {
            View view = cVar.itemView;
            if (view != null) {
                TextView textView = (TextView) view;
                fp = fp(i);
                if (fp != null) {
                    textView.setText(((j) fp).getResId());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.alerts.ui.list.EmptyItem");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        } else if (itemViewType == 2) {
            c cVar2 = (c) cVar;
            fp = fp(i);
            if (fp != null) {
                cVar2.bB((i) fp);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.alerts.ui.list.BaseAlertItem");
        }
    }

    public int getItemViewType(int i) {
        a aVar = (a) fp(i);
        if (aVar instanceof k) {
            return -1;
        }
        if (aVar instanceof j) {
            return -2;
        }
        if (aVar instanceof l) {
            return 1;
        }
        if (aVar instanceof i) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
