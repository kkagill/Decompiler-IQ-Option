package com.iqoption.portfolio.component;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.common.collect.ImmutableList;
import com.iqoption.portfolio.component.b.k;
import com.iqoption.portfolio.component.b.l;
import com.iqoption.portfolio.component.viewholder.ap;
import com.iqoption.portfolio.fragment.f;
import com.iqoption.util.ae;
import com.iqoption.view.a.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PendingPositionsAdapter */
public final class h extends Adapter<ap> {
    private static final String TAG = "com.iqoption.portfolio.component.h";
    private RecyclerView alz;
    private final com.iqoption.view.a.b.a cVQ = new -$$Lambda$h$4keOZI0MVTnYrdeLba8ABCvfAc8(this);
    private final n<ap, k, f> dLW;
    private final ArrayList<k> items = new ArrayList();

    /* compiled from: PendingPositionsAdapter */
    private static final class a {
        int count;
        int startPosition;

        private a() {
        }

        /* Access modifiers changed, original: 0000 */
        public a gK(int i) {
            this.startPosition = i;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public a gL(int i) {
            this.count = i;
            return this;
        }
    }

    private /* synthetic */ void ak(long j) {
        RecyclerView recyclerView = this.alz;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewHolder childViewHolder = this.alz.getChildViewHolder(this.alz.getChildAt(i));
                if (childViewHolder instanceof ap) {
                    ((ap) childViewHolder).aRW();
                }
            }
        }
    }

    public h(n<ap, k, f> nVar) {
        this.dLW = nVar;
        setHasStableIds(true);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.alz = recyclerView;
        b.aYv().a(this.cVQ);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.alz = null;
        b.aYv().b(this.cVQ);
    }

    /* renamed from: Q */
    public ap onCreateViewHolder(ViewGroup viewGroup, int i) {
        return (ap) this.dLW.b(i, viewGroup);
    }

    /* renamed from: a */
    public void onBindViewHolder(ap apVar, int i) {
        this.dLW.a(apVar.getItemViewType(), apVar, gJ(i));
    }

    public int getItemCount() {
        return this.items.size();
    }

    public int getItemViewType(int i) {
        return gJ(i).asd();
    }

    public long getItemId(int i) {
        return f.dMj.de(gJ(i).Or());
    }

    public k gJ(int i) {
        return (k) this.items.get(i);
    }

    public void w(List<k> list) {
        this.items.clear();
        if (list != null) {
            this.items.addAll(list);
        }
        notifyDataSetChanged();
    }

    public void aRj() {
        RecyclerView recyclerView = this.alz;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            gG(childCount);
            for (int i = 0; i < childCount; i++) {
                RecyclerView recyclerView2 = this.alz;
                ((ap) recyclerView2.getChildViewHolder(recyclerView2.getChildAt(i))).aRj();
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
                    arrayList2.add(new a().gK(0).gL(num.intValue()));
                } else if (num.intValue() - i3 > 1) {
                    arrayList2.add(new a().gK(i3 + 1).gL((num.intValue() - i3) - 1));
                }
                i3 = num.intValue();
            }
            if (!arrayList2.isEmpty()) {
                int intValue = ((Integer) arrayList.get(arrayList.size() - 1)).intValue();
                if (intValue < i) {
                    arrayList2.add(new a().gK(intValue + 1).gL(i - intValue));
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
            l lVar = (l) this.items.get(jA);
            if (lVar.aRz()) {
                notifyItemChanged(jA);
            } else {
                ImmutableList aRB = lVar.aRB();
                jA++;
                int size = aRB.size();
                this.items.addAll(jA, aRB);
                notifyItemRangeInserted(jA, size);
            }
        }
    }

    public void jz(String str) {
        int jA = jA(str);
        if (jA != -1) {
            l lVar = (l) this.items.get(jA);
            if (lVar.aRz()) {
                notifyItemChanged(jA);
            } else {
                ImmutableList aRB = lVar.aRB();
                jA++;
                int size = aRB.size();
                this.items.removeAll(aRB);
                notifyItemRangeRemoved(jA, size);
            }
        }
    }

    public int jA(String str) {
        Iterator it = this.items.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (ae.equals(((k) it.next()).Or(), str)) {
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
