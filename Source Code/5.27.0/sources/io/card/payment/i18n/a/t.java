package io.card.payment.i18n.a;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LocalizedStringsPT */
public class t implements c<StringKey> {
    private static Map<StringKey, String> eLx = new HashMap();
    private static Map<String, String> eLy = new HashMap();

    public String getName() {
        return "pt";
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

    public t() {
        eLx.put(StringKey.CANCEL, "Cancelar");
        eLx.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        eLx.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        eLx.put(StringKey.CARDTYPE_JCB, "JCB");
        eLx.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        eLx.put(StringKey.CARDTYPE_VISA, "Visa");
        eLx.put(StringKey.DONE, "Concluir");
        eLx.put(StringKey.ENTRY_CVV, "CSC");
        eLx.put(StringKey.ENTRY_POSTAL_CODE, "Código postal");
        eLx.put(StringKey.ENTRY_CARDHOLDER_NAME, "Nome do titular do cartão");
        eLx.put(StringKey.ENTRY_EXPIRES, "Validade");
        eLx.put(StringKey.EXPIRES_PLACEHOLDER, "MM/AA");
        eLx.put(StringKey.SCAN_GUIDE, "Segure o cartão aqui.\nSerá lido automaticamente.");
        eLx.put(StringKey.KEYBOARD, "Teclado…");
        eLx.put(StringKey.ENTRY_CARD_NUMBER, "Número do cartão");
        eLx.put(StringKey.MANUAL_ENTRY_TITLE, "Detalhes do cartão");
        eLx.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Este dispositivo não pode utilizar a câmara para ler números de cartões.");
        eLx.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "A câmara do dispositivo não está disponível.");
        eLx.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Ocorreu um erro inesperado no dispositivo ao abrir a câmara.");
    }
}
