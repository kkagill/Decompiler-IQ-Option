package io.card.payment.i18n.a;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LocalizedStringsZH_HANS */
public class z implements c<StringKey> {
    private static Map<StringKey, String> eLx = new HashMap();
    private static Map<String, String> eLy = new HashMap();

    public String getName() {
        return "zh-Hans";
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

    public z() {
        eLx.put(StringKey.CANCEL, "取消");
        eLx.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        eLx.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        eLx.put(StringKey.CARDTYPE_JCB, "JCB");
        eLx.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        eLx.put(StringKey.CARDTYPE_VISA, "Visa");
        eLx.put(StringKey.DONE, "完成");
        eLx.put(StringKey.ENTRY_CVV, "CVV");
        eLx.put(StringKey.ENTRY_POSTAL_CODE, "邮政编码");
        eLx.put(StringKey.ENTRY_CARDHOLDER_NAME, "持卡人姓名");
        eLx.put(StringKey.ENTRY_EXPIRES, "有效期限：");
        eLx.put(StringKey.EXPIRES_PLACEHOLDER, "MM/YY");
        eLx.put(StringKey.SCAN_GUIDE, "持卡置于此处。\n设备会自动扫描卡。");
        eLx.put(StringKey.KEYBOARD, "键盘…");
        eLx.put(StringKey.ENTRY_CARD_NUMBER, "卡号");
        eLx.put(StringKey.MANUAL_ENTRY_TITLE, "卡详细信息");
        eLx.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "此设备无法使用摄像头读取卡号。");
        eLx.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "设备摄像头不可用。");
        eLx.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "设备打开摄像头时出现意外错误。");
    }
}
