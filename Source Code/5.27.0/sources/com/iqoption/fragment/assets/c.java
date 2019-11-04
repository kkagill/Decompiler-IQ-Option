package com.iqoption.fragment.assets;

import com.iqoption.fragment.assets.model.AssetCategoryType;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class c {
    public static final /* synthetic */ int[] aob = new int[AssetCategoryType.values().length];

    static {
        aob[AssetCategoryType.BINARY.ordinal()] = 1;
        aob[AssetCategoryType.MULTI.ordinal()] = 2;
        aob[AssetCategoryType.DIGITAL.ordinal()] = 3;
        aob[AssetCategoryType.FX.ordinal()] = 4;
    }
}
