package iqoption.operationhistory;

import iqoption.operationhistory.OperationViewModel.FilterType;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class b {
    public static final /* synthetic */ int[] aob = new int[FilterType.values().length];

    static {
        aob[FilterType.OPERATION.ordinal()] = 1;
        aob[FilterType.STATUS.ordinal()] = 2;
        aob[FilterType.DATE.ordinal()] = 3;
    }
}
