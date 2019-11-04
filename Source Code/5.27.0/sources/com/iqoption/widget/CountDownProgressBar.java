package com.iqoption.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iqoption.x.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class CountDownProgressBar extends FrameLayout {
    private static int eok = 100;
    private static final int eol = (1000 / eok);
    private ProgressBar Dk;
    private TextView cQf;
    private CountDownTimer dza;
    private int eom = 30;
    private int eon;
    private int eoo = -1;
    private int eop = -1;
    private boolean eoq;
    private Drawable eor;
    private b eos;
    private View eot;

    private static class a extends CountDownTimer {
        private final WeakReference<CountDownProgressBar> eou;
        private final Animator eov;
        private int eow;

        public a(long j, Animator animator, CountDownProgressBar countDownProgressBar) {
            super(j, (long) CountDownProgressBar.eok);
            this.eou = new WeakReference(countDownProgressBar);
            this.eov = animator;
        }

        public void onTick(long j) {
            CountDownProgressBar countDownProgressBar = (CountDownProgressBar) this.eou.get();
            if (countDownProgressBar != null) {
                countDownProgressBar.Dk.setProgress((int) j);
                int i = this.eow + 1;
                this.eow = i;
                if (i == CountDownProgressBar.eol) {
                    countDownProgressBar.cQf.setText(countDownProgressBar.bS(j));
                    this.eow = 0;
                    if (TimeUnit.MILLISECONDS.toSeconds(j) <= ((long) countDownProgressBar.eom) && !countDownProgressBar.eoq) {
                        countDownProgressBar.cQf.setTextColor(countDownProgressBar.eop);
                        this.eov.start();
                        countDownProgressBar.eoq = true;
                    }
                }
            }
        }

        public void onFinish() {
            CountDownProgressBar countDownProgressBar = (CountDownProgressBar) this.eou.get();
            if (countDownProgressBar != null) {
                countDownProgressBar.cQf.setText(countDownProgressBar.bS(0));
                countDownProgressBar.Dk.setProgress(0);
                this.eov.end();
                if (countDownProgressBar.eos != null) {
                    countDownProgressBar.eos.a(countDownProgressBar);
                }
            }
        }
    }

    public interface b {
        void a(CountDownProgressBar countDownProgressBar);
    }

    private static class c implements b {
        private final View mHostView;
        private Method mMethod;
        private final String mMethodName;

        public c(@NonNull View view, @NonNull String str) {
            this.mHostView = view;
            this.mMethodName = str;
        }

        public void a(@NonNull CountDownProgressBar countDownProgressBar) {
            if (this.mMethod == null) {
                this.mMethod = H(this.mHostView.getContext(), this.mMethodName);
            }
            try {
                this.mMethod.invoke(this.mHostView.getContext(), new Object[]{countDownProgressBar});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }

        @NonNull
        private Method H(@Nullable Context context, @NonNull String str) {
            String str2;
            while (context != null) {
                try {
                    if (!context.isRestricted()) {
                        return context.getClass().getMethod(this.mMethodName, new Class[]{CountDownProgressBar.class});
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.mHostView.getId();
            if (id == -1) {
                str2 = "";
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(" with id '");
                stringBuilder.append(this.mHostView.getContext().getResources().getResourceEntryName(id));
                stringBuilder.append("'");
                str2 = stringBuilder.toString();
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Could not find method ");
            stringBuilder2.append(this.mMethodName);
            stringBuilder2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            stringBuilder2.append(this.mHostView.getClass());
            stringBuilder2.append(str2);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    public CountDownProgressBar(Context context) {
        super(context);
        b(context, null);
    }

    public CountDownProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet);
    }

    public CountDownProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(context, attributeSet);
    }

    @TargetApi(21)
    public CountDownProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b(context, attributeSet);
    }

    public void setCountDownFinishListener(b bVar) {
        this.eos = bVar;
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.iqoption.d.a.CountDownProgressBar, 0, 0);
        try {
            this.eoo = obtainStyledAttributes.getColor(5, this.eoo);
            this.eop = obtainStyledAttributes.getColor(4, this.eop);
            this.eon = obtainStyledAttributes.getInt(3, this.eon);
            this.eom = (int) TimeUnit.MILLISECONDS.toSeconds((long) obtainStyledAttributes.getInt(0, this.eom * 1000));
            this.eor = obtainStyledAttributes.getDrawable(2);
            String string = obtainStyledAttributes.getString(1);
            if (string != null) {
                setCountDownFinishListener(new c(this, string));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    private void b(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            a(context, attributeSet);
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.count_down_progress_bar, this, true);
        this.Dk = (ProgressBar) inflate.findViewById(R.id.countDownProgressBar);
        this.eot = inflate.findViewById(R.id.countDownTimeLayout);
        this.cQf = (TextView) inflate.findViewById(R.id.countDownTime);
        Drawable drawable = this.eor;
        if (drawable != null) {
            this.Dk.setProgressDrawable(drawable);
            this.Dk.setIndeterminateDrawable(this.eor);
        }
        bbL();
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stop();
    }

    @NonNull
    private CountDownTimer bR(long j) {
        return new a(j, bbM(), this);
    }

    private void bbL() {
        this.cQf.setTextColor(this.eoo);
        this.cQf.setText(bS((long) this.eon));
        this.Dk.setMax(this.eon);
        this.Dk.setProgress(this.eon);
        this.eoq = false;
    }

    public int getStartTimeMs() {
        return this.eon;
    }

    public void setStartTimeMs(int i) {
        this.eon = i;
        bbL();
    }

    public void hV(int i) {
        reset();
        long j = (long) i;
        this.dza = bR(j);
        this.cQf.setText(bS(j));
        this.dza.start();
    }

    public void reset() {
        CountDownTimer countDownTimer = this.dza;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.dza = null;
        }
        bbL();
    }

    public void stop() {
        CountDownTimer countDownTimer = this.dza;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    private String bS(long j) {
        return String.format(Locale.US, "%02d:%02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
    }

    private Animator bbM() {
        Keyframe ofFloat = Keyframe.ofFloat(0.0f, 1.0f);
        Keyframe ofFloat2 = Keyframe.ofFloat(0.5f, 0.9f);
        Keyframe ofFloat3 = Keyframe.ofFloat(1.0f, 1.0f);
        Keyframe ofFloat4 = Keyframe.ofFloat(0.0f, 1.0f);
        Keyframe ofFloat5 = Keyframe.ofFloat(0.5f, 0.8f);
        Keyframe ofFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
        View view = this.eot;
        r12 = new PropertyValuesHolder[3];
        r12[0] = PropertyValuesHolder.ofKeyframe("scaleX", new Keyframe[]{ofFloat, ofFloat2, ofFloat3});
        r12[1] = PropertyValuesHolder.ofKeyframe("scaleY", new Keyframe[]{ofFloat, ofFloat2, ofFloat3});
        String str = "alpha";
        r12[2] = PropertyValuesHolder.ofKeyframe(str, new Keyframe[]{ofFloat4, ofFloat5, ofFloat6});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, r12);
        ofPropertyValuesHolder.setDuration(1000);
        ofPropertyValuesHolder.setRepeatCount(-1);
        ofPropertyValuesHolder.setRepeatMode(1);
        ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
        ofFloat6 = Keyframe.ofFloat(0.0f, 1.0f);
        ofFloat5 = Keyframe.ofFloat(0.5f, 0.0f);
        Keyframe ofFloat7 = Keyframe.ofFloat(1.0f, 1.0f);
        ProgressBar progressBar = this.Dk;
        r12 = new PropertyValuesHolder[1];
        r12[0] = PropertyValuesHolder.ofKeyframe(str, new Keyframe[]{ofFloat6, ofFloat5, ofFloat7});
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(progressBar, r12);
        ofPropertyValuesHolder2.setDuration(1000);
        ofPropertyValuesHolder2.setRepeatCount(-1);
        ofPropertyValuesHolder2.setRepeatMode(1);
        ofPropertyValuesHolder2.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofPropertyValuesHolder, ofPropertyValuesHolder2});
        return animatorSet;
    }
}
