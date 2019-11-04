package com.iqoption.core.ui.country;

import android.graphics.Point;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.textfield.TextInputLayout;
import com.google.common.base.Optional;
import com.iqoption.core.util.ah;
import com.iqoption.core.util.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 S2\u00020\u00012\u00020\u0002:\u0001SB\u0005¢\u0006\u0002\u0010\u0003J\b\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u000209H\u0016J\u0006\u0010;\u001a\u000209J\b\u0010<\u001a\u000209H\u0002J\b\u0010=\u001a\u000209H\u0002J\n\u0010>\u001a\u0004\u0018\u00010?H\u0002J\b\u0010@\u001a\u00020AH\u0002J\u0014\u0010B\u001a\u0002092\n\b\u0002\u0010C\u001a\u0004\u0018\u00010!H\u0002J\u0012\u0010D\u001a\u00020\u000e2\b\u0010E\u001a\u0004\u0018\u00010FH\u0014J\u0010\u0010G\u001a\u0002092\u0006\u0010H\u001a\u000202H\u0016J\u0012\u0010I\u001a\u0002092\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J&\u0010L\u001a\u0004\u0018\u00010?2\u0006\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010P2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\u001a\u0010Q\u001a\u0002092\u0006\u0010R\u001a\u00020?2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016R+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058B@BX\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0014\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0017\u0010\u0010R+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00198B@BX\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR#\u0010 \u001a\n \"*\u0004\u0018\u00010!0!8BX\u0002¢\u0006\f\n\u0004\b%\u0010\u0012\u001a\u0004\b#\u0010$R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001b\u0010,\u001a\u00020-8BX\u0002¢\u0006\f\n\u0004\b0\u0010\u0012\u001a\u0004\b.\u0010/R\u0010\u00101\u001a\u0004\u0018\u000102X\u000e¢\u0006\u0002\n\u0000R\u001b\u00103\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b5\u0010\u0012\u001a\u0004\b4\u0010\u0010R\u000e\u00106\u001a\u000207X.¢\u0006\u0002\n\u0000¨\u0006T"}, bng = {"Lcom/iqoption/core/ui/country/CountrySearchFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "Lcom/iqoption/core/ui/country/OnCountryClickListener;", "()V", "<set-?>", "Lcom/iqoption/core/ui/country/CountryAdapter;", "adapter", "getAdapter", "()Lcom/iqoption/core/ui/country/CountryAdapter;", "setAdapter", "(Lcom/iqoption/core/ui/country/CountryAdapter;)V", "adapter$delegate", "Lkotlin/properties/ReadWriteProperty;", "allowRestricted", "", "getAllowRestricted", "()Z", "allowRestricted$delegate", "Lkotlin/Lazy;", "allowUnregulated", "getAllowUnregulated", "allowUnregulated$delegate", "authorized", "getAuthorized", "authorized$delegate", "Lcom/iqoption/core/databinding/FragmentSearchCountryBinding;", "binding", "getBinding", "()Lcom/iqoption/core/databinding/FragmentSearchCountryBinding;", "setBinding", "(Lcom/iqoption/core/databinding/FragmentSearchCountryBinding;)V", "binding$delegate", "countryName", "", "kotlin.jvm.PlatformType", "getCountryName", "()Ljava/lang/String;", "countryName$delegate", "explicitCountrySelectionListener", "Lcom/iqoption/core/ui/country/OnCountrySelectionListener;", "getExplicitCountrySelectionListener", "()Lcom/iqoption/core/ui/country/OnCountrySelectionListener;", "setExplicitCountrySelectionListener", "(Lcom/iqoption/core/ui/country/OnCountrySelectionListener;)V", "inputPoint", "Landroid/graphics/Point;", "getInputPoint", "()Landroid/graphics/Point;", "inputPoint$delegate", "selectedCountry", "Lcom/iqoption/core/microservices/configuration/response/Country;", "showLocationButton", "getShowLocationButton", "showLocationButton$delegate", "viewModel", "Lcom/iqoption/core/ui/country/CountrySearchViewModel;", "animateShow", "", "back", "close", "closeKeyboardAndScreen", "closeWithAnimation", "getViewToHide", "Landroid/view/View;", "inputTranslationY", "", "loadSuggest", "text", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCountryClicked", "country", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "core_release"})
/* compiled from: CountrySearchFragment.kt */
public final class d extends com.iqoption.core.ui.fragment.d implements h {
    private static final String TAG;
    static final /* synthetic */ kotlin.reflect.j[] anY = new kotlin.reflect.j[]{kotlin.jvm.internal.k.a(new MutablePropertyReference1Impl(kotlin.jvm.internal.k.G(d.class), "binding", "getBinding()Lcom/iqoption/core/databinding/FragmentSearchCountryBinding;")), kotlin.jvm.internal.k.a(new MutablePropertyReference1Impl(kotlin.jvm.internal.k.G(d.class), "adapter", "getAdapter()Lcom/iqoption/core/ui/country/CountryAdapter;")), kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(d.class), "inputPoint", "getInputPoint()Landroid/graphics/Point;")), kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(d.class), "countryName", "getCountryName()Ljava/lang/String;")), kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(d.class), "authorized", "getAuthorized()Z")), kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(d.class), "allowUnregulated", "getAllowUnregulated()Z")), kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(d.class), "allowRestricted", "getAllowRestricted()Z")), kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(d.class), "showLocationButton", "getShowLocationButton()Z"))};
    public static final a bIl = new a();
    private HashMap apm;
    private e bIa;
    private final kotlin.f.d bIb = kotlin.f.a.eWg.bnQ();
    private final kotlin.f.d bIc = kotlin.f.a.eWg.bnQ();
    private final kotlin.d bId = g.c(new CountrySearchFragment$inputPoint$2(this));
    private final kotlin.d bIe = g.c(new CountrySearchFragment$countryName$2(this));
    private final kotlin.d bIf = g.c(new CountrySearchFragment$authorized$2(this));
    private final kotlin.d bIg = g.c(new CountrySearchFragment$allowUnregulated$2(this));
    private final kotlin.d bIh = g.c(new CountrySearchFragment$allowRestricted$2(this));
    private final kotlin.d bIi = g.c(new CountrySearchFragment$showLocationButton$2(this));
    private com.iqoption.core.microservices.configuration.a.c bIj;
    private i bIk;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0016H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, bng = {"Lcom/iqoption/core/ui/country/CountrySearchFragment$Companion;", "", "()V", "ARG_ALLOW_RESTRICTED", "", "ARG_ALLOW_UNREGULATED", "ARG_AUTHORIZED", "ARG_COUNTRY", "ARG_INPUT_POINT", "ARG_SHOW_LOCATION_BUTTON", "CONTENT_FADE_DURATION_MILLIS", "", "GENERAL_DURATION_MILLIS", "TAG", "getTAG", "()Ljava/lang/String;", "createNavigationEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "inputPoint", "Landroid/graphics/Point;", "countryName", "authorized", "", "allowUnregulated", "allowRestricted", "showLocationButton", "core_release"})
    /* compiled from: CountrySearchFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return d.TAG;
        }

        public final com.iqoption.core.ui.d.c a(Point point, String str, boolean z, boolean z2, boolean z3, boolean z4) {
            Point point2 = point;
            String str2 = str;
            kotlin.jvm.internal.i.f(point2, "inputPoint");
            kotlin.jvm.internal.i.f(str2, "countryName");
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_INPUT_POINT", point2);
            bundle.putBoolean("ARG_ALLOW_UNREGULATED", z2);
            bundle.putBoolean("ARG_ALLOW_RESTRICTED", z3);
            bundle.putBoolean("ARG_SHOW_LOCATION_BUTTON", z4);
            bundle.putString("ARG_COUNTRY", str2);
            bundle.putBoolean("ARG_AUTHORIZED", z);
            return new com.iqoption.core.ui.d.c(Bx(), d.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$doOnPreDrawSkip$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b implements OnPreDrawListener {
        final /* synthetic */ View bIm;
        final /* synthetic */ FrameLayout bIn;
        final /* synthetic */ RecyclerView bIo;
        final /* synthetic */ d this$0;

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, bng = {"<anonymous>", "", "run", "com/iqoption/core/ui/country/CountrySearchFragment$animateShow$2$1"})
        /* compiled from: CountrySearchFragment.kt */
        static final class a implements Runnable {
            final /* synthetic */ b bIp;

            a(b bVar) {
                this.bIp = bVar;
            }

            public final void run() {
                if (this.bIp.this$0.isAdded()) {
                    this.bIp.bIo.animate().setDuration(100).alpha(1.0f);
                    v.b(this.bIp.this$0.getContext(), this.bIp.this$0.ald().bfm);
                }
            }
        }

        public b(View view, d dVar, FrameLayout frameLayout, RecyclerView recyclerView) {
            this.bIm = view;
            this.this$0 = dVar;
            this.bIn = frameLayout;
            this.bIo = recyclerView;
        }

        public boolean onPreDraw() {
            this.bIm.getViewTreeObserver().removeOnPreDrawListener(this);
            this.bIn.setTranslationY(this.this$0.aln());
            this.bIn.animate().setInterpolator(com.iqoption.core.graphics.animation.j.XJ()).setDuration(400).translationY(0.0f).withEndAction(new a(this));
            return false;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: CountrySearchFragment.kt */
    static final class c implements Runnable {
        final /* synthetic */ View bIq;

        c(View view) {
            this.bIq = view;
        }

        public final void run() {
            com.iqoption.core.ext.a.al(this.bIq);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$doOnLayout$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class d implements OnGlobalLayoutListener {
        final /* synthetic */ View bgH;
        final /* synthetic */ d this$0;

        public d(View view, d dVar) {
            this.bgH = view;
            this.this$0 = dVar;
        }

        public void onGlobalLayout() {
            this.bgH.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.this$0.alm();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: CountrySearchFragment.kt */
    static final class e implements Runnable {
        final /* synthetic */ d this$0;

        e(d dVar) {
            this.this$0 = dVar;
        }

        public final void run() {
            if (this.this$0.isAdded()) {
                this.this$0.back();
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$doOnPreDrawSkip$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class h implements OnPreDrawListener {
        final /* synthetic */ View bIm;
        final /* synthetic */ d this$0;

        public h(View view, d dVar) {
            this.bIm = view;
            this.this$0 = dVar;
        }

        public boolean onPreDraw() {
            this.bIm.getViewTreeObserver().removeOnPreDrawListener(this);
            this.this$0.ald().bfm.requestFocus();
            this.this$0.ald().bfm.jumpDrawablesToCurrentState();
            return false;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "countries", "", "Lcom/iqoption/core/microservices/configuration/response/Country;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: CountrySearchFragment.kt */
    static final class f<T> implements io.reactivex.b.f<List<? extends com.iqoption.core.microservices.configuration.a.c>> {
        final /* synthetic */ d this$0;

        f(d dVar) {
            this.this$0 = dVar;
        }

        /* renamed from: v */
        public final void accept(List<com.iqoption.core.microservices.configuration.a.c> list) {
            a e = this.this$0.ale();
            kotlin.jvm.internal.i.e(list, "countries");
            Iterable<com.iqoption.core.microservices.configuration.a.c> iterable = list;
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            for (com.iqoption.core.microservices.configuration.a.c cVar : iterable) {
                arrayList.add(new c(cVar));
            }
            com.iqoption.core.ui.widget.recyclerview.adapter.a.a(e, (List) arrayList, null, 2, null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: CountrySearchFragment.kt */
    static final class g<T> implements io.reactivex.b.f<Throwable> {
        public static final g bIr = new g();

        g() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class i extends com.iqoption.core.ext.g {
        final /* synthetic */ d this$0;

        public i(d dVar) {
            this.this$0 = dVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.all();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class j extends com.iqoption.core.ext.g {
        final /* synthetic */ d this$0;

        @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "it", "Lcom/google/common/base/Optional;", "Lcom/iqoption/core/microservices/configuration/response/Country;", "kotlin.jvm.PlatformType", "onChanged", "com/iqoption/core/ui/country/CountrySearchFragment$onViewCreated$2$1"})
        /* compiled from: CountrySearchFragment.kt */
        static final class a<T> implements Observer<Optional<com.iqoption.core.microservices.configuration.a.c>> {
            final /* synthetic */ j bIs;

            a(j jVar) {
                this.bIs = jVar;
            }

            /* renamed from: a */
            public final void onChanged(Optional<com.iqoption.core.microservices.configuration.a.c> optional) {
                com.iqoption.core.microservices.configuration.a.c cVar = optional != null ? (com.iqoption.core.microservices.configuration.a.c) optional.pN() : null;
                if (cVar != null) {
                    this.bIs.this$0.c(cVar);
                }
            }
        }

        public j(d dVar) {
            this.this$0 = dVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            d.b(this.this$0).cE(this.this$0.alg()).observe(this.this$0, new a(this));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/core/ui/country/CountrySearchFragment$onViewCreated$4", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "core_release"})
    /* compiled from: CountrySearchFragment.kt */
    public static final class k extends ah {
        final /* synthetic */ d this$0;

        k(d dVar) {
            this.this$0 = dVar;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            super.afterTextChanged(editable);
            this.this$0.hh(editable.toString());
        }
    }

    private final void a(com.iqoption.core.a.d dVar) {
        this.bIb.a(this, anY[0], dVar);
    }

    private final void a(a aVar) {
        this.bIc.a(this, anY[1], aVar);
    }

    private final com.iqoption.core.a.d ald() {
        return (com.iqoption.core.a.d) this.bIb.b(this, anY[0]);
    }

    private final a ale() {
        return (a) this.bIc.b(this, anY[1]);
    }

    private final Point alf() {
        kotlin.d dVar = this.bId;
        kotlin.reflect.j jVar = anY[2];
        return (Point) dVar.getValue();
    }

    private final boolean alg() {
        kotlin.d dVar = this.bIf;
        kotlin.reflect.j jVar = anY[4];
        return ((Boolean) dVar.getValue()).booleanValue();
    }

    private final boolean alh() {
        kotlin.d dVar = this.bIg;
        kotlin.reflect.j jVar = anY[5];
        return ((Boolean) dVar.getValue()).booleanValue();
    }

    private final boolean ali() {
        kotlin.d dVar = this.bIh;
        kotlin.reflect.j jVar = anY[6];
        return ((Boolean) dVar.getValue()).booleanValue();
    }

    private final boolean alj() {
        kotlin.d dVar = this.bIi;
        kotlin.reflect.j jVar = anY[7];
        return ((Boolean) dVar.getValue()).booleanValue();
    }

    private final String getCountryName() {
        kotlin.d dVar = this.bIe;
        kotlin.reflect.j jVar = anY[3];
        return (String) dVar.getValue();
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

    public static final /* synthetic */ e b(d dVar) {
        e eVar = dVar.bIa;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return eVar;
    }

    static {
        String name = d.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public final void a(i iVar) {
        this.bIk = iVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.bIa = e.bIu.z(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        a((com.iqoption.core.a.d) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.core.i.h.fragment_search_country, viewGroup, false, 4, null));
        return ald().getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        ImageView imageView;
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        String str = "binding.countryLocationButton";
        if (alj()) {
            imageView = ald().bfp;
            kotlin.jvm.internal.i.e(imageView, str);
            com.iqoption.core.ext.a.ak(imageView);
        } else {
            imageView = ald().bfp;
            kotlin.jvm.internal.i.e(imageView, str);
            com.iqoption.core.ext.a.al(imageView);
        }
        ald().bfm.setTextSize(0, getResources().getDimension(alg() ? com.iqoption.core.i.d.sp14 : com.iqoption.core.i.d.sp16));
        String str2 = "binding.countrySuggestList";
        if (!alg()) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(com.iqoption.core.i.d.registration_horizontal_inset);
            LinearLayout linearLayout = ald().bfu;
            kotlin.jvm.internal.i.e(linearLayout, "binding.searchCountryToolbar");
            com.iqoption.core.ext.a.al(linearLayout);
            FrameLayout frameLayout = ald().bfo;
            String str3 = "binding.countryInputContainer";
            kotlin.jvm.internal.i.e(frameLayout, str3);
            LayoutParams layoutParams = frameLayout.getLayoutParams();
            String str4 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(dimensionPixelOffset);
                marginLayoutParams.setMarginEnd(dimensionPixelOffset);
                FrameLayout frameLayout2 = ald().bfo;
                kotlin.jvm.internal.i.e(frameLayout2, str3);
                frameLayout2.setLayoutParams(marginLayoutParams);
                RecyclerView recyclerView = ald().bfq;
                kotlin.jvm.internal.i.e(recyclerView, str2);
                layoutParams = recyclerView.getLayoutParams();
                if (layoutParams != null) {
                    marginLayoutParams = (MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginStart(dimensionPixelOffset);
                    marginLayoutParams.setMarginEnd(dimensionPixelOffset);
                    RecyclerView recyclerView2 = ald().bfq;
                    kotlin.jvm.internal.i.e(recyclerView2, str2);
                    recyclerView2.setLayoutParams(marginLayoutParams);
                } else {
                    throw new TypeCastException(str4);
                }
            }
            throw new TypeCastException(str4);
        }
        imageView = ald().bfr;
        kotlin.jvm.internal.i.e(imageView, "binding.searchCountryClose");
        imageView.setOnClickListener(new i(this));
        imageView = ald().bfp;
        kotlin.jvm.internal.i.e(imageView, str);
        imageView.setOnClickListener(new j(this));
        String countryName = getCountryName();
        kotlin.jvm.internal.i.e(countryName, "countryName");
        if ((((CharSequence) countryName).length() > 0 ? 1 : null) != null) {
            TextInputLayout textInputLayout = ald().bfn;
            String str5 = "binding.countryInput";
            kotlin.jvm.internal.i.e(textInputLayout, str5);
            textInputLayout.setHintAnimationEnabled(false);
            ald().bfm.setText(getCountryName());
            ald().bfm.setSelection(getCountryName().length());
            textInputLayout = ald().bfn;
            kotlin.jvm.internal.i.e(textInputLayout, str5);
            textInputLayout.setHintAnimationEnabled(true);
        }
        view.getViewTreeObserver().addOnPreDrawListener(new h(view, this));
        RecyclerView recyclerView3 = ald().bfq;
        kotlin.jvm.internal.i.e(recyclerView3, str2);
        recyclerView3.setLayoutManager(new LinearLayoutManager(com.iqoption.core.ext.a.q(this)));
        a(new a(this));
        recyclerView3.setAdapter(ale());
        ald().bfm.addTextChangedListener(new k(this));
        if (bundle == null) {
            alk();
        }
        a(this, null, 1, null);
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        all();
        return true;
    }

    static /* synthetic */ void a(d dVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = (String) null;
        }
        dVar.hh(str);
    }

    private final void hh(String str) {
        e eVar = this.bIa;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        eVar.a(alg(), str, alh(), ali()).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new f(this), (io.reactivex.b.f) g.bIr);
    }

    public void c(com.iqoption.core.microservices.configuration.a.c cVar) {
        kotlin.jvm.internal.i.f(cVar, "country");
        ald().bfm.setText(cVar.getName());
        this.bIj = cVar;
        all();
    }

    private final void alk() {
        if (alg()) {
            TextView textView = ald().bft;
            kotlin.jvm.internal.i.e(textView, "binding.searchCountryTitle");
            textView.setAlpha(0.0f);
            ald().bft.animate().setDuration(400).alpha(1.0f);
        }
        View alo = alo();
        if (alo != null) {
            if (alg()) {
                com.iqoption.core.ext.a.al(alo);
            } else {
                com.iqoption.core.ext.a.ak(alo);
                alo.animate().setDuration(400).alpha(0.0f).withEndAction(new c(alo));
            }
        }
        FrameLayout frameLayout = ald().bfo;
        kotlin.jvm.internal.i.e(frameLayout, "binding.countryInputContainer");
        RecyclerView recyclerView = ald().bfq;
        kotlin.jvm.internal.i.e(recyclerView, "binding.countrySuggestList");
        recyclerView.setAlpha(0.0f);
        View view = frameLayout;
        view.getViewTreeObserver().addOnPreDrawListener(new b(view, this, frameLayout, recyclerView));
        alo = ald().bfk;
        kotlin.jvm.internal.i.e(alo, "binding.countryBackground");
        alo.setAlpha(0.0f);
        ald().bfk.animate().setDuration(400).alpha(1.0f);
    }

    private final void all() {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof com.iqoption.core.ui.a.a)) {
            activity = null;
        }
        com.iqoption.core.ui.a.a aVar = (com.iqoption.core.ui.a.a) activity;
        if (aVar == null || !aVar.akX()) {
            alm();
            return;
        }
        v.j(com.iqoption.core.ext.a.r(this));
        View view = getView();
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new d(view, this));
        }
    }

    private final void alm() {
        ald().bfm.clearFocus();
        if (alg()) {
            ald().bft.animate().setDuration(400).alpha(0.0f);
        }
        View alo = alo();
        if (!(alg() || alo == null)) {
            alo.setAlpha(0.0f);
            com.iqoption.core.ext.a.ak(alo);
            alo.animate().setDuration(400).alpha(1.0f);
        }
        ald().bfq.animate().setDuration(100).alpha(0.0f);
        ald().bfo.animate().setInterpolator(com.iqoption.core.graphics.animation.j.XJ()).setDuration(400).translationY(aln()).withEndAction(new e(this));
        ald().bfk.animate().setDuration(400).alpha(0.0f);
    }

    public void back() {
        i iVar = this.bIk;
        if (iVar == null) {
            Fragment parentFragment = getParentFragment();
            if (!(parentFragment instanceof i)) {
                parentFragment = null;
            }
            iVar = (i) parentFragment;
        }
        if (iVar != null) {
            iVar.f(this.bIj);
        }
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            kotlin.jvm.internal.i.e(fragmentManager, "it");
            if (!fragmentManager.isStateSaved()) {
                fragmentManager.popBackStack();
            }
        }
    }

    private final float aln() {
        float f = (float) alf().y;
        FrameLayout frameLayout = ald().bfo;
        kotlin.jvm.internal.i.e(frameLayout, "binding.countryInputContainer");
        return f - ((float) com.iqoption.core.ext.a.ai(frameLayout).y);
    }

    private final View alo() {
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof g)) {
            parentFragment = null;
        }
        g gVar = (g) parentFragment;
        return gVar != null ? gVar.alo() : null;
    }
}
