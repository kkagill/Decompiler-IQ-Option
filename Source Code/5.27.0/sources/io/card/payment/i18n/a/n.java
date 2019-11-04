package io.card.payment.i18n.a;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LocalizedStringsKO */
public class n implements c<StringKey> {
    private static Map<StringKey, String> eLx = new HashMap();
    private static Map<String, String> eLy = new HashMap();

    public String getName() {
        return "ko";
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

    public n() {
        eLx.put(StringKey.CANCEL, "취소");
        eLx.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        eLx.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        eLx.put(StringKey.CARDTYPE_JCB, "JCB");
        eLx.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        eLx.put(StringKey.CARDTYPE_VISA, "Visa");
        eLx.put(StringKey.DONE, "완료");
        eLx.put(StringKey.ENTRY_CVV, "CVV");
        eLx.put(StringKey.ENTRY_POSTAL_CODE, "우편번호");
        eLx.put(StringKey.ENTRY_CARDHOLDER_NAME, "카드 소유자 이름");
        eLx.put(StringKey.ENTRY_EXPIRES, "유효기간");
        eLx.put(StringKey.EXPIRES_PLACEHOLDER, "MM / YY");
        eLx.put(StringKey.SCAN_GUIDE, "카드를 여기에 갖다 대세요.\n자동으로 스캔됩니다.");
        eLx.put(StringKey.KEYBOARD, "키보드…");
        eLx.put(StringKey.ENTRY_CARD_NUMBER, "카드 번호");
        eLx.put(StringKey.MANUAL_ENTRY_TITLE, "카드 세부정보");
        eLx.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "기기가 카메라를 이용한 카드 숫자 판독을 지원하지 않습니다.");
        eLx.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "기기에서 카메라를 사용할 수 없습니다.");
        eLx.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "기기에서 카메라를 여는 동안 예상치 못한 오류가 발생했습니다.");
    }
}
