package com.iqoption.earningscalendar;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import com.iqoption.core.d;
import com.iqoption.core.ext.c;
import com.iqoption.core.microservices.a.a.b;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.core.util.af;
import com.iqoption.core.util.m;
import com.squareup.picasso.Picasso;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u001d\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019J \u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014JH\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020'2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0017\u001a\u00020\u0018R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b¨\u0006)"}, bng = {"Lcom/iqoption/earningscalendar/EarningsCalendarItemBinder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "grayBlueColor", "", "getGrayBlueColor", "()I", "greenColor", "getGreenColor", "redColor", "getRedColor", "whiteColor", "getWhiteColor", "bindAnnounceTime", "", "earningAnnounceTime", "Landroid/widget/TextView;", "event", "Lcom/iqoption/core/microservices/earningscalendar/response/EarningCalendarEvent;", "bindDiff", "earningDiff", "diff", "", "(Landroid/widget/TextView;Ljava/lang/Double;)V", "bindIcon", "earningIcon", "Landroid/widget/ImageView;", "active", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "bindName", "earningName", "bindRates", "currently", "forecast", "previous", "timeValue", "timeContainer", "Landroid/view/ViewGroup;", "Companion", "earningscalendar_release"})
/* compiled from: EarningsCalendarItemBinder.kt */
public final class i {
    public static final a cNq = new a();
    @ColorInt
    private final int amj;
    @ColorInt
    private final int amk;
    @ColorInt
    private final int aml;
    @ColorInt
    private final int cNp;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lcom/iqoption/earningscalendar/EarningsCalendarItemBinder$Companion;", "", "()V", "PRECISION", "", "earningscalendar_release"})
    /* compiled from: EarningsCalendarItemBinder.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public i(Context context) {
        kotlin.jvm.internal.i.f(context, "context");
        this.amj = com.iqoption.core.ext.a.k(context, com.iqoption.earningscalendar.o.a.green);
        this.amk = com.iqoption.core.ext.a.k(context, com.iqoption.earningscalendar.o.a.red);
        this.aml = com.iqoption.core.ext.a.k(context, com.iqoption.earningscalendar.o.a.white);
        this.cNp = com.iqoption.core.ext.a.k(context, com.iqoption.earningscalendar.o.a.grey_blue_70);
    }

    public final void a(ImageView imageView, com.iqoption.core.microservices.tradingengine.response.active.a aVar, b bVar) {
        kotlin.jvm.internal.i.f(imageView, "earningIcon");
        kotlin.jvm.internal.i.f(bVar, "event");
        Picasso with = Picasso.with(imageView.getContext());
        if (aVar != null) {
            with.load(aVar.getImage()).into(imageView);
            return;
        }
        String Y = m.bQG.Y(bVar.getCountry());
        if (Y != null) {
            with.load(Y).into(imageView);
        }
    }

    public final void a(TextView textView, b bVar) {
        kotlin.jvm.internal.i.f(textView, "earningName");
        kotlin.jvm.internal.i.f(bVar, "event");
        textView.setText(bVar.getName());
        textView.setTextColor(bVar.getDate() * 1000 < d.EB().If() ? this.cNp : this.aml);
    }

    public final void b(TextView textView, b bVar) {
        int i;
        kotlin.jvm.internal.i.f(textView, "earningAnnounceTime");
        kotlin.jvm.internal.i.f(bVar, "event");
        String ads = bVar.ads();
        if (ads != null) {
            int hashCode = ads.hashCode();
            if (hashCode != 64919) {
                if (hashCode != 66109) {
                    if (hashCode == 67819 && ads.equals("DMT")) {
                        i = o.d.during_trading_time;
                        textView.setText(i);
                    }
                } else if (ads.equals("BTO")) {
                    i = o.d.before_market_opens;
                    textView.setText(i);
                }
            } else if (ads.equals("AMC")) {
                i = o.d.after_market_closes;
                textView.setText(i);
            }
        }
        i = o.d.time_not_supplied;
        textView.setText(i);
    }

    public final void a(TextView textView, TextView textView2, TextView textView3, TextView textView4, ViewGroup viewGroup, b bVar, com.iqoption.core.microservices.tradingengine.response.active.a aVar, double d) {
        TextView textView5 = textView;
        TextView textView6 = textView2;
        TextView textView7 = textView3;
        TextView textView8 = textView4;
        ViewGroup viewGroup2 = viewGroup;
        kotlin.jvm.internal.i.f(textView5, "currently");
        kotlin.jvm.internal.i.f(textView6, "forecast");
        kotlin.jvm.internal.i.f(textView7, "previous");
        kotlin.jvm.internal.i.f(textView8, "timeValue");
        kotlin.jvm.internal.i.f(viewGroup2, "timeContainer");
        kotlin.jvm.internal.i.f(bVar, "event");
        Double adp = bVar.adp();
        Context context = textView.getContext();
        kotlin.jvm.internal.i.e(context, "context");
        int k = com.iqoption.core.ext.a.k(context, com.iqoption.asset.a.a.awY.JO());
        int a = com.iqoption.asset.a.a.awY.a(context, Double.valueOf(d));
        if (adp != null) {
            textView5.setText(c.d(adp.doubleValue(), 2));
            textView5.setTextColor(a);
            textView6.setTextColor(k);
            com.iqoption.core.ext.a.ak(textView5);
            com.iqoption.core.ext.a.al(viewGroup2);
        } else if (aVar != null) {
            com.iqoption.core.ext.a.al(textView5);
            com.iqoption.core.ext.a.ak(viewGroup2);
            long A = com.iqoption.core.microservices.tradingengine.response.active.d.A(aVar);
            if (A == Long.MAX_VALUE) {
                com.iqoption.core.ext.a.al(textView8);
            } else {
                com.iqoption.core.ext.a.ak(textView8);
                textView8.setText(TimeUtil.a(d.EB().If(), A, false, 4, null));
            }
            textView6.setTextColor(a);
        } else {
            textView5.setText("-");
            com.iqoption.core.ext.a.ak(textView5);
            com.iqoption.core.ext.a.al(viewGroup2);
            textView5.setTextColor(k);
            textView6.setTextColor(a);
        }
        textView6.setText(c.d(bVar.adr(), 2));
        textView7.setText(c.d(bVar.adq(), 2));
    }

    public final void a(TextView textView, Double d) {
        kotlin.jvm.internal.i.f(textView, "earningDiff");
        if (d == null) {
            com.iqoption.core.ext.a.al(textView);
            return;
        }
        int i;
        com.iqoption.core.ext.a.ak(textView);
        textView.setText(af.h(d.doubleValue(), 2));
        if (d.doubleValue() > 0.001d) {
            i = this.amj;
        } else if (d.doubleValue() < -0.001d) {
            i = this.amk;
        } else {
            i = this.aml;
        }
        textView.setTextColor(i);
    }
}
