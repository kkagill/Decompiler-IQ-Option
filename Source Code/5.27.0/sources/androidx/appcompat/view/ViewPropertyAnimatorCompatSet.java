package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

@RestrictTo({Scope.LIBRARY_GROUP})
public class ViewPropertyAnimatorCompatSet {
    final ArrayList<ViewPropertyAnimatorCompat> mAnimators = new ArrayList();
    private long mDuration = -1;
    private Interpolator mInterpolator;
    private boolean mIsStarted;
    ViewPropertyAnimatorListener mListener;
    private final ViewPropertyAnimatorListenerAdapter mProxyListener = new ViewPropertyAnimatorListenerAdapter() {
        private int mProxyEndCount = 0;
        private boolean mProxyStarted = false;

        public void onAnimationStart(View view) {
            if (!this.mProxyStarted) {
                this.mProxyStarted = true;
                if (ViewPropertyAnimatorCompatSet.this.mListener != null) {
                    ViewPropertyAnimatorCompatSet.this.mListener.onAnimationStart(null);
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void onEnd() {
            this.mProxyEndCount = 0;
            this.mProxyStarted = false;
            ViewPropertyAnimatorCompatSet.this.onAnimationsEnded();
        }

        public void onAnimationEnd(View view) {
            int i = this.mProxyEndCount + 1;
            this.mProxyEndCount = i;
            if (i == ViewPropertyAnimatorCompatSet.this.mAnimators.size()) {
                if (ViewPropertyAnimatorCompatSet.this.mListener != null) {
                    ViewPropertyAnimatorCompatSet.this.mListener.onAnimationEnd(null);
                }
                onEnd();
            }
        }
    };

    public ViewPropertyAnimatorCompatSet play(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
        if (!this.mIsStarted) {
            this.mAnimators.add(viewPropertyAnimatorCompat);
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet playSequentially(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2) {
        this.mAnimators.add(viewPropertyAnimatorCompat);
        viewPropertyAnimatorCompat2.setStartDelay(viewPropertyAnimatorCompat.getDuration());
        this.mAnimators.add(viewPropertyAnimatorCompat2);
        return this;
    }

    public void start() {
        if (!this.mIsStarted) {
            Iterator it = this.mAnimators.iterator();
            while (it.hasNext()) {
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = (ViewPropertyAnimatorCompat) it.next();
                long j = this.mDuration;
                if (j >= 0) {
                    viewPropertyAnimatorCompat.setDuration(j);
                }
                Interpolator interpolator = this.mInterpolator;
                if (interpolator != null) {
                    viewPropertyAnimatorCompat.setInterpolator(interpolator);
                }
                if (this.mListener != null) {
                    viewPropertyAnimatorCompat.setListener(this.mProxyListener);
                }
                viewPropertyAnimatorCompat.start();
            }
            this.mIsStarted = true;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void onAnimationsEnded() {
        this.mIsStarted = false;
    }

    public void cancel() {
        if (this.mIsStarted) {
            Iterator it = this.mAnimators.iterator();
            while (it.hasNext()) {
                ((ViewPropertyAnimatorCompat) it.next()).cancel();
            }
            this.mIsStarted = false;
        }
    }

    public ViewPropertyAnimatorCompatSet setDuration(long j) {
        if (!this.mIsStarted) {
            this.mDuration = j;
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet setInterpolator(Interpolator interpolator) {
        if (!this.mIsStarted) {
            this.mInterpolator = interpolator;
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet setListener(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (!this.mIsStarted) {
            this.mListener = viewPropertyAnimatorListener;
        }
        return this;
    }
}
