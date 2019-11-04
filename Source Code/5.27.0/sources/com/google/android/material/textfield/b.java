package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.legacy.widget.Space;
import com.google.android.material.a.a;
import com.google.android.material.a.d;
import com.google.android.material.a.f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: IndicatorViewController */
final class b {
    private final TextInputLayout OZ;
    private LinearLayout Pa;
    private int Pb;
    private FrameLayout Pc;
    private int Pd;
    @Nullable
    private Animator Pe;
    private final float Pf = ((float) this.context.getResources().getDimensionPixelSize(d.design_textinput_caption_translate_y));
    private int Pg;
    private int Ph;
    private CharSequence Pi;
    private boolean Pj;
    private TextView Pk;
    private CharSequence Pl;
    private boolean Pm;
    private TextView Pn;
    private Typeface Po;
    private final Context context;
    private int errorTextAppearance;
    private int helperTextTextAppearance;

    /* Access modifiers changed, original: 0000 */
    public boolean be(int i) {
        return i == 0 || i == 1;
    }

    public b(TextInputLayout textInputLayout) {
        this.context = textInputLayout.getContext();
        this.OZ = textInputLayout;
    }

    /* Access modifiers changed, original: 0000 */
    public void i(CharSequence charSequence) {
        oN();
        this.Pl = charSequence;
        this.Pn.setText(charSequence);
        if (this.Pg != 2) {
            this.Ph = 2;
        }
        b(this.Pg, this.Ph, a(this.Pn, charSequence));
    }

    /* Access modifiers changed, original: 0000 */
    public void oL() {
        oN();
        if (this.Pg == 2) {
            this.Ph = 0;
        }
        b(this.Pg, this.Ph, a(this.Pn, null));
    }

    /* Access modifiers changed, original: 0000 */
    public void j(CharSequence charSequence) {
        oN();
        this.Pi = charSequence;
        this.Pk.setText(charSequence);
        if (this.Pg != 1) {
            this.Ph = 1;
        }
        b(this.Pg, this.Ph, a(this.Pk, charSequence));
    }

    /* Access modifiers changed, original: 0000 */
    public void oM() {
        this.Pi = null;
        oN();
        if (this.Pg == 1) {
            if (!this.Pm || TextUtils.isEmpty(this.Pl)) {
                this.Ph = 0;
            } else {
                this.Ph = 2;
            }
        }
        b(this.Pg, this.Ph, a(this.Pk, null));
    }

