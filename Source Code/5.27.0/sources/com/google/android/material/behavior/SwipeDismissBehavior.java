package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import androidx.customview.widget.ViewDragHelper.Callback;

public class SwipeDismissBehavior<V extends View> extends Behavior<V> {
    ViewDragHelper FQ;
    a FS;
    private boolean FT;
    private float FU = 0.0f;
    private boolean FV;
    int FW = 2;
    float FY = 0.5f;
    float FZ = 0.0f;
    float Ga = 0.5f;
    private final Callback Gb = new Callback() {
        private int Fn = -1;
        private int Gc;

        public boolean tryCaptureView(View view, int i) {
            return this.Fn == -1 && SwipeDismissBehavior.this.B(view);
        }

        public void onViewCaptured(View view, int i) {
            this.Fn = i;
            this.Gc = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public void onViewDragStateChanged(int i) {
            if (SwipeDismissBehavior.this.FS != null) {
                SwipeDismissBehavior.this.FS.aA(i);
            }
        }

        public void onViewReleased(View view, float f, float f2) {
            int i;
            boolean z;
            this.Fn = -1;
            int width = view.getWidth();
            if (b(view, f)) {
                int left = view.getLeft();
                i = this.Gc;
                i = left < i ? i - width : i + width;
                z = true;
            } else {
                i = this.Gc;
                z = false;
            }
            if (SwipeDismissBehavior.this.FQ.settleCapturedViewAt(i, view.getTop())) {
                ViewCompat.postOnAnimation(view, new b(view, z));
            } else if (z && SwipeDismissBehavior.this.FS != null) {
                SwipeDismissBehavior.this.FS.C(view);
            }
        }

        private boolean b(View view, float f) {
            boolean z = false;
            if (f != 0.0f) {
                Object obj = ViewCompat.getLayoutDirection(view) == 1 ? 1 : null;
                if (SwipeDismissBehavior.this.FW == 2) {
                    return true;
                }
                if (SwipeDismissBehavior.this.FW == 0) {
                    return obj != null ? z : z;
                    z = true;
                }
                if (SwipeDismissBehavior.this.FW == 1) {
                    if (obj != null) {
                    }
                    z = true;
                }
                return z;
            }
            if (Math.abs(view.getLeft() - this.Gc) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.FY)) {
                z = true;
            }
            return z;
        }

        public int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        public int clampViewPositionHorizontal(View view, int i, int i2) {
            int width;
            Object obj = ViewCompat.getLayoutDirection(view) == 1 ? 1 : null;
            if (SwipeDismissBehavior.this.FW != 0) {
                if (SwipeDismissBehavior.this.FW != 1) {
                    i2 = this.Gc - view.getWidth();
                    width = view.getWidth() + this.Gc;
                } else if (obj != null) {
                    i2 = this.Gc;
                    width = view.getWidth();
                } else {
                    i2 = this.Gc - view.getWidth();
                    width = this.Gc;
                }
                return SwipeDismissBehavior.clamp(i2, i, width);
            } else if (obj != null) {
                i2 = this.Gc - view.getWidth();
                width = this.Gc;
                return SwipeDismissBehavior.clamp(i2, i, width);
            } else {
                i2 = this.Gc;
                width = view.getWidth();
            }
            width += i2;
            return SwipeDismissBehavior.clamp(i2, i, width);
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.Gc) + (((float) view.getWidth()) * SwipeDismissBehavior.this.FZ);
            float width2 = ((float) this.Gc) + (((float) view.getWidth()) * SwipeDismissBehavior.this.Ga);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.clamp(0.0f, 1.0f - SwipeDismissBehavior.c(width, width2, f), 1.0f));
            }
        }
    };

    public interface a {
        void C(View view);

        void aA(int i);
    }

    private class b implements Runnable {
        private final boolean Ge;
        private final View view;

        b(View view, boolean z) {
            this.view = view;
            this.Ge = z;
        }

        public void run() {
            if (SwipeDismissBehavior.this.FQ != null && SwipeDismissBehavior.this.FQ.continueSettling(true)) {
                ViewCompat.postOnAnimation(this.view, this);
            } else if (this.Ge && SwipeDismissBehavior.this.FS != null) {
                SwipeDismissBehavior.this.FS.C(this.view);
            }
        }
    }

    static float c(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    public boolean B(@NonNull View view) {
        return true;
    }

    public void a(a aVar) {
        this.FS = aVar;
    }

    public void az(int i) {
        this.FW = i;
    }

    public void n(float f) {
        this.FZ = clamp(0.0f, f, 1.0f);
    }

    public void o(float f) {
        this.Ga = clamp(0.0f, f, 1.0f);
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.FT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.FT = coordinatorLayout.isPointInChildBounds(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            z = this.FT;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.FT = false;
        }
        if (!z) {
            return false;
        }
        c(coordinatorLayout);
        return this.FQ.shouldInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper = this.FQ;
        if (viewDragHelper == null) {
            return false;
        }
        viewDragHelper.processTouchEvent(motionEvent);
        return true;
    }

    private void c(ViewGroup viewGroup) {
        if (this.FQ == null) {
            ViewDragHelper create;
            if (this.FV) {
                create = ViewDragHelper.create(viewGroup, this.FU, this.Gb);
            } else {
                create = ViewDragHelper.create(viewGroup, this.Gb);
            }
            this.FQ = create;
        }
    }

    static float clamp(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    static int clamp(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }
}
