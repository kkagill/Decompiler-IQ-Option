package com.iqoption.fragment.assets;

import com.iqoption.fragment.assets.model.AssetSortType;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class f {
    public static final /* synthetic */ int[] aob = new int[AssetSortType.values().length];

    static {
        aob[AssetSortType.BY_NAME.ordinal()] = 1;
        aob[AssetSortType.BY_PROFIT.ordinal()] = 2;
        aob[AssetSortType.BY_DIFF.ordinal()] = 3;
        aob[AssetSortType.BY_SPOT_PROFIT.ordinal()] = 4;
        aob[AssetSortType.BY_EXPIRATION.ordinal()] = 5;
        aob[AssetSortType.BY_VOLUME.ordinal()] = 6;
        aob[AssetSortType.BY_SPREAD.ordinal()] = 7;
        aob[AssetSortType.BY_LEVERAGE.ordinal()] = 8;
    }
}
