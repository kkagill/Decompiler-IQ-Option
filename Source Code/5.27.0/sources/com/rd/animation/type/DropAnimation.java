package com.rd.animation.type;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import com.rd.animation.a.b.a;
import com.rd.animation.b.a.b;
import java.util.Iterator;

public class DropAnimation extends a<AnimatorSet> {
    private int eHS;
    private int eHT;
    private int eHU;
    private int eHV;
    private b eHW = new b();
    private int radius;

    /* renamed from: com.rd.animation.type.DropAnimation$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] eHZ = new int[AnimationType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = com.rd.animation.type.DropAnimation.AnimationType.values();
            r0 = r0.length;
            r0 = new int[r0];
            eHZ = r0;
            r0 = eHZ;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.rd.animation.type.DropAnimation.AnimationType.Width;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = eHZ;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.rd.animation.type.DropAnimation.AnimationType.Height;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = eHZ;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.rd.animation.type.DropAnimation.AnimationType.Radius;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.rd.animation.type.DropAnimation$AnonymousClass2.<clinit>():void");
        }
    }

    private enum AnimationType {
        Width,
        Height,
        Radius
    }

    public DropAnimation(@NonNull a aVar) {
        super(aVar);
    }

    @NonNull
    /* renamed from: bhQ */
    public AnimatorSet aYl() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    /* renamed from: ao */
    public DropAnimation am(float f) {
        if (this.animator != null) {
            long j = (long) (f * ((float) this.eHN));
            Object obj = null;
            Iterator it = ((AnimatorSet) this.animator).getChildAnimations().iterator();
            while (it.hasNext()) {
                ValueAnimator valueAnimator = (ValueAnimator) ((Animator) it.next());
                long duration = valueAnimator.getDuration();
                long j2 = obj != null ? j - duration : j;
                if (j2 >= 0) {
                    if (j2 >= duration) {
                        j2 = duration;
                    }
                    if (valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                        valueAnimator.setCurrentPlayTime(j2);
                    }
                    if (obj == null && duration >= this.eHN) {
                        obj = 1;
                    }
                }
            }
        }
        return this;
    }

    /* renamed from: cK */
    public DropAnimation cJ(long j) {
        super.cJ(j);
        return this;
    }

    public DropAnimation c(int i, int i2, int i3, int i4, int i5) {
        int i6 = i5;
        if (d(i, i2, i3, i4, i5)) {
            this.animator = aYl();
            int i7 = i;
            this.eHS = i7;
            int i8 = i2;
            this.eHT = i8;
            this.eHU = i3;
            this.eHV = i4;
            this.radius = i6;
            double d = (double) i6;
            Double.isNaN(d);
            int i9 = (int) (d / 1.5d);
            long j = this.eHN / 2;
            ValueAnimator a = a(i7, i8, this.eHN, AnimationType.Width);
            long j2 = j;
            ValueAnimator a2 = a(i3, i4, j2, AnimationType.Height);
            ValueAnimator a3 = a(i5, i9, j2, AnimationType.Radius);
            ValueAnimator a4 = a(i4, i3, j2, AnimationType.Height);
            ((AnimatorSet) this.animator).play(a2).with(a3).with(a).before(a4).before(a(i9, i5, j2, AnimationType.Radius));
        }
        return this;
    }

    private ValueAnimator a(int i, int i2, long j, final AnimationType animationType) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                DropAnimation.this.a(valueAnimator, animationType);
            }
        });
        return ofInt;
    }

    private void a(@NonNull ValueAnimator valueAnimator, @NonNull AnimationType animationType) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = AnonymousClass2.eHZ[animationType.ordinal()];
        if (i == 1) {
            this.eHW.setWidth(intValue);
        } else if (i == 2) {
            this.eHW.setHeight(intValue);
        } else if (i == 3) {
            this.eHW.setRadius(intValue);
        }
        if (this.eHq != null) {
            this.eHq.a(this.eHW);
        }
    }

    private boolean d(int i, int i2, int i3, int i4, int i5) {
        if (this.eHS == i && this.eHT == i2 && this.eHU == i3 && this.eHV == i4 && this.radius == i5) {
            return false;
        }
        return true;
    }
}
