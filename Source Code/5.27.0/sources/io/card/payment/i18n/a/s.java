package io.card.payment.i18n.a;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LocalizedStringsPL */
public class s implements c<StringKey> {
    private static Map<StringKey, String> eLx = new HashMap();
    private static Map<String, String> eLy = new HashMap();

    public String getName() {
        return "pl";
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

    public s() {
        eLx.put(StringKey.CANCEL, "Anuluj");
        eLx.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        eLx.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        eLx.put(StringKey.CARDTYPE_JCB, "JCB");
        eLx.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        eLx.put(StringKey.CARDTYPE_VISA, "Visa");
        eLx.put(StringKey.DONE, "Gotowe");
        eLx.put(StringKey.ENTRY_CVV, "Kod CVV2/CVC2");
        eLx.put(StringKey.ENTRY_POSTAL_CODE, "Kod pocztowy");
        eLx.put(StringKey.ENTRY_CARDHOLDER_NAME, "Imię i nazwisko posiadacza karty");
        eLx.put(StringKey.ENTRY_EXPIRES, "Wygasa");
        eLx.put(StringKey.EXPIRES_PLACEHOLDER, "MM/RR");
        eLx.put(StringKey.SCAN_GUIDE, "Przytrzymaj kartę tutaj.\nZostanie ona zeskanowana automatycznie.");
        eLx.put(StringKey.KEYBOARD, "Klawiatura…");
        eLx.put(StringKey.ENTRY_CARD_NUMBER, "Numer karty");
        eLx.put(StringKey.MANUAL_ENTRY_TITLE, "Dane karty");
        eLx.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Na tym urządzeniu nie można odczytać numeru karty za pomocą aparatu.");
        eLx.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Aparat na tym urządzeniu jest niedostepny.");
        eLx.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Przy otwieraniu aparatu na tym urządzeniu wystąpił nieoczekiwany błąd.");
    }
}
