package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.a.c;
import com.google.android.material.a.d;
import com.google.android.material.a.f;
import com.google.android.material.a.i;
import com.google.android.material.a.j;
import com.google.android.material.a.k;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.g;
import com.google.android.material.internal.h;

public class TextInputLayout extends LinearLayout {
    private final Rect Ir;
    private ValueAnimator Le;
    private TextView PB;
    private boolean PC;
    private boolean PD;
    private GradientDrawable PI;
    private final int PJ;
    private final int PO;
    private final int PP;
    private float PQ;
    private float PU;
    private float PV;
    private float PZ;
    private Typeface Po;
    private final FrameLayout Pu;
    EditText Pv;
    private CharSequence Pw;
    private final b Px;
    boolean Py;
    private boolean Pz;
    private boolean QB;
    private boolean QC;
    private int Qa;
    private final int Qb;
    private final int Qc;
    private Drawable Qd;
    private final RectF Qe;
    private boolean Qf;
    private Drawable Qg;
    private CharSequence Qh;
    private CheckableImageButton Qi;
    private boolean Qj;
    private Drawable Qk;
    private Drawable Ql;
    private ColorStateList Qm;
    private boolean Qn;
    private Mode Qo;
    private boolean Qp;
    private ColorStateList Qq;
    private ColorStateList Qr;
    @ColorInt
    private final int Qs;
    @ColorInt
    private final int Qt;
    @ColorInt
    private int Qu;
    @ColorInt
    private final int Qv;
    private boolean Qw;
    final com.google.android.material.internal.b Qx;
    private boolean Qy;
    private boolean Qz;
    @ColorInt
    private int boxBackgroundColor;
    private int boxBackgroundMode;
    @ColorInt
    private int boxStrokeColor;
    private int counterMaxLength;
    private final int counterOverflowTextAppearance;
    private final int counterTextAppearance;
    private CharSequence hint;

    public static class a extends AccessibilityDelegateCompat {
        private final TextInputLayout QE;

        public a(TextInputLayout textInputLayout) {
            this.QE = textInputLayout;
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            EditText editText = this.QE.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.QE.getHint();
            CharSequence error = this.QE.getError();
            CharSequence counterOverflowDescription = this.QE.getCounterOverflowDescription();
            int isEmpty = TextUtils.isEmpty(text) ^ 1;
            int isEmpty2 = TextUtils.isEmpty(hint) ^ 1;
            int isEmpty3 = TextUtils.isEmpty(error) ^ 1;
            boolean z = false;
            Object obj = (isEmpty3 == 0 && TextUtils.isEmpty(counterOverflowDescription)) ? null : 1;
            if (isEmpty != 0) {
                accessibilityNodeInfoCompat.setText(text);
            } else if (isEmpty2 != 0) {
                accessibilityNodeInfoCompat.setText(hint);
            }
            if (isEmpty2 != 0) {
                accessibilityNodeInfoCompat.setHintText(hint);
                if (isEmpty == 0 && isEmpty2 != 0) {
                    z = true;
                }
                accessibilityNodeInfoCompat.setShowingHintText(z);
            }
            if (obj != null) {
                if (isEmpty3 == 0) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfoCompat.setError(error);
                accessibilityNodeInfoCompat.setContentInvalid(true);
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            EditText editText = this.QE.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            if (TextUtils.isEmpty(text)) {
                text = this.QE.getHint();
            }
            if (!TextUtils.isEmpty(text)) {
                accessibilityEvent.getText().add(text);
            }
        }
    }

    static class b extends AbsSavedState {
        public static final Creator<b> CREATOR = new ClassLoaderCreator<b>() {
            /* renamed from: f */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            /* renamed from: S */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            /* renamed from: bj */
            public b[] newArray(int i) {
                return new b[i];
            }
        };
        CharSequence QF;
        boolean QG;

        b(Parcelable parcelable) {
            super(parcelable);
        }

