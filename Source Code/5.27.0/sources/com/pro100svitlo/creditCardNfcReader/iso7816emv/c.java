package com.pro100svitlo.creditCardNfcReader.iso7816emv;

import com.pro100svitlo.creditCardNfcReader.a.a;
import com.pro100svitlo.creditCardNfcReader.model.enums.CountryCodeEnum;
import com.pro100svitlo.creditCardNfcReader.model.enums.CurrencyEnum;
import com.pro100svitlo.creditCardNfcReader.model.enums.TransactionTypeEnum;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: EmvTerminal */
public final class c {
    private static final SecureRandom eGz = new SecureRandom();

    public static byte[] a(e eVar) {
        Object bytes;
        byte[] bArr = new byte[eVar.getLength()];
        if (eVar.bgy() == b.eEI) {
            f fVar = new f();
            fVar.fV(true);
            fVar.fW(true);
            bytes = fVar.getBytes();
        } else {
            String str = "0";
            if (eVar.bgy() == b.eDO) {
                bytes = a.kX(org.apache.commons.lang3.c.g(String.valueOf(CountryCodeEnum.FR.getNumeric()), eVar.getLength() * 2, str));
            } else if (eVar.bgy() == b.eDj) {
                bytes = a.kX(org.apache.commons.lang3.c.g(String.valueOf(CurrencyEnum.EUR.getISOCodeNumeric()), eVar.getLength() * 2, str));
            } else if (eVar.bgy() == b.eDb) {
                bytes = a.kX(new SimpleDateFormat("yyMMdd").format(new Date()));
            } else if (eVar.bgy() == b.eDd) {
                bytes = new byte[]{(byte) TransactionTypeEnum.PURCHASE.getKey()};
            } else if (eVar.bgy() == b.eDt) {
                bytes = a.kX("00");
            } else if (eVar.bgy() == b.eEg) {
                bytes = new byte[]{(byte) 34};
            } else if (eVar.bgy() == b.eEe) {
                bytes = new byte[]{(byte) -32, (byte) -96, (byte) 0};
            } else if (eVar.bgy() == b.eEp) {
                bytes = new byte[]{(byte) -114, (byte) 0, (byte) -80, (byte) 80, (byte) 5};
            } else if (eVar.bgy() == b.eEX) {
                bytes = a.kX("7345123215904501");
            } else {
                if (eVar.bgy() == b.eEi) {
                    eGz.nextBytes(bArr);
                }
                bytes = null;
            }
        }
        if (bytes != null) {
            System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, bArr.length));
        }
        return bArr;
    }
}
