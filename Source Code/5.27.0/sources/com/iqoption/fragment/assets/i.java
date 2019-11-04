package com.iqoption.fragment.assets;

import com.iqoption.fragment.assets.model.AssetSortType;

@kotlin.i(bne = {1, 1, 15})
public final /* synthetic */ class i {
    public static final /* synthetic */ int[] aob = new int[AssetSortType.values().length];

    static {
        aob[AssetSortType.BY_DIFF.ordinal()] = 1;
        aob[AssetSortType.BY_SPREAD.ordinal()] = 2;
        aob[AssetSortType.BY_LEVERAGE.ordinal()] = 3;
    }
}
