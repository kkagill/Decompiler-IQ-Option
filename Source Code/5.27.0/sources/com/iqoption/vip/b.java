package com.iqoption.vip;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.microservice.vip.VipManagerDeserializer;
import com.iqoption.x.R;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.n;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00126\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\t\u00126\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\u0002\u0010\u0010J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R>\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f0\tX\u0004¢\u0006\u0002\n\u0000R>\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\tX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, bng = {"Lcom/iqoption/vip/ChooseTimeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/iqoption/vip/ChooseTimeAdapter$TimePeriodViewHolder;", "date", "", "periods", "", "Lcom/iqoption/vip/WorkingPeriod;", "periodSelected", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "period", "", "isPeriodSelected", "", "(JLjava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "getDate", "()J", "getPeriods", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "TimePeriodViewHolder", "app_optionXRelease"})
/* compiled from: ChooseTimeAdapter.kt */
public final class b extends Adapter<a> {
    private final long aSH;
    private final List<k> byn;
    private final m<Long, k, l> ejp;
    private final m<Long, k, Boolean> ejq;

    @i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00126\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007\u00126\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u000e0\u0007¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011RA\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u000e0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0012RA\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, bng = {"Lcom/iqoption/vip/ChooseTimeAdapter$TimePeriodViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/widget/TextView;", "date", "", "periodSelected", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Lcom/iqoption/vip/WorkingPeriod;", "period", "", "isPeriodSelected", "", "(Landroid/widget/TextView;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "getDate", "()J", "()Lkotlin/jvm/functions/Function2;", "getPeriodSelected", "getView", "()Landroid/widget/TextView;", "bind", "app_optionXRelease"})
    /* compiled from: ChooseTimeAdapter.kt */
    public static final class a extends ViewHolder {
        private final long aSH;
        private final TextView biJ;
        private final m<Long, k, l> ejp;
        private final m<Long, k, Boolean> ejq;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
        /* compiled from: ChooseTimeAdapter.kt */
        static final class a implements OnClickListener {
            final /* synthetic */ a ejr;
            final /* synthetic */ k ejs;

            a(a aVar, k kVar) {
                this.ejr = aVar;
                this.ejs = kVar;
            }

            public final void onClick(View view) {
                this.ejr.aZi().w(Long.valueOf(this.ejr.getDate()), this.ejs);
            }
        }

        public final m<Long, k, l> aZi() {
            return this.ejp;
        }

        public final long getDate() {
            return this.aSH;
        }

        public a(TextView textView, long j, m<? super Long, ? super k, l> mVar, m<? super Long, ? super k, Boolean> mVar2) {
            kotlin.jvm.internal.i.f(textView, Promotion.ACTION_VIEW);
            kotlin.jvm.internal.i.f(mVar, "periodSelected");
            kotlin.jvm.internal.i.f(mVar2, "isPeriodSelected");
            super(textView);
            this.biJ = textView;
            this.aSH = j;
            this.ejp = mVar;
            this.ejq = mVar2;
        }

        public final void a(k kVar) {
            kotlin.jvm.internal.i.f(kVar, "period");
            TextView textView = this.biJ;
            n nVar = n.eWf;
            Locale locale = Locale.US;
            kotlin.jvm.internal.i.e(locale, "Locale.US");
            Object[] objArr = new Object[]{VipManagerDeserializer.dHB.format(kVar.getStartDate()), VipManagerDeserializer.dHB.format(kVar.getEndDate())};
            String format = String.format(locale, "%s - %s", Arrays.copyOf(objArr, objArr.length));
            kotlin.jvm.internal.i.e(format, "java.lang.String.format(locale, format, *args)");
            textView.setText(format);
            this.biJ.setSelected(((Boolean) this.ejq.w(Long.valueOf(this.aSH), kVar)).booleanValue());
            this.biJ.setOnClickListener(new a(this, kVar));
        }
    }

    public b(long j, List<k> list, m<? super Long, ? super k, l> mVar, m<? super Long, ? super k, Boolean> mVar2) {
        kotlin.jvm.internal.i.f(list, "periods");
        kotlin.jvm.internal.i.f(mVar, "periodSelected");
        kotlin.jvm.internal.i.f(mVar2, "isPeriodSelected");
        this.aSH = j;
        this.byn = list;
        this.ejp = mVar;
        this.ejq = mVar2;
    }

    /* renamed from: W */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.choose_time_item_view, viewGroup, false);
        if (inflate != null) {
            return new a((TextView) inflate, this.aSH, this.ejp, this.ejq);
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }

    public int getItemCount() {
        return this.byn.size();
    }

    /* renamed from: a */
    public void onBindViewHolder(a aVar, int i) {
        kotlin.jvm.internal.i.f(aVar, "holder");
        aVar.a((k) this.byn.get(i));
    }
}
