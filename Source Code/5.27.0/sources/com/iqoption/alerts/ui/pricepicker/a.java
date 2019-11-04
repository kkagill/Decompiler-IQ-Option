package com.iqoption.alerts.ui.pricepicker;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.Observer;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.ui.widget.clippinglayout.ClipConstrainedLayout;
import com.iqoption.core.util.AnalyticsLifecycleObserver;
import com.iqoption.core.util.ah;
import java.util.HashMap;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0014J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, bng = {"Lcom/iqoption/alerts/ui/pricepicker/AlertsPricePickerFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "assetId", "", "getAssetId", "()I", "contentPositionController", "Lcom/iqoption/alerts/util/MarginPositionController;", "getContentPositionController", "()Lcom/iqoption/alerts/util/MarginPositionController;", "contentPositionController$delegate", "Lkotlin/Lazy;", "instrumentType", "", "getInstrumentType", "()Ljava/lang/String;", "viewModel", "Lcom/iqoption/alerts/ui/pricepicker/AlertsPricePickerViewModel;", "getViewModel", "()Lcom/iqoption/alerts/ui/pricepicker/AlertsPricePickerViewModel;", "viewModel$delegate", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "Companion", "alerts_release"})
/* compiled from: AlertsPricePickerFragment.kt */
public final class a extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    static final /* synthetic */ kotlin.reflect.j[] anY = new kotlin.reflect.j[]{k.a(new PropertyReference1Impl(k.G(a.class), "contentPositionController", "getContentPositionController()Lcom/iqoption/alerts/util/MarginPositionController;")), k.a(new PropertyReference1Impl(k.G(a.class), "viewModel", "getViewModel()Lcom/iqoption/alerts/ui/pricepicker/AlertsPricePickerViewModel;"))};
    public static final a aqj = new a();
    private final kotlin.d apR = g.c(new AlertsPricePickerFragment$contentPositionController$2(this));
    private final kotlin.d apS = g.c(new AlertsPricePickerFragment$viewModel$2(this));
    private HashMap apm;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, bng = {"Lcom/iqoption/alerts/ui/pricepicker/AlertsPricePickerFragment$Companion;", "", "()V", "ARG_ASSET_ID", "", "ARG_INSTRUMENT_TYPE", "TAG", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/iqoption/alerts/ui/pricepicker/AlertsPricePickerFragment;", "margins", "Landroid/graphics/Rect;", "gravity", "", "animPivot", "assetId", "instrumentType", "alerts_release"})
    /* compiled from: AlertsPricePickerFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return a.TAG;
        }

        public final a a(Rect rect, int i, int i2, int i3, String str) {
            kotlin.jvm.internal.i.f(rect, "margins");
            a aVar = new a();
            Bundle a = com.iqoption.alerts.util.b.aqu.a(rect, i, i2);
            a.putInt("arg.assetId", i3);
            a.putString("arg.instrumentType", str);
            aVar.setArguments(a);
            return aVar;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/view/MotionEvent;", "onTouch"})
    /* compiled from: AlertsPricePickerFragment.kt */
    static final class j implements OnTouchListener {
        public static final j aqm = new j();

        j() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/alerts/ui/pricepicker/AlertsPricePickerFragment$onCreateView$1$5", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "alerts_release"})
    /* compiled from: AlertsPricePickerFragment.kt */
    public static final class b extends ah {
        final /* synthetic */ a this$0;

        b(a aVar) {
            this.this$0 = aVar;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            this.this$0.BE().dh(editable.toString());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, bng = {"<anonymous>", "", "keycode", "", "onKeyPressed", "com/iqoption/alerts/ui/pricepicker/AlertsPricePickerFragment$onCreateView$1$6"})
    /* compiled from: AlertsPricePickerFragment.kt */
    static final class c implements com.iqoption.widget.numpad.NumPad.b {
        final /* synthetic */ com.iqoption.alerts.a.k aqk;
        final /* synthetic */ a this$0;

        c(com.iqoption.alerts.a.k kVar, a aVar) {
            this.aqk = kVar;
            this.this$0 = aVar;
        }

        public final void onKeyPressed(int i) {
            this.aqk.aoI.dispatchKeyEvent(new KeyEvent(0, i));
            this.aqk.aoI.dispatchKeyEvent(new KeyEvent(1, i));
            this.this$0.BE().dF(i);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/alerts/ui/pricepicker/AlertsPricePickerFragment$onCreateView$1$clickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "alerts_release"})
    /* compiled from: AlertsPricePickerFragment.kt */
    public static final class d extends com.iqoption.core.ext.g {
        final /* synthetic */ a this$0;

        d(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            int id = view.getId();
            if (id == com.iqoption.alerts.b.d.everything) {
                FragmentActivity activity = this.this$0.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
            } else if (id == com.iqoption.alerts.b.d.btnReset) {
                this.this$0.BE().BM();
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "<anonymous parameter 1>", "", "onPerform", "com/iqoption/alerts/ui/pricepicker/AlertsPricePickerFragment$onCreateView$1$7$1", "com/iqoption/alerts/ui/pricepicker/AlertsPricePickerFragment$$special$$inlined$apply$lambda$1"})
    /* compiled from: AlertsPricePickerFragment.kt */
    static final class e implements com.iqoption.core.ui.widget.e.a.b {
        final /* synthetic */ a this$0;

        e(a aVar) {
            this.this$0 = aVar;
        }

        public final void onPerform(View view, boolean z) {
            kotlin.jvm.internal.i.f(view, "<anonymous parameter 0>");
            this.this$0.BE().BK();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "<anonymous parameter 1>", "", "onPerform", "com/iqoption/alerts/ui/pricepicker/AlertsPricePickerFragment$onCreateView$1$8$1", "com/iqoption/alerts/ui/pricepicker/AlertsPricePickerFragment$$special$$inlined$apply$lambda$2"})
    /* compiled from: AlertsPricePickerFragment.kt */
    static final class f implements com.iqoption.core.ui.widget.e.a.b {
        final /* synthetic */ a this$0;

        f(a aVar) {
            this.this$0 = aVar;
        }

        public final void onPerform(View view, boolean z) {
            kotlin.jvm.internal.i.f(view, "<anonymous parameter 0>");
            this.this$0.BE().BL();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "price", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: AlertsPricePickerFragment.kt */
    static final class g<T> implements Observer<String> {
        final /* synthetic */ com.iqoption.alerts.a.k aqk;

        g(com.iqoption.alerts.a.k kVar) {
            this.aqk = kVar;
        }

        /* renamed from: dg */
        public final void onChanged(String str) {
            if (str != null) {
                this.aqk.aoI.setText(str);
                this.aqk.aoI.setSelection(this.aqk.aoI.length());
                this.aqk.aoI.requestFocus();
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "precision", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"})
    /* compiled from: AlertsPricePickerFragment.kt */
    static final class h<T> implements Observer<Integer> {
        final /* synthetic */ com.iqoption.alerts.a.k aqk;

        h(com.iqoption.alerts.a.k kVar) {
            this.aqk = kVar;
        }

        /* renamed from: b */
        public final void onChanged(Integer num) {
            if (num != null) {
                EditText editText = this.aqk.aoI;
                kotlin.jvm.internal.i.e(editText, ConditionalUserProperty.VALUE);
                editText.setFilters(new InputFilter[]{new com.iqoption.core.ui.widget.f.a(num.intValue())});
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, bng = {"com/iqoption/alerts/ui/pricepicker/AlertsPricePickerFragment$onCreateView$1$3", "Landroidx/lifecycle/Observer;", "", "isFirstTime", "()Z", "setFirstTime", "(Z)V", "transition", "Landroidx/transition/AutoTransition;", "getTransition", "()Landroidx/transition/AutoTransition;", "onChanged", "", "isShown", "(Ljava/lang/Boolean;)V", "alerts_release"})
    /* compiled from: AlertsPricePickerFragment.kt */
    public static final class i implements Observer<Boolean> {
        private boolean apu = true;
        final /* synthetic */ com.iqoption.alerts.a.k aqk;
        private final AutoTransition aql;

        i(com.iqoption.alerts.a.k kVar) {
            this.aqk = kVar;
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setOrdering(0);
            autoTransition.setDuration(200);
            this.aql = autoTransition;
        }

        /* renamed from: f */
        public void onChanged(Boolean bool) {
            if (this.apu) {
                this.apu = false;
            } else {
                TransitionManager.beginDelayedTransition(this.aqk.aoE, this.aql);
            }
            String str = "current";
            String str2 = "btnReset";
            ImageView imageView;
            TextView textView;
            if (kotlin.jvm.internal.i.y(bool, Boolean.valueOf(true))) {
                imageView = this.aqk.aoD;
                kotlin.jvm.internal.i.e(imageView, str2);
                com.iqoption.core.ext.a.ak(imageView);
                textView = this.aqk.aoF;
                kotlin.jvm.internal.i.e(textView, str);
                com.iqoption.core.ext.a.al(textView);
                return;
            }
            imageView = this.aqk.aoD;
            kotlin.jvm.internal.i.e(imageView, str2);
            com.iqoption.core.ext.a.al(imageView);
            textView = this.aqk.aoF;
            kotlin.jvm.internal.i.e(textView, str);
            com.iqoption.core.ext.a.ak(textView);
        }
    }

    private final com.iqoption.alerts.util.b BD() {
        kotlin.d dVar = this.apR;
        kotlin.reflect.j jVar = anY[0];
        return (com.iqoption.alerts.util.b) dVar.getValue();
    }

    private final b BE() {
        kotlin.d dVar = this.apS;
        kotlin.reflect.j jVar = anY[1];
        return (b) dVar.getValue();
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

    private final int Bs() {
        return com.iqoption.core.ext.a.s(this).getInt("arg.assetId");
    }

    private final String getInstrumentType() {
        return com.iqoption.core.ext.a.s(this).getString("arg.instrumentType");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        BE().dD(Bs());
        BE().df(getInstrumentType());
        com.iqoption.alerts.a.k kVar = (com.iqoption.alerts.a.k) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.alerts.b.e.alerts_price_picker_fragment, viewGroup, false, 4, null);
        a(BE().BH(), new g(kVar));
        a(BE().BI(), new h(kVar));
        a(BE().BJ(), new i(kVar));
        com.iqoption.alerts.util.b BD = BD();
        ClipConstrainedLayout clipConstrainedLayout = kVar.aoE;
        kotlin.jvm.internal.i.e(clipConstrainedLayout, "content");
        BD.O(clipConstrainedLayout);
        kVar.aoI.setOnTouchListener(j.aqm);
        kVar.aoI.addTextChangedListener(new b(this));
        kVar.aoH.setKeyListener(new c(kVar, this));
        OnClickListener dVar = new d(this);
        kVar.aoG.setOnClickListener(dVar);
        kVar.aoD.setOnClickListener(dVar);
        new com.iqoption.core.ui.widget.e.a(kVar.aoC).a((com.iqoption.core.ui.widget.e.a.b) new e(this));
        new com.iqoption.core.ui.widget.e.a(kVar.aoB).a((com.iqoption.core.ui.widget.e.a.b) new f(this));
        return kVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        a((LifecycleObserver) new AlertsPricePickerFragment$onViewCreated$1(this));
        com.iqoption.core.analytics.b dl = com.iqoption.core.d.EC().dl("alerts_create-price-change-show");
        dl.f("asset_id", Integer.valueOf(Bs()));
        dl.f("instrument_type", getInstrumentType());
        kotlin.jvm.internal.i.e(dl, "event");
        a((LifecycleObserver) new AnalyticsLifecycleObserver(dl, null, 2, null));
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.core.ui.animation.transitions.e Bv() {
        return BD().b(this);
    }

    static {
        String name = a.class.getName();
        kotlin.jvm.internal.i.e(name, "AlertsPricePickerFragment::class.java.name");
        TAG = name;
    }
}
