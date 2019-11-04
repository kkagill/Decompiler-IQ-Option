package org.threeten.bp.zone;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.net.URL;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.threeten.bp.a.d;

/* compiled from: TzdbZoneRulesProvider */
public final class a extends c {
    private List<String> fJo;
    private final ConcurrentNavigableMap<String, a> fJp = new ConcurrentSkipListMap();
    private Set<String> fJq = new CopyOnWriteArraySet();

    /* compiled from: TzdbZoneRulesProvider */
    static class a {
        private final String fJr;
        private final String[] fJs;
        private final short[] fJt;
        private final AtomicReferenceArray<Object> fJu;

        a(String str, String[] strArr, short[] sArr, AtomicReferenceArray<Object> atomicReferenceArray) {
            this.fJu = atomicReferenceArray;
            this.fJr = str;
            this.fJs = strArr;
            this.fJt = sArr;
        }

        /* Access modifiers changed, original: 0000 */
        public ZoneRules nO(String str) {
            int binarySearch = Arrays.binarySearch(this.fJs, str);
            if (binarySearch < 0) {
                return null;
            }
            try {
                str = f(this.fJt[binarySearch]);
                return str;
            } catch (Exception e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid binary time-zone data: TZDB:");
                stringBuilder.append(str);
                stringBuilder.append(", version: ");
                stringBuilder.append(this.fJr);
                throw new ZoneRulesException(stringBuilder.toString(), e);
            }
        }

        /* Access modifiers changed, original: 0000 */
        public ZoneRules f(short s) {
            Object obj = this.fJu.get(s);
            if (obj instanceof byte[]) {
                obj = Ser.i(new DataInputStream(new ByteArrayInputStream((byte[]) obj)));
                this.fJu.set(s, obj);
            }
            return (ZoneRules) obj;
        }

        public String toString() {
            return this.fJr;
        }
    }

    public String toString() {
        return "TZDB";
    }

    public a() {
        if (!c(c.class.getClassLoader())) {
            throw new ZoneRulesException("No time-zone rules found for 'TZDB'");
        }
    }

    public a(InputStream inputStream) {
        try {
            u(inputStream);
        } catch (Exception e) {
            throw new ZoneRulesException("Unable to load TZDB time-zone rules", e);
        }
    }

    /* Access modifiers changed, original: protected */
    public Set<String> bTW() {
        return new HashSet(this.fJo);
    }

    /* Access modifiers changed, original: protected */
    public ZoneRules G(String str, boolean z) {
        d.requireNonNull(str, "zoneId");
        ZoneRules nO = ((a) this.fJp.lastEntry().getValue()).nO(str);
        if (nO != null) {
            return nO;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown time-zone ID: ");
        stringBuilder.append(str);
        throw new ZoneRulesException(stringBuilder.toString());
    }

    private boolean c(ClassLoader classLoader) {
        Throwable e;
        StringBuilder stringBuilder;
        Object obj = null;
        try {
            Enumeration resources = classLoader.getResources("org/threeten/bp/TZDB.dat");
            int i = 0;
            while (resources.hasMoreElements()) {
                URL url = (URL) resources.nextElement();
                try {
                    i |= c(url);
                    URL url2 = url;
                } catch (Exception e2) {
                    e = e2;
                    obj = url;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Unable to load TZDB time-zone rules: ");
                    stringBuilder.append(obj);
                    throw new ZoneRulesException(stringBuilder.toString(), e);
                }
            }
            return i;
        } catch (Exception e3) {
            e = e3;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to load TZDB time-zone rules: ");
            stringBuilder.append(obj);
            throw new ZoneRulesException(stringBuilder.toString(), e);
        }
    }

    private boolean c(URL url) {
        boolean z = false;
        if (this.fJq.add(url.toExternalForm())) {
            InputStream inputStream = null;
            try {
                inputStream = url.openStream();
                z = false | u(inputStream);
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        }
        return z;
    }

    private boolean u(InputStream inputStream) {
        boolean z = false;
        for (a aVar : v(inputStream)) {
            a aVar2 = (a) this.fJp.putIfAbsent(aVar.fJr, aVar);
            if (aVar2 == null || aVar2.fJr.equals(aVar.fJr)) {
                z = true;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Data already loaded for TZDB time-zone rules version: ");
                stringBuilder.append(aVar.fJr);
                throw new ZoneRulesException(stringBuilder.toString());
            }
        }
        return z;
    }

    private Iterable<a> v(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String str = "File format not recognised";
        if (dataInputStream.readByte() == (byte) 1) {
            if ("TZDB".equals(dataInputStream.readUTF())) {
                short s;
                short s2;
                short readShort = dataInputStream.readShort();
                String[] strArr = new String[readShort];
                for (s = (short) 0; s < readShort; s++) {
                    strArr[s] = dataInputStream.readUTF();
                }
                s = dataInputStream.readShort();
                String[] strArr2 = new String[s];
                for (short s3 = (short) 0; s3 < s; s3++) {
                    strArr2[s3] = dataInputStream.readUTF();
                }
                this.fJo = Arrays.asList(strArr2);
                s = dataInputStream.readShort();
                Object[] objArr = new Object[s];
                for (s2 = (short) 0; s2 < s; s2++) {
                    byte[] bArr = new byte[dataInputStream.readShort()];
                    dataInputStream.readFully(bArr);
                    objArr[s2] = bArr;
                }
                AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(objArr);
                HashSet hashSet = new HashSet(readShort);
                for (s2 = (short) 0; s2 < readShort; s2++) {
                    short readShort2 = dataInputStream.readShort();
                    String[] strArr3 = new String[readShort2];
                    short[] sArr = new short[readShort2];
                    for (short s4 = (short) 0; s4 < readShort2; s4++) {
                        strArr3[s4] = strArr2[dataInputStream.readShort()];
                        sArr[s4] = dataInputStream.readShort();
                    }
                    hashSet.add(new a(strArr[s2], strArr3, sArr, atomicReferenceArray));
                }
                return hashSet;
            }
            throw new StreamCorruptedException(str);
        }
        throw new StreamCorruptedException(str);
    }
}
