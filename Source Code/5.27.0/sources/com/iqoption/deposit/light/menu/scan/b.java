package com.iqoption.deposit.light.menu.scan;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.iqoption.deposit.b.ar;
import com.iqoption.deposit.card.ScanViewModel.ScanItem;
import com.iqoption.deposit.o.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, bng = {"Lcom/iqoption/deposit/light/menu/scan/ScanCardLightViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/iqoption/deposit/databinding/ItemScanCardLightBinding;", "listener", "Lcom/iqoption/deposit/menu/scan/ScanCardClickListener;", "(Lcom/iqoption/deposit/databinding/ItemScanCardLightBinding;Lcom/iqoption/deposit/menu/scan/ScanCardClickListener;)V", "getBinding", "()Lcom/iqoption/deposit/databinding/ItemScanCardLightBinding;", "getListener", "()Lcom/iqoption/deposit/menu/scan/ScanCardClickListener;", "bind", "", "scanItem", "Lcom/iqoption/deposit/card/ScanViewModel$ScanItem;", "deposit_release"})
/* compiled from: ScanCardLightViewHolder.kt */
public final class b extends ViewHolder {
    private final com.iqoption.deposit.c.c.a cFc;
    private final ar cFd;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: ScanCardLightViewHolder.kt */
    static final class a implements OnClickListener {
        final /* synthetic */ b cFe;
        final /* synthetic */ ScanItem cFf;

        a(b bVar, ScanItem scanItem) {
            this.cFe = bVar;
            this.cFf = scanItem;
        }

        public final void onClick(View view) {
            this.cFe.asb().d(this.cFf);
        }
    }

    public b(ar arVar, com.iqoption.deposit.c.c.a aVar) {
        kotlin.jvm.internal.i.f(arVar, "binding");
        kotlin.jvm.internal.i.f(aVar, CastExtraArgs.LISTENER);
        super(arVar.getRoot());
        this.cFd = arVar;
        this.cFc = aVar;
    }

    public final com.iqoption.deposit.c.c.a asb() {
        return this.cFc;
    }

    public final void c(ScanItem scanItem) {
        kotlin.jvm.internal.i.f(scanItem, "scanItem");
        int i = c.aob[scanItem.ordinal()];
        if (i == 1) {
            i = d.ic_scan_light;
        } else if (i == 2) {
            i = d.ic_nfc_light;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.cFd.cDi.setImageResource(i);
        this.cFd.cDj.setText(scanItem.getTitleRes());
        this.cFd.getRoot().setOnClickListener(new a(this, scanItem));
    }
}
