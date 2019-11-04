package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: MetadataManager */
final class e {
    static final d afp = new d() {
        public InputStream ct(String str) {
            return e.class.getResourceAsStream(str);
        }
    };
    private static final ConcurrentHashMap<Integer, PhoneMetadata> afq = new ConcurrentHashMap();
    private static final ConcurrentHashMap<String, PhoneMetadata> afr = new ConcurrentHashMap();
    private static final Set<Integer> afs = a.xf();
    private static final Set<String> aft = h.yx();
    private static final Logger logger = Logger.getLogger(e.class.getName());

    private e() {
    }

    static <T> PhoneMetadata a(T t, ConcurrentHashMap<T, PhoneMetadata> concurrentHashMap, String str, d dVar) {
        PhoneMetadata phoneMetadata = (PhoneMetadata) concurrentHashMap.get(t);
        if (phoneMetadata != null) {
            return phoneMetadata;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("_");
        stringBuilder.append(t);
        str = stringBuilder.toString();
        List a = a(str, dVar);
        if (a.size() > 1) {
            Logger logger = logger;
            Level level = Level.WARNING;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("more than one metadata in file ");
            stringBuilder2.append(str);
            logger.log(level, stringBuilder2.toString());
        }
        PhoneMetadata phoneMetadata2 = (PhoneMetadata) a.get(0);
        PhoneMetadata phoneMetadata3 = (PhoneMetadata) concurrentHashMap.putIfAbsent(t, phoneMetadata2);
        if (phoneMetadata3 == null) {
            phoneMetadata3 = phoneMetadata2;
        }
        return phoneMetadata3;
    }

    private static List<PhoneMetadata> a(String str, d dVar) {
        InputStream ct = dVar.ct(str);
        StringBuilder stringBuilder;
        if (ct != null) {
            List xY = e(ct).xY();
            if (xY.size() != 0) {
                return xY;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("empty metadata: ");
            stringBuilder.append(str);
            throw new IllegalStateException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("missing metadata: ");
        stringBuilder.append(str);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0038 A:{Catch:{ IOException -> 0x003c }} */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0034 A:{SYNTHETIC, Splitter:B:24:0x0034} */
    private static com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadataCollection e(java.io.InputStream r5) {
        /*
        r0 = "error closing input stream (ignored)";
        r1 = "cannot load/parse metadata";
        r2 = 0;
        r3 = new java.io.ObjectInputStream;	 Catch:{ IOException -> 0x002b }
        r3.<init>(r5);	 Catch:{ IOException -> 0x002b }
        r2 = new com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadataCollection;	 Catch:{ all -> 0x0026 }
        r2.<init>();	 Catch:{ all -> 0x0026 }
        r2.readExternal(r3);	 Catch:{ IOException -> 0x001f }
        r3.close();	 Catch:{ IOException -> 0x0016 }
        goto L_0x001e;
    L_0x0016:
        r5 = move-exception;
        r1 = logger;
        r3 = java.util.logging.Level.WARNING;
        r1.log(r3, r0, r5);
    L_0x001e:
        return r2;
    L_0x001f:
        r2 = move-exception;
        r4 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0026 }
        r4.<init>(r1, r2);	 Catch:{ all -> 0x0026 }
        throw r4;	 Catch:{ all -> 0x0026 }
    L_0x0026:
        r1 = move-exception;
        goto L_0x0032;
    L_0x0028:
        r1 = move-exception;
        r3 = r2;
        goto L_0x0032;
    L_0x002b:
        r3 = move-exception;
        r4 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0028 }
        r4.<init>(r1, r3);	 Catch:{ all -> 0x0028 }
        throw r4;	 Catch:{ all -> 0x0028 }
    L_0x0032:
        if (r3 == 0) goto L_0x0038;
    L_0x0034:
        r3.close();	 Catch:{ IOException -> 0x003c }
        goto L_0x0044;
    L_0x0038:
        r5.close();	 Catch:{ IOException -> 0x003c }
        goto L_0x0044;
    L_0x003c:
        r5 = move-exception;
        r2 = logger;
        r3 = java.util.logging.Level.WARNING;
        r2.log(r3, r0, r5);
    L_0x0044:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.e.e(java.io.InputStream):com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadataCollection");
    }
}
