package io.card.payment.i18n.a;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LocalizedStringsIS */
public class k implements c<StringKey> {
    private static Map<StringKey, String> eLx = new HashMap();
    private static Map<String, String> eLy = new HashMap();

    public String getName() {
        return "is";
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

    public k() {
        eLx.put(StringKey.CANCEL, "Hætta við");
        eLx.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        eLx.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        eLx.put(StringKey.CARDTYPE_JCB, "JCB");
        eLx.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        eLx.put(StringKey.CARDTYPE_VISA, "Visa");
        eLx.put(StringKey.DONE, "Lokið");
        eLx.put(StringKey.ENTRY_CVV, "CVV");
        eLx.put(StringKey.ENTRY_POSTAL_CODE, "Póstnúmer");
        eLx.put(StringKey.ENTRY_CARDHOLDER_NAME, "Nafn Korthafa");
        eLx.put(StringKey.ENTRY_EXPIRES, "Rennur út");
        eLx.put(StringKey.EXPIRES_PLACEHOLDER, "MM/ÁÁ");
        eLx.put(StringKey.SCAN_GUIDE, "Haltu kortinu kyrru hér.\nÞað verður sjálvirkt skannað.");
        eLx.put(StringKey.KEYBOARD, "Lyklaborð…");
        eLx.put(StringKey.ENTRY_CARD_NUMBER, "Kortanúmar");
        eLx.put(StringKey.MANUAL_ENTRY_TITLE, "Kortaupplýsingar");
        eLx.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Þetta tæki getur ekki notað myndavélina til að lesa af númer af kortinu.");
        eLx.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Ekki næst samband við myndavélina.");
        eLx.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Upp kom villa við að opna myndavélina..");
    }
}
