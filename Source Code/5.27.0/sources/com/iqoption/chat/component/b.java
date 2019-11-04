package com.iqoption.chat.component;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.chat.a.c;
import com.iqoption.chat.e;
import com.iqoption.core.ext.g;
import com.squareup.picasso.Picasso;
import kotlin.f.d;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.l;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0002\u0010\fJ\u0016\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R+\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b8B@BX\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0007X\u0004¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, bng = {"Lcom/iqoption/chat/component/AttachmentPreviewViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "picasso", "Lcom/squareup/picasso/Picasso;", "binding", "Lcom/iqoption/chat/databinding/ChatAttachmentImageItemBinding;", "onSelectorClick", "Lkotlin/Function2;", "Lcom/iqoption/chat/viewmodel/AttachmentPreview;", "", "onPreviewClick", "", "(Lcom/squareup/picasso/Picasso;Lcom/iqoption/chat/databinding/ChatAttachmentImageItemBinding;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "<set-?>", "boundPreview", "getBoundPreview", "()Lcom/iqoption/chat/viewmodel/AttachmentPreview;", "setBoundPreview", "(Lcom/iqoption/chat/viewmodel/AttachmentPreview;)V", "boundPreview$delegate", "Lkotlin/properties/ReadWriteProperty;", "bind", "preview", "isHidden", "chat_release"})
/* compiled from: AttachmentPreviewsAdapter.kt */
public final class b extends ViewHolder {
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(b.class), "boundPreview", "getBoundPreview()Lcom/iqoption/chat/viewmodel/AttachmentPreview;"))};
    private final d aOs = kotlin.f.a.eWg.bnQ();
    private final c aOt;
    private final m<c, com.iqoption.chat.viewmodel.b, Boolean> aOu;
    private final m<c, com.iqoption.chat.viewmodel.b, l> aOv;
    private final Picasso picasso;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a extends g {
        final /* synthetic */ b aOw;

        public a(b bVar) {
            this.aOw = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            if (((Boolean) this.aOw.aOu.w(this.aOw.aOt, this.aOw.QW())).booleanValue()) {
                ImageView imageView = this.aOw.aOt.aQL;
                imageView.setSelected(imageView.isSelected() ^ 1);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends g {
        final /* synthetic */ b aOw;

        public b(b bVar) {
            this.aOw = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.aOw.aOv.w(this.aOw.aOt, this.aOw.QW());
        }
    }

    private final com.iqoption.chat.viewmodel.b QW() {
        return (com.iqoption.chat.viewmodel.b) this.aOs.b(this, anY[0]);
    }

    private final void a(com.iqoption.chat.viewmodel.b bVar) {
        this.aOs.a(this, anY[0], bVar);
    }

    public b(Picasso picasso, c cVar, m<? super c, ? super com.iqoption.chat.viewmodel.b, Boolean> mVar, m<? super c, ? super com.iqoption.chat.viewmodel.b, l> mVar2) {
        kotlin.jvm.internal.i.f(picasso, "picasso");
        kotlin.jvm.internal.i.f(cVar, "binding");
        kotlin.jvm.internal.i.f(mVar, "onSelectorClick");
        kotlin.jvm.internal.i.f(mVar2, "onPreviewClick");
        super(cVar.getRoot());
        this.picasso = picasso;
        this.aOt = cVar;
        this.aOu = mVar;
        this.aOv = mVar2;
        ImageView imageView = this.aOt.aQL;
        kotlin.jvm.internal.i.e(imageView, "binding.selector");
        imageView.setOnClickListener(new a(this));
        imageView = this.aOt.aQK;
        kotlin.jvm.internal.i.e(imageView, "binding.preview");
        imageView.setOnClickListener(new b(this));
    }

    public final void a(com.iqoption.chat.viewmodel.b bVar, boolean z) {
        kotlin.jvm.internal.i.f(bVar, "preview");
        a(bVar);
        View view = this.itemView;
        kotlin.jvm.internal.i.e(view, "itemView");
        view.setTag(bVar);
        String str = "binding.preview";
        String str2 = "binding.selector";
        ImageView imageView;
        if (z) {
            imageView = this.aOt.aQK;
            kotlin.jvm.internal.i.e(imageView, str);
            com.iqoption.core.ext.a.hide(imageView);
            imageView = this.aOt.aQL;
            kotlin.jvm.internal.i.e(imageView, str2);
            com.iqoption.core.ext.a.hide(imageView);
        } else {
            imageView = this.aOt.aQK;
            kotlin.jvm.internal.i.e(imageView, str);
            com.iqoption.core.ext.a.ak(imageView);
            imageView = this.aOt.aQL;
            kotlin.jvm.internal.i.e(imageView, str2);
            com.iqoption.core.ext.a.ak(imageView);
        }
        this.picasso.load(bVar.fI()).resizeDimen(e.d.dp106, e.d.dp106).centerCrop().into(this.aOt.aQK);
        ImageView imageView2 = this.aOt.aQL;
        kotlin.jvm.internal.i.e(imageView2, str2);
        imageView2.setSelected(QW().isSelected());
    }
}
