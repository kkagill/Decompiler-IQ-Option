package com.iqoption.core.graphics.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import androidx.annotation.RequiresApi;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.i.g;
import kotlin.TypeCastException;
import kotlin.i;

@RequiresApi(19)
@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\r"}, bng = {"Lcom/iqoption/core/graphics/animation/ImageAnimHelper19;", "Lcom/iqoption/core/graphics/animation/ImageAnimHelperApi;", "()V", "animate", "", "view", "Landroid/widget/ImageView;", "matrix", "Landroid/graphics/Matrix;", "postAnimate", "animator", "Landroid/animation/Animator;", "preAnimate", "core_release"})
/* compiled from: ImageAnimHelperApi.kt */
final class f implements h {

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/core/graphics/animation/ImageAnimHelper19$postAnimate$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "core_release"})
    /* compiled from: ImageAnimHelperApi.kt */
    public static final class a extends AnimatorListenerAdapter {
        final /* synthetic */ ImageView bhN;

        a(ImageView imageView) {
            this.bhN = imageView;
        }

        public void onAnimationEnd(Animator animator) {
            kotlin.jvm.internal.i.f(animator, "animation");
            Object tag = this.bhN.getTag(g.save_scale_type);
            if (tag != null) {
                ScaleType scaleType = (ScaleType) tag;
                this.bhN.setScaleType(scaleType);
                this.bhN.setTag(g.save_scale_type, null);
                if (scaleType == ScaleType.MATRIX) {
                    ImageView imageView = this.bhN;
                    Object tag2 = imageView.getTag(g.save_image_matrix);
                    if (tag2 != null) {
                        imageView.setImageMatrix((Matrix) tag2);
                        this.bhN.setTag(g.save_image_matrix, null);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.graphics.Matrix");
                    }
                }
                animator.removeListener(this);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView.ScaleType");
        }
    }

    public void c(ImageView imageView) {
        kotlin.jvm.internal.i.f(imageView, Promotion.ACTION_VIEW);
        ScaleType scaleType = imageView.getScaleType();
        imageView.setTag(g.save_scale_type, scaleType);
        if (scaleType == ScaleType.MATRIX) {
            imageView.setTag(g.save_image_matrix, imageView.getImageMatrix());
        } else {
            imageView.setScaleType(ScaleType.MATRIX);
        }
        imageView.setImageMatrix(com.iqoption.core.graphics.a.bhB);
    }

    public void a(ImageView imageView, Matrix matrix) {
        kotlin.jvm.internal.i.f(imageView, Promotion.ACTION_VIEW);
        kotlin.jvm.internal.i.f(matrix, "matrix");
        imageView.setImageMatrix(matrix);
    }

    public void a(ImageView imageView, Animator animator) {
        kotlin.jvm.internal.i.f(imageView, Promotion.ACTION_VIEW);
        kotlin.jvm.internal.i.f(animator, "animator");
        animator.addListener(new a(imageView));
    }
}
