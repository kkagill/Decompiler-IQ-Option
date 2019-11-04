package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.a.c;
import kotlin.reflect.jvm.internal.impl.metadata.a.h;

/* compiled from: ProtoContainer.kt */
public abstract class r {
    private final c eWN;
    private final h eWO;
    private final aj fdu;

    /* compiled from: ProtoContainer.kt */
    public static final class a extends r {
        private final kotlin.reflect.jvm.internal.impl.name.a classId;
        private final boolean fcR;
        private final Class fuS;
        private final Kind fvA;
        private final a fvB;

        public final a bOt() {
            return this.fvB;
        }

        public a(Class classR, c cVar, h hVar, aj ajVar, a aVar) {
            i.f(classR, "classProto");
            i.f(cVar, "nameResolver");
            i.f(hVar, "typeTable");
            super(cVar, hVar, ajVar, null);
            this.fuS = classR;
            this.fvB = aVar;
            this.classId = q.a(cVar, this.fuS.bAu());
            Kind kind = (Kind) kotlin.reflect.jvm.internal.impl.metadata.a.b.fnt.get(this.fuS.getFlags());
            if (kind == null) {
                kind = Kind.CLASS;
            }
            this.fvA = kind;
            Boolean lB = kotlin.reflect.jvm.internal.impl.metadata.a.b.fnu.get(this.fuS.getFlags());
            i.e(lB, "Flags.IS_INNER.get(classProto.flags)");
            this.fcR = lB.booleanValue();
        }

        public final kotlin.reflect.jvm.internal.impl.name.a getClassId() {
            return this.classId;
        }

        public final Kind bOs() {
            return this.fvA;
        }

        public final boolean brz() {
            return this.fcR;
        }

        public kotlin.reflect.jvm.internal.impl.name.b bOr() {
            kotlin.reflect.jvm.internal.impl.name.b bJZ = this.classId.bJZ();
            i.e(bJZ, "classId.asSingleFqName()");
            return bJZ;
        }
    }

    /* compiled from: ProtoContainer.kt */
    public static final class b extends r {
        private final kotlin.reflect.jvm.internal.impl.name.b fdF;

        public b(kotlin.reflect.jvm.internal.impl.name.b bVar, c cVar, h hVar, aj ajVar) {
            i.f(bVar, "fqName");
            i.f(cVar, "nameResolver");
            i.f(hVar, "typeTable");
            super(cVar, hVar, ajVar, null);
            this.fdF = bVar;
        }

        public kotlin.reflect.jvm.internal.impl.name.b bOr() {
            return this.fdF;
        }
    }

    public abstract kotlin.reflect.jvm.internal.impl.name.b bOr();

    private r(c cVar, h hVar, aj ajVar) {
        this.eWN = cVar;
        this.eWO = hVar;
        this.fdu = ajVar;
    }

    public /* synthetic */ r(c cVar, h hVar, aj ajVar, f fVar) {
        this(cVar, hVar, ajVar);
    }

    public final c bot() {
        return this.eWN;
    }

    public final h bou() {
        return this.eWO;
    }

    public final aj brF() {
        return this.fdu;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(": ");
        stringBuilder.append(bOr());
        return stringBuilder.toString();
    }
}
