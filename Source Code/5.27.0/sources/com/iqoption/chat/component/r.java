package com.iqoption.chat.component;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.iqoption.chat.a.ag;
import com.iqoption.chat.e.d;
import com.iqoption.core.graphics.animation.e;
import com.iqoption.core.graphics.animation.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0005\u0006\u0007B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004¨\u0006\b"}, bng = {"Lcom/iqoption/chat/component/ImagePreviewTransition;", "Lcom/iqoption/core/graphics/animation/transition/TemplateTransition;", "Lcom/iqoption/chat/component/ImagePreviewTransitionInfo;", "info", "(Lcom/iqoption/chat/component/ImagePreviewTransitionInfo;)V", "Diff", "FloatDiff", "Transformation", "chat_release"})
/* compiled from: ImagePreviewTransition.kt */
public final class r extends com.iqoption.core.graphics.animation.a.c<s> {

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000b\u001a\u00020\fR \u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000@BX\u000e¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000@BX\u000e¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\r"}, bng = {"Lcom/iqoption/chat/component/ImagePreviewTransition$Diff;", "T", "", "from", "to", "(Ljava/lang/Object;Ljava/lang/Object;)V", "<set-?>", "getFrom", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getTo", "reverse", "", "chat_release"})
    /* compiled from: ImagePreviewTransition.kt */
    private static final class a<T> {
        private T aOK;
        private T aOL;

        public a(T t, T t2) {
            this.aOK = t;
            this.aOL = t2;
        }

        public final T QY() {
            return this.aOK;
        }

        public final T QZ() {
            return this.aOL;
        }

        public final void reverse() {
            Object obj = this.aOK;
            this.aOK = this.aOL;
            this.aOL = obj;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bR\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\f"}, bng = {"Lcom/iqoption/chat/component/ImagePreviewTransition$FloatDiff;", "", "from", "", "to", "(FF)V", "<set-?>", "getFrom", "()F", "getTo", "reverse", "", "chat_release"})
    /* compiled from: ImagePreviewTransition.kt */
    private static final class b {
        private float aOM;
        private float aON;

        public b(float f, float f2) {
            this.aOM = f;
            this.aON = f2;
        }

        public final float Ra() {
            return this.aOM;
        }

        public final float Rb() {
            return this.aON;
        }

        public final void reverse() {
            float f = this.aOM;
            this.aOM = this.aON;
            this.aON = f;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0000R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0013"}, bng = {"Lcom/iqoption/chat/component/ImagePreviewTransition$Transformation;", "", "matrixDiff", "Lcom/iqoption/chat/component/ImagePreviewTransition$Diff;", "Landroid/graphics/Matrix;", "viewSxDiff", "Lcom/iqoption/chat/component/ImagePreviewTransition$FloatDiff;", "viewSyDiff", "viewDxDiff", "viewDyDiff", "(Lcom/iqoption/chat/component/ImagePreviewTransition$Diff;Lcom/iqoption/chat/component/ImagePreviewTransition$FloatDiff;Lcom/iqoption/chat/component/ImagePreviewTransition$FloatDiff;Lcom/iqoption/chat/component/ImagePreviewTransition$FloatDiff;Lcom/iqoption/chat/component/ImagePreviewTransition$FloatDiff;)V", "getMatrixDiff", "()Lcom/iqoption/chat/component/ImagePreviewTransition$Diff;", "getViewDxDiff", "()Lcom/iqoption/chat/component/ImagePreviewTransition$FloatDiff;", "getViewDyDiff", "getViewSxDiff", "getViewSyDiff", "reverse", "chat_release"})
    /* compiled from: ImagePreviewTransition.kt */
    private static final class c {
        private final a<Matrix> aOO;
        private final b aOP;
        private final b aOQ;
        private final b aOR;
        private final b aOS;

        public c(a<Matrix> aVar, b bVar, b bVar2, b bVar3, b bVar4) {
            kotlin.jvm.internal.i.f(bVar, "viewSxDiff");
            kotlin.jvm.internal.i.f(bVar2, "viewSyDiff");
            kotlin.jvm.internal.i.f(bVar3, "viewDxDiff");
            kotlin.jvm.internal.i.f(bVar4, "viewDyDiff");
            this.aOO = aVar;
            this.aOP = bVar;
            this.aOQ = bVar2;
            this.aOR = bVar3;
            this.aOS = bVar4;
        }

        public final a<Matrix> Rd() {
            return this.aOO;
        }

        public final b Re() {
            return this.aOP;
        }

        public final b Rf() {
            return this.aOQ;
        }

        public final b Rg() {
            return this.aOR;
        }

        public final b Rh() {
            return this.aOS;
        }

        public final c Rc() {
            a aVar = this.aOO;
            if (aVar != null) {
                aVar.reverse();
            }
            this.aOP.reverse();
            this.aOQ.reverse();
            this.aOR.reverse();
            this.aOS.reverse();
            return this;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J2\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\fH\u0002J2\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\fH\u0002J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH\u0002J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\fH\u0002JH\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004H\u0002J(\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, bng = {"com/iqoption/chat/component/ImagePreviewTransition$1", "Lcom/iqoption/core/graphics/animation/transition/AnimatorFactory;", "Lcom/iqoption/chat/component/ImagePreviewTransitionInfo;", "dx", "", "endImageRect", "Landroid/graphics/Rect;", "endSelectorRect", "animateImageTransformation", "", "Landroid/animation/Animator;", "view", "Landroid/widget/ImageView;", "t", "Lcom/iqoption/chat/component/ImagePreviewTransition$Transformation;", "animateSelectorTransformation", "animateSharedElementsEnter", "srcImageView", "dstImageView", "srcSelectorView", "dstSelectorView", "animateSharedElementsExit", "createEnterAnimators", "info", "createExitAnimators", "createImageTransformation", "srcView", "dstView", "createSelectorTransformation", "getCenterCropMatrix", "Landroid/graphics/Matrix;", "srcWidth", "srcHeight", "dstViewWidth", "dstViewHeight", "dstWidth", "dstHeight", "dstViewScaleX", "dstViewScaleY", "getCenterInsideMatrix", "vWidth", "vHeight", "iWidth", "iHeight", "chat_release"})
    /* compiled from: ImagePreviewTransition.kt */
    /* renamed from: com.iqoption.chat.component.r$1 */
    public static final class AnonymousClass1 implements com.iqoption.core.graphics.animation.a.a<s> {
        private final float aOG;
        private Rect aOH = new Rect();
        private Rect aOI = new Rect();
        final /* synthetic */ s aOJ;

        AnonymousClass1(s sVar) {
            this.aOJ = sVar;
            this.aOG = com.iqoption.core.ext.a.b((ViewDataBinding) sVar.Rm(), d.dp24);
        }

        private final c a(ImageView imageView, ImageView imageView2) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 != null) {
                    float width = (float) imageView2.getWidth();
                    float height = (float) imageView2.getHeight();
                    float intrinsicWidth = (float) drawable.getIntrinsicWidth();
                    float intrinsicHeight = (float) drawable.getIntrinsicHeight();
                    float intrinsicWidth2 = (float) drawable2.getIntrinsicWidth();
                    float intrinsicHeight2 = (float) drawable2.getIntrinsicHeight();
                    Rect ah = com.iqoption.core.ext.a.ah(imageView);
                    float width2 = ((float) ah.width()) / ((float) this.aOH.width());
                    float height2 = ((float) ah.height()) / ((float) this.aOH.height());
                    return new c(new a(a(intrinsicWidth, intrinsicHeight, width, height, intrinsicWidth2, intrinsicHeight2, width2, height2), e(width, height, intrinsicWidth2, intrinsicHeight2)), new b(width2, 1.0f), new b(height2, 1.0f), new b((float) (ah.centerX() - this.aOH.centerX()), 0.0f), new b((float) (ah.centerY() - this.aOH.centerY()), 0.0f));
                }
            }
            return null;
        }

        private final Matrix a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            f2 = f5 > f6 ? f2 / f6 : f / f5;
            Matrix matrix = new Matrix();
            f7 = f2 / f7;
            f2 /= f8;
            matrix.postScale(f7, f2);
            matrix.postTranslate((float) c.au((f3 - (f5 * f7)) * 0.5f), (float) c.au((f4 - (f6 * f2)) * 0.5f));
            return matrix;
        }

        private final Matrix e(float f, float f2, float f3, float f4) {
            float min = (f3 > f || f4 > f2) ? Math.min(f / f3, f2 / f4) : 1.0f;
            f = (f - (f3 * min)) * 0.5f;
            f2 = (f2 - (f4 * min)) * 0.5f;
            Matrix matrix = new Matrix();
            matrix.setScale(min, min);
            matrix.postTranslate(f, f2);
            return matrix;
        }

        private final c b(ImageView imageView) {
            Rect ah = com.iqoption.core.ext.a.ah(imageView);
            return new c(null, new b(((float) ah.width()) / ((float) this.aOI.width()), 1.0f), new b(((float) ah.height()) / ((float) this.aOI.height()), 1.0f), new b((float) (ah.centerX() - this.aOI.centerX()), 0.0f), new b((float) (ah.centerY() - this.aOI.centerY()), 0.0f));
        }

        private final List<Animator> a(ImageView imageView, c cVar) {
            List arrayList = new ArrayList();
            e.bhM.c(imageView);
            if (cVar.Rd() != null) {
                ObjectAnimator ofObject = ObjectAnimator.ofObject(imageView, com.iqoption.core.graphics.animation.i.bhR.XI(), new k(), new Matrix[]{(Matrix) r1.QY(), (Matrix) r1.QZ()});
                e eVar = e.bhM;
                kotlin.jvm.internal.i.e(ofObject, "it");
                eVar.a(imageView, (Animator) ofObject);
                kotlin.jvm.internal.i.e(ofObject, "ObjectAnimator.ofObject(…it)\n                    }");
                arrayList.add(ofObject);
            }
            r1 = new PropertyValuesHolder[4];
            r1[0] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{cVar.Re().Ra(), cVar.Re().Rb()});
            r1[1] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{cVar.Rf().Ra(), cVar.Rf().Rb()});
            r1[2] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{cVar.Rg().Ra(), cVar.Rg().Rb()});
            r1[3] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{cVar.Rh().Ra(), cVar.Rh().Rb()});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, r1);
            kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "ObjectAnimator.ofPropert…f.from, t.viewDyDiff.to))");
            arrayList.add(ofPropertyValuesHolder);
            return arrayList;
        }

        private final List<Animator> b(ImageView imageView, c cVar) {
            List arrayList = new ArrayList();
            r1 = new PropertyValuesHolder[4];
            r1[0] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{cVar.Re().Ra(), cVar.Re().Rb()});
            r1[1] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{cVar.Rf().Ra(), cVar.Rf().Rb()});
            r1[2] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{cVar.Rg().Ra(), cVar.Rg().Rb()});
            r1[3] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{cVar.Rh().Ra(), cVar.Rh().Rb()});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, r1);
            kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "ObjectAnimator.ofPropert…f.from, t.viewDyDiff.to))");
            arrayList.add(ofPropertyValuesHolder);
            return arrayList;
        }

        private final List<Animator> a(ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4) {
            ObjectAnimator ofFloat;
            List arrayList = new ArrayList();
            String str = "ObjectAnimator.ofFloat(d…View, View.ALPHA, 0f, 1f)";
            if (imageView != null) {
                if (this.aOH.isEmpty()) {
                    this.aOH.set(com.iqoption.core.ext.a.ah(imageView2));
                }
                c a = a(imageView, imageView2);
                if (a != null) {
                    arrayList.addAll(a(imageView2, a));
                } else {
                    ofFloat = ObjectAnimator.ofFloat(imageView2, View.ALPHA, new float[]{0.0f, 1.0f});
                    kotlin.jvm.internal.i.e(ofFloat, str);
                    arrayList.add(ofFloat);
                }
            } else {
                ofFloat = ObjectAnimator.ofFloat(imageView2, View.ALPHA, new float[]{0.0f, 1.0f});
                kotlin.jvm.internal.i.e(ofFloat, str);
                arrayList.add(ofFloat);
            }
            if (imageView3 != null) {
                if (this.aOI.isEmpty()) {
                    this.aOI.set(com.iqoption.core.ext.a.ah(imageView4));
                }
                arrayList.addAll(b(imageView4, b(imageView3)));
            } else {
                PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
                propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f, 1.0f});
                propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{this.aOG, 0.0f});
                ofFloat = ObjectAnimator.ofPropertyValuesHolder(imageView4, propertyValuesHolderArr);
                kotlin.jvm.internal.i.e(ofFloat, "ObjectAnimator.ofPropert…w.TRANSLATION_X, dx, 0f))");
                arrayList.add(ofFloat);
            }
            return arrayList;
        }

        /* renamed from: a */
        public List<Animator> bC(s sVar) {
            ImageView imageView;
            PropertyValuesHolder[] propertyValuesHolderArr;
            ObjectAnimator ofPropertyValuesHolder;
            kotlin.jvm.internal.i.f(sVar, "info");
            List arrayList = new ArrayList();
            ag Rm = sVar.Rm();
            View root = Rm.getRoot();
            kotlin.jvm.internal.i.e(root, "root");
            Drawable background = root.getBackground();
            if (!(background instanceof com.iqoption.core.graphics.a.e)) {
                background = null;
            }
            com.iqoption.core.graphics.a.e eVar = (com.iqoption.core.graphics.a.e) background;
            if (eVar != null) {
                ObjectAnimator ofInt = ObjectAnimator.ofInt(eVar, com.iqoption.core.graphics.animation.c.bhK.XE(), new int[]{0, 255});
                kotlin.jvm.internal.i.e(ofInt, "ObjectAnimator.ofInt(it, Drawables.ALPHA, 0, 255)");
                arrayList.add(ofInt);
            }
            if (((Boolean) sVar.Rl().invoke()).booleanValue()) {
                imageView = Rm.aQL;
                propertyValuesHolderArr = new PropertyValuesHolder[2];
                propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f, 1.0f});
                propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{this.aOG, 0.0f});
                ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, propertyValuesHolderArr);
                kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "ObjectAnimator.ofPropert…w.TRANSLATION_X, dx, 0f))");
                arrayList.add(ofPropertyValuesHolder);
                ofPropertyValuesHolder = ObjectAnimator.ofFloat(Rm.aRy, View.ALPHA, new float[]{0.0f, 1.0f});
                kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "ObjectAnimator.ofFloat(pager, View.ALPHA, 0f, 1f)");
                arrayList.add(ofPropertyValuesHolder);
            } else {
                ImageView imageView2 = (ImageView) sVar.Ri().invoke();
                ImageView imageView3 = (ImageView) sVar.Rj().invoke();
                imageView = (ImageView) sVar.Rk().invoke();
                ImageView imageView4 = Rm.aQL;
                kotlin.jvm.internal.i.e(imageView4, "selector");
                arrayList.addAll(a(imageView2, imageView3, imageView, imageView4));
            }
            TextView textView = Rm.alH;
            propertyValuesHolderArr = new PropertyValuesHolder[2];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f, 1.0f, 1.0f});
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{-this.aOG, 0.0f, 0.0f});
            ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(textView, propertyValuesHolderArr);
            kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "ObjectAnimator.ofPropert…NSLATION_X, -dx, 0f, 0f))");
            arrayList.add(ofPropertyValuesHolder);
            imageView = Rm.aRw;
            propertyValuesHolderArr = new PropertyValuesHolder[2];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f, 1.0f, 1.0f});
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{this.aOG, 0.0f, 0.0f});
            ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, propertyValuesHolderArr);
            String str = "ObjectAnimator.ofPropert…ANSLATION_X, dx, 0f, 0f))";
            kotlin.jvm.internal.i.e(ofPropertyValuesHolder, str);
            arrayList.add(ofPropertyValuesHolder);
            textView = Rm.aRx;
            PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[2];
            propertyValuesHolderArr2[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f, 1.0f, 1.0f});
            propertyValuesHolderArr2[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{this.aOG, 0.0f, 0.0f});
            ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(textView, propertyValuesHolderArr2);
            kotlin.jvm.internal.i.e(ofPropertyValuesHolder, str);
            arrayList.add(ofPropertyValuesHolder);
            return arrayList;
        }

        private final List<Animator> b(ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4) {
            ObjectAnimator ofFloat;
            List arrayList = new ArrayList();
            String str = "ObjectAnimator.ofFloat(d…View, View.ALPHA, 1f, 0f)";
            if (imageView != null) {
                if (this.aOH.isEmpty()) {
                    this.aOH.set(com.iqoption.core.ext.a.ah(imageView2));
                }
                c a = a(imageView, imageView2);
                if (a != null) {
                    arrayList.addAll(a(imageView2, a.Rc()));
                } else {
                    ofFloat = ObjectAnimator.ofFloat(imageView2, View.ALPHA, new float[]{1.0f, 0.0f});
                    kotlin.jvm.internal.i.e(ofFloat, str);
                    arrayList.add(ofFloat);
                }
            } else {
                ofFloat = ObjectAnimator.ofFloat(imageView2, View.ALPHA, new float[]{1.0f, 0.0f});
                kotlin.jvm.internal.i.e(ofFloat, str);
                arrayList.add(ofFloat);
            }
            if (imageView3 != null) {
                if (this.aOI.isEmpty()) {
                    this.aOI.set(com.iqoption.core.ext.a.ah(imageView4));
                }
                arrayList.addAll(b(imageView4, b(imageView3).Rc()));
            } else {
                PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
                propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f, 0.0f});
                propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f, this.aOG});
                ofFloat = ObjectAnimator.ofPropertyValuesHolder(imageView4, propertyValuesHolderArr);
                kotlin.jvm.internal.i.e(ofFloat, "ObjectAnimator.ofPropert…w.TRANSLATION_X, 0f, dx))");
                arrayList.add(ofFloat);
            }
            return arrayList;
        }

        /* renamed from: b */
        public List<Animator> bD(s sVar) {
            ImageView imageView;
            PropertyValuesHolder[] propertyValuesHolderArr;
            ObjectAnimator ofPropertyValuesHolder;
            kotlin.jvm.internal.i.f(sVar, "info");
            List arrayList = new ArrayList();
            ag Rm = sVar.Rm();
            View root = Rm.getRoot();
            kotlin.jvm.internal.i.e(root, "root");
            Drawable background = root.getBackground();
            if (!(background instanceof com.iqoption.core.graphics.a.e)) {
                background = null;
            }
            com.iqoption.core.graphics.a.e eVar = (com.iqoption.core.graphics.a.e) background;
            if (eVar != null) {
                ObjectAnimator ofInt = ObjectAnimator.ofInt(eVar, com.iqoption.core.graphics.animation.c.bhK.XE(), new int[]{255, 0});
                kotlin.jvm.internal.i.e(ofInt, "ObjectAnimator.ofInt(it, Drawables.ALPHA, 255, 0)");
                arrayList.add(ofInt);
            }
            if (((Boolean) sVar.Rl().invoke()).booleanValue()) {
                imageView = Rm.aQL;
                propertyValuesHolderArr = new PropertyValuesHolder[2];
                propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f, 0.0f});
                propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f, this.aOG});
                ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, propertyValuesHolderArr);
                kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "ObjectAnimator.ofPropert…w.TRANSLATION_X, 0f, dx))");
                arrayList.add(ofPropertyValuesHolder);
                ofPropertyValuesHolder = ObjectAnimator.ofFloat(Rm.aRy, View.ALPHA, new float[]{1.0f, 0.0f});
                kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "ObjectAnimator.ofFloat(pager, View.ALPHA, 1f, 0f)");
                arrayList.add(ofPropertyValuesHolder);
            } else {
                ImageView imageView2 = (ImageView) sVar.Ri().invoke();
                ImageView imageView3 = (ImageView) sVar.Rj().invoke();
                imageView = (ImageView) sVar.Rk().invoke();
                ImageView imageView4 = Rm.aQL;
                kotlin.jvm.internal.i.e(imageView4, "selector");
                arrayList.addAll(b(imageView2, imageView3, imageView, imageView4));
            }
            TextView textView = Rm.alH;
            propertyValuesHolderArr = new PropertyValuesHolder[2];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f, 0.0f, 0.0f});
            Property property = View.TRANSLATION_X;
            r9 = new float[3];
            float f = this.aOG;
            r9[1] = -f;
            r9[2] = -f;
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(property, r9);
            ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(textView, propertyValuesHolderArr);
            kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "ObjectAnimator.ofPropert…SLATION_X, 0f, -dx, -dx))");
            arrayList.add(ofPropertyValuesHolder);
            imageView = Rm.aRw;
            propertyValuesHolderArr = new PropertyValuesHolder[2];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f, 0.0f, 0.0f});
            property = View.TRANSLATION_X;
            r9 = new float[3];
            f = this.aOG;
            r9[1] = f;
            r9[2] = f;
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(property, r9);
            ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, propertyValuesHolderArr);
            String str = "ObjectAnimator.ofPropert…ANSLATION_X, 0f, dx, dx))";
            kotlin.jvm.internal.i.e(ofPropertyValuesHolder, str);
            arrayList.add(ofPropertyValuesHolder);
            textView = Rm.aRx;
            PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[2];
            propertyValuesHolderArr2[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f, 0.0f, 0.0f});
            property = View.TRANSLATION_X;
            r8 = new float[3];
            float f2 = this.aOG;
            r8[1] = f2;
            r8[2] = f2;
            propertyValuesHolderArr2[1] = PropertyValuesHolder.ofFloat(property, r8);
            ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(textView, propertyValuesHolderArr2);
            kotlin.jvm.internal.i.e(ofPropertyValuesHolder, str);
            arrayList.add(ofPropertyValuesHolder);
            return arrayList;
        }
    }

    public r(s sVar) {
        kotlin.jvm.internal.i.f(sVar, "info");
        super(sVar);
        a(new AnonymousClass1(sVar));
    }
}
