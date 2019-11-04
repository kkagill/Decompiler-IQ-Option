package io.card.payment.i18n.a;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LocalizedStringsPT_BR */
public class u implements c<StringKey> {
    private static Map<StringKey, String> eLx = new HashMap();
    private static Map<String, String> eLy = new HashMap();

    public String getName() {
        return "pt_BR";
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

    public u() {
        eLx.put(StringKey.CANCEL, "Cancelar");
        eLx.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        eLx.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        eLx.put(StringKey.CARDTYPE_JCB, "JCB");
        eLx.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        eLx.put(StringKey.CARDTYPE_VISA, "Visa");
        eLx.put(StringKey.DONE, "Concluído");
        eLx.put(StringKey.ENTRY_CVV, "CVV");
        eLx.put(StringKey.ENTRY_POSTAL_CODE, "CEP");
        eLx.put(StringKey.ENTRY_CARDHOLDER_NAME, "Nome do titular do cartão");
        eLx.put(StringKey.ENTRY_EXPIRES, "Vencimento");
        eLx.put(StringKey.EXPIRES_PLACEHOLDER, "MM/AA");
        eLx.put(StringKey.SCAN_GUIDE, "Posicionar cartão aqui.\nEle será digitalizado automaticamente.");
        eLx.put(StringKey.KEYBOARD, "Teclado…");
        eLx.put(StringKey.ENTRY_CARD_NUMBER, "Número do Cartão");
        eLx.put(StringKey.MANUAL_ENTRY_TITLE, "Dados do cartão");
        eLx.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Este dispositivo não pode usar a câmera para ler números de cartão.");
        eLx.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "A câmera do dispositivo não está disponível.");
        eLx.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "O dispositivo sofreu um erro inesperado ao abrir a câmera.");
    }
}
