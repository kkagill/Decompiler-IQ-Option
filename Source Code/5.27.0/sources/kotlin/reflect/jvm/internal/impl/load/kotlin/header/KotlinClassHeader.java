package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g;

/* compiled from: KotlinClassHeader.kt */
public final class KotlinClassHeader {
    private final d fmA;
    private final String[] fmB;
    private final String[] fmC;
    private final String fmD;
    private final int fmE;
    private final Kind fmy;
    private final g fmz;
    private final String packageName;
    private final String[] strings;

    /* compiled from: KotlinClassHeader.kt */
    public enum Kind {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);
        
        public static final a Companion = null;
        private static final Map<Integer, Kind> entryById = null;
        private final int id;

        /* compiled from: KotlinClassHeader.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(f fVar) {
                this();
            }

            public final Kind getById(int i) {
                Kind kind = (Kind) Kind.entryById.get(Integer.valueOf(i));
                return kind != null ? kind : Kind.UNKNOWN;
            }
        }

        public static final Kind getById(int i) {
            return Companion.getById(i);
        }

        private Kind(int i) {
            this.id = i;
        }

        static {
            Companion = new a();
            Kind[] values = values();
            Map linkedHashMap = new LinkedHashMap(m.bi(af.jL(values.length), 16));
            int length = values.length;
            int i;
            while (i < length) {
                Kind kind = values[i];
                linkedHashMap.put(Integer.valueOf(kind.id), kind);
                i++;
            }
            entryById = linkedHashMap;
        }
    }

    public KotlinClassHeader(Kind kind, g gVar, d dVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i, String str2) {
        i.f(kind, "kind");
        i.f(gVar, "metadataVersion");
        i.f(dVar, "bytecodeVersion");
        this.fmy = kind;
        this.fmz = gVar;
        this.fmA = dVar;
        this.fmB = strArr;
        this.fmC = strArr2;
        this.strings = strArr3;
        this.fmD = str;
        this.fmE = i;
        this.packageName = str2;
    }

    public final Kind byV() {
        return this.fmy;
    }

    public final g byW() {
        return this.fmz;
    }

    public final String[] byX() {
        return this.fmB;
    }

    public final String[] byY() {
        return this.fmC;
    }

    public final String[] byZ() {
        return this.strings;
    }

    public final String byS() {
        return (this.fmy == Kind.MULTIFILE_CLASS_PART ? 1 : null) != null ? this.fmD : null;
    }

    public final List<String> byT() {
        Object[] objArr = this.fmB;
        List<String> list = null;
        if ((this.fmy == Kind.MULTIFILE_CLASS ? 1 : null) == null) {
            objArr = null;
        }
        if (objArr != null) {
            list = h.asList(objArr);
        }
        return list != null ? list : m.emptyList();
    }

    public final boolean byU() {
        return (this.fmE & 2) != 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.fmy);
        stringBuilder.append(" version=");
        stringBuilder.append(this.fmz);
        return stringBuilder.toString();
    }
}
