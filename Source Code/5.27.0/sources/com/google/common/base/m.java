package com.google.common.base;

import com.iqoption.dto.Currencies;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Strings */
public final class m {
    public static String g(String str, Object... objArr) {
        str = String.valueOf(str);
        int i = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i2 = 0; i2 < objArr.length; i2++) {
                objArr[i2] = ap(objArr[i2]);
            }
        }
        StringBuilder stringBuilder = new StringBuilder(str.length() + (objArr.length * 16));
        int i3 = 0;
        while (i < objArr.length) {
            int indexOf = str.indexOf(Currencies.REPLACE_CURRENCY_MASK, i3);
            if (indexOf == -1) {
                break;
            }
            stringBuilder.append(str, i3, indexOf);
            i3 = i + 1;
            stringBuilder.append(objArr[i]);
            int i4 = i3;
            i3 = indexOf + 2;
            i = i4;
        }
        stringBuilder.append(str, i3, str.length());
        if (i < objArr.length) {
            stringBuilder.append(" [");
            int i5 = i + 1;
            stringBuilder.append(objArr[i]);
            while (i5 < objArr.length) {
                stringBuilder.append(", ");
                i = i5 + 1;
                stringBuilder.append(objArr[i5]);
                i5 = i;
            }
            stringBuilder.append(']');
        }
        return stringBuilder.toString();
    }

    private static String ap(Object obj) {
        try {
            obj = String.valueOf(obj);
            return obj;
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(obj.getClass().getName());
            stringBuilder.append('@');
            stringBuilder.append(Integer.toHexString(System.identityHashCode(obj)));
            String stringBuilder2 = stringBuilder.toString();
            Logger logger = Logger.getLogger("com.google.common.base.Strings");
            Level level = Level.WARNING;
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Exception during lenientFormat for ");
            stringBuilder3.append(stringBuilder2);
            logger.log(level, stringBuilder3.toString(), e);
            stringBuilder = new StringBuilder();
            stringBuilder.append("<");
            stringBuilder.append(stringBuilder2);
            stringBuilder.append(" threw ");
            stringBuilder.append(e.getClass().getName());
            stringBuilder.append(">");
            return stringBuilder.toString();
        }
    }
}
