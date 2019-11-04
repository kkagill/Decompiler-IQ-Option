package com.iqoption.newsandupdates;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.iqoption.core.ext.a;
import com.iqoption.e.tb;
import com.iqoption.x.R;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\u0014\u0010\u0018\u001a\u00020\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, bng = {"Lcom/iqoption/newsandupdates/NewsAndUpdatesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/iqoption/newsandupdates/Holder;", "context", "Landroid/content/Context;", "listener", "Lcom/iqoption/newsandupdates/Listener;", "(Landroid/content/Context;Lcom/iqoption/newsandupdates/Listener;)V", "getContext", "()Landroid/content/Context;", "items", "", "Lcom/iqoption/newsandupdates/NewsAndUpdatesItem;", "getItemCount", "", "item", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "app_optionXRelease"})
/* compiled from: NewsAndUpdatesAdapter.kt */
public final class c extends Adapter<a> {
    private final Context context;
    private final b dJF;
    private List<f> iA = m.emptyList();

    public c(Context context, b bVar) {
        kotlin.jvm.internal.i.f(context, "context");
        kotlin.jvm.internal.i.f(bVar, CastExtraArgs.LISTENER);
        this.context = context;
        this.dJF = bVar;
    }

    public int getItemCount() {
        return this.iA.size();
    }

    private final f gw(int i) {
        return (f) this.iA.get(i);
    }

    /* renamed from: O */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        return new a((tb) a.a(viewGroup, (int) R.layout.news_and_updates_item, null, false, 6, null), this.dJF);
    }

    /* renamed from: a */
    public void onBindViewHolder(a aVar, int i) {
        kotlin.jvm.internal.i.f(aVar, "holder");
        aVar.a(gw(i));
    }

    public final void L(List<f> list) {
        kotlin.jvm.internal.i.f(list, "items");
        this.iA = list;
        notifyDataSetChanged();
    }
}
