package io.card.payment.i18n.a;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LocalizedStringsRU */
public class v implements c<StringKey> {
    private static Map<StringKey, String> eLx = new HashMap();
    private static Map<String, String> eLy = new HashMap();

    public String getName() {
        return "ru";
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

    public v() {
        eLx.put(StringKey.CANCEL, "Отмена");
        eLx.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        eLx.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        eLx.put(StringKey.CARDTYPE_JCB, "JCB");
        eLx.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        eLx.put(StringKey.CARDTYPE_VISA, "Visa");
        eLx.put(StringKey.DONE, "Готово");
        eLx.put(StringKey.ENTRY_CVV, "Код безопасности");
        eLx.put(StringKey.ENTRY_POSTAL_CODE, "Индекс");
        eLx.put(StringKey.ENTRY_CARDHOLDER_NAME, "Имя и фамилия владельца");
        eLx.put(StringKey.ENTRY_EXPIRES, "Действ. до");
        eLx.put(StringKey.EXPIRES_PLACEHOLDER, "ММ/ГГ");
        eLx.put(StringKey.SCAN_GUIDE, "Держите карту внутри рамки.\nОна будет считана автоматически.");
        eLx.put(StringKey.KEYBOARD, "Клавиатура…");
        eLx.put(StringKey.ENTRY_CARD_NUMBER, "Номер карты");
        eLx.put(StringKey.MANUAL_ENTRY_TITLE, "Ввести данные вручную");
        eLx.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "В данном устройстве нет опции считывания номера карты с помощью фотокамеры.");
        eLx.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Фотокамера устройства недоступна.");
        eLx.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Возникла незапланированная ошибка при открытии фотокамеры устройства.");
    }
}
