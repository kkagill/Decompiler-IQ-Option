package com.iqoption.charttools.constructor;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.charttools.b.g;
import com.iqoption.charttools.n.h;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0011\u0012\u0013B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/charttools/constructor/InputHostBottomSheet;", "Lcom/iqoption/bottomsheet/BindingBottomSheetFragment;", "Lcom/iqoption/charttools/databinding/IndicatorConstructorBottomSheetInputSelectBinding;", "()V", "viewModel", "Lcom/iqoption/charttools/constructor/InputHostViewModel;", "onBottomSheetClosed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "provideViewBinding", "container", "Landroid/view/ViewGroup;", "Companion", "OptionViewHolder", "OptionsAdapter", "techtools_release"})
/* compiled from: InputHostBottomSheet.kt */
public final class p extends com.iqoption.bottomsheet.a<g> {
    private static final String TAG = p.class.getName();
    public static final a aFz = new a();
    private q aFy;
    private HashMap apm;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"Lcom/iqoption/charttools/constructor/InputHostBottomSheet$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "techtools_release"})
    /* compiled from: InputHostBottomSheet.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return p.TAG;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, bng = {"Lcom/iqoption/charttools/constructor/InputHostBottomSheet$OptionsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/iqoption/charttools/constructor/InputHostBottomSheet$OptionViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "items", "", "Lcom/iqoption/charttools/model/indicator/constructor/FigureHost;", "onClick", "Lkotlin/Function1;", "", "([Lcom/iqoption/charttools/model/indicator/constructor/FigureHost;Lkotlin/jvm/functions/Function1;)V", "getItems", "()[Lcom/iqoption/charttools/model/indicator/constructor/FigureHost;", "[Lcom/iqoption/charttools/model/indicator/constructor/FigureHost;", "get", "", "position", "", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "techtools_release"})
    /* compiled from: InputHostBottomSheet.kt */
    private static final class c extends Adapter<b> implements com.iqoption.core.ui.widget.recyclerview.a.a {
        private final kotlin.jvm.a.b<com.iqoption.charttools.model.indicator.constructor.b, l> aFA;
        private final com.iqoption.charttools.model.indicator.constructor.b[] aFC;

        public c(com.iqoption.charttools.model.indicator.constructor.b[] bVarArr, kotlin.jvm.a.b<? super com.iqoption.charttools.model.indicator.constructor.b, l> bVar) {
            kotlin.jvm.internal.i.f(bVarArr, "items");
            kotlin.jvm.internal.i.f(bVar, "onClick");
            this.aFC = bVarArr;
            this.aFA = bVar;
        }

        public Object get(int i) {
            return i.e((Object[]) this.aFC, i);
        }

        public int getItemCount() {
            return this.aFC.length;
        }

        /* renamed from: i */
        public b onCreateViewHolder(ViewGroup viewGroup, int i) {
            kotlin.jvm.internal.i.f(viewGroup, "parent");
            return new b(this.aFA, viewGroup, this);
        }

        /* renamed from: a */
        public void onBindViewHolder(b bVar, int i) {
            kotlin.jvm.internal.i.f(bVar, "holder");
            bVar.bV(this.aFC[i]);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/charttools/constructor/InputHostBottomSheet$OptionViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "Lcom/iqoption/charttools/model/indicator/constructor/FigureHost;", "onClick", "Lkotlin/Function1;", "", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lkotlin/jvm/functions/Function1;Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "bind", "item", "techtools_release"})
    /* compiled from: InputHostBottomSheet.kt */
    private static final class b extends com.iqoption.core.ui.widget.recyclerview.a.c<com.iqoption.charttools.model.indicator.constructor.b> {
        private final kotlin.jvm.a.b<com.iqoption.charttools.model.indicator.constructor.b, l> aFA;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/charttools/constructor/InputHostBottomSheet$OptionViewHolder$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "techtools_release"})
        /* compiled from: InputHostBottomSheet.kt */
        /* renamed from: com.iqoption.charttools.constructor.p$b$1 */
        public static final class AnonymousClass1 extends com.iqoption.core.ext.g {
            final /* synthetic */ b aFB;

            AnonymousClass1(b bVar) {
                this.aFB = bVar;
                super(0, 1, null);
            }

            public void M(View view) {
                kotlin.jvm.internal.i.f(view, "v");
                com.iqoption.charttools.model.indicator.constructor.b bVar = (com.iqoption.charttools.model.indicator.constructor.b) this.aFB.and();
                if (bVar != null) {
                    this.aFB.aFA.invoke(bVar);
                }
            }
        }

        public b(kotlin.jvm.a.b<? super com.iqoption.charttools.model.indicator.constructor.b, l> bVar, ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar) {
            kotlin.jvm.internal.i.f(bVar, "onClick");
            kotlin.jvm.internal.i.f(viewGroup, "parent");
            kotlin.jvm.internal.i.f(aVar, "data");
            super(com.iqoption.core.ext.a.b(viewGroup, h.indicator_constructor_bottom_sheet_input_select_item, null, false, 6, null), aVar);
            this.aFA = bVar;
            this.itemView.setOnClickListener(new AnonymousClass1(this));
        }

        /* renamed from: a */
        public void bB(com.iqoption.charttools.model.indicator.constructor.b bVar) {
            kotlin.jvm.internal.i.f(bVar, "item");
            View view = this.itemView;
            if (view != null) {
                ((TextView) view).setText(bVar.getTitle());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
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

    public static final /* synthetic */ q a(p pVar) {
        q qVar = pVar.aFy;
        if (qVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return qVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.aFy = q.aFF.e(com.iqoption.core.ext.a.v(this));
    }

    /* renamed from: m */
    public g j(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "container");
        return (g) com.iqoption.core.ext.a.a(viewGroup, h.indicator_constructor_bottom_sheet_input_select, null, false, 6, null);
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        TextView textView = ((g) getBinding()).alH;
        kotlin.jvm.internal.i.e(textView, "binding.title");
        q qVar = this.aFy;
        String str = "viewModel";
        if (qVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textView.setText(qVar.getTitle());
        RecyclerView recyclerView = ((g) getBinding()).aIq;
        q qVar2 = this.aFy;
        if (qVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        recyclerView.setAdapter(new c(qVar2.Nl(), new InputHostBottomSheet$onViewCreated$$inlined$apply$lambda$1(this)));
    }

    public void KR() {
        super.KR();
        q qVar = this.aFy;
        if (qVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        qVar.destroy();
    }
}
