package io.card.payment.i18n.a;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LocalizedStringsSV */
public class w implements c<StringKey> {
    private static Map<StringKey, String> eLx = new HashMap();
    private static Map<String, String> eLy = new HashMap();

    public String getName() {
        return "sv";
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

    public w() {
        eLx.put(StringKey.CANCEL, "Avbryt");
        eLx.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        eLx.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        eLx.put(StringKey.CARDTYPE_JCB, "JCB");
        eLx.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        eLx.put(StringKey.CARDTYPE_VISA, "Visa");
        eLx.put(StringKey.DONE, "Klart");
        eLx.put(StringKey.ENTRY_CVV, "CVV");
        eLx.put(StringKey.ENTRY_POSTAL_CODE, "Postnummer");
        eLx.put(StringKey.ENTRY_CARDHOLDER_NAME, "Kortinnehavarens namn");
        eLx.put(StringKey.ENTRY_EXPIRES, "Går ut");
        eLx.put(StringKey.EXPIRES_PLACEHOLDER, "MM/ÅÅ");
        eLx.put(StringKey.SCAN_GUIDE, "Håll kortet här.\nDet skannas automatiskt.");
        eLx.put(StringKey.KEYBOARD, "Tangentbord …");
        eLx.put(StringKey.ENTRY_CARD_NUMBER, "Kortnummer");
        eLx.put(StringKey.MANUAL_ENTRY_TITLE, "Kortinformation");
        eLx.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Den här enheten kan inte använda kameran till att läsa kortnummer.");
        eLx.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Enhetens kamera är inte tillgänglig.");
        eLx.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Ett oväntat fel uppstod när enheten skulle öppna kameran.");
    }
}
