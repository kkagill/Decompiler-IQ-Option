package com.iqoption.fragment.dialog;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.iqoption.analytics.EventManager;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.e.gc;
import com.iqoption.fragment.b.b;
import com.iqoption.util.t;
import com.iqoption.view.a.a.c;
import com.iqoption.x.R;

/* compiled from: MarginAddOnPositionDialog */
public final class e extends b {
    private static final String TAG = "com.iqoption.fragment.dialog.e";
    private Builder cVb;
    private gc deh;

    public long getAnimationDuration() {
        return 250;
    }

    public static void a(FragmentManager fragmentManager, long j) {
        if (t.c(fragmentManager, TAG)) {
            fragmentManager.beginTransaction().add(R.id.other_fragment, bG(j), TAG).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).addToBackStack(TAG).commit();
        }
    }

    private static e bG(long j) {
        e eVar = new e();
        eVar.setArguments(new com.iqoption.util.e().g("arg.position.id", j).toBundle());
        return eVar;
    }

    public void att() {
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.util.b.a(animatorSet, getAnimationDuration());
        Animator[] animatorArr = new Animator[2];
        animatorArr[0] = ObjectAnimator.ofFloat(this.deh.getRoot(), View.ALPHA, new float[]{0.0f, 1.0f});
        animatorArr[1] = ObjectAnimator.ofFloat(this.deh.aQN, View.TRANSLATION_Y, new float[]{(float) fA(R.dimen.dp24), 0.0f});
        animatorSet.playTogether(animatorArr);
        animatorSet.setInterpolator(c.egR);
        animatorSet.start();
    }

    public void atu() {
        AnimatorSet animatorSet = new AnimatorSet();
        com.iqoption.core.util.b.a(animatorSet, getAnimationDuration());
        Animator[] animatorArr = new Animator[2];
        animatorArr[0] = ObjectAnimator.ofFloat(this.deh.getRoot(), View.ALPHA, new float[]{1.0f, 0.0f});
        animatorArr[1] = ObjectAnimator.ofFloat(this.deh.aQN, View.TRANSLATION_Y, new float[]{0.0f, (float) fA(R.dimen.dp24)});
        animatorSet.playTogether(animatorArr);
        animatorSet.setInterpolator(c.egR);
        animatorSet.start();
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.deh = gc.m(layoutInflater, viewGroup, false);
        this.deh.getRoot().setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                e.this.dL(false);
                e.this.onClose();
            }
        });
        final long j = getArguments().getLong("arg.position.id");
        this.deh.cbI.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                e.this.dL(true);
                com.iqoption.mobbtech.connect.request.api.a.b.b(Long.valueOf(j), true);
                e.this.onClose();
            }
        });
        this.deh.aQO.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                e.this.dL(false);
                e.this.onClose();
            }
        });
        return this.deh.getRoot();
    }

    public boolean onClose() {
        getFragmentManager().popBackStack();
        return true;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.cVb = Event.Builder(Event.CATEGORY_POPUP_SERVED, "traderoom_margin-add-on-show");
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.cVb != null) {
            EventManager.BS().a(this.cVb.calcDuration().build());
        }
    }

    private void dL(boolean z) {
        Builder builder = this.cVb;
        if (builder != null) {
            builder.setValue(Double.valueOf(z ? 0.0d : 1.0d));
        }
    }
}
