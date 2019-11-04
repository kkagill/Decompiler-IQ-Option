package com.iqoption.fragment.tradingtoday;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.iqoption.core.ext.a;
import com.iqoption.core.microservices.tradingengine.response.active.d;
import com.iqoption.core.util.af;
import com.iqoption.e.pb;
import com.iqoption.util.j;
import com.iqoption.x.R;
import com.squareup.picasso.Picasso;
import java.util.Arrays;
import java.util.Locale;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.n;
import kotlin.l;
import kotlin.text.Regex;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "T", "C", "it", "invoke", "(Ljava/lang/Object;)V", "com/iqoption/core/kotlin/DelegatesKt$bindable$1"})
/* compiled from: Delegates.kt */
public final class PopularAssetHolder$$special$$inlined$bindable$1 extends Lambda implements b<d, l> {
    final /* synthetic */ pb $binding$inlined;
    final /* synthetic */ Object $context;

    public PopularAssetHolder$$special$$inlined$bindable$1(Object obj, pb pbVar) {
        this.$context = obj;
        this.$binding$inlined = pbVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        bU(obj);
        return l.eVB;
    }

    public final void bU(d dVar) {
        d dVar2 = dVar;
        pb pbVar = (pb) this.$context;
        View root = this.$binding$inlined.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        Context context = root.getContext();
        String image = dVar2.Jt().getImage();
        if ((((CharSequence) image).length() > 0 ? 1 : null) != null) {
            Picasso.with(context).load(image).into(this.$binding$inlined.bXh);
        }
        TextView textView = this.$binding$inlined.aoh;
        kotlin.jvm.internal.i.e(textView, "binding.assetName");
        textView.setText(d.B(dVar2.Jt()));
        String str = "binding.value";
        String str2 = "context";
        TextView textView2;
        TextView textView3;
        int k;
        switch (dVar2.aIf()) {
            case BEST_PROFITABILITY:
                this.$binding$inlined.alH.setText(R.string.best_profitability);
                textView = this.$binding$inlined.aoq;
                kotlin.jvm.internal.i.e(textView, str);
                textView.setText(af.a((double) (100 - dVar2.Jt().ahR()), 0, false, 6, null));
                textView2 = this.$binding$inlined.aoq;
                kotlin.jvm.internal.i.e(context, str2);
                textView2.setTextColor(a.k(context, (int) R.color.green));
                return;
            case MOST_POPULAR:
                this.$binding$inlined.alH.setText(R.string.most_popular);
                textView3 = this.$binding$inlined.aoq;
                kotlin.jvm.internal.i.e(textView3, str);
                textView3.setText("");
                return;
            case TOP_GAINERS:
            case TOP_LOSERS:
                this.$binding$inlined.alH.setText(dVar2.aIf() == PopularType.TOP_GAINERS ? R.string.top_gainers : R.string.top_losers);
                Double ahD = dVar2.ahD();
                if (ahD != null) {
                    textView = this.$binding$inlined.aoq;
                    kotlin.jvm.internal.i.e(textView, str);
                    double doubleValue = ahD.doubleValue();
                    String b = j.b((Number) ahD);
                    kotlin.jvm.internal.i.e(b, "CurrencyUtils.getSign(diffTradingDay)");
                    textView.setText(af.a(doubleValue, b, 2, true));
                    textView = this.$binding$inlined.aoq;
                    if (ahD.doubleValue() > 0.01d) {
                        kotlin.jvm.internal.i.e(context, str2);
                        k = a.k(context, (int) R.color.green);
                    } else if (ahD.doubleValue() < -0.01d) {
                        kotlin.jvm.internal.i.e(context, str2);
                        k = a.k(context, (int) R.color.red);
                    } else {
                        kotlin.jvm.internal.i.e(context, str2);
                        k = a.k(context, (int) R.color.white);
                    }
                    textView.setTextColor(k);
                    return;
                }
                return;
            case LOWEST_SPREAD:
                this.$binding$inlined.alH.setText(R.string.the_lowest_spread);
                if (dVar2.ahD() != null) {
                    textView = this.$binding$inlined.aoq;
                    kotlin.jvm.internal.i.e(textView, str);
                    n nVar = n.eWf;
                    Locale locale = Locale.US;
                    kotlin.jvm.internal.i.e(locale, "Locale.US");
                    Object[] objArr = new Object[]{com.iqoption.core.util.j.fr(3).format(dVar2.ahD().doubleValue())};
                    String format = String.format(locale, "%s%%", Arrays.copyOf(objArr, objArr.length));
                    kotlin.jvm.internal.i.e(format, "java.lang.String.format(locale, format, *args)");
                    textView.setText(format);
                    textView2 = this.$binding$inlined.aoq;
                    kotlin.jvm.internal.i.e(context, str2);
                    textView2.setTextColor(a.k(context, (int) R.color.white));
                    return;
                }
                return;
            case BIG_MOVERS:
                this.$binding$inlined.alH.setText(R.string.big_movers_today);
                if (dVar2.aIg() != null) {
                    textView = this.$binding$inlined.aoq;
                    if (dVar2.aIg().aUc()) {
                        kotlin.jvm.internal.i.e(context, str2);
                        k = a.k(context, (int) R.color.green);
                    } else {
                        kotlin.jvm.internal.i.e(context, str2);
                        k = a.k(context, (int) R.color.red);
                    }
                    textView.setTextColor(k);
                    textView3 = this.$binding$inlined.aoq;
                    kotlin.jvm.internal.i.e(textView3, str);
                    textView3.setText((CharSequence) u.bU(new Regex(" ").k(dVar2.aIg().getValue(), 0)));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
