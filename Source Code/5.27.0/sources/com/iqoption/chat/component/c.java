package com.iqoption.chat.component;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil.DiffResult;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.iqoption.chat.e.h;
import com.iqoption.chat.viewmodel.b;
import com.iqoption.core.ext.a;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0002\u0010\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0010\u0010!\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010\"\u001a\u00020\t2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&J\u0016\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0007J\u000e\u0010*\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u0006R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0004X\u0004¢\u0006\u0002\n\u0000R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, bng = {"Lcom/iqoption/chat/component/AttachmentPreviewsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/iqoption/chat/component/AttachmentPreviewViewHolder;", "onSelectorClick", "Lkotlin/Function2;", "Lcom/iqoption/chat/databinding/ChatAttachmentImageItemBinding;", "Lcom/iqoption/chat/viewmodel/AttachmentPreview;", "", "onPreviewClick", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "hidden", "picasso", "Lcom/squareup/picasso/Picasso;", "previews", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getItemCount", "", "getItemId", "", "position", "getPicasso", "context", "Landroid/content/Context;", "onAttachedToRecyclerView", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onDetachedFromRecyclerView", "setData", "new", "", "diff", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "setHidden", "preview", "isHidden", "update", "chat_release"})
/* compiled from: AttachmentPreviewsAdapter.kt */
public final class c extends Adapter<b> {
    private final m<com.iqoption.chat.a.c, b, Boolean> aOu;
    private final m<com.iqoption.chat.a.c, b, l> aOv;
    private final List<b> aOx = new ArrayList();
    private b aOy;
    private RecyclerView alz;
    private Picasso picasso;

    public c(m<? super com.iqoption.chat.a.c, ? super b, Boolean> mVar, m<? super com.iqoption.chat.a.c, ? super b, l> mVar2) {
        kotlin.jvm.internal.i.f(mVar, "onSelectorClick");
        kotlin.jvm.internal.i.f(mVar2, "onPreviewClick");
        this.aOu = mVar;
        this.aOv = mVar2;
    }

    private final Picasso aY(Context context) {
        Picasso picasso = this.picasso;
        if (picasso != null) {
            return picasso;
        }
        picasso = Picasso.with(context);
        this.picasso = picasso;
        kotlin.jvm.internal.i.e(picasso, "Picasso.with(context).also { picasso = it }");
        return picasso;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        kotlin.jvm.internal.i.f(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.alz = recyclerView;
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        kotlin.jvm.internal.i.f(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.alz = (RecyclerView) null;
    }

    public long getItemId(int i) {
        return (long) ((b) this.aOx.get(i)).fI().hashCode();
    }

    public int getItemCount() {
        return this.aOx.size();
    }

    /* renamed from: o */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        kotlin.jvm.internal.i.e(context, "parent.context");
        return new b(aY(context), (com.iqoption.chat.a.c) a.a(viewGroup, h.chat_attachment_image_item, null, false, 6, null), this.aOu, this.aOv);
    }

    /* renamed from: a */
    public void onBindViewHolder(b bVar, int i) {
        kotlin.jvm.internal.i.f(bVar, "holder");
        b bVar2 = (b) this.aOx.get(i);
        bVar.a(bVar2, kotlin.jvm.internal.i.y(bVar2, this.aOy));
    }

    public static /* synthetic */ void a(c cVar, List list, DiffResult diffResult, int i, Object obj) {
        if ((i & 2) != 0) {
            diffResult = (DiffResult) null;
        }
        cVar.a(list, diffResult);
    }

    public final void a(List<b> list, DiffResult diffResult) {
        kotlin.jvm.internal.i.f(list, "new");
        com.iqoption.core.ext.c.b((Collection) this.aOx, (Collection) list);
        if (diffResult != null) {
            diffResult.dispatchUpdatesTo((Adapter) this);
        } else {
            notifyDataSetChanged();
        }
    }

    public final void b(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "preview");
        int indexOf = this.aOx.indexOf(bVar);
        if (indexOf != -1) {
            notifyItemChanged(indexOf);
        }
    }

    public final void b(b bVar, boolean z) {
        kotlin.jvm.internal.i.f(bVar, "preview");
        this.aOy = z ? bVar : null;
        b(bVar);
    }
}
