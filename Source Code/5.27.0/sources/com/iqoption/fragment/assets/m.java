package com.iqoption.fragment.assets;

import com.iqoption.fragment.assets.model.AssetSortType;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class m {
    public static final /* synthetic */ int[] aob = new int[AssetSortType.values().length];

    static {
        aob[AssetSortType.BY_DIFF.ordinal()] = 1;
        aob[AssetSortType.BY_EXPIRATION.ordinal()] = 2;
    }
}
