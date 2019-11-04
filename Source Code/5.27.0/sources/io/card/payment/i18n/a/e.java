package io.card.payment.i18n.a;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LocalizedStringsEN_AU */
public class e implements c<StringKey> {
    private static Map<StringKey, String> eLx = new HashMap();
    private static Map<String, String> eLy = new HashMap();

    public String getName() {
        return "en_AU";
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

    public e() {
        eLx.put(StringKey.CANCEL, "Cancel");
        eLx.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        eLx.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        eLx.put(StringKey.CARDTYPE_JCB, "JCB");
        eLx.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        eLx.put(StringKey.CARDTYPE_VISA, "Visa");
        eLx.put(StringKey.DONE, "Done");
        eLx.put(StringKey.ENTRY_CVV, "CVV");
        eLx.put(StringKey.ENTRY_POSTAL_CODE, "Postcode");
        eLx.put(StringKey.ENTRY_CARDHOLDER_NAME, "Cardholder Name");
        eLx.put(StringKey.ENTRY_EXPIRES, "Expires");
        eLx.put(StringKey.EXPIRES_PLACEHOLDER, "MM/YY");
        eLx.put(StringKey.SCAN_GUIDE, "Hold card here.\nIt will scan automatically.");
        eLx.put(StringKey.KEYBOARD, "Keyboard…");
        eLx.put(StringKey.ENTRY_CARD_NUMBER, "Card Number");
        eLx.put(StringKey.MANUAL_ENTRY_TITLE, "Card Details");
        eLx.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "This device cannot use the camera to read card numbers.");
        eLx.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Device camera is unavailable.");
        eLx.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "The device had an unexpected error opening the camera.");
    }
}
