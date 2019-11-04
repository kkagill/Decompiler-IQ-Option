package iqoption.operationhistory.b;

import com.iqoption.core.microservices.transaction.Transaction.Status;
import com.iqoption.core.microservices.transaction.Transaction.Type;
import kotlin.i;

@i(bne = {1, 1, 15})
public final /* synthetic */ class d {
    public static final /* synthetic */ int[] aFX = new int[Type.values().length];
    public static final /* synthetic */ int[] aob = new int[Status.values().length];
    public static final /* synthetic */ int[] axg = new int[Type.values().length];

    static {
        aob[Status.CANCELLED.ordinal()] = 1;
        aob[Status.FAILED.ordinal()] = 2;
        axg[Type.WITHDRAWAL.ordinal()] = 1;
        aFX[Type.DEPOSIT.ordinal()] = 1;
        aFX[Type.WITHDRAWAL.ordinal()] = 2;
        aFX[Type.TOURNAMENT_REBUY.ordinal()] = 3;
        aFX[Type.TOURNAMENT_REWARD.ordinal()] = 4;
    }
}
