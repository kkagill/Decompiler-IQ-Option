package io.card.payment.i18n.a;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LocalizedStringsJA */
public class m implements c<StringKey> {
    private static Map<StringKey, String> eLx = new HashMap();
    private static Map<String, String> eLy = new HashMap();

    public String getName() {
        return "ja";
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

    public m() {
        eLx.put(StringKey.CANCEL, "キャンセル");
        eLx.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        eLx.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        eLx.put(StringKey.CARDTYPE_JCB, "JCB");
        eLx.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        eLx.put(StringKey.CARDTYPE_VISA, "Visa");
        eLx.put(StringKey.DONE, "完了");
        eLx.put(StringKey.ENTRY_CVV, "カード確認コード");
        eLx.put(StringKey.ENTRY_POSTAL_CODE, "郵便番号");
        eLx.put(StringKey.ENTRY_CARDHOLDER_NAME, "カード保有者の名前");
        eLx.put(StringKey.ENTRY_EXPIRES, "有効期限");
        eLx.put(StringKey.EXPIRES_PLACEHOLDER, "MM/YY");
        eLx.put(StringKey.SCAN_GUIDE, "ここでカードをお持ちください。\n自動的にスキャンされます。");
        eLx.put(StringKey.KEYBOARD, "キーボード…");
        eLx.put(StringKey.ENTRY_CARD_NUMBER, "カード番号");
        eLx.put(StringKey.MANUAL_ENTRY_TITLE, "カードの詳細");
        eLx.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "この端末ではカード番号の読込にカメラを使えません。");
        eLx.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "端末のカメラを使用できません。");
        eLx.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "カメラを起動中に予期しないエラーが発生しました。");
    }
}
