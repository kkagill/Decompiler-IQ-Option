package com.iqoption.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.iqoption.dto.ToastEntity;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: KeyboardUtil */
public class y {
    private static final String TAG = "com.iqoption.util.y";
    private static Collection<a> bQW = new ArrayList();
    private boolean bQS = false;
    private boolean bQT = false;
    private View bQU;
    private LayoutParams bQV;

    /* compiled from: KeyboardUtil */
    public interface a {
        void onKeyboardVisibilityChanged(boolean z);
    }

    /* compiled from: KeyboardUtil */
    public static class b {
        private final Runnable ebA;
        private final Runnable ebB;
        private final x ebC;
        private final View ebD;
        private boolean ebE;
        private boolean ebF;
        private volatile boolean ebG;

        private /* synthetic */ void avL() {
            aWQ();
        }

        private b(View view) {
            this.ebA = new -$$Lambda$y$b$x3WDIXMkPypy5JhKG3dpQkEd9oA(this);
            this.ebB = new -$$Lambda$y$b$E3ZgEQf3WucPJtQ5xj84ixC0YC8(this);
            this.ebC = new x();
            this.ebD = view;
        }

        /* renamed from: aWP */
        public void JN() {
            y.aA(this.ebD);
        }

        private void aWQ() {
            if (this.ebF) {
                y.aA(this.ebD);
            }
        }

        public void register() {
            if (!this.ebG) {
                this.ebG = true;
                if (!this.ebE) {
                    this.ebC.b(this.ebA, ToastEntity.ERROR_TOAST_DURATION);
                }
                this.ebD.setOnSystemUiVisibilityChangeListener(new -$$Lambda$y$b$W1fMR6wigg1PgPSL5B4MACF5rh8(this));
            }
        }

        private /* synthetic */ void hy(int i) {
            if (!this.ebE) {
                this.ebC.i(this.ebA);
                this.ebE = true;
            }
            if ((i & 4) == 0) {
                this.ebC.a(this.ebB, ToastEntity.ERROR_TOAST_DURATION, ToastEntity.ERROR_TOAST_DURATION);
                this.ebF = true;
                return;
            }
            this.ebC.i(this.ebB);
            this.ebF = false;
        }

        public void unregister() {
            if (this.ebG) {
                this.ebE = false;
                this.ebG = false;
                this.ebC.clear();
                this.ebD.setOnSystemUiVisibilityChangeListener(null);
            }
        }
    }

    public y(Activity activity) {
        this.bQU = ((FrameLayout) activity.findViewById(16908290)).getChildAt(0);
        this.bQV = (LayoutParams) this.bQU.getLayoutParams();
        this.bQU.getViewTreeObserver().addOnGlobalLayoutListener(new -$$Lambda$y$L-flBkBb3oxh3c20Rw5MjKapI1Q(this));
    }

    private /* synthetic */ void JN() {
        ans();
    }

    public static void a(a aVar) {
        bQW.add(aVar);
    }

    public static void b(a aVar) {
        bQW.remove(aVar);
    }

    public static void a(EditText editText, boolean z) {
        if (VERSION.SDK_INT >= 21) {
            editText.setShowSoftInputOnFocus(z);
            return;
        }
        try {
            Method declaredMethod = TextView.class.getDeclaredMethod("createEditorIfNeeded", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(editText, new Object[0]);
            Field declaredField = TextView.class.getDeclaredField("mEditor");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(editText);
            declaredField = obj.getClass().getDeclaredField("mShowSoftInputOnFocus");
            declaredField.setAccessible(true);
            declaredField.setBoolean(obj, z);
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
    private void ans() {
        /*
        r5 = this;
        r0 = r5.bQU;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = r5.ant();
        r1 = r5.bQU;
        r1 = r1.getRootView();
        r1 = r1.getHeight();
        r0 = r1 - r0;
        r2 = r1 / 4;
        r3 = 0;
        r4 = 1;
        if (r0 <= r2) goto L_0x0025;
    L_0x001b:
        r2 = r5.bQS;
        if (r2 != 0) goto L_0x002f;
    L_0x001f:
        r5.bQS = r4;
        cK(r4);
        goto L_0x0030;
    L_0x0025:
        r2 = r5.bQS;
        if (r2 == 0) goto L_0x002f;
    L_0x0029:
        r5.bQS = r3;
        cK(r3);
        goto L_0x0030;
    L_0x002f:
        r4 = 0;
    L_0x0030:
        r2 = r5.bQT;
        if (r2 == 0) goto L_0x0049;
    L_0x0034:
        if (r4 == 0) goto L_0x0049;
    L_0x0036:
        r2 = r5.bQS;
        if (r2 == 0) goto L_0x0040;
    L_0x003a:
        r2 = r5.bQV;
        r1 = r1 - r0;
        r2.height = r1;
        goto L_0x0044;
    L_0x0040:
        r0 = r5.bQV;
        r0.height = r1;
    L_0x0044:
        r0 = r5.bQU;
        r0.requestLayout();
    L_0x0049:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.util.y.ans():void");
    }

    private static void cK(boolean z) {
        for (a onKeyboardVisibilityChanged : bQW) {
            onKeyboardVisibilityChanged.onKeyboardVisibilityChanged(z);
        }
    }

    private int ant() {
        Rect rect = new Rect();
        this.bQU.getWindowVisibleDisplayFrame(rect);
        return rect.bottom - rect.top;
    }

    public static void j(Activity activity) {
        if (activity != null) {
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus == null) {
                currentFocus = activity.findViewById(16908290);
            }
            if (currentFocus != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                }
            }
        }
    }

    public static void a(Context context, View view) {
        if (context != null && view != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                cK(false);
            }
        }
    }

    public static void b(Context context, View view) {
        if (context != null && view != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(view, 1);
                cK(true);
            }
        }
    }

    public static void aA(View view) {
        if (VERSION.SDK_INT >= 19) {
            view.setSystemUiVisibility(5894);
        }
    }

    public static b m(Activity activity) {
        b bVar = new b(activity.getWindow().getDecorView());
        bVar.register();
        return bVar;
    }
}
