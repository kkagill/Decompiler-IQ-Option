package com.iqoption.forexcalendar;

import android.view.ViewGroup;
import com.iqoption.core.ui.widget.recyclerview.a.c;
import com.iqoption.core.ui.widget.recyclerview.adapter.a.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0013\u0014B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, bng = {"Lcom/iqoption/forexcalendar/ForexCalendarAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "Lcom/iqoption/forexcalendar/ForexCalendarAdapterItem;", "callbacks", "Lcom/iqoption/forexcalendar/ForexCalendarAdapter$Callbacks;", "isMicro", "", "(Lcom/iqoption/forexcalendar/ForexCalendarAdapter$Callbacks;Z)V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Callbacks", "Companion", "forexcalendar_release"})
/* compiled from: ForexCalendarAdapter.kt */
public final class f extends com.iqoption.core.ui.widget.recyclerview.adapter.a<c<?>, g> {
    public static final b cSA = new b();
    private final a cSy;
    private final boolean cSz;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, bng = {"Lcom/iqoption/forexcalendar/ForexCalendarAdapter$Companion;", "", "()V", "VIEW_TYPE_EMPTY", "", "VIEW_TYPE_ITEM", "VIEW_TYPE_LOADING", "VIEW_TYPE_TITLE", "forexcalendar_release"})
    /* compiled from: ForexCalendarAdapter.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, bng = {"Lcom/iqoption/forexcalendar/ForexCalendarAdapter$Callbacks;", "Lcom/iqoption/forexcalendar/ForexCalendarItemViewHolder$Callback;", "forexcalendar_release"})
    /* compiled from: ForexCalendarAdapter.kt */
    public interface a extends com.iqoption.forexcalendar.k.b {
    }

    public f(a aVar, boolean z) {
        kotlin.jvm.internal.i.f(aVar, "callbacks");
        this.cSy = aVar;
        this.cSz = z;
    }

    /* renamed from: f */
    public c<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        if (i == -2) {
            return new com.iqoption.core.ui.c(viewGroup);
        }
        if (i == -1) {
            return new com.iqoption.core.marketanalysis.b(viewGroup);
        }
        if (i == 1) {
            return new m(this.cSz, viewGroup);
        }
        if (i == 2) {
            return new k(this.cSy, this.cSz, viewGroup, this);
        }
        com.iqoption.core.ui.widget.recyclerview.adapter.a.bPk.unsupportedViewType(i);
        throw null;
    }

    /* renamed from: a */
    public void onBindViewHolder(c<?> cVar, int i) {
        kotlin.jvm.internal.i.f(cVar, "holder");
        int itemViewType = cVar.getItemViewType();
        d fp;
        if (itemViewType == 1) {
            m mVar = (m) cVar;
            fp = fp(i);
            if (fp != null) {
                mVar.bV((l) fp);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.forexcalendar.ForexCalendarTitle");
        } else if (itemViewType == 2) {
            k kVar = (k) cVar;
            fp = fp(i);
            if (fp != null) {
                kVar.bV((j) fp);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.forexcalendar.ForexCalendarItem");
        }
    }

    public int getItemViewType(int i) {
        g gVar = (g) fp(i);
        if (gVar instanceof q) {
            return -2;
        }
        if (gVar instanceof d) {
            return -1;
        }
        if (gVar instanceof l) {
            return 1;
        }
        if (gVar instanceof j) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
