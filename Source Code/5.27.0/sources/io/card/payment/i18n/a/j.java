package io.card.payment.i18n.a;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LocalizedStringsHE */
public class j implements c<StringKey> {
    private static Map<StringKey, String> eLx = new HashMap();
    private static Map<String, String> eLy = new HashMap();

    public String getName() {
        return "he";
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

    public j() {
        eLx.put(StringKey.CANCEL, "ביטול");
        eLx.put(StringKey.CARDTYPE_AMERICANEXPRESS, "אמריקן אקספרס");
        eLx.put(StringKey.CARDTYPE_DISCOVER, "Discover‏");
        eLx.put(StringKey.CARDTYPE_JCB, "JCB‏");
        eLx.put(StringKey.CARDTYPE_MASTERCARD, "מאסטרקארד");
        eLx.put(StringKey.CARDTYPE_VISA, "ויזה");
        eLx.put(StringKey.DONE, "בוצע");
        eLx.put(StringKey.ENTRY_CVV, "קוד אימות כרטיס");
        eLx.put(StringKey.ENTRY_POSTAL_CODE, "מיקוד");
        eLx.put(StringKey.ENTRY_CARDHOLDER_NAME, "שם בעל הכרטיס");
        eLx.put(StringKey.ENTRY_EXPIRES, "תאריך תפוגה");
        eLx.put(StringKey.EXPIRES_PLACEHOLDER, "MM/YY‏");
        eLx.put(StringKey.SCAN_GUIDE, "החזק את הכרטיס כאן.\nהסריקה תתבצע באופן אוטומטי.");
        eLx.put(StringKey.KEYBOARD, "מקלדת…");
        eLx.put(StringKey.ENTRY_CARD_NUMBER, "מספר כרטיס");
        eLx.put(StringKey.MANUAL_ENTRY_TITLE, "פרטי כרטיס");
        eLx.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "המכשיר אינו מסוגל להשתמש במצלמה לקריאת מספרי כרטיס.");
        eLx.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "מצלמת המכשיר אינה זמינה.");
        eLx.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "המכשיר נתקל בשגיאה בלתי צפויה בזמן הפעלת המצלמה.");
    }
}
