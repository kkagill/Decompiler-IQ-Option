package com.pro100svitlo.creditCardNfcReader.a;

import com.pro100svitlo.creditCardNfcReader.model.enums.a;
import org.slf4j.b;

/* compiled from: EnumUtils */
public final class c {
    private static final b eGN = org.slf4j.c.ac(c.class);

    public static <T extends a> T a(int i, Class<T> cls) {
        for (a aVar : (a[]) cls.getEnumConstants()) {
            if (aVar.getKey() == i) {
                return aVar;
            }
        }
        b bVar = eGN;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknow value:");
        stringBuilder.append(i);
        stringBuilder.append(" for Enum:");
        stringBuilder.append(cls.getName());
        bVar.error(stringBuilder.toString());
        return null;
    }

    private c() {
    }
}
