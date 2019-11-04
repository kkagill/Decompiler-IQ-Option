package com.iqoption.protrader.active;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.analytics.EventManager;
import com.iqoption.core.data.model.ActiveType;
import com.iqoption.dto.Event;
import com.iqoption.e.mr;
import com.iqoption.fragment.b.d;
import com.iqoption.x.R;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, bng = {"Lcom/iqoption/protrader/active/ProTraderActiveFragment;", "Lcom/iqoption/fragment/base/IQFragment;", "()V", "activeType", "Lcom/iqoption/core/data/model/ActiveType;", "getActiveType", "()Lcom/iqoption/core/data/model/ActiveType;", "activeType$delegate", "Lkotlin/Lazy;", "binding", "Lcom/iqoption/databinding/FragmentProTraderActiveBinding;", "viewModel", "Lcom/iqoption/protrader/active/ProTraderActiveViewModel;", "learnMore", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "prepareText", "Companion", "app_optionXRelease"})
/* compiled from: ProTraderActiveFragment.kt */
public final class a extends d {
    private static final String TAG = a.class.getName();
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "activeType", "getActiveType()Lcom/iqoption/core/data/model/ActiveType;"))};
    public static final a dQy = new a();
    private HashMap apm;
    private final kotlin.d dQv = g.c(new ProTraderActiveFragment$activeType$2(this));
    private mr dQw;
    private b dQx;

    @i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0007J(\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/protrader/active/ProTraderActiveFragment$Companion;", "", "()V", "ARG_ACTIVE_TYPE", "", "TAG", "kotlin.jvm.PlatformType", "findExistedFragment", "Landroidx/fragment/app/Fragment;", "fm", "Landroidx/fragment/app/FragmentManager;", "remove", "", "showIfNeeded", "activity", "Landroidx/fragment/app/FragmentActivity;", "containerId", "", "activeType", "Lcom/iqoption/core/data/model/ActiveType;", "app_optionXRelease"})
    /* compiled from: ProTraderActiveFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final void a(FragmentActivity fragmentActivity, FragmentManager fragmentManager, int i, ActiveType activeType) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            kotlin.jvm.internal.i.f(fragmentManager, "fm");
            kotlin.jvm.internal.i.f(activeType, "activeType");
            if (b.dQz.B(fragmentActivity).aSZ()) {
                a aVar = new a();
                Bundle bundle = new Bundle();
                bundle.putSerializable("ARG_ACTIVE_TYPE", activeType);
                aVar.setArguments(bundle);
                fragmentManager.beginTransaction().replace(i, aVar, a.TAG).commitAllowingStateLoss();
                return;
            }
            e(fragmentManager);
        }

        public final void e(FragmentManager fragmentManager) {
            kotlin.jvm.internal.i.f(fragmentManager, "fm");
            Fragment m = m(fragmentManager);
            if (m != null) {
                View view = m.getView();
                if (view != null) {
                    com.iqoption.core.ext.a.al(view);
                }
                fragmentManager.beginTransaction().remove(m).commitAllowingStateLoss();
            }
        }

        private final Fragment m(FragmentManager fragmentManager) {
            return fragmentManager.findFragmentByTag(a.TAG);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: ProTraderActiveFragment.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ a this$0;

        b(a aVar) {
            this.this$0 = aVar;
        }

        public final void onClick(View view) {
            this.this$0.aSV();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: ProTraderActiveFragment.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ a this$0;

        c(a aVar) {
            this.this$0 = aVar;
        }

        public final void onClick(View view) {
            EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, "change-asset_become-pro-close"));
            a.b(this.this$0).aTa();
            com.iqoption.core.ext.a.t(this.this$0).beginTransaction().remove(this.this$0).commitNowAllowingStateLoss();
        }
    }

    public static final void a(FragmentActivity fragmentActivity, FragmentManager fragmentManager, int i, ActiveType activeType) {
        dQy.a(fragmentActivity, fragmentManager, i, activeType);
    }

    public static final void e(FragmentManager fragmentManager) {
        dQy.e(fragmentManager);
    }

    private final ActiveType getActiveType() {
        kotlin.d dVar = this.dQv;
        j jVar = anY[0];
        return (ActiveType) dVar.getValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public static final /* synthetic */ b b(a aVar) {
        b bVar = aVar.dQx;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return bVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dQw = (mr) com.iqoption.core.ext.a.a((Fragment) this, (int) R.layout.fragment_pro_trader_active, viewGroup, false, 4, null);
        mr mrVar = this.dQw;
        if (mrVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return mrVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.dQx = b.dQz.B(com.iqoption.core.ext.a.r(this));
        aST();
        mr mrVar = this.dQw;
        String str = "binding";
        if (mrVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        mrVar.cie.setOnClickListener(new b(this));
        mrVar = this.dQw;
        if (mrVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        mrVar.cid.setOnClickListener(new c(this));
    }

    private final void aST() {
        String valueOf = String.valueOf(500);
        String d = com.iqoption.util.c.a.d(getActiveType());
        d = getString(R.string.leverages_up_to_n1_available_n2, valueOf, d);
        kotlin.jvm.internal.i.e(d, "getString(R.string.lever…maxLeverage, activeTitle)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(d);
        d = " ";
        spannableStringBuilder.append(d);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(getString(R.string.learn_more));
        Drawable drawable = ContextCompat.getDrawable(com.iqoption.core.ext.a.q(this), R.drawable.ic_arrow_forward_white_6);
        if (drawable == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(drawable, "ContextCompat.getDrawabl…_arrow_forward_white_6)!!");
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        ImageSpan imageSpan = new ImageSpan(drawable, 0);
        spannableStringBuilder2.append(d);
        spannableStringBuilder2.setSpan(imageSpan, spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 17);
        spannableStringBuilder2.setSpan(new StyleSpan(1), 0, spannableStringBuilder2.length(), 17);
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(ContextCompat.getColor(com.iqoption.core.ext.a.q(this), R.color.white)), 0, spannableStringBuilder2.length(), 17);
        spannableStringBuilder.append(spannableStringBuilder2);
        mr mrVar = this.dQw;
        if (mrVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = mrVar.cif;
        kotlin.jvm.internal.i.e(textView, "binding.proActiveText");
        textView.setText(spannableStringBuilder);
    }

    private final void aSV() {
        EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, "change-asset_become-pro-learn-more"));
        com.iqoption.protrader.dialog.a.dQD.C(com.iqoption.core.ext.a.r(this));
    }
}
