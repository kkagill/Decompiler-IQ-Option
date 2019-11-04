package com.iqoption.charttools.e;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.core.data.model.chart.ChartColor;
import com.iqoption.core.data.model.chart.ChartType;
import com.iqoption.core.util.ah;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.TypeCastException;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001cH\u0002J\u001f\u0010\u001d\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00130\u001e2\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0002\u0010 J3\u0010!\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00130\u001e2\u0006\u0010\"\u001a\u00020\b2\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u001e\"\u00020\u0013H\u0002¢\u0006\u0002\u0010$R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, bng = {"Lcom/iqoption/charttools/templates/TemplateFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "inputData", "Lcom/iqoption/charttools/templates/TemplateInputData;", "getInputData", "()Lcom/iqoption/charttools/templates/TemplateInputData;", "isCustomTransitionsEnabled", "", "()Z", "navigator", "Lcom/iqoption/core/ui/navigation/ParcelableNavigator;", "getNavigator", "()Lcom/iqoption/core/ui/navigation/ParcelableNavigator;", "templateViewModel", "Lcom/iqoption/charttools/templates/TemplateViewModel;", "transition", "Landroidx/transition/AutoTransition;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "observeTemplateContent", "", "Lcom/iqoption/charttools/databinding/FragmentTemplateBinding;", "setWidgetsShown", "", "shown", "([Landroid/view/View;Z)V", "showWidgets", "goneOthers", "widgetsToShow", "([Landroid/view/View;Z[Landroid/view/View;)V", "Companion", "techtools_release"})
/* compiled from: TemplateFragment.kt */
public final class j extends com.iqoption.core.ui.fragment.d {
    public static final String TAG = j.class.getName();
    public static final a aKq = new a();
    private p aKp;
    private HashMap apm;
    private final AutoTransition aql;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rJ\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/charttools/templates/TemplateFragment$Companion;", "", "()V", "ARG_INPUT_DATA", "", "ARG_NAVIGATOR", "TAG", "kotlin.jvm.PlatformType", "makeArgs", "Landroid/os/Bundle;", "inputData", "Lcom/iqoption/charttools/templates/TemplateInputData;", "navigator", "Lcom/iqoption/core/ui/navigation/ParcelableNavigator;", "tabId", "config", "Lcom/iqoption/charttools/model/chart/ChartConfig;", "templateId", "", "techtools_release"})
    /* compiled from: TemplateFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final Bundle e(String str, long j) {
            kotlin.jvm.internal.i.f(str, "tabId");
            return a(this, new m(str, Long.valueOf(j)), null, 2, null);
        }

        public final Bundle a(String str, com.iqoption.charttools.model.a.a aVar) {
            kotlin.jvm.internal.i.f(str, "tabId");
            kotlin.jvm.internal.i.f(aVar, "config");
            return a(this, new m(str, aVar), null, 2, null);
        }

        public static /* synthetic */ Bundle a(a aVar, m mVar, com.iqoption.core.ui.d.d dVar, int i, Object obj) {
            if ((i & 2) != 0) {
                dVar = (com.iqoption.core.ui.d.d) null;
            }
            return aVar.a(mVar, dVar);
        }

        public final Bundle a(m mVar, com.iqoption.core.ui.d.d dVar) {
            kotlin.jvm.internal.i.f(mVar, "inputData");
            Bundle bundle = new Bundle();
            bundle.putParcelable("arg.inputData", mVar);
            bundle.putParcelable("arg.navigator", dVar);
            return bundle;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "switcher", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged", "com/iqoption/charttools/templates/TemplateFragment$onCreateView$1$onSwitchCheckChangeListener$1"})
    /* compiled from: TemplateFragment.kt */
    static final class q implements OnCheckedChangeListener {
        final /* synthetic */ j aKt;

        q(j jVar) {
            this.aKt = jVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            kotlin.jvm.internal.i.e(compoundButton, "switcher");
            int id = compoundButton.getId();
            if (id == com.iqoption.charttools.n.g.switchChartSettings) {
                j.a(this.aKt).bW(z);
            } else if (id == com.iqoption.charttools.n.g.switchHeikenAshi) {
                j.a(this.aKt).bY(z);
            } else if (id == com.iqoption.charttools.n.g.switchAutoScale) {
                j.a(this.aKt).bX(z);
            } else if (id == com.iqoption.charttools.n.g.switchTradersMood) {
                j.a(this.aKt).setTradersMoodEnabled(z);
            } else if (id == com.iqoption.charttools.n.g.switchLiveDeals) {
                j.a(this.aKt).setLiveDealsEnabled(z);
            } else if (id == com.iqoption.charttools.n.g.switchVolume) {
                j.a(this.aKt).bK(z);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "items", "", "Lcom/iqoption/charttools/templates/InstrumentAdapterItem;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: TemplateFragment.kt */
    static final class b<T> implements Observer<List<? extends d>> {
        final /* synthetic */ e aKr;

        b(e eVar) {
            this.aKr = eVar;
        }

        /* renamed from: u */
        public final void onChanged(List<? extends d> list) {
            if (list != null) {
                this.aKr.aG(list);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: TemplateFragment.kt */
    static final class c<T> implements Observer<Boolean> {
        final /* synthetic */ com.iqoption.charttools.b.d aKs;

        c(com.iqoption.charttools.b.d dVar) {
            this.aKs = dVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (bool != null) {
                SwitchCompat switchCompat = this.aKs.aIl;
                String str = "switchTradersMood";
                kotlin.jvm.internal.i.e(switchCompat, str);
                if ((kotlin.jvm.internal.i.y(Boolean.valueOf(switchCompat.isChecked()), bool) ^ 1) != 0) {
                    switchCompat = this.aKs.aIl;
                    kotlin.jvm.internal.i.e(switchCompat, str);
                    switchCompat.setChecked(bool.booleanValue());
                }
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: TemplateFragment.kt */
    static final class d<T> implements Observer<Boolean> {
        final /* synthetic */ com.iqoption.charttools.b.d aKs;

        d(com.iqoption.charttools.b.d dVar) {
            this.aKs = dVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (bool != null) {
                SwitchCompat switchCompat = this.aKs.aIk;
                String str = "switchLiveDeals";
                kotlin.jvm.internal.i.e(switchCompat, str);
                if ((kotlin.jvm.internal.i.y(Boolean.valueOf(switchCompat.isChecked()), bool) ^ 1) != 0) {
                    switchCompat = this.aKs.aIk;
                    kotlin.jvm.internal.i.e(switchCompat, str);
                    switchCompat.setChecked(bool.booleanValue());
                }
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: TemplateFragment.kt */
    static final class e<T> implements Observer<Boolean> {
        final /* synthetic */ com.iqoption.charttools.b.d aKs;

        e(com.iqoption.charttools.b.d dVar) {
            this.aKs = dVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (bool != null) {
                SwitchCompat switchCompat = this.aKs.aIm;
                String str = "switchVolume";
                kotlin.jvm.internal.i.e(switchCompat, str);
                if ((kotlin.jvm.internal.i.y(Boolean.valueOf(switchCompat.isChecked()), bool) ^ 1) != 0) {
                    switchCompat = this.aKs.aIm;
                    kotlin.jvm.internal.i.e(switchCompat, str);
                    switchCompat.setChecked(bool.booleanValue());
                }
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "output", "Lcom/iqoption/charttools/model/indicator/ChartIndicator;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: TemplateFragment.kt */
    static final class f<T> implements Observer<com.iqoption.charttools.model.indicator.h> {
        final /* synthetic */ j aKt;

        f(j jVar) {
            this.aKt = jVar;
        }

        /* renamed from: i */
        public final void onChanged(com.iqoption.charttools.model.indicator.h hVar) {
            if (hVar != null) {
                j.a(this.aKt).j(hVar);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "isShow", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: TemplateFragment.kt */
    static final class g<T> implements Observer<Boolean> {
        final /* synthetic */ com.iqoption.charttools.b.d aKs;

        g(com.iqoption.charttools.b.d dVar) {
            this.aKs = dVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (bool != null) {
                String str = "linesSnippet";
                TextView textView;
                if (bool.booleanValue()) {
                    textView = this.aKs.aIe;
                    kotlin.jvm.internal.i.e(textView, str);
                    com.iqoption.core.ext.a.ak(textView);
                    return;
                }
                textView = this.aKs.aIe;
                kotlin.jvm.internal.i.e(textView, str);
                com.iqoption.core.ext.a.al(textView);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "isEnabled", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: TemplateFragment.kt */
    static final class h<T> implements Observer<Boolean> {
        final /* synthetic */ com.iqoption.charttools.b.d aKs;

        h(com.iqoption.charttools.b.d dVar) {
            this.aKs = dVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (bool != null) {
                FrameLayout frameLayout = this.aKs.aHU;
                kotlin.jvm.internal.i.e(frameLayout, "btnSave");
                frameLayout.setEnabled(bool.booleanValue());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005R\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, bng = {"com/iqoption/charttools/templates/TemplateFragment$observeTemplateContent$4", "Landroidx/lifecycle/Observer;", "", "isPortrait", "", "()Z", "widgets", "", "Landroid/view/View;", "getWidgets", "()[Landroid/view/View;", "[Landroid/view/View;", "onChanged", "", "mode", "(Ljava/lang/Integer;)V", "techtools_release"})
    /* compiled from: TemplateFragment.kt */
    public static final class i implements Observer<Integer> {
        final /* synthetic */ com.iqoption.charttools.b.d aKs;
        final /* synthetic */ j aKt;
        private final View[] aKu;
        private final boolean isPortrait;

        i(j jVar, com.iqoption.charttools.b.d dVar) {
            this.aKt = jVar;
            this.aKs = dVar;
            Resources resources = jVar.getResources();
            kotlin.jvm.internal.i.e(resources, "resources");
            this.isPortrait = resources.getConfiguration().orientation == 1;
            this.aKu = this.isPortrait ? new View[]{this.aKs.aHT, this.aKs.aHS, this.aKs.aHR, this.aKs.aIf} : new View[]{this.aKs.aHU, this.aKs.aHT, this.aKs.aHS, this.aKs.aHR, this.aKs.aIf};
        }

        /* renamed from: b */
        public void onChanged(Integer num) {
            View view = this.aKs.aIp;
            if (view != null) {
                TransitionManager.beginDelayedTransition((ViewGroup) view, this.aKt.aql);
                String str = "btnSave";
                j jVar;
                View[] viewArr;
                boolean z;
                View[] viewArr2;
                View[] viewArr3;
                if (num != null && num.intValue() == 1) {
                    jVar = this.aKt;
                    viewArr = this.aKu;
                    z = this.isPortrait;
                    viewArr2 = new View[1];
                    FrameLayout frameLayout = this.aKs.aHU;
                    kotlin.jvm.internal.i.e(frameLayout, str);
                    viewArr2[0] = frameLayout;
                    jVar.a(viewArr, z, viewArr2);
                    return;
                } else if (num != null && num.intValue() == 2) {
                    jVar = this.aKt;
                    View[] viewArr4 = this.aKu;
                    boolean z2 = this.isPortrait;
                    viewArr = new View[2];
                    View view2 = this.aKs.aHT;
                    kotlin.jvm.internal.i.e(view2, "btnDelete");
                    viewArr[0] = view2;
                    FrameLayout frameLayout2 = this.aKs.aHU;
                    kotlin.jvm.internal.i.e(frameLayout2, str);
                    viewArr[1] = frameLayout2;
                    jVar.a(viewArr4, z2, viewArr);
                    return;
                } else if (num != null && num.intValue() == 3) {
                    jVar = this.aKt;
                    viewArr3 = this.aKu;
                    z = this.isPortrait;
                    viewArr = new View[2];
                    View view3 = this.aKs.aHS;
                    kotlin.jvm.internal.i.e(view3, "btnConfirm");
                    viewArr[0] = view3;
                    View view4 = this.aKs.aHR;
                    kotlin.jvm.internal.i.e(view4, "btnCancel");
                    viewArr[1] = view4;
                    jVar.a(viewArr3, z, viewArr);
                    return;
                } else if (num != null && num.intValue() == 4) {
                    jVar = this.aKt;
                    viewArr3 = this.aKu;
                    boolean z3 = this.isPortrait;
                    viewArr2 = new View[1];
                    ProgressBar progressBar = this.aKs.aIf;
                    kotlin.jvm.internal.i.e(progressBar, "progressDelete");
                    viewArr2[0] = progressBar;
                    jVar.a(viewArr3, z3, viewArr2);
                    return;
                } else {
                    return;
                }
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "showProgress", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: TemplateFragment.kt */
    static final class j<T> implements Observer<Boolean> {
        final /* synthetic */ com.iqoption.charttools.b.d aKs;
        final /* synthetic */ j aKt;

        j(j jVar, com.iqoption.charttools.b.d dVar) {
            this.aKt = jVar;
            this.aKs = dVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (bool != null) {
                TransitionManager.beginDelayedTransition(this.aKs.aHU, this.aKt.aql);
                String str = "btnSaveLabel";
                String str2 = "btnSaveProgress";
                ProgressBar progressBar;
                TextView textView;
                if (bool.booleanValue()) {
                    progressBar = this.aKs.aHW;
                    kotlin.jvm.internal.i.e(progressBar, str2);
                    com.iqoption.core.ext.a.ak(progressBar);
                    textView = this.aKs.aHV;
                    kotlin.jvm.internal.i.e(textView, str);
                    com.iqoption.core.ext.a.hide(textView);
                    return;
                }
                progressBar = this.aKs.aHW;
                kotlin.jvm.internal.i.e(progressBar, str2);
                com.iqoption.core.ext.a.al(progressBar);
                textView = this.aKs.aHV;
                kotlin.jvm.internal.i.e(textView, str);
                com.iqoption.core.ext.a.ak(textView);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "result", "Lcom/iqoption/charttools/templates/TemplateActionResult;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: TemplateFragment.kt */
    static final class k<T> implements Observer<g> {
        final /* synthetic */ j aKt;

        k(j jVar) {
            this.aKt = jVar;
        }

        /* renamed from: a */
        public final void onChanged(g gVar) {
            if ((gVar instanceof o) || kotlin.jvm.internal.i.y(gVar, h.aKo)) {
                this.aKt.back();
            } else if (gVar instanceof n) {
                com.iqoption.core.d.z(((n) gVar).Po(), 1);
            } else if (gVar instanceof i) {
                com.iqoption.core.ui.d.d c = this.aKt.Pc();
                if (c != null) {
                    c.a(this.aKt, com.iqoption.charttools.constructor.c.aED.a(((i) gVar).MD()));
                    if (c != null) {
                        return;
                    }
                }
                FragmentManager childFragmentManager = this.aKt.getChildFragmentManager();
                kotlin.jvm.internal.i.e(childFragmentManager, "childFragmentManager");
                FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
                kotlin.jvm.internal.i.e(beginTransaction, "beginTransaction()");
                beginTransaction.add(com.iqoption.charttools.n.g.content, com.iqoption.charttools.constructor.c.aED.b(((i) gVar).MD()), com.iqoption.charttools.constructor.c.TAG);
                beginTransaction.addToBackStack(null);
                beginTransaction.commitAllowingStateLoss();
                childFragmentManager.executePendingTransactions();
                kotlin.l lVar = kotlin.l.eVB;
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, bng = {"com/iqoption/charttools/templates/TemplateFragment$observeTemplateContent$7", "Landroidx/lifecycle/Observer;", "", "firstTime", "getFirstTime", "()Z", "setFirstTime", "(Z)V", "widgets", "", "Landroid/view/View;", "getWidgets", "()[Landroid/view/View;", "[Landroid/view/View;", "onChanged", "", "isEnabled", "(Ljava/lang/Boolean;)V", "techtools_release"})
    /* compiled from: TemplateFragment.kt */
    public static final class l implements Observer<Boolean> {
        final /* synthetic */ com.iqoption.charttools.b.d aKs;
        final /* synthetic */ j aKt;
        private final View[] aKu;
        private boolean aKv = true;

        l(j jVar, com.iqoption.charttools.b.d dVar) {
            this.aKt = jVar;
            this.aKs = dVar;
            View[] viewArr = new View[7];
            FrameLayout frameLayout = this.aKs.aIa;
            kotlin.jvm.internal.i.e(frameLayout, "containerChartType");
            viewArr[0] = frameLayout;
            frameLayout = this.aKs.aHZ;
            kotlin.jvm.internal.i.e(frameLayout, "containerCandleSize");
            viewArr[1] = frameLayout;
            SwitchCompat switchCompat = this.aKs.aIj;
            kotlin.jvm.internal.i.e(switchCompat, "switchHeikenAshi");
            viewArr[2] = switchCompat;
            switchCompat = this.aKs.aIh;
            kotlin.jvm.internal.i.e(switchCompat, "switchAutoScale");
            viewArr[3] = switchCompat;
            switchCompat = this.aKs.aIl;
            kotlin.jvm.internal.i.e(switchCompat, "switchTradersMood");
            viewArr[4] = switchCompat;
            switchCompat = this.aKs.aIk;
            kotlin.jvm.internal.i.e(switchCompat, "switchLiveDeals");
            viewArr[5] = switchCompat;
            switchCompat = this.aKs.aIm;
            kotlin.jvm.internal.i.e(switchCompat, "switchVolume");
            viewArr[6] = switchCompat;
            this.aKu = viewArr;
        }

        /* renamed from: f */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                SwitchCompat switchCompat = this.aKs.aIi;
                String str = "switchChartSettings";
                kotlin.jvm.internal.i.e(switchCompat, str);
                if ((kotlin.jvm.internal.i.y(Boolean.valueOf(switchCompat.isChecked()), bool) ^ 1) != 0) {
                    switchCompat = this.aKs.aIi;
                    kotlin.jvm.internal.i.e(switchCompat, str);
                    switchCompat.setChecked(bool.booleanValue());
                }
                if (this.aKv && this.aKt.Pb().Pm() == null) {
                    this.aKv = false;
                } else {
                    TransitionManager.beginDelayedTransition(this.aKs.aIn, this.aKt.aql);
                }
                this.aKt.a(this.aKu, bool.booleanValue());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: TemplateFragment.kt */
    static final class m<T> implements Observer<Boolean> {
        final /* synthetic */ com.iqoption.charttools.b.d aKs;

        m(com.iqoption.charttools.b.d dVar) {
            this.aKs = dVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (bool != null) {
                SwitchCompat switchCompat = this.aKs.aIj;
                String str = "switchHeikenAshi";
                kotlin.jvm.internal.i.e(switchCompat, str);
                if ((kotlin.jvm.internal.i.y(Boolean.valueOf(switchCompat.isChecked()), bool) ^ 1) != 0) {
                    switchCompat = this.aKs.aIj;
                    kotlin.jvm.internal.i.e(switchCompat, str);
                    switchCompat.setChecked(bool.booleanValue());
                }
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: TemplateFragment.kt */
    static final class n<T> implements Observer<Boolean> {
        final /* synthetic */ com.iqoption.charttools.b.d aKs;

        n(com.iqoption.charttools.b.d dVar) {
            this.aKs = dVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (bool != null) {
                SwitchCompat switchCompat = this.aKs.aIh;
                String str = "switchAutoScale";
                kotlin.jvm.internal.i.e(switchCompat, str);
                if ((kotlin.jvm.internal.i.y(Boolean.valueOf(switchCompat.isChecked()), bool) ^ 1) != 0) {
                    switchCompat = this.aKs.aIh;
                    kotlin.jvm.internal.i.e(switchCompat, str);
                    switchCompat.setChecked(bool.booleanValue());
                }
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, bng = {"com/iqoption/charttools/templates/TemplateFragment$observeTemplateContent$instrumentsAdapter$1", "Lcom/iqoption/charttools/templates/viewholder/ViewHolderCallback;", "onItemDeleteClick", "", "item", "Lcom/iqoption/charttools/templates/InstrumentAdapterItem;", "onItemSettingsClick", "onItemVisibilityClick", "techtools_release"})
    /* compiled from: TemplateFragment.kt */
    public static final class o implements com.iqoption.charttools.e.a.d {
        final /* synthetic */ j aKt;

        o(j jVar) {
            this.aKt = jVar;
        }

        public void a(d dVar) {
            kotlin.jvm.internal.i.f(dVar, "item");
            j.a(this.aKt).e(dVar);
        }

        public void b(d dVar) {
            kotlin.jvm.internal.i.f(dVar, "item");
            j.a(this.aKt).f(dVar);
        }

        public void c(d dVar) {
            kotlin.jvm.internal.i.f(dVar, "item");
            j.a(this.aKt).d(dVar);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/charttools/templates/TemplateFragment$onCreateView$1$onButtonClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "techtools_release"})
    /* compiled from: TemplateFragment.kt */
    public static final class p extends com.iqoption.core.ext.g {
        final /* synthetic */ j aKt;

        p(j jVar) {
            this.aKt = jVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            int id = view.getId();
            if (id == com.iqoption.charttools.n.g.btnBack) {
                com.iqoption.charttools.a.a.aEw.MA();
                this.aKt.back();
            } else if (id == com.iqoption.charttools.n.g.btnDelete) {
                j.a(this.aKt).bV(true);
            } else if (id == com.iqoption.charttools.n.g.btnCancel) {
                j.a(this.aKt).bV(false);
            } else if (id == com.iqoption.charttools.n.g.btnConfirm) {
                j.a(this.aKt).delete();
            } else if (id == com.iqoption.charttools.n.g.btnSave) {
                j.a(this.aKt).save();
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "state", "Lcom/iqoption/charttools/templates/TemplateInitialState;", "kotlin.jvm.PlatformType", "onChanged", "com/iqoption/charttools/templates/TemplateFragment$onCreateView$1$1"})
    /* compiled from: TemplateFragment.kt */
    static final class r<T> implements Observer<l> {
        final /* synthetic */ j aKt;
        final /* synthetic */ com.iqoption.charttools.b.d aKw;
        final /* synthetic */ AtomicBoolean aKx;

        r(com.iqoption.charttools.b.d dVar, AtomicBoolean atomicBoolean, j jVar) {
            this.aKw = dVar;
            this.aKx = atomicBoolean;
            this.aKt = jVar;
        }

        /* renamed from: a */
        public final void onChanged(l lVar) {
            TransitionManager.beginDelayedTransition(this.aKw.aIo, this.aKt.aql);
            String str = "progressTemplate";
            String str2 = "templateContent";
            if (lVar != null) {
                LinearLayout linearLayout = this.aKw.aIn;
                kotlin.jvm.internal.i.e(linearLayout, str2);
                com.iqoption.core.ext.a.ak(linearLayout);
                ProgressBar progressBar = this.aKw.aIg;
                kotlin.jvm.internal.i.e(progressBar, str);
                com.iqoption.core.ext.a.al(progressBar);
                this.aKx.set(true);
                this.aKw.aIc.setText(lVar.getName());
                this.aKx.set(false);
                EditText editText = this.aKw.aIc;
                kotlin.jvm.internal.i.e(editText, "inputName");
                com.iqoption.core.ext.a.c(editText);
                TextView textView = this.aKw.aHY;
                kotlin.jvm.internal.i.e(textView, "chartType");
                ChartType Pf = lVar.Pf();
                CharSequence charSequence = null;
                if (Pf != null) {
                    int i = k.axg[Pf.ordinal()];
                    if (i == 1) {
                        charSequence = this.aKt.getString(com.iqoption.charttools.n.i.area);
                    } else if (i == 2) {
                        charSequence = this.aKt.getString(com.iqoption.charttools.n.i.linear);
                    } else if (i == 3) {
                        String string;
                        ChartColor Pg = lVar.Pg();
                        if (Pg != null) {
                            i = k.aob[Pg.ordinal()];
                            if (i == 1) {
                                string = this.aKt.getString(com.iqoption.charttools.n.i.candles_grey);
                            } else if (i == 2) {
                                string = this.aKt.getString(com.iqoption.charttools.n.i.candles);
                            }
                        }
                        charSequence = string;
                    } else if (i == 4) {
                        charSequence = this.aKt.getString(com.iqoption.charttools.n.i.bars);
                    }
                }
                textView.setText(charSequence);
                textView = this.aKw.aHX;
                kotlin.jvm.internal.i.e(textView, "candleSize");
                textView.setText(lVar.Pd());
                RecyclerView recyclerView = this.aKw.aId;
                kotlin.jvm.internal.i.e(recyclerView, "instrumentsList");
                if (recyclerView.getAdapter() == null) {
                    this.aKt.a(this.aKw);
                    return;
                }
                return;
            }
            LinearLayout linearLayout2 = this.aKw.aIn;
            kotlin.jvm.internal.i.e(linearLayout2, str2);
            com.iqoption.core.ext.a.al(linearLayout2);
            ProgressBar progressBar2 = this.aKw.aIg;
            kotlin.jvm.internal.i.e(progressBar2, str);
            com.iqoption.core.ext.a.ak(progressBar2);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/charttools/templates/TemplateFragment$onCreateView$1$2", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "techtools_release"})
    /* compiled from: TemplateFragment.kt */
    public static final class s extends ah {
        final /* synthetic */ j aKt;
        final /* synthetic */ AtomicBoolean aKx;

        s(AtomicBoolean atomicBoolean, j jVar) {
            this.aKx = atomicBoolean;
            this.aKt = jVar;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            if (!this.aKx.get()) {
                j.a(this.aKt).eS(editable.toString());
            }
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public boolean ME() {
        return true;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public j() {
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.setOrdering(0);
        autoTransition.setDuration(200);
        this.aql = autoTransition;
    }

    private final m Pb() {
        Parcelable parcelable = com.iqoption.core.ext.a.s(this).getParcelable("arg.inputData");
        if (parcelable == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return (m) parcelable;
    }

    private final com.iqoption.core.ui.d.d Pc() {
        return (com.iqoption.core.ui.d.d) com.iqoption.core.ext.a.s(this).getParcelable("arg.navigator");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        com.iqoption.charttools.b.d dVar = (com.iqoption.charttools.b.d) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.charttools.n.h.fragment_template, viewGroup, false, 4, null);
        OnClickListener pVar = new p(this);
        dVar.aHK.setOnClickListener(pVar);
        dVar.aHT.setOnClickListener(pVar);
        dVar.aHU.setOnClickListener(pVar);
        dVar.aHS.setOnClickListener(pVar);
        dVar.aHR.setOnClickListener(pVar);
        FrameLayout frameLayout = dVar.aHU;
        kotlin.jvm.internal.i.e(frameLayout, "btnSave");
        frameLayout.setEnabled(false);
        com.iqoption.charttools.a.a aVar = com.iqoption.charttools.a.a.aEw;
        EditText editText = dVar.aIc;
        kotlin.jvm.internal.i.e(editText, "inputName");
        aVar.b(editText);
        OnCheckedChangeListener qVar = new q(this);
        dVar.aIi.setOnCheckedChangeListener(qVar);
        dVar.aIj.setOnCheckedChangeListener(qVar);
        dVar.aIh.setOnCheckedChangeListener(qVar);
        dVar.aIl.setOnCheckedChangeListener(qVar);
        dVar.aIk.setOnCheckedChangeListener(qVar);
        dVar.aIm.setOnCheckedChangeListener(qVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.aKp = p.aLp.a(this, Pb());
        TextView textView = dVar.alH;
        kotlin.jvm.internal.i.e(textView, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        p pVar2 = this.aKp;
        String str = "templateViewModel";
        if (pVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textView.setText(pVar2.getTitle());
        p pVar3 = this.aKp;
        if (pVar3 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(pVar3.Pp(), new r(dVar, atomicBoolean, this));
        RecyclerView recyclerView = dVar.aId;
        kotlin.jvm.internal.i.e(recyclerView, "instrumentsList");
        recyclerView.setItemAnimator((ItemAnimator) null);
        dVar.aIc.addTextChangedListener(new s(atomicBoolean, this));
        return dVar.getRoot();
    }

    private final void a(com.iqoption.charttools.b.d dVar) {
        e eVar = new e(new o(this));
        RecyclerView recyclerView = dVar.aId;
        kotlin.jvm.internal.i.e(recyclerView, "instrumentsList");
        recyclerView.setAdapter(eVar);
        dVar.aId.addItemDecoration(new f(eVar));
        p pVar = this.aKp;
        String str = "templateViewModel";
        if (pVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(pVar.Pq(), new b(eVar));
        p pVar2 = this.aKp;
        if (pVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(pVar2.Pr(), new g(dVar));
        pVar2 = this.aKp;
        if (pVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(pVar2.Ps(), new h(dVar));
        pVar2 = this.aKp;
        if (pVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(pVar2.Pt(), new i(this, dVar));
        pVar2 = this.aKp;
        if (pVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(pVar2.PA(), new j(this, dVar));
        pVar2 = this.aKp;
        if (pVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(pVar2.PB(), new k(this));
        pVar2 = this.aKp;
        if (pVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(pVar2.Pu(), new l(this, dVar));
        pVar2 = this.aKp;
        if (pVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(pVar2.Pw(), new m(dVar));
        pVar2 = this.aKp;
        if (pVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(pVar2.Pv(), new n(dVar));
        pVar2 = this.aKp;
        if (pVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(pVar2.Py(), new c(dVar));
        pVar2 = this.aKp;
        if (pVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(pVar2.Px(), new d(dVar));
        pVar2 = this.aKp;
        if (pVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(pVar2.Pz(), new e(dVar));
        a(com.iqoption.charttools.constructor.b.aEA.f(com.iqoption.core.ext.a.r(this)).MC(), new f(this));
    }

    private final void a(View[] viewArr, boolean z, View... viewArr2) {
        for (Object obj : viewArr) {
            if (i.contains((Object[]) viewArr2, obj)) {
                com.iqoption.core.ext.a.ak(obj);
            } else if (z) {
                com.iqoption.core.ext.a.al(obj);
            } else {
                com.iqoption.core.ext.a.hide(obj);
            }
        }
    }

    private final void a(View[] viewArr, boolean z) {
        int i = 0;
        int length;
        if (z) {
            length = viewArr.length;
            while (i < length) {
                com.iqoption.core.ext.a.ak(viewArr[i]);
                i++;
            }
            return;
        }
        length = viewArr.length;
        while (i < length) {
            com.iqoption.core.ext.a.al(viewArr[i]);
            i++;
        }
    }
}
