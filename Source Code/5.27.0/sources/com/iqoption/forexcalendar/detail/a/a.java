package com.iqoption.forexcalendar.detail.a;

import android.view.ViewGroup;
import com.iqoption.core.ui.widget.recyclerview.a.c;
import com.iqoption.core.ui.widget.recyclerview.adapter.a.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "Lcom/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedAdapterItem;", "callbacks", "Lcom/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedAdapter$Callbacks;", "(Lcom/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedAdapter$Callbacks;)V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Callbacks", "Companion", "forexcalendar_release"})
/* compiled from: AssetAffectedAdapter.kt */
public final class a extends com.iqoption.core.ui.widget.recyclerview.adapter.a<c<?>, b> {
    public static final b cTI = new b();
    private final a cTH;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedAdapter$Companion;", "", "()V", "VIEW_TYPE_ITEM", "", "VIEW_TYPE_LOADING", "forexcalendar_release"})
    /* compiled from: AssetAffectedAdapter.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, bng = {"Lcom/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedAdapter$Callbacks;", "Lcom/iqoption/forexcalendar/detail/assetsaffected/AssetAffectedItemViewHolder$Callback;", "forexcalendar_release"})
    /* compiled from: AssetAffectedAdapter.kt */
    public interface a extends com.iqoption.forexcalendar.detail.a.d.a {
    }

    public a(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "callbacks");
        this.cTH = aVar;
    }

    /* renamed from: f */
    public c<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        if (i == -1) {
            return new com.iqoption.core.ui.c(viewGroup);
        }
        if (i == 1) {
            return new d(this.cTH, viewGroup, this);
        }
        com.iqoption.core.ui.widget.recyclerview.adapter.a.bPk.unsupportedViewType(i);
        throw null;
    }

    /* renamed from: a */
    public void onBindViewHolder(c<?> cVar, int i) {
        kotlin.jvm.internal.i.f(cVar, "holder");
        if (cVar.getItemViewType() == 1) {
            d dVar = (d) cVar;
            d fp = fp(i);
            if (fp != null) {
                dVar.bV((c) fp);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.forexcalendar.detail.assetsaffected.AssetAffectedItem");
        }
    }

    public int getItemViewType(int i) {
        b bVar = (b) fp(i);
        if (bVar instanceof e) {
            return -1;
        }
        if (bVar instanceof c) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }
}
