package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.i;
import kotlin.reflect.jvm.internal.c.e;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.load.java.m;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.a.h;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u0001\u0004\t\n\u000b\f¨\u0006\r"}, bng = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "", "()V", "asString", "", "JavaField", "JavaMethodProperty", "KotlinProperty", "MappedKotlinProperty", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "kotlin-reflect-api"})
/* compiled from: RuntimeTypeMapper.kt */
public abstract class d {

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, bng = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "getField", "()Ljava/lang/reflect/Field;", "asString", "", "kotlin-reflect-api"})
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class a extends d {
        private final Field field;

        public a(Field field) {
            kotlin.jvm.internal.i.f(field, "field");
            super();
            this.field = field;
        }

        public final Field bgQ() {
            return this.field;
        }

        public String boi() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(m.mb(this.field.getName()));
            stringBuilder.append("()");
            Class type = this.field.getType();
            kotlin.jvm.internal.i.e(type, "field.type");
            stringBuilder.append(kotlin.reflect.jvm.internal.structure.b.V(type));
            return stringBuilder.toString();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u000b"}, bng = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "getterMethod", "Ljava/lang/reflect/Method;", "setterMethod", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "getGetterMethod", "()Ljava/lang/reflect/Method;", "getSetterMethod", "asString", "", "kotlin-reflect-api"})
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class b extends d {
        private final Method eWI;
        private final Method eWJ;

        public b(Method method, Method method2) {
            kotlin.jvm.internal.i.f(method, "getterMethod");
            super();
            this.eWI = method;
            this.eWJ = method2;
        }

        public final Method bon() {
            return this.eWI;
        }

        public final Method boo() {
            return this.eWJ;
        }

        public String boi() {
            return ac.f(this.eWI);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, bng = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", "signature", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "getNameResolver", "()Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;", "getProto", "()Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "string", "", "getTypeTable", "()Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;", "asString", "getManglingSuffix", "kotlin-reflect-api"})
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class c extends d {
        private final ae eWK;
        private final Property eWL;
        private final JvmPropertySignature eWM;
        private final kotlin.reflect.jvm.internal.impl.metadata.a.c eWN;
        private final h eWO;
        private final String string;

        public final ae boq() {
            return this.eWK;
        }

        public final Property bor() {
            return this.eWL;
        }

        public final JvmPropertySignature bos() {
            return this.eWM;
        }

        public final kotlin.reflect.jvm.internal.impl.metadata.a.c bot() {
            return this.eWN;
        }

        public final h bou() {
            return this.eWO;
        }

        public c(ae aeVar, Property property, JvmPropertySignature jvmPropertySignature, kotlin.reflect.jvm.internal.impl.metadata.a.c cVar, h hVar) {
            String stringBuilder;
            kotlin.jvm.internal.i.f(aeVar, "descriptor");
            kotlin.jvm.internal.i.f(property, "proto");
            kotlin.jvm.internal.i.f(jvmPropertySignature, "signature");
            kotlin.jvm.internal.i.f(cVar, "nameResolver");
            kotlin.jvm.internal.i.f(hVar, "typeTable");
            super();
            this.eWK = aeVar;
            this.eWL = property;
            this.eWM = jvmPropertySignature;
            this.eWN = cVar;
            this.eWO = hVar;
            if (this.eWM.bIQ()) {
                StringBuilder stringBuilder2 = new StringBuilder();
                kotlin.reflect.jvm.internal.impl.metadata.a.c cVar2 = this.eWN;
                JvmMethodSignature bIR = this.eWM.bIR();
                String str = "signature.getter";
                kotlin.jvm.internal.i.e(bIR, str);
                stringBuilder2.append(cVar2.getString(bIR.bCg()));
                cVar2 = this.eWN;
                bIR = this.eWM.bIR();
                kotlin.jvm.internal.i.e(bIR, str);
                stringBuilder2.append(cVar2.getString(bIR.bIr()));
                stringBuilder = stringBuilder2.toString();
            } else {
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f.a a = j.a(j.foZ, this.eWL, this.eWN, this.eWO, false, 8, null);
                if (a != null) {
                    String UD = a.UD();
                    stringBuilder = a.bJP();
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(m.mb(UD));
                    stringBuilder3.append(bop());
                    stringBuilder3.append("()");
                    stringBuilder3.append(stringBuilder);
                    stringBuilder = stringBuilder3.toString();
                } else {
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append("No field signature for property: ");
                    stringBuilder4.append(this.eWK);
                    throw new KotlinReflectionInternalError(stringBuilder4.toString());
                }
            }
            this.string = stringBuilder;
        }

        /* JADX WARNING: Missing block: B:7:0x0042, code skipped:
            if (r0 != null) goto L_0x0047;
     */
        private final java.lang.String bop() {
            /*
            r4 = this;
            r0 = r4.eWK;
            r0 = r0.brj();
            r1 = "descriptor.containingDeclaration";
            kotlin.jvm.internal.i.e(r0, r1);
            r1 = r4.eWK;
            r1 = r1.brx();
            r2 = kotlin.reflect.jvm.internal.impl.descriptors.av.fdd;
            r1 = kotlin.jvm.internal.i.y(r1, r2);
            r2 = "$";
            if (r1 == 0) goto L_0x005b;
        L_0x001b:
            r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d;
            if (r1 == 0) goto L_0x005b;
        L_0x001f:
            r0 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d) r0;
            r0 = r0.bOJ();
            r0 = (kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage) r0;
            r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.foy;
            r3 = "JvmProtoBuf.classModuleName";
            kotlin.jvm.internal.i.e(r1, r3);
            r0 = kotlin.reflect.jvm.internal.impl.metadata.a.f.a(r0, r1);
            r0 = (java.lang.Integer) r0;
            if (r0 == 0) goto L_0x0045;
        L_0x0036:
            r1 = r4.eWN;
            r0 = (java.lang.Number) r0;
            r0 = r0.intValue();
            r0 = r1.getString(r0);
            if (r0 == 0) goto L_0x0045;
        L_0x0044:
            goto L_0x0047;
        L_0x0045:
            r0 = "main";
        L_0x0047:
            r1 = new java.lang.StringBuilder;
            r1.<init>();
            r1.append(r2);
            r0 = kotlin.reflect.jvm.internal.impl.name.g.mw(r0);
            r1.append(r0);
            r0 = r1.toString();
            return r0;
        L_0x005b:
            r1 = r4.eWK;
            r1 = r1.brx();
            r3 = kotlin.reflect.jvm.internal.impl.descriptors.av.fda;
            r1 = kotlin.jvm.internal.i.y(r1, r3);
            if (r1 == 0) goto L_0x00a3;
        L_0x0069:
            r0 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.y;
            if (r0 == 0) goto L_0x00a3;
        L_0x006d:
            r0 = r4.eWK;
            if (r0 == 0) goto L_0x009b;
        L_0x0071:
            r0 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h) r0;
            r0 = r0.bOp();
            r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.h;
            if (r1 == 0) goto L_0x00a3;
        L_0x007b:
            r0 = (kotlin.reflect.jvm.internal.impl.load.kotlin.h) r0;
            r1 = r0.byB();
            if (r1 == 0) goto L_0x00a3;
        L_0x0083:
            r1 = new java.lang.StringBuilder;
            r1.<init>();
            r1.append(r2);
            r0 = r0.byz();
            r0 = r0.boi();
            r1.append(r0);
            r0 = r1.toString();
            return r0;
        L_0x009b:
            r0 = new kotlin.TypeCastException;
            r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor";
            r0.<init>(r1);
            throw r0;
        L_0x00a3:
            r0 = "";
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.d$c.bop():java.lang.String");
        }

        public String boi() {
            return this.string;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u000b"}, bng = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "getterSignature", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "setterSignature", "(Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;)V", "getGetterSignature", "()Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "getSetterSignature", "asString", "", "kotlin-reflect-api"})
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class d extends d {
        private final e eWP;
        private final e eWQ;

        public final e bov() {
            return this.eWP;
        }

        public final e bow() {
            return this.eWQ;
        }

        public d(e eVar, e eVar2) {
            kotlin.jvm.internal.i.f(eVar, "getterSignature");
            super();
            this.eWP = eVar;
            this.eWQ = eVar2;
        }

        public String boi() {
            return this.eWP.boi();
        }
    }

    public abstract String boi();

    private d() {
    }

    public /* synthetic */ d(f fVar) {
        this();
    }
}
