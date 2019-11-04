package com.iqoption.fragment;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.p;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.data.model.ActiveType;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.ae;
import com.iqoption.core.util.u;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.e.at;
import com.iqoption.protrader.f;
import com.iqoption.system.a.e;
import com.iqoption.util.af;
import com.iqoption.util.ak;
import com.iqoption.util.y;
import com.iqoption.view.RobotoTextView;
import com.iqoption.view.text.j;
import com.iqoption.x.R;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: AssetFragment */
public class a extends com.iqoption.fragment.b.b implements com.iqoption.util.y.a {
    private Builder ajf;
    private boolean ajm;
    private boolean auB;
    private com.iqoption.a.b cTR;
    private b cTS;
    private at cTT;
    private c cTU = new c(this);
    private Boolean cTV = Boolean.valueOf(false);
    private Set<Pair<View, Integer>> cTW = Sets.uw();
    private int cTX = 0;

    /* compiled from: AssetFragment */
    /* renamed from: com.iqoption.fragment.a$3 */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] akM = new int[TabType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x008b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0097 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x007f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00a3 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Missing block: B:35:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.iqoption.fragment.TabType.values();
            r0 = r0.length;
            r0 = new int[r0];
            akM = r0;
            r0 = 1;
            r1 = akM;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = com.iqoption.fragment.TabType.ACTIVE_TAB;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = akM;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = com.iqoption.fragment.TabType.MORE_TAB;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = com.iqoption.core.data.model.ActiveType.values();
            r2 = r2.length;
            r2 = new int[r2];
            akL = r2;
            r2 = akL;	 Catch:{ NoSuchFieldError -> 0x0032 }
            r3 = com.iqoption.core.data.model.ActiveType.TURBO_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x0032 }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x0032 }
            r2[r3] = r0;	 Catch:{ NoSuchFieldError -> 0x0032 }
        L_0x0032:
            r0 = akL;	 Catch:{ NoSuchFieldError -> 0x003c }
            r2 = com.iqoption.core.data.model.ActiveType.BINARY_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x003c }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x003c }
            r0[r2] = r1;	 Catch:{ NoSuchFieldError -> 0x003c }
        L_0x003c:
            r0 = akL;	 Catch:{ NoSuchFieldError -> 0x0047 }
            r1 = com.iqoption.core.data.model.ActiveType.DIGITAL_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x0047 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0047 }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0047 }
        L_0x0047:
            r0 = akL;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r1 = com.iqoption.core.data.model.ActiveType.FX_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0052 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0052 }
        L_0x0052:
            r0 = akL;	 Catch:{ NoSuchFieldError -> 0x005d }
            r1 = com.iqoption.core.data.model.ActiveType.INTRADAY_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x005d }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x005d }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x005d }
        L_0x005d:
            r0 = akL;	 Catch:{ NoSuchFieldError -> 0x0068 }
            r1 = com.iqoption.core.data.model.ActiveType.BOND_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x0068 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0068 }
            r2 = 6;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0068 }
        L_0x0068:
            r0 = akL;	 Catch:{ NoSuchFieldError -> 0x0073 }
            r1 = com.iqoption.core.data.model.ActiveType.INDEX_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x0073 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0073 }
            r2 = 7;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0073 }
        L_0x0073:
            r0 = akL;	 Catch:{ NoSuchFieldError -> 0x007f }
            r1 = com.iqoption.core.data.model.ActiveType.COMMODITY_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x007f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x007f }
            r2 = 8;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x007f }
        L_0x007f:
            r0 = akL;	 Catch:{ NoSuchFieldError -> 0x008b }
            r1 = com.iqoption.core.data.model.ActiveType.STOCK_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x008b }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x008b }
            r2 = 9;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x008b }
        L_0x008b:
            r0 = akL;	 Catch:{ NoSuchFieldError -> 0x0097 }
            r1 = com.iqoption.core.data.model.ActiveType.ETF_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x0097 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0097 }
            r2 = 10;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0097 }
        L_0x0097:
            r0 = akL;	 Catch:{ NoSuchFieldError -> 0x00a3 }
            r1 = com.iqoption.core.data.model.ActiveType.FOREX_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x00a3 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00a3 }
            r2 = 11;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00a3 }
        L_0x00a3:
            r0 = akL;	 Catch:{ NoSuchFieldError -> 0x00af }
            r1 = com.iqoption.core.data.model.ActiveType.CRYPTO_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x00af }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00af }
            r2 = 12;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00af }
        L_0x00af:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.a$AnonymousClass3.<clinit>():void");
        }
    }

    /* compiled from: AssetFragment */
    private static class a implements Callable<Drawable> {
        @DrawableRes
        final int cUa;

        public a(@DrawableRes int i) {
            this.cUa = i;
        }

        /* renamed from: axo */
        public Drawable call() {
            return ContextCompat.getDrawable(IQApp.Eu(), this.cUa);
        }
    }

    /* compiled from: AssetFragment */
    public static class d {
        public boolean ajQ;
        public boolean ajm;

        public d(boolean z, boolean z2) {
            this.ajQ = z;
            this.ajm = z2;
        }
    }

    /* compiled from: AssetFragment */
    private static class c extends e<a> {
        public c(a aVar) {
            super(aVar);
        }

        @com.google.common.b.e
        public void onCommissionActiveChangeEvent(com.iqoption.app.helpers.a.b bVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$a$c$eCrSs2m-p7MeijjQdDntTvSkzk8(this));
        }

        private /* synthetic */ void axp() {
            a aVar = (a) this.dUo.get();
            if (aVar != null && aVar.isAdded()) {
                if (a.a(aVar.cTS, ActiveType.TURBO_ACTIVE, ActiveType.BINARY_ACTIVE)) {
                    aVar.axg();
                }
            }
        }

        @com.google.common.b.e
        public void onScheduleActiveChangeEvent(com.iqoption.app.helpers.a.d dVar) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$a$c$_jMlrMaS4YioPpmbZu1NQW4AOoc(this, dVar));
        }

        private /* synthetic */ void a(com.iqoption.app.helpers.a.d dVar) {
            a aVar = (a) this.dUo.get();
            if (aVar != null && aVar.isAdded()) {
                aVar.X((InstrumentType) dVar.getValue());
            }
        }
    }

    /* compiled from: AssetFragment */
    private static class b extends com.iqoption.system.c.b<View, Drawable> {
        b(View view) {
            super(view);
        }

        /* renamed from: a */
        public void v(@NonNull View view, @NonNull Drawable drawable) {
            view.setBackground(drawable);
            ((AnimationDrawable) ((LayerDrawable) drawable).getDrawable(1)).start();
        }
    }

    private static /* synthetic */ void r(View view, int i) {
    }

    public long axh() {
        return 400;
    }

    public long axj() {
        return 300;
    }

    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        this.cTT = (at) DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.asset_fragment, viewGroup, false);
        this.cTT.a(this);
        this.cTT.bVn.setText(ae.anG());
        if (getArguments() != null) {
            this.ajm = getArguments().getBoolean("add_tab_flag", false);
        }
        com.iqoption.core.microservices.tradingengine.response.active.a IZ = TabHelper.IM().IZ();
        if (IZ == null) {
            requireFragmentManager().popBackStack();
            return null;
        }
        this.cTS = new q(IZ.getInstrumentType(), IZ.getActiveType());
        int b = (com.iqoption.core.features.instrument.b.Xu() && com.iqoption.app.managers.feature.a.ef("intraday-forex")) ? b(ActiveType.INTRADAY_ACTIVE) : 0;
        if (b > 0) {
            z = true;
        }
        this.cTV = Boolean.valueOf(z);
        awY();
        final com.iqoption.videoeducation.b bVar = new com.iqoption.videoeducation.b(new -$$Lambda$a$BI2us6Itwks8kih9r2PQThi2WxA(this));
        this.cTT.bUu.setOnClickListener(new -$$Lambda$a$SDWlmaXqMKx0UFD3_kaBmvflhXI(this));
        this.cTT.bUE.addTextChangedListener(new j() {
            private String aVp;

            public void afterTextChanged(Editable editable) {
                super.afterTextChanged(editable);
                String obj = editable.toString();
                String str = this.aVp;
                if (str == null || !TextUtils.equals(str, obj)) {
                    bVar.a(editable, 150);
                    this.aVp = obj;
                }
            }
        });
        this.cTT.bUD.setLayoutTransition(ak.anP());
        this.cTR = new com.iqoption.a.b(-$$Lambda$a$BfA9MCGE_xROpmoi7rj_Z7cK7d4.INSTANCE);
        this.cTT.aoG.setOnClickListener(new -$$Lambda$a$qusCpaeNtOfziIx2uHZXwu5WaTE(this));
        this.cTR.setHasStableIds(true);
        Context requireContext = requireContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(requireContext, linearLayoutManager.getOrientation());
        dividerItemDecoration.setDrawable(getDrawable(R.drawable.line_divider_black20_1px));
        this.cTT.bTM.setLayoutManager(linearLayoutManager);
        this.cTT.bTM.setAdapter(this.cTR);
        this.cTT.bTM.setHasFixedSize(true);
        this.cTT.bTM.addItemDecoration(dividerItemDecoration);
        this.cTT.bTP.setOnClickListener(new -$$Lambda$a$ZT5gEadaMteEpOsrwVplN5f7vic(this));
        this.cTT.bUC.setOnClickListener(new -$$Lambda$a$d4Hm9kk7mUiSRwLjIfhDZ6euCO8(this));
        this.cTT.bUk.setOnClickListener(new -$$Lambda$a$UYoZnm2hocJdVI6_YpKr681zI7g(this));
        this.cTT.bUY.setOnClickListener(new -$$Lambda$a$rVxOqDbPerK7EqCa12DOPHbb08U(this));
        this.cTT.bUy.setOnClickListener(new -$$Lambda$a$vWvtxzRGop7MXKdhzXFSpAWyh44(this));
        this.cTT.bUp.setOnClickListener(new -$$Lambda$a$82_igutKZmlp0YdnORholbHxff8(this));
        this.cTT.bUV.setOnClickListener(new -$$Lambda$a$POT8s9myuhoF_ZsXeRPOER4azsM(this));
        return this.cTT.getRoot();
    }

    private /* synthetic */ void K(CharSequence charSequence) {
        this.cTR.dd(charSequence.toString());
    }

    private /* synthetic */ void aD(View view) {
        axe();
    }

    private /* synthetic */ void aB(View view) {
        onBackPressed();
    }

    private /* synthetic */ void bh(View view) {
        awR();
    }

    private /* synthetic */ void bg(View view) {
        awS();
    }

    private /* synthetic */ void bf(View view) {
        awT();
    }

    private /* synthetic */ void be(View view) {
        awX();
    }

    private /* synthetic */ void bd(View view) {
        awW();
    }

    private /* synthetic */ void bc(View view) {
        awU();
    }

    private /* synthetic */ void bb(View view) {
        awV();
    }

    public void onResume() {
        super.onResume();
        y.a(this);
        this.ajf = Event.Builder(Event.CATEGORY_SCREEN_OPENED, "change-asset");
        if (this.auB) {
            axf();
            this.auB = false;
        }
    }

    public void onPause() {
        super.onPause();
        y.b(this);
        if (this.ajf != null) {
            EventManager.BS().a(this.ajf.calcDuration().build());
        }
        this.auB = true;
    }

    public void onKeyboardVisibilityChanged(boolean z) {
        if (!z) {
            com.iqoption.activity.b aBM = aBM();
            if (aBM != null) {
                aBM.aiX.JN();
            }
        }
    }

    public void onViewCreated(@NonNull View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ak.b(this.cTT.getRoot(), new -$$Lambda$a$-6481Z75vHyoVmoqHLeYOhaDjEs(this, a(this.cTS, true, true)));
        IQApp.Ex().bd(new d(true, this.ajm));
    }

    private /* synthetic */ void aK(View view) {
        if (view != null) {
            aV(view);
        }
        d(this.cTS);
        if (a(ActiveType.TURBO_ACTIVE, ActiveType.BINARY_ACTIVE, ActiveType.DIGITAL_ACTIVE, ActiveType.FX_ACTIVE)) {
            axb();
        }
        if (this.cTV.booleanValue()) {
            if (a(ActiveType.FOREX_ACTIVE, ActiveType.INTRADAY_ACTIVE)) {
                axc();
            }
        }
    }

    private void aV(@NonNull View view) {
        view.postDelayed(new -$$Lambda$a$JZq2MrCANQ5a_WaH9pzBcek9n3k(this, view), 100);
    }

    private /* synthetic */ void ba(View view) {
        int height = this.cTT.bUD.getHeight() - this.cTT.bVp.getHeight();
        int i = this.cTT.bVp.getHeight() / 2 > view.getTop() ? -1 : 1;
        if (height > 0) {
            this.cTT.bVp.smoothScrollBy(0, i * height);
        }
    }

    private void awR() {
        boolean aYo = this.cTT.bTO.aYo();
        boolean a = a(ActiveType.FOREX_ACTIVE);
        int i = a ? 9 : 1;
        int i2 = a ? 10 : 2;
        com.iqoption.a.b bVar;
        if (this.cTT.bTO.aXF()) {
            this.cTT.bTO.reverse();
            bVar = this.cTR;
            if (!aYo) {
                i = i2;
            }
            bVar.dm(i);
        } else {
            this.cTT.bTO.setSwitched(true);
            this.cTT.bUB.setSwitched(false);
            this.cTT.bUj.setSwitched(false);
            this.cTT.bUX.setSwitched(false);
            this.cTT.bUo.setSwitched(false);
            this.cTT.bUx.setSwitched(false);
            this.cTT.bUU.setSwitched(false);
            bVar = this.cTR;
            if (aYo) {
                i = i2;
            }
            bVar.dm(i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("asset_sort_type_");
        stringBuilder.append(axm());
        com.iqoption.app.d.setInt(stringBuilder.toString(), this.cTR.Az());
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, a ? "change-asset_sort-volume" : "change-asset_sort-asset").setValue(Double.valueOf(aYo ? 1.0d : 0.0d)).setParameters(u.anp().o("instrument_type", axl()).o("user_balance_type", Integer.valueOf(com.iqoption.app.b.DG().DJ())).anr()).build());
    }

    private void awS() {
        boolean aYo = this.cTT.bUB.aYo();
        int i = 4;
        com.iqoption.a.b bVar;
        if (this.cTT.bUB.aXF()) {
            this.cTT.bUB.reverse();
            bVar = this.cTR;
            if (aYo) {
                i = 3;
            }
            bVar.dm(i);
        } else {
            this.cTT.bTO.setSwitched(false);
            this.cTT.bUj.setSwitched(false);
            this.cTT.bUX.setSwitched(false);
            this.cTT.bUx.setSwitched(false);
            this.cTT.bUo.setSwitched(false);
            this.cTT.bUB.setSwitched(true);
            this.cTT.bUU.setSwitched(false);
            bVar = this.cTR;
            if (!aYo) {
                i = 3;
            }
            bVar.dm(i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("asset_sort_type_");
        stringBuilder.append(axm());
        com.iqoption.app.d.setInt(stringBuilder.toString(), this.cTR.Az());
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "change-asset_sort-profit").setValue(Double.valueOf(aYo ? 1.0d : 0.0d)).setParameters(u.anp().o("instrument_type", axl()).o("user_balance_type", Integer.valueOf(com.iqoption.app.b.DG().DJ())).anr()).build());
    }

    private void awT() {
        boolean aYo = this.cTT.bUj.aYo();
        int i = 6;
        com.iqoption.a.b bVar;
        if (this.cTT.bUj.aXF()) {
            this.cTT.bUj.reverse();
            bVar = this.cTR;
            if (aYo) {
                i = 5;
            }
            bVar.dm(i);
        } else {
            this.cTT.bTO.setSwitched(false);
            this.cTT.bUX.setSwitched(false);
            this.cTT.bUB.setSwitched(false);
            this.cTT.bUx.setSwitched(false);
            this.cTT.bUo.setSwitched(false);
            this.cTT.bUj.setSwitched(true);
            this.cTT.bUU.setSwitched(false);
            bVar = this.cTR;
            if (!aYo) {
                i = 5;
            }
            bVar.dm(i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("asset_sort_type_");
        stringBuilder.append(axm());
        com.iqoption.app.d.setInt(stringBuilder.toString(), this.cTR.Az());
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "change-asset_sort-today").setValue(Double.valueOf(aYo ? 1.0d : 0.0d)).setParameters(u.anp().o("instrument_type", axl()).o("user_balance_type", Integer.valueOf(com.iqoption.app.b.DG().DJ())).anr()).build());
    }

    private void awU() {
        boolean aYo = this.cTT.bUo.aYo();
        int i = 14;
        com.iqoption.a.b bVar;
        if (this.cTT.bUo.aXF()) {
            this.cTT.bUo.reverse();
            bVar = this.cTR;
            if (aYo) {
                i = 13;
            }
            bVar.dm(i);
        } else {
            this.cTT.bTO.setSwitched(false);
            this.cTT.bUB.setSwitched(false);
            this.cTT.bUj.setSwitched(false);
            this.cTT.bUX.setSwitched(false);
            this.cTT.bUx.setSwitched(false);
            this.cTT.bUo.setSwitched(true);
            this.cTT.bUU.setSwitched(false);
            bVar = this.cTR;
            if (!aYo) {
                i = 13;
            }
            bVar.dm(i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("asset_sort_type_");
        stringBuilder.append(axm());
        com.iqoption.app.d.setInt(stringBuilder.toString(), this.cTR.Az());
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "change-asset_sort-expiration").setValue(Double.valueOf(aYo ? 1.0d : 0.0d)).setParameters(u.anp().o("instrument_type", axl()).o("user_balance_type", Integer.valueOf(com.iqoption.app.b.DG().DJ())).anr()).build());
    }

    private void awV() {
        boolean aYo = this.cTT.bUU.aYo();
        int i = 16;
        com.iqoption.a.b bVar;
        if (this.cTT.bUU.aXF()) {
            this.cTT.bUU.reverse();
            bVar = this.cTR;
            if (aYo) {
                i = 15;
            }
            bVar.dm(i);
        } else {
            this.cTT.bTO.setSwitched(false);
            this.cTT.bUB.setSwitched(false);
            this.cTT.bUj.setSwitched(false);
            this.cTT.bUX.setSwitched(false);
            this.cTT.bUx.setSwitched(false);
            this.cTT.bUo.setSwitched(false);
            this.cTT.bUU.setSwitched(true);
            bVar = this.cTR;
            if (!aYo) {
                i = 15;
            }
            bVar.dm(i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("asset_sort_type_");
        stringBuilder.append(axm());
        com.iqoption.app.d.setInt(stringBuilder.toString(), this.cTR.Az());
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "change-asset_sort-spotprofit").setValue(Double.valueOf(aYo ? 1.0d : 0.0d)).setParameters(u.anp().o("instrument_type", axl()).o("user_balance_type", Integer.valueOf(com.iqoption.app.b.DG().DJ())).anr()).build());
    }

    private void awW() {
        boolean aYo = this.cTT.bUx.aYo();
        int i = 12;
        com.iqoption.a.b bVar;
        if (this.cTT.bUx.aXF()) {
            this.cTT.bUx.reverse();
            bVar = this.cTR;
            if (aYo) {
                i = 11;
            }
            bVar.dm(i);
        } else {
            this.cTT.bTO.setSwitched(false);
            this.cTT.bUB.setSwitched(false);
            this.cTT.bUj.setSwitched(false);
            this.cTT.bUX.setSwitched(false);
            this.cTT.bUo.setSwitched(false);
            this.cTT.bUx.setSwitched(true);
            this.cTT.bUU.setSwitched(false);
            bVar = this.cTR;
            if (!aYo) {
                i = 11;
            }
            bVar.dm(i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("asset_sort_type_");
        stringBuilder.append(axm());
        com.iqoption.app.d.setInt(stringBuilder.toString(), this.cTR.Az());
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "change-asset_sort-leverage").setValue(Double.valueOf(aYo ? 1.0d : 0.0d)).setParameters(u.anp().o("instrument_type", axl()).o("user_balance_type", Integer.valueOf(com.iqoption.app.b.DG().DJ())).anr()).build());
    }

    private void awX() {
        boolean aYo = this.cTT.bUX.aYo();
        int i = 8;
        com.iqoption.a.b bVar;
        if (this.cTT.bUX.aXF()) {
            this.cTT.bUX.reverse();
            bVar = this.cTR;
            if (aYo) {
                i = 7;
            }
            bVar.dm(i);
        } else {
            this.cTT.bTO.setSwitched(false);
            this.cTT.bUB.setSwitched(false);
            this.cTT.bUj.setSwitched(false);
            this.cTT.bUx.setSwitched(false);
            this.cTT.bUX.setSwitched(true);
            this.cTT.bUU.setSwitched(false);
            bVar = this.cTR;
            if (!aYo) {
                i = 7;
            }
            bVar.dm(i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("asset_sort_type_");
        stringBuilder.append(axm());
        com.iqoption.app.d.setInt(stringBuilder.toString(), this.cTR.Az());
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "change-asset_sort-spread").setValue(Double.valueOf(aYo ? 1.0d : 0.0d)).setParameters(u.anp().o("instrument_type", axl()).o("user_balance_type", Integer.valueOf(com.iqoption.app.b.DG().DJ())).anr()).build());
    }

    private void awY() {
        int awZ;
        int b;
        int b2;
        int b3;
        int b4;
        int b5;
        int b6;
        boolean Xt = com.iqoption.core.features.instrument.b.Xt();
        LinearLayout linearLayout = this.cTT.bUz;
        Context context = getContext();
        int i = 0;
        if (f.bH(context)) {
            linearLayout.setVisibility(0);
            linearLayout.setOnClickListener(new -$$Lambda$a$Sfll91wmrHoVageWIrp6u8oSfEI(this, linearLayout));
            dm(true);
        } else if (Xt || !com.iqoption.fragment.dialog.f.bw(context)) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            linearLayout.setOnClickListener(new -$$Lambda$a$NbOdtXnN_h3vHrMlsD7S5AeEHYI(this));
            dm(false);
        }
        boolean Xu = com.iqoption.core.features.instrument.b.Xu();
        if (Xt) {
            awZ = awZ();
        } else {
            awZ = 0;
        }
        int W = !com.iqoption.core.features.instrument.b.Xr() ? 0 : W(InstrumentType.DIGITAL_INSTRUMENT);
        int W2 = !com.iqoption.core.features.instrument.b.Xs() ? 0 : W(InstrumentType.FX_INSTRUMENT);
        int W3 = !com.iqoption.core.features.instrument.b.Xv() ? 0 : W(InstrumentType.FOREX_INSTRUMENT);
        int W4 = !com.iqoption.core.features.instrument.b.Xw() ? 0 : W(InstrumentType.CRYPTO_INSTRUMENT);
        if (Xu) {
            b = b(ActiveType.INTRADAY_ACTIVE);
        } else {
            b = 0;
        }
        if (Xu) {
            b2 = b(ActiveType.COMMODITY_ACTIVE);
        } else {
            b2 = 0;
        }
        if (Xu) {
            b3 = b(ActiveType.INDEX_ACTIVE);
        } else {
            b3 = 0;
        }
        if (Xu) {
            b4 = b(ActiveType.BOND_ACTIVE);
        } else {
            b4 = 0;
        }
        if (Xu) {
            b5 = b(ActiveType.ETF_ACTIVE);
        } else {
            b5 = 0;
        }
        if (Xu) {
            b6 = b(ActiveType.STOCK_ACTIVE);
        } else {
            b6 = 0;
        }
        boolean isSelected = this.cTT.bVo.isSelected();
        if (awZ == 0 && W == 0 && W2 == 0) {
            this.cTT.bVo.setSelected(false);
            this.cTT.bVo.setVisibility(8);
            isSelected = false;
        }
        if (awZ == 0) {
            this.cTT.bTQ.setVisibility(8);
        } else {
            RelativeLayout relativeLayout = this.cTT.bTQ;
            if (!isSelected) {
                i = 8;
            }
            relativeLayout.setVisibility(i);
            this.cTT.bVa.setText(com.iqoption.util.c.a.d(ActiveType.BINARY_ACTIVE));
            this.cTT.bTU.setText(String.valueOf(awZ));
        }
        if (W == 0) {
            this.cTT.bUl.setVisibility(8);
        } else {
            this.cTT.bUl.setVisibility(isSelected ? 0 : 8);
            this.cTT.bTY.setText(String.valueOf(W));
        }
        if (W2 == 0) {
            this.cTT.bUt.setVisibility(8);
        } else {
            if (!com.iqoption.app.d.Fa().Gc()) {
                this.cTW.add(new Pair(this.cTT.bUt, Integer.valueOf(R.drawable.asset_list_fx_anim_bg)));
            }
            this.cTT.bUt.setVisibility(isSelected ? 0 : 8);
            this.cTT.bUd.setText(String.valueOf(W2));
        }
        if (this.cTV.booleanValue()) {
            Xt = this.cTT.bUs.isSelected();
            this.cTT.bUs.setVisibility(0);
            this.cTT.bUc.setText(null);
            if (b == 0) {
                this.cTT.bUr.setVisibility(8);
            } else {
                this.cTT.bUr.setVisibility(Xt ? 0 : 8);
                this.cTT.bUb.setText(String.valueOf(b));
            }
            if (W3 == 0) {
                this.cTT.bUq.setVisibility(8);
            } else {
                this.cTT.bUq.setVisibility(Xt ? 0 : 8);
                this.cTT.bUa.setText(String.valueOf(W3));
            }
        } else if (W3 == 0) {
            this.cTT.bUs.setVisibility(8);
        } else {
            this.cTT.bUs.setVisibility(0);
            this.cTT.bUc.setText(String.valueOf(W3));
        }
        if (W4 == 0) {
            this.cTT.bUh.setVisibility(8);
        } else {
            this.cTT.bUh.setVisibility(0);
            this.cTT.bTX.setText(String.valueOf(W4));
        }
        if (b2 == 0) {
            this.cTT.bTT.setVisibility(8);
        } else {
            this.cTT.bTT.setVisibility(0);
            this.cTT.bTW.setText(String.valueOf(b2));
        }
        if (b3 == 0) {
            this.cTT.bUv.setVisibility(8);
        } else {
            this.cTT.bUv.setVisibility(0);
            this.cTT.bUe.setText(String.valueOf(b3));
        }
        if (b4 == 0) {
            this.cTT.bTR.setVisibility(8);
        } else {
            this.cTT.bTR.setVisibility(0);
            this.cTT.bTV.setText(String.valueOf(b4));
        }
        if (b5 == 0) {
            this.cTT.bUm.setVisibility(8);
        } else {
            this.cTT.bUm.setVisibility(0);
            this.cTT.bTZ.setText(String.valueOf(b5));
        }
        if (b6 == 0) {
            this.cTT.bUZ.setVisibility(8);
            return;
        }
        this.cTT.bUZ.setVisibility(0);
        this.cTT.bUf.setText(String.valueOf(b6));
    }

    private /* synthetic */ void aZ(View view) {
        axa();
    }

    private void dm(boolean z) {
        LinearLayout linearLayout = this.cTT.bUz;
        if (linearLayout.getBackground() == null) {
            boolean Gb;
            com.iqoption.app.d aP = com.iqoption.app.d.aP(getContext());
            if (z) {
                Gb = aP.Gb();
            } else {
                Gb = aP.Ga();
            }
            if (!Gb) {
                this.cTW.add(new Pair(linearLayout, Integer.valueOf(R.drawable.asset_list_more_anim_bg)));
            } else if (z) {
                linearLayout.setBackgroundResource(R.drawable.option_type_bg);
            }
        }
    }

    private int W(InstrumentType instrumentType) {
        return com.iqoption.app.helpers.a.Gs().a(instrumentType, false).size();
    }

    private int b(ActiveType activeType) {
        return com.iqoption.app.helpers.a.Gs().a(activeType, false).size();
    }

    private int awZ() {
        return com.iqoption.app.helpers.a.Gs().bw(false).size();
    }

    private void axa() {
        com.iqoption.app.d.Fa().bm(true);
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "more-opportunities_button-click").build());
        com.iqoption.fragment.dialog.f.d(getActivity(), getActivity().getSupportFragmentManager());
        Drawable background = this.cTT.bUz.getBackground();
        if (background instanceof LayerDrawable) {
            ((AnimationDrawable) ((LayerDrawable) background).getDrawable(1)).stop();
        }
        this.cTT.bUz.setBackground(null);
    }

    public void axb() {
        int isSelected = this.cTT.bVo.isSelected() ^ 1;
        this.cTT.bVo.setSelected(isSelected);
        int i = 0;
        isSelected = isSelected != 0 ? 0 : 8;
        int awZ = !com.iqoption.core.features.instrument.b.Xt() ? 0 : awZ();
        int W = !com.iqoption.core.features.instrument.b.Xr() ? 0 : W(InstrumentType.DIGITAL_INSTRUMENT);
        if (com.iqoption.core.features.instrument.b.Xs()) {
            i = W(InstrumentType.FX_INSTRUMENT);
        }
        if (awZ > 0) {
            this.cTT.bTQ.setVisibility(isSelected);
        } else {
            this.cTT.bTQ.setVisibility(8);
        }
        if (W > 0) {
            this.cTT.bUl.setVisibility(isSelected);
        } else {
            this.cTT.bUl.setVisibility(8);
        }
        if (i > 0) {
            this.cTT.bUt.setVisibility(isSelected);
        } else {
            this.cTT.bUt.setVisibility(8);
        }
    }

    public void axc() {
        int isSelected = this.cTT.bUs.isSelected() ^ 1;
        this.cTT.bUs.setSelected(isSelected);
        isSelected = isSelected != 0 ? 0 : 8;
        this.cTT.bUq.setVisibility(isSelected);
        this.cTT.bUr.setVisibility(isSelected);
    }

    public void aW(View view) {
        if (this.cTV.booleanValue()) {
            axc();
        } else {
            aX(view);
        }
    }

    public void aX(View view) {
        FragmentManager fragmentManager = getFragmentManager();
        if (!view.isSelected() && fragmentManager != null) {
            b bVar = this.cTS;
            if (bVar != null) {
                a(bVar, false);
            }
            if (bVar instanceof q) {
                com.iqoption.app.managers.j.a(false, getInstrumentType());
            }
            int id = view.getId();
            if (id == R.id.more_type) {
                this.cTS = new af();
                if (this.cTT.bUz.isSelected()) {
                    a(this.cTS, false);
                }
                aY(this.cTT.bUz);
            } else {
                ActiveType activeType;
                String str = "WHATS_NEW_DIALOG_TYPE_FOREX";
                switch (id) {
                    case R.id.binaryType /*2131362008*/:
                        activeType = ActiveType.BINARY_ACTIVE;
                        db("WHATS_NEW_DIALOG_TYPE_BINARY");
                        break;
                    case R.id.bondType /*2131362013*/:
                        activeType = ActiveType.BOND_ACTIVE;
                        break;
                    case R.id.commodityType /*2131362284*/:
                        activeType = ActiveType.COMMODITY_ACTIVE;
                        break;
                    case R.id.cryptoType /*2131362444*/:
                        activeType = ActiveType.CRYPTO_ACTIVE;
                        break;
                    case R.id.digitalType /*2131362598*/:
                        activeType = ActiveType.DIGITAL_ACTIVE;
                        db("WHATS_NEW_DIALOG_TYPE_DIGITAL");
                        break;
                    case R.id.etfType /*2131362692*/:
                        activeType = ActiveType.ETF_ACTIVE;
                        break;
                    case R.id.forexClassic /*2131362787*/:
                        activeType = ActiveType.FOREX_ACTIVE;
                        db(str);
                        break;
                    case R.id.forexExpiration /*2131362789*/:
                        activeType = ActiveType.INTRADAY_ACTIVE;
                        break;
                    case R.id.forexType /*2131362793*/:
                        activeType = ActiveType.FOREX_ACTIVE;
                        db(str);
                        break;
                    case R.id.fxType /*2131362814*/:
                        activeType = ActiveType.FX_ACTIVE;
                        if (!com.iqoption.app.d.Fa().Gc()) {
                            com.iqoption.app.d.Fa().bo(true);
                            aY(this.cTT.bUt);
                            break;
                        }
                        break;
                    case R.id.indexType /*2131362921*/:
                        activeType = ActiveType.INDEX_ACTIVE;
                        break;
                    case R.id.stockType /*2131363972*/:
                        activeType = ActiveType.STOCK_ACTIVE;
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unexpected: ");
                        stringBuilder.append(view);
                        throw new IllegalStateException(stringBuilder.toString());
                }
                this.cTS = new q(activeType.toInstrumentType(), activeType);
            }
            a(this.cTS, true);
            if (this.cTT.bVo.isSelected()) {
                if (!a(ActiveType.DIGITAL_ACTIVE, ActiveType.BINARY_ACTIVE, ActiveType.FX_ACTIVE)) {
                    axb();
                }
            }
            if (this.cTT.bUs.isSelected()) {
                if (!a(ActiveType.FOREX_ACTIVE, ActiveType.INTRADAY_ACTIVE)) {
                    axc();
                }
            }
            TabType axq = this.cTS.axq();
            TabType tabType = TabType.MORE_TAB;
            String str2 = Event.CATEGORY_BUTTON_PRESSED;
            if (axq == tabType) {
                this.cTT.bTJ.setVisibility(8);
                this.cTT.bTM.setVisibility(8);
                this.cTT.bUu.setVisibility(8);
                com.iqoption.protrader.e.a(fragmentManager, R.id.activeMoreFragment);
                EventManager.BS().a(new Event(str2, "change-asset_more"));
            } else {
                com.iqoption.protrader.e.e(fragmentManager);
                this.cTT.bTJ.setVisibility(0);
                this.cTT.bTM.setVisibility(0);
                this.cTT.bUu.setVisibility(0);
                this.cTR.b(this.cTS);
                d(this.cTS);
                InstrumentType instrumentType = getInstrumentType();
                com.iqoption.app.managers.j.a(true, instrumentType);
                EventManager.BS().a(Event.Builder(str2, "change-asset_tap-instrument").setParameters(u.anp().o("instrument_type", instrumentType).o("user_balance_type", Integer.valueOf(com.iqoption.app.b.DG().DJ())).anr()).build());
            }
            aV(view);
            axd();
        }
    }

    private void axd() {
        if (isAdded()) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            if (a(ActiveType.CRYPTO_ACTIVE, ActiveType.FOREX_ACTIVE, ActiveType.COMMODITY_ACTIVE, ActiveType.STOCK_ACTIVE, ActiveType.ETF_ACTIVE, ActiveType.INDEX_ACTIVE, ActiveType.BOND_ACTIVE)) {
                com.iqoption.protrader.active.a.a(requireActivity(), childFragmentManager, R.id.activeProTraderFragment, getActiveType());
            } else {
                com.iqoption.protrader.active.a.e(childFragmentManager);
            }
        }
    }

    private void aY(@NonNull View view) {
        Drawable background = view.getBackground();
        if (background instanceof LayerDrawable) {
            ((AnimationDrawable) ((LayerDrawable) background).getDrawable(1)).stop();
        }
        if (view.getId() == R.id.fxType) {
            view.setBackgroundColor(getColor(R.color.grey_blur_10_with_bg_second_level));
        } else {
            view.setBackgroundResource(R.drawable.option_type_bg);
        }
    }

    private void db(String str) {
        if (com.iqoption.fragment.dialog.popup.whatsnew.a.E(requireContext(), str)) {
            com.iqoption.core.c.a.biN.postDelayed(new -$$Lambda$a$pCsAmMkzAQr6wII82DJutFRsVrs(this, str), 400);
        }
    }

    private /* synthetic */ void ig(String str) {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            com.iqoption.fragment.dialog.popup.whatsnew.a.a(requireActivity(), fragmentManager, str);
        }
    }

    private void d(b bVar) {
        if (bVar != null && bVar.axq() != TabType.MORE_TAB) {
            Object obj;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("asset_sort_type_");
            stringBuilder.append(axm());
            int i = com.iqoption.app.d.getInt(stringBuilder.toString());
            if (AnonymousClass3.akM[bVar.axq().ordinal()] == 1) {
                switch (((q) bVar).getActiveType()) {
                    case TURBO_ACTIVE:
                    case BINARY_ACTIVE:
                        obj = null;
                        break;
                    case DIGITAL_ACTIVE:
                        obj = 4;
                        break;
                    case FX_ACTIVE:
                        obj = 5;
                        break;
                    case INTRADAY_ACTIVE:
                    case BOND_ACTIVE:
                    case INDEX_ACTIVE:
                    case COMMODITY_ACTIVE:
                    case STOCK_ACTIVE:
                    case ETF_ACTIVE:
                    case FOREX_ACTIVE:
                        obj = 2;
                        break;
                    case CRYPTO_ACTIVE:
                        obj = 3;
                        break;
                }
            }
            obj = 1;
            Object obj2 = this.cTT.bUS.getNextView().getId() == R.id.cfdSortContainer ? 1 : null;
            this.cTT.bTN.setText(obj == 2 ? R.string.volume : R.string.assets);
            RobotoTextView robotoTextView = this.cTT.bUi;
            int i2 = (obj == 4 || obj == 5) ? R.string.hour1 : R.string.today;
            robotoTextView.setText(i2);
            if (obj == null) {
                this.cTT.bUS.setVisibility(0);
                if (obj2 == null) {
                    this.cTT.bUS.showNext();
                }
                if (i == 0 || i > 4) {
                    i = 3;
                }
            } else if (obj == 1) {
                this.cTT.bUS.setVisibility(8);
                if (i == 0 || i > 2) {
                    i = 1;
                }
            } else if (obj == 2) {
                this.cTT.bUS.setVisibility(0);
                this.cTT.bUY.setVisibility(0);
                this.cTT.bUy.setVisibility(0);
                this.cTT.bUp.setVisibility(8);
                this.cTT.bUV.setVisibility(8);
                if (obj2 != null) {
                    this.cTT.bUS.showNext();
                }
                if (i == 0 || i == 3 || i == 4 || i > 12) {
                    i = 9;
                }
            } else if (obj == 3) {
                this.cTT.bUS.setVisibility(0);
                this.cTT.bUY.setVisibility(0);
                this.cTT.bUy.setVisibility(0);
                this.cTT.bUp.setVisibility(8);
                this.cTT.bUV.setVisibility(8);
                if (obj2 != null) {
                    this.cTT.bUS.showNext();
                }
                if (i == 0 || i == 3 || i == 4 || i > 12) {
                    i = 11;
                }
            } else if (obj == 4) {
                this.cTT.bUS.setVisibility(0);
                this.cTT.bUY.setVisibility(8);
                this.cTT.bUy.setVisibility(8);
                this.cTT.bUp.setVisibility(8);
                this.cTT.bUV.setVisibility(0);
                if (obj2 != null) {
                    this.cTT.bUS.showNext();
                }
                if (i == 0 || i == 3 || i == 4 || (i > 6 && i < 15)) {
                    i = 15;
                }
            } else if (obj == 5) {
                this.cTT.bUS.setVisibility(0);
                this.cTT.bUY.setVisibility(8);
                this.cTT.bUy.setVisibility(8);
                this.cTT.bUp.setVisibility(0);
                this.cTT.bUV.setVisibility(8);
                if (obj2 != null) {
                    this.cTT.bUS.showNext();
                }
                if (i == 0 || i == 3 || i == 4 || i > 14 || (i > 6 && i < 13)) {
                    i = 14;
                }
            }
            this.cTT.bTO.setSwitched(false);
            this.cTT.bUj.setSwitched(false);
            this.cTT.bUX.setSwitched(false);
            this.cTT.bUB.setSwitched(false);
            this.cTT.bUx.setSwitched(false);
            this.cTT.bUo.setSwitched(false);
            this.cTT.bUU.setSwitched(false);
            switch (i) {
                case 1:
                    this.cTT.bTO.setSwitched(true);
                    this.cTT.bTO.setReverse(false);
                    break;
                case 2:
                    this.cTT.bTO.setSwitched(true);
                    this.cTT.bTO.setReverse(true);
                    break;
                case 3:
                    this.cTT.bUB.setSwitched(true);
                    this.cTT.bUB.setReverse(false);
                    break;
                case 4:
                    this.cTT.bUB.setSwitched(true);
                    this.cTT.bUB.setReverse(true);
                    break;
                case 5:
                    this.cTT.bUj.setSwitched(true);
                    this.cTT.bUj.setReverse(false);
                    break;
                case 6:
                    this.cTT.bUj.setSwitched(true);
                    this.cTT.bUj.setReverse(true);
                    break;
                case 7:
                    this.cTT.bUX.setSwitched(true);
                    this.cTT.bUX.setReverse(false);
                    break;
                case 8:
                    this.cTT.bUX.setSwitched(true);
                    this.cTT.bUX.setReverse(true);
                    break;
                case 9:
                    this.cTT.bTO.setSwitched(true);
                    this.cTT.bTO.setReverse(false);
                    break;
                case 10:
                    this.cTT.bTO.setSwitched(true);
                    this.cTT.bTO.setReverse(true);
                    break;
                case 11:
                    this.cTT.bUx.setSwitched(true);
                    this.cTT.bUx.setReverse(false);
                    break;
                case 12:
                    this.cTT.bUx.setSwitched(true);
                    this.cTT.bUx.setReverse(true);
                    break;
                case 13:
                    this.cTT.bUo.setSwitched(true);
                    this.cTT.bUo.setReverse(false);
                    break;
                case 14:
                    this.cTT.bUo.setSwitched(true);
                    this.cTT.bUo.setReverse(true);
                    break;
                case 15:
                    this.cTT.bUU.setSwitched(true);
                    this.cTT.bUU.setReverse(false);
                    break;
                case 16:
                    this.cTT.bUU.setSwitched(true);
                    this.cTT.bUU.setReverse(true);
                    break;
            }
            this.cTR.h(i, false);
        }
    }

    private void axe() {
        if (this.cTT.bUu.isSelected()) {
            this.cTT.bUu.setSelected(false);
            this.cTT.bUE.setVisibility(8);
            y.a(getContext(), this.cTT.bUE);
            return;
        }
        com.iqoption.core.d.EC().di("change-asset_search");
        this.cTT.bUu.setSelected(true);
        this.cTT.bUE.setVisibility(0);
        this.cTT.bUE.postDelayed(new -$$Lambda$a$cj32z_iVqQrmByMJjhqAMYg_EkM(this), 100);
    }

    private /* synthetic */ void axn() {
        if (isAdded()) {
            this.cTT.bUE.requestFocus();
            this.cTT.bUE.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, 0.0f, 0.0f, 0));
            this.cTT.bUE.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, 0.0f, 0.0f, 0));
        }
    }

    public void axf() {
        if (isAdded() && this.cTR != null && axk()) {
            this.cTR.b(this.cTS);
            com.iqoption.app.managers.j.a(true, getInstrumentType());
        }
    }

    private void axg() {
        if (isAdded()) {
            com.iqoption.a.b bVar = this.cTR;
            if (bVar != null) {
                bVar.c(this.cTS);
            }
        }
    }

    private void X(InstrumentType instrumentType) {
        if (isAdded()) {
            com.iqoption.a.b bVar = this.cTR;
            if (bVar != null) {
                b bVar2 = this.cTS;
                if (bVar2 != null) {
                    bVar.c(bVar2);
                }
            }
        }
    }

    @Nullable
    private View a(b bVar, boolean z) {
        return a(bVar, z, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ba  */
    @androidx.annotation.Nullable
    private android.view.View a(com.iqoption.fragment.b r7, boolean r8, boolean r9) {
        /*
        r6 = this;
        r0 = 0;
        if (r7 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = com.iqoption.fragment.a.AnonymousClass3.akM;
        r2 = r7.axq();
        r2 = r2.ordinal();
        r1 = r1[r2];
        r2 = 2;
        r3 = 1;
        if (r1 == r3) goto L_0x0022;
    L_0x0014:
        if (r1 == r2) goto L_0x0018;
    L_0x0016:
        goto L_0x00aa;
    L_0x0018:
        r7 = r6.cTT;
        r0 = r7.bUz;
        r7 = r6.cTT;
        r7 = r7.bUQ;
        goto L_0x00ab;
    L_0x0022:
        r1 = com.iqoption.fragment.a.AnonymousClass3.akL;
        r7 = (com.iqoption.fragment.q) r7;
        r7 = r7.getActiveType();
        r7 = r7.ordinal();
        r7 = r1[r7];
        switch(r7) {
            case 1: goto L_0x00a1;
            case 2: goto L_0x00a1;
            case 3: goto L_0x0098;
            case 4: goto L_0x008f;
            case 5: goto L_0x0086;
            case 6: goto L_0x007d;
            case 7: goto L_0x0074;
            case 8: goto L_0x006b;
            case 9: goto L_0x0062;
            case 10: goto L_0x0059;
            case 11: goto L_0x003f;
            case 12: goto L_0x0035;
            default: goto L_0x0033;
        };
    L_0x0033:
        goto L_0x00aa;
    L_0x0035:
        r7 = r6.cTT;
        r0 = r7.bUh;
        r7 = r6.cTT;
        r7 = r7.bUI;
        goto L_0x00ab;
    L_0x003f:
        r7 = r6.cTV;
        r7 = r7.booleanValue();
        if (r7 == 0) goto L_0x0050;
    L_0x0047:
        r7 = r6.cTT;
        r0 = r7.bUq;
        r7 = r6.cTT;
        r7 = r7.bUM;
        goto L_0x00ab;
    L_0x0050:
        r7 = r6.cTT;
        r0 = r7.bUs;
        r7 = r6.cTT;
        r7 = r7.bUL;
        goto L_0x00ab;
    L_0x0059:
        r7 = r6.cTT;
        r0 = r7.bUm;
        r7 = r6.cTT;
        r7 = r7.bUK;
        goto L_0x00ab;
    L_0x0062:
        r7 = r6.cTT;
        r0 = r7.bUZ;
        r7 = r6.cTT;
        r7 = r7.bUR;
        goto L_0x00ab;
    L_0x006b:
        r7 = r6.cTT;
        r0 = r7.bTT;
        r7 = r6.cTT;
        r7 = r7.bUH;
        goto L_0x00ab;
    L_0x0074:
        r7 = r6.cTT;
        r0 = r7.bUv;
        r7 = r6.cTT;
        r7 = r7.bUP;
        goto L_0x00ab;
    L_0x007d:
        r7 = r6.cTT;
        r0 = r7.bTR;
        r7 = r6.cTT;
        r7 = r7.bUG;
        goto L_0x00ab;
    L_0x0086:
        r7 = r6.cTT;
        r0 = r7.bUr;
        r7 = r6.cTT;
        r7 = r7.bUN;
        goto L_0x00ab;
    L_0x008f:
        r7 = r6.cTT;
        r0 = r7.bUt;
        r7 = r6.cTT;
        r7 = r7.bUO;
        goto L_0x00ab;
    L_0x0098:
        r7 = r6.cTT;
        r0 = r7.bUl;
        r7 = r6.cTT;
        r7 = r7.bUJ;
        goto L_0x00ab;
    L_0x00a1:
        r7 = r6.cTT;
        r0 = r7.bTQ;
        r7 = r6.cTT;
        r7 = r7.bUF;
        goto L_0x00ab;
    L_0x00aa:
        r7 = r0;
    L_0x00ab:
        r1 = 0;
        if (r0 == 0) goto L_0x00b7;
    L_0x00ae:
        r4 = r0.isSelected();
        if (r4 == r8) goto L_0x00b5;
    L_0x00b4:
        goto L_0x00b7;
    L_0x00b5:
        r4 = 0;
        goto L_0x00b8;
    L_0x00b7:
        r4 = 1;
    L_0x00b8:
        if (r4 == 0) goto L_0x00f2;
    L_0x00ba:
        if (r0 == 0) goto L_0x00bf;
    L_0x00bc:
        r0.setSelected(r8);
    L_0x00bf:
        if (r7 == 0) goto L_0x00f2;
    L_0x00c1:
        r4 = r6.getLineHeight();
        r5 = new com.iqoption.view.a.a.a;
        r5.<init>(r7);
        r7 = new int[r2];
        if (r8 == 0) goto L_0x00d0;
    L_0x00ce:
        r2 = 0;
        goto L_0x00d1;
    L_0x00d0:
        r2 = r4;
    L_0x00d1:
        r7[r1] = r2;
        if (r8 == 0) goto L_0x00d6;
    L_0x00d5:
        r1 = r4;
    L_0x00d6:
        r7[r3] = r1;
        r7 = android.animation.ValueAnimator.ofInt(r7);
        r7.addUpdateListener(r5);
        if (r9 == 0) goto L_0x00e4;
    L_0x00e1:
        r8 = 0;
        goto L_0x00e6;
    L_0x00e4:
        r8 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
    L_0x00e6:
        r8 = r7.setDuration(r8);
        r9 = com.iqoption.view.a.a.c.egR;
        r8.setInterpolator(r9);
        r7.start();
    L_0x00f2:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.a.a(com.iqoption.fragment.b, boolean, boolean):android.view.View");
    }

    private int getLineHeight() {
        if (this.cTX == 0) {
            this.cTX = fA(R.dimen.dp46);
        }
        return this.cTX;
    }

    private void axi() {
        AnonymousClass2 anonymousClass2 = new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                for (Pair pair : a.this.cTW) {
                    a.this.q((View) pair.first, ((Integer) pair.second).intValue());
                }
                a.this.cTW.clear();
                a.this.axf();
                a.this.axd();
            }
        };
        if (af.ebR) {
            int fA = fA(R.dimen.dp12);
            float f = (float) (-fA(R.dimen.dp6));
            this.cTT.bVp.setTranslationX(f);
            this.cTT.bVp.setTranslationY(f);
            this.cTT.bVp.setAlpha(0.0f);
            this.cTT.bTI.setTranslationX(f);
            this.cTT.bTI.setTranslationY(f);
            this.cTT.bTI.setAlpha(0.0f);
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.cTT.aRl, fA, fA, (float) fA, (float) Math.hypot((double) this.cTT.aRl.getWidth(), (double) this.cTT.aRl.getHeight()));
            createCircularReveal.setDuration(400).setInterpolator(com.iqoption.view.a.a.c.egR);
            ScrollView scrollView = this.cTT.bVp;
            r6 = new PropertyValuesHolder[3];
            r6[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f});
            r6[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{0.0f});
            r6[2] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(scrollView, r6);
            ofPropertyValuesHolder.setDuration(300).setInterpolator(com.iqoption.view.a.a.c.egR);
            ConstraintLayout constraintLayout = this.cTT.bTI;
            r5 = new PropertyValuesHolder[3];
            r5[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f});
            r5[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{0.0f});
            r5[2] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f});
            ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(constraintLayout, r5);
            ofPropertyValuesHolder2.setDuration(300).setInterpolator(com.iqoption.view.a.a.c.egR);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(createCircularReveal);
            animatorSet.play(ofPropertyValuesHolder2).with(ofPropertyValuesHolder).after(100);
            animatorSet.addListener(anonymousClass2);
            animatorSet.start();
        } else {
            float f2 = (float) (-fA(R.dimen.dp12));
            this.cTT.aRl.setTranslationX(f2);
            this.cTT.aRl.setTranslationY(f2);
            this.cTT.aRl.setPivotX(1.0f);
            this.cTT.aRl.setPivotY(1.0f);
            this.cTT.aRl.setScaleX(0.3f);
            this.cTT.aRl.setScaleY(0.3f);
            this.cTT.aRl.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).translationX(0.0f).translationY(0.0f).setDuration(axh()).setListener(anonymousClass2).setInterpolator(com.iqoption.view.a.a.c.egR).start();
        }
        this.cTT.aoG.setAlpha(0.0f);
        this.cTT.aoG.animate().alpha(1.0f);
    }

    public void onStart() {
        super.onStart();
        this.cTU.register();
        com.iqoption.a.b bVar = this.cTR;
        if (bVar != null) {
            bVar.onStart();
        }
    }

    public void onStop() {
        super.onStop();
        if (axk()) {
            com.iqoption.app.managers.j.a(false, getInstrumentType());
        }
        this.cTU.unregister();
        com.iqoption.a.b bVar = this.cTR;
        if (bVar != null) {
            bVar.onStop();
        }
    }

    public boolean onClose() {
        if (akX()) {
            y.a(getContext(), this.cTT.bUE);
        } else {
            requireFragmentManager().popBackStack();
            IQApp.Ex().bd(new d(false, this.ajm));
        }
        return true;
    }

    public void att() {
        axi();
    }

    public void atu() {
        int fA = fA(R.dimen.dp12);
        this.cTT.aRl.setPivotX(1.0f);
        this.cTT.aRl.setPivotY(1.0f);
        this.cTT.aRl.animate().setDuration(axj()).translationY((float) (-fA)).scaleX(0.9f).scaleY(0.6f).alpha(0.0f).setInterpolator(com.iqoption.view.a.a.c.egR).start();
        this.cTT.aoG.animate().alpha(0.0f);
    }

    private void q(View view, @DrawableRes int i) {
        p.a(com.iqoption.core.c.a.biL.c(new a(i)), new b(view), com.iqoption.core.c.a.biN);
    }

    private boolean axk() {
        b bVar = this.cTS;
        return bVar != null && (bVar instanceof q);
    }

    @Nullable
    private InstrumentType getInstrumentType() {
        b bVar = this.cTS;
        return bVar instanceof q ? ((q) bVar).getInstrumentType() : null;
    }

    private boolean a(ActiveType... activeTypeArr) {
        return a(this.cTS, activeTypeArr);
    }

    @Nullable
    private ActiveType getActiveType() {
        b bVar = this.cTS;
        return bVar instanceof q ? ((q) bVar).getActiveType() : null;
    }

    private String axl() {
        b bVar = this.cTS;
        if (bVar instanceof q) {
            return ((q) bVar).getInstrumentType().getServerValue();
        }
        return bVar.axq().name();
    }

    private String axm() {
        InstrumentType instrumentType = getInstrumentType();
        ActiveType activeType = getActiveType();
        if (instrumentType != null) {
            return instrumentType.toString();
        }
        if (activeType != null) {
            return activeType.toString();
        }
        return TabType.MORE_TAB.name();
    }

    private static boolean a(b bVar, ActiveType... activeTypeArr) {
        if (bVar != null && (bVar instanceof q)) {
            ActiveType activeType = ((q) bVar).getActiveType();
            for (ActiveType activeType2 : activeTypeArr) {
                if (activeType2 == activeType) {
                    return true;
                }
            }
        }
        return false;
    }
}
