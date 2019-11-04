package com.iqoption.chat.fragment;

import com.iqoption.chat.e.j;
import com.iqoption.chat.f;
import com.iqoption.core.data.c.a;
import com.iqoption.core.data.c.b;
import com.iqoption.core.microservices.chat.response.l;
import com.iqoption.core.util.e;
import com.iqoption.dto.Currencies;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, bng = {"formatTradingVolumeReason", "", "Lcom/iqoption/chat/Resourcer;", "state", "Lcom/iqoption/core/microservices/chat/response/ChatState;", "chat_release"})
/* compiled from: RoomBottomBarDelegates.kt */
public final class u {
    private static final CharSequence a(f fVar, l lVar) {
        String mask;
        try {
            mask = ((a) b.bcS.VS().l(1, TimeUnit.SECONDS).bkS()).VM().getMask();
        } catch (Throwable th) {
            com.iqoption.i.b.N(new RuntimeException("Exception during getting selected balance in chat", th));
            mask = Currencies.REPLACE_CURRENCY_MASK;
        }
        int i = j.trading_volume_is_not_big_enough;
        Object[] objArr = new Object[2];
        BigDecimal valueOf = BigDecimal.valueOf(lVar.acD());
        kotlin.jvm.internal.i.e(valueOf, "BigDecimal.valueOf(state.tradingVolume)");
        String str = mask;
        objArr[0] = e.a(valueOf, 0, str, false, false, null, 29, null);
        valueOf = BigDecimal.valueOf(lVar.acE());
        kotlin.jvm.internal.i.e(valueOf, "BigDecimal.valueOf(state.tradingVolumeNeed)");
        objArr[1] = e.a(valueOf, 0, str, false, false, null, 29, null);
        return fVar.getString(i, objArr);
    }
}
