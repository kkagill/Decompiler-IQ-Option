package androidx.core.view;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.WindowInsets;
import androidx.annotation.Nullable;

public class WindowInsetsCompat {
    private final Object mInsets;

    private WindowInsetsCompat(Object obj) {
        this.mInsets = obj;
    }

    public WindowInsetsCompat(WindowInsetsCompat windowInsetsCompat) {
        Object obj = null;
        if (VERSION.SDK_INT >= 20) {
            if (windowInsetsCompat != null) {
                obj = new WindowInsets((WindowInsets) windowInsetsCompat.mInsets);
            }
            this.mInsets = obj;
            return;
        }
        this.mInsets = null;
    }

    public int getSystemWindowInsetLeft() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.mInsets).getSystemWindowInsetLeft() : 0;
    }

    public int getSystemWindowInsetTop() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.mInsets).getSystemWindowInsetTop() : 0;
    }

    public int getSystemWindowInsetRight() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.mInsets).getSystemWindowInsetRight() : 0;
    }

    public int getSystemWindowInsetBottom() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.mInsets).getSystemWindowInsetBottom() : 0;
    }

    public boolean hasSystemWindowInsets() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.mInsets).hasSystemWindowInsets() : false;
    }

    public boolean hasInsets() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.mInsets).hasInsets() : false;
    }

    public boolean isConsumed() {
        return VERSION.SDK_INT >= 21 ? ((WindowInsets) this.mInsets).isConsumed() : false;
    }

    public boolean isRound() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.mInsets).isRound() : false;
    }

    public WindowInsetsCompat consumeSystemWindowInsets() {
        return VERSION.SDK_INT >= 20 ? new WindowInsetsCompat(((WindowInsets) this.mInsets).consumeSystemWindowInsets()) : null;
    }

    public WindowInsetsCompat replaceSystemWindowInsets(int i, int i2, int i3, int i4) {
        return VERSION.SDK_INT >= 20 ? new WindowInsetsCompat(((WindowInsets) this.mInsets).replaceSystemWindowInsets(i, i2, i3, i4)) : null;
    }

    public WindowInsetsCompat replaceSystemWindowInsets(Rect rect) {
        return VERSION.SDK_INT >= 21 ? new WindowInsetsCompat(((WindowInsets) this.mInsets).replaceSystemWindowInsets(rect)) : null;
    }

    public int getStableInsetTop() {
        return VERSION.SDK_INT >= 21 ? ((WindowInsets) this.mInsets).getStableInsetTop() : 0;
    }

    public int getStableInsetLeft() {
        return VERSION.SDK_INT >= 21 ? ((WindowInsets) this.mInsets).getStableInsetLeft() : 0;
    }

    public int getStableInsetRight() {
        return VERSION.SDK_INT >= 21 ? ((WindowInsets) this.mInsets).getStableInsetRight() : 0;
    }

    public int getStableInsetBottom() {
        return VERSION.SDK_INT >= 21 ? ((WindowInsets) this.mInsets).getStableInsetBottom() : 0;
    }

    public boolean hasStableInsets() {
        return VERSION.SDK_INT >= 21 ? ((WindowInsets) this.mInsets).hasStableInsets() : false;
    }

    public WindowInsetsCompat consumeStableInsets() {
        return VERSION.SDK_INT >= 21 ? new WindowInsetsCompat(((WindowInsets) this.mInsets).consumeStableInsets()) : null;
    }

    @Nullable
    public DisplayCutoutCompat getDisplayCutout() {
        return VERSION.SDK_INT >= 28 ? DisplayCutoutCompat.wrap(((WindowInsets) this.mInsets).getDisplayCutout()) : null;
    }

    public WindowInsetsCompat consumeDisplayCutout() {
        return VERSION.SDK_INT >= 28 ? new WindowInsetsCompat(((WindowInsets) this.mInsets).consumeDisplayCutout()) : this;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WindowInsetsCompat windowInsetsCompat = (WindowInsetsCompat) obj;
        Object obj2 = this.mInsets;
        if (obj2 != null) {
            z = obj2.equals(windowInsetsCompat.mInsets);
        } else if (windowInsetsCompat.mInsets != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        Object obj = this.mInsets;
        return obj == null ? 0 : obj.hashCode();
    }

    static WindowInsetsCompat wrap(Object obj) {
        return obj == null ? null : new WindowInsetsCompat(obj);
    }

    static Object unwrap(WindowInsetsCompat windowInsetsCompat) {
        return windowInsetsCompat == null ? null : windowInsetsCompat.mInsets;
    }
}
