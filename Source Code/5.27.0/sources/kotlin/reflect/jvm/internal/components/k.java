package kotlin.reflect.jvm.internal.components;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.i;
import kotlin.reflect.jvm.internal.impl.load.kotlin.t;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R6\u0010\u0005\u001a*\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0006j\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b`\tX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000bj\b\u0012\u0004\u0012\u00020\u0007`\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, bng = {"Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider;", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/PackagePartProvider;", "classLoader", "Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "packageParts", "Ljava/util/HashMap;", "", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/HashMap;", "visitedModules", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "findPackageParts", "", "packageFqName", "getAnnotationsOnBinaryModule", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "moduleName", "registerModule", "", "EmptyEnumeration", "descriptors.runtime"})
/* compiled from: RuntimePackagePartProvider.kt */
public final class k implements t {
    private final ClassLoader eYQ;
    private final HashSet<String> eYZ = new HashSet();
    private final HashMap<String, LinkedHashSet<String>> eZa = new HashMap();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, bng = {"Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider$EmptyEnumeration;", "Ljava/util/Enumeration;", "", "()V", "hasMoreElements", "", "nextElement", "descriptors.runtime"})
    /* compiled from: RuntimePackagePartProvider.kt */
    private static final class a implements Enumeration {
        public static final a eZb = new a();

        public boolean hasMoreElements() {
            return false;
        }

        private a() {
        }

        /* renamed from: bqo */
        public Void nextElement() {
            throw new NoSuchElementException();
        }
    }

    public k(ClassLoader classLoader) {
        kotlin.jvm.internal.i.f(classLoader, "classLoader");
        this.eYQ = classLoader;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002d */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:6|7|8|9|10|11|12|(6:16|17|18|(10:20|21|22|(4:25|(2:27|54)(1:55)|28|23)|53|29|30|31|32|52)(1:51)|49|13)|50|44|45) */
    public final synchronized void lO(java.lang.String r9) {
        /*
        r8 = this;
        monitor-enter(r8);
        r0 = "moduleName";
        kotlin.jvm.internal.i.f(r9, r0);	 Catch:{ all -> 0x00bc }
        r0 = r8.eYZ;	 Catch:{ all -> 0x00bc }
        r0 = r0.add(r9);	 Catch:{ all -> 0x00bc }
        if (r0 != 0) goto L_0x0010;
    L_0x000e:
        monitor-exit(r8);
        return;
    L_0x0010:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00bc }
        r0.<init>();	 Catch:{ all -> 0x00bc }
        r1 = "META-INF/";
        r0.append(r1);	 Catch:{ all -> 0x00bc }
        r0.append(r9);	 Catch:{ all -> 0x00bc }
        r9 = ".kotlin_module";
        r0.append(r9);	 Catch:{ all -> 0x00bc }
        r9 = r0.toString();	 Catch:{ all -> 0x00bc }
        r0 = r8.eYQ;	 Catch:{ IOException -> 0x002d }
        r0 = r0.getResources(r9);	 Catch:{ IOException -> 0x002d }
        goto L_0x0031;
    L_0x002d:
        r0 = kotlin.reflect.jvm.internal.components.k.a.eZb;	 Catch:{ all -> 0x00bc }
        r0 = (java.util.Enumeration) r0;	 Catch:{ all -> 0x00bc }
    L_0x0031:
        r1 = "resources";
        kotlin.jvm.internal.i.e(r0, r1);	 Catch:{ all -> 0x00bc }
        r0 = kotlin.collections.o.a(r0);	 Catch:{ all -> 0x00bc }
    L_0x003a:
        r1 = r0.hasNext();	 Catch:{ all -> 0x00bc }
        if (r1 == 0) goto L_0x00ba;
    L_0x0040:
        r1 = r0.next();	 Catch:{ all -> 0x00bc }
        r1 = (java.net.URL) r1;	 Catch:{ all -> 0x00bc }
        r1 = r1.openStream();	 Catch:{ UnsupportedOperationException -> 0x00b6, Exception -> 0x003a }
        if (r1 == 0) goto L_0x003a;
    L_0x004c:
        r1 = (java.io.Closeable) r1;	 Catch:{ UnsupportedOperationException -> 0x00b6, Exception -> 0x003a }
        r2 = 0;
        r2 = (java.lang.Throwable) r2;	 Catch:{ UnsupportedOperationException -> 0x00b6, Exception -> 0x003a }
        r3 = r1;
        r3 = (java.io.InputStream) r3;	 Catch:{ Throwable -> 0x00b0 }
        r4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.k.fpf;	 Catch:{ Throwable -> 0x00b0 }
        r3 = kotlin.d.a.b(r3);	 Catch:{ Throwable -> 0x00b0 }
        r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.i.a.fvo;	 Catch:{ Throwable -> 0x00b0 }
        r5 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.i) r5;	 Catch:{ Throwable -> 0x00b0 }
        r6 = kotlin.reflect.jvm.internal.components.RuntimePackagePartProvider$registerModule$1$mapping$1.eZc;	 Catch:{ Throwable -> 0x00b0 }
        r6 = (kotlin.jvm.a.b) r6;	 Catch:{ Throwable -> 0x00b0 }
        r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.s.a(r4, r3, r9, r5, r6);	 Catch:{ Throwable -> 0x00b0 }
        r3 = r3.bJS();	 Catch:{ Throwable -> 0x00b0 }
        r3 = r3.entrySet();	 Catch:{ Throwable -> 0x00b0 }
        r3 = r3.iterator();	 Catch:{ Throwable -> 0x00b0 }
    L_0x0072:
        r4 = r3.hasNext();	 Catch:{ Throwable -> 0x00b0 }
        if (r4 == 0) goto L_0x00a8;
    L_0x0078:
        r4 = r3.next();	 Catch:{ Throwable -> 0x00b0 }
        r4 = (java.util.Map.Entry) r4;	 Catch:{ Throwable -> 0x00b0 }
        r5 = r4.getKey();	 Catch:{ Throwable -> 0x00b0 }
        r5 = (java.lang.String) r5;	 Catch:{ Throwable -> 0x00b0 }
        r4 = r4.getValue();	 Catch:{ Throwable -> 0x00b0 }
        r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.m) r4;	 Catch:{ Throwable -> 0x00b0 }
        r6 = r8.eZa;	 Catch:{ Throwable -> 0x00b0 }
        r6 = (java.util.Map) r6;	 Catch:{ Throwable -> 0x00b0 }
        r7 = r6.get(r5);	 Catch:{ Throwable -> 0x00b0 }
        if (r7 != 0) goto L_0x009c;
    L_0x0094:
        r7 = new java.util.LinkedHashSet;	 Catch:{ Throwable -> 0x00b0 }
        r7.<init>();	 Catch:{ Throwable -> 0x00b0 }
        r6.put(r5, r7);	 Catch:{ Throwable -> 0x00b0 }
    L_0x009c:
        r7 = (java.util.LinkedHashSet) r7;	 Catch:{ Throwable -> 0x00b0 }
        r4 = r4.bJT();	 Catch:{ Throwable -> 0x00b0 }
        r4 = (java.util.Collection) r4;	 Catch:{ Throwable -> 0x00b0 }
        r7.addAll(r4);	 Catch:{ Throwable -> 0x00b0 }
        goto L_0x0072;
    L_0x00a8:
        r3 = kotlin.l.eVB;	 Catch:{ Throwable -> 0x00b0 }
        kotlin.d.b.a(r1, r2);	 Catch:{ UnsupportedOperationException -> 0x00b6, Exception -> 0x003a }
        goto L_0x003a;
    L_0x00ae:
        r3 = move-exception;
        goto L_0x00b2;
    L_0x00b0:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x00ae }
    L_0x00b2:
        kotlin.d.b.a(r1, r2);	 Catch:{ UnsupportedOperationException -> 0x00b6, Exception -> 0x003a }
        throw r3;	 Catch:{ UnsupportedOperationException -> 0x00b6, Exception -> 0x003a }
    L_0x00b6:
        r9 = move-exception;
        r9 = (java.lang.Throwable) r9;	 Catch:{ all -> 0x00bc }
        throw r9;	 Catch:{ all -> 0x00bc }
    L_0x00ba:
        monitor-exit(r8);
        return;
    L_0x00bc:
        r9 = move-exception;
        monitor-exit(r8);
        goto L_0x00c0;
    L_0x00bf:
        throw r9;
    L_0x00c0:
        goto L_0x00bf;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.components.k.lO(java.lang.String):void");
    }

    public synchronized List<String> lP(String str) {
        List<String> T;
        kotlin.jvm.internal.i.f(str, "packageFqName");
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.eZa.get(str);
        T = linkedHashSet != null ? u.T(linkedHashSet) : null;
        if (T == null) {
            T = m.emptyList();
        }
        return T;
    }
}
