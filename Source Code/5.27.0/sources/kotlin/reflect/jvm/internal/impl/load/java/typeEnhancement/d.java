package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* compiled from: typeQualifiers.kt */
public final class d {
    private static final d fkF = new d(null, null, false, false, 8, null);
    public static final a fkG = new a();
    private final NullabilityQualifier fkB;
    private final MutabilityQualifier fkC;
    private final boolean fkD;
    private final boolean fkE;

    /* compiled from: typeQualifiers.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final d bxV() {
            return d.fkF;
        }
    }

    public d(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2) {
        this.fkB = nullabilityQualifier;
        this.fkC = mutabilityQualifier;
        this.fkD = z;
        this.fkE = z2;
    }

    public final NullabilityQualifier bxQ() {
        return this.fkB;
    }

    public final MutabilityQualifier bxR() {
        return this.fkC;
    }

    public final boolean bxS() {
        return this.fkD;
    }

    public /* synthetic */ d(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2, int i, f fVar) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        this(nullabilityQualifier, mutabilityQualifier, z, z2);
    }

    public final boolean bxT() {
        return this.fkE;
    }
}
