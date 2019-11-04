package com.iqoption.fragment.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.RelativeLayout;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.k;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.dto.Balance;
import com.iqoption.dto.Currencies;
import com.iqoption.dto.Currencies.ConversionCurrency;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.e.ot;
import com.iqoption.fragment.ah;
import com.iqoption.system.a.c;
import com.iqoption.util.af;
import com.iqoption.util.ai;
import com.iqoption.util.e;
import com.iqoption.util.j;
import com.iqoption.view.RobotoEditText;
import com.iqoption.view.d.d;
import com.iqoption.view.drumview.recyclerviewpager.ScrolledToPositionInZoneLinearLayoutManager;
import com.iqoption.x.R;

/* compiled from: IQKeyboardFragment */
public class b extends com.iqoption.fragment.b.b {
    private Builder ajf;
    private long dat = 0;
    private boolean dau = false;
    private ot dav;
    private com.iqoption.a.c.a daw;
    private d dax = new d();
    private boolean daz = false;

    /* compiled from: IQKeyboardFragment */
    public static class a extends c<Double> {
    }

    /* compiled from: IQKeyboardFragment */
    public static class b extends c<Boolean> {
    }

    private static b g(double d, double d2) {
        b bVar = new b();
        bVar.setArguments(new e().i("arg.double.amount", d).i("arg.double.min.amount", d2).toBundle());
        return bVar;
    }

    private static void a(FragmentManager fragmentManager, @IdRes int i, double d, double d2) {
        String str = "IQKeyboardFragment";
        fragmentManager.beginTransaction().add(i, g(d, d2), str).addToBackStack(str).commit();
    }

