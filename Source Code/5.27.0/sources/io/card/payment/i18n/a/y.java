package io.card.payment.i18n.a;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LocalizedStringsTR */
public class y implements c<StringKey> {
    private static Map<StringKey, String> eLx = new HashMap();
    private static Map<String, String> eLy = new HashMap();

    public String getName() {
        return "tr";
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

    public y() {
        eLx.put(StringKey.CANCEL, "İptal");
        eLx.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        eLx.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        eLx.put(StringKey.CARDTYPE_JCB, "JCB");
        eLx.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        eLx.put(StringKey.CARDTYPE_VISA, "Visa");
        eLx.put(StringKey.DONE, "Bitti");
        eLx.put(StringKey.ENTRY_CVV, "CVV");
        eLx.put(StringKey.ENTRY_POSTAL_CODE, "Posta Kodu");
        eLx.put(StringKey.ENTRY_CARDHOLDER_NAME, "Kart sahibinin adı");
        eLx.put(StringKey.ENTRY_EXPIRES, "Son kullanma tarihi");
        eLx.put(StringKey.EXPIRES_PLACEHOLDER, "AA/YY");
        eLx.put(StringKey.SCAN_GUIDE, "Kartınızı buraya tutun.\nOtomatik olarak taranacaktır.");
        eLx.put(StringKey.KEYBOARD, "Klavye…");
        eLx.put(StringKey.ENTRY_CARD_NUMBER, "Kart Numarası");
        eLx.put(StringKey.MANUAL_ENTRY_TITLE, "Kart Ayrıntıları");
        eLx.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Bu cihazın kamerası kart rakamlarını okuyamaz.");
        eLx.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Cihaz kamerası kullanılamıyor.");
        eLx.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Cihaz kamerayı açarken beklenmedik bir hata verdi.");
    }
}
