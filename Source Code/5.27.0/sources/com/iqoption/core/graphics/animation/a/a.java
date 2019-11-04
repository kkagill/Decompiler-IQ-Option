package com.iqoption.core.graphics.animation.a;

import android.animation.Animator;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007¨\u0006\t"}, bng = {"Lcom/iqoption/core/graphics/animation/transition/AnimatorFactory;", "Info", "", "createEnterAnimators", "", "Landroid/animation/Animator;", "info", "(Ljava/lang/Object;)Ljava/util/List;", "createExitAnimators", "core_release"})
/* compiled from: AnimatorFactory.kt */
public interface a<Info> {
    List<Animator> bC(Info info);

    List<Animator> bD(Info info);
}
