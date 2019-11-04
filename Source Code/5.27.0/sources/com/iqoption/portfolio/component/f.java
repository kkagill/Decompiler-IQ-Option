package com.iqoption.portfolio.component;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.google.common.collect.ImmutableList;
import com.iqoption.portfolio.component.b.i;
import com.iqoption.portfolio.component.viewholder.aj;
import com.iqoption.portfolio.fragment.e;
import com.iqoption.util.ae;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: OpenPositionsAdapter */
public final class f extends Adapter<aj> {
    private RecyclerView alz;
    private final n<aj, com.iqoption.portfolio.component.b.f, l> dLW;
    private final ArrayList<com.iqoption.portfolio.component.b.f> items = new ArrayList();

    /* compiled from: OpenPositionsAdapter */
    private static final class a {
        int count;
        int startPosition;

        private a() {
        }

        /* Access modifiers changed, original: 0000 */
        public a gH(int i) {
            this.startPosition = i;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public a gI(int i) {
            this.count = i;
            return this;
        }
    }

    public f(n<aj, com.iqoption.portfolio.component.b.f, l> nVar) {
        this.dLW = nVar;
        setHasStableIds(true);
    }

    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.alz = recyclerView;
    }

    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.alz = null;
    }

    @NonNull
    /* renamed from: P */
    public aj onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return (aj) this.dLW.b(i, viewGroup);
    }

    /* renamed from: a */
    public void onBindViewHolder(@NonNull aj ajVar, int i) {
        this.dLW.a(ajVar.getItemViewType(), ajVar, gF(i));
    }

    public int getItemCount() {
        return this.items.size();
    }

    public int getItemViewType(int i) {
        return gF(i).asd();
    }

    public long getItemId(int i) {
        return e.dMj.de(gF(i).Or());
    }

    public com.iqoption.portfolio.component.b.f gF(int i) {
        return (com.iqoption.portfolio.component.b.f) this.items.get(i);
    }

    public void w(List<com.iqoption.portfolio.component.b.f> list) {
        this.items.clear();
        if (list != null) {
            this.items.addAll(list);
        }
        notifyDataSetChanged();
    }

    public void aRi() {
        RecyclerView recyclerView = this.alz;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            gG(childCount);
            for (int i = 0; i < childCount; i++) {
                RecyclerView recyclerView2 = this.alz;
                ((aj) recyclerView2.getChildViewHolder(recyclerView2.getChildAt(i))).aRi();
            }
        }
    }

    private void gG(int i) {
        if (getItemCount() != i && i > 1) {
            ArrayList<Integer> arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                RecyclerView recyclerView = this.alz;
                arrayList.add(Integer.valueOf(recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i2))));
            }
            Collections.sort(arrayList);
            i = getItemCount() - 1;
            ArrayList<a> arrayList2 = new ArrayList();
            int i3 = -1;
            for (Integer num : arrayList) {
                if (i3 == -1) {
                    arrayList2.add(new a().gH(0).gI(num.intValue()));
                } else if (num.intValue() - i3 > 1) {
                    arrayList2.add(new a().gH(i3 + 1).gI((num.intValue() - i3) - 1));
                }
                i3 = num.intValue();
            }
            if (!arrayList2.isEmpty()) {
                int intValue = ((Integer) arrayList.get(arrayList.size() - 1)).intValue();
                if (intValue < i) {
                    arrayList2.add(new a().gH(intValue + 1).gI(i - intValue));
                }
            }
            for (a aVar : arrayList2) {
                if (aVar.count > 0) {
                    notifyItemRangeChanged(aVar.startPosition, aVar.count);
                }
            }
        }
    }

    public void jy(String str) {
        int jA = jA(str);
        if (jA != -1) {
            i iVar = (i) this.items.get(jA);
            if (iVar.aRz()) {
                notifyItemChanged(jA);
            } else {
                ImmutableList aRA = iVar.aRA();
                jA++;
                int size = aRA.size();
                this.items.addAll(jA, aRA);
                notifyItemRangeInserted(jA, size);
            }
        }
    }

    public void jz(String str) {
        int jA = jA(str);
        if (jA != -1) {
            i iVar = (i) this.items.get(jA);
            if (iVar.aRz()) {
                notifyItemChanged(jA);
            } else {
                ImmutableList aRA = iVar.aRA();
                jA++;
                int size = aRA.size();
                this.items.removeAll(aRA);
                notifyItemRangeRemoved(jA, size);
            }
        }
    }

    public int jA(String str) {
        Iterator it = this.items.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (ae.equals(((com.iqoption.portfolio.component.b.f) it.next()).Or(), str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void aC(String str, String str2) {
        if (!(str2 == null || ae.equals(str2, str))) {
            notifyItemChanged(jA(str2));
        }
        notifyItemChanged(jA(str));
    }
}
