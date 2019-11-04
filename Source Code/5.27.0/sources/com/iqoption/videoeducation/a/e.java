package com.iqoption.videoeducation.a;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.iqoption.core.ext.g;
import com.iqoption.e.aaj;
import com.iqoption.videoeducation.f;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, bng = {"Lcom/iqoption/videoeducation/component/VideoCatalogViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/VideoEducationSimpleCategoryItemBinding;", "Lcom/iqoption/videoeducation/VideoCatalogItem;", "callback", "Lcom/iqoption/videoeducation/component/VideoCatalogViewHolder$Callback;", "imageWidth", "", "imageHeight", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/videoeducation/component/VideoCatalogViewHolder$Callback;IILandroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "bind", "", "item", "Callback", "app_optionXRelease"})
/* compiled from: VideoCatalogViewHolder.kt */
public final class e extends com.iqoption.core.ui.widget.recyclerview.a.e<aaj, f> {
    private final b edn;
    private final int imageHeight;
    private final int imageWidth;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/videoeducation/component/VideoCatalogViewHolder$Callback;", "", "onItemClick", "", "item", "Lcom/iqoption/videoeducation/VideoCatalogItem;", "app_optionXRelease"})
    /* compiled from: VideoCatalogViewHolder.kt */
    public interface b {
        void onItemClick(f fVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a extends g {
        final /* synthetic */ e edo;

        public a(e eVar) {
            this.edo = eVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            f fVar = (f) this.edo.and();
            if (fVar != null) {
                this.edo.edn.onItemClick(fVar);
            }
        }
    }

    public e(b bVar, int i, int i2, ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar) {
        kotlin.jvm.internal.i.f(bVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar, "data");
        super(R.layout.video_education_simple_category_item, viewGroup, aVar);
        this.edn = bVar;
        this.imageWidth = i;
        this.imageHeight = i2;
        ConstraintLayout constraintLayout = ((aaj) getBinding()).aIv;
        kotlin.jvm.internal.i.e(constraintLayout, "binding.content");
        constraintLayout.setOnClickListener(new a(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0087  */
    public void a(com.iqoption.e.aaj r4, com.iqoption.videoeducation.f r5) {
        /*
        r3 = this;
        r0 = "$this$bind";
        kotlin.jvm.internal.i.f(r4, r0);
        r0 = "item";
        kotlin.jvm.internal.i.f(r5, r0);
        r0 = r5.aWd();
        if (r0 == 0) goto L_0x0042;
    L_0x0010:
        r0 = (java.lang.CharSequence) r0;
        r0 = r0.length();
        if (r0 <= 0) goto L_0x001a;
    L_0x0018:
        r0 = 1;
        goto L_0x001b;
    L_0x001a:
        r0 = 0;
    L_0x001b:
        if (r0 == 0) goto L_0x0042;
    L_0x001d:
        r0 = r4.De;
        r1 = "image";
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = r0.getContext();
        r0 = com.squareup.picasso.Picasso.with(r0);
        r1 = r5.aWd();
        r0 = r0.load(r1);
        r1 = r3.imageWidth;
        r2 = r3.imageHeight;
        r0 = r0.resize(r1, r2);
        r1 = r4.De;
        r0.into(r1);
        goto L_0x0048;
    L_0x0042:
        r0 = r4.De;
        r1 = 0;
        r0.setImageDrawable(r1);
    L_0x0048:
        r0 = r4.alH;
        r1 = "title";
        kotlin.jvm.internal.i.e(r0, r1);
        r1 = r5.getTitle();
        r1 = (java.lang.CharSequence) r1;
        r0.setText(r1);
        r0 = r5.aXg();
        r1 = "videoCount";
        if (r0 == 0) goto L_0x0075;
    L_0x0060:
        r2 = r4.cuC;
        kotlin.jvm.internal.i.e(r2, r1);
        r0 = (java.lang.CharSequence) r0;
        r2.setText(r0);
        r0 = r4.cuC;
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = (android.view.View) r0;
        com.iqoption.core.ext.a.ak(r0);
        goto L_0x007f;
    L_0x0075:
        r0 = r4.cuC;
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = (android.view.View) r0;
        com.iqoption.core.ext.a.al(r0);
    L_0x007f:
        r5 = r5.aXh();
        r0 = "newVideoCount";
        if (r5 == 0) goto L_0x009c;
    L_0x0087:
        r1 = r4.cuB;
        kotlin.jvm.internal.i.e(r1, r0);
        r5 = (java.lang.CharSequence) r5;
        r1.setText(r5);
        r4 = r4.cuB;
        kotlin.jvm.internal.i.e(r4, r0);
        r4 = (android.view.View) r4;
        com.iqoption.core.ext.a.ak(r4);
        goto L_0x00a6;
    L_0x009c:
        r4 = r4.cuB;
        kotlin.jvm.internal.i.e(r4, r0);
        r4 = (android.view.View) r4;
        com.iqoption.core.ext.a.al(r4);
    L_0x00a6:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.videoeducation.a.e.a(com.iqoption.e.aaj, com.iqoption.videoeducation.f):void");
    }
}
