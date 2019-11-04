package io.card.payment.i18n.a;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LocalizedStringsES */
public class g implements c<StringKey> {
    private static Map<StringKey, String> eLx = new HashMap();
    private static Map<String, String> eLy = new HashMap();

    public String getName() {
        return "es";
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

    public g() {
        eLx.put(StringKey.CANCEL, "Cancelar");
        eLx.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        eLx.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        eLx.put(StringKey.CARDTYPE_JCB, "JCB");
        eLx.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        eLx.put(StringKey.CARDTYPE_VISA, "Visa");
        eLx.put(StringKey.DONE, "Hecho");
        eLx.put(StringKey.ENTRY_CVV, "CVV");
        eLx.put(StringKey.ENTRY_POSTAL_CODE, "Código postal");
        eLx.put(StringKey.ENTRY_CARDHOLDER_NAME, "Nombre del titular de la tarjeta");
        eLx.put(StringKey.ENTRY_EXPIRES, "Vence");
        eLx.put(StringKey.EXPIRES_PLACEHOLDER, "MM/AA");
        eLx.put(StringKey.SCAN_GUIDE, "Mantén la tarjeta aquí.\nSe escaneará automáticamente.");
        eLx.put(StringKey.KEYBOARD, "Teclado…");
        eLx.put(StringKey.ENTRY_CARD_NUMBER, "Número de tarjeta");
        eLx.put(StringKey.MANUAL_ENTRY_TITLE, "Detalles de la tarjeta");
        eLx.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Este dispositivo no puede usar la cámara para leer números de tarjeta.");
        eLx.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "La cámara del dispositivo no está disponible.");
        eLx.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Al abrir la cámara, el dispositivo ha experimentado un error inesperado.");
    }
}
