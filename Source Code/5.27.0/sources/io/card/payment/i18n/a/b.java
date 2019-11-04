package io.card.payment.i18n.a;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LocalizedStringsDA */
public class b implements c<StringKey> {
    private static Map<StringKey, String> eLx = new HashMap();
    private static Map<String, String> eLy = new HashMap();

    public String getName() {
        return "da";
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

    public b() {
        eLx.put(StringKey.CANCEL, "Annuller");
        eLx.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        eLx.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        eLx.put(StringKey.CARDTYPE_JCB, "JCB");
        eLx.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        eLx.put(StringKey.CARDTYPE_VISA, "Visa");
        eLx.put(StringKey.DONE, "Udført");
        eLx.put(StringKey.ENTRY_CVV, "Kontrolcifre");
        eLx.put(StringKey.ENTRY_POSTAL_CODE, "Postnummer");
        eLx.put(StringKey.ENTRY_CARDHOLDER_NAME, "Kortindehaverens navn");
        eLx.put(StringKey.ENTRY_EXPIRES, "Udløbsdato");
        eLx.put(StringKey.EXPIRES_PLACEHOLDER, "MM/ÅÅ");
        eLx.put(StringKey.SCAN_GUIDE, "Hold kortet her.\nDet scannes automatisk.");
        eLx.put(StringKey.KEYBOARD, "Tastatur…");
        eLx.put(StringKey.ENTRY_CARD_NUMBER, "Kortnummer");
        eLx.put(StringKey.MANUAL_ENTRY_TITLE, "Kortoplysninger");
        eLx.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Denne enhed kan ikke anvende kameraet til at læse kortnumre.");
        eLx.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Enhed kamera ikke er tilgængelig.");
        eLx.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Enheden havde en uventet fejl under åbning af kamera.");
    }
}
