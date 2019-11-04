package com.iqoption.forexcalendar;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.core.d;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.widget.recyclerview.a.c;
import com.iqoption.core.util.m;
import com.squareup.picasso.Picasso;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, bng = {"Lcom/iqoption/forexcalendar/ForexCalendarItemViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "Lcom/iqoption/forexcalendar/ForexCalendarItem;", "callback", "Lcom/iqoption/forexcalendar/ForexCalendarItemViewHolder$Callback;", "isMicro", "", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/forexcalendar/ForexCalendarItemViewHolder$Callback;ZLandroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "binder", "Lcom/iqoption/forexcalendar/ItemBinder;", "(Lcom/iqoption/forexcalendar/ForexCalendarItemViewHolder$Callback;Lcom/iqoption/forexcalendar/ItemBinder;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "dotsDrawable", "Lcom/iqoption/core/ui/widget/drawable/DotsDrawable;", "bind", "", "item", "Callback", "forexcalendar_release"})
/* compiled from: ForexCalendarItemViewHolder.kt */
public final class k extends c<j> {
    private final com.iqoption.core.ui.widget.b.a cSI;
    private final b cSJ;
    private final p cSK;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/forexcalendar/ForexCalendarItemViewHolder$Callback;", "", "onClickItem", "", "item", "Lcom/iqoption/forexcalendar/ForexCalendarItem;", "forexcalendar_release"})
    /* compiled from: ForexCalendarItemViewHolder.kt */
    public interface b {
        void a(j jVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a extends g {
        final /* synthetic */ k cSL;

        public a(k kVar) {
            this.cSL = kVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            j jVar = (j) this.cSL.and();
            if (jVar != null) {
                this.cSL.cSJ.a(jVar);
            }
        }
    }

    public k(b bVar, p pVar, com.iqoption.core.ui.widget.recyclerview.a.a aVar) {
        kotlin.jvm.internal.i.f(bVar, "callback");
        kotlin.jvm.internal.i.f(pVar, "binder");
        kotlin.jvm.internal.i.f(aVar, "data");
        super(pVar.getRoot(), aVar);
        this.cSJ = bVar;
        this.cSK = pVar;
        com.iqoption.core.ui.widget.b.a aVar2 = new com.iqoption.core.ui.widget.b.a(com.iqoption.core.ext.a.c((ViewHolder) this, r.c.dp1), com.iqoption.core.ext.a.c((ViewHolder) this, r.c.dp6) / 2.0f, com.iqoption.core.ext.a.c((ViewHolder) this, r.c.dp5), 3);
        aVar2.setColor(com.iqoption.core.ext.a.b((ViewHolder) this, com.iqoption.forexcalendar.r.b.grey_blue_70));
        this.cSI = aVar2;
        this.cSK.getRoot().setOnClickListener(new a(this));
        this.cSK.awI().setImageDrawable(this.cSI);
    }

    public k(b bVar, boolean z, ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar) {
        kotlin.jvm.internal.i.f(bVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar, "data");
        this(bVar, z ? new com.iqoption.forexcalendar.c.a(viewGroup) : new com.iqoption.forexcalendar.b.a(viewGroup), aVar);
    }

    /* renamed from: b */
    public void bB(j jVar) {
        kotlin.jvm.internal.i.f(jVar, "item");
        long adv = jVar.awB().adv() * 1000;
        this.cSK.awH().setText(jVar.awB().getName());
        this.cSK.awH().setTextColor(com.iqoption.core.ext.a.b((ViewHolder) this, adv < d.EB().If() ? com.iqoption.forexcalendar.r.b.grey_blue_70 : com.iqoption.forexcalendar.r.b.white));
        this.cSK.awG().setText(com.iqoption.core.ext.c.Xg().format(Long.valueOf(adv)));
        this.cSI.fk(jVar.awB().getImportance());
        String Y = m.bQG.Y(jVar.awB().getCountry());
        if (Y != null) {
            Picasso.with(this.cSK.getContext()).load(Y).into(this.cSK.awF());
        }
    }
}
