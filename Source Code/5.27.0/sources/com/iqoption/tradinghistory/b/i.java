package com.iqoption.tradinghistory.b;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.position.CloseReason;
import com.iqoption.core.microservices.tradingengine.response.position.MultiPositionItem.WinStatus;

@kotlin.i(bne = {1, 1, 15})
public final /* synthetic */ class i {
    public static final /* synthetic */ int[] aFX = new int[WinStatus.values().length];
    public static final /* synthetic */ int[] aFY = new int[CloseReason.values().length];
    public static final /* synthetic */ int[] aob = new int[InstrumentType.values().length];
    public static final /* synthetic */ int[] axg = new int[InstrumentType.values().length];

    static {
        aob[InstrumentType.DIGITAL_INSTRUMENT.ordinal()] = 1;
        aob[InstrumentType.FX_INSTRUMENT.ordinal()] = 2;
        axg[InstrumentType.TURBO_INSTRUMENT.ordinal()] = 1;
        axg[InstrumentType.BINARY_INSTRUMENT.ordinal()] = 2;
        aFX[WinStatus.WIN.ordinal()] = 1;
        aFX[WinStatus.LOST.ordinal()] = 2;
        aFX[WinStatus.SOLD.ordinal()] = 3;
        aFY[CloseReason.SOLD.ordinal()] = 1;
        aFY[CloseReason.EXPIRED.ordinal()] = 2;
        aFY[CloseReason.MARGIN_CALL.ordinal()] = 3;
        aFY[CloseReason.TAKE_PROFIT.ordinal()] = 4;
        aFY[CloseReason.STOP_LOSS.ordinal()] = 5;
        aFY[CloseReason.OVERNIGHT.ordinal()] = 6;
        aFY[CloseReason.WITHDRAW.ordinal()] = 7;
    }
}
