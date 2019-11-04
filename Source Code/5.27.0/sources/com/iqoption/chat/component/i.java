package com.iqoption.chat.component;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.chat.a.y;
import com.iqoption.chat.e.h;
import com.iqoption.chat.viewmodel.e;
import java.util.List;
import kotlin.jvm.a.b;
import kotlin.l;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015H\u0016R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, bng = {"Lcom/iqoption/chat/component/FileItemsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onSelect", "Lkotlin/Function1;", "Lcom/iqoption/chat/viewmodel/FileItem;", "", "(Lkotlin/jvm/functions/Function1;)V", "value", "", "isEmpty", "()Z", "setEmpty", "(Z)V", "", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getItemCount", "", "getItemId", "", "position", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "chat_release"})
/* compiled from: FileItemsAdapter.kt */
public final class i extends Adapter<ViewHolder> {
    public static final a aOF = new a();
    private final b<e, l> aOC;
    private boolean aOE;
    private List<e> iA = m.emptyList();

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/chat/component/FileItemsAdapter$Companion;", "", "()V", "VIEW_TYPE_EMPTY", "", "VIEW_TYPE_ITEM", "chat_release"})
    /* compiled from: FileItemsAdapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public i(b<? super e, l> bVar) {
        kotlin.jvm.internal.i.f(bVar, "onSelect");
        this.aOC = bVar;
        setHasStableIds(true);
    }

    public final void w(List<e> list) {
        kotlin.jvm.internal.i.f(list, ConditionalUserProperty.VALUE);
        this.iA = list;
        notifyDataSetChanged();
    }

    public final void ce(boolean z) {
        if (this.aOE != z) {
            this.aOE = z;
            notifyDataSetChanged();
        }
    }

    public long getItemId(int i) {
        if (this.aOE) {
            return 0;
        }
        return ((e) this.iA.get(i)).getId();
    }

    public int getItemViewType(int i) {
        return this.aOE ? 1 : 2;
    }

    public int getItemCount() {
        if (this.aOE) {
            return 1;
        }
        return this.iA.size();
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        if (i != 1) {
            return new h((y) com.iqoption.core.ext.a.a(viewGroup, h.chat_file_picker_item, null, false, 6, null), this.aOC);
        }
        return new g(com.iqoption.core.ext.a.a(viewGroup, h.chat_file_picker_empty_item, null, false, 6, null));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        kotlin.jvm.internal.i.f(viewHolder, "holder");
        if (viewHolder.getItemViewType() == 2) {
            ((h) viewHolder).b((e) this.iA.get(i));
        }
    }
}
