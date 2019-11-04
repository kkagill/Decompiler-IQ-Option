package com.iqoption.protrader;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.analytics.EventManager;
import com.iqoption.dto.Event;
import com.iqoption.e.mt;
import com.iqoption.fragment.b.d;
import com.iqoption.protrader.web.ProTraderWebActivity;
import com.iqoption.protrader.web.ProTraderWebType;
import com.iqoption.x.R;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J&\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/protrader/ProTraderMoreFragment;", "Lcom/iqoption/fragment/base/IQFragment;", "()V", "binding", "Lcom/iqoption/databinding/FragmentProTraderMoreBinding;", "applyNow", "", "learnMore", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "prepareText", "Companion", "app_optionXRelease"})
/* compiled from: ProTraderMoreFragment.kt */
public final class e extends d {
    private static final String TAG = e.class.getName();
    public static final a dQq = new a();
    private HashMap apm;
    private mt dQp;

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/protrader/ProTraderMoreFragment$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "remove", "", "fm", "Landroidx/fragment/app/FragmentManager;", "show", "containerId", "", "app_optionXRelease"})
    /* compiled from: ProTraderMoreFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final void a(FragmentManager fragmentManager, int i) {
            kotlin.jvm.internal.i.f(fragmentManager, "fm");
            fragmentManager.beginTransaction().replace(i, new e(), e.TAG).commitAllowingStateLoss();
        }

        public final void e(FragmentManager fragmentManager) {
            kotlin.jvm.internal.i.f(fragmentManager, "fm");
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag(e.TAG);
            if (findFragmentByTag != null) {
                View view = findFragmentByTag.getView();
                if (view != null) {
                    com.iqoption.core.ext.a.al(view);
                }
                fragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: ProTraderMoreFragment.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ e dQr;

        b(e eVar) {
            this.dQr = eVar;
        }

        public final void onClick(View view) {
            this.dQr.aSV();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: ProTraderMoreFragment.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ e dQr;

        c(e eVar) {
            this.dQr = eVar;
        }

        public final void onClick(View view) {
            this.dQr.aSW();
        }
    }

    public static final void a(FragmentManager fragmentManager, int i) {
        dQq.a(fragmentManager, i);
    }

    public static final void e(FragmentManager fragmentManager) {
        dQq.e(fragmentManager);
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

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dQp = (mt) com.iqoption.core.ext.a.a((Fragment) this, (int) R.layout.fragment_pro_trader_more, viewGroup, false, 4, null);
        mt mtVar = this.dQp;
        if (mtVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return mtVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        aST();
        String valueOf = String.valueOf(500);
        mt mtVar = this.dQp;
        String str = "binding";
        if (mtVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = mtVar.cih;
        kotlin.jvm.internal.i.e(textView, "binding.proMoreAccessToLeverages");
        textView.setText(getString(R.string.access_to_higher_leverages_n1, valueOf));
        mt mtVar2 = this.dQp;
        if (mtVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        mtVar2.cij.setOnClickListener(new b(this));
        mtVar2 = this.dQp;
        if (mtVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        mtVar2.cii.setOnClickListener(new c(this));
    }

    private final void aSV() {
        EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, "change-asset_more-learn-more"));
        ProTraderWebActivity.dQJ.a(com.iqoption.core.ext.a.r(this), ProTraderWebType.MOR_INFO);
    }

    private final void aSW() {
        EventManager.BS().a(new Event(Event.CATEGORY_BUTTON_PRESSED, "change-asset_more-apply-now"));
        ProTraderWebActivity.dQJ.a(com.iqoption.core.ext.a.r(this), ProTraderWebType.APPLY);
    }

    private final void aST() {
        Object[] objArr = new Object[1];
        String str = "*PRO_BADGE_ANCHOR*";
        objArr[0] = str;
        String string = getString(R.string.this_feature_available_for_our_professional_n1, objArr);
        kotlin.jvm.internal.i.e(string, "getString(R.string.this_…_professional_n1, anchor)");
        CharSequence charSequence = string;
        SpannableString spannableString = new SpannableString(charSequence);
        Drawable drawable = ContextCompat.getDrawable(com.iqoption.core.ext.a.q(this), R.drawable.ic_pro_badge);
        if (drawable == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(drawable, "ContextCompat.getDrawabl….drawable.ic_pro_badge)!!");
        com.iqoption.view.text.c cVar = new com.iqoption.view.text.c(drawable, getResources().getDimensionPixelSize(R.dimen.dp32), getResources().getDimensionPixelSize(R.dimen.dp14));
        int a = v.a(charSequence, str, 0, false, 6, null);
        spannableString.setSpan(cVar, a, a + 18, 17);
        mt mtVar = this.dQp;
        if (mtVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        TextView textView = mtVar.cik;
        kotlin.jvm.internal.i.e(textView, "binding.proMoreText");
        textView.setText(spannableString);
    }
}
