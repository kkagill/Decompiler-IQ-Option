package com.iqoption.videoeducation.a;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.e.aan;
import com.iqoption.videoeducation.m;
import com.iqoption.x.R;
import com.squareup.picasso.Transformation;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/videoeducation/component/VideoItemViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/databinding/VideoEducationVideoItemBinding;", "Lcom/iqoption/videoeducation/VideoItem;", "callback", "Lcom/iqoption/videoeducation/component/VideoItemViewHolder$Callback;", "imageSize", "Lcom/iqoption/core/graphics/Size;", "transformation", "Lcom/squareup/picasso/Transformation;", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/videoeducation/component/VideoItemViewHolder$Callback;Lcom/iqoption/core/graphics/Size;Lcom/squareup/picasso/Transformation;Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "bind", "", "item", "Callback", "app_optionXRelease"})
/* compiled from: VideoItemViewHolder.kt */
public final class h extends e<aan, m> {
    private final b eds;
    private final com.iqoption.core.graphics.b edt;
    private final Transformation edu;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, bng = {"Lcom/iqoption/videoeducation/component/VideoItemViewHolder$Callback;", "", "onItemClick", "", "item", "Lcom/iqoption/videoeducation/VideoItem;", "position", "", "app_optionXRelease"})
    /* compiled from: VideoItemViewHolder.kt */
    public interface b {
        void a(m mVar, int i);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a extends g {
        final /* synthetic */ h edv;

        public a(h hVar) {
            this.edv = hVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            Integer valueOf = Integer.valueOf(this.edv.getAdapterPosition());
            if ((((Number) valueOf).intValue() != -1 ? 1 : null) == null) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                m mVar = (m) this.edv.and();
                if (mVar != null) {
                    this.edv.eds.a(mVar, intValue);
                }
            }
        }
    }

    public h(b bVar, com.iqoption.core.graphics.b bVar2, Transformation transformation, ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar) {
        kotlin.jvm.internal.i.f(bVar, "callback");
        kotlin.jvm.internal.i.f(bVar2, "imageSize");
        kotlin.jvm.internal.i.f(transformation, "transformation");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar, "data");
        super(R.layout.video_education_video_item, viewGroup, aVar);
        this.eds = bVar;
        this.edt = bVar2;
        this.edu = transformation;
        ImageView imageView = ((aan) getBinding()).De;
        kotlin.jvm.internal.i.e(imageView, "binding.image");
        LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = this.edt.getWidth();
        layoutParams.height = this.edt.getHeight();
        View view = this.itemView;
        kotlin.jvm.internal.i.e(view, "itemView");
        view.setOnClickListener(new a(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0096  */
    public void a(com.iqoption.e.aan r5, com.iqoption.videoeducation.m r6) {
        /*
        r4 = this;
        r0 = "$this$bind";
        kotlin.jvm.internal.i.f(r5, r0);
        r0 = "item";
        kotlin.jvm.internal.i.f(r6, r0);
        r0 = r6.aXu();
        r1 = r0.ajl();
        if (r1 == 0) goto L_0x0055;
    L_0x0014:
        r2 = r1;
        r2 = (java.lang.CharSequence) r2;
        r2 = r2.length();
        if (r2 <= 0) goto L_0x001f;
    L_0x001d:
        r2 = 1;
        goto L_0x0020;
    L_0x001f:
        r2 = 0;
    L_0x0020:
        if (r2 == 0) goto L_0x0055;
    L_0x0022:
        r2 = r5.De;
        r3 = "image";
        kotlin.jvm.internal.i.e(r2, r3);
        r2 = r2.getContext();
        r2 = com.squareup.picasso.Picasso.with(r2);
        r1 = r2.load(r1);
        r2 = r4.edt;
        r2 = r2.getWidth();
        r3 = r4.edt;
        r3 = r3.getHeight();
        r1 = r1.resize(r2, r3);
        r1 = r1.centerCrop();
        r2 = r4.edu;
        r1 = r1.transform(r2);
        r2 = r5.De;
        r1.into(r2);
        goto L_0x005b;
    L_0x0055:
        r1 = r5.De;
        r2 = 0;
        r1.setImageDrawable(r2);
    L_0x005b:
        r1 = r0.ajr();
        r2 = "watchedLabel";
        r3 = "contentLayout";
        if (r1 == 0) goto L_0x007a;
    L_0x0065:
        r1 = r5.aRl;
        kotlin.jvm.internal.i.e(r1, r3);
        r3 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r1.setAlpha(r3);
        r1 = r5.cuF;
        kotlin.jvm.internal.i.e(r1, r2);
        r1 = (android.view.View) r1;
        com.iqoption.core.ext.a.ak(r1);
        goto L_0x008e;
    L_0x007a:
        r1 = r5.aRl;
        kotlin.jvm.internal.i.e(r1, r3);
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1.setAlpha(r3);
        r1 = r5.cuF;
        kotlin.jvm.internal.i.e(r1, r2);
        r1 = (android.view.View) r1;
        com.iqoption.core.ext.a.al(r1);
    L_0x008e:
        r1 = r0.ajq();
        r2 = "newLabel";
        if (r1 == 0) goto L_0x00a1;
    L_0x0096:
        r1 = r5.cuE;
        kotlin.jvm.internal.i.e(r1, r2);
        r1 = (android.view.View) r1;
        com.iqoption.core.ext.a.ak(r1);
        goto L_0x00ab;
    L_0x00a1:
        r1 = r5.cuE;
        kotlin.jvm.internal.i.e(r1, r2);
        r1 = (android.view.View) r1;
        com.iqoption.core.ext.a.al(r1);
    L_0x00ab:
        r1 = r5.alH;
        r2 = "title";
        kotlin.jvm.internal.i.e(r1, r2);
        r0 = r0.On();
        r0 = (java.lang.CharSequence) r0;
        r1.setText(r0);
        r5 = r5.cuD;
        r0 = "duration";
        kotlin.jvm.internal.i.e(r5, r0);
        r6 = r6.aXv();
        r6 = (java.lang.CharSequence) r6;
        r5.setText(r6);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.videoeducation.a.h.a(com.iqoption.e.aan, com.iqoption.videoeducation.m):void");
    }
}