    public static boolean b(FragmentManager fragmentManager, @IdRes int i, double d, double d2) {
        if (fragmentManager.isStateSaved() || fragmentManager.isDestroyed()) {
            return false;
        }
        b bVar = (b) fragmentManager.findFragmentByTag("IQKeyboardFragment");
        if (bVar == null) {
            a(fragmentManager, i, d, d2);
        } else {
            bVar.onBackPressed();
        }
        if (bVar == null) {
            return true;
        }
        return false;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.dav = (ot) DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.iqkeyboard_fragment, viewGroup, false);
        this.dav.a(this);
        return this.dav.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.dav.aIb.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        this.dav.clI.setLayoutTransition(new LayoutTransition());
        this.dav.clu.setOnTouchListener(this.dax);
        this.dav.clL.setOnTouchListener(this.dax);
        this.dav.clS.setOnTouchListener(this.dax);
        this.dav.bgf.setOnTouchListener(this.dax);
        this.dav.bgk.setOnTouchListener(this.dax);
        this.dav.bgj.setOnTouchListener(this.dax);
        this.dav.bfZ.setOnTouchListener(this.dax);
        this.dav.bfY.setOnTouchListener(this.dax);
        this.dav.bgi.setOnTouchListener(this.dax);
        this.dav.bgg.setOnTouchListener(this.dax);
        this.dav.bfX.setOnTouchListener(this.dax);
        this.dav.bge.setOnTouchListener(this.dax);
        this.dav.clK.setOnTouchListener(this.dax);
        this.dav.cly.setOnTouchListener(this.dax);
        com.iqoption.app.d aP = com.iqoption.app.d.aP(getContext());
        a.dar.Z(this).azY().observe(this, new -$$Lambda$b$MQNKrZmhoWBgfdpd-wI0Ui1LyVc(this));
        bundle = getArguments();
        this.dat = (long) (bundle.getDouble("arg.double.amount") * 1000000.0d);
        String c = j.c(com.iqoption.app.b.DG().DO(), Double.valueOf(bundle.getDouble("arg.double.min.amount")));
        RobotoEditText robotoEditText = this.dav.clr;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getString(R.string.min));
        stringBuilder.append(" ");
        stringBuilder.append(c);
        robotoEditText.setHint(stringBuilder.toString());
        RobotoEditText robotoEditText2 = this.dav.clr;
        double d = (double) this.dat;
        Double.isNaN(d);
        robotoEditText2.setText(j.q(Double.valueOf(d / 1000000.0d)));
        this.dav.clr.setOnTouchListener(new OnTouchListener() {
            GestureDetector daB = new GestureDetector(b.this.getContext(), new a());

            /* compiled from: IQKeyboardFragment */
            class a extends SimpleOnGestureListener {
                public boolean onDoubleTap(MotionEvent motionEvent) {
                    return true;
                }

                a() {
                }

                public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    b.this.dF(false);
                    b.this.dE(true);
                    return true;
                }
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                this.daB.onTouchEvent(motionEvent);
                return true;
            }
        });
        this.dav.clr.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                b.this.dav.clr.setSelection(i3);
            }
        });
        dE(true);
        this.dav.clx.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                b.this.dE(false);
                b.this.dF(true);
            }
        });
        this.dav.clw.setText(iq(aP.FU()));
        this.dav.clw.setOnTouchListener(new OnTouchListener() {
            GestureDetector daB = new GestureDetector(b.this.getContext(), new a());

            /* compiled from: IQKeyboardFragment */
            class a extends SimpleOnGestureListener {
                public boolean onDoubleTap(MotionEvent motionEvent) {
                    return true;
                }

                a() {
                }

                public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    b.this.dE(false);
                    b.this.dF(true);
                    return true;
                }
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                this.daB.onTouchEvent(motionEvent);
                return true;
            }
        });
        this.dav.clw.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                b.this.dav.clw.setSelection(i3);
            }
        });
        dF(false);
        this.dav.clv.setText(j.q(azZ()));
        this.dav.clq.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                IQApp.Ex().bd(new a().setValue(b.this.azZ()));
                b.this.onBackPressed();
                EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "deal-keyboard_all-in").build());
            }
        });
        AnonymousClass11 anonymousClass11 = new com.iqoption.view.d.b() {
            public void M(View view) {
                IQApp.Ex().bd(new a().setValue((Double) view.getTag()));
                int id = view.getId();
                String str = Event.CATEGORY_BUTTON_PRESSED;
                if (id == R.id.exposureCallContainer) {
                    EventManager.BS().a(Event.Builder(str, "deal-keyboard_investment-limits-max-invest-call").build());
                } else if (id == R.id.exposurePutContainer) {
                    EventManager.BS().a(Event.Builder(str, "deal-keyboard_investment-limits-max-invest-put").build());
                }
                b.this.onBackPressed();
            }
        };
        this.dav.clz.setOnClickListener(anonymousClass11);
        this.dav.clB.setOnClickListener(anonymousClass11);
        this.dav.clF.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                b.this.dG(view.isSelected() ^ 1);
            }
        });
        dG(aP.FR());
        ScrolledToPositionInZoneLinearLayoutManager scrolledToPositionInZoneLinearLayoutManager = new ScrolledToPositionInZoneLinearLayoutManager(getContext(), 1);
        ScrolledToPositionInZoneLinearLayoutManager scrolledToPositionInZoneLinearLayoutManager2 = new ScrolledToPositionInZoneLinearLayoutManager(getContext(), 1);
        scrolledToPositionInZoneLinearLayoutManager.setAutoMeasureEnabled(true);
        scrolledToPositionInZoneLinearLayoutManager2.setAutoMeasureEnabled(true);
        this.daw = new com.iqoption.a.c.a(getContext(), aP.FV(), aAa(), new com.iqoption.a.b.a() {
            public void onItemClick(View view, int i) {
                String item = b.this.daw.getItem(i);
                b.this.ip(item);
                try {
                    EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, b.this.daw.AU() == CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE ? "deal-keyboard_chose-presets" : "deal-keyboard_chose-last-ammounts").setValue(Double.valueOf(Double.parseDouble(item))).build());
                } catch (Exception unused) {
                }
                b.this.onBackPressed();
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setAutoMeasureEnabled(true);
        this.dav.clM.setLayoutManager(linearLayoutManager);
        this.dav.clM.setAdapter(this.daw);
        this.dav.clO.setLayoutTransition(new LayoutTransition());
        int AU = this.daw.AU();
        String str = Event.CATEGORY_BUTTON_PRESSED;
        if (AU == CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE) {
            this.dav.clN.setVisibility(8);
            this.dav.clG.setVisibility(0);
            EventManager.BS().a(Event.Builder(str, "deal-keyboard_last-ammounts").build());
        } else {
            this.dav.clG.setVisibility(8);
            this.dav.clN.setVisibility(0);
            EventManager.BS().a(Event.Builder(str, "deal-keyboard_presets").build());
        }
        dH(true);
    }

    private /* synthetic */ void b(com.iqoption.core.microservices.risks.response.a aVar) {
        if (aVar != null) {
            this.dav.clD.setVisibility(0);
            this.dav.clE.setVisibility(0);
            String DO = com.iqoption.app.b.DG().DO();
            String c = j.c(DO, Double.valueOf(aVar.ahb()));
            DO = j.c(DO, Double.valueOf(aVar.ahc()));
            this.dav.clE.setText(new ai().cs(new ForegroundColorSpan(getColor(R.color.green))).jP(c).aWX().cs(new ForegroundColorSpan(getColor(R.color.grey_blur_50))).jP("/").aWX().cs(new ForegroundColorSpan(getColor(R.color.red))).jP(DO).aWX().anA());
            this.dav.clA.setText(c);
            this.dav.clz.setTag(Double.valueOf(aVar.ahb()));
            this.dav.clC.setText(DO);
            this.dav.clB.setTag(Double.valueOf(aVar.ahc()));
            if (azZ().doubleValue() < Math.min(aVar.ahb(), aVar.ahc())) {
                this.dav.clq.setVisibility(0);
                this.dav.clz.setVisibility(8);
                this.dav.clB.setVisibility(8);
                return;
            }
            this.dav.clq.setVisibility(8);
            this.dav.clz.setVisibility(0);
            this.dav.clB.setVisibility(0);
            return;
        }
        this.dav.clD.setVisibility(8);
        this.dav.clE.setVisibility(8);
    }

    private Double azZ() {
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        com.iqoption.core.microservices.tradingengine.response.active.a IZ = TabHelper.IM().IZ();
        double doubleValue = DG.DI().doubleValue();
        if (IZ != null && com.iqoption.app.helpers.a.Gs().d(IZ.getInstrumentType())) {
            double d;
            com.iqoption.core.microservices.tradingengine.response.a.a a = com.iqoption.app.helpers.a.Gs().a(IZ.getInstrumentType(), Integer.valueOf(IZ.getActiveId()));
            if (a == null) {
                d = 0.0d;
            } else {
                d = a.c(doubleValue, j.aWI().doubleValue());
            }
            if (!com.google.common.c.a.b(0.0d, d, 0.001d)) {
                Balance DM = DG.DM();
                Object obj = null;
                Object obj2 = DG.DJ() == 1 ? 1 : null;
                if (DM != null) {
                    obj = 1;
                }
                if (obj != null && obj2 != null && com.iqoption.app.managers.feature.a.Ih() && com.iqoption.app.d.dX("otn_commmision")) {
                    ConversionCurrency DQ = DG.DQ();
                    double doubleValue2 = j.b(j.c(Double.valueOf(Balance.getBalanceValue(DM)), Double.valueOf(j.b(DG.du(Currencies.OTN_CURRENCY)).doubleValue())), Double.valueOf(j.b(DQ).doubleValue())).doubleValue() - d;
                    if (doubleValue2 < 0.0d) {
                        d = Math.abs(doubleValue2);
                    }
                }
                doubleValue -= d;
            }
        }
        if (doubleValue < 0.0d) {
            doubleValue = DG.DI().doubleValue();
        }
        return Double.valueOf(doubleValue);
    }

    @Nullable
    private InstrumentType aAa() {
        com.iqoption.core.microservices.tradingengine.response.active.a IZ = TabHelper.IM().IZ();
        return IZ != null ? IZ.instrumentType : null;
    }

    private void dE(boolean z) {
        if (z) {
            this.dav.clr.setCursorVisible(true);
            int length = this.dav.clr.getText().length();
            if (length > 0) {
                this.dav.clr.setSelection(length);
                this.dav.clr.postDelayed(new Runnable() {
                    public void run() {
                        if (b.this.isAdded()) {
                            b.this.dav.clr.requestFocus();
                        }
                    }
                }, 100);
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(this.dav.clr.getText())) {
            RobotoEditText robotoEditText = this.dav.clr;
            double d = (double) this.dat;
            Double.isNaN(d);
            robotoEditText.setText(j.q(Double.valueOf(d / 1000000.0d)));
        }
        this.dav.clr.setCursorVisible(false);
        this.dav.clr.clearFocus();
    }

    private void dF(boolean z) {
        if (z) {
            this.dav.clw.setCursorVisible(true);
            int length = this.dav.clw.getText().length();
            if (length > 0) {
                this.dav.clw.setSelection(length);
                this.dav.clw.postDelayed(new Runnable() {
                    public void run() {
                        if (b.this.isAdded()) {
                            b.this.dav.clw.requestFocus();
                        }
                    }
                }, 100);
            }
            EventManager.BS().a(Event.Builder(Event.CATEGORY_TEXT_CHANGED, "deal-keyboard_change-coeficient").build());
            return;
        }
        if (TextUtils.isEmpty(this.dav.clw.getText().toString())) {
            this.dav.clw.setText(iq(com.iqoption.app.d.aP(IQApp.Eu()).FU()));
        }
        this.dav.clw.setCursorVisible(false);
        this.dav.clw.clearFocus();
    }

    public void bp(View view) {
        if (!TextUtils.isEmpty(this.dav.clw.getText())) {
            try {
                Double valueOf = Double.valueOf(Double.parseDouble(this.dav.clw.getText().toString()));
                if (valueOf != null) {
                    if (valueOf.doubleValue() != 0.0d) {
                        this.daz = true;
                        if (this.dat < 0) {
                            this.dat = (long) (Double.parseDouble(aAc()) * 1000000.0d);
                        }
                        double d = (double) this.dat;
                        double doubleValue = valueOf.doubleValue() * 1000000.0d;
                        Double.isNaN(d);
                        d /= doubleValue;
                        this.dat = (long) (1000000.0d * d);
                        ip(j.u(Double.valueOf(d)));
                        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "deal-keyboard_divide").setValue(valueOf).build());
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public void bq(View view) {
        if (!TextUtils.isEmpty(this.dav.clw.getText())) {
            try {
                this.daz = true;
                if (this.dat < 0) {
                    this.dat = (long) (Double.parseDouble(aAc()) * 1000000.0d);
                }
                Double valueOf = Double.valueOf(Double.parseDouble(this.dav.clw.getText().toString()));
                if (valueOf != null) {
                    if (valueOf.doubleValue() != 0.0d) {
                        double d = (double) this.dat;
                        double doubleValue = valueOf.doubleValue();
                        Double.isNaN(d);
                        d = (d * doubleValue) / 1000000.0d;
                        this.dat = (long) (1000000.0d * d);
                        ip(j.u(Double.valueOf(d)));
                        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "deal-keyboard_multiply").setValue(valueOf).build());
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public void br(View view) {
        String str = ".";
        try {
            this.daz = false;
            this.dat = -1;
            String string = getString();
            if (string.indexOf(str) < 0) {
                if (string.isEmpty()) {
                    str = "0.";
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string);
                    stringBuilder.append(str);
                    str = stringBuilder.toString();
                }
                setString(str);
            }
        } catch (Exception unused) {
        }
    }

    public void bs(View view) {
        try {
            this.daz = false;
            this.dat = -1;
            String string = getString();
            setString(string.substring(0, string.length() - 1));
            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "deal-keyboard_number-button").setValue(Double.valueOf(-1.0d)).build());
        } catch (Exception unused) {
        }
    }

    public void bt(View view) {
        k.f(getContext(), 32768);
        try {
            this.dat = -1;
            String string = getString();
            if (this.daz) {
                string = "";
                this.daz = false;
            }
            if (string.length() == 0) {
                string = view.getTag().toString();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(view.getTag().toString());
                string = stringBuilder.toString();
            }
            setString(string);
            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "deal-keyboard_number-button").setValue(Double.valueOf(Double.parseDouble(view.getTag().toString()))).build());
        } catch (Exception unused) {
        }
    }

    public void bu(View view) {
        this.daw.AT();
        if (this.daw.AU() == CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE) {
            this.dav.clN.setVisibility(8);
            this.dav.clG.setVisibility(0);
        } else {
            this.dav.clG.setVisibility(8);
            this.dav.clN.setVisibility(0);
        }
        com.iqoption.app.d.aP(getContext()).dR(this.daw.AU());
    }

    private void dG(boolean z) {
        this.dav.clF.setSelected(z);
        if (z) {
            this.dav.clH.setVisibility(0);
        } else {
            this.dav.clH.setVisibility(8);
        }
        com.iqoption.app.d.aP(getContext()).bj(z);
    }

    private void dH(boolean z) {
        if (z) {
            this.daz = true;
            this.ajf = Event.Builder(Event.CATEGORY_POPUP_SERVED, "deal-keyboard");
        } else {
            ah PM = PM();
            if (PM != null) {
                try {
                    double ZC = PM.ZC();
                    com.iqoption.app.d.aP(getContext()).k(ZC);
                    if (this.ajf != null) {
                        EventManager.BS().a(this.ajf.calcDuration().setValue(Double.valueOf(ZC)).build());
                    }
                } catch (UnsupportedOperationException unused) {
                }
            }
        }
        IQApp.Ex().bd(new b().setValue(Boolean.valueOf(z)));
    }

    private String getString() {
        if (this.dav.clw.isFocused()) {
            return aAb();
        }
        return aAc();
    }

    private String aAb() {
        String str = "0";
        if (!(this.dav.clw == null || this.dav.clw.getText() == null)) {
            try {
                return this.dav.clw.getText().toString().replaceAll("[^\\d\\.]", "");
            } catch (Exception unused) {
            }
        }
        return str;
    }

    private String aAc() {
        String str = "0";
        if (!(this.dav.clr == null || this.dav.clr.getText() == null)) {
            try {
                return this.dav.clr.getText().toString().replaceAll("[^\\d\\.]", "");
            } catch (Exception unused) {
            }
        }
        return str;
    }

    private void setString(String str) {
        if (this.dav.clw.isFocused()) {
            io(str);
        } else {
            ip(str);
        }
    }

    private void io(String str) {
        this.dav.clw.setText(str);
    }

    private void ip(String str) {
        Double bV = com.google.common.primitives.b.bV(str);
        IQApp.Ex().bd(new a().setValue(Double.valueOf(bV != null ? bV.doubleValue() : 0.0d)));
        this.dav.clr.setText(str);
    }

    private void aAd() {
        com.iqoption.app.d Fa = com.iqoption.app.d.Fa();
        String obj = this.dav.clw.getText().toString();
        Double bV = com.google.common.primitives.b.bV(this.dav.clr.getText().toString());
        if (bV != null) {
            Fa.j(bV.doubleValue());
        }
        Fa.dS(obj);
    }

    public boolean onClose() {
        aAd();
        this.dau = false;
        dH(false);
        getFragmentManager().popBackStack();
        return true;
    }

    private String iq(String str) {
        double parseDouble;
        try {
            parseDouble = Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            parseDouble = 2.0d;
        }
        return j.u(Double.valueOf(parseDouble));
    }

    public void att() {
        this.dau = true;
        this.dav.aIb.setAlpha(0.0f);
        if (af.ebR) {
            Interpolator interpolator = com.iqoption.view.a.a.c.egR;
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp12);
            float f = (float) dimensionPixelSize;
            this.dav.clI.setTranslationX(f);
            this.dav.clI.setTranslationY((float) (-dimensionPixelSize));
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.dav.aIb, this.dav.aIb.getWidth() - dimensionPixelSize, dimensionPixelSize, f, (float) Math.hypot((double) this.dav.aIb.getWidth(), (double) this.dav.aIb.getHeight()));
            createCircularReveal.setDuration(400).setInterpolator(interpolator);
            RelativeLayout relativeLayout = this.dav.clI;
            r8 = new PropertyValuesHolder[2];
            r8[0] = PropertyValuesHolder.ofFloat("translationX", new float[]{0.0f});
            r8[1] = PropertyValuesHolder.ofFloat("translationY", new float[]{0.0f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(relativeLayout, r8);
            ofPropertyValuesHolder.setDuration(300).setInterpolator(interpolator);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(createCircularReveal).with(ofPropertyValuesHolder);
            animatorSet.start();
            this.dav.aIb.setAlpha(1.0f);
        } else {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dp12);
            float f2 = (float) (-dimensionPixelOffset);
            this.dav.aIb.setTranslationX(f2);
            this.dav.aIb.setTranslationY(f2);
            this.dav.aIb.setPivotX((float) (this.dav.aIb.getWidth() - dimensionPixelOffset));
            this.dav.aIb.setPivotY(1.0f);
            this.dav.aIb.setScaleX(0.3f);
            this.dav.aIb.setScaleY(0.3f);
            this.dav.aIb.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).translationX(0.0f).translationY(0.0f).setDuration(400).setListener(null).setInterpolator(com.iqoption.view.a.a.c.egR).start();
        }
        com.iqoption.app.d aP = com.iqoption.app.d.aP(getContext());
        if (aP.FS()) {
            com.iqoption.core.c.a.biN.postDelayed(new -$$Lambda$b$dTA5djrU83xLGjZ8L2aJw3GSKUI(this), 400);
            aP.FT();
        }
    }

    private /* synthetic */ void aAe() {
        dG(true);
    }

    public void atu() {
        this.dav.aIb.setPivotX((float) this.dav.aIb.getWidth());
        this.dav.aIb.setPivotY(1.0f);
        this.dav.aIb.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).setDuration(300).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }
}
