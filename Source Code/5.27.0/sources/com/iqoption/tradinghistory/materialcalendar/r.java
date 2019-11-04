package com.iqoption.tradinghistory.materialcalendar;

import android.animation.Animator;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.iqoption.tradinghistory.materialcalendar.a.g;

/* compiled from: TitleChanger */
class r {
    private final TextView alH;
    private g dZh;
    private final int eaB;
    private final int eaC;
    private final int eaD;
    private long eaE = 0;
    private b eaF = null;
    private final Interpolator kl = new DecelerateInterpolator(2.0f);
    private int orientation = 0;

    public r(TextView textView) {
        this.alH = textView;
        Resources resources = textView.getResources();
        this.eaB = 400;
        this.eaC = resources.getInteger(17694720) / 2;
        this.eaD = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
    }

    public void l(b bVar) {
        long currentTimeMillis = System.currentTimeMillis();
        if (bVar != null) {
            if (TextUtils.isEmpty(this.alH.getText()) || currentTimeMillis - this.eaE < ((long) this.eaB)) {
                a(currentTimeMillis, bVar, false);
            }
            if (!(bVar.equals(this.eaF) || (bVar.getMonth() == this.eaF.getMonth() && bVar.getYear() == this.eaF.getYear()))) {
                a(currentTimeMillis, bVar, true);
            }
        }
    }

    private void a(long j, b bVar, boolean z) {
        this.alH.animate().cancel();
        i(this.alH, 0);
        this.alH.setAlpha(1.0f);
        this.eaE = j;
        final CharSequence o = this.dZh.o(bVar);
        if (z) {
            final int i = this.eaD * (this.eaF.a(bVar) ? 1 : -1);
            ViewPropertyAnimator animate = this.alH.animate();
            if (this.orientation == 1) {
                animate.translationX((float) (i * -1));
            } else {
                animate.translationY((float) (i * -1));
            }
            animate.alpha(0.0f).setDuration((long) this.eaC).setInterpolator(this.kl).setListener(new a() {
                public void onAnimationCancel(Animator animator) {
                    r rVar = r.this;
                    rVar.i(rVar.alH, 0);
                    r.this.alH.setAlpha(1.0f);
                }

                public void onAnimationEnd(Animator animator) {
                    r.this.alH.setText(o);
                    r rVar = r.this;
                    rVar.i(rVar.alH, i);
                    ViewPropertyAnimator animate = r.this.alH.animate();
                    if (r.this.orientation == 1) {
                        animate.translationX(0.0f);
                    } else {
                        animate.translationY(0.0f);
                    }
                    animate.alpha(1.0f).setDuration((long) r.this.eaC).setInterpolator(r.this.kl).setListener(new a()).start();
                }
            }).start();
        } else {
            this.alH.setText(o);
        }
        this.eaF = bVar;
    }

    private void i(TextView textView, int i) {
        if (this.orientation == 1) {
            textView.setTranslationX((float) i);
        } else {
            textView.setTranslationY((float) i);
        }
    }

    public void setTitleFormatter(g gVar) {
        this.dZh = gVar;
    }

    public void setOrientation(int i) {
        this.orientation = i;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public void m(b bVar) {
        this.eaF = bVar;
    }
}
