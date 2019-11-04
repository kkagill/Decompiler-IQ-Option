package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.f;

public enum PrimitiveType {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");
    
    public static final Set<PrimitiveType> NUMBER_TYPES = null;
    private b arrayTypeFqName;
    private final f arrayTypeName;
    private b typeFqName;
    private final f typeName;

    static {
        NUMBER_TYPES = Collections.unmodifiableSet(EnumSet.of(r9, new PrimitiveType[]{r10, r11, r12, r13, r14, r15}));
    }

    private PrimitiveType(String str) {
        this.typeFqName = null;
        this.arrayTypeFqName = null;
        this.typeName = f.ms(str);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("Array");
        this.arrayTypeName = f.ms(stringBuilder.toString());
    }

    public f getTypeName() {
        f fVar = this.typeName;
        if (fVar == null) {
            $$$reportNull$$$0(0);
        }
        return fVar;
    }

    public b getTypeFqName() {
        b bVar = this.typeFqName;
        if (bVar != null) {
            if (bVar == null) {
                $$$reportNull$$$0(1);
            }
            return bVar;
        }
        this.typeFqName = g.eZp.C(this.typeName);
        bVar = this.typeFqName;
        if (bVar == null) {
            $$$reportNull$$$0(2);
        }
        return bVar;
    }

    public f getArrayTypeName() {
        f fVar = this.arrayTypeName;
        if (fVar == null) {
            $$$reportNull$$$0(3);
        }
        return fVar;
    }

    public b getArrayTypeFqName() {
        b bVar = this.arrayTypeFqName;
        if (bVar != null) {
            if (bVar == null) {
                $$$reportNull$$$0(4);
            }
            return bVar;
        }
        this.arrayTypeFqName = g.eZp.C(this.arrayTypeName);
        bVar = this.arrayTypeFqName;
        if (bVar == null) {
            $$$reportNull$$$0(5);
        }
        return bVar;
    }
}
