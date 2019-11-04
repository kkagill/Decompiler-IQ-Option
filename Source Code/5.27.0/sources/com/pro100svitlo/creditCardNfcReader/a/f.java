package com.pro100svitlo.creditCardNfcReader.a;

import com.pro100svitlo.creditCardNfcReader.model.EmvCard;
import com.pro100svitlo.creditCardNfcReader.model.Service;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.b;
import org.slf4j.c;

/* compiled from: TrackUtils */
public final class f {
    private static final b eGN = c.ac(f.class);
    private static final Pattern eHf = Pattern.compile("([0-9]{1,19})D([0-9]{4})([0-9]{3})?(.*)");

    public static boolean a(EmvCard emvCard, byte[] bArr) {
        bArr = e.b(bArr, com.pro100svitlo.creditCardNfcReader.iso7816emv.b.eCA, com.pro100svitlo.creditCardNfcReader.iso7816emv.b.eEJ);
        if (bArr == null) {
            return false;
        }
        Matcher matcher = eHf.matcher(b.a.a.b.U(bArr));
        if (!matcher.find()) {
            return false;
        }
        emvCard.kU(matcher.group(1));
        String substring = matcher.group(2).substring(2, 4);
        String substring2 = matcher.group(2).substring(0, 2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(substring);
        stringBuilder.append("/");
        stringBuilder.append(substring2);
        emvCard.kV(stringBuilder.toString());
        emvCard.a(new Service(matcher.group(3)));
        return true;
    }

    private f() {
    }
}
