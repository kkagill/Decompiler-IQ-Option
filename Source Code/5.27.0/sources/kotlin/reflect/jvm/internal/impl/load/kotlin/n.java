package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.f;

/* compiled from: KotlinJvmBinaryClass.kt */
public interface n {

    /* compiled from: KotlinJvmBinaryClass.kt */
    public interface a {
        b A(f fVar);

        a a(f fVar, kotlin.reflect.jvm.internal.impl.name.a aVar);

        void a(f fVar, Object obj);

        void a(f fVar, kotlin.reflect.jvm.internal.impl.name.a aVar, f fVar2);

        void a(f fVar, kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2);

        void byq();
    }

    /* compiled from: KotlinJvmBinaryClass.kt */
    public interface b {
        void a(kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar);

        void b(kotlin.reflect.jvm.internal.impl.name.a aVar, f fVar);

        void byq();

        void dE(Object obj);
    }

    /* compiled from: KotlinJvmBinaryClass.kt */
    public interface c {
        a a(kotlin.reflect.jvm.internal.impl.name.a aVar, aj ajVar);

        void byq();
    }

    /* compiled from: KotlinJvmBinaryClass.kt */
    public interface d {
        c a(f fVar, String str, Object obj);

        e a(f fVar, String str);
    }

    /* compiled from: KotlinJvmBinaryClass.kt */
    public interface e extends c {
        a a(int i, kotlin.reflect.jvm.internal.impl.name.a aVar, aj ajVar);
    }

    void a(c cVar, byte[] bArr);

    void a(d dVar, byte[] bArr);

    KotlinClassHeader bqj();

    kotlin.reflect.jvm.internal.impl.name.a getClassId();

    String getLocation();
}
