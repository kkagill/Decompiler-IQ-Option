package com.iqoption.videoeducation.a;

import android.view.ViewGroup;
import com.iqoption.core.ui.widget.recyclerview.a.c;
import com.iqoption.core.ui.widget.recyclerview.adapter.a.d;
import com.iqoption.videoeducation.m;
import kotlin.TypeCastException;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0016\u0017B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u001c\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, bng = {"Lcom/iqoption/videoeducation/component/VideoItemsAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "Lcom/iqoption/videoeducation/VideoAdapterItem;", "imageSize", "Lcom/iqoption/core/graphics/Size;", "imageRoundRadius", "", "callbacks", "Lcom/iqoption/videoeducation/component/VideoItemsAdapter$Callbacks;", "(Lcom/iqoption/core/graphics/Size;ILcom/iqoption/videoeducation/component/VideoItemsAdapter$Callbacks;)V", "transformation", "Lcom/iqoption/core/ui/picasso/RoundedRectTransformation;", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Callbacks", "Companion", "app_optionXRelease"})
/* compiled from: VideoItemsAdapter.kt */
public final class i extends com.iqoption.core.ui.widget.recyclerview.adapter.a<c<?>, com.iqoption.videoeducation.c> {
    public static final b edy = new b();
    private final com.iqoption.core.graphics.b edt;
    private final com.iqoption.core.ui.picasso.c edw;
    private final a edx;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/videoeducation/component/VideoItemsAdapter$Companion;", "", "()V", "VIEW_TYPE_EMPTY", "", "VIEW_TYPE_ITEM", "app_optionXRelease"})
    /* compiled from: VideoItemsAdapter.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, bng = {"Lcom/iqoption/videoeducation/component/VideoItemsAdapter$Callbacks;", "Lcom/iqoption/videoeducation/component/VideoItemViewHolder$Callback;", "app_optionXRelease"})
    /* compiled from: VideoItemsAdapter.kt */
    public interface a extends com.iqoption.videoeducation.a.h.b {
    }

    public i(com.iqoption.core.graphics.b bVar, int i, a aVar) {
        kotlin.jvm.internal.i.f(bVar, "imageSize");
        kotlin.jvm.internal.i.f(aVar, "callbacks");
        this.edt = bVar;
        this.edx = aVar;
        this.edw = new com.iqoption.core.ui.picasso.c(i);
    }

    /* renamed from: f */
    public c<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        if (i == -1) {
            return new g(viewGroup);
        }
        if (i == 1) {
            return new h(this.edx, this.edt, this.edw, viewGroup, this);
        }
        com.iqoption.core.ui.widget.recyclerview.adapter.a.bPk.unsupportedViewType(i);
        throw null;
    }

    /* renamed from: a */
    public void onBindViewHolder(c<?> cVar, int i) {
        kotlin.jvm.internal.i.f(cVar, "holder");
        if (cVar.getItemViewType() == 1) {
            h hVar = (h) cVar;
            d fp = fp(i);
            if (fp != null) {
                hVar.bV((m) fp);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.videoeducation.VideoItem");
        }
    }

    public int getItemViewType(int i) {
        return fp(i) instanceof m ? 1 : -1;
    }
}
