package com.iqoption.fragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.iqoption.analytics.i;
import com.iqoption.app.IQApp;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.j;
import com.iqoption.dto.entity.ActiveQuote;
import com.iqoption.e.mn;
import com.iqoption.util.af;
import com.iqoption.util.ak;
import com.iqoption.util.e;
import com.iqoption.view.RobotoEditText;
import com.iqoption.view.d.c;
import com.iqoption.x.R;
import java.io.Serializable;

/* compiled from: PendingEditFragment */
public final class ab extends com.iqoption.fragment.b.b implements com.iqoption.view.a.b.a {
    private boolean cWA = true;
    private com.iqoption.core.microservices.tradingengine.response.active.a cWB;
    private double cWC = 0.0d;
    private boolean cWD;
    private final i cWE = new i();
    private mn cWF;

    /* compiled from: PendingEditFragment */
    public static class a {
        public final boolean cWH;
        public final Double value;

        public a(boolean z, Double d) {
            this.cWH = z;
            this.value = d;
        }
    }

    /* compiled from: PendingEditFragment */
    public static class b {
        public final boolean ajQ;
        public final Double value;

        public b(boolean z, Double d) {
            this.ajQ = z;
            this.value = d;
        }
    }

    private static ab a(@NonNull InstrumentType instrumentType, int i, Double d, boolean z, boolean z2) {
        ab abVar = new ab();
        e z3 = new e().a("arg.activeType", (Serializable) instrumentType).O("arg.activeId", i).z("arg.mkt.on.open", z2).z("arg.disabled.reset.value", z);
        if (d != null) {
            z3.i("arg.value", d.doubleValue());
        }
        abVar.setArguments(z3.toBundle());
        return abVar;
    }

    public static void a(FragmentManager fragmentManager, @NonNull InstrumentType instrumentType, int i, Double d, boolean z) {
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        ab a = a(instrumentType, i, d, z, true);
        String str = "PendingEditFragment";
        beginTransaction.add(R.id.fragment, a, str).addToBackStack(str).commit();
    }

    public static void b(FragmentManager fragmentManager, @NonNull InstrumentType instrumentType, int i, Double d, boolean z) {
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        ab a = a(instrumentType, i, d, z, false);
        String str = "PendingEditFragment";
        beginTransaction.add(R.id.fragment, a, str).addToBackStack(str).commit();
    }

    public void onStart() {
        super.onStart();
        com.iqoption.view.a.b.aYv().a((com.iqoption.view.a.b.a) this, Integer.valueOf(5));
    }

