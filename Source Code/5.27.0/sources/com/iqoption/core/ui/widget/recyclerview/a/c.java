package com.iqoption.core.ui.widget.recyclerview.a;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000fJ%\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u00002\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018H\u0016¢\u0006\u0002\u0010\u001aR.\u0010\t\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u00008F@FX\u000e¢\u0006\u0012\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, bng = {"Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "Item", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Landroid/view/View;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "value", "bound", "bound$annotations", "()V", "getBound", "()Ljava/lang/Object;", "setBound", "(Ljava/lang/Object;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "bind", "", "item", "payloads", "", "", "(Ljava/lang/Object;Ljava/util/List;)V", "core_release"})
/* compiled from: IQViewHolder.kt */
public abstract class c<Item> extends ViewHolder {
    private final a bPw;

    public abstract void bB(Item item);

    public /* synthetic */ c(View view, a aVar, int i, f fVar) {
        if ((i & 2) != 0) {
            aVar = (a) null;
        }
        this(view, aVar);
    }

    public c(View view, a aVar) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super(view);
        this.bPw = aVar;
    }

    public final Item and() {
        a aVar = this.bPw;
        Item item = aVar != null ? aVar.get(getAdapterPosition()) : null;
        return !(item instanceof Object) ? null : item;
    }

    public final void bV(Item item) {
        if (item != null) {
            bB(item);
        }
    }

    public final Context getContext() {
        View view = this.itemView;
        kotlin.jvm.internal.i.e(view, "itemView");
        Context context = view.getContext();
        kotlin.jvm.internal.i.e(context, "itemView.context");
        return context;
    }

    public void a(Item item, List<? extends Object> list) {
        kotlin.jvm.internal.i.f(list, "payloads");
        bB(item);
    }
}
