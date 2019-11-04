package com.iqoption.deposit.card;

import com.iqoption.deposit.card.ScanViewModel.ScanItem;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class b {
    public static final /* synthetic */ int[] aob = new int[ScanItem.values().length];

    static {
        aob[ScanItem.CAMERA.ordinal()] = 1;
        aob[ScanItem.NFC.ordinal()] = 2;
    }
}
