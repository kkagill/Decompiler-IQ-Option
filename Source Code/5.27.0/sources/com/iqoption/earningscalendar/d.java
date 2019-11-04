package com.iqoption.earningscalendar;

import android.view.ViewGroup;
import com.iqoption.core.ui.widget.recyclerview.a.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0015\u0016B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, bng = {"Lcom/iqoption/earningscalendar/EarningsCalendarAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "Lcom/iqoption/earningscalendar/EarningsCalendarAdapterItem;", "callbacks", "Lcom/iqoption/earningscalendar/EarningsCalendarAdapter$Callbacks;", "isLandscape", "", "(Lcom/iqoption/earningscalendar/EarningsCalendarAdapter$Callbacks;Z)V", "earningsCalendarItemBinder", "Lcom/iqoption/earningscalendar/EarningsCalendarItemBinder;", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Callbacks", "Companion", "earningscalendar_release"})
/* compiled from: EarningsCalendarAdapter.kt */
public final class d extends com.iqoption.core.ui.widget.recyclerview.adapter.a<c<?>, e> {
    public static final b cNb = new b();
    private final i cMY = new i(com.iqoption.core.d.Uo());
    private final a cMZ;
    private final boolean cNa;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/earningscalendar/EarningsCalendarAdapter$Callbacks;", "", "onClickItem", "", "item", "Lcom/iqoption/earningscalendar/EarningsCalendarItem;", "earningscalendar_release"})
    /* compiled from: EarningsCalendarAdapter.kt */
    public interface a {
        void a(h hVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/earningscalendar/EarningsCalendarAdapter$Companion;", "", "()V", "VIEW_TYPE_EMPTY", "", "VIEW_TYPE_ITEM_MACRO", "VIEW_TYPE_ITEM_MICRO", "VIEW_TYPE_LOADING", "VIEW_TYPE_TITLE_MACRO", "VIEW_TYPE_TITLE_MICRO", "earningscalendar_release"})
    /* compiled from: EarningsCalendarAdapter.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }
    }

    public d(a aVar, boolean z) {
        kotlin.jvm.internal.i.f(aVar, "callbacks");
        this.cMZ = aVar;
        this.cNa = z;
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
            return new com.iqoption.earningscalendar.c.b(viewGroup);
        }
        if (i == 2) {
            return new com.iqoption.earningscalendar.b.b(viewGroup);
        }
        if (i == 3) {
            return new com.iqoption.earningscalendar.c.a(this.cMZ, this.cMY, viewGroup, this);
        }
        if (i == 4) {
            return new com.iqoption.earningscalendar.b.a(this.cMZ, this.cMY, viewGroup, this);
        }
        com.iqoption.core.ui.widget.recyclerview.adapter.a.bPk.unsupportedViewType(i);
        throw null;
    }

    /* renamed from: a */
    public void onBindViewHolder(c<?> cVar, int i) {
        kotlin.jvm.internal.i.f(cVar, "holder");
        int itemViewType = cVar.getItemViewType();
        String str = "null cannot be cast to non-null type com.iqoption.earningscalendar.EarningsCalendarTitle";
        com.iqoption.core.ui.widget.recyclerview.adapter.a.d fp;
        if (itemViewType == 1) {
            com.iqoption.earningscalendar.c.b bVar = (com.iqoption.earningscalendar.c.b) cVar;
            fp = fp(i);
            if (fp != null) {
                bVar.bV((j) fp);
                return;
            }
            throw new TypeCastException(str);
        } else if (itemViewType != 2) {
            str = "null cannot be cast to non-null type com.iqoption.earningscalendar.EarningsCalendarItem";
            if (itemViewType == 3) {
                com.iqoption.earningscalendar.c.a aVar = (com.iqoption.earningscalendar.c.a) cVar;
                fp = fp(i);
                if (fp != null) {
                    aVar.bV((h) fp);
                    return;
                }
                throw new TypeCastException(str);
            } else if (itemViewType == 4) {
                com.iqoption.earningscalendar.b.a aVar2 = (com.iqoption.earningscalendar.b.a) cVar;
                fp = fp(i);
                if (fp != null) {
                    aVar2.bV((h) fp);
                    return;
                }
                throw new TypeCastException(str);
            }
        } else {
            com.iqoption.earningscalendar.b.b bVar2 = (com.iqoption.earningscalendar.b.b) cVar;
            fp = fp(i);
            if (fp != null) {
                bVar2.bV((j) fp);
                return;
            }
            throw new TypeCastException(str);
        }
    }

    public int getItemViewType(int i) {
        e eVar = (e) fp(i);
        if (eVar instanceof n) {
            return -2;
        }
        if (eVar instanceof m) {
            return -1;
        }
        if (eVar instanceof j) {
            return this.cNa ? 1 : 2;
        } else {
            if (eVar instanceof h) {
                return this.cNa ? 3 : 4;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
