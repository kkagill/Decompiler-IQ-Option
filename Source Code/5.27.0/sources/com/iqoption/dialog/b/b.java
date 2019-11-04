package com.iqoption.dialog.b;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.af;
import com.iqoption.core.util.j;
import com.iqoption.dto.entity.ActiveQuote;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.e.gy;
import com.iqoption.e.pd;
import com.iqoption.fragment.ai;
import com.iqoption.fragment.b.g;
import com.iqoption.util.ab;
import com.iqoption.util.ak;
import com.iqoption.util.e;
import com.iqoption.util.f;
import com.iqoption.util.v;
import com.iqoption.view.RobotoEditText;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;

/* compiled from: TpslDialog */
public final class b extends g {
    private int akR = 6;
    @ColorInt
    private int amj;
    @ColorInt
    private int amk;
    @ColorInt
    private int aml;
    private a cKG;
    private volatile boolean cKH = false;
    private boolean cKI = true;
    private boolean cKJ = false;
    private boolean cKK = false;
    private boolean cKL = false;
    private com.iqoption.view.drawable.a cKM;
    private com.iqoption.view.drawable.a cKN;
    private com.iqoption.view.drawable.a cKO;
    private gy cKP;
    private pd cKQ;
    private ViewGroup cKR;
    private double cKS;
    private double cKT;
    private AnimatorSet cKU = null;
    private Double cKV = null;
    private Double cKW;
    private double cKX = 0.0d;
    private final com.iqoption.util.f.b cKY = new com.iqoption.util.f.b() {
        public void F(double d) {
            b.this.cKP.cdv.setText(af.b(d, "+"));
            b.this.cKP.cdv.setTextColor(b.this.amj);
        }

        public void G(double d) {
            b.this.cKP.cdv.setText(af.b(d, "-"));
            b.this.cKP.cdv.setTextColor(b.this.amk);
        }

        public void H(double d) {
            b.this.cKP.cdv.setText(af.s(0.0d));
            b.this.cKP.cdv.setTextColor(b.this.aml);
        }
    };
    private c cKZ = new c(this, null);

    /* compiled from: TpslDialog */
    public static class a {
        public final Boolean cKB;
        public final Boolean cKD;
        public final Double cLb;
        public final Double cLc;

        public a(Double d, Double d2, Boolean bool, Boolean bool2) {
            this.cLb = d;
            this.cLc = d2;
            this.cKB = bool;
            this.cKD = bool2;
        }
    }

    /* compiled from: TpslDialog */
    private static class c implements com.iqoption.view.a.b.a {
        private final WeakReference<b> bJf;

        /* synthetic */ c(b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        private c(b bVar) {
            this.bJf = new WeakReference(bVar);
        }

        public void onTick(long j) {
            b bVar = (b) this.bJf.get();
            if (bVar != null && bVar.isAdded()) {
                bVar.aul();
            }
        }
    }

    /* compiled from: TpslDialog */
    public static class b extends com.iqoption.system.a.c<Boolean> {
    }

    /* compiled from: TpslDialog */
    private static class d extends com.iqoption.system.c.b<b, Object> {
        public d(b bVar) {
            super(bVar);
        }

        /* renamed from: a */
        public void v(@NonNull b bVar, @NonNull Object obj) {
            if (bVar.isAdded()) {
                bVar.onClose();
            }
        }

        /* renamed from: a */
        public void c(@NonNull b bVar, Throwable th) {
            if (bVar.isAdded()) {
                bVar.aud();
            }
        }
    }

    public String getEventName() {
        return "tpsl-limits_open-settings";
    }

    public static void a(FragmentManager fragmentManager, @IdRes int i, Position position) {
        a(fragmentManager, i, new e().a("arg.position", (Parcelable) position).toBundle());
    }

    public static void a(FragmentManager fragmentManager, int i, InstrumentType instrumentType, boolean z, Double d, Double d2, Double d3, Boolean bool, int i2, double d4, Boolean bool2) {
        e i3 = new e().O("arg.active.id", i).a("arg.option.type", (Serializable) instrumentType).z("arg.is.long", z).O("arg.leverage", i2).i("arg.invest", d4);
        if (d != null) {
            i3.i("arg.pending.value", d.doubleValue());
        }
        if (d2 != null) {
            i3.i("arg.take.profit.percente", d2.doubleValue());
        }
        if (d3 != null) {
            i3.i("arg.stop.lose.percente", d3.doubleValue());
        }
        if (bool != null) {
            i3.z("arg.margin.call", bool.booleanValue());
        }
        if (bool2 != null) {
            i3.z("arg.trailing.stop", bool2.booleanValue());
        }
        a(fragmentManager, (int) R.id.other_fragment, i3.toBundle());
    }

    private static void a(FragmentManager fragmentManager, @IdRes int i, Bundle bundle) {
        String str = "TpslDialog";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(i, K(bundle), str).addToBackStack(str).commit();
        }
    }

    private static b K(Bundle bundle) {
        b bVar = new b();
        bVar.setArguments(bundle);
        return bVar;
    }

    private double A(double d) {
        return ab.i(this.cKG.getInvest(), this.cKG.y(d));
    }

    private double B(double d) {
        a aVar = this.cKG;
        return aVar.z(ab.j(aVar.getInvest(), d));
    }

