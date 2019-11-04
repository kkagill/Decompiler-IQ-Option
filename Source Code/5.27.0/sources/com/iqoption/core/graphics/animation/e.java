package com.iqoption.core.graphics.animation;

import android.animation.Animator;
import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.widget.ImageView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/core/graphics/animation/ImageAnimHelper;", "Lcom/iqoption/core/graphics/animation/ImageAnimHelperApi;", "()V", "impl", "animate", "", "view", "Landroid/widget/ImageView;", "matrix", "Landroid/graphics/Matrix;", "postAnimate", "animator", "Landroid/animation/Animator;", "preAnimate", "core_release"})
/* compiled from: ImageAnimHelperApi.kt */
public final class e implements h {
    private static final h bhL;
    public static final e bhM = new e();

    static {
        h gVar;
        if (VERSION.SDK_INT >= 21) {
            gVar = new g();
        } else {
            gVar = new f();
        }
        bhL = gVar;
    }

    private e() {
    }

    public void c(ImageView imageView) {
        kotlin.jvm.internal.i.f(imageView, Promotion.ACTION_VIEW);
        bhL.c(imageView);
    }

    public void a(ImageView imageView, Matrix matrix) {
        kotlin.jvm.internal.i.f(imageView, Promotion.ACTION_VIEW);
        kotlin.jvm.internal.i.f(matrix, "matrix");
        bhL.a(imageView, matrix);
    }

    public void a(ImageView imageView, Animator animator) {
        kotlin.jvm.internal.i.f(imageView, Promotion.ACTION_VIEW);
        kotlin.jvm.internal.i.f(animator, "animator");
        bhL.a(imageView, animator);
    }
}
