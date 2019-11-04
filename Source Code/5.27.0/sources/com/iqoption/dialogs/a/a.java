package com.iqoption.dialogs.a;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.core.ext.g;
import com.iqoption.core.ui.animation.transitions.e;
import com.iqoption.core.ui.fragment.d;
import com.iqoption.core.ui.widget.DialogContentLayout;
import com.iqoption.dialogs.b.j;
import java.util.HashMap;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014J&\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, bng = {"Lcom/iqoption/dialogs/custodial/CustodialFeeDialog;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/dialogs/databinding/DialogCustodialFeeBinding;", "inputData", "Lcom/iqoption/dialogs/custodial/CustodialFeeInput;", "getInputData", "()Lcom/iqoption/dialogs/custodial/CustodialFeeInput;", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "dialogs_release"})
/* compiled from: CustodialFeeDialog.kt */
public final class a extends d {
    public static final a cLF = new a();
    private HashMap apm;
    private j cLE;

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/dialogs/custodial/CustodialFeeDialog$Companion;", "", "()V", "ARG_ANCHOR_X", "", "ARG_ANCHOR_Y", "ARG_INPUT_DATA", "getNavigatorEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "input", "Lcom/iqoption/dialogs/custodial/CustodialFeeInput;", "anchorX", "", "anchorY", "dialogs_release"})
    /* compiled from: CustodialFeeDialog.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c a(b bVar, int i, int i2) {
            kotlin.jvm.internal.i.f(bVar, "input");
            com.iqoption.core.ui.d.c.a aVar = com.iqoption.core.ui.d.c.bJi;
            Bundle bundle = new Bundle();
            bundle.putParcelable("arg.inputData", bVar);
            bundle.putInt("arg.anchorX", i);
            bundle.putInt("arg.anchorY", i2);
            return aVar.a(a.class, bundle);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/dialogs/custodial/CustodialFeeDialog$onCreateView$1$clickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "dialogs_release"})
    /* compiled from: CustodialFeeDialog.kt */
    public static final class b extends g {
        final /* synthetic */ a cLG;
        final /* synthetic */ c cLH;

        b(a aVar, c cVar) {
            this.cLG = aVar;
            this.cLH = cVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            int id = view.getId();
            if (id == com.iqoption.dialogs.d.d.outside || id == com.iqoption.dialogs.d.d.btnOk) {
                this.cLG.back();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/dialogs/custodial/ScheduleItem;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: CustodialFeeDialog.kt */
    static final class c<T> implements Observer<List<? extends d>> {
        final /* synthetic */ j cLI;
        final /* synthetic */ f cLJ;

        c(j jVar, f fVar) {
            this.cLI = jVar;
            this.cLJ = fVar;
        }

        /* renamed from: u */
        public final void onChanged(List<d> list) {
            if (list != null) {
                com.iqoption.core.ui.widget.recyclerview.adapter.a.a(this.cLJ, list, null, 2, null);
                this.cLI.cMq.scheduleLayoutAnimation();
            }
        }
    }

    public static final com.iqoption.core.ui.d.c a(b bVar, int i, int i2) {
        return cLF.a(bVar, i, i2);
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

    private final b auL() {
        Parcelable parcelable = com.iqoption.core.ext.a.s(this).getParcelable("arg.inputData");
        kotlin.jvm.internal.i.e(parcelable, "args.getParcelable(ARG_INPUT_DATA)");
        return (b) parcelable;
    }

    /* Access modifiers changed, original: protected */
    public e Bv() {
        return com.iqoption.core.ui.animation.transitions.c.a.a(com.iqoption.core.ui.animation.transitions.c.bHB, this, 0, 2, null);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.cLE = (j) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.dialogs.d.e.dialog_custodial_fee, viewGroup, false, 4, null);
        c a = c.cLQ.a((Fragment) this, auL());
        j jVar = this.cLE;
        String str = "binding";
        if (jVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        OnClickListener bVar = new b(this, a);
        jVar.cMn.setOnClickListener(bVar);
        TextView textView = jVar.cMo;
        if (textView != null) {
            textView.setOnClickListener(bVar);
        }
        DialogContentLayout dialogContentLayout = jVar.cMn;
        String str2 = "arg.anchorX";
        if (com.iqoption.core.ext.a.s(this).containsKey(str2)) {
            dialogContentLayout.setAnchorX(com.iqoption.core.ext.a.s(this).getInt(str2));
        }
        str2 = "arg.anchorY";
        if (com.iqoption.core.ext.a.s(this).containsKey(str2)) {
            dialogContentLayout.setAnchorY(com.iqoption.core.ext.a.s(this).getInt(str2));
        }
        dialogContentLayout.setAnchorGravity(16);
        f fVar = new f();
        RecyclerView recyclerView = jVar.cMq;
        kotlin.jvm.internal.i.e(recyclerView, "schedule");
        recyclerView.setAdapter(fVar);
        a(a.auO(), new c(jVar, fVar));
        j jVar2 = this.cLE;
        if (jVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return jVar2.getRoot();
    }
}