    public void onStop() {
        super.onStop();
        com.iqoption.view.a.b.aYv().b((com.iqoption.view.a.b.a) this);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.cWF = (mn) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_pending_chooser, viewGroup, false);
        this.cWF.a(this);
        this.cWF.chP.setLayoutTransition(ak.anP());
        this.cWF.chR.setLayoutTransition(ak.anP());
        Bundle arguments = getArguments();
        int i = arguments.getInt("arg.activeId");
        InstrumentType instrumentType = (InstrumentType) arguments.getSerializable("arg.activeType");
        this.cWD = arguments.getBoolean("arg.disabled.reset.value", true);
        this.cWB = com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(i), instrumentType);
        com.iqoption.core.microservices.tradingengine.response.active.a aVar = this.cWB;
        int i2 = 6;
        this.cWC = Math.pow(10.0d, (double) (-(aVar == null ? 6 : aVar.getPrecision())));
        RobotoEditText robotoEditText = this.cWF.chX;
        InputFilter[] inputFilterArr = new InputFilter[1];
        com.iqoption.core.microservices.tradingengine.response.active.a aVar2 = this.cWB;
        if (aVar2 != null) {
            i2 = aVar2.getPrecision();
        }
        inputFilterArr[0] = new com.iqoption.core.ui.widget.f.a(i2);
        robotoEditText.setFilters(inputFilterArr);
        this.cWF.chX.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        String str = "arg.value";
        if (arguments.containsKey(str)) {
            dp(false);
            setValue(arguments.getDouble(str));
        } else {
            dp(true);
            aye();
        }
        if (arguments.getBoolean("arg.mkt.on.open", false)) {
            this.cWF.chS.setText(R.string.market_on_open_order);
            this.cWF.chT.setText(R.string.latest_price);
        }
        new com.iqoption.view.text.g.a().ci(this.cWF.chW).a(new c()).a(new com.iqoption.view.text.g.b() {
            public void bj(View view) {
                if (ab.this.cWA) {
                    ab.this.dp(false);
                }
                Double c = ab.this.ayd();
                if (c != null) {
                    ab.this.setValue(c.doubleValue() + ab.this.cWC);
                    ab.this.cWE.h(0.0d);
                    IQApp.Ex().bd(new a(true, Double.valueOf(c.doubleValue() + ab.this.cWC)));
                }
            }
        }).aYG();
        new com.iqoption.view.text.g.a().ci(this.cWF.chU).a(new c()).a(new com.iqoption.view.text.g.b() {
            public void bj(View view) {
                if (ab.this.cWA) {
                    ab.this.dp(false);
                }
                Double c = ab.this.ayd();
                if (c != null) {
                    ab.this.setValue(c.doubleValue() - ab.this.cWC);
                    ab.this.cWE.h(0.0d);
                    IQApp.Ex().bd(new a(true, Double.valueOf(c.doubleValue() + ab.this.cWC)));
                }
            }
        }).aYG();
        this.cWF.chQ.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                ab.this.dp(true);
                ab.this.cWE.h(2.0d);
                IQApp.Ex().bd(new a(true, null));
            }
        });
        this.cWF.chV.setKeyListener(new com.iqoption.widget.SmallNumPad.b() {
            public void onKeyPressed(int i) {
                if (ab.this.cWA) {
                    ab.this.dp(false);
                }
                KeyEvent keyEvent = new KeyEvent(0, i);
                KeyEvent keyEvent2 = new KeyEvent(1, i);
                ab.this.cWF.chX.dispatchKeyEvent(keyEvent);
                ab.this.cWF.chX.dispatchKeyEvent(keyEvent2);
                ab.this.cWE.h(i == 67 ? 3.0d : 1.0d);
                Double c = ab.this.ayd();
                if (c != null) {
                    IQApp.Ex().bd(new a(false, c));
                }
            }
        });
        return this.cWF.getRoot();
    }

    private void dp(boolean z) {
        if (z && !this.cWA) {
            this.cWA = true;
            this.cWF.chQ.setVisibility(8);
            this.cWF.chT.setVisibility(0);
            aye();
            dq(true);
        } else if (!z && this.cWA) {
            this.cWA = false;
            this.cWF.chQ.setVisibility(0);
            this.cWF.chT.setVisibility(8);
            dq(false);
        }
        if (!this.cWD) {
            this.cWF.chQ.setVisibility(8);
        }
    }

    private void dq(boolean z) {
        if (getArguments().getBoolean("arg.mkt.on.open", false)) {
            this.cWF.chS.setText(z ? R.string.market_on_open_order : R.string.purchase_price);
        }
    }

    public void onTick(long j) {
        if (this.cWB != null && this.cWA) {
            aye();
        }
    }

    @Nullable
    private Double ayd() {
        return com.google.common.primitives.b.bV(this.cWF.chX.getText().toString().replaceAll("[^\\d\\.]", ""));
    }

    private void aye() {
        if (this.cWB == null) {
            this.cWF.chX.setText(R.string.n_a);
            return;
        }
        ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(this.cWB.getActiveId());
        if (dY != null) {
            setValue(dY.getVal());
        } else {
            this.cWF.chX.setText(R.string.n_a);
        }
    }

    private void setValue(double d) {
        com.iqoption.core.microservices.tradingengine.response.active.a aVar = this.cWB;
        if (aVar != null) {
            String format = j.fr(aVar.getPrecision()).format(d);
            this.cWF.chX.setText(format);
            this.cWF.chX.setSelection(format.length());
            this.cWF.chX.requestFocus();
        }
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        IQApp.Ex().bd(new b(true, this.cWA ? null : ayd()));
        this.cWE.onStart();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.cWE.onStop();
    }

    public boolean onClose() {
        getFragmentManager().popBackStack();
        IQApp.Ex().bd(new b(false, this.cWA ? null : ayd()));
        return true;
    }

    public void att() {
        this.cWF.bYN.setAlpha(0.0f);
        if (af.ebR) {
            Interpolator interpolator = com.iqoption.view.a.a.c.egR;
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp12);
            float f = (float) dimensionPixelSize;
            this.cWF.bYN.setTranslationX(f);
            float f2 = (float) (-dimensionPixelSize);
            this.cWF.bYN.setTranslationY(f2);
            this.cWF.aGo.setTranslationX(f);
            this.cWF.aGo.setTranslationY(f2);
            this.cWF.aGo.setAlpha(0.0f);
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.cWF.bYN, this.cWF.bYN.getWidth() - dimensionPixelSize, dimensionPixelSize, f, (float) Math.hypot((double) this.cWF.bYN.getWidth(), (double) this.cWF.bYN.getHeight()));
            createCircularReveal.setDuration(400).setInterpolator(interpolator);
            FrameLayout frameLayout = this.cWF.bYN;
            r6 = new PropertyValuesHolder[2];
            String str = "translationX";
            r6[0] = PropertyValuesHolder.ofFloat(str, new float[]{0.0f});
            String str2 = "translationY";
            r6[1] = PropertyValuesHolder.ofFloat(str2, new float[]{0.0f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout, r6);
            ofPropertyValuesHolder.setDuration(200).setInterpolator(interpolator);
            LinearLayout linearLayout = this.cWF.aGo;
            r8 = new PropertyValuesHolder[3];
            r8[0] = PropertyValuesHolder.ofFloat(str, new float[]{0.0f});
            r8[1] = PropertyValuesHolder.ofFloat(str2, new float[]{0.0f});
            r8[2] = PropertyValuesHolder.ofFloat("alpha", new float[]{1.0f});
            ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(linearLayout, r8);
            ofPropertyValuesHolder2.setDuration(200).setInterpolator(interpolator);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(createCircularReveal).with(ofPropertyValuesHolder);
            animatorSet.play(ofPropertyValuesHolder2).after(100);
            animatorSet.start();
            this.cWF.bYN.setAlpha(1.0f);
            return;
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dp12);
        float f3 = (float) (-dimensionPixelOffset);
        this.cWF.bYN.setTranslationX(f3);
        this.cWF.bYN.setTranslationY(f3);
        this.cWF.bYN.setPivotX((float) (this.cWF.bYN.getWidth() - dimensionPixelOffset));
        this.cWF.bYN.setPivotY(1.0f);
        this.cWF.bYN.setScaleX(0.3f);
        this.cWF.bYN.setScaleY(0.3f);
        this.cWF.bYN.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).translationX(0.0f).translationY(0.0f).setDuration(400).setListener(null).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }

    public void atu() {
        this.cWF.bYN.setPivotX((float) this.cWF.bYN.getWidth());
        this.cWF.bYN.setPivotY(1.0f);
        this.cWF.bYN.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).setDuration(300).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }
}
