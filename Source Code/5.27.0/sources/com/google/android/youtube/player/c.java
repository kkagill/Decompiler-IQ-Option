package com.google.android.youtube.player;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import androidx.core.view.ViewCompat;
import com.google.android.youtube.player.YouTubePlayer.e;
import com.google.android.youtube.player.internal.d;
import com.google.android.youtube.player.internal.p;
import com.google.android.youtube.player.internal.t;
import com.google.android.youtube.player.internal.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class c extends ViewGroup implements e {
    private final a Re;
    private final Set<View> Rf;
    private final b Rg;
    private d Rh;
    private t Ri;
    private View Rj;
    private p Rk;
    private e Rl;
    private Bundle Rm;
    private com.google.android.youtube.player.YouTubePlayer.b Rn;
    private boolean k;
    private boolean l;

    private final class a implements OnGlobalFocusChangeListener {
        private a() {
        }

        /* synthetic */ a(c cVar, byte b) {
            this();
        }

        public final void onGlobalFocusChanged(View view, View view2) {
            if (c.this.Ri != null && c.this.Rf.contains(view2) && !c.this.Rf.contains(view)) {
                c.this.Ri.g();
            }
        }
    }

    interface b {
        void a(c cVar);
    }

    c(Context context, AttributeSet attributeSet, int i, b bVar) {
        super((Context) com.google.android.youtube.player.internal.b.d(context, "context cannot be null"), attributeSet, i);
        this.Rg = (b) com.google.android.youtube.player.internal.b.d(bVar, "listener cannot be null");
        if (getBackground() == null) {
            setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        setClipToPadding(false);
        this.Rk = new p(context);
        requestTransparentRegion(this.Rk);
        addView(this.Rk);
        this.Rf = new HashSet();
        this.Re = new a(this, (byte) 0);
    }

    private void a(View view) {
        Object obj = (view == this.Rk || (this.Ri != null && view == this.Rj)) ? 1 : null;
        if (obj == null) {
            throw new UnsupportedOperationException("No views can be added on top of the player");
        }
    }

    private void a(YouTubeInitializationResult youTubeInitializationResult) {
        this.Ri = null;
        this.Rk.c();
        com.google.android.youtube.player.YouTubePlayer.b bVar = this.Rn;
        if (bVar != null) {
            bVar.a(this.Rl, youTubeInitializationResult);
            this.Rn = null;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        t tVar = this.Ri;
        if (tVar != null) {
            tVar.b();
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(final Activity activity, e eVar, String str, com.google.android.youtube.player.YouTubePlayer.b bVar, Bundle bundle) {
        if (this.Ri == null && this.Rn == null) {
            com.google.android.youtube.player.internal.b.d(activity, "activity cannot be null");
            this.Rl = (e) com.google.android.youtube.player.internal.b.d(eVar, "provider cannot be null");
            this.Rn = (com.google.android.youtube.player.YouTubePlayer.b) com.google.android.youtube.player.internal.b.d(bVar, "listener cannot be null");
            this.Rm = bundle;
            this.Rk.b();
            this.Rh = com.google.android.youtube.player.internal.a.pA().a(getContext(), str, new com.google.android.youtube.player.internal.u.a() {
                public final void a() {
                    if (c.this.Rh != null) {
                        c.a(c.this, activity);
                    }
                    c.this.Rh = null;
                }

                public final void b() {
                    if (!(c.this.l || c.this.Ri == null)) {
                        c.this.Ri.f();
                    }
                    c.this.Rk.a();
                    c cVar = c.this;
                    if (cVar.indexOfChild(cVar.Rk) < 0) {
                        cVar = c.this;
                        cVar.addView(cVar.Rk);
                        cVar = c.this;
                        cVar.removeView(cVar.Rj);
                    }
                    c.this.Rj = null;
                    c.this.Ri = null;
                    c.this.Rh = null;
                }
            }, new com.google.android.youtube.player.internal.u.b() {
                public final void a(YouTubeInitializationResult youTubeInitializationResult) {
                    c.this.a(youTubeInitializationResult);
                    c.this.Rh = null;
                }
            });
            this.Rh.e();
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        if (!z || VERSION.SDK_INT >= 14) {
            this.k = z;
            return;
        }
        z.f("Could not enable TextureView because API level is lower than 14", new Object[0]);
        this.k = false;
    }

    public final void addFocusables(ArrayList<View> arrayList, int i) {
        ArrayList arrayList2 = new ArrayList();
        super.addFocusables(arrayList2, i);
        arrayList.addAll(arrayList2);
        this.Rf.clear();
        this.Rf.addAll(arrayList2);
    }

    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        ArrayList arrayList2 = new ArrayList();
        super.addFocusables(arrayList2, i, i2);
        arrayList.addAll(arrayList2);
        this.Rf.clear();
        this.Rf.addAll(arrayList2);
    }

    public final void addView(View view) {
        a(view);
        super.addView(view);
    }

    public final void addView(View view, int i) {
        a(view);
        super.addView(view, i);
    }

    public final void addView(View view, int i, int i2) {
        a(view);
        super.addView(view, i, i2);
    }

    public final void addView(View view, int i, LayoutParams layoutParams) {
        a(view);
        super.addView(view, i, layoutParams);
    }

    public final void addView(View view, LayoutParams layoutParams) {
        a(view);
        super.addView(view, layoutParams);
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        t tVar = this.Ri;
        if (tVar != null) {
            tVar.c();
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(boolean z) {
        t tVar = this.Ri;
        if (tVar != null) {
            tVar.b(z);
            c(z);
        }
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        t tVar = this.Ri;
        if (tVar != null) {
            tVar.d();
        }
    }

    /* Access modifiers changed, original: final */
    public final void c(boolean z) {
        this.l = true;
        t tVar = this.Ri;
        if (tVar != null) {
            tVar.a(z);
        }
    }

    public final void clearChildFocus(View view) {
        if (hasFocusable()) {
            requestFocus();
        } else {
            super.clearChildFocus(view);
        }
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        t tVar = this.Ri;
        if (tVar != null) {
            tVar.e();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.Ri != null) {
            if (keyEvent.getAction() == 0) {
                return this.Ri.a(keyEvent.getKeyCode(), keyEvent) || super.dispatchKeyEvent(keyEvent);
            } else {
                if (keyEvent.getAction() == 1) {
                    return this.Ri.b(keyEvent.getKeyCode(), keyEvent) || super.dispatchKeyEvent(keyEvent);
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void focusableViewAvailable(View view) {
        super.focusableViewAvailable(view);
        this.Rf.add(view);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.Re);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        t tVar = this.Ri;
        if (tVar != null) {
            tVar.a(configuration);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.Re);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() > 0) {
            getChildAt(0).layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            childAt.measure(i, i2);
            setMeasuredDimension(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    /* Access modifiers changed, original: final */
    public final Bundle py() {
        t tVar = this.Ri;
        return tVar == null ? this.Rm : tVar.pL();
    }

    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.Rf.add(view2);
    }

    public final void setClipToPadding(boolean z) {
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
    }
}
