package com.iqoption.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.iqoption.util.ak;
import com.iqoption.view.a.a.c;
import com.iqoption.x.R;
import java.util.ArrayList;
import java.util.Map;

public class OtnLoyaltyTeaserView extends FrameLayout {
    private static final Map<Integer, b> efu;
    private static final Map<Integer, b> efv;
    private static final Map<Integer, b> efw;
    private static final Map<Integer, b> efx;
    private Animator animator;
    private View efA;
    private View efB;
    private View efC;
    private a efD;
    private boolean efE;
    private View efy;
    private View efz;

    private abstract class a {
        public abstract void aYi();

        public abstract Animator aYl();

        private a() {
        }

        /* synthetic */ a(OtnLoyaltyTeaserView otnLoyaltyTeaserView, AnonymousClass1 anonymousClass1) {
            this();
        }

        /* Access modifiers changed, original: final */
        public final void aYm() {
            int childCount = OtnLoyaltyTeaserView.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = OtnLoyaltyTeaserView.this.getChildAt(i);
                childAt.setAlpha(0.0f);
                childAt.setTranslationX(((b) OtnLoyaltyTeaserView.efu.get(Integer.valueOf(childAt.getId()))).f(OtnLoyaltyTeaserView.this));
            }
            OtnLoyaltyTeaserView.this.efB.setRotation(-180.0f);
        }
    }

    private interface b {
        public static final b efG = new b() {
            public float f(OtnLoyaltyTeaserView otnLoyaltyTeaserView) {
                return ((float) otnLoyaltyTeaserView.getWidth()) - (((float) otnLoyaltyTeaserView.efB.getWidth()) / 2.0f);
            }
        };
        public static final b efH = new b() {
            public float f(OtnLoyaltyTeaserView otnLoyaltyTeaserView) {
                return 0.0f;
            }
        };
        public static final b efI = new b() {
            public float f(OtnLoyaltyTeaserView otnLoyaltyTeaserView) {
                return (float) otnLoyaltyTeaserView.efy.getMeasuredWidth();
            }
        };
        public static final b efJ = new b() {
            public float f(OtnLoyaltyTeaserView otnLoyaltyTeaserView) {
                return ((float) otnLoyaltyTeaserView.efy.getMeasuredWidth()) / 2.0f;
            }
        };
        public static final b efK = new b() {
            public float f(OtnLoyaltyTeaserView otnLoyaltyTeaserView) {
                return ((float) otnLoyaltyTeaserView.efy.getMeasuredWidth()) / 3.0f;
            }
        };
        public static final b efL = new b() {
            public float f(OtnLoyaltyTeaserView otnLoyaltyTeaserView) {
                return (((float) otnLoyaltyTeaserView.efy.getMeasuredWidth()) / 3.0f) * 2.0f;
            }
        };
        public static final b efM = new b() {
            public float f(OtnLoyaltyTeaserView otnLoyaltyTeaserView) {
                return (float) (-otnLoyaltyTeaserView.efy.getMeasuredWidth());
            }
        };
        public static final b efN = new b() {
            public float f(OtnLoyaltyTeaserView otnLoyaltyTeaserView) {
                return -(((float) otnLoyaltyTeaserView.efy.getMeasuredWidth()) / 3.0f);
            }
        };

        float f(OtnLoyaltyTeaserView otnLoyaltyTeaserView);
    }

    static {
        com.google.common.collect.ImmutableMap.a aVar = new com.google.common.collect.ImmutableMap.a();
        Integer valueOf = Integer.valueOf(R.id.btc);
        aVar = aVar.m(valueOf, b.efG);
        Integer valueOf2 = Integer.valueOf(R.id.dsh);
        aVar = aVar.m(valueOf2, b.efG);
        Integer valueOf3 = Integer.valueOf(R.id.ltc);
        aVar = aVar.m(valueOf3, b.efG);
        Integer valueOf4 = Integer.valueOf(R.id.otn);
        aVar = aVar.m(valueOf4, b.efI);
        Integer valueOf5 = Integer.valueOf(R.id.text);
        efu = aVar.m(valueOf5, b.efH).tf();
        efv = new com.google.common.collect.ImmutableMap.a().m(valueOf, b.efH).m(valueOf2, b.efJ).m(valueOf3, b.efI).m(valueOf4, b.efI).m(valueOf5, b.efH).tf();
        efw = new com.google.common.collect.ImmutableMap.a().m(valueOf, b.efH).m(valueOf2, b.efH).m(valueOf3, b.efH).m(valueOf4, b.efH).m(valueOf5, b.efM).tf();
        efx = new com.google.common.collect.ImmutableMap.a().m(valueOf, b.efH).m(valueOf2, b.efK).m(valueOf3, b.efL).m(valueOf5, b.efN).tf();
    }

    public OtnLoyaltyTeaserView(@NonNull Context context) {
        super(context);
        init(null);
    }

    public OtnLoyaltyTeaserView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public OtnLoyaltyTeaserView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }

    @TargetApi(21)
    public OtnLoyaltyTeaserView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(context, attributeSet, i, i2);
        init(attributeSet);
    }

    private void init(AttributeSet attributeSet) {
        LayoutInflater.from(getContext()).inflate(R.layout.view_otn_loyalty_teaser, this);
        this.efy = findViewById(R.id.btc);
        this.efz = findViewById(R.id.dsh);
        this.efA = findViewById(R.id.ltc);
        this.efB = findViewById(R.id.otn);
        this.efC = findViewById(R.id.text);
        boolean z = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.iqoption.d.a.OtnLoyaltyTeaserView);
            if (obtainStyledAttributes.getBoolean(0, true)) {
                this.efD = new a() {
                    public Animator aYl() {
                        PropertyValuesHolder[] propertyValuesHolderArr;
                        AnimatorSet animatorSet = new AnimatorSet();
                        View[] viewArr = new View[]{OtnLoyaltyTeaserView.this.efy, OtnLoyaltyTeaserView.this.efz, OtnLoyaltyTeaserView.this.efA};
                        ArrayList arrayList = new ArrayList();
                        for (View view : viewArr) {
                            propertyValuesHolderArr = new PropertyValuesHolder[2];
                            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f});
                            propertyValuesHolderArr[1] = OtnLoyaltyTeaserView.this.cd(view);
                            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
                            ofPropertyValuesHolder.setInterpolator(c.bhT);
                            arrayList.add(ofPropertyValuesHolder.setDuration(150));
                        }
                        new AnimatorSet().playSequentially(arrayList);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        Animator[] animatorArr = new Animator[2];
                        View a = OtnLoyaltyTeaserView.this.efB;
                        propertyValuesHolderArr = new PropertyValuesHolder[4];
                        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f, 1.0f});
                        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.0f, 1.0f, 1.2f});
                        propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.0f, 1.0f, 1.2f});
                        propertyValuesHolderArr[3] = PropertyValuesHolder.ofFloat(View.ROTATION, new float[]{0.0f});
                        animatorArr[0] = ObjectAnimator.ofPropertyValuesHolder(a, propertyValuesHolderArr);
                        animatorArr[1] = ObjectAnimator.ofFloat(OtnLoyaltyTeaserView.this.efC, View.ALPHA, new float[]{0.0f, 1.0f});
                        animatorSet2.playTogether(animatorArr);
                        animatorSet2.setInterpolator(c.egR);
                        com.iqoption.core.util.b.a(animatorSet2, 350);
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        r9 = new Animator[5];
                        r9[0] = ObjectAnimator.ofFloat(OtnLoyaltyTeaserView.this.efy, View.ALPHA, new float[]{0.0f});
                        View c = OtnLoyaltyTeaserView.this.efz;
                        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[2];
                        propertyValuesHolderArr2[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
                        OtnLoyaltyTeaserView otnLoyaltyTeaserView = OtnLoyaltyTeaserView.this;
                        propertyValuesHolderArr2[1] = otnLoyaltyTeaserView.ce(otnLoyaltyTeaserView.efz);
                        r9[1] = ObjectAnimator.ofPropertyValuesHolder(c, propertyValuesHolderArr2);
                        View view2 = OtnLoyaltyTeaserView.this.efA;
                        propertyValuesHolderArr = new PropertyValuesHolder[2];
                        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
                        OtnLoyaltyTeaserView otnLoyaltyTeaserView2 = OtnLoyaltyTeaserView.this;
                        propertyValuesHolderArr[1] = otnLoyaltyTeaserView2.ce(otnLoyaltyTeaserView2.efA);
                        r9[2] = ObjectAnimator.ofPropertyValuesHolder(view2, propertyValuesHolderArr);
                        view2 = OtnLoyaltyTeaserView.this.efB;
                        propertyValuesHolderArr = new PropertyValuesHolder[3];
                        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f});
                        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f});
                        OtnLoyaltyTeaserView otnLoyaltyTeaserView3 = OtnLoyaltyTeaserView.this;
                        propertyValuesHolderArr[2] = otnLoyaltyTeaserView3.ce(otnLoyaltyTeaserView3.efB);
                        r9[3] = ObjectAnimator.ofPropertyValuesHolder(view2, propertyValuesHolderArr);
                        View e = OtnLoyaltyTeaserView.this.efC;
                        PropertyValuesHolder[] propertyValuesHolderArr3 = new PropertyValuesHolder[1];
                        OtnLoyaltyTeaserView otnLoyaltyTeaserView4 = OtnLoyaltyTeaserView.this;
                        propertyValuesHolderArr3[0] = otnLoyaltyTeaserView4.ce(otnLoyaltyTeaserView4.efC);
                        r9[4] = ObjectAnimator.ofPropertyValuesHolder(e, propertyValuesHolderArr3);
                        animatorSet3.playTogether(r9);
                        animatorSet3.setInterpolator(c.egR);
                        com.iqoption.core.util.b.a(animatorSet3, 300);
                        animatorSet.playSequentially(new Animator[]{r3, animatorSet2, animatorSet3});
                        return animatorSet;
                    }

                    public void aYi() {
                        r0 = new View[5];
                        int i = 0;
                        r0[0] = OtnLoyaltyTeaserView.this.efy;
                        r0[1] = OtnLoyaltyTeaserView.this.efz;
                        r0[2] = OtnLoyaltyTeaserView.this.efA;
                        r0[3] = OtnLoyaltyTeaserView.this.efB;
                        r0[4] = OtnLoyaltyTeaserView.this.efC;
                        int length = r0.length;
                        while (true) {
                            float f = 0.0f;
                            if (i < length) {
                                View view = r0[i];
                                if (view == OtnLoyaltyTeaserView.this.efC) {
                                    f = 1.0f;
                                }
                                view.setAlpha(f);
                                view.setTranslationX(((b) OtnLoyaltyTeaserView.efw.get(Integer.valueOf(view.getId()))).f(OtnLoyaltyTeaserView.this));
                                i++;
                            } else {
                                OtnLoyaltyTeaserView.this.efB.setRotation(0.0f);
                                OtnLoyaltyTeaserView.this.efB.setAlpha(1.0f);
                                OtnLoyaltyTeaserView.this.efB.setScaleX(1.0f);
                                OtnLoyaltyTeaserView.this.efB.setScaleY(1.0f);
                                return;
                            }
                        }
                    }
                };
                z = false;
            }
            obtainStyledAttributes.recycle();
        }
        if (z) {
            this.efD = new a() {
                public Animator aYl() {
                    AnimatorSet animatorSet = new AnimatorSet();
                    View[] viewArr = new View[]{OtnLoyaltyTeaserView.this.efy, OtnLoyaltyTeaserView.this.efz, OtnLoyaltyTeaserView.this.efA};
                    ArrayList arrayList = new ArrayList();
                    for (View view : viewArr) {
                        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
                        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f});
                        propertyValuesHolderArr[1] = OtnLoyaltyTeaserView.this.cc(view);
                        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
                        ofPropertyValuesHolder.setInterpolator(c.bhT);
                        arrayList.add(ofPropertyValuesHolder.setDuration(150));
                    }
                    new AnimatorSet().playSequentially(arrayList);
                    View e = OtnLoyaltyTeaserView.this.efC;
                    PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[2];
                    propertyValuesHolderArr2[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f});
                    OtnLoyaltyTeaserView otnLoyaltyTeaserView = OtnLoyaltyTeaserView.this;
                    propertyValuesHolderArr2[1] = otnLoyaltyTeaserView.cc(otnLoyaltyTeaserView.efC);
                    ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(e, propertyValuesHolderArr2);
                    ofPropertyValuesHolder2.setInterpolator(c.egR);
                    ofPropertyValuesHolder2.setDuration(350);
                    animatorSet.playSequentially(new Animator[]{r1, ofPropertyValuesHolder2});
                    return animatorSet;
                }

                public void aYi() {
                    r0 = new View[4];
                    int i = 0;
                    r0[0] = OtnLoyaltyTeaserView.this.efy;
                    r0[1] = OtnLoyaltyTeaserView.this.efz;
                    r0[2] = OtnLoyaltyTeaserView.this.efA;
                    r0[3] = OtnLoyaltyTeaserView.this.efC;
                    int length = r0.length;
                    while (i < length) {
                        View view = r0[i];
                        view.setAlpha(1.0f);
                        view.setTranslationX(((b) OtnLoyaltyTeaserView.efx.get(Integer.valueOf(view.getId()))).f(OtnLoyaltyTeaserView.this));
                        i++;
                    }
                    OtnLoyaltyTeaserView.this.efB.setAlpha(0.0f);
                }
            };
        }
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.animator == null) {
            if (this.efE) {
                this.efD.aYi();
            } else {
                this.efD.aYm();
            }
            this.animator = this.efD.aYl();
        }
    }

    private PropertyValuesHolder cc(View view) {
        float f = ((b) efu.get(Integer.valueOf(view.getId()))).f(this);
        float f2 = ((b) efx.get(Integer.valueOf(view.getId()))).f(this);
        return PropertyValuesHolder.ofFloat(TRANSLATION_X, new float[]{f, f2});
    }

    private PropertyValuesHolder cd(View view) {
        float f = ((b) efu.get(Integer.valueOf(view.getId()))).f(this);
        float f2 = ((b) efv.get(Integer.valueOf(view.getId()))).f(this);
        return PropertyValuesHolder.ofFloat(TRANSLATION_X, new float[]{f, f2});
    }

    private PropertyValuesHolder ce(View view) {
        float f = ((b) efv.get(Integer.valueOf(view.getId()))).f(this);
        float f2 = ((b) efw.get(Integer.valueOf(view.getId()))).f(this);
        return PropertyValuesHolder.ofFloat(TRANSLATION_X, new float[]{f, f2});
    }

    public void aYi() {
        Animator animator = this.animator;
        if (animator == null) {
            this.efE = true;
            return;
        }
        animator.cancel();
        this.efD.aYi();
    }

    public void play() {
        Animator animator = this.animator;
        if (animator == null) {
            ak.b(this, new Runnable() {
                public void run() {
                    OtnLoyaltyTeaserView.this.play();
                }
            });
        } else if (!animator.isRunning()) {
            this.animator.start();
        }
    }
}
