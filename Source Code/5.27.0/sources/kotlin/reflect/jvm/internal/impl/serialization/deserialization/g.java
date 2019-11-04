package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.a.h;

/* compiled from: ContractDeserializer.kt */
public interface g {
    public static final a fuZ = a.fvb;

    /* compiled from: ContractDeserializer.kt */
    public static final class a {
        private static final g fva = new a();
        static final /* synthetic */ a fvb = new a();

        /* compiled from: ContractDeserializer.kt */
        public static final class a implements g {
            public Pair a(Function function, s sVar, h hVar, v vVar) {
                i.f(function, "proto");
                i.f(sVar, "ownerFunction");
                i.f(hVar, "typeTable");
                i.f(vVar, "typeDeserializer");
                return null;
            }

            a() {
            }
        }

        private a() {
        }

        public final g bNW() {
            return fva;
        }
    }

    Pair<kotlin.reflect.jvm.internal.impl.descriptors.a.a<?>, Object> a(Function function, s sVar, h hVar, v vVar);
}
