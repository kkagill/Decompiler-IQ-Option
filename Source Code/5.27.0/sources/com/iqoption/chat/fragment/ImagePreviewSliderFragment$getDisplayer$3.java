package com.iqoption.chat.fragment;

import com.squareup.picasso.RequestCreator;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<no name provided>", "Lcom/squareup/picasso/RequestCreator;", "preview", "Lcom/iqoption/chat/viewmodel/AttachmentPreview;", "invoke"})
/* compiled from: ImagePreviewSliderFragment.kt */
final class ImagePreviewSliderFragment$getDisplayer$3 extends Lambda implements b<com.iqoption.chat.viewmodel.b, RequestCreator> {
    final /* synthetic */ ImagePreviewSliderFragment$getDisplayer$1 $getSize$1;
    final /* synthetic */ ImagePreviewSliderFragment$getDisplayer$2 $getTransformation$2;
    final /* synthetic */ float $scale;
    final /* synthetic */ l this$0;

    ImagePreviewSliderFragment$getDisplayer$3(l lVar, ImagePreviewSliderFragment$getDisplayer$1 imagePreviewSliderFragment$getDisplayer$1, float f, ImagePreviewSliderFragment$getDisplayer$2 imagePreviewSliderFragment$getDisplayer$2) {
        this.this$0 = lVar;
        this.$getSize$1 = imagePreviewSliderFragment$getDisplayer$1;
        this.$scale = f;
        this.$getTransformation$2 = imagePreviewSliderFragment$getDisplayer$2;
        super(1);
    }

    /* renamed from: h */
    public final RequestCreator invoke(com.iqoption.chat.viewmodel.b bVar) {
        kotlin.jvm.internal.i.f(bVar, "preview");
        c St = this.$getSize$1.invoke();
        RequestCreator centerInside = this.this$0.getPicasso().load(bVar.fI()).resize(St.Sq(), St.Sr()).centerInside();
        if (this.$scale != 1.0f) {
            centerInside.transform(this.$getTransformation$2.invoke());
        }
        kotlin.jvm.internal.i.e(centerInside, "creator");
        return centerInside;
    }
}
