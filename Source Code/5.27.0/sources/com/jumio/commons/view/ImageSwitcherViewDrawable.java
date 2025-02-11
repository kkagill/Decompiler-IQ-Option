package com.jumio.commons.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.ArrayList;

public class ImageSwitcherViewDrawable extends RelativeLayout implements OnClickListener {
    private static final int ANIMATION_DURATION_IN = 160;
    private static final int ANIMATION_DURATION_OUT = 130;
    private static final int IMAGE_VIEW_POOL_SIZE = 2;
    private int currentDrawableIndex;
    private int currentImageViewIndex;
    private ArrayList<Drawable> drawables;
    private OnImageSwitchedListener externalListener;
    private ImageView[] imagesPool;

    public interface OnImageSwitchedListener {
        void onImageSwitchFinished(ImageSwitcherViewDrawable imageSwitcherViewDrawable);

        void onImageSwitchStarted(ImageSwitcherViewDrawable imageSwitcherViewDrawable);
    }

    public ImageSwitcherViewDrawable(Context context) {
        super(context);
        this.imagesPool = new ImageView[2];
        this.currentDrawableIndex = 0;
        this.currentImageViewIndex = 0;
        init();
    }

    public ImageSwitcherViewDrawable(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.imagesPool = new ImageView[2];
        this.currentDrawableIndex = 0;
        this.currentImageViewIndex = 0;
        init();
    }

    public ImageSwitcherViewDrawable(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.imagesPool = new ImageView[2];
        this.currentDrawableIndex = 0;
        this.currentImageViewIndex = 0;
        init();
    }

    private void init() {
        setOnClickListener(this);
    }

    public void onClick(View view) {
        this.externalListener.onImageSwitchStarted(this);
        if (this.drawables.size() == 1) {
            this.externalListener.onImageSwitchFinished(this);
        } else {
            startSwitchAnimation();
        }
    }

    private void startSwitchAnimation() {
        ImageView imageView = this.imagesPool[this.currentImageViewIndex];
        int i = 0;
        this.currentDrawableIndex = this.currentDrawableIndex < this.drawables.size() - 1 ? this.currentDrawableIndex + 1 : 0;
        int i2 = this.currentImageViewIndex;
        if (i2 < 1) {
            i = i2 + 1;
        }
        this.currentImageViewIndex = i;
        ImageView imageView2 = this.imagesPool[this.currentImageViewIndex];
        Drawable drawable = (Drawable) this.drawables.get(this.currentDrawableIndex);
        int floor = (int) Math.floor((double) drawable.getIntrinsicHeight());
        imageView2.setImageDrawable(drawable);
        new Handler(Looper.getMainLooper()).post(getAnimatorTask(imageView, imageView2, floor, this));
    }

    private Runnable getAnimatorTask(ImageView imageView, ImageView imageView2, int i, ImageSwitcherViewDrawable imageSwitcherViewDrawable) {
        final ImageView imageView3 = imageView;
        final int i2 = i;
        final ImageView imageView4 = imageView2;
        final ImageSwitcherViewDrawable imageSwitcherViewDrawable2 = imageSwitcherViewDrawable;
        return new Runnable() {
            public void run() {
                String str = "alpha";
                ObjectAnimator.ofFloat(imageView3, str, new float[]{255.0f, 0.0f}).setDuration(130);
                String str2 = "translationY";
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView3, str2, new float[]{0.0f, (float) i2});
                ofFloat.setInterpolator(new DecelerateInterpolator());
                ofFloat.setDuration(130);
                ObjectAnimator.ofFloat(imageView4, str, new float[]{0.0f, 255.0f}).setDuration(160);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView4, str2, new float[]{(float) (-i2), 0.0f});
                ofFloat.setInterpolator(new AccelerateInterpolator());
                ofFloat2.setDuration(160);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{ofFloat, r0, ofFloat2, r3});
                animatorSet.addListener(new AnimatorListener() {
                    public void onAnimationCancel(Animator animator) {
                    }

                    public void onAnimationRepeat(Animator animator) {
                    }

                    public void onAnimationStart(Animator animator) {
                    }

                    public void onAnimationEnd(Animator animator) {
                        ImageSwitcherViewDrawable.this.externalListener.onImageSwitchFinished(imageSwitcherViewDrawable2);
                    }
                });
                animatorSet.start();
            }
        };
    }

    public ImageSwitcherViewDrawable setImages(ArrayList<Drawable> arrayList, int i) {
        this.drawables = arrayList;
        this.currentDrawableIndex = 0;
        this.currentImageViewIndex = 0;
        Drawable drawable = (Drawable) arrayList.get(this.currentDrawableIndex);
        int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
        for (intrinsicHeight = 0; intrinsicHeight < 2; intrinsicHeight++) {
            ImageView imageView = new ImageView(getContext());
            imageView.setPadding(0, i, 0, i);
            addView(imageView);
            this.imagesPool[intrinsicHeight] = imageView;
        }
        this.imagesPool[this.currentImageViewIndex].setImageDrawable(drawable);
        return this;
    }

    public void switchToImageWithIndex(int i) {
        if (i < this.drawables.size()) {
            this.currentDrawableIndex = i;
            this.imagesPool[this.currentImageViewIndex].setImageDrawable((Drawable) this.drawables.get(this.currentDrawableIndex));
        }
    }

    public void setOnImageSwitchedListener(OnImageSwitchedListener onImageSwitchedListener) {
        this.externalListener = onImageSwitchedListener;
    }
}
