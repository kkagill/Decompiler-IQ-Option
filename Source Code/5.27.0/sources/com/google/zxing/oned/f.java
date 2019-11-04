package com.google.zxing.oned;

import com.google.android.gms.wallet.WalletConstants;
import com.jumio.analytics.MobileEvents;

/* compiled from: Code93Reader */
public final class f extends l {
    static final int ahG;
    private static final char[] ahy = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();
    static final int[] ahz;

    static {
        int[] iArr = new int[]{276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, WalletConstants.ERROR_CODE_INVALID_PARAMETERS, WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED, WalletConstants.ERROR_CODE_INVALID_TRANSACTION, 364, 358, 310, MobileEvents.EVENTTYPE_BENCHMARK, MobileEvents.EVENTTYPE_SDKLIFECYCLE, 468, 466, 458, 366, 374, 430, 294, 474, 470, MobileEvents.EVENTTYPE_SDKPARAMETERS, 350};
        ahz = iArr;
        ahG = iArr[47];
    }
}
