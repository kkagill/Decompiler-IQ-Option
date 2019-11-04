package io.card.payment.i18n.a;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LocalizedStringsNL */
public class r implements c<StringKey> {
    private static Map<StringKey, String> eLx = new HashMap();
    private static Map<String, String> eLy = new HashMap();

    public String getName() {
        return "nl";
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

    public r() {
        eLx.put(StringKey.CANCEL, "Annuleren");
        eLx.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        eLx.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        eLx.put(StringKey.CARDTYPE_JCB, "JCB");
        eLx.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        eLx.put(StringKey.CARDTYPE_VISA, "Visa");
        eLx.put(StringKey.DONE, "Gereed");
        eLx.put(StringKey.ENTRY_CVV, "CVV");
        eLx.put(StringKey.ENTRY_POSTAL_CODE, "Postcode");
        eLx.put(StringKey.ENTRY_CARDHOLDER_NAME, "Naam kaarthouder");
        eLx.put(StringKey.ENTRY_EXPIRES, "Vervaldatum");
        eLx.put(StringKey.EXPIRES_PLACEHOLDER, "MM/JJ");
        eLx.put(StringKey.SCAN_GUIDE, "Houd uw kaart hier.\nScannen gaat automatisch.");
        eLx.put(StringKey.KEYBOARD, "Toetsenbord…");
        eLx.put(StringKey.ENTRY_CARD_NUMBER, "Creditcardnummer");
        eLx.put(StringKey.MANUAL_ENTRY_TITLE, "Kaartgegevens");
        eLx.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Met de camera van dit apparaat kunnen geen kaartnummers worden gelezen.");
        eLx.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Camera apparaat niet beschikbaar.");
        eLx.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Er is een onverwachte fout opgetreden bij het starten van de camera.");
    }
}
