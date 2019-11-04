package com.iqoption.deposit.light.menu.scan;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.iqoption.deposit.b.ar;
import com.iqoption.deposit.card.ScanViewModel.ScanItem;
import com.iqoption.deposit.o.f;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, bng = {"Lcom/iqoption/deposit/light/menu/scan/ScanCardLightAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/iqoption/deposit/light/menu/scan/ScanCardLightViewHolder;", "listener", "Lcom/iqoption/deposit/menu/scan/ScanCardClickListener;", "(Lcom/iqoption/deposit/menu/scan/ScanCardClickListener;)V", "items", "", "Lcom/iqoption/deposit/card/ScanViewModel$ScanItem;", "getListener", "()Lcom/iqoption/deposit/menu/scan/ScanCardClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "deposit_release"})
/* compiled from: ScanCardLightAdapter.kt */
public final class a extends Adapter<b> {
    private final com.iqoption.deposit.c.c.a cFc;
    private final List<ScanItem> iA = m.listOf(ScanItem.CAMERA, ScanItem.NFC);

    public a(com.iqoption.deposit.c.c.a aVar) {
        kotlin.jvm.internal.i.f(aVar, CastExtraArgs.LISTENER);
        this.cFc = aVar;
    }

    /* renamed from: w */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), f.item_scan_card_light, viewGroup, false);
        kotlin.jvm.internal.i.e(inflate, "DataBindingUtil.inflate(…ard_light, parent, false)");
        return new b((ar) inflate, this.cFc);
    }

    public int getItemCount() {
        return this.iA.size();
    }

    /* renamed from: a */
    public void onBindViewHolder(b bVar, int i) {
        kotlin.jvm.internal.i.f(bVar, "holder");
        bVar.c((ScanItem) this.iA.get(i));
    }
}
