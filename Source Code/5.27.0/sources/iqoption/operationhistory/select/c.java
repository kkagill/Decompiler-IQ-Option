package iqoption.operationhistory.select;

import iqoption.operationhistory.OperationViewModel.FilterType;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class c {
    public static final /* synthetic */ int[] aob = new int[FilterType.values().length];

    static {
        aob[FilterType.DATE.ordinal()] = 1;
        aob[FilterType.OPERATION.ordinal()] = 2;
        aob[FilterType.STATUS.ordinal()] = 3;
    }
}