    private boolean a(TextView textView, @Nullable CharSequence charSequence) {
        return ViewCompat.isLaidOut(this.OZ) && this.OZ.isEnabled() && !(this.Ph == this.Pg && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    private void b(int i, int i2, boolean z) {
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.Pe = animatorSet;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = arrayList;
            int i3 = i;
            int i4 = i2;
            a(arrayList2, this.Pm, this.Pn, 2, i3, i4);
            a(arrayList2, this.Pj, this.Pk, 1, i3, i4);
            com.google.android.material.a.b.a(animatorSet, arrayList);
            final TextView bf = bf(i);
            final TextView bf2 = bf(i2);
            final int i5 = i2;
            final int i6 = i;
            animatorSet.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    b.this.Pg = i5;
                    b.this.Pe = null;
                    TextView textView = bf;
                    if (textView != null) {
                        textView.setVisibility(4);
                        if (i6 == 1 && b.this.Pk != null) {
                            b.this.Pk.setText(null);
                        }
                    }
                }

                public void onAnimationStart(Animator animator) {
                    TextView textView = bf2;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                }
            });
            animatorSet.start();
        } else {
            r(i, i2);
        }
        this.OZ.ph();
        this.OZ.ab(z);
        this.OZ.pq();
    }

    private void r(int i, int i2) {
        if (i != i2) {
            TextView bf;
            if (i2 != 0) {
                bf = bf(i2);
                if (bf != null) {
                    bf.setVisibility(0);
                    bf.setAlpha(1.0f);
                }
            }
            if (i != 0) {
                bf = bf(i);
                if (bf != null) {
                    bf.setVisibility(4);
                    if (i == 1) {
                        bf.setText(null);
                    }
                }
            }
            this.Pg = i2;
        }
    }

    private void a(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                list.add(a(textView, i3 == i));
                if (i3 == i) {
                    list.add(g(textView));
                }
            }
        }
    }

    private ObjectAnimator a(TextView textView, boolean z) {
        float f = z ? 1.0f : 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(a.DG);
        return ofFloat;
    }

    private ObjectAnimator g(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.Pf, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(a.DL);
        return ofFloat;
    }

    /* Access modifiers changed, original: 0000 */
    public void oN() {
        Animator animator = this.Pe;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Nullable
    private TextView bf(int i) {
        if (i != 1) {
            return i != 2 ? null : this.Pn;
        } else {
            return this.Pk;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void oO() {
        if (oP()) {
            ViewCompat.setPaddingRelative(this.Pa, ViewCompat.getPaddingStart(this.OZ.getEditText()), 0, ViewCompat.getPaddingEnd(this.OZ.getEditText()), 0);
        }
    }

    private boolean oP() {
        return (this.Pa == null || this.OZ.getEditText() == null) ? false : true;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(TextView textView, int i) {
        if (this.Pa == null && this.Pc == null) {
            this.Pa = new LinearLayout(this.context);
            this.Pa.setOrientation(0);
            this.OZ.addView(this.Pa, -1, -2);
            this.Pc = new FrameLayout(this.context);
            this.Pa.addView(this.Pc, -1, new LayoutParams(-2, -2));
            this.Pa.addView(new Space(this.context), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.OZ.getEditText() != null) {
                oO();
            }
        }
        if (be(i)) {
            this.Pc.setVisibility(0);
            this.Pc.addView(textView);
            this.Pd++;
        } else {
            this.Pa.addView(textView, i);
        }
        this.Pa.setVisibility(0);
        this.Pb++;
    }

    /* Access modifiers changed, original: 0000 */
    public void b(TextView textView, int i) {
        if (this.Pa != null) {
            if (be(i)) {
                ViewGroup viewGroup = this.Pc;
                if (viewGroup != null) {
                    this.Pd--;
                    a(viewGroup, this.Pd);
                    this.Pc.removeView(textView);
                    this.Pb--;
                    a(this.Pa, this.Pb);
                }
            }
            this.Pa.removeView(textView);
            this.Pb--;
            a(this.Pa, this.Pb);
        }
    }

    private void a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setErrorEnabled(boolean z) {
        if (this.Pj != z) {
            oN();
            if (z) {
                this.Pk = new AppCompatTextView(this.context);
                this.Pk.setId(f.textinput_error);
                Typeface typeface = this.Po;
                if (typeface != null) {
                    this.Pk.setTypeface(typeface);
                }
                setErrorTextAppearance(this.errorTextAppearance);
                this.Pk.setVisibility(4);
                ViewCompat.setAccessibilityLiveRegion(this.Pk, 1);
                a(this.Pk, 0);
            } else {
                oM();
                b(this.Pk, 0);
                this.Pk = null;
                this.OZ.ph();
                this.OZ.pq();
            }
            this.Pj = z;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isErrorEnabled() {
        return this.Pj;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean oQ() {
        return this.Pm;
    }

    /* Access modifiers changed, original: 0000 */
    public void setHelperTextEnabled(boolean z) {
        if (this.Pm != z) {
            oN();
            if (z) {
                this.Pn = new AppCompatTextView(this.context);
                this.Pn.setId(f.textinput_helper_text);
                Typeface typeface = this.Po;
                if (typeface != null) {
                    this.Pn.setTypeface(typeface);
                }
                this.Pn.setVisibility(4);
                ViewCompat.setAccessibilityLiveRegion(this.Pn, 1);
                bh(this.helperTextTextAppearance);
                a(this.Pn, 1);
            } else {
                oL();
                b(this.Pn, 1);
                this.Pn = null;
                this.OZ.ph();
                this.OZ.pq();
            }
            this.Pm = z;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean oR() {
        return bg(this.Ph);
    }

    private boolean bg(int i) {
        if (i != 1 || this.Pk == null || TextUtils.isEmpty(this.Pi)) {
            return false;
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public CharSequence oS() {
        return this.Pi;
    }

    /* Access modifiers changed, original: 0000 */
    public CharSequence getHelperText() {
        return this.Pl;
    }

    /* Access modifiers changed, original: 0000 */
    public void b(Typeface typeface) {
        if (typeface != this.Po) {
            this.Po = typeface;
            a(this.Pk, typeface);
            a(this.Pn, typeface);
        }
    }

    private void a(@Nullable TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* Access modifiers changed, original: 0000 */
    @ColorInt
    public int oT() {
        TextView textView = this.Pk;
        return textView != null ? textView.getCurrentTextColor() : -1;
    }

    /* Access modifiers changed, original: 0000 */
    @Nullable
    public ColorStateList oU() {
        TextView textView = this.Pk;
        return textView != null ? textView.getTextColors() : null;
    }

    /* Access modifiers changed, original: 0000 */
    public void e(@Nullable ColorStateList colorStateList) {
        TextView textView = this.Pk;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setErrorTextAppearance(@StyleRes int i) {
        this.errorTextAppearance = i;
        TextView textView = this.Pk;
        if (textView != null) {
            this.OZ.c(textView, i);
        }
    }

    /* Access modifiers changed, original: 0000 */
    @ColorInt
    public int oV() {
        TextView textView = this.Pn;
        return textView != null ? textView.getCurrentTextColor() : -1;
    }

    /* Access modifiers changed, original: 0000 */
    public void f(@Nullable ColorStateList colorStateList) {
        TextView textView = this.Pn;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void bh(@StyleRes int i) {
        this.helperTextTextAppearance = i;
        TextView textView = this.Pn;
        if (textView != null) {
            TextViewCompat.setTextAppearance(textView, i);
        }
    }
}
