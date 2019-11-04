package com.iqoption.deposit.light.menu.scan;

import com.iqoption.deposit.card.ScanViewModel.ScanItem;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class c {
    public static final /* synthetic */ int[] aob = new int[ScanItem.values().length];

    static {
        aob[ScanItem.CAMERA.ordinal()] = 1;
        aob[ScanItem.NFC.ordinal()] = 2;
    }
}
