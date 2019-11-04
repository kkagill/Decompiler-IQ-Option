package io.card.payment.i18n.a;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LocalizedStringsZH_HANT_TW */
public class ab implements c<StringKey> {
    private static Map<StringKey, String> eLx = new HashMap();
    private static Map<String, String> eLy = new HashMap();

    public String getName() {
        return "zh-Hant_TW";
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

    public ab() {
        eLx.put(StringKey.CANCEL, "取消");
        eLx.put(StringKey.CARDTYPE_AMERICANEXPRESS, "美國運通");
        eLx.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        eLx.put(StringKey.CARDTYPE_JCB, "JCB");
        eLx.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        eLx.put(StringKey.CARDTYPE_VISA, "Visa");
        eLx.put(StringKey.DONE, "完成");
        eLx.put(StringKey.ENTRY_CVV, "信用卡驗證碼");
        eLx.put(StringKey.ENTRY_POSTAL_CODE, "郵遞區號");
        eLx.put(StringKey.ENTRY_CARDHOLDER_NAME, "持卡人姓名");
        eLx.put(StringKey.ENTRY_EXPIRES, "到期日");
        eLx.put(StringKey.EXPIRES_PLACEHOLDER, "月 / 年");
        eLx.put(StringKey.SCAN_GUIDE, "將信用卡放在此處。\n系統將自動掃描。");
        eLx.put(StringKey.KEYBOARD, "鍵盤…");
        eLx.put(StringKey.ENTRY_CARD_NUMBER, "卡號");
        eLx.put(StringKey.MANUAL_ENTRY_TITLE, "信用卡詳細資料");
        eLx.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "此裝置無法使用相機讀取卡號。");
        eLx.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "無法使用相機。");
        eLx.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "啟動相機時發生意外的錯誤。");
    }
}
