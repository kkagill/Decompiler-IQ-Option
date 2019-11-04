package com.iqoption.debugmenu.debugmenu;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.splash.SplashLogHelper;
import java.util.HashMap;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, bng = {"Lcom/iqoption/debugmenu/debugmenu/ParametersFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "FEE_ENABLED_COUNTRY_ID", "", "REGULATED_COUNTRY_ID", "affEdit", "Landroid/widget/EditText;", "affSwitch", "Landroid/widget/Switch;", "afftrackEdit", "afftrackSwitch", "editTextCoockiesKey", "editTextCoockiesValue", "fcmTokenText", "Landroid/widget/TextView;", "stagingEdit", "stagingSwitch", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "showRestartToastWarning", "debugmenu_release"})
/* compiled from: ParametersFragment.kt */
public final class d extends com.iqoption.core.ui.fragment.d {
    private HashMap apm;
    private final long cvS = 14;
    private final long cvT = 198;
    private EditText cvU;
    private EditText cvV;
    private EditText cvW;
    private Switch cvX;
    private Switch cvY;
    private Switch cvZ;
    private TextView cwa;
    private EditText cwb;
    private EditText cwc;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"})
    /* compiled from: ParametersFragment.kt */
    static final class c implements OnCheckedChangeListener {
        final /* synthetic */ d cwd;

        c(d dVar) {
            this.cwd = dVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            com.iqoption.core.data.d.a.bdi.cn(z);
            this.cwd.aof();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"})
    /* compiled from: ParametersFragment.kt */
    static final class d implements OnCheckedChangeListener {
        public static final d cwe = new d();

        d() {
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            com.iqoption.core.data.d.a.bdi.cq(z);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"})
    /* compiled from: ParametersFragment.kt */
    static final class e implements OnCheckedChangeListener {
        final /* synthetic */ d cwd;

        e(d dVar) {
            this.cwd = dVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            a aVar = a.cvy;
            EditText e = this.cwd.cvU;
            if (e == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            aVar.hz(e.getText().toString());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"})
    /* compiled from: ParametersFragment.kt */
    static final class f implements OnCheckedChangeListener {
        final /* synthetic */ d cwd;

        f(d dVar) {
            this.cwd = dVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            a.cvq = z;
            EditText f = this.cwd.cvV;
            if (f == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            a.cvr = f.getText().toString();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"})
    /* compiled from: ParametersFragment.kt */
    static final class g implements OnCheckedChangeListener {
        final /* synthetic */ d cwd;

        g(d dVar) {
            this.cwd = dVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            a.cvs = z;
            EditText g = this.cwd.cvW;
            if (g == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            a.cvt = g.getText().toString();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: ParametersFragment.kt */
    static final class h implements OnClickListener {
        public static final h cwf = new h();

        h() {
        }

        public final void onClick(View view) {
            com.iqoption.core.data.d.a.bdi.ba(false);
            com.iqoption.core.d.a("Demo reseted!!!!", 0, 2, null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: ParametersFragment.kt */
    static final class i implements OnClickListener {
        final /* synthetic */ d cwd;

        i(d dVar) {
            this.cwd = dVar;
        }

        public final void onClick(View view) {
            String be = SplashLogHelper.bGE.be(com.iqoption.core.ext.a.q(this.cwd));
            FragmentActivity activity = this.cwd.getActivity();
            if (activity == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            kotlin.jvm.internal.i.e(activity, "activity!!");
            activity.getSupportFragmentManager().beginTransaction().add(com.iqoption.debugmenu.c.b.topFrame, com.iqoption.core.ui.fragment.e.bIX.hi(be), com.iqoption.core.ui.fragment.e.bIX.Bx()).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).addToBackStack(com.iqoption.core.ui.fragment.e.bIX.Bx()).commit();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"})
    /* compiled from: ParametersFragment.kt */
    static final class k implements OnCheckedChangeListener {
        final /* synthetic */ d cwd;
        final /* synthetic */ Switch cwh;

        k(d dVar, Switch switchR) {
            this.cwd = dVar;
            this.cwh = switchR;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2 = false;
            if (z) {
                com.iqoption.core.data.d.a.bdi.aF(this.cwd.cvS);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Country Id set to ");
                stringBuilder.append(this.cwd.cvS);
                com.iqoption.core.d.z(stringBuilder.toString(), 0);
            } else {
                com.iqoption.core.data.d.a.bdi.aF(-1);
                com.iqoption.core.d.z("Country Id reset", 0);
            }
            Switch switchR = this.cwh;
            kotlin.jvm.internal.i.e(switchR, "isFeeEnabled");
            if (com.iqoption.core.data.d.a.bdi.Wk() == this.cwd.cvT) {
                z2 = true;
            }
            switchR.setChecked(z2);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"})
    /* compiled from: ParametersFragment.kt */
    static final class l implements OnCheckedChangeListener {
        final /* synthetic */ d cwd;
        final /* synthetic */ Switch cwi;

        l(d dVar, Switch switchR) {
            this.cwd = dVar;
            this.cwi = switchR;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2 = false;
            if (z) {
                com.iqoption.core.data.d.a.bdi.aF(this.cwd.cvT);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Country Id set to ");
                stringBuilder.append(this.cwd.cvT);
                com.iqoption.core.d.z(stringBuilder.toString(), 0);
            } else {
                com.iqoption.core.data.d.a.bdi.aF(-1);
                com.iqoption.core.d.z("Country Id reset", 0);
            }
            Switch switchR = this.cwi;
            kotlin.jvm.internal.i.e(switchR, "isRegulated");
            if (com.iqoption.core.data.d.a.bdi.Wk() == this.cwd.cvS) {
                z2 = true;
            }
            switchR.setChecked(z2);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"})
    /* compiled from: ParametersFragment.kt */
    static final class m implements OnCheckedChangeListener {
        final /* synthetic */ d cwd;

        m(d dVar) {
            this.cwd = dVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            com.iqoption.core.data.d.a.bdi.cj(z);
            this.cwd.aof();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"})
    /* compiled from: ParametersFragment.kt */
    static final class n implements OnCheckedChangeListener {
        public static final n cwj = new n();

        n() {
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            com.iqoption.core.data.d.a.bdi.ck(z);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"})
    /* compiled from: ParametersFragment.kt */
    static final class o implements OnCheckedChangeListener {
        final /* synthetic */ d cwd;

        o(d dVar) {
            this.cwd = dVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            com.iqoption.core.data.d.a.bdi.cl(z);
            this.cwd.aof();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"})
    /* compiled from: ParametersFragment.kt */
    static final class p implements OnCheckedChangeListener {
        final /* synthetic */ d cwd;

        p(d dVar) {
            this.cwd = dVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            com.iqoption.core.data.d.a.bdi.cm(z);
            this.cwd.aof();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"})
    /* compiled from: ParametersFragment.kt */
    static final class q implements OnCheckedChangeListener {
        public static final q cwk = new q();

        q() {
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            com.iqoption.core.data.d.a.bdi.co(z);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a extends com.iqoption.core.ext.g {
        final /* synthetic */ d cwd;

        public a(d dVar) {
            this.cwd = dVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            EditText h = this.cwd.cwb;
            if (h == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            String obj = h.getText().toString();
            EditText i = this.cwd.cwc;
            if (i == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            String obj2 = i.getText().toString();
            if (TextUtils.isEmpty(obj) || TextUtils.isEmpty(obj2)) {
                com.iqoption.core.connect.http.cookie.b.a(com.iqoption.core.connect.http.c.UH(), a.cvw, null, 2, null);
                a.cvu = false;
                obj = "";
                a.cvw = obj;
                a.cvx = obj;
                return;
            }
            a.cvu = true;
            a.cvw = obj;
            a.cvx = obj2;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "event", "Lcom/iqoption/core/event/IQEvent;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ParametersFragment.kt */
    static final class b<T> implements io.reactivex.b.f<com.iqoption.core.b.d> {
        final /* synthetic */ d cwd;

        b(d dVar) {
            this.cwd = dVar;
        }

        /* renamed from: a */
        public final void accept(com.iqoption.core.b.d dVar) {
            if (dVar instanceof com.iqoption.core.b.b) {
                TextView a = this.cwd.cwa;
                if (a != null) {
                    a.setText(((com.iqoption.core.b.b) dVar).getValue());
                }
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ParametersFragment.kt */
    static final class j<T> implements io.reactivex.b.f<Throwable> {
        public static final j cwg = new j();

        j() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
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
        return layoutInflater.inflate(com.iqoption.debugmenu.c.c.debug_console_parameters, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        io.reactivex.disposables.b a = com.iqoption.core.d.Um().EI().d(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new b(this), (io.reactivex.b.f) j.cwg);
        kotlin.jvm.internal.i.e(a, "core.iqGuavaEvents()\n   …r ->  }\n                )");
        a(a);
        Switch switchR = (Switch) view.findViewById(com.iqoption.debugmenu.c.b.isRegulated);
        Switch switchR2 = (Switch) view.findViewById(com.iqoption.debugmenu.c.b.isFeeEnabledCountry);
        kotlin.jvm.internal.i.e(switchR, "isRegulated");
        boolean z = true;
        switchR.setChecked(com.iqoption.core.data.d.a.bdi.Wk() == this.cvS);
        switchR.setOnCheckedChangeListener(new k(this, switchR2));
        kotlin.jvm.internal.i.e(switchR2, "isFeeEnabled");
        if (com.iqoption.core.data.d.a.bdi.Wk() != this.cvT) {
            z = false;
        }
        switchR2.setChecked(z);
        switchR2.setOnCheckedChangeListener(new l(this, switchR));
        switchR = (Switch) view.findViewById(com.iqoption.debugmenu.c.b.debugWebSocketLog);
        kotlin.jvm.internal.i.e(switchR, "showLogSwitch");
        switchR.setChecked(com.iqoption.core.data.d.a.bdi.Wl());
        switchR.setOnCheckedChangeListener(new m(this));
        switchR = (Switch) view.findViewById(com.iqoption.debugmenu.c.b.debugAnalyticsLog);
        kotlin.jvm.internal.i.e(switchR, "showAnalyticsLogSwitch");
        switchR.setChecked(com.iqoption.core.data.d.a.bdi.Wm());
        switchR.setOnCheckedChangeListener(n.cwj);
        switchR = (Switch) view.findViewById(com.iqoption.debugmenu.c.b.debugStethoEnabled);
        String str = "stethoSwitch";
        if (com.iqoption.core.d.Un().Ds()) {
            kotlin.jvm.internal.i.e(switchR, str);
            switchR.setVisibility(0);
            switchR.setChecked(com.iqoption.core.data.d.a.bdi.Wn());
            switchR.setOnCheckedChangeListener(new o(this));
        } else {
            kotlin.jvm.internal.i.e(switchR, str);
            switchR.setVisibility(8);
        }
        switchR = (Switch) view.findViewById(com.iqoption.debugmenu.c.b.testGooglePayEnabled);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append("Test ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append("G");
        Drawable n = com.iqoption.core.ext.a.n(com.iqoption.core.ext.a.q(this), com.iqoption.debugmenu.c.a.ic_google_pay);
        n.setBounds(0, 0, n.getIntrinsicWidth(), n.getIntrinsicHeight());
        spannableStringBuilder.setSpan(new com.iqoption.core.ui.e.a(n), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append("Pay");
        kotlin.jvm.internal.i.e(switchR, "testGooglePayEnabledSwitch");
        switchR.setText(spannableStringBuilder);
        switchR.setChecked(com.iqoption.core.data.d.a.bdi.Wo());
        switchR.setOnCheckedChangeListener(new p(this));
        switchR = (Switch) view.findViewById(com.iqoption.debugmenu.c.b.debugEmulatePhases);
        kotlin.jvm.internal.i.e(switchR, "emulatePhasesSwitch");
        switchR.setChecked(com.iqoption.core.data.d.a.bdi.Wq());
        switchR.setOnCheckedChangeListener(q.cwk);
        switchR = (Switch) view.findViewById(com.iqoption.debugmenu.c.b.debugWhiteLabel);
        kotlin.jvm.internal.i.e(switchR, "debugWhiteLabel");
        switchR.setChecked(com.iqoption.core.data.d.a.bdi.Wp());
        switchR.setOnCheckedChangeListener(new c(this));
        switchR = (Switch) view.findViewById(com.iqoption.debugmenu.c.b.debugNotMarkRequirementAsShown);
        kotlin.jvm.internal.i.e(switchR, "debugNotMarkRequirementAsShown");
        switchR.setChecked(com.iqoption.core.data.d.a.bdi.Ws());
        switchR.setOnCheckedChangeListener(d.cwe);
        this.cvU = (EditText) view.findViewById(com.iqoption.debugmenu.c.b.editTextStaging);
        EditText editText = this.cvU;
        if (editText == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        editText.setText(a.cvy.DF());
        this.cvV = (EditText) view.findViewById(com.iqoption.debugmenu.c.b.editTextAff);
        editText = this.cvV;
        if (editText == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        editText.setText(a.cvr);
        this.cvW = (EditText) view.findViewById(com.iqoption.debugmenu.c.b.editTextAfftrack);
        editText = this.cvW;
        if (editText == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        editText.setText(a.cvt);
        this.cwa = (TextView) view.findViewById(com.iqoption.debugmenu.c.b.fcmTokenText);
        TextView textView = this.cwa;
        if (textView == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        textView.setText(com.iqoption.core.data.d.a.bdi.Wg());
        this.cvX = (Switch) view.findViewById(com.iqoption.debugmenu.c.b.switchStaging);
        switchR = this.cvX;
        if (switchR == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        switchR.setChecked(a.cvy.DE());
        switchR = this.cvX;
        if (switchR == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        switchR.setOnCheckedChangeListener(new e(this));
        this.cvY = (Switch) view.findViewById(com.iqoption.debugmenu.c.b.switchAff);
        switchR = this.cvY;
        if (switchR == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        switchR.setChecked(a.cvq);
        switchR = this.cvY;
        if (switchR == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        switchR.setOnCheckedChangeListener(new f(this));
        this.cvZ = (Switch) view.findViewById(com.iqoption.debugmenu.c.b.switchAfftrack);
        switchR = this.cvZ;
        if (switchR == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        switchR.setChecked(a.cvs);
        switchR = this.cvZ;
        if (switchR == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        switchR.setOnCheckedChangeListener(new g(this));
        this.cwb = (EditText) view.findViewById(com.iqoption.debugmenu.c.b.editTextCoockiesKey);
        this.cwc = (EditText) view.findViewById(com.iqoption.debugmenu.c.b.editTextCoockiesValue);
        View findViewById = view.findViewById(com.iqoption.debugmenu.c.b.coockies);
        kotlin.jvm.internal.i.e(findViewById, "coockies");
        findViewById.setOnClickListener(new a(this));
        view.findViewById(com.iqoption.debugmenu.c.b.buttonResetDemo).setOnClickListener(h.cwf);
        view = view.findViewById(com.iqoption.debugmenu.c.b.buttonTechnicalLog);
        String str2 = "technicalLog";
        if (SplashLogHelper.bGE.akR()) {
            kotlin.jvm.internal.i.e(view, str2);
            view.setVisibility(0);
            view.setOnClickListener(new i(this));
            return;
        }
        kotlin.jvm.internal.i.e(view, str2);
        view.setVisibility(8);
    }

    private final void aof() {
        com.iqoption.core.d.z("You must restart app to apply changes", 0);
    }
}
