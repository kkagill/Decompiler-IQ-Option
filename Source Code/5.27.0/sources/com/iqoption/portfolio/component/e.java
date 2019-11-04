package com.iqoption.portfolio.component;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.e.sp;
import com.iqoption.portfolio.component.a.a;
import com.iqoption.portfolio.f;
import com.iqoption.x.R;
import java.util.Arrays;
import kotlin.i;
import kotlin.jvm.internal.n;

@i(bne = {1, 1, 15}, bnf = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0016H\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0018H\u0002J\u0018\u0010!\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0006\u0010&\u001a\u00020\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \r*\u0004\u0018\u00010\u00110\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, bng = {"Lcom/iqoption/portfolio/component/MicroTotalPagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "context", "Landroid/content/Context;", "uiConfig", "Lcom/iqoption/portfolio/component/UIConfig;", "portfolio", "Lcom/iqoption/portfolio/Portfolio;", "binder", "Lcom/iqoption/portfolio/component/binder/CalculationBinder;", "(Landroid/content/Context;Lcom/iqoption/portfolio/component/UIConfig;Lcom/iqoption/portfolio/Portfolio;Lcom/iqoption/portfolio/component/binder/CalculationBinder;)V", "inflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "pnlOrProfitPage", "Lcom/iqoption/databinding/MicroPortfolioTotalPagerPageBinding;", "resources", "Landroid/content/res/Resources;", "valuePage", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "", "object", "", "getBinding", "parent", "getCount", "getLabel", "", "resId", "instantiateItem", "isViewFromObject", "", "view", "Landroid/view/View;", "updateCalculation", "app_optionXRelease"})
/* compiled from: MicroTotalPagerAdapter.kt */
public final class e extends PagerAdapter {
    private final Resources aOg;
    private final LayoutInflater aPl;
    private final f dLB;
    private sp dLS;
    private sp dLT;
    private final m dLU;
    private final a dLV;

    public int getCount() {
        return 2;
    }

    public e(Context context, m mVar, f fVar, a aVar) {
        kotlin.jvm.internal.i.f(context, "context");
        kotlin.jvm.internal.i.f(mVar, "uiConfig");
        kotlin.jvm.internal.i.f(fVar, "portfolio");
        kotlin.jvm.internal.i.f(aVar, "binder");
        this.dLU = mVar;
        this.dLB = fVar;
        this.dLV = aVar;
        this.aOg = context.getResources();
        this.aPl = LayoutInflater.from(context);
    }

    private final sp t(ViewGroup viewGroup) {
        LayoutInflater layoutInflater = this.aPl;
        kotlin.jvm.internal.i.e(layoutInflater, "inflater");
        return (sp) com.iqoption.core.ext.a.a(layoutInflater, (int) R.layout.micro_portfolio_total_pager_page, viewGroup, false, 4, null);
    }

    public boolean isViewFromObject(View view, Object obj) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        kotlin.jvm.internal.i.f(obj, "object");
        return kotlin.jvm.internal.i.y(view, obj);
    }

    private final String getLabel(int i) {
        n nVar = n.eWf;
        String str = this.dLU.dMG;
        kotlin.jvm.internal.i.e(str, "uiConfig.totalLabelMask");
        Object[] objArr = new Object[]{this.aOg.getString(i)};
        String format = String.format(str, Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.i.e(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "container");
        sp t = t(viewGroup);
        if (i == 0) {
            this.dLS = t;
        } else {
            this.dLT = t;
        }
        aRh();
        viewGroup.addView(t.getRoot());
        View root = t.getRoot();
        kotlin.jvm.internal.i.e(root, "page.root");
        return root;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        kotlin.jvm.internal.i.f(viewGroup, "container");
        kotlin.jvm.internal.i.f(obj, "object");
        if (i == 0) {
            this.dLS = (sp) null;
        } else {
            this.dLT = (sp) null;
        }
        viewGroup.removeView((View) obj);
    }

    public final void aRh() {
        TextView textView;
        com.iqoption.portfolio.a aQI = this.dLB.aQI();
        sp spVar = this.dLS;
        String str = "it.label";
        if (spVar != null) {
            textView = spVar.aoo;
            kotlin.jvm.internal.i.e(textView, str);
            textView.setText(getLabel(R.string.total_value));
            this.dLV.b(spVar.aoq, aQI);
        }
        spVar = this.dLT;
        if (spVar != null) {
            switch (this.dLB.aQD()) {
                case 0:
                case 2:
                case 4:
                case 5:
                case 6:
                    textView = spVar.aoo;
                    kotlin.jvm.internal.i.e(textView, str);
                    textView.setText(getLabel(R.string.total_pnl));
                    this.dLV.a(spVar.aoq, aQI);
                    return;
                case 1:
                case 3:
                case 7:
                case 8:
                case 9:
                    textView = spVar.aoo;
                    kotlin.jvm.internal.i.e(textView, str);
                    textView.setText(getLabel(R.string.total_exp_profit));
                    this.dLV.c(spVar.aoq, aQI);
                    return;
                default:
                    return;
            }
        }
    }
}
