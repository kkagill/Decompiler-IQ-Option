package com.iqoption.fragment.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import com.google.gson.JsonObject;
import com.iqoption.analytics.EventManager;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.e.dh;
import com.iqoption.util.y;
import com.iqoption.view.a.a.a.a;
import com.iqoption.view.a.a.a.b;
import com.iqoption.view.a.a.c;
import com.iqoption.x.R;

/* compiled from: IQSmartFragment */
public abstract class g extends b {
    private static final String TAG = "com.iqoption.fragment.b.g";
    protected Builder ajf;
    private dh ddv;
    private View ddw;
    private View mContent;

    public abstract View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle);

    @Nullable
    public JsonObject aBP() {
        return null;
    }

    /* Access modifiers changed, original: protected */
    public void aBQ() {
    }

    /* Access modifiers changed, original: protected */
    public void aBR() {
    }

    /* Access modifiers changed, original: protected */
    public void atD() {
    }

    public View b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public abstract String getEventName();

    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ddv = (dh) DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.base_smart_fragment, viewGroup, false);
        this.ddv.a(this);
        this.ddv.bYj.setOnTouchListener(new -$$Lambda$g$pMkPYLLFrE7QZkjIw_MDsnthstM(this));
        this.ddv.bYl.setOnClickListener(new -$$Lambda$g$GRibsG3gY3fZlmyHdx-omq6R8tI(this));
        this.mContent = a(layoutInflater, this.ddv.bYj, bundle);
        this.ddw = b(layoutInflater, this.ddv.bYl, bundle);
        this.ddv.bYj.getLayoutParams().width = aBO();
        this.ddv.bYj.addView(this.mContent);
        if (this.ddw != null) {
            this.ddv.bYl.addView(this.ddw);
        }
        return this.ddv.getRoot();
    }

    private /* synthetic */ boolean c(View view, MotionEvent motionEvent) {
        if (akX()) {
            y.a(getActivity(), view);
        }
        return true;
    }

    private /* synthetic */ void aD(View view) {
        if (akX()) {
            y.a(getActivity(), view);
        }
    }

    public void onViewCreated(@NonNull View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        String eventName = getEventName();
        if (eventName != null) {
            this.ajf = Event.Builder(Event.CATEGORY_POPUP_SERVED, eventName);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.ajf != null) {
            JsonObject aBP = aBP();
            if (aBP != null) {
                this.ajf.setParameters(aBP);
            }
            EventManager.BS().a(this.ajf.calcDuration().build());
        }
    }

    private boolean aBN() {
        return aBO() == 0;
    }

    /* Access modifiers changed, original: protected */
    public int aBO() {
        return getResources().getDimensionPixelSize(R.dimen.iq_smart_fragment_width);
    }

    public void atu() {
        float f = aBN() ? 1.0f : 1.7f;
        this.ddv.bYl.animate().alpha(0.0f).scaleY(f).scaleX(f).setDuration(300).setInterpolator(c.egR).setListener(a.c(new b() {
            public void execute() {
                g.this.aBR();
            }
        })).start();
    }

    public void att() {
        this.ddv.bYl.setAlpha(0.0f);
        this.mContent.setAlpha(0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mContent, "alpha", new float[]{1.0f});
        ofFloat.setInterpolator(c.egR);
        ofFloat.setDuration(300);
        AnimatorSet animatorSet = new AnimatorSet();
        if (aBN()) {
            animatorSet.play(ofFloat);
            animatorSet.setInterpolator(c.egR);
        } else {
            float width = ((float) this.ddv.bYl.getWidth()) / ((float) this.ddv.bYj.getWidth());
            this.ddv.bYj.setScaleX(width);
            this.ddv.bYj.setScaleY(width);
            FrameLayout frameLayout = this.ddv.bYj;
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[3];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f, 1.0f});
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f});
            propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout, propertyValuesHolderArr);
            ofPropertyValuesHolder.setDuration(400);
            ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    g.this.aBQ();
                }
            });
            ofPropertyValuesHolder.setInterpolator(c.egR);
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(0), Integer.valueOf(-1476395008)});
            ofObject.addUpdateListener(new com.iqoption.core.ui.animation.b(this.ddv.bYl));
            ofObject.setInterpolator(c.egR);
            ofObject.setDuration(400);
            animatorSet.playTogether(new Animator[]{ofObject, ofPropertyValuesHolder});
            animatorSet.play(ofFloat).after(300);
        }
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                g.this.atD();
            }
        });
        animatorSet.start();
        this.ddv.bYl.setAlpha(1.0f);
    }

    public boolean onClose() {
        FragmentManager fragmentManager = getFragmentManager();
        if (!(fragmentManager == null || fragmentManager.isStateSaved())) {
            fragmentManager.popBackStack();
        }
        return true;
    }
}