    private void da(boolean z) {
        if (z) {
            this.cKQ.getRoot().setVisibility(0);
            this.cKQ.cmo.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.appear_from_rigth_to_left_with_alpha_show));
            double y = this.cKP.ccW.isSelected() ? this.cKI ? this.cKG.y(this.cKT) : A(this.cKT) : this.cKI ? this.cKG.y(this.cKS) : A(this.cKS);
            if (y > 0.0d) {
                if (this.cKQ.cmp.getNextView().getId() == R.id.signPlus) {
                    this.cKQ.cmp.showNext();
                }
            } else if (this.cKQ.cmp.getNextView().getId() == R.id.signMinus) {
                this.cKQ.cmp.showNext();
            }
            this.cKQ.cgj.setSign((int) Math.signum(y));
            this.cKQ.clr.setHint(j.fq(this.cKI ? 1 : 2).format(Math.abs(y)));
            this.cKQ.clr.requestFocus();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.appear_from_rigth_to_left_with_alpha_hide);
        loadAnimation.setAnimationListener(com.iqoption.view.a.a.a.a.c(new com.iqoption.view.a.a.a.b() {
            public void execute() {
                if (b.this.isAdded()) {
                    b.this.cKQ.cmo.clearAnimation();
                    b.this.cKQ.getRoot().setVisibility(8);
                }
            }
        }));
        this.cKQ.cmo.startAnimation(loadAnimation);
        this.cKQ.clr.setText("");
        this.cKP.ccW.setSelected(false);
        this.cKP.cdi.setSelected(false);
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.cKP = gy.o(layoutInflater, viewGroup, false);
        return this.cKP.getRoot();
    }

    public View b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.cKQ = pd.s(layoutInflater, viewGroup, false);
        this.cKR = viewGroup;
        View root = this.cKQ.getRoot();
        root.setVisibility(8);
        return root;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(View view, Bundle bundle) {
        int leverage;
        Context context;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str = "arg.position";
        if (arguments.containsKey(str)) {
            this.cKG = new a((Position) arguments.getParcelable(str));
        } else {
            a aVar;
            this.cKG = new a(arguments.getInt("arg.active.id"), (InstrumentType) arguments.getSerializable("arg.option.type"), arguments.getBoolean("arg.is.long"), arguments.getInt("arg.leverage"), arguments.getDouble("arg.invest"));
            InstrumentType instrumentType = this.cKG.getInstrumentType();
            leverage = this.cKG.getLeverage();
            String str2 = "arg.pending.value";
            if (arguments.containsKey(str2)) {
                this.cKG.cZ(true);
                this.cKG.g(Double.valueOf(arguments.getDouble(str2)));
            } else {
                a aVar2 = this.cKG;
                aVar2.g(ActiveQuote.getCurrentOpenPriceEnrolled(aVar2.atX(), this.cKG.isLong(), instrumentType, leverage));
                this.cKP.cdf.setVisibility(8);
                this.cKP.cdr.setVisibility(8);
            }
            str = "arg.margin.call";
            if (arguments.containsKey(str)) {
                this.cKG.cY(arguments.getBoolean(str));
            }
            str = "arg.take.profit.percente";
            if (arguments.containsKey(str)) {
                aVar = this.cKG;
                aVar.i(Double.valueOf(aVar.z(arguments.getDouble(str))));
            }
            str = "arg.stop.lose.percente";
            if (arguments.containsKey(str)) {
                aVar = this.cKG;
                aVar.h(Double.valueOf(aVar.z(arguments.getDouble(str))));
            }
            str = "arg.trailing.stop";
            if (arguments.containsKey(str)) {
                this.cKG.cW(arguments.getBoolean(str));
            }
        }
        this.cKI = true;
        this.amj = ContextCompat.getColor(getContext(), R.color.green);
        this.amk = ContextCompat.getColor(getContext(), R.color.red);
        this.aml = ContextCompat.getColor(getContext(), R.color.white);
        this.cKM = new com.iqoption.view.drawable.a(getContext(), R.color.green);
        this.cKN = new com.iqoption.view.drawable.a(getContext(), R.color.red);
        this.cKO = new com.iqoption.view.drawable.a(getContext(), R.color.white);
        com.iqoption.app.managers.feature.c Iw = com.iqoption.app.managers.feature.c.Iw();
        this.cKJ = Iw.ej("profit-loss-limits");
        this.cKK = Iw.ej("margin-add-on");
        this.cKL = Iw.ej("trailing-stop");
        this.cKQ.getRoot().setOnClickListener(new -$$Lambda$b$2SB0kah6YftHuRCvfKpmJHDFmgg(this));
        this.cKQ.clr.setOnTouchListener(-$$Lambda$b$yR2UxqSYPrKyxT1O_ZIpCREaBNs.INSTANCE);
        RobotoEditText robotoEditText = this.cKQ.clr;
        InputFilter[] inputFilterArr = new InputFilter[1];
        boolean z = false;
        inputFilterArr[0] = new com.iqoption.charttools.c.a.a(0.1d, 9999999.9d);
        robotoEditText.setFilters(inputFilterArr);
        this.cKQ.cmn.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                String replaceAll = b.this.cKQ.clr.getText().toString().replaceAll("[^\\d\\.]", "");
                boolean z = true;
                double d = 0.0d;
                if (!TextUtils.isEmpty(replaceAll)) {
                    try {
                        double sign = (double) b.this.cKQ.cgj.getSign();
                        d = Double.parseDouble(replaceAll);
                        Double.isNaN(sign);
                        d *= sign;
                        if (b.this.cKP.ccW.isSelected()) {
                            sign = b.this.cKI ? b.this.cKG.z(d) : b.this.B(d);
                            b.this.C(sign);
                            if (b.this.E(sign)) {
                                b.this.cKT = sign;
                                b.this.auk();
                            }
                        } else {
                            sign = b.this.cKI ? b.this.cKG.z(d) : b.this.B(d);
                            if (b.this.D(sign)) {
                                b.this.cKS = sign;
                                b.this.auj();
                            }
                        }
                        z = false;
                    } catch (NumberFormatException unused) {
                    }
                }
                if (z) {
                    com.iqoption.app.a.b.dY(b.this.getString(R.string.incorrect_value));
                    c.auv();
                }
                c.a(b.this.cKI ? "percentage" : "amount", z, d);
                b.this.da(false);
            }
        });
        this.cKQ.cgj.setKeyListener(new -$$Lambda$b$9yOd3mzk5v4HRDrwXNk-K7nBl9o(this));
        this.cKQ.cgj.setChangeSignListener(new -$$Lambda$b$BOi1zy2e5pHMVZiEoJCtzLu4Wvo(this));
        this.cKP.ccV.setLayoutTransition(ak.anP());
        this.cKP.cdq.setOnClickListener(new -$$Lambda$b$YHqWFZW3HV_LgFb9qI9drmWh69Q(this));
        this.cKP.cde.setOnClickListener(new -$$Lambda$b$KlwOKIGom1kJ0yZSKpQSxln8-e8(this));
        this.cKP.cdn.setOnClickListener(new -$$Lambda$b$4I95FoCOz1yfL7Yx1KGcerjZERo(this));
        this.cKP.cdb.setOnClickListener(new -$$Lambda$b$e8i0D2x10HebslWR_bRB0ty2BBQ(this));
        com.iqoption.core.microservices.tradingengine.response.active.a a = com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(this.cKG.atX()), this.cKG.getInstrumentType());
        if (a != null) {
            str = com.iqoption.core.microservices.tradingengine.response.active.d.B(a);
            this.akR = a.getPrecision();
        } else {
            str = "";
        }
        RobotoTextView robotoTextView = this.cKP.ccP;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(", ");
        stringBuilder.append(com.iqoption.util.j.r(Double.valueOf(this.cKG.getInvest())));
        robotoTextView.setText(stringBuilder.toString());
        robotoTextView = this.cKP.ccP;
        if (this.cKG.isLong()) {
            context = getContext();
            leverage = R.drawable.ic_call_position;
        } else {
            context = getContext();
            leverage = R.drawable.ic_put_position;
        }
        ak.setDrawableLeft(robotoTextView, AppCompatResources.getDrawable(context, leverage));
        AnonymousClass3 anonymousClass3 = new com.iqoption.view.d.b() {
            public void M(View view) {
                Animator animatorSet;
                Point ai;
                Animator a;
                Animator a2;
                Animator animatorSet2;
                if (b.this.cKU != null) {
                    b.this.cKU.cancel();
                }
                String str = "animationFrame";
                View findViewWithTag = b.this.cKR.findViewWithTag(str);
                if (findViewWithTag != null) {
                    b.this.cKR.removeView(findViewWithTag);
                }
                FrameLayout frameLayout = new FrameLayout(b.this.getContext());
                frameLayout.setTag(str);
                frameLayout.setLayoutParams(new LayoutParams(-1, -1));
                if (b.this.cKP.cdq.getNextView().getId() == R.id.takeProfitAdd) {
                    b.this.cKP.cdj.setAlpha(0.0f);
                    b.this.cKP.cdo.setAlpha(0.0f);
                    animatorSet = new AnimatorSet();
                    Animator[] animatorArr = new Animator[2];
                    animatorArr[0] = ObjectAnimator.ofFloat(b.this.cKP.cdj, View.ALPHA, new float[]{1.0f});
                    animatorArr[1] = ObjectAnimator.ofFloat(b.this.cKP.cdo, View.ALPHA, new float[]{1.0f});
                    animatorSet.playTogether(animatorArr);
                    com.iqoption.core.util.b.a(animatorSet, 200);
                    ai = ak.ai(b.this.cKP.cdj);
                    Point ai2 = ak.ai(b.this.cKP.cdo);
                    TextView textView = new TextView(b.this.getContext());
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b.this.cKP.cdj.getLayoutParams());
                    layoutParams.setMargins(ai.x, ai.y, 0, 0);
                    textView.setLayoutParams(layoutParams);
                    textView.setGravity(b.this.cKP.cdj.getGravity());
                    textView.setMaxLines(b.this.cKP.cdj.getMaxLines());
                    textView.setTextColor(b.this.cKP.cdj.getTextColors());
                    textView.setTextSize(0, b.this.cKP.cdj.getTextSize());
                    textView.setText(b.this.cKP.cdj.getText());
                    TextView textView2 = new TextView(b.this.getContext());
                    layoutParams = new FrameLayout.LayoutParams(b.this.cKP.cdo.getLayoutParams());
                    layoutParams.setMargins(ai2.x, ai2.y, 0, 0);
                    textView2.setLayoutParams(layoutParams);
                    textView2.setGravity(b.this.cKP.cdo.getGravity());
                    textView2.setMaxLines(b.this.cKP.cdo.getMaxLines());
                    textView2.setTextColor(b.this.cKP.cdo.getTextColors());
                    textView2.setTextSize(0, b.this.cKP.cdo.getTextSize());
                    textView2.setText(b.this.cKP.cdo.getText());
                    frameLayout.addView(textView);
                    frameLayout.addView(textView2);
                    b bVar = b.this;
                    a = bVar.a(bVar.a((View) textView, ai, ai2), b.this.a((View) textView2, ai2, ai));
                } else {
                    animatorSet = null;
                    a = null;
                }
                if (b.this.cKP.cde.getNextView().getId() == R.id.stopLossAdd) {
                    b.this.cKP.ccX.setAlpha(0.0f);
                    b.this.cKP.cdc.setAlpha(0.0f);
                    ai = ak.ai(b.this.cKP.ccX);
                    Point ai3 = ak.ai(b.this.cKP.cdc);
                    TextView textView3 = new TextView(b.this.getContext());
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(b.this.cKP.ccX.getLayoutParams());
                    layoutParams2.setMargins(ai.x, ai.y, 0, 0);
                    textView3.setLayoutParams(layoutParams2);
                    textView3.setGravity(b.this.cKP.ccX.getGravity());
                    textView3.setMaxLines(b.this.cKP.ccX.getMaxLines());
                    textView3.setTextColor(b.this.cKP.ccX.getTextColors());
                    textView3.setTextSize(0, b.this.cKP.ccX.getTextSize());
                    textView3.setText(b.this.cKP.ccX.getText());
                    TextView textView4 = new TextView(b.this.getContext());
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(b.this.cKP.cdc.getLayoutParams());
                    layoutParams3.setMargins(ai3.x, ai3.y, 0, 0);
                    textView4.setLayoutParams(layoutParams3);
                    textView4.setGravity(b.this.cKP.cdc.getGravity());
                    textView4.setMaxLines(b.this.cKP.cdc.getMaxLines());
                    textView4.setTextColor(b.this.cKP.cdc.getTextColors());
                    textView4.setTextSize(0, b.this.cKP.cdc.getTextSize());
                    textView4.setText(b.this.cKP.cdc.getText());
                    frameLayout.addView(textView3);
                    frameLayout.addView(textView4);
                    b bVar2 = b.this;
                    a2 = bVar2.a(bVar2.a((View) textView3, ai, ai3), b.this.a((View) textView4, ai3, ai));
                    animatorSet2 = new AnimatorSet();
                    Animator[] animatorArr2 = new Animator[2];
                    animatorArr2[0] = ObjectAnimator.ofFloat(b.this.cKP.ccX, View.ALPHA, new float[]{1.0f});
                    animatorArr2[1] = ObjectAnimator.ofFloat(b.this.cKP.cdc, View.ALPHA, new float[]{1.0f});
                    animatorSet2.playTogether(animatorArr2);
                    com.iqoption.core.util.b.a(animatorSet2, 200);
                } else {
                    a2 = null;
                    animatorSet2 = null;
                }
                b.this.cKR.addView(frameLayout);
                b.this.cKU = new AnimatorSet();
                b.this.cKU.setInterpolator(com.iqoption.view.a.a.c.egR);
                if (!(a2 == null || animatorSet2 == null)) {
                    b.this.cKU.play(a2);
                    b.this.cKU.play(animatorSet2).after(100);
                }
                if (!(a == null || animatorSet == null)) {
                    b.this.cKU.play(a);
                    b.this.cKU.play(animatorSet).after(100);
                }
                b.this.cKU.addListener(com.iqoption.view.a.a.a.a.c(new -$$Lambda$b$3$kicBc84RZ-_M1N9o0z-9L7eByIU(this)));
                b.this.cKU.start();
                b bVar3 = b.this;
                bVar3.cKI = bVar3.cKI ^ 1;
                b.this.auj();
                b.this.auk();
                c.aut();
            }

            private /* synthetic */ void auq() {
                if (b.this.isAdded()) {
                    View findViewWithTag = b.this.cKR.findViewWithTag("animationFrame");
                    if (findViewWithTag != null) {
                        b.this.cKR.removeView(findViewWithTag);
                    }
                }
            }
        };
        this.cKP.cdd.setOnClickListener(anonymousClass3);
        this.cKP.cdp.setOnClickListener(anonymousClass3);
        this.cKP.bYq.setOnClickListener(new -$$Lambda$b$G29rmjBfFc3QsDKTdDSAlKODqnU(this));
        this.cKP.aQO.setOnClickListener(new -$$Lambda$b$IU839M8DKj-TK8QeyV05NWqxm3Q(this));
        this.cKP.ccR.setOnClickListener(new -$$Lambda$b$lCIWzxBVX2_Taj5XN-Qj1_XKq40(this));
        this.cKP.ccY.setOnClickListener(new -$$Lambda$b$fhXiYgrQe2LXwMGQc1QvwN1IYsU(this));
        this.cKP.cda.setOnClickListener(new -$$Lambda$b$hf89NTUGUI7UDJ9Wi7prauAfTkQ(this));
        this.cKP.ccZ.setOnClickListener(new -$$Lambda$b$dIOW2WRGfB_cT2ArTHxNOWna5co(this));
        this.cKP.cdk.setOnClickListener(new -$$Lambda$b$-44SMDpPpZtK2nFAvTipT8fb2Ws(this));
        this.cKP.cdm.setOnClickListener(new -$$Lambda$b$rLrkR0fNbMM-30pN1k_OPKL8b2U(this));
        this.cKP.cdl.setOnClickListener(new -$$Lambda$b$29ovDMHfFsn3XoMGdL28MQu94S0(this));
        boolean cX = this.cKG.cX(this.cKK);
        if (!this.cKK) {
            if (!this.cKG.aub()) {
                this.cKP.ccT.setVisibility(8);
            } else if (!cX) {
                this.cKP.ccT.setVisibility(8);
            }
        }
        this.cKP.ccT.setChecked(cX);
        this.cKP.ccT.setOnCheckedChangeListener(new -$$Lambda$b$2TK2OJ1iMNz9WxnfKFerMOOtK24(this));
        this.cKW = this.cKG.atZ();
        this.cKP.ccS.setOnClickListener(new -$$Lambda$b$9dHHtlUhbBV3QYUPbMMPVLMBc1Q(this));
        Double takeProfitValue = this.cKG.getTakeProfitValue();
        this.cKS = takeProfitValue == null ? this.cKG.z(100.0d) : takeProfitValue.doubleValue();
        double d = this.cKS;
        if (d < 0.0d) {
            d = 0.0d;
        }
        this.cKS = d;
        if (takeProfitValue == null) {
            if (this.cKP.cdq.getNextView().getId() == R.id.takeProfitAdd) {
                this.cKP.cdq.showNext();
            }
        } else if (this.cKP.cdq.getNextView().getId() == R.id.takeProfitEdit) {
            this.cKP.cdq.showNext();
        }
        takeProfitValue = this.cKG.getStopLoseValue();
        if (takeProfitValue == null) {
            a aVar3 = this.cKG;
            d = aVar3.z(aVar3.getStopOutThreshold());
        } else {
            d = takeProfitValue.doubleValue();
        }
        this.cKT = d;
        d = this.cKT;
        if (d < 0.0d) {
            d = 0.0d;
        }
        this.cKT = d;
        if (takeProfitValue == null) {
            if (this.cKP.cde.getNextView().getId() == R.id.stopLossAdd) {
                this.cKP.cde.showNext();
            }
        } else if (this.cKP.cde.getNextView().getId() == R.id.stopLossEdit) {
            this.cKP.cde.showNext();
        }
        auj();
        auk();
        if (takeProfitValue != null) {
            z = true;
        }
        db(z);
        this.cKH = true;
        aul();
        JsonObject jsonObject = new JsonObject();
        Long valueOf = Long.valueOf(com.iqoption.app.b.DG().DH());
        jsonObject.add("instrument_type ", new JsonPrimitive(this.cKG.getInstrumentType().getServerValue()));
        jsonObject.add("instrument_direction", new JsonPrimitive(this.cKG.isLong() ? NotificationCompat.CATEGORY_CALL : "put"));
        jsonObject.add("balance_type_id", new JsonPrimitive(Long.valueOf(valueOf == null ? -1 : valueOf.longValue())));
        this.ajf.setParameters(jsonObject);
    }

    private /* synthetic */ void aS(View view) {
        da(false);
    }

    private /* synthetic */ void fH(int i) {
        KeyEvent keyEvent = new KeyEvent(0, i);
        KeyEvent keyEvent2 = new KeyEvent(1, i);
        this.cKQ.clr.dispatchKeyEvent(keyEvent);
        this.cKQ.clr.dispatchKeyEvent(keyEvent2);
        if (i == 67) {
            c.auu();
        } else {
            c.hT(Character.toString((char) keyEvent2.getUnicodeChar()));
        }
    }

    private /* synthetic */ void fG(int i) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.cKQ.cmp, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f, 1.6f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f, 1.6f})});
        ofPropertyValuesHolder.setDuration(300);
        ofPropertyValuesHolder.setInterpolator(com.iqoption.view.a.a.c.bhU);
        ofPropertyValuesHolder.setRepeatMode(2);
        ofPropertyValuesHolder.setRepeatCount(1);
        ofPropertyValuesHolder.start();
        if (i > 0) {
            if (this.cKQ.cmp.getNextView().getId() == R.id.signPlus) {
                this.cKQ.cmp.showNext();
            }
        } else if (this.cKQ.cmp.getNextView().getId() == R.id.signMinus) {
            this.cKQ.cmp.showNext();
        }
    }

    private /* synthetic */ void aR(View view) {
        if (this.cKP.cdq.getNextView().getId() == R.id.takeProfitEdit) {
            this.cKP.cdq.showNext();
            aul();
            c.aur();
        }
    }

    private /* synthetic */ void aQ(View view) {
        if (this.cKP.cde.getNextView().getId() == R.id.stopLossEdit) {
            if (this.cKK && this.cKG.aub() && !this.cKP.ccT.isChecked() && com.google.common.c.a.c(this.cKG.y(this.cKT), this.cKG.getStopOutThreshold(), 0.01d) < 0) {
                this.cKP.ccT.setChecked(true);
            }
            db(true);
            this.cKP.cde.showNext();
            aul();
        }
    }

    private /* synthetic */ void aP(View view) {
        if (this.cKP.cdq.getNextView().getId() == R.id.takeProfitAdd) {
            this.cKP.cdq.showNext();
            c.aus();
        }
    }

    private /* synthetic */ void aO(View view) {
        if (this.cKP.cde.getNextView().getId() == R.id.stopLossAdd) {
            this.cKP.cde.showNext();
            db(false);
        }
    }

    private /* synthetic */ void aN(View view) {
        onBackPressed();
    }

    private /* synthetic */ void aM(View view) {
        c.auw();
        onBackPressed();
    }

    private /* synthetic */ void aL(View view) {
        auc();
        Double d = null;
        Double valueOf = this.cKP.cdq.getNextView().getId() == R.id.takeProfitAdd ? Double.valueOf(this.cKS) : null;
        if (this.cKP.cde.getNextView().getId() == R.id.stopLossAdd) {
            d = Double.valueOf(this.cKT);
        }
        v.a(this.cKG.a(valueOf, d), new d(this));
        c.aux();
    }

    private /* synthetic */ void aK(View view) {
        auh();
    }

    private /* synthetic */ void aJ(View view) {
        aui();
    }

    private /* synthetic */ void aI(View view) {
        this.cKP.ccW.setSelected(true);
        da(true);
        c.a("loose", 3, this.cKI ? "percentage" : "amount", false, this.cKT);
    }

    private /* synthetic */ void aH(View view) {
        aue();
    }

    private /* synthetic */ void aG(View view) {
        auf();
    }

    private /* synthetic */ void aF(View view) {
        this.cKP.cdi.setSelected(true);
        da(true);
        c.a("profit", 3, this.cKI ? "percentage" : "amount", false, this.cKS);
    }

    private /* synthetic */ void aE(View view) {
        Point ai = ak.ai(view);
        ai.a(getFragmentManager(), getId(), ai.x, ai.y);
    }

    private void auc() {
        this.cKP.aQO.setEnabled(false);
        this.cKP.ccR.setEnabled(false);
        this.cKP.ccR.setText(null);
        this.cKP.ccQ.setVisibility(0);
    }

    private void aud() {
        this.cKP.ccQ.setVisibility(8);
        this.cKP.ccR.setText(getString(R.string.save));
        this.cKP.ccR.setEnabled(true);
        this.cKP.aQO.setEnabled(true);
    }

    private void db(boolean z) {
        int i = 8;
        if (this.cKG.cV(this.cKL)) {
            this.cKP.cdt.setOnCheckedChangeListener(null);
            FrameLayout frameLayout = this.cKP.cdu;
            boolean z2 = false;
            if (z) {
                i = 0;
            }
            frameLayout.setVisibility(i);
            SwitchCompat switchCompat = this.cKP.cdt;
            if (z) {
                z2 = this.cKG.atW();
            }
            switchCompat.setChecked(z2);
            this.cKP.cdt.setOnCheckedChangeListener(new -$$Lambda$b$ANeiR9YA4SkiMXeJgq54BkCdux4(this));
            return;
        }
        this.cKP.cdu.setVisibility(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0059  */
    private void aue() {
        /*
        r9 = this;
        r0 = r9.cKG;
        r1 = r9.cKS;
        r0 = r0.y(r1);
        r2 = 1;
        r3 = com.iqoption.core.util.j.fq(r2);
        r4 = java.lang.Math.abs(r0);
        r3 = r3.format(r4);
        r4 = ".";
        r3 = r3.contains(r4);
        r4 = r9.cKI;
        if (r4 == 0) goto L_0x0031;
    L_0x001f:
        if (r3 == 0) goto L_0x0031;
    L_0x0021:
        r2 = r9.cKG;
        r0 = java.lang.Math.floor(r0);
        r0 = r2.z(r0);
        r9.cKS = r0;
        r9.auj();
        goto L_0x0043;
    L_0x0031:
        r0 = r9.cKS;
        r3 = r9.aug();
        r0 = r0 + r3;
        r3 = r9.D(r0);
        if (r3 == 0) goto L_0x0046;
    L_0x003e:
        r9.cKS = r0;
        r9.auj();
    L_0x0043:
        r2 = 0;
        r6 = 0;
        goto L_0x0054;
    L_0x0046:
        r0 = 2131887110; // 0x7f120406 float:1.9408818E38 double:1.053292182E-314;
        r0 = r9.getString(r0);
        com.iqoption.app.a.b.dY(r0);
        com.iqoption.dialog.b.c.auv();
        r6 = 1;
    L_0x0054:
        r4 = 0;
        r0 = r9.cKI;
        if (r0 == 0) goto L_0x005c;
    L_0x0059:
        r0 = "percentage";
        goto L_0x005e;
    L_0x005c:
        r0 = "amount";
    L_0x005e:
        r5 = r0;
        r7 = r9.cKS;
        r3 = "profit";
        com.iqoption.dialog.b.c.a(r3, r4, r5, r6, r7);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.dialog.b.b.aue():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0059  */
    private void auf() {
        /*
        r9 = this;
        r0 = r9.cKG;
        r1 = r9.cKS;
        r0 = r0.y(r1);
        r2 = 1;
        r3 = com.iqoption.core.util.j.fq(r2);
        r4 = java.lang.Math.abs(r0);
        r3 = r3.format(r4);
        r4 = ".";
        r3 = r3.contains(r4);
        r4 = r9.cKI;
        if (r4 == 0) goto L_0x0031;
    L_0x001f:
        if (r3 == 0) goto L_0x0031;
    L_0x0021:
        r2 = r9.cKG;
        r0 = java.lang.Math.ceil(r0);
        r0 = r2.z(r0);
        r9.cKS = r0;
        r9.auj();
        goto L_0x0043;
    L_0x0031:
        r0 = r9.cKS;
        r3 = r9.aug();
        r0 = r0 - r3;
        r3 = r9.D(r0);
        if (r3 == 0) goto L_0x0046;
    L_0x003e:
        r9.cKS = r0;
        r9.auj();
    L_0x0043:
        r2 = 0;
        r6 = 0;
        goto L_0x0054;
    L_0x0046:
        r0 = 2131887110; // 0x7f120406 float:1.9408818E38 double:1.053292182E-314;
        r0 = r9.getString(r0);
        com.iqoption.app.a.b.dY(r0);
        com.iqoption.dialog.b.c.auv();
        r6 = 1;
    L_0x0054:
        r4 = 1;
        r0 = r9.cKI;
        if (r0 == 0) goto L_0x005c;
    L_0x0059:
        r0 = "percentage";
        goto L_0x005e;
    L_0x005c:
        r0 = "amount";
    L_0x005e:
        r5 = r0;
        r7 = r9.cKS;
        r3 = "profit";
        com.iqoption.dialog.b.c.a(r3, r4, r5, r6, r7);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.dialog.b.b.auf():void");
    }

    private double aug() {
        if (this.cKV == null) {
            this.cKV = Double.valueOf(this.cKG.atY() - this.cKG.z(1.0d));
        }
        return this.cKV.doubleValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005c  */
    private void auh() {
        /*
        r9 = this;
        r0 = r9.cKG;
        r1 = r9.cKT;
        r0 = r0.y(r1);
        r2 = 1;
        r3 = com.iqoption.core.util.j.fq(r2);
        r4 = java.lang.Math.abs(r0);
        r3 = r3.format(r4);
        r4 = ".";
        r3 = r3.contains(r4);
        r4 = r9.cKI;
        if (r4 == 0) goto L_0x0031;
    L_0x001f:
        if (r3 == 0) goto L_0x0031;
    L_0x0021:
        r2 = r9.cKG;
        r0 = java.lang.Math.ceil(r0);
        r0 = r2.z(r0);
        r9.cKT = r0;
        r9.auk();
        goto L_0x0046;
    L_0x0031:
        r0 = r9.cKT;
        r3 = r9.aug();
        r0 = r0 - r3;
        r9.C(r0);
        r3 = r9.E(r0);
        if (r3 == 0) goto L_0x0049;
    L_0x0041:
        r9.cKT = r0;
        r9.auk();
    L_0x0046:
        r2 = 0;
        r6 = 0;
        goto L_0x0057;
    L_0x0049:
        r0 = 2131887110; // 0x7f120406 float:1.9408818E38 double:1.053292182E-314;
        r0 = r9.getString(r0);
        com.iqoption.app.a.b.dY(r0);
        com.iqoption.dialog.b.c.auv();
        r6 = 1;
    L_0x0057:
        r4 = 0;
        r0 = r9.cKI;
        if (r0 == 0) goto L_0x005f;
    L_0x005c:
        r0 = "percentage";
        goto L_0x0061;
    L_0x005f:
        r0 = "amount";
    L_0x0061:
        r5 = r0;
        r7 = r9.cKT;
        r3 = "loose";
        com.iqoption.dialog.b.c.a(r3, r4, r5, r6, r7);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.dialog.b.b.auh():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005c  */
    private void aui() {
        /*
        r9 = this;
        r0 = r9.cKG;
        r1 = r9.cKT;
        r0 = r0.y(r1);
        r2 = 1;
        r3 = com.iqoption.core.util.j.fq(r2);
        r4 = java.lang.Math.abs(r0);
        r3 = r3.format(r4);
        r4 = ".";
        r3 = r3.contains(r4);
        r4 = r9.cKI;
        if (r4 == 0) goto L_0x0031;
    L_0x001f:
        if (r3 == 0) goto L_0x0031;
    L_0x0021:
        r2 = r9.cKG;
        r0 = java.lang.Math.floor(r0);
        r0 = r2.z(r0);
        r9.cKT = r0;
        r9.auk();
        goto L_0x0046;
    L_0x0031:
        r0 = r9.cKT;
        r3 = r9.aug();
        r0 = r0 + r3;
        r9.C(r0);
        r3 = r9.E(r0);
        if (r3 == 0) goto L_0x0049;
    L_0x0041:
        r9.cKT = r0;
        r9.auk();
    L_0x0046:
        r2 = 0;
        r6 = 0;
        goto L_0x0057;
    L_0x0049:
        r0 = 2131887110; // 0x7f120406 float:1.9408818E38 double:1.053292182E-314;
        r0 = r9.getString(r0);
        com.iqoption.app.a.b.dY(r0);
        com.iqoption.dialog.b.c.auv();
        r6 = 1;
    L_0x0057:
        r4 = 1;
        r0 = r9.cKI;
        if (r0 == 0) goto L_0x005f;
    L_0x005c:
        r0 = "percentage";
        goto L_0x0061;
    L_0x005f:
        r0 = "amount";
    L_0x0061:
        r5 = r0;
        r7 = r9.cKT;
        r3 = "loose";
        com.iqoption.dialog.b.c.a(r3, r4, r5, r6, r7);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.dialog.b.b.aui():void");
    }

    private void C(double d) {
        if (this.cKK) {
            if ((com.google.common.c.a.c(this.cKG.y(d), this.cKG.getStopOutThreshold(), 0.01d) < 0 ? 1 : null) != null) {
                this.cKP.ccT.setChecked(true);
            }
        }
    }

    private void auj() {
        double y = this.cKG.y(this.cKS);
        String r = af.r(y);
        String p = com.iqoption.util.j.p(Double.valueOf(ab.i(this.cKG.getInvest(), y)));
        this.cKP.cdr.setText(j.fr(this.akR).format(this.cKS));
        if (this.cKI) {
            this.cKP.cdj.setText(r);
            this.cKP.cdo.setText(p);
        } else {
            this.cKP.cdj.setText(p);
            this.cKP.cdo.setText(r);
        }
        if (y > 0.01d) {
            this.cKP.cdo.setTextColor(this.amj);
            ak.setBackground(this.cKP.cdo, this.cKM);
        } else if (y < -0.01d) {
            this.cKP.cdo.setTextColor(this.amk);
            ak.setBackground(this.cKP.cdo, this.cKN);
        } else {
            this.cKP.cdo.setTextColor(this.aml);
            ak.setBackground(this.cKP.cdo, this.cKO);
        }
        if (D(this.cKS - aug())) {
            this.cKP.cdm.setEnabled(true);
        } else {
            this.cKP.cdm.setEnabled(false);
        }
        if (D(this.cKS + aug())) {
            this.cKP.cdk.setEnabled(true);
        } else {
            this.cKP.cdk.setEnabled(false);
        }
    }

    private void auk() {
        double y = this.cKG.y(this.cKT);
        String r = af.r(y);
        String p = com.iqoption.util.j.p(Double.valueOf(ab.i(this.cKG.getInvest(), y)));
        this.cKP.cdf.setText(j.fr(this.akR).format(this.cKT));
        if (this.cKI) {
            this.cKP.ccX.setText(r);
            this.cKP.cdc.setText(p);
        } else {
            this.cKP.ccX.setText(p);
            this.cKP.cdc.setText(r);
        }
        if (y > 0.01d) {
            this.cKP.cdc.setTextColor(this.amj);
            ak.setBackground(this.cKP.cdc, this.cKM);
        } else if (y < -0.01d) {
            this.cKP.cdc.setTextColor(this.amk);
            ak.setBackground(this.cKP.cdc, this.cKN);
        } else {
            this.cKP.cdc.setTextColor(this.aml);
            ak.setBackground(this.cKP.cdc, this.cKO);
        }
        if (E(this.cKT + aug())) {
            this.cKP.cda.setEnabled(true);
        } else {
            this.cKP.cda.setEnabled(false);
        }
        if (E(this.cKT - aug())) {
            this.cKP.ccY.setEnabled(true);
        } else {
            this.cKP.ccY.setEnabled(false);
        }
        Double aum = aum();
        if (aum != null) {
            a(true, aum.doubleValue());
        } else {
            a(false, 0.0d);
        }
    }

    public boolean onClose() {
        FragmentManager fragmentManager = getFragmentManager();
        if (!(fragmentManager == null || fragmentManager.isStateSaved())) {
            fragmentManager.popBackStack();
        }
        return true;
    }

    public void onResume() {
        super.onResume();
        auo();
    }

    public void onPause() {
        super.onPause();
        aup();
    }

    private void aul() {
        if (this.cKH) {
            this.cKW = this.cKG.atZ();
            if (this.cKW != null) {
                this.cKP.cdw.setText(j.fr(this.akR).format(this.cKW));
            }
            Double aua = this.cKG.aua();
            if (aua != null) {
                f.a(aua.doubleValue(), this.cKY);
                f(this.cKX < aua.doubleValue() ? 50.0d : -50.0d, aua.doubleValue());
                this.cKX = aua.doubleValue();
            } else {
                this.cKP.cdv.setVisibility(8);
            }
        }
    }

    /* JADX WARNING: Missing block: B:5:0x002b, code skipped:
            if (com.google.common.c.a.c(r16, r3.doubleValue() + r1, r5) > 0) goto L_0x002d;
     */
    /* JADX WARNING: Missing block: B:7:0x0036, code skipped:
            if (com.google.common.c.a.c(r16, 0.0d, r5) >= 0) goto L_0x003a;
     */
    /* JADX WARNING: Missing block: B:8:0x0039, code skipped:
            r4 = false;
     */
    /* JADX WARNING: Missing block: B:9:0x003a, code skipped:
            return r4;
     */
    /* JADX WARNING: Missing block: B:13:0x004c, code skipped:
            if (com.google.common.c.a.c(r16, r3.doubleValue() + r1, r5) < 0) goto L_0x004e;
     */
    /* JADX WARNING: Missing block: B:15:0x0057, code skipped:
            if (com.google.common.c.a.c(r16, 0.0d, r5) >= 0) goto L_0x005b;
     */
    /* JADX WARNING: Missing block: B:16:0x005a, code skipped:
            r4 = false;
     */
    /* JADX WARNING: Missing block: B:17:0x005b, code skipped:
            return r4;
     */
    private boolean D(double r16) {
        /*
        r15 = this;
        r0 = r15;
        r1 = r15.getMin();
        r3 = r0.akR;
        r4 = 1;
        r3 = r3 + r4;
        r3 = -r3;
        r5 = (double) r3;
        r7 = 4621819117588971520; // 0x4024000000000000 float:0.0 double:10.0;
        r5 = java.lang.Math.pow(r7, r5);
        r3 = r0.cKG;
        r3 = r3.isLong();
        r7 = 0;
        if (r3 == 0) goto L_0x003b;
    L_0x001a:
        r3 = r0.cKW;
        if (r3 == 0) goto L_0x002d;
    L_0x001e:
        r8 = r3.doubleValue();
        r11 = r8 + r1;
        r9 = r16;
        r13 = r5;
        r1 = com.google.common.c.a.c(r9, r11, r13);
        if (r1 <= 0) goto L_0x0039;
    L_0x002d:
        r11 = 0;
        r9 = r16;
        r13 = r5;
        r1 = com.google.common.c.a.c(r9, r11, r13);
        if (r1 < 0) goto L_0x0039;
    L_0x0038:
        goto L_0x003a;
    L_0x0039:
        r4 = 0;
    L_0x003a:
        return r4;
    L_0x003b:
        r3 = r0.cKW;
        if (r3 == 0) goto L_0x004e;
    L_0x003f:
        r8 = r3.doubleValue();
        r11 = r8 + r1;
        r9 = r16;
        r13 = r5;
        r1 = com.google.common.c.a.c(r9, r11, r13);
        if (r1 >= 0) goto L_0x005a;
    L_0x004e:
        r11 = 0;
        r9 = r16;
        r13 = r5;
        r1 = com.google.common.c.a.c(r9, r11, r13);
        if (r1 < 0) goto L_0x005a;
    L_0x0059:
        goto L_0x005b;
    L_0x005a:
        r4 = 0;
    L_0x005b:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.dialog.b.b.D(double):boolean");
    }

    /* JADX WARNING: Missing block: B:3:0x002b, code skipped:
            if (com.google.common.c.a.c(r16, r3.z(r3.getStopOutThreshold()), r5) >= 0) goto L_0x0041;
     */
    /* JADX WARNING: Missing block: B:5:0x003f, code skipped:
            if (com.google.common.c.a.c(r16, r3.z(r3.getStopOutThreshold()), r5) <= 0) goto L_0x0041;
     */
    /* JADX WARNING: Missing block: B:7:0x0043, code skipped:
            r3 = null;
     */
    /* JADX WARNING: Missing block: B:16:0x0063, code skipped:
            if (com.google.common.c.a.c(r16, r3.doubleValue() - r1, r5) < 0) goto L_0x0065;
     */
    /* JADX WARNING: Missing block: B:18:0x006e, code skipped:
            if (com.google.common.c.a.c(r16, 0.0d, r5) >= 0) goto L_0x0072;
     */
    /* JADX WARNING: Missing block: B:27:0x008a, code skipped:
            if (com.google.common.c.a.c(r16, r3.doubleValue() - r1, r5) > 0) goto L_0x008c;
     */
    /* JADX WARNING: Missing block: B:29:0x0095, code skipped:
            if (com.google.common.c.a.c(r16, 0.0d, r5) >= 0) goto L_0x0099;
     */
    private boolean E(double r16) {
        /*
        r15 = this;
        r0 = r15;
        r1 = r15.getMin();
        r3 = r0.akR;
        r4 = 1;
        r3 = r3 + r4;
        r3 = -r3;
        r5 = (double) r3;
        r7 = 4621819117588971520; // 0x4024000000000000 float:0.0 double:10.0;
        r5 = java.lang.Math.pow(r7, r5);
        r3 = r0.cKG;
        r3 = r3.isLong();
        r7 = 0;
        if (r3 == 0) goto L_0x002e;
    L_0x001a:
        r3 = r0.cKG;
        r8 = r3.getStopOutThreshold();
        r11 = r3.z(r8);
        r9 = r16;
        r13 = r5;
        r3 = com.google.common.c.a.c(r9, r11, r13);
        if (r3 < 0) goto L_0x0043;
    L_0x002d:
        goto L_0x0041;
    L_0x002e:
        r3 = r0.cKG;
        r8 = r3.getStopOutThreshold();
        r11 = r3.z(r8);
        r9 = r16;
        r13 = r5;
        r3 = com.google.common.c.a.c(r9, r11, r13);
        if (r3 > 0) goto L_0x0043;
    L_0x0041:
        r3 = 1;
        goto L_0x0044;
    L_0x0043:
        r3 = 0;
    L_0x0044:
        r8 = r0.cKG;
        r8 = r8.isLong();
        if (r8 == 0) goto L_0x0073;
    L_0x004c:
        r8 = r0.cKK;
        if (r8 != 0) goto L_0x0052;
    L_0x0050:
        if (r3 == 0) goto L_0x0071;
    L_0x0052:
        r3 = r0.cKW;
        if (r3 == 0) goto L_0x0065;
    L_0x0056:
        r8 = r3.doubleValue();
        r11 = r8 - r1;
        r9 = r16;
        r13 = r5;
        r1 = com.google.common.c.a.c(r9, r11, r13);
        if (r1 >= 0) goto L_0x0071;
    L_0x0065:
        r11 = 0;
        r9 = r16;
        r13 = r5;
        r1 = com.google.common.c.a.c(r9, r11, r13);
        if (r1 < 0) goto L_0x0071;
    L_0x0070:
        goto L_0x0072;
    L_0x0071:
        r4 = 0;
    L_0x0072:
        return r4;
    L_0x0073:
        r8 = r0.cKK;
        if (r8 != 0) goto L_0x0079;
    L_0x0077:
        if (r3 == 0) goto L_0x0098;
    L_0x0079:
        r3 = r0.cKW;
        if (r3 == 0) goto L_0x008c;
    L_0x007d:
        r8 = r3.doubleValue();
        r11 = r8 - r1;
        r9 = r16;
        r13 = r5;
        r1 = com.google.common.c.a.c(r9, r11, r13);
        if (r1 <= 0) goto L_0x0098;
    L_0x008c:
        r11 = 0;
        r9 = r16;
        r13 = r5;
        r1 = com.google.common.c.a.c(r9, r11, r13);
        if (r1 < 0) goto L_0x0098;
    L_0x0097:
        goto L_0x0099;
    L_0x0098:
        r4 = 0;
    L_0x0099:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.dialog.b.b.E(double):boolean");
    }

    private double getMin() {
        if (this.cKJ) {
            int i = this.cKG.isLong() ? 1 : -1;
            InstrumentType instrumentType = this.cKG.getInstrumentType();
            if (instrumentType == InstrumentType.FOREX_INSTRUMENT) {
                double d = (double) i;
                double pow = 30.0d / Math.pow(10.0d, (double) this.akR);
                Double.isNaN(d);
                return d * pow;
            }
            ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(this.cKG.atX());
            if (dY != null) {
                double spread = dY.getSpread(instrumentType, this.cKG.getLeverage());
                double d2 = (double) i;
                Double.isNaN(d2);
                return ab.i(spread * d2, 0.1d);
            }
        }
        return 0.0d;
    }

    private Double aum() {
        if (!this.cKG.aub()) {
            Double d = this.cKW;
            if (d != null) {
                double y = this.cKG.y(d.doubleValue()) - aun();
                if (this.cKG.y(this.cKT) > y) {
                    return Double.valueOf(y);
                }
            }
        }
        return null;
    }

    private void a(boolean z, double d) {
        if (z) {
            this.cKP.cdy.setText(getString(R.string.we_strongly_do_not_recommend, af.fs((int) d)));
            this.cKP.cdy.setVisibility(0);
            return;
        }
        this.cKP.cdy.setVisibility(8);
    }

    private double aun() {
        int leverage = this.cKG.getLeverage();
        if (leverage > 100) {
            double d = (double) leverage;
            Double.isNaN(d);
            return d / 100.0d;
        }
        double d2 = (double) leverage;
        Double.isNaN(d2);
        return (d2 / 100.0d) + 1.0d;
    }

    private void f(double d, double d2) {
        Double valueOf;
        if (this.cKP.cdq.getNextView().getId() == R.id.takeProfitAdd && !D(this.cKS)) {
            double i = i(d2, (int) (Math.signum(d2) * 50.0d));
            valueOf = Double.valueOf(this.cKG.z(i));
            while (!D(valueOf.doubleValue())) {
                i += d;
                valueOf = Double.valueOf(this.cKG.z(i));
            }
            this.cKS = valueOf.doubleValue();
            auj();
        }
        if (this.cKP.cde.getNextView().getId() == R.id.stopLossAdd && !E(this.cKT)) {
            d2 = i(d2, (int) (Math.signum(d2) * 50.0d));
            valueOf = Double.valueOf(this.cKG.z(d2));
            while (!E(valueOf.doubleValue())) {
                d2 += d;
                valueOf = Double.valueOf(this.cKG.z(d2));
            }
            this.cKT = valueOf.doubleValue();
            auk();
        }
    }

    public static double i(double d, int i) {
        int floor = (int) Math.floor(d);
        floor += floor % i == 0 ? 1 : 0;
        if (floor % i != 0) {
            floor = ((floor / i) * i) + i;
        }
        return (double) floor;
    }

    private AnimatorSet a(ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2) {
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.util.b.a(animatorSet, 300);
        animatorSet.playTogether(new Animator[]{objectAnimator, objectAnimator2});
        return animatorSet;
    }

    private ObjectAnimator a(View view, Point point, Point point2) {
        r0 = new PropertyValuesHolder[3];
        r0[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
        r0[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{(float) (point2.x - point.x)});
        r0[2] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{(float) (point2.y - point.y)});
        return ObjectAnimator.ofPropertyValuesHolder(view, r0);
    }

    private void auo() {
        com.iqoption.view.a.b.aYv().a(this.cKZ, Integer.valueOf(5));
    }

    private void aup() {
        com.iqoption.view.a.b.aYv().b(this.cKZ);
    }
}
