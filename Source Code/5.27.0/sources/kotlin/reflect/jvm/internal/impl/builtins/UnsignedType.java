package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.f;

/* compiled from: UnsignedType.kt */
public enum UnsignedType {
    UBYTE(r2),
    USHORT(r2),
    UINT(r2),
    ULONG(r2);
    
    private final a arrayClassId;
    private final a classId;
    private final f typeName;

    private UnsignedType(a aVar) {
        this.classId = aVar;
        f bJV = this.classId.bJV();
        i.e(bJV, "classId.shortClassName");
        this.typeName = bJV;
        b packageFqName = this.classId.getPackageFqName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.typeName.boi());
        stringBuilder.append("Array");
        this.arrayClassId = new a(packageFqName, f.ms(stringBuilder.toString()));
    }

    public final a getClassId() {
        return this.classId;
    }

    public final f getTypeName() {
        return this.typeName;
    }

    public final a getArrayClassId() {
        return this.arrayClassId;
    }
}
