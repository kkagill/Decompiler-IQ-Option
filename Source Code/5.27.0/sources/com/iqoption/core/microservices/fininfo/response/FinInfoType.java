package com.iqoption.core.microservices.fininfo.response;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, bng = {"Lcom/iqoption/core/microservices/fininfo/response/FinInfoType;", "", "(Ljava/lang/String;I)V", "STOCK", "COMMODITY", "FOREX", "INDEX", "CRYPTO", "ETF", "core_release"})
/* compiled from: ActiveFinInfoResult.kt */
public enum FinInfoType {
    STOCK,
    COMMODITY,
    FOREX,
    INDEX,
    CRYPTO,
    ETF
}
