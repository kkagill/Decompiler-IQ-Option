package com.iqoption.chat.fragment;

import android.graphics.Bitmap;
import com.squareup.picasso.Transformation;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"getTransformation", "Lcom/squareup/picasso/Transformation;", "invoke"})
/* compiled from: ImagePreviewSliderFragment.kt */
final class ImagePreviewSliderFragment$getDisplayer$2 extends Lambda implements a<Transformation> {
    final /* synthetic */ ImagePreviewSliderFragment$getDisplayer$1 $getSize$1;
    final /* synthetic */ float $scale;
    final /* synthetic */ ObjectRef $transformation;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, bng = {"com/iqoption/chat/fragment/ImagePreviewSliderFragment$getDisplayer$2$1", "Lcom/squareup/picasso/Transformation;", "key", "", "transform", "Landroid/graphics/Bitmap;", "source", "chat_release"})
    /* compiled from: ImagePreviewSliderFragment.kt */
    /* renamed from: com.iqoption.chat.fragment.ImagePreviewSliderFragment$getDisplayer$2$1 */
    public static final class AnonymousClass1 implements Transformation {
        final /* synthetic */ ImagePreviewSliderFragment$getDisplayer$2 aTE;

        AnonymousClass1(ImagePreviewSliderFragment$getDisplayer$2 imagePreviewSliderFragment$getDisplayer$2) {
            this.aTE = imagePreviewSliderFragment$getDisplayer$2;
        }

        public String key() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("scale:");
            stringBuilder.append(this.aTE.$scale);
            return stringBuilder.toString();
        }

        public Bitmap transform(Bitmap bitmap) {
            kotlin.jvm.internal.i.f(bitmap, "source");
            c St = this.aTE.$getSize$1.invoke();
            return com.iqoption.core.ext.a.a(bitmap, St.Sq(), St.Sr(), false, 4, null);
        }
    }

    ImagePreviewSliderFragment$getDisplayer$2(ObjectRef objectRef, float f, ImagePreviewSliderFragment$getDisplayer$1 imagePreviewSliderFragment$getDisplayer$1) {
        this.$transformation = objectRef;
        this.$scale = f;
        this.$getSize$1 = imagePreviewSliderFragment$getDisplayer$1;
        super(0);
    }

    /* renamed from: Su */
    public final Transformation invoke() {
        Transformation transformation = (Transformation) this.$transformation.element;
        if (transformation != null) {
            return transformation;
        }
        transformation = new AnonymousClass1(this);
        this.$transformation.element = transformation;
        return transformation;
    }
}
