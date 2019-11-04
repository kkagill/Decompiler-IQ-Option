package com.iqoption.deposit.c.c;

import com.iqoption.deposit.card.ScanViewModel.ScanItem;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/deposit/menu/scan/ScanCardClickListener;", "", "onScanCardClick", "", "scanItem", "Lcom/iqoption/deposit/card/ScanViewModel$ScanItem;", "deposit_release"})
/* compiled from: ScanCardClickListener.kt */
public interface a {
    void d(ScanItem scanItem);
}