        b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.QF = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.QG = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.QF, parcel, i);
            parcel.writeInt(this.QG);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TextInputLayout.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" error=");
            stringBuilder.append(this.QF);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.a.b.textInputStyle);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Px = new b(this);
        this.Ir = new Rect();
        this.Qe = new RectF();
        this.Qx = new com.google.android.material.internal.b(this);
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        this.Pu = new FrameLayout(context);
        this.Pu.setAddStatesFromChildren(true);
        addView(this.Pu);
        this.Qx.a(com.google.android.material.a.a.DG);
        this.Qx.b(com.google.android.material.a.a.DG);
        this.Qx.aK(8388659);
        TintTypedArray b = g.b(context, attributeSet, k.TextInputLayout, i, j.Widget_Design_TextInputLayout, new int[0]);
        this.PC = b.getBoolean(k.TextInputLayout_hintEnabled, true);
        setHint(b.getText(k.TextInputLayout_android_hint));
        this.Qy = b.getBoolean(k.TextInputLayout_hintAnimationEnabled, true);
        this.PJ = context.getResources().getDimensionPixelOffset(d.mtrl_textinput_box_bottom_offset);
        this.PO = context.getResources().getDimensionPixelOffset(d.mtrl_textinput_box_label_cutout_padding);
        this.PP = b.getDimensionPixelOffset(k.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.PQ = b.getDimension(k.TextInputLayout_boxCornerRadiusTopStart, 0.0f);
        this.PU = b.getDimension(k.TextInputLayout_boxCornerRadiusTopEnd, 0.0f);
        this.PV = b.getDimension(k.TextInputLayout_boxCornerRadiusBottomEnd, 0.0f);
        this.PZ = b.getDimension(k.TextInputLayout_boxCornerRadiusBottomStart, 0.0f);
        this.boxBackgroundColor = b.getColor(k.TextInputLayout_boxBackgroundColor, 0);
        this.Qu = b.getColor(k.TextInputLayout_boxStrokeColor, 0);
        this.Qb = context.getResources().getDimensionPixelSize(d.mtrl_textinput_box_stroke_width_default);
        this.Qc = context.getResources().getDimensionPixelSize(d.mtrl_textinput_box_stroke_width_focused);
        this.Qa = this.Qb;
        setBoxBackgroundMode(b.getInt(k.TextInputLayout_boxBackgroundMode, 0));
        if (b.hasValue(k.TextInputLayout_android_textColorHint)) {
            ColorStateList colorStateList = b.getColorStateList(k.TextInputLayout_android_textColorHint);
            this.Qr = colorStateList;
            this.Qq = colorStateList;
        }
        this.Qs = ContextCompat.getColor(context, c.mtrl_textinput_default_box_stroke_color);
        this.Qv = ContextCompat.getColor(context, c.mtrl_textinput_disabled_color);
        this.Qt = ContextCompat.getColor(context, c.mtrl_textinput_hovered_box_stroke_color);
        if (b.getResourceId(k.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(b.getResourceId(k.TextInputLayout_hintTextAppearance, 0));
        }
        int resourceId = b.getResourceId(k.TextInputLayout_errorTextAppearance, 0);
        boolean z = b.getBoolean(k.TextInputLayout_errorEnabled, false);
        int resourceId2 = b.getResourceId(k.TextInputLayout_helperTextTextAppearance, 0);
        boolean z2 = b.getBoolean(k.TextInputLayout_helperTextEnabled, false);
        CharSequence text = b.getText(k.TextInputLayout_helperText);
        boolean z3 = b.getBoolean(k.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(b.getInt(k.TextInputLayout_counterMaxLength, -1));
        this.counterTextAppearance = b.getResourceId(k.TextInputLayout_counterTextAppearance, 0);
        this.counterOverflowTextAppearance = b.getResourceId(k.TextInputLayout_counterOverflowTextAppearance, 0);
        this.Qf = b.getBoolean(k.TextInputLayout_passwordToggleEnabled, false);
        this.Qg = b.getDrawable(k.TextInputLayout_passwordToggleDrawable);
        this.Qh = b.getText(k.TextInputLayout_passwordToggleContentDescription);
        if (b.hasValue(k.TextInputLayout_passwordToggleTint)) {
            this.Qn = true;
            this.Qm = b.getColorStateList(k.TextInputLayout_passwordToggleTint);
        }
        if (b.hasValue(k.TextInputLayout_passwordToggleTintMode)) {
            this.Qp = true;
            this.Qo = h.parseTintMode(b.getInt(k.TextInputLayout_passwordToggleTintMode, -1), null);
        }
        b.recycle();
        setHelperTextEnabled(z2);
        setHelperText(text);
        setHelperTextTextAppearance(resourceId2);
        setErrorEnabled(z);
        setErrorTextAppearance(resourceId);
        setCounterEnabled(z3);
        pm();
        ViewCompat.setImportantForAccessibility(this, 2);
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.Pu.addView(view, layoutParams2);
            this.Pu.setLayoutParams(layoutParams);
            oY();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    @NonNull
    private Drawable getBoxBackground() {
        int i = this.boxBackgroundMode;
        if (i == 1 || i == 2) {
            return this.PI;
        }
        throw new IllegalStateException();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.boxBackgroundMode) {
            this.boxBackgroundMode = i;
            oW();
        }
    }

    private void oW() {
        oX();
        if (this.boxBackgroundMode != 0) {
            oY();
        }
        pa();
    }

    private void oX() {
        int i = this.boxBackgroundMode;
        if (i == 0) {
            this.PI = null;
        } else if (i == 2 && this.PC && !(this.PI instanceof a)) {
            this.PI = new a();
        } else if (!(this.PI instanceof GradientDrawable)) {
            this.PI = new GradientDrawable();
        }
    }

    public void setBoxStrokeColor(@ColorInt int i) {
        if (this.Qu != i) {
            this.Qu = i;
            pq();
        }
    }

    public int getBoxStrokeColor() {
        return this.Qu;
    }

    public void setBoxBackgroundColorResource(@ColorRes int i) {
        setBoxBackgroundColor(ContextCompat.getColor(getContext(), i));
    }

    public void setBoxBackgroundColor(@ColorInt int i) {
        if (this.boxBackgroundColor != i) {
            this.boxBackgroundColor = i;
            pg();
        }
    }

    public int getBoxBackgroundColor() {
        return this.boxBackgroundColor;
    }

    public float getBoxCornerRadiusTopStart() {
        return this.PQ;
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.PU;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.PV;
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.PZ;
    }

    private float[] getCornerRadiiAsArray() {
        float[] fArr;
        float f;
        float f2;
        float f3;
        float f4;
        if (h.isLayoutRtl(this)) {
            fArr = new float[8];
            f = this.PU;
            fArr[0] = f;
            fArr[1] = f;
            f2 = this.PQ;
            fArr[2] = f2;
            fArr[3] = f2;
            f3 = this.PZ;
            fArr[4] = f3;
            fArr[5] = f3;
            f4 = this.PV;
            fArr[6] = f4;
            fArr[7] = f4;
            return fArr;
        }
        fArr = new float[8];
        f = this.PQ;
        fArr[0] = f;
        fArr[1] = f;
        f2 = this.PU;
        fArr[2] = f2;
        fArr[3] = f2;
        f3 = this.PV;
        fArr[4] = f3;
        fArr[5] = f3;
        f4 = this.PZ;
        fArr[6] = f4;
        fArr[7] = f4;
        return fArr;
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.Po) {
            this.Po = typeface;
            this.Qx.b(typeface);
            this.Px.b(typeface);
            TextView textView = this.PB;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    @Nullable
    public Typeface getTypeface() {
        return this.Po;
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (this.Pw != null) {
            EditText editText = this.Pv;
            if (editText != null) {
                boolean z = this.PD;
                this.PD = false;
                CharSequence hint = editText.getHint();
                this.Pv.setHint(this.Pw);
                try {
                    super.dispatchProvideAutofillStructure(viewStructure, i);
                    return;
                } finally {
                    this.Pv.setHint(hint);
                    this.PD = z;
                }
            }
        }
        super.dispatchProvideAutofillStructure(viewStructure, i);
    }

    private void setEditText(EditText editText) {
        if (this.Pv == null) {
            if (!(editText instanceof c)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.Pv = editText;
            oW();
            setTextInputAccessibilityDelegate(new a(this));
            if (!pk()) {
                this.Qx.b(this.Pv.getTypeface());
            }
            this.Qx.u(this.Pv.getTextSize());
            int gravity = this.Pv.getGravity();
            this.Qx.aK((gravity & -113) | 48);
            this.Qx.aJ(gravity);
            this.Pv.addTextChangedListener(new TextWatcher() {
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void afterTextChanged(Editable editable) {
                    TextInputLayout textInputLayout = TextInputLayout.this;
                    textInputLayout.ab(textInputLayout.QC ^ 1);
                    if (TextInputLayout.this.Py) {
                        TextInputLayout.this.bi(editable.length());
                    }
                }
            });
            if (this.Qq == null) {
                this.Qq = this.Pv.getHintTextColors();
            }
            if (this.PC) {
                if (TextUtils.isEmpty(this.hint)) {
                    this.Pw = this.Pv.getHint();
                    setHint(this.Pw);
                    this.Pv.setHint(null);
                }
                this.PD = true;
            }
            if (this.PB != null) {
                bi(this.Pv.getText().length());
            }
            this.Px.oO();
            pj();
            c(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void oY() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.Pu.getLayoutParams();
        int pc = pc();
        if (pc != layoutParams.topMargin) {
            layoutParams.topMargin = pc;
            this.Pu.requestLayout();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ab(boolean z) {
        c(z, false);
    }

    private void c(boolean z, boolean z2) {
        boolean isEnabled = isEnabled();
        EditText editText = this.Pv;
        Object obj = 1;
        Object obj2 = (editText == null || TextUtils.isEmpty(editText.getText())) ? null : 1;
        EditText editText2 = this.Pv;
        if (editText2 == null || !editText2.hasFocus()) {
            obj = null;
        }
        boolean oR = this.Px.oR();
        ColorStateList colorStateList = this.Qq;
        if (colorStateList != null) {
            this.Qx.b(colorStateList);
            this.Qx.c(this.Qq);
        }
        if (!isEnabled) {
            this.Qx.b(ColorStateList.valueOf(this.Qv));
            this.Qx.c(ColorStateList.valueOf(this.Qv));
        } else if (oR) {
            this.Qx.b(this.Px.oU());
        } else {
            if (this.Pz) {
                TextView textView = this.PB;
                if (textView != null) {
                    this.Qx.b(textView.getTextColors());
                }
            }
            if (obj != null) {
                ColorStateList colorStateList2 = this.Qr;
                if (colorStateList2 != null) {
                    this.Qx.b(colorStateList2);
                }
            }
        }
        if (obj2 != null || (isEnabled() && (obj != null || oR))) {
            if (z2 || this.Qw) {
                ad(z);
            }
        } else if (z2 || !this.Qw) {
            ae(z);
        }
    }

    @Nullable
    public EditText getEditText() {
        return this.Pv;
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.PC) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.hint)) {
            this.hint = charSequence;
            this.Qx.setText(charSequence);
            if (!this.Qw) {
                po();
            }
        }
    }

    @Nullable
    public CharSequence getHint() {
        return this.PC ? this.hint : null;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.PC) {
            this.PC = z;
            if (this.PC) {
                CharSequence hint = this.Pv.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.hint)) {
                        setHint(hint);
                    }
                    this.Pv.setHint(null);
                }
                this.PD = true;
            } else {
                this.PD = false;
                if (!TextUtils.isEmpty(this.hint) && TextUtils.isEmpty(this.Pv.getHint())) {
                    this.Pv.setHint(this.hint);
                }
                setHintInternal(null);
            }
            if (this.Pv != null) {
                oY();
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean oZ() {
        return this.PD;
    }

    public void setHintTextAppearance(@StyleRes int i) {
        this.Qx.aL(i);
        this.Qr = this.Qx.nY();
        if (this.Pv != null) {
            ab(false);
            oY();
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.Qq = colorStateList;
        this.Qr = colorStateList;
        if (this.Pv != null) {
            ab(false);
        }
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.Qq;
    }

    public void setErrorEnabled(boolean z) {
        this.Px.setErrorEnabled(z);
    }

    public void setErrorTextAppearance(@StyleRes int i) {
        this.Px.setErrorTextAppearance(i);
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        this.Px.e(colorStateList);
    }

    @ColorInt
    public int getErrorCurrentTextColors() {
        return this.Px.oT();
    }

    public void setHelperTextTextAppearance(@StyleRes int i) {
        this.Px.bh(i);
    }

    public void setHelperTextEnabled(boolean z) {
        this.Px.setHelperTextEnabled(z);
    }

    public void setHelperText(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!oQ()) {
                setHelperTextEnabled(true);
            }
            this.Px.i(charSequence);
        } else if (oQ()) {
            setHelperTextEnabled(false);
        }
    }

    public boolean oQ() {
        return this.Px.oQ();
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        this.Px.f(colorStateList);
    }

    @ColorInt
    public int getHelperTextCurrentTextColor() {
        return this.Px.oV();
    }

    public void setError(@Nullable CharSequence charSequence) {
        if (!this.Px.isErrorEnabled()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.Px.oM();
        } else {
            this.Px.j(charSequence);
        }
    }

    public void setCounterEnabled(boolean z) {
        if (this.Py != z) {
            if (z) {
                this.PB = new AppCompatTextView(getContext());
                this.PB.setId(f.textinput_counter);
                Typeface typeface = this.Po;
                if (typeface != null) {
                    this.PB.setTypeface(typeface);
                }
                this.PB.setMaxLines(1);
                c(this.PB, this.counterTextAppearance);
                this.Px.a(this.PB, 2);
                EditText editText = this.Pv;
                if (editText == null) {
                    bi(0);
                } else {
                    bi(editText.getText().length());
                }
            } else {
                this.Px.b(this.PB, 2);
                this.PB = null;
            }
            this.Py = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.counterMaxLength != i) {
            if (i > 0) {
                this.counterMaxLength = i;
            } else {
                this.counterMaxLength = -1;
            }
            if (this.Py) {
                EditText editText = this.Pv;
                bi(editText == null ? 0 : editText.getText().length());
            }
        }
    }

    public void setEnabled(boolean z) {
        a(this, z);
        super.setEnabled(z);
    }

    private static void a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, z);
            }
        }
    }

    public int getCounterMaxLength() {
        return this.counterMaxLength;
    }

    /* Access modifiers changed, original: 0000 */
    @Nullable
    public CharSequence getCounterOverflowDescription() {
        if (this.Py && this.Pz) {
            TextView textView = this.PB;
            if (textView != null) {
                return textView.getContentDescription();
            }
        }
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public void bi(int i) {
        boolean z = this.Pz;
        if (this.counterMaxLength == -1) {
            this.PB.setText(String.valueOf(i));
            this.PB.setContentDescription(null);
            this.Pz = false;
        } else {
            if (ViewCompat.getAccessibilityLiveRegion(this.PB) == 1) {
                ViewCompat.setAccessibilityLiveRegion(this.PB, 0);
            }
            this.Pz = i > this.counterMaxLength;
            boolean z2 = this.Pz;
            if (z != z2) {
                c(this.PB, z2 ? this.counterOverflowTextAppearance : this.counterTextAppearance);
                if (this.Pz) {
                    ViewCompat.setAccessibilityLiveRegion(this.PB, 1);
                }
            }
            this.PB.setText(getContext().getString(i.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.counterMaxLength)}));
            this.PB.setContentDescription(getContext().getString(i.character_counter_content_description, new Object[]{Integer.valueOf(i), Integer.valueOf(this.counterMaxLength)}));
        }
        if (this.Pv != null && z != this.Pz) {
            ab(false);
            pq();
            ph();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void c(TextView textView, @StyleRes int i) {
        Object obj = 1;
        try {
            TextViewCompat.setTextAppearance(textView, i);
            if (VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                obj = null;
            }
        } catch (Exception unused) {
        }
        if (obj != null) {
            TextViewCompat.setTextAppearance(textView, j.TextAppearance_AppCompat_Caption);
            textView.setTextColor(ContextCompat.getColor(getContext(), c.design_error));
        }
    }

    private void pa() {
        if (this.boxBackgroundMode != 0 && this.PI != null && this.Pv != null && getRight() != 0) {
            int left = this.Pv.getLeft();
            int pb = pb();
            int right = this.Pv.getRight();
            int bottom = this.Pv.getBottom() + this.PJ;
            if (this.boxBackgroundMode == 2) {
                int i = this.Qc;
                left += i / 2;
                pb -= i / 2;
                right -= i / 2;
                bottom += i / 2;
            }
            this.PI.setBounds(left, pb, right, bottom);
            pg();
            pe();
        }
    }

    private int pb() {
        EditText editText = this.Pv;
        if (editText == null) {
            return 0;
        }
        int i = this.boxBackgroundMode;
        if (i == 1) {
            return editText.getTop();
        }
        if (i != 2) {
            return 0;
        }
        return editText.getTop() + pc();
    }

    private int pc() {
        if (!this.PC) {
            return 0;
        }
        float nO;
        int i = this.boxBackgroundMode;
        if (i == 0 || i == 1) {
            nO = this.Qx.nO();
        } else if (i != 2) {
            return 0;
        } else {
            nO = this.Qx.nO() / 2.0f;
        }
        return (int) nO;
    }

    private int pd() {
        int i = this.boxBackgroundMode;
        if (i == 1) {
            return getBoxBackground().getBounds().top + this.PP;
        }
        if (i != 2) {
            return getPaddingTop();
        }
        return getBoxBackground().getBounds().top - pc();
    }

    private void pe() {
        EditText editText = this.Pv;
        if (editText != null) {
            Drawable background = editText.getBackground();
            if (background != null) {
                if (DrawableUtils.canSafelyMutateDrawable(background)) {
                    background = background.mutate();
                }
                com.google.android.material.internal.c.getDescendantRect(this, this.Pv, new Rect());
                Rect bounds = background.getBounds();
                if (bounds.left != bounds.right) {
                    Rect rect = new Rect();
                    background.getPadding(rect);
                    background.setBounds(bounds.left - rect.left, bounds.top, bounds.right + (rect.right * 2), this.Pv.getBottom());
                }
            }
        }
    }

    private void pf() {
        int i = this.boxBackgroundMode;
        if (i == 1) {
            this.Qa = 0;
        } else if (i == 2 && this.Qu == 0) {
            this.Qu = this.Qr.getColorForState(getDrawableState(), this.Qr.getDefaultColor());
        }
    }

    private void pg() {
        if (this.PI != null) {
            pf();
            EditText editText = this.Pv;
            if (editText != null && this.boxBackgroundMode == 2) {
                if (editText.getBackground() != null) {
                    this.Qd = this.Pv.getBackground();
                }
                ViewCompat.setBackground(this.Pv, null);
            }
            editText = this.Pv;
            if (editText != null && this.boxBackgroundMode == 1) {
                Drawable drawable = this.Qd;
                if (drawable != null) {
                    ViewCompat.setBackground(editText, drawable);
                }
            }
            int i = this.Qa;
            if (i > -1) {
                int i2 = this.boxStrokeColor;
                if (i2 != 0) {
                    this.PI.setStroke(i, i2);
                }
            }
            this.PI.setCornerRadii(getCornerRadiiAsArray());
            this.PI.setColor(this.boxBackgroundColor);
            invalidate();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ph() {
        EditText editText = this.Pv;
        if (editText != null) {
            Drawable background = editText.getBackground();
            if (background != null) {
                pi();
                if (DrawableUtils.canSafelyMutateDrawable(background)) {
                    background = background.mutate();
                }
                if (this.Px.oR()) {
                    background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(this.Px.oT(), Mode.SRC_IN));
                } else {
                    if (this.Pz) {
                        TextView textView = this.PB;
                        if (textView != null) {
                            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(textView.getCurrentTextColor(), Mode.SRC_IN));
                        }
                    }
                    DrawableCompat.clearColorFilter(background);
                    this.Pv.refreshDrawableState();
                }
            }
        }
    }

    private void pi() {
        int i = VERSION.SDK_INT;
        if (i == 21 || i == 22) {
            Drawable background = this.Pv.getBackground();
            if (!(background == null || this.Qz)) {
                Drawable newDrawable = background.getConstantState().newDrawable();
                if (background instanceof DrawableContainer) {
                    this.Qz = com.google.android.material.internal.d.a((DrawableContainer) background, newDrawable.getConstantState());
                }
                if (!this.Qz) {
                    ViewCompat.setBackground(this.Pv, newDrawable);
                    this.Qz = true;
                    oW();
                }
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        if (this.Px.oR()) {
            bVar.QF = getError();
        }
        bVar.QG = this.Qj;
        return bVar;
    }

    /* Access modifiers changed, original: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof b) {
            b bVar = (b) parcelable;
            super.onRestoreInstanceState(bVar.getSuperState());
            setError(bVar.QF);
            if (bVar.QG) {
                ac(true);
            }
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* Access modifiers changed, original: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.QC = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.QC = false;
    }

    @Nullable
    public CharSequence getError() {
        return this.Px.isErrorEnabled() ? this.Px.oS() : null;
    }

    @Nullable
    public CharSequence getHelperText() {
        return this.Px.oQ() ? this.Px.getHelperText() : null;
    }

    public void setHintAnimationEnabled(boolean z) {
        this.Qy = z;
    }

    public void draw(Canvas canvas) {
        GradientDrawable gradientDrawable = this.PI;
        if (gradientDrawable != null) {
            gradientDrawable.draw(canvas);
        }
        super.draw(canvas);
        if (this.PC) {
            this.Qx.draw(canvas);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        pj();
        super.onMeasure(i, i2);
    }

    private void pj() {
        if (this.Pv != null) {
            Drawable[] compoundDrawablesRelative;
            if (pl()) {
                if (this.Qi == null) {
                    this.Qi = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(com.google.android.material.a.h.design_text_input_password_icon, this.Pu, false);
                    this.Qi.setImageDrawable(this.Qg);
                    this.Qi.setContentDescription(this.Qh);
                    this.Pu.addView(this.Qi);
                    this.Qi.setOnClickListener(new OnClickListener() {
                        public void onClick(View view) {
                            TextInputLayout.this.ac(false);
                        }
                    });
                }
                EditText editText = this.Pv;
                if (editText != null && ViewCompat.getMinimumHeight(editText) <= 0) {
                    this.Pv.setMinimumHeight(ViewCompat.getMinimumHeight(this.Qi));
                }
                this.Qi.setVisibility(0);
                this.Qi.setChecked(this.Qj);
                if (this.Qk == null) {
                    this.Qk = new ColorDrawable();
                }
                this.Qk.setBounds(0, 0, this.Qi.getMeasuredWidth(), 1);
                compoundDrawablesRelative = TextViewCompat.getCompoundDrawablesRelative(this.Pv);
                if (compoundDrawablesRelative[2] != this.Qk) {
                    this.Ql = compoundDrawablesRelative[2];
                }
                TextViewCompat.setCompoundDrawablesRelative(this.Pv, compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.Qk, compoundDrawablesRelative[3]);
                this.Qi.setPadding(this.Pv.getPaddingLeft(), this.Pv.getPaddingTop(), this.Pv.getPaddingRight(), this.Pv.getPaddingBottom());
            } else {
                CheckableImageButton checkableImageButton = this.Qi;
                if (checkableImageButton != null && checkableImageButton.getVisibility() == 0) {
                    this.Qi.setVisibility(8);
                }
                if (this.Qk != null) {
                    compoundDrawablesRelative = TextViewCompat.getCompoundDrawablesRelative(this.Pv);
                    if (compoundDrawablesRelative[2] == this.Qk) {
                        TextViewCompat.setCompoundDrawablesRelative(this.Pv, compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.Ql, compoundDrawablesRelative[3]);
                        this.Qk = null;
                    }
                }
            }
        }
    }

    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.Qg = drawable;
        CheckableImageButton checkableImageButton = this.Qi;
        if (checkableImageButton != null) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setPasswordVisibilityToggleContentDescription(@StringRes int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.Qh = charSequence;
        CheckableImageButton checkableImageButton = this.Qi;
        if (checkableImageButton != null) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    @Nullable
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.Qg;
    }

    @Nullable
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.Qh;
    }

    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (this.Qf != z) {
            this.Qf = z;
            if (!z && this.Qj) {
                EditText editText = this.Pv;
                if (editText != null) {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
            this.Qj = false;
            pj();
        }
    }

    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        this.Qm = colorStateList;
        this.Qn = true;
        pm();
    }

    public void setPasswordVisibilityToggleTintMode(@Nullable Mode mode) {
        this.Qo = mode;
        this.Qp = true;
        pm();
    }

    public void ac(boolean z) {
        if (this.Qf) {
            int selectionEnd = this.Pv.getSelectionEnd();
            if (pk()) {
                this.Pv.setTransformationMethod(null);
                this.Qj = true;
            } else {
                this.Pv.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.Qj = false;
            }
            this.Qi.setChecked(this.Qj);
            if (z) {
                this.Qi.jumpDrawablesToCurrentState();
            }
            this.Pv.setSelection(selectionEnd);
        }
    }

    public void setTextInputAccessibilityDelegate(a aVar) {
        EditText editText = this.Pv;
        if (editText != null) {
            ViewCompat.setAccessibilityDelegate(editText, aVar);
        }
    }

    private boolean pk() {
        EditText editText = this.Pv;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private boolean pl() {
        return this.Qf && (pk() || this.Qj);
    }

    private void pm() {
        if (this.Qg == null) {
            return;
        }
        if (this.Qn || this.Qp) {
            this.Qg = DrawableCompat.wrap(this.Qg).mutate();
            if (this.Qn) {
                DrawableCompat.setTintList(this.Qg, this.Qm);
            }
            if (this.Qp) {
                DrawableCompat.setTintMode(this.Qg, this.Qo);
            }
            CheckableImageButton checkableImageButton = this.Qi;
            if (checkableImageButton != null) {
                Drawable drawable = checkableImageButton.getDrawable();
                Drawable drawable2 = this.Qg;
                if (drawable != drawable2) {
                    this.Qi.setImageDrawable(drawable2);
                }
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.PI != null) {
            pa();
        }
        if (this.PC) {
            EditText editText = this.Pv;
            if (editText != null) {
                Rect rect = this.Ir;
                com.google.android.material.internal.c.getDescendantRect(this, editText, rect);
                int compoundPaddingLeft = rect.left + this.Pv.getCompoundPaddingLeft();
                i3 = rect.right - this.Pv.getCompoundPaddingRight();
                int pd = pd();
                this.Qx.b(compoundPaddingLeft, rect.top + this.Pv.getCompoundPaddingTop(), i3, rect.bottom - this.Pv.getCompoundPaddingBottom());
                this.Qx.c(compoundPaddingLeft, pd, i3, (i4 - i2) - getPaddingBottom());
                this.Qx.nW();
                if (pn() && !this.Qw) {
                    po();
                }
            }
        }
    }

    private void ad(boolean z) {
        ValueAnimator valueAnimator = this.Le;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.Le.cancel();
        }
        if (z && this.Qy) {
            E(1.0f);
        } else {
            this.Qx.v(1.0f);
        }
        this.Qw = false;
        if (pn()) {
            po();
        }
    }

    private boolean pn() {
        return this.PC && !TextUtils.isEmpty(this.hint) && (this.PI instanceof a);
    }

    private void po() {
        if (pn()) {
            RectF rectF = this.Qe;
            this.Qx.b(rectF);
            d(rectF);
            ((a) this.PI).c(rectF);
        }
    }

    private void pp() {
        if (pn()) {
            ((a) this.PI).oK();
        }
    }

    private void d(RectF rectF) {
        rectF.left -= (float) this.PO;
        rectF.top -= (float) this.PO;
        rectF.right += (float) this.PO;
        rectF.bottom += (float) this.PO;
    }

    /* Access modifiers changed, original: protected */
    public void drawableStateChanged() {
        if (!this.QB) {
            boolean z = true;
            this.QB = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            if (!(ViewCompat.isLaidOut(this) && isEnabled())) {
                z = false;
            }
            ab(z);
            ph();
            pa();
            pq();
            com.google.android.material.internal.b bVar = this.Qx;
            if ((bVar != null ? bVar.setState(drawableState) | 0 : 0) != 0) {
                invalidate();
            }
            this.QB = false;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void pq() {
        if (this.PI != null && this.boxBackgroundMode != 0) {
            EditText editText = this.Pv;
            Object obj = 1;
            Object obj2 = (editText == null || !editText.hasFocus()) ? null : 1;
            EditText editText2 = this.Pv;
            if (editText2 == null || !editText2.isHovered()) {
                obj = null;
            }
            if (this.boxBackgroundMode == 2) {
                if (!isEnabled()) {
                    this.boxStrokeColor = this.Qv;
                } else if (this.Px.oR()) {
                    this.boxStrokeColor = this.Px.oT();
                } else {
                    if (this.Pz) {
                        TextView textView = this.PB;
                        if (textView != null) {
                            this.boxStrokeColor = textView.getCurrentTextColor();
                        }
                    }
                    if (obj2 != null) {
                        this.boxStrokeColor = this.Qu;
                    } else if (obj != null) {
                        this.boxStrokeColor = this.Qt;
                    } else {
                        this.boxStrokeColor = this.Qs;
                    }
                }
                if (!(obj == null && obj2 == null) && isEnabled()) {
                    this.Qa = this.Qc;
                } else {
                    this.Qa = this.Qb;
                }
                pg();
            }
        }
    }

    private void ae(boolean z) {
        ValueAnimator valueAnimator = this.Le;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.Le.cancel();
        }
        if (z && this.Qy) {
            E(0.0f);
        } else {
            this.Qx.v(0.0f);
        }
        if (pn() && ((a) this.PI).oJ()) {
            pp();
        }
        this.Qw = true;
    }

    /* Access modifiers changed, original: 0000 */
    @VisibleForTesting
    public void E(float f) {
        if (this.Qx.nQ() != f) {
            if (this.Le == null) {
                this.Le = new ValueAnimator();
                this.Le.setInterpolator(com.google.android.material.a.a.DH);
                this.Le.setDuration(167);
                this.Le.addUpdateListener(new AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        TextInputLayout.this.Qx.v(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                });
            }
            this.Le.setFloatValues(new float[]{this.Qx.nQ(), f});
            this.Le.start();
        }
    }

    /* Access modifiers changed, original: final */
    @VisibleForTesting
    public final int getHintCurrentCollapsedTextColor() {
        return this.Qx.nT();
    }

    /* Access modifiers changed, original: final */
    @VisibleForTesting
    public final float getHintCollapsedTextHeight() {
        return this.Qx.nO();
    }

    /* Access modifiers changed, original: final */
    @VisibleForTesting
    public final int getErrorTextCurrentColor() {
        return this.Px.oT();
    }
}
