package kotlin.reflect.jvm.internal.impl.metadata.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Level;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind;
import kotlin.reflect.jvm.internal.impl.protobuf.n;

/* compiled from: VersionRequirement.kt */
public final class i {
    public static final a foi = new a();
    private final b foe;
    private final VersionKind fof;
    private final DeprecationLevel fog;
    private final Integer foh;
    private final String message;

    /* compiled from: VersionRequirement.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final List<i> a(n nVar, c cVar, k kVar) {
            Object bAQ;
            kotlin.jvm.internal.i.f(nVar, "proto");
            kotlin.jvm.internal.i.f(cVar, "nameResolver");
            kotlin.jvm.internal.i.f(kVar, "table");
            if (nVar instanceof Class) {
                bAQ = ((Class) nVar).bAQ();
            } else if (nVar instanceof Constructor) {
                bAQ = ((Constructor) nVar).bAQ();
            } else if (nVar instanceof Function) {
                bAQ = ((Function) nVar).bAQ();
            } else if (nVar instanceof Property) {
                bAQ = ((Property) nVar).bAQ();
            } else if (nVar instanceof TypeAlias) {
                bAQ = ((TypeAlias) nVar).bAQ();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected declaration: ");
                stringBuilder.append(nVar.getClass());
                throw new IllegalStateException(stringBuilder.toString());
            }
            kotlin.jvm.internal.i.e(bAQ, "ids");
            Collection arrayList = new ArrayList();
            for (Integer num : (Iterable) bAQ) {
                a aVar = i.foi;
                kotlin.jvm.internal.i.e(num, "id");
                i a = aVar.a(num.intValue(), cVar, kVar);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return (List) arrayList;
        }

        public final i a(int i, c cVar, k kVar) {
            kotlin.jvm.internal.i.f(cVar, "nameResolver");
            kotlin.jvm.internal.i.f(kVar, "table");
            VersionRequirement lH = kVar.lH(i);
            i iVar = null;
            if (lH == null) {
                return null;
            }
            DeprecationLevel deprecationLevel;
            b b = b.fok.b(lH.bGJ() ? Integer.valueOf(lH.getVersion()) : null, lH.bGK() ? Integer.valueOf(lH.bGL()) : null);
            Level bGN = lH.bGN();
            if (bGN == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            int i2 = j.aob[bGN.ordinal()];
            if (i2 == 1) {
                deprecationLevel = DeprecationLevel.WARNING;
            } else if (i2 == 2) {
                deprecationLevel = DeprecationLevel.ERROR;
            } else if (i2 == 3) {
                deprecationLevel = DeprecationLevel.HIDDEN;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            DeprecationLevel deprecationLevel2 = deprecationLevel;
            Integer valueOf = lH.bGO() ? Integer.valueOf(lH.getErrorCode()) : null;
            if (lH.bGP()) {
                iVar = cVar.getString(lH.bGQ());
            }
            i iVar2 = iVar;
            VersionKind bGS = lH.bGS();
            kotlin.jvm.internal.i.e(bGS, "info.versionKind");
            return new i(b, bGS, deprecationLevel2, valueOf, iVar2);
        }
    }

    /* compiled from: VersionRequirement.kt */
    public static final class b {
        public static final b foj = new b(256, 256, 256);
        public static final a fok = new a();
        private final int fnl;
        private final int major;
        private final int minor;

        /* compiled from: VersionRequirement.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(f fVar) {
                this();
            }

            public final b b(Integer num, Integer num2) {
                if (num2 != null) {
                    return new b(num2.intValue() & 255, (num2.intValue() >> 8) & 255, (num2.intValue() >> 16) & 255);
                }
                if (num != null) {
                    return new b(num.intValue() & 7, (num.intValue() >> 3) & 15, (num.intValue() >> 7) & 127);
                }
                return b.foj;
            }
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if ((this.major == bVar.major ? 1 : null) != null) {
                        if ((this.minor == bVar.minor ? 1 : null) != null) {
                            if ((this.fnl == bVar.fnl ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.major * 31) + this.minor) * 31) + this.fnl;
        }

        public b(int i, int i2, int i3) {
            this.major = i;
            this.minor = i2;
            this.fnl = i3;
        }

        public /* synthetic */ b(int i, int i2, int i3, int i4, f fVar) {
            if ((i4 & 4) != 0) {
                i3 = 0;
            }
            this(i, i2, i3);
        }

        public final String boi() {
            StringBuilder stringBuilder;
            int i;
            if (this.fnl == 0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(this.major);
                stringBuilder.append('.');
                i = this.minor;
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(this.major);
                stringBuilder.append('.');
                stringBuilder.append(this.minor);
                stringBuilder.append('.');
                i = this.fnl;
            }
            stringBuilder.append(i);
            return stringBuilder.toString();
        }

        public String toString() {
            return boi();
        }
    }

    public i(b bVar, VersionKind versionKind, DeprecationLevel deprecationLevel, Integer num, String str) {
        kotlin.jvm.internal.i.f(bVar, "version");
        kotlin.jvm.internal.i.f(versionKind, "kind");
        kotlin.jvm.internal.i.f(deprecationLevel, "level");
        this.foe = bVar;
        this.fof = versionKind;
        this.fog = deprecationLevel;
        this.foh = num;
        this.message = str;
    }

    public final b bHp() {
        return this.foe;
    }

    public final VersionKind bHq() {
        return this.fof;
    }

    public String toString() {
        StringBuilder stringBuilder;
        String stringBuilder2;
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("since ");
        stringBuilder3.append(this.foe);
        stringBuilder3.append(' ');
        stringBuilder3.append(this.fog);
        String str = "";
        if (this.foh != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(" error ");
            stringBuilder.append(this.foh);
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = str;
        }
        stringBuilder3.append(stringBuilder2);
        if (this.message != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(": ");
            stringBuilder.append(this.message);
            str = stringBuilder.toString();
        }
        stringBuilder3.append(str);
        return stringBuilder3.toString();
    }
}
