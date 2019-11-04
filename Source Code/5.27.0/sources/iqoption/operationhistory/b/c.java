package iqoption.operationhistory.b;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.iqoption.core.d;
import com.iqoption.core.microservices.transaction.Transaction;
import com.iqoption.core.microservices.transaction.Transaction.Status;
import com.iqoption.core.microservices.transaction.Transaction.Type;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import com.iqoption.j.a.o;
import com.iqoption.j.c.f;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0014\u0010\u0010\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¨\u0006\u0012"}, bng = {"Liqoption/operationhistory/result/OperationViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "Lcom/iqoption/operationhistory/databinding/OperationSearchResultItemBinding;", "Liqoption/operationhistory/result/TransactionItem;", "binding", "(Lcom/iqoption/operationhistory/databinding/OperationSearchResultItemBinding;)V", "imageResourceFromTransaction", "", "transition", "Lcom/iqoption/core/microservices/transaction/Transaction;", "operationNameFromTransaction", "", "setAmount", "", "item", "setCommission", "bind", "Companion", "operationhistory_release"})
/* compiled from: OperationViewHolder.kt */
public final class c extends e<o, e> {
    private static final SimpleDateFormat cAt = new SimpleDateFormat("dd/MM/yy, HH:mm", Locale.getDefault());
    public static final a eVn = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Liqoption/operationhistory/result/OperationViewHolder$Companion;", "", "()V", "dateTimeFormat", "Ljava/text/SimpleDateFormat;", "getDateTimeFormat", "()Ljava/text/SimpleDateFormat;", "operationhistory_release"})
    /* compiled from: OperationViewHolder.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public c(o oVar) {
        kotlin.jvm.internal.i.f(oVar, "binding");
        super(oVar, null, 2, null);
    }

    public void a(o oVar, e eVar) {
        Integer valueOf;
        kotlin.jvm.internal.i.f(oVar, "$this$bind");
        kotlin.jvm.internal.i.f(eVar, "item");
        Transaction bnc = eVar.bnc();
        Status aiY = bnc.aiY();
        o oVar2 = (o) getBinding();
        oVar2.dKp.setImageResource(a(bnc));
        TextView textView = oVar2.dKq;
        kotlin.jvm.internal.i.e(textView, "operationName");
        textView.setText(b(bnc));
        TextView textView2 = oVar2.dKo;
        kotlin.jvm.internal.i.e(textView2, "operationDate");
        textView2.setText(cAt.format(new Date(bnc.getCreated() * ((long) 1000))));
        String str = "binding.operationProgressIcon";
        ImageView imageView;
        if (aiY == Status.IN_PROCESS) {
            imageView = ((o) getBinding()).dKr;
            kotlin.jvm.internal.i.e(imageView, str);
            com.iqoption.core.ext.a.ak(imageView);
        } else {
            imageView = ((o) getBinding()).dKr;
            kotlin.jvm.internal.i.e(imageView, str);
            com.iqoption.core.ext.a.al(imageView);
        }
        a(eVar);
        b(eVar);
        int i = d.aob[aiY.ordinal()];
        if (i == 1) {
            valueOf = Integer.valueOf(f.canceled);
        } else if (i != 2) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(f.failed);
        }
        String str2 = "binding.operationStatus";
        if (valueOf != null) {
            TextView textView3 = ((o) getBinding()).dKs;
            kotlin.jvm.internal.i.e(textView3, str2);
            com.iqoption.core.ext.a.ak(textView3);
            textView3 = ((o) getBinding()).dKs;
            kotlin.jvm.internal.i.e(textView3, str2);
            textView3.setText(d.getString(valueOf.intValue()));
            return;
        }
        TextView textView4 = ((o) getBinding()).dKs;
        kotlin.jvm.internal.i.e(textView4, str2);
        com.iqoption.core.ext.a.al(textView4);
    }

    private final int a(Transaction transaction) {
        Type aiX = transaction.aiX();
        if (aiX != null && d.axg[aiX.ordinal()] == 1) {
            return com.iqoption.j.c.c.ic_history_withdraw;
        }
        return com.iqoption.j.c.c.ic_history_deposit;
    }

    private final void a(e eVar) {
        Transaction bnc = eVar.bnc();
        TextView textView = ((o) getBinding()).dKl;
        kotlin.jvm.internal.i.e(textView, "binding.operationAmount");
        textView.setText(com.iqoption.core.util.e.a(bnc.ZC(), eVar.VM(), false, 2, null));
        int i = bnc.aiY() == Status.COMPLETED ? com.iqoption.j.c.a.white : com.iqoption.j.c.a.grey_blue_70;
        View root = ((o) getBinding()).getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        Context context = root.getContext();
        textView = ((o) getBinding()).dKl;
        kotlin.jvm.internal.i.e(context, "context");
        textView.setTextColor(com.iqoption.core.ext.a.k(context, i));
    }

    private final void b(e eVar) {
        String string;
        com.iqoption.core.microservices.configuration.a.d VM = eVar.VM();
        Double aiZ = eVar.bnc().aiZ();
        double doubleValue = aiZ != null ? aiZ.doubleValue() : 0.0d;
        if (doubleValue > ((double) null)) {
            int i = f.commission_n1;
            Object[] objArr = new Object[1];
            objArr[0] = com.iqoption.core.util.e.a(doubleValue, VM.getMinorUnits(), VM.getMask(), true, false, false, false, null, null, 248, null);
            string = d.getString(i, objArr);
        } else {
            string = eVar.bnc().aiX() == Type.WITHDRAWAL ? d.getString(f.no_commission) : null;
        }
        String str = "binding.operationCommission";
        if (string != null) {
            TextView textView = ((o) getBinding()).dKn;
            kotlin.jvm.internal.i.e(textView, str);
            com.iqoption.core.ext.a.ak(textView);
            textView = ((o) getBinding()).dKn;
            kotlin.jvm.internal.i.e(textView, str);
            textView.setText(string);
            return;
        }
        TextView textView2 = ((o) getBinding()).dKn;
        kotlin.jvm.internal.i.e(textView2, str);
        com.iqoption.core.ext.a.al(textView2);
    }

    private final String b(Transaction transaction) {
        Type aiX = transaction.aiX();
        if (aiX != null) {
            int i = d.aFX[aiX.ordinal()];
            String str = "itemView";
            View view;
            String string;
            if (i == 1) {
                view = this.itemView;
                kotlin.jvm.internal.i.e(view, str);
                string = view.getResources().getString(f.refill);
                kotlin.jvm.internal.i.e(string, "itemView.resources.getString(R.string.refill)");
                return string;
            } else if (i == 2) {
                view = this.itemView;
                kotlin.jvm.internal.i.e(view, str);
                string = view.getResources().getString(f.withdrawal);
                kotlin.jvm.internal.i.e(string, "itemView.resources.getString(R.string.withdrawal)");
                return string;
            } else if (i == 3) {
                view = this.itemView;
                kotlin.jvm.internal.i.e(view, str);
                string = view.getResources().getString(f.tournament_rebuy);
                kotlin.jvm.internal.i.e(string, "itemView.resources.getSt….string.tournament_rebuy)");
                return string;
            } else if (i == 4) {
                view = this.itemView;
                kotlin.jvm.internal.i.e(view, str);
                string = view.getResources().getString(f.tournament_reward);
                kotlin.jvm.internal.i.e(string, "itemView.resources.getSt…string.tournament_reward)");
                return string;
            }
        }
        return "";
    }
}
