package io.card.payment.i18n.a;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LocalizedStringsFR */
public class i implements c<StringKey> {
    private static Map<StringKey, String> eLx = new HashMap();
    private static Map<String, String> eLy = new HashMap();

    public String getName() {
        return "fr";
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

    public i() {
        eLx.put(StringKey.CANCEL, "Annuler");
        eLx.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        eLx.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        eLx.put(StringKey.CARDTYPE_JCB, "JCB");
        eLx.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        eLx.put(StringKey.CARDTYPE_VISA, "Visa");
        eLx.put(StringKey.DONE, "OK");
        eLx.put(StringKey.ENTRY_CVV, "Crypto.");
        eLx.put(StringKey.ENTRY_POSTAL_CODE, "Code postal");
        eLx.put(StringKey.ENTRY_CARDHOLDER_NAME, "Nom du titulaire de la carte");
        eLx.put(StringKey.ENTRY_EXPIRES, "Date d’expiration");
        eLx.put(StringKey.EXPIRES_PLACEHOLDER, "MM/AA");
        eLx.put(StringKey.SCAN_GUIDE, "Maintenez la carte à cet endroit.\nElle va être automatiquement scannée.");
        eLx.put(StringKey.KEYBOARD, "Clavier…");
        eLx.put(StringKey.ENTRY_CARD_NUMBER, "Nº de carte");
        eLx.put(StringKey.MANUAL_ENTRY_TITLE, "Carte");
        eLx.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Cet appareil ne peut pas utiliser l’appareil photo pour lire les numéros de carte.");
        eLx.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "L’appareil photo n’est pas disponible.");
        eLx.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Une erreur s’est produite en ouvrant l’appareil photo.");
    }
}
