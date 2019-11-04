package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Arrays;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.load.java.structure.g;

/* compiled from: KotlinClassFinder.kt */
public interface l {

    /* compiled from: KotlinClassFinder.kt */
    public static abstract class a {

        /* compiled from: KotlinClassFinder.kt */
        public static final class a extends a {
            private final byte[] content;

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (kotlin.jvm.internal.i.y(r1.content, ((kotlin.reflect.jvm.internal.impl.load.kotlin.l.a.a) r2).content) != false) goto L_0x0015;
     */
            public boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.l.a.a;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (kotlin.reflect.jvm.internal.impl.load.kotlin.l.a.a) r2;
                r0 = r1.content;
                r2 = r2.content;
                r2 = kotlin.jvm.internal.i.y(r0, r2);
                if (r2 == 0) goto L_0x0013;
            L_0x0012:
                goto L_0x0015;
            L_0x0013:
                r2 = 0;
                return r2;
            L_0x0015:
                r2 = 1;
                return r2;
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.l$a$a.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                byte[] bArr = this.content;
                return bArr != null ? Arrays.hashCode(bArr) : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ClassFileContent(content=");
                stringBuilder.append(Arrays.toString(this.content));
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public final byte[] byJ() {
                return this.content;
            }
        }

        /* compiled from: KotlinClassFinder.kt */
        public static final class b extends a {
            private final n fmc;

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (kotlin.jvm.internal.i.y(r1.fmc, ((kotlin.reflect.jvm.internal.impl.load.kotlin.l.a.b) r2).fmc) != false) goto L_0x0015;
     */
            public boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.l.a.b;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (kotlin.reflect.jvm.internal.impl.load.kotlin.l.a.b) r2;
                r0 = r1.fmc;
                r2 = r2.fmc;
                r2 = kotlin.jvm.internal.i.y(r0, r2);
                if (r2 == 0) goto L_0x0013;
            L_0x0012:
                goto L_0x0015;
            L_0x0013:
                r2 = 0;
                return r2;
            L_0x0015:
                r2 = 1;
                return r2;
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.l$a$b.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                n nVar = this.fmc;
                return nVar != null ? nVar.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("KotlinClass(kotlinJvmBinaryClass=");
                stringBuilder.append(this.fmc);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public b(n nVar) {
                i.f(nVar, "kotlinJvmBinaryClass");
                super();
                this.fmc = nVar;
            }

            public final n byK() {
                return this.fmc;
            }
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final n byI() {
            b bVar = (b) (!(this instanceof b) ? null : this);
            return bVar != null ? bVar.byK() : null;
        }
    }

    a a(g gVar);

    a a(kotlin.reflect.jvm.internal.impl.name.a aVar);
}
