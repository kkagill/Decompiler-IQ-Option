package com.pro100svitlo.creditCardNfcReader.a;

import com.pro100svitlo.creditCardNfcReader.enums.SwEnum;
import java.util.Arrays;
import org.slf4j.b;
import org.slf4j.c;

/* compiled from: ResponseUtils */
public final class d {
    private static final b eGN = c.ac(d.class);

    public static boolean Q(byte[] bArr) {
        return a(bArr, SwEnum.SW_9000);
    }

    public static boolean a(byte[] bArr, SwEnum swEnum) {
        SwEnum sw = SwEnum.getSW(bArr);
        if (eGN.isDebugEnabled() && bArr != null) {
            String U = b.a.a.b.U(Arrays.copyOfRange(bArr, bArr.length - 2, bArr.length));
            b bVar = eGN;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Response Status <");
            stringBuilder.append(U);
            stringBuilder.append("> : ");
            stringBuilder.append(sw != null ? sw.getDetail() : "Unknow");
            bVar.q(stringBuilder.toString());
        }
        return sw != null && sw == swEnum;
    }

    private d() {
    }
}
