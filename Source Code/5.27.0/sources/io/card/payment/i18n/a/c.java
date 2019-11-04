package io.card.payment.i18n.a;

import io.card.payment.i18n.StringKey;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LocalizedStringsDE */
public class c implements io.card.payment.i18n.c<StringKey> {
    private static Map<StringKey, String> eLx = new HashMap();
    private static Map<String, String> eLy = new HashMap();

    public String getName() {
        return "de";
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

    public c() {
        eLx.put(StringKey.CANCEL, "Abbrechen");
        eLx.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        eLx.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        eLx.put(StringKey.CARDTYPE_JCB, "JCB");
        eLx.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        eLx.put(StringKey.CARDTYPE_VISA, "Visa");
        eLx.put(StringKey.DONE, "Fertig");
        eLx.put(StringKey.ENTRY_CVV, "Prüfnr.");
        eLx.put(StringKey.ENTRY_POSTAL_CODE, "PLZ");
        eLx.put(StringKey.ENTRY_CARDHOLDER_NAME, "Karteninhaber");
        eLx.put(StringKey.ENTRY_EXPIRES, "Gültig bis");
        eLx.put(StringKey.EXPIRES_PLACEHOLDER, "MM/JJ");
        eLx.put(StringKey.SCAN_GUIDE, "Kreditkarte hierhin halten.\nSie wird automatisch gelesen.");
        eLx.put(StringKey.KEYBOARD, "Tastatur…");
        eLx.put(StringKey.ENTRY_CARD_NUMBER, "Kartennummer");
        eLx.put(StringKey.MANUAL_ENTRY_TITLE, "Kreditkartendetails");
        eLx.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Dieses Gerät kann mit der Kamera keine Kreditkartennummern lesen.");
        eLx.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Die Kamera ist nicht verfügbar.");
        eLx.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Beim Öffnen der Kamera ist ein unerwarteter Fehler aufgetreten.");
    }
}
