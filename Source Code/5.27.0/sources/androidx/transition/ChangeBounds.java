package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import java.util.Map;

public class ChangeBounds extends Transition {
    private static final Property<View, PointF> BOTTOM_RIGHT_ONLY_PROPERTY;
    private static final Property<ViewBounds, PointF> BOTTOM_RIGHT_PROPERTY;
    private static final Property<Drawable, PointF> DRAWABLE_ORIGIN_PROPERTY = new Property<Drawable, PointF>(PointF.class, "boundsOrigin") {
        private Rect mBounds = new Rect();

        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.mBounds);
            this.mBounds.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.mBounds);
        }

        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.mBounds);
            return new PointF((float) this.mBounds.left, (float) this.mBounds.top);
        }
    };
    private static final Property<View, PointF> POSITION_PROPERTY = new Property<View, PointF>(PointF.class, "position") {
        public PointF get(View view) {
            return null;
        }

        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            ViewUtils.setLeftTopRightBottom(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    };
    private static final String PROPNAME_BOUNDS = "android:changeBounds:bounds";
    private static final String PROPNAME_CLIP = "android:changeBounds:clip";
    private static final String PROPNAME_PARENT = "android:changeBounds:parent";
    private static final String PROPNAME_WINDOW_X = "android:changeBounds:windowX";
    private static final String PROPNAME_WINDOW_Y = "android:changeBounds:windowY";
    private static final Property<View, PointF> TOP_LEFT_ONLY_PROPERTY;
    private static final Property<ViewBounds, PointF> TOP_LEFT_PROPERTY;
    private static RectEvaluator sRectEvaluator = new RectEvaluator();
    private static final String[] sTransitionProperties = new String[]{PROPNAME_BOUNDS, PROPNAME_CLIP, PROPNAME_PARENT, PROPNAME_WINDOW_X, PROPNAME_WINDOW_Y};
    private boolean mReparent;
    private boolean mResizeClip;
    private int[] mTempLocation;

    private static class ViewBounds {
        private int mBottom;
        private int mBottomRightCalls;
        private int mLeft;
        private int mRight;
        private int mTop;
        private int mTopLeftCalls;
        private View mView;

        ViewBounds(View view) {
            this.mView = view;
        }

        /* Access modifiers changed, original: 0000 */
        public void setTopLeft(PointF pointF) {
            this.mLeft = Math.round(pointF.x);
            this.mTop = Math.round(pointF.y);
            this.mTopLeftCalls++;
            if (this.mTopLeftCalls == this.mBottomRightCalls) {
                setLeftTopRightBottom();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void setBottomRight(PointF pointF) {
            this.mRight = Math.round(pointF.x);
            this.mBottom = Math.round(pointF.y);
            this.mBottomRightCalls++;
            if (this.mTopLeftCalls == this.mBottomRightCalls) {
                setLeftTopRightBottom();
            }
        }

        private void setLeftTopRightBottom() {
            ViewUtils.setLeftTopRightBottom(this.mView, this.mLeft, this.mTop, this.mRight, this.mBottom);
            this.mTopLeftCalls = 0;
            this.mBottomRightCalls = 0;
        }
    }

    static {
        String str = "topLeft";
        TOP_LEFT_PROPERTY = new Property<ViewBounds, PointF>(PointF.class, str) {
            public PointF get(ViewBounds viewBounds) {
                return null;
            }

            public void set(ViewBounds viewBounds, PointF pointF) {
                viewBounds.setTopLeft(pointF);
            }
        };
        String str2 = "bottomRight";
        BOTTOM_RIGHT_PROPERTY = new Property<ViewBounds, PointF>(PointF.class, str2) {
            public PointF get(ViewBounds viewBounds) {
                return null;
            }

            public void set(ViewBounds viewBounds, PointF pointF) {
                viewBounds.setBottomRight(pointF);
            }
        };
        BOTTOM_RIGHT_ONLY_PROPERTY = new Property<View, PointF>(PointF.class, str2) {
            public PointF get(View view) {
                return null;
            }

            public void set(View view, PointF pointF) {
                ViewUtils.setLeftTopRightBottom(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
            }
        };
        TOP_LEFT_ONLY_PROPERTY = new Property<View, PointF>(PointF.class, str) {
            public PointF get(View view) {
                return null;
            }

            public void set(View view, PointF pointF) {
                ViewUtils.setLeftTopRightBottom(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
            }
        };
    }

    public ChangeBounds() {
        this.mTempLocation = new int[2];
        this.mResizeClip = false;
        this.mReparent = false;
    }

    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTempLocation = new int[2];
        this.mResizeClip = false;
        this.mReparent = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.CHANGE_BOUNDS);
        boolean namedBoolean = TypedArrayUtils.getNamedBoolean(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        setResizeClip(namedBoolean);
    }

    @Nullable
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    public void setResizeClip(boolean z) {
        this.mResizeClip = z;
    }

    public boolean getResizeClip() {
        return this.mResizeClip;
    }

    private void captureValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (ViewCompat.isLaidOut(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            transitionValues.values.put(PROPNAME_BOUNDS, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            transitionValues.values.put(PROPNAME_PARENT, transitionValues.view.getParent());
            if (this.mReparent) {
                transitionValues.view.getLocationInWindow(this.mTempLocation);
                transitionValues.values.put(PROPNAME_WINDOW_X, Integer.valueOf(this.mTempLocation[0]));
                transitionValues.values.put(PROPNAME_WINDOW_Y, Integer.valueOf(this.mTempLocation[1]));
            }
            if (this.mResizeClip) {
                transitionValues.values.put(PROPNAME_CLIP, ViewCompat.getClipBounds(view));
            }
        }
    }

    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    private boolean parentMatches(View view, View view2) {
        if (!this.mReparent) {
            return true;
        }
        TransitionValues matchedTransitionValues = getMatchedTransitionValues(view, true);
        if (matchedTransitionValues == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == matchedTransitionValues.view) {
            return true;
        }
        return false;
    }

    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        TransitionValues transitionValues3 = transitionValues;
        TransitionValues transitionValues4 = transitionValues2;
        if (transitionValues3 == null || transitionValues4 == null) {
            return null;
        }
        Map map = transitionValues3.values;
        Map map2 = transitionValues4.values;
        String str = PROPNAME_PARENT;
        ViewGroup viewGroup2 = (ViewGroup) map.get(str);
        ViewGroup viewGroup3 = (ViewGroup) map2.get(str);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = transitionValues4.view;
        int i;
        int i2;
        Map map3;
        int i3;
        if (parentMatches(viewGroup2, viewGroup3)) {
            map = transitionValues3.values;
            str = PROPNAME_BOUNDS;
            Rect rect = (Rect) map.get(str);
            Rect rect2 = (Rect) transitionValues4.values.get(str);
            int i4 = rect.left;
            int i5 = rect2.left;
            int i6 = rect.top;
            int i7 = rect2.top;
            int i8 = rect.right;
            int i9 = rect2.right;
            i = rect.bottom;
            int i10 = rect2.bottom;
            int i11 = i8 - i4;
            i2 = i - i6;
            int i12 = i9 - i5;
            int i13 = i10 - i7;
            map3 = transitionValues3.values;
            View view2 = view;
            String str2 = PROPNAME_CLIP;
            Rect rect3 = (Rect) map3.get(str2);
            Rect rect4 = (Rect) transitionValues4.values.get(str2);
            if ((i11 == 0 || i2 == 0) && (i12 == 0 || i13 == 0)) {
                i3 = 0;
            } else {
                i3 = (i4 == i5 && i6 == i7) ? 0 : 1;
                if (!(i8 == i9 && i == i10)) {
                    i3++;
                }
            }
            if (!(rect3 == null || rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                i3++;
            }
            if (i3 > 0) {
                Animator mergeAnimators;
                Rect rect5 = rect4;
                Rect rect6 = rect3;
                if (this.mResizeClip) {
                    Animator animator;
                    Rect rect7;
                    Animator animator2;
                    view = view2;
                    ViewUtils.setLeftTopRightBottom(view, i4, i6, Math.max(i11, i12) + i4, Math.max(i2, i13) + i6);
                    if (i4 == i5 && i6 == i7) {
                        animator = null;
                    } else {
                        animator = ObjectAnimatorUtils.ofPointF(view, POSITION_PROPERTY, getPathMotion().getPath((float) i4, (float) i6, (float) i5, (float) i7));
                    }
                    if (rect6 == null) {
                        i = 0;
                        rect7 = new Rect(0, 0, i11, i2);
                    } else {
                        i = 0;
                        rect7 = rect6;
                    }
                    if (rect7.equals(rect5 == null ? new Rect(i, i, i12, i13) : rect5)) {
                        animator2 = null;
                    } else {
                        ViewCompat.setClipBounds(view, rect7);
                        animator2 = ObjectAnimator.ofObject(view, "clipBounds", sRectEvaluator, new Object[]{rect7, r2});
                        final View view3 = view;
                        rect = rect5;
                        i13 = i5;
                        i11 = i7;
                        i4 = i9;
                        i5 = i10;
                        animator2.addListener(new AnimatorListenerAdapter() {
                            private boolean mIsCanceled;

                            public void onAnimationCancel(Animator animator) {
                                this.mIsCanceled = true;
                            }

                            public void onAnimationEnd(Animator animator) {
                                if (!this.mIsCanceled) {
                                    ViewCompat.setClipBounds(view3, rect);
                                    ViewUtils.setLeftTopRightBottom(view3, i13, i11, i4, i5);
                                }
                            }
                        });
                    }
                    mergeAnimators = TransitionUtils.mergeAnimators(animator, animator2);
                } else {
                    view = view2;
                    ViewUtils.setLeftTopRightBottom(view, i4, i6, i8, i);
                    if (i3 == 2) {
                        if (i11 == i12 && i2 == i13) {
                            mergeAnimators = ObjectAnimatorUtils.ofPointF(view, POSITION_PROPERTY, getPathMotion().getPath((float) i4, (float) i6, (float) i5, (float) i7));
                        } else {
                            final ViewBounds viewBounds = new ViewBounds(view);
                            ObjectAnimator ofPointF = ObjectAnimatorUtils.ofPointF(viewBounds, TOP_LEFT_PROPERTY, getPathMotion().getPath((float) i4, (float) i6, (float) i5, (float) i7));
                            ObjectAnimator ofPointF2 = ObjectAnimatorUtils.ofPointF(viewBounds, BOTTOM_RIGHT_PROPERTY, getPathMotion().getPath((float) i8, (float) i, (float) i9, (float) i10));
                            Animator animatorSet = new AnimatorSet();
                            animatorSet.playTogether(new Animator[]{ofPointF, ofPointF2});
                            animatorSet.addListener(new AnimatorListenerAdapter() {
                                private ViewBounds mViewBounds = viewBounds;
                            });
                            mergeAnimators = animatorSet;
                        }
                    } else if (i4 == i5 && i6 == i7) {
                        mergeAnimators = ObjectAnimatorUtils.ofPointF(view, BOTTOM_RIGHT_ONLY_PROPERTY, getPathMotion().getPath((float) i8, (float) i, (float) i9, (float) i10));
                    } else {
                        mergeAnimators = ObjectAnimatorUtils.ofPointF(view, TOP_LEFT_ONLY_PROPERTY, getPathMotion().getPath((float) i4, (float) i6, (float) i5, (float) i7));
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    final ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    ViewGroupUtils.suppressLayout(viewGroup4, true);
                    addListener(new TransitionListenerAdapter() {
                        boolean mCanceled = false;

                        public void onTransitionCancel(@NonNull Transition transition) {
                            ViewGroupUtils.suppressLayout(viewGroup4, false);
                            this.mCanceled = true;
                        }

                        public void onTransitionEnd(@NonNull Transition transition) {
                            if (!this.mCanceled) {
                                ViewGroupUtils.suppressLayout(viewGroup4, false);
                            }
                            transition.removeListener(this);
                        }

                        public void onTransitionPause(@NonNull Transition transition) {
                            ViewGroupUtils.suppressLayout(viewGroup4, false);
                        }

                        public void onTransitionResume(@NonNull Transition transition) {
                            ViewGroupUtils.suppressLayout(viewGroup4, true);
                        }
                    });
                }
                return mergeAnimators;
            }
        }
        Map map4 = transitionValues3.values;
        String str3 = PROPNAME_WINDOW_X;
        i2 = ((Integer) map4.get(str3)).intValue();
        map3 = transitionValues3.values;
        String str4 = PROPNAME_WINDOW_Y;
        int intValue = ((Integer) map3.get(str4)).intValue();
        i = ((Integer) transitionValues4.values.get(str3)).intValue();
        i3 = ((Integer) transitionValues4.values.get(str4)).intValue();
        if (!(i2 == i && intValue == i3)) {
            viewGroup.getLocationInWindow(this.mTempLocation);
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.ARGB_8888);
            view.draw(new Canvas(createBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
            float transitionAlpha = ViewUtils.getTransitionAlpha(view);
            ViewUtils.setTransitionAlpha(view, 0.0f);
            ViewUtils.getOverlay(viewGroup).add(bitmapDrawable);
            PathMotion pathMotion = getPathMotion();
            int[] iArr = this.mTempLocation;
            PropertyValuesHolder ofPointF3 = PropertyValuesHolderUtils.ofPointF(DRAWABLE_ORIGIN_PROPERTY, pathMotion.getPath((float) (i2 - iArr[0]), (float) (intValue - iArr[1]), (float) (i - iArr[0]), (float) (i3 - iArr[1])));
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{ofPointF3});
            final ViewGroup viewGroup5 = viewGroup;
            final BitmapDrawable bitmapDrawable2 = bitmapDrawable;
            final View view4 = view;
            final float f = transitionAlpha;
            ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    ViewUtils.getOverlay(viewGroup5).remove(bitmapDrawable2);
                    ViewUtils.setTransitionAlpha(view4, f);
                }
            });
            return ofPropertyValuesHolder;
        }
        return null;
    }
}
