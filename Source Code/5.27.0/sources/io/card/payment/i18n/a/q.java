package io.card.payment.i18n.a;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LocalizedStringsNB */
public class q implements c<StringKey> {
    private static Map<StringKey, String> eLx = new HashMap();
    private static Map<String, String> eLy = new HashMap();

    public String getName() {
        return "nb";
    }

    /* renamed from: b */
    public String a(StringKey stringKey, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stringKey.toString());
        stringBuilder.append("|");
        stringBuilder.append(str);
        str = stringBuilder.toString();
        if (eLy.containsKey(str)) {
            return (String) eLy.get(str);
        }
        return (String) eLx.get(stringKey);
    }

    public q() {
        eLx.put(StringKey.CANCEL, "Avbryt");
        eLx.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        eLx.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        eLx.put(StringKey.CARDTYPE_JCB, "JCB");
        eLx.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        eLx.put(StringKey.CARDTYPE_VISA, "Visa");
        eLx.put(StringKey.DONE, "Fullført");
        eLx.put(StringKey.ENTRY_CVV, "CVV");
        eLx.put(StringKey.ENTRY_POSTAL_CODE, "Postnummer");
        eLx.put(StringKey.ENTRY_CARDHOLDER_NAME, "Kortinnehaverens navn");
        eLx.put(StringKey.ENTRY_EXPIRES, "Utløper");
        eLx.put(StringKey.EXPIRES_PLACEHOLDER, "MM/ÅÅ");
        eLx.put(StringKey.SCAN_GUIDE, "Hold kortet her.\nDet skannes automatisk.");
        eLx.put(StringKey.KEYBOARD, "Tastatur …");
        eLx.put(StringKey.ENTRY_CARD_NUMBER, "Kortnummer");
        eLx.put(StringKey.MANUAL_ENTRY_TITLE, "Kortdetaljer");
        eLx.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Denne enheten kan ikke bruke kameraet til å lese kortnumre.");
        eLx.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Kameraet er utilgjengelig.");
        eLx.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Det oppstod en uventet feil ved kameraoppstart.");
    }
}
