package com.iqoption.alerts.ui.optionspicker;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.widget.clippinglayout.ClipLinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0003#$%B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0014J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0013\u0010\u0014¨\u0006&"}, bng = {"Lcom/iqoption/alerts/ui/optionspicker/AlertsOptionsPickerFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "assetId", "", "getAssetId", "()I", "contentPositionController", "Lcom/iqoption/alerts/util/AnchorPositionController;", "getContentPositionController", "()Lcom/iqoption/alerts/util/AnchorPositionController;", "contentPositionController$delegate", "Lkotlin/Lazy;", "instrumentType", "", "getInstrumentType", "()Ljava/lang/String;", "viewModel", "Lcom/iqoption/alerts/ui/optionspicker/AlertsOptionsPickerViewModel;", "getViewModel", "()Lcom/iqoption/alerts/ui/optionspicker/AlertsOptionsPickerViewModel;", "viewModel$delegate", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "Companion", "OptionViewHolder", "OptionsAdapter", "alerts_release"})
/* compiled from: AlertsOptionsPickerFragment.kt */
public final class a extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "contentPositionController", "getContentPositionController()Lcom/iqoption/alerts/util/AnchorPositionController;")), k.a(new PropertyReference1Impl(k.G(a.class), "viewModel", "getViewModel()Lcom/iqoption/alerts/ui/optionspicker/AlertsOptionsPickerViewModel;"))};
    public static final a apT = new a();
    private final kotlin.d apR = g.c(new AlertsOptionsPickerFragment$contentPositionController$2(this));
    private final kotlin.d apS = g.c(new AlertsOptionsPickerFragment$viewModel$2(this));
    private HashMap apm;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JK\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, bng = {"Lcom/iqoption/alerts/ui/optionspicker/AlertsOptionsPickerFragment$Companion;", "", "()V", "ARG_ASSET_ID", "", "ARG_INSTRUMENT_TYPE", "TAG", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/iqoption/alerts/ui/optionspicker/AlertsOptionsPickerFragment;", "anchorX", "", "anchorY", "anchorGravity", "animPivot", "assetId", "instrumentType", "(Ljava/lang/Integer;Ljava/lang/Integer;IIILjava/lang/String;)Lcom/iqoption/alerts/ui/optionspicker/AlertsOptionsPickerFragment;", "alerts_release"})
    /* compiled from: AlertsOptionsPickerFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return a.TAG;
        }

        public final a a(Integer num, Integer num2, int i, int i2, int i3, String str) {
            a aVar = new a();
            Bundle a = com.iqoption.alerts.util.a.aqs.a(num, num2, i, i2);
            a.putInt("arg.assetId", i3);
            a.putString("arg.instrumentType", str);
            aVar.setArguments(a);
            return aVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, bng = {"Lcom/iqoption/alerts/ui/optionspicker/AlertsOptionsPickerFragment$OptionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "alerts_release"})
    /* compiled from: AlertsOptionsPickerFragment.kt */
    public static final class b extends ViewHolder {
        public b(View view) {
            kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
            super(view);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016H\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0016H\u0016J\u0018\u0010)\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%2\u0006\u0010*\u001a\u00020\u0016H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00108F@FX\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0016@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, bng = {"Lcom/iqoption/alerts/ui/optionspicker/AlertsOptionsPickerFragment$OptionsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/iqoption/alerts/ui/optionspicker/AlertsOptionsPickerFragment$OptionViewHolder;", "activity", "Landroid/app/Activity;", "viewModel", "Lcom/iqoption/alerts/ui/optionspicker/AlertsOptionsPickerViewModel;", "(Landroid/app/Activity;Lcom/iqoption/alerts/ui/optionspicker/AlertsOptionsPickerViewModel;)V", "_inflater", "Landroid/view/LayoutInflater;", "_items", "", "", "getActivity", "()Landroid/app/Activity;", "value", "", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "", "selected", "getSelected", "()I", "setSelected", "(I)V", "getViewModel", "()Lcom/iqoption/alerts/ui/optionspicker/AlertsOptionsPickerViewModel;", "getItemCount", "getItemId", "", "position", "inflate", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "onBindViewHolder", "", "holder", "onCreateViewHolder", "viewType", "alerts_release"})
    /* compiled from: AlertsOptionsPickerFragment.kt */
    public static final class c extends Adapter<b> {
        private final Activity activity;
        private final List<String> apU = new ArrayList();
        private LayoutInflater apV;
        private final b apW;
        private int selected;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/alerts/ui/optionspicker/AlertsOptionsPickerFragment$OptionsAdapter$onCreateViewHolder$1$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "alerts_release"})
        /* compiled from: AlertsOptionsPickerFragment.kt */
        public static final class a extends g {
            final /* synthetic */ b apX;
            final /* synthetic */ c apY;

            a(b bVar, c cVar) {
                this.apX = bVar;
                this.apY = cVar;
                super(0, 1, null);
            }

            public void M(View view) {
                kotlin.jvm.internal.i.f(view, "v");
                if (this.apX.getAdapterPosition() != -1) {
                    this.apY.Bu().dE(this.apX.getAdapterPosition());
                    Activity activity = this.apY.getActivity();
                    if (activity != null) {
                        activity.onBackPressed();
                    }
                }
            }
        }

        public final Activity getActivity() {
            return this.activity;
        }

        public final b Bu() {
            return this.apW;
        }

        public c(Activity activity, b bVar) {
            kotlin.jvm.internal.i.f(bVar, "viewModel");
            this.activity = activity;
            this.apW = bVar;
        }

        public final List<String> getItems() {
            return this.apU;
        }

        public final void w(List<String> list) {
            kotlin.jvm.internal.i.f(list, ConditionalUserProperty.VALUE);
            this.apU.clear();
            this.apU.addAll(list);
            notifyDataSetChanged();
        }

        public final void setSelected(int i) {
            if (this.selected != i) {
                this.selected = i;
                notifyDataSetChanged();
            }
        }

        private final View h(ViewGroup viewGroup) {
            LayoutInflater layoutInflater = this.apV;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(viewGroup.getContext());
            }
            View inflate = layoutInflater.inflate(com.iqoption.alerts.b.e.alerts_options_picker_list_item, viewGroup, false);
            kotlin.jvm.internal.i.e(inflate, "(_inflater ?: LayoutInfl…list_item, parent, false)");
            return inflate;
        }

        public int getItemCount() {
            return getItems().size();
        }

        /* renamed from: g */
        public b onCreateViewHolder(ViewGroup viewGroup, int i) {
            kotlin.jvm.internal.i.f(viewGroup, "parent");
            b bVar = new b(h(viewGroup));
            View view = bVar.itemView;
            kotlin.jvm.internal.i.e(view, "itemView");
            com.iqoption.core.ui.a.m(view, 0.5f);
            bVar.itemView.setOnClickListener(new a(bVar, this));
            return bVar;
        }

        /* renamed from: a */
        public void onBindViewHolder(b bVar, int i) {
            kotlin.jvm.internal.i.f(bVar, "holder");
            View view = bVar.itemView;
            if (view != null) {
                TextView textView = (TextView) view;
                textView.setText((CharSequence) getItems().get(i));
                textView.setSelected(this.selected == i);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }

        public long getItemId(int i) {
            return (long) ((String) getItems().get(i)).hashCode();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/alerts/ui/optionspicker/AlertsOptionsPickerFragment$onCreateView$1$clickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "alerts_release"})
    /* compiled from: AlertsOptionsPickerFragment.kt */
    public static final class d extends g {
        final /* synthetic */ a this$0;

        d(a aVar) {
            this.this$0 = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            if (view.getId() == com.iqoption.alerts.b.d.everything) {
                FragmentActivity activity = this.this$0.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "options", "", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: AlertsOptionsPickerFragment.kt */
    static final class e<T> implements Observer<List<? extends String>> {
        final /* synthetic */ c apZ;

        e(c cVar) {
            this.apZ = cVar;
        }

        /* renamed from: u */
        public final void onChanged(List<String> list) {
            if (list != null) {
                this.apZ.w(list);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "selected", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"})
    /* compiled from: AlertsOptionsPickerFragment.kt */
    static final class f<T> implements Observer<Integer> {
        final /* synthetic */ c apZ;

        f(c cVar) {
            this.apZ = cVar;
        }

        /* renamed from: b */
        public final void onChanged(Integer num) {
            if (num != null) {
                this.apZ.setSelected(num.intValue());
            }
        }
    }

    private final com.iqoption.alerts.util.a Bt() {
        kotlin.d dVar = this.apR;
        j jVar = anY[0];
        return (com.iqoption.alerts.util.a) dVar.getValue();
    }

    private final b Bu() {
        kotlin.d dVar = this.apS;
        j jVar = anY[1];
        return (b) dVar.getValue();
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

    private final int Bs() {
        return com.iqoption.core.ext.a.s(this).getInt("arg.assetId");
    }

    private final String getInstrumentType() {
        return com.iqoption.core.ext.a.s(this).getString("arg.instrumentType");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        Bu().dD(Bs());
        Bu().df(getInstrumentType());
        com.iqoption.alerts.a.i iVar = (com.iqoption.alerts.a.i) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.alerts.b.e.alerts_options_picker_fragment, viewGroup, false, 4, null);
        c cVar = new c(getActivity(), Bu());
        a(Bu().BA(), new e(cVar));
        a(Bu().BC(), new f(cVar));
        RecyclerView recyclerView = iVar.aoA;
        String str = "optionsList";
        kotlin.jvm.internal.i.e(recyclerView, str);
        recyclerView.setItemAnimator((ItemAnimator) null);
        recyclerView = iVar.aoA;
        kotlin.jvm.internal.i.e(recyclerView, str);
        recyclerView.setAdapter(cVar);
        com.iqoption.alerts.util.a Bt = Bt();
        ClipLinearLayout clipLinearLayout = iVar.aoy;
        kotlin.jvm.internal.i.e(clipLinearLayout, "content");
        Bt.O(clipLinearLayout);
        iVar.aoz.setOnClickListener(new d(this));
        return iVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        a((LifecycleObserver) new AlertsOptionsPickerFragment$onViewCreated$1(this));
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.core.ui.animation.transitions.e Bv() {
        return Bt().b(this);
    }

    static {
        String name = a.class.getName();
        kotlin.jvm.internal.i.e(name, "AlertsOptionsPickerFragment::class.java.name");
        TAG = name;
    }
}
