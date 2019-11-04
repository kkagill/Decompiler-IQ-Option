package com.iqoption.bottomsheet;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: Settler */
final class e {
    private a aAk;
    @Nullable
    private View aAl;
    @Nullable
    private Animator animator;

    /* compiled from: Settler */
    static final class a {
        int aAm = 0;
        long duration = 0;
        int state = 0;

        a() {
        }
    }

    e() {
        this(new a());
    }

    e(@NonNull a aVar) {
        this.aAk = aVar;
    }

    /* Access modifiers changed, original: 0000 */
    @NonNull
    public a KV() {
        return this.aAk;
    }

    /* Access modifiers changed, original: 0000 */
    @Nullable
    public Animator c(@NonNull IQBottomSheetBehavior iQBottomSheetBehavior) {
        View view = iQBottomSheetBehavior.getView();
        Animator animator = null;
        if (view == null) {
            return null;
        }
        Animator animator2 = this.animator;
        if (animator2 != null && this.aAl == view) {
            return animator2;
        }
        if (!(this.aAk.duration == 0 || this.aAk.aAm == 0)) {
            animator = ValueAnimator.ofInt(new int[]{view.getTop(), view.getTop() + this.aAk.aAm});
            animator.setDuration(this.aAk.duration);
            animator.setInterpolator(new DecelerateInterpolator());
            animator.addUpdateListener(new -$$Lambda$e$UltgCT1_tAUGCql4Hd2SRUvOA24(iQBottomSheetBehavior, view));
            animator.addListener(iQBottomSheetBehavior.a(this));
            this.animator = animator;
            this.aAl = view;
        }
        return animator;
    }

    /* Access modifiers changed, original: 0000 */
    public void recycle() {
        Animator animator = this.animator;
        if (animator != null) {
            if (animator.isRunning()) {
                this.animator.cancel();
            }
            this.animator = null;
        }
    }
}
