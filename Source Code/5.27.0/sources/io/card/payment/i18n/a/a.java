package io.card.payment.i18n.a;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LocalizedStringsAR */
public class a implements c<StringKey> {
    private static Map<StringKey, String> eLx = new HashMap();
    private static Map<String, String> eLy = new HashMap();

    public String getName() {
        return "ar";
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

    public a() {
        eLx.put(StringKey.CANCEL, "إلغاء");
        eLx.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express‏");
        eLx.put(StringKey.CARDTYPE_DISCOVER, "Discover‏");
        eLx.put(StringKey.CARDTYPE_JCB, "JCB‏");
        eLx.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard‏");
        eLx.put(StringKey.CARDTYPE_VISA, "Visa‏");
        eLx.put(StringKey.DONE, "تم");
        eLx.put(StringKey.ENTRY_CVV, "CVV‏");
        eLx.put(StringKey.ENTRY_POSTAL_CODE, "الرمز البريدي");
        eLx.put(StringKey.ENTRY_CARDHOLDER_NAME, "اسم صاحب البطاقة");
        eLx.put(StringKey.ENTRY_EXPIRES, "تاريخ انتهاء الصلاحية");
        eLx.put(StringKey.EXPIRES_PLACEHOLDER, "MM/YY‏");
        eLx.put(StringKey.SCAN_GUIDE, "امسك البطاقة هنا.\n ستمسح تلقائيا.");
        eLx.put(StringKey.KEYBOARD, "لوحة المفاتيح…");
        eLx.put(StringKey.ENTRY_CARD_NUMBER, "رقم البطاقة");
        eLx.put(StringKey.MANUAL_ENTRY_TITLE, "تفاصيل البطاقة");
        eLx.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "هذا الجهاز لا يمكنه استعمال الكاميرا لقراءة أرقام البطاقة.");
        eLx.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "كاميرا الجهاز غير متاحة.");
        eLx.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "الجهاز حدث به خطا غير متوقع عند فتح الكاميرا.");
    }
}
