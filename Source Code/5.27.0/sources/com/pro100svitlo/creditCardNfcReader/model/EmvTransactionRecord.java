package com.pro100svitlo.creditCardNfcReader.model;

import com.pro100svitlo.creditCardNfcReader.model.enums.CountryCodeEnum;
import com.pro100svitlo.creditCardNfcReader.model.enums.CurrencyEnum;
import com.pro100svitlo.creditCardNfcReader.model.enums.TransactionTypeEnum;
import com.pro100svitlo.creditCardNfcReader.parser.apdu.a.c;
import com.pro100svitlo.creditCardNfcReader.parser.apdu.impl.AbstractByteBean;
import java.io.Serializable;
import java.util.Date;

public class EmvTransactionRecord extends AbstractByteBean<EmvTransactionRecord> implements Serializable {
    private static final long serialVersionUID = -7050737312961921452L;
    @c(bgX = "BCD_Format", bgZ = 1, bhb = "9f02", size = 48)
    private Float amount;
    @c(bgZ = 4, bhb = "5f2a", size = 16)
    private CurrencyEnum currency;
    @c(bgZ = 2, bha = true, bhb = "9f27", size = 8)
    private String cyptogramData;
    @c(bgX = "yyMMdd", bgY = 1, bgZ = 5, bhb = "9a", size = 24)
    private Date date;
    @c(bgZ = 3, bhb = "9f1a", size = 16)
    private CountryCodeEnum terminalCountry;
    @c(bgX = "HHmmss", bgY = 1, bgZ = 7, bhb = "9f21", size = 24)
    private Date time;
    @c(bgZ = 6, bha = true, bhb = "9c", size = 8)
    private TransactionTypeEnum transactionType;

    public Float bgH() {
        return this.amount;
    }

    public CurrencyEnum bgI() {
        return this.currency;
    }

    public void b(Float f) {
        this.amount = f;
    }

    public void a(CurrencyEnum currencyEnum) {
        this.currency = currencyEnum;
    }
}
