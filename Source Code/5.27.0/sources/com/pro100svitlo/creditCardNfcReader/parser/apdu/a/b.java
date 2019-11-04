package com.pro100svitlo.creditCardNfcReader.parser.apdu.a;

import com.pro100svitlo.creditCardNfcReader.iso7816emv.ITag;
import com.pro100svitlo.creditCardNfcReader.model.EmvTransactionRecord;
import com.pro100svitlo.creditCardNfcReader.parser.apdu.a;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: AnnotationUtils */
public final class b {
    private static final Class<? extends a>[] eGV = new Class[]{EmvTransactionRecord.class};
    private static final b eGW = new b();
    private final Map<String, Set<a>> eGX = new HashMap();
    private final Map<String, Map<ITag, a>> map = new HashMap();

    public static b bgT() {
        return eGW;
    }

    private b() {
        bgU();
    }

    private void bgU() {
        for (Class cls : eGV) {
            HashMap hashMap = new HashMap();
            TreeSet treeSet = new TreeSet();
            for (Field field : cls.getDeclaredFields()) {
                a aVar = new a();
                field.setAccessible(true);
                aVar.a(field);
                c cVar = (c) field.getAnnotation(c.class);
                if (cVar != null) {
                    aVar.a(cVar);
                    hashMap.put(aVar.bgy(), aVar);
                    try {
                        treeSet.add((a) aVar.clone());
                    } catch (CloneNotSupportedException unused) {
                    }
                }
            }
            this.eGX.put(cls.getName(), treeSet);
            this.map.put(cls.getName(), hashMap);
        }
    }

    public Map<String, Set<a>> bgV() {
        return this.eGX;
    }

    public Map<String, Map<ITag, a>> bgW() {
        return this.map;
    }
}
