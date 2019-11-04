package com.iqoption.view.text;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.Nullable;
import com.iqoption.core.ui.widget.d.a.b;
import com.iqoption.d;
import com.iqoption.util.y;
import com.iqoption.util.y.a;

public class SoftKeyboardEditText extends EditText implements a {
    private static final String TAG = "com.iqoption.view.text.SoftKeyboardEditText";
    @Nullable
    private b dFL;
    private boolean eio;
    private boolean eip;
    @Nullable
    private a eiq;

    /* renamed from: com.iqoption.view.text.SoftKeyboardEditText$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] eis = new int[Formatter.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = com.iqoption.view.text.SoftKeyboardEditText.Formatter.values();
            r0 = r0.length;
            r0 = new int[r0];
            eis = r0;
            r0 = eis;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.iqoption.view.text.SoftKeyboardEditText.Formatter.phone;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = eis;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.iqoption.view.text.SoftKeyboardEditText.Formatter.phoneWithPlusSign;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = eis;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.iqoption.view.text.SoftKeyboardEditText.Formatter.date;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.view.text.SoftKeyboardEditText$AnonymousClass2.<clinit>():void");
        }
    }

    private enum Formatter {
        none,
        phone,
        phoneWithPlusSign,
        date
    }

    public void setValidationListener(com.iqoption.core.ui.widget.d.b bVar) {
    }

    public SoftKeyboardEditText(Context context) {
        super(context);
    }

    public SoftKeyboardEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public SoftKeyboardEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    @TargetApi(21)
    public SoftKeyboardEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.eip) {
            this.eiq = new a() {
                public void onKeyboardVisibilityChanged(boolean z) {
                    if (z && SoftKeyboardEditText.this.eip) {
                        SoftKeyboardEditText.this.ft(false);
                    }
                }
            };
            y.a(this.eiq);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.eiq;
        if (aVar != null) {
            y.b(aVar);
            this.eiq = null;
        }
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.a.SoftKeyboardEditText, 0, 0);
        try {
            setFormatter(Formatter.values()[obtainStyledAttributes.getInt(0, 0)]);
            this.eip = obtainStyledAttributes.getBoolean(1, false);
            if (this.eip) {
                y.a((EditText) this, false);
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    public void setHideKeyboard(boolean z) {
        this.eip = z;
    }

    /* Access modifiers changed, original: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        ft(z);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && this.eio) {
            clearFocus();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    private void ft(boolean z) {
        n(z, false);
    }

    private void n(boolean z, boolean z2) {
        if (!z) {
            y.a(getContext(), (View) this);
            if (!z2) {
                clearFocus();
            }
        } else if (!this.eip) {
            y.b(getContext(), this);
        }
        this.eio = z;
    }

    public void clearFocus() {
        super.clearFocus();
        n(false, true);
    }

    public void onEditorAction(int i) {
        if (i == 6) {
            ft(false);
        } else {
            super.onEditorAction(i);
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            ft(false);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            if (i == 23) {
                ft(true);
            } else if (i == 66) {
                ft(false);
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void onKeyboardVisibilityChanged(boolean z) {
        if (!z) {
            clearFocus();
        }
        this.eio = z;
    }

    private void setFormatter(Formatter formatter) {
        int i = AnonymousClass2.eis[formatter.ordinal()];
        if (i == 1) {
            aYH();
        } else if (i == 2) {
            addTextChangedListener(new com.iqoption.core.e.a());
            aYH();
        } else if (i == 3) {
            aYI();
        }
    }

    private void aYH() {
        if (!isInEditMode()) {
            if (VERSION.SDK_INT >= 21) {
                addTextChangedListener(new PhoneNumberFormattingTextWatcher());
            } else {
                addTextChangedListener(new com.iqoption.core.e.d());
            }
        }
    }

    private void aYI() {
        if (!isInEditMode()) {
            this.dFL = new b();
            addTextChangedListener(this.dFL);
        }
    }

    @Nullable
    public com.iqoption.core.ui.widget.d.a getTextDateValidator() {
        return this.dFL;
    }
}
