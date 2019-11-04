package com.iqoption.feed.feedlist;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.iqoption.feed.feedlist.a.d;
import com.iqoption.feed.feedlist.b.e;
import com.iqoption.feed.j.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: FeedAdapter */
public class c extends Adapter<h> {
    private final a cQD;
    private final b cQL;
    private e cQM;
    private f cQN;
    @NonNull
    private final Map<Integer, com.iqoption.asset.mediators.a> cQO = new HashMap();
    private final List<d> iA = new ArrayList();

    /* compiled from: FeedAdapter */
    public interface a extends TagLayout.b {
        void a(View view, d dVar);

        void e(com.iqoption.core.microservices.feed.response.a aVar);

        void f(@NonNull com.iqoption.core.microservices.feed.response.a aVar);

        boolean l(d dVar);
    }

    public c(b bVar, a aVar) {
        this.cQD = aVar;
        setHasStableIds(true);
        this.cQL = bVar;
    }

    @NonNull
    /* renamed from: D */
    public h onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return this.cQN.E(viewGroup, i);
    }

    /* renamed from: a */
    public void onBindViewHolder(@NonNull h hVar, int i) {
        this.cQM.a(hVar, (d) this.iA.get(i), getItemViewType(i));
    }

    public int getItemCount() {
        return this.iA.size();
    }

    public int getItemViewType(int i) {
        com.iqoption.core.microservices.feed.response.a YQ = ((d) this.iA.get(i)).YQ();
        String type = YQ.getType();
        if ("video".equals(type)) {
            return "YouTube".equals(YQ.getSource()) ? 1 : 2;
        } else if ("tweet".equals(type)) {
            return 4;
        } else {
            return "article".equals(type) ? 3 : -1;
        }
    }

    public long getItemId(int i) {
        return (long) ((d) this.iA.get(i)).YQ().getId();
    }

    public void di(boolean z) {
        if (z) {
            this.cQM = new com.iqoption.feed.feedlist.a.b();
            this.cQN = new d(this.cQL, this.cQD);
            return;
        }
        this.cQM = new com.iqoption.feed.feedlist.b.b();
        this.cQN = new e(this.cQL, this.cQD);
    }

    public void a(List<com.iqoption.core.microservices.feed.response.a> list, @NonNull Set<Integer> set, @NonNull Map<Integer, com.iqoption.asset.mediators.a> map) {
        this.iA.clear();
        this.iA.addAll(a((List) list, (Set) set));
        this.cQO.clear();
        this.cQO.putAll(map);
        notifyDataSetChanged();
    }

    public void b(List<com.iqoption.core.microservices.feed.response.a> list, @NonNull Set<Integer> set, @NonNull Map<Integer, com.iqoption.asset.mediators.a> map) {
        int size = this.iA.size();
        this.iA.addAll(a((List) list, (Set) set));
        this.cQO.putAll(map);
        notifyItemRangeInserted(size, list.size());
    }

    @NonNull
    private List<d> a(@NonNull List<com.iqoption.core.microservices.feed.response.a> list, @NonNull Set<Integer> set) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            com.iqoption.core.microservices.feed.response.a aVar = (com.iqoption.core.microservices.feed.response.a) list.get(i);
            com.iqoption.asset.mediators.a aVar2 = null;
            com.iqoption.core.microservices.feed.response.c adN = aVar.adN();
            if (adN != null) {
                aVar2 = (com.iqoption.asset.mediators.a) this.cQO.get(Integer.valueOf(adN.Bs()));
            }
            arrayList.add(new d(aVar, set.contains(Integer.valueOf(aVar.getId())), aVar2));
        }
        return arrayList;
    }

    public int n(d dVar) {
        int indexOf = this.iA.indexOf(dVar);
        if (indexOf != -1) {
            this.iA.remove(dVar);
            notifyItemRemoved(indexOf);
        }
        return indexOf;
    }

    public void a(d dVar, int i) {
        if (i >= this.iA.size()) {
            this.iA.add(dVar);
            notifyItemInserted(this.iA.size() - 1);
            return;
        }
        this.iA.add(i, dVar);
        notifyItemInserted(i);
    }

    public void E(Map<Integer, com.iqoption.core.microservices.feed.response.d> map) {
        for (int i = 0; i < this.iA.size(); i++) {
            com.iqoption.core.microservices.feed.response.a YQ = ((d) this.iA.get(i)).YQ();
            com.iqoption.core.microservices.feed.response.d dVar = (com.iqoption.core.microservices.feed.response.d) map.get(Integer.valueOf(YQ.getId()));
            if (dVar != null) {
                com.iqoption.feed.e.cOv.a(YQ, dVar);
                notifyItemChanged(i);
            }
        }
    }

    public void o(d dVar) {
        int indexOf = this.iA.indexOf(dVar);
        if (indexOf != -1) {
            notifyItemChanged(indexOf);
        }
    }
}
