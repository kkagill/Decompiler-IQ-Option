package io.card.payment.i18n.a;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LocalizedStringsIT */
public class l implements c<StringKey> {
    private static Map<StringKey, String> eLx = new HashMap();
    private static Map<String, String> eLy = new HashMap();

    public String getName() {
        return "it";
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

    public l() {
        eLx.put(StringKey.CANCEL, "Annulla");
        eLx.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        eLx.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        eLx.put(StringKey.CARDTYPE_JCB, "JCB");
        eLx.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        eLx.put(StringKey.CARDTYPE_VISA, "Visa");
        eLx.put(StringKey.DONE, "OK");
        eLx.put(StringKey.ENTRY_CVV, "CVV");
        eLx.put(StringKey.ENTRY_POSTAL_CODE, "CAP");
        eLx.put(StringKey.ENTRY_CARDHOLDER_NAME, "Titolare della carta");
        eLx.put(StringKey.ENTRY_EXPIRES, "Scadenza");
        eLx.put(StringKey.EXPIRES_PLACEHOLDER, "MM/AA");
        eLx.put(StringKey.SCAN_GUIDE, "Inquadra la carta.\nLa scansione è automatica.");
        eLx.put(StringKey.KEYBOARD, "Tastiera…");
        eLx.put(StringKey.ENTRY_CARD_NUMBER, "Numero di carta");
        eLx.put(StringKey.MANUAL_ENTRY_TITLE, "Dati carta");
        eLx.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "La fotocamera non legge il numero di carta.");
        eLx.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Fotocamera non disponibile.");
        eLx.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Errore inatteso nell’apertura della fotocamera.");
    }
}
