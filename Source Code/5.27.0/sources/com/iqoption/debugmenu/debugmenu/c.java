package com.iqoption.debugmenu.debugmenu;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.util.ah;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0003\u000e\u000f\u0010B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u0011"}, bng = {"Lcom/iqoption/debugmenu/debugmenu/FeatureFragment;", "Landroidx/fragment/app/Fragment;", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "Companion", "FeaturesAdapter", "UpdateFeatureStatusListener", "debugmenu_release"})
/* compiled from: FeatureFragment.kt */
public final class c extends Fragment {
    public static final a cvE = new a();
    private HashMap apm;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, bng = {"Lcom/iqoption/debugmenu/debugmenu/FeatureFragment$Companion;", "", "()V", "inflate", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "debugmenu_release"})
    /* compiled from: FeatureFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        private final View h(ViewGroup viewGroup) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(com.iqoption.debugmenu.c.c.switcher_item, viewGroup, false);
            kotlin.jvm.internal.i.e(inflate, "inflater.inflate(R.layou…cher_item, parent, false)");
            return inflate;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bb\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/debugmenu/debugmenu/FeatureFragment$UpdateFeatureStatusListener;", "", "onUpdate", "", "feature", "Lcom/iqoption/core/microservices/features/response/Feature;", "debugmenu_release"})
    /* compiled from: FeatureFragment.kt */
    private interface c {
        void c(com.iqoption.core.microservices.features.a.a aVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u00032\u00020\u0004:\u0002\"#B\u0005¢\u0006\u0002\u0010\u0005J\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0000¢\u0006\u0002\b\u000eJ\u000e\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u000f2\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\bH\u0016J\u001d\u0010\u001f\u001a\u00020\u000f2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\fH\u0000¢\u0006\u0002\b!R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00060\nR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, bng = {"Lcom/iqoption/debugmenu/debugmenu/FeatureFragment$FeaturesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/iqoption/debugmenu/debugmenu/FeatureFragment$FeaturesAdapter$FeatureViewHolder;", "Lcom/iqoption/debugmenu/debugmenu/FeatureFragment$UpdateFeatureStatusListener;", "Landroid/widget/Filterable;", "()V", "features", "Ljava/util/ArrayList;", "Lcom/iqoption/core/microservices/features/response/Feature;", "filter", "Lcom/iqoption/debugmenu/debugmenu/FeatureFragment$FeaturesAdapter$FeatureFilter;", "filteredList", "", "copyFeatures", "copyFeatures$debugmenu_release", "", "filterInput", "", "getFilter", "Landroid/widget/Filter;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onUpdate", "feature", "setFeatures", "newFeatures", "setFeatures$debugmenu_release", "FeatureFilter", "FeatureViewHolder", "debugmenu_release"})
    /* compiled from: FeatureFragment.kt */
    private static final class b extends Adapter<b> implements Filterable, c {
        private final a cvF = new a();
        private final ArrayList<com.iqoption.core.microservices.features.a.a> cvG = new ArrayList();
        private List<com.iqoption.core.microservices.features.a.a> cvH = m.emptyList();

        @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0014¨\u0006\n"}, bng = {"Lcom/iqoption/debugmenu/debugmenu/FeatureFragment$FeaturesAdapter$FeatureFilter;", "Landroid/widget/Filter;", "(Lcom/iqoption/debugmenu/debugmenu/FeatureFragment$FeaturesAdapter;)V", "performFiltering", "Landroid/widget/Filter$FilterResults;", "constraint", "", "publishResults", "", "results", "debugmenu_release"})
        /* compiled from: FeatureFragment.kt */
        private final class a extends Filter {
            /* Access modifiers changed, original: protected */
            public FilterResults performFiltering(CharSequence charSequence) {
                kotlin.jvm.internal.i.f(charSequence, "constraint");
                FilterResults filterResults = new FilterResults();
                ArrayList arrayList = new ArrayList();
                if ((charSequence.length() == 0 ? 1 : null) != null) {
                    arrayList.addAll(b.this.cvG);
                } else {
                    String obj = charSequence.toString();
                    String str = "null cannot be cast to non-null type java.lang.String";
                    if (obj != null) {
                        obj = obj.toLowerCase();
                        String str2 = "(this as java.lang.String).toLowerCase()";
                        kotlin.jvm.internal.i.e(obj, str2);
                        charSequence = obj;
                        int length = charSequence.length() - 1;
                        int i = 0;
                        Object obj2 = null;
                        while (i <= length) {
                            Object obj3 = charSequence.charAt(obj2 == null ? i : length) <= ' ' ? 1 : null;
                            if (obj2 == null) {
                                if (obj3 == null) {
                                    obj2 = 1;
                                } else {
                                    i++;
                                }
                            } else if (obj3 == null) {
                                break;
                            } else {
                                length--;
                            }
                        }
                        obj = charSequence.subSequence(i, length + 1).toString();
                        Iterator it = b.this.cvG.iterator();
                        while (it.hasNext()) {
                            com.iqoption.core.microservices.features.a.a aVar = (com.iqoption.core.microservices.features.a.a) it.next();
                            String name = aVar.getName();
                            if (name != null) {
                                name = name.toLowerCase();
                                kotlin.jvm.internal.i.e(name, str2);
                                CharSequence charSequence2 = name;
                                int length2 = charSequence2.length() - 1;
                                int i2 = 0;
                                Object obj4 = null;
                                while (i2 <= length2) {
                                    Object obj5 = charSequence2.charAt(obj4 == null ? i2 : length2) <= ' ' ? 1 : null;
                                    if (obj4 == null) {
                                        if (obj5 == null) {
                                            obj4 = 1;
                                        } else {
                                            i2++;
                                        }
                                    } else if (obj5 == null) {
                                        break;
                                    } else {
                                        length2--;
                                    }
                                }
                                if (v.b((CharSequence) charSequence2.subSequence(i2, length2 + 1).toString(), (CharSequence) obj, false, 2, null)) {
                                    arrayList.add(aVar);
                                }
                            } else {
                                throw new TypeCastException(str);
                            }
                        }
                    }
                    throw new TypeCastException(str);
                }
                filterResults.values = arrayList;
                filterResults.count = arrayList.size();
                return filterResults;
            }

            /* Access modifiers changed, original: protected */
            public void publishResults(CharSequence charSequence, FilterResults filterResults) {
                kotlin.jvm.internal.i.f(charSequence, "constraint");
                kotlin.jvm.internal.i.f(filterResults, "results");
                b bVar = b.this;
                Object obj = filterResults.values;
                if (obj != null) {
                    bVar.cvH = (List) obj;
                    b.this.notifyDataSetChanged();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.iqoption.core.microservices.features.response.Feature>");
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
        /* compiled from: Comparisons.kt */
        public static final class c<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return b.c(((com.iqoption.core.microservices.features.a.a) t).getName(), ((com.iqoption.core.microservices.features.a.a) t2).getName());
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\u0015\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\nH\u0000¢\u0006\u0002\b\u001dJ\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 H\u0016J(\u0010!\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, bng = {"Lcom/iqoption/debugmenu/debugmenu/FeatureFragment$FeaturesAdapter$FeatureViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/text/TextWatcher;", "Landroid/view/View$OnClickListener;", "updateListener", "Lcom/iqoption/debugmenu/debugmenu/FeatureFragment$UpdateFeatureStatusListener;", "parent", "Landroid/view/ViewGroup;", "(Lcom/iqoption/debugmenu/debugmenu/FeatureFragment$FeaturesAdapter;Lcom/iqoption/debugmenu/debugmenu/FeatureFragment$UpdateFeatureStatusListener;Landroid/view/ViewGroup;)V", "bound", "Lcom/iqoption/core/microservices/features/response/Feature;", "skipTextChange", "", "stateInput", "Landroid/widget/EditText;", "titleView", "Landroid/widget/TextView;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "bind", "feature", "bind$debugmenu_release", "onClick", "v", "Landroid/view/View;", "onTextChanged", "before", "debugmenu_release"})
        /* compiled from: FeatureFragment.kt */
        private final class b extends ViewHolder implements TextWatcher, OnClickListener {
            private final TextView aHG;
            final /* synthetic */ b cvI;
            private final EditText cvJ;
            private com.iqoption.core.microservices.features.a.a cvK;
            private boolean cvL;
            private final c cvM;

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                kotlin.jvm.internal.i.f(charSequence, "s");
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                kotlin.jvm.internal.i.f(charSequence, "s");
            }

            public b(b bVar, c cVar, ViewGroup viewGroup) {
                kotlin.jvm.internal.i.f(cVar, "updateListener");
                kotlin.jvm.internal.i.f(viewGroup, "parent");
                this.cvI = bVar;
                super(c.cvE.h(viewGroup));
                this.cvM = cVar;
                View findViewById = this.itemView.findViewById(com.iqoption.debugmenu.c.b.title);
                kotlin.jvm.internal.i.e(findViewById, "itemView.findViewById(R.id.title)");
                this.aHG = (TextView) findViewById;
                findViewById = this.itemView.findViewById(com.iqoption.debugmenu.c.b.edit);
                kotlin.jvm.internal.i.e(findViewById, "itemView.findViewById(R.id.edit)");
                this.cvJ = (EditText) findViewById;
                Button button = (Button) this.itemView.findViewById(com.iqoption.debugmenu.c.b.toggle);
                this.cvJ.addTextChangedListener(this);
                button.setOnClickListener(this);
            }

            public void afterTextChanged(Editable editable) {
                kotlin.jvm.internal.i.f(editable, "s");
                com.iqoption.core.microservices.features.a.a aVar = this.cvK;
                if (aVar != null && !this.cvL) {
                    com.iqoption.core.microservices.features.a.a a = aVar != null ? com.iqoption.core.microservices.features.a.a.a(aVar, 0, null, editable.toString(), 0, null, null, 59, null) : null;
                    if (a == null) {
                        kotlin.jvm.internal.i.bnJ();
                    }
                    this.cvK = a;
                    this.cvM.c(a);
                }
            }

            public void onClick(View view) {
                kotlin.jvm.internal.i.f(view, "v");
                CharSequence obj = this.cvJ.getText().toString();
                int length = obj.length() - 1;
                int i = 0;
                Object obj2 = null;
                while (i <= length) {
                    Object obj3 = obj.charAt(obj2 == null ? i : length) <= ' ' ? 1 : null;
                    if (obj2 == null) {
                        if (obj3 == null) {
                            obj2 = 1;
                        } else {
                            i++;
                        }
                    } else if (obj3 == null) {
                        break;
                    } else {
                        length--;
                    }
                }
                String str = "enabled";
                if (kotlin.jvm.internal.i.y(str, obj.subSequence(i, length + 1).toString())) {
                    str = "disabled";
                }
                this.cvJ.setText(str);
            }

            public final void d(com.iqoption.core.microservices.features.a.a aVar) {
                kotlin.jvm.internal.i.f(aVar, "feature");
                TextView textView = this.aHG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(aVar.getName());
                stringBuilder.append(" - v");
                stringBuilder.append(aVar.getVersion());
                textView.setText(stringBuilder.toString());
                this.cvL = true;
                this.cvJ.setText(aVar.getStatus());
                this.cvL = false;
                this.cvK = aVar;
            }
        }

        public void c(com.iqoption.core.microservices.features.a.a aVar) {
            Object obj;
            Integer num;
            Object obj2;
            kotlin.jvm.internal.i.f(aVar, "feature");
            Iterable iterable = this.cvG;
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            int i = 0;
            for (Object obj3 : iterable) {
                int i2 = i + 1;
                if (i < 0) {
                    m.bno();
                }
                arrayList.add(new Pair(Integer.valueOf(i), obj3));
                i = i2;
            }
            Iterator it = ((List) arrayList).iterator();
            do {
                num = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((com.iqoption.core.microservices.features.a.a) ((Pair) obj2).bni()).getId() == aVar.getId()) {
                    obj3 = 1;
                    continue;
                } else {
                    obj3 = null;
                    continue;
                }
            } while (obj3 == null);
            Pair pair = (Pair) obj2;
            if (pair != null) {
                num = (Integer) pair.getFirst();
            }
            if (num != null) {
                this.cvG.remove(num.intValue());
                this.cvG.add(num.intValue(), aVar);
            }
        }

        public final void aH(List<com.iqoption.core.microservices.features.a.a> list) {
            this.cvG.clear();
            if (list != null) {
                this.cvG.addAll(list);
                List list2 = this.cvG;
                if (list2.size() > 1) {
                    q.a(list2, new c());
                }
            }
            this.cvH = this.cvG;
            notifyDataSetChanged();
        }

        public final List<com.iqoption.core.microservices.features.a.a> aoe() {
            Collection arrayList = new ArrayList();
            for (com.iqoption.core.microservices.features.a.a aVar : this.cvH) {
                for (Object next : this.cvG) {
                    Object obj;
                    if (((com.iqoption.core.microservices.features.a.a) next).getId() == aVar.getId()) {
                        obj = 1;
                        continue;
                    } else {
                        obj = null;
                        continue;
                    }
                    if (obj != null) {
                        break;
                    }
                }
                Object next2 = null;
                com.iqoption.core.microservices.features.a.a aVar2 = (com.iqoption.core.microservices.features.a.a) next2;
                if (aVar2 != null) {
                    arrayList.add(aVar2);
                }
            }
            return (List) arrayList;
        }

        /* renamed from: s */
        public b onCreateViewHolder(ViewGroup viewGroup, int i) {
            kotlin.jvm.internal.i.f(viewGroup, "parent");
            return new b(this, this, viewGroup);
        }

        /* renamed from: a */
        public void onBindViewHolder(b bVar, int i) {
            kotlin.jvm.internal.i.f(bVar, "holder");
            bVar.d((com.iqoption.core.microservices.features.a.a) this.cvH.get(i));
        }

        public int getItemCount() {
            return this.cvH.size();
        }

        public Filter getFilter() {
            return this.cvF;
        }

        public final void hA(String str) {
            kotlin.jvm.internal.i.f(str, "filterInput");
            this.cvF.filter(str);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class d extends com.iqoption.core.ext.g {
        final /* synthetic */ b cvN;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, bng = {"<anonymous>", "", "run", "com/iqoption/debugmenu/debugmenu/FeatureFragment$onViewCreated$1$2"})
        /* compiled from: FeatureFragment.kt */
        static final class a implements io.reactivex.b.a {
            final /* synthetic */ View bIq;
            final /* synthetic */ d cvO;

            a(View view, d dVar) {
                this.bIq = view;
                this.cvO = dVar;
            }

            public final void run() {
                this.bIq.setEnabled(true);
                this.cvO.cvN.aH(com.iqoption.core.d.EH().Im());
                com.iqoption.core.data.d.a.bdi.cp(false);
            }
        }

        public d(b bVar) {
            this.cvN = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            view.setEnabled(false);
            this.cvN.aH(null);
            com.iqoption.core.d.EH().Io();
            io.reactivex.a.b((io.reactivex.b.a) f.cvQ).b(com.iqoption.core.rx.i.aki()).a(com.iqoption.core.rx.i.akj()).d(new a(view, this));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class e extends com.iqoption.core.ext.g {
        final /* synthetic */ b cvN;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, bng = {"<anonymous>", "", "run", "com/iqoption/debugmenu/debugmenu/FeatureFragment$onViewCreated$2$1"})
        /* compiled from: FeatureFragment.kt */
        static final class a implements io.reactivex.b.a {
            final /* synthetic */ e cvP;

            a(e eVar) {
                this.cvP = eVar;
            }

            public final void run() {
                com.iqoption.core.d.EH().D(this.cvP.cvN.aoe());
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, bng = {"<anonymous>", "", "run", "com/iqoption/debugmenu/debugmenu/FeatureFragment$onViewCreated$2$2"})
        /* compiled from: FeatureFragment.kt */
        static final class b implements io.reactivex.b.a {
            final /* synthetic */ View bIq;

            b(View view) {
                this.bIq = view;
            }

            public final void run() {
                this.bIq.setEnabled(true);
                com.iqoption.core.data.d.a.bdi.cp(true);
            }
        }

        public e(b bVar) {
            this.cvN = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            view.setEnabled(false);
            io.reactivex.a.b((io.reactivex.b.a) new a(this)).b(com.iqoption.core.rx.i.aki()).a(com.iqoption.core.rx.i.akj()).d(new b(view));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: FeatureFragment.kt */
    static final class f implements io.reactivex.b.a {
        public static final f cvQ = new f();

        f() {
        }

        public final void run() {
            com.iqoption.core.d.EH().In();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/debugmenu/debugmenu/FeatureFragment$onViewCreated$watcher$1", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "debugmenu_release"})
    /* compiled from: FeatureFragment.kt */
    public static final class g extends ah {
        final /* synthetic */ b cvR;

        g(b bVar) {
            this.cvR = bVar;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            super.afterTextChanged(editable);
            this.cvR.hA(editable.toString());
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        return layoutInflater.inflate(com.iqoption.debugmenu.c.c.debug_console_feature, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(com.iqoption.debugmenu.c.b.featuresList);
        kotlin.jvm.internal.i.e(recyclerView, "featuresList");
        recyclerView.setItemAnimator((ItemAnimator) null);
        b bVar = new b();
        bVar.aH(com.iqoption.core.d.EH().Im());
        recyclerView.setAdapter(bVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        ((EditText) view.findViewById(com.iqoption.debugmenu.c.b.search)).addTextChangedListener(new g(bVar));
        View findViewById = view.findViewById(com.iqoption.debugmenu.c.b.resetFeatures);
        kotlin.jvm.internal.i.e(findViewById, "view.findViewById<View>(R.id.resetFeatures)");
        findViewById.setOnClickListener(new d(bVar));
        view = view.findViewById(com.iqoption.debugmenu.c.b.saveFeatures);
        kotlin.jvm.internal.i.e(view, "view.findViewById<View>(R.id.saveFeatures)");
        view.setOnClickListener(new e(bVar));
    }
}
