package io.card.payment.i18n.a;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LocalizedStringsMS */
public class p implements c<StringKey> {
    private static Map<StringKey, String> eLx = new HashMap();
    private static Map<String, String> eLy = new HashMap();

    public String getName() {
        return "ms";
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

    public p() {
        eLx.put(StringKey.CANCEL, "Batal");
        eLx.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        eLx.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        eLx.put(StringKey.CARDTYPE_JCB, "JCB");
        eLx.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        eLx.put(StringKey.CARDTYPE_VISA, "Visa");
        eLx.put(StringKey.DONE, "Selesai");
        eLx.put(StringKey.ENTRY_CVV, "CVV");
        eLx.put(StringKey.ENTRY_POSTAL_CODE, "Poskod");
        eLx.put(StringKey.ENTRY_CARDHOLDER_NAME, "Nama Pemegang Kad");
        eLx.put(StringKey.ENTRY_EXPIRES, "Luput");
        eLx.put(StringKey.EXPIRES_PLACEHOLDER, "BB/TT");
        eLx.put(StringKey.SCAN_GUIDE, "Pegang kad di sini.\nIa akan mengimbas secara automatik.");
        eLx.put(StringKey.KEYBOARD, "Papan Kekunci…");
        eLx.put(StringKey.ENTRY_CARD_NUMBER, "Nombor Kad");
        eLx.put(StringKey.MANUAL_ENTRY_TITLE, "Butiran Kad");
        eLx.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Peranti ini tidak dapat menggunakan kamera untuk membaca nombor kad.");
        eLx.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Kamera peranti tidak tersedia.");
        eLx.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Peranti mengalami ralat tidak dijangka semasa membuka kamera.");
    }
}
