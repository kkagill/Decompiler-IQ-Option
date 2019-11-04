package kotlin.reflect.jvm.internal.impl.metadata.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter;

/* compiled from: protoTypeTableUtil.kt */
public final class g {
    public static final List<Type> a(Class classR, h hVar) {
        i.f(classR, "$this$supertypes");
        i.f(hVar, "typeTable");
        List<Type> bAz = classR.bAz();
        if ((bAz.isEmpty() ^ 1) == 0) {
            bAz = null;
        }
        if (bAz != null) {
            return bAz;
        }
        List bAB = classR.bAB();
        i.e(bAB, "supertypeIdList");
        Iterable<Integer> iterable = bAB;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (Integer num : iterable) {
            i.e(num, "it");
            arrayList.add(hVar.lG(num.intValue()));
        }
        return (List) arrayList;
    }

    public static final Type a(Argument argument, h hVar) {
        i.f(argument, "$this$type");
        i.f(hVar, "typeTable");
        if (argument.hasType()) {
            return argument.bFb();
        }
        return argument.bFc() ? hVar.lG(argument.getTypeId()) : null;
    }

    public static final Type a(Type type, h hVar) {
        i.f(type, "$this$flexibleUpperBound");
        i.f(hVar, "typeTable");
        if (type.bEA()) {
            return type.bEB();
        }
        return type.bEC() ? hVar.lG(type.bED()) : null;
    }

    public static final List<Type> a(TypeParameter typeParameter, h hVar) {
        i.f(typeParameter, "$this$upperBounds");
        i.f(hVar, "typeTable");
        List<Type> bFR = typeParameter.bFR();
        if ((bFR.isEmpty() ^ 1) == 0) {
            bFR = null;
        }
        if (bFR != null) {
            return bFR;
        }
        List bFT = typeParameter.bFT();
        i.e(bFT, "upperBoundIdList");
        Iterable<Integer> iterable = bFT;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (Integer num : iterable) {
            i.e(num, "it");
            arrayList.add(hVar.lG(num.intValue()));
        }
        return (List) arrayList;
    }

    public static final Type a(Function function, h hVar) {
        i.f(function, "$this$returnType");
        i.f(hVar, "typeTable");
        if (function.bCP()) {
            Type bCQ = function.bCQ();
            i.e(bCQ, "returnType");
            return bCQ;
        } else if (function.bCR()) {
            return hVar.lG(function.bCS());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
        }
    }

    public static final boolean g(Function function) {
        i.f(function, "$this$hasReceiver");
        return function.bCT() || function.bCV();
    }

    public static final Type b(Function function, h hVar) {
        i.f(function, "$this$receiverType");
        i.f(hVar, "typeTable");
        if (function.bCT()) {
            return function.bCU();
        }
        return function.bCV() ? hVar.lG(function.bCW()) : null;
    }

    public static final Type a(Property property, h hVar) {
        i.f(property, "$this$returnType");
        i.f(hVar, "typeTable");
        if (property.bCP()) {
            Type bCQ = property.bCQ();
            i.e(bCQ, "returnType");
            return bCQ;
        } else if (property.bCR()) {
            return hVar.lG(property.bCS());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
        }
    }

    public static final boolean f(Property property) {
        i.f(property, "$this$hasReceiver");
        return property.bCT() || property.bCV();
    }

    public static final Type b(Property property, h hVar) {
        i.f(property, "$this$receiverType");
        i.f(hVar, "typeTable");
        if (property.bCT()) {
            return property.bCU();
        }
        return property.bCV() ? hVar.lG(property.bCW()) : null;
    }

    public static final Type a(ValueParameter valueParameter, h hVar) {
        i.f(valueParameter, "$this$type");
        i.f(hVar, "typeTable");
        if (valueParameter.hasType()) {
            Type bFb = valueParameter.bFb();
            i.e(bFb, "type");
            return bFb;
        } else if (valueParameter.bFc()) {
            return hVar.lG(valueParameter.getTypeId());
        } else {
            throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
        }
    }

    public static final Type b(ValueParameter valueParameter, h hVar) {
        i.f(valueParameter, "$this$varargElementType");
        i.f(hVar, "typeTable");
        if (valueParameter.bGv()) {
            return valueParameter.bGw();
        }
        return valueParameter.bGx() ? hVar.lG(valueParameter.bGy()) : null;
    }

    public static final Type b(Type type, h hVar) {
        i.f(type, "$this$outerType");
        i.f(hVar, "typeTable");
        if (type.bEM()) {
            return type.bEN();
        }
        return type.bEO() ? hVar.lG(type.bEP()) : null;
    }

    public static final Type c(Type type, h hVar) {
        i.f(type, "$this$abbreviatedType");
        i.f(hVar, "typeTable");
        if (type.bEQ()) {
            return type.bER();
        }
        return type.bES() ? hVar.lG(type.bET()) : null;
    }

    public static final Type a(TypeAlias typeAlias, h hVar) {
        i.f(typeAlias, "$this$underlyingType");
        i.f(hVar, "typeTable");
        if (typeAlias.bFs()) {
            Type bFt = typeAlias.bFt();
            i.e(bFt, "underlyingType");
            return bFt;
        } else if (typeAlias.bFu()) {
            return hVar.lG(typeAlias.bFv());
        } else {
            throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
        }
    }

    public static final Type b(TypeAlias typeAlias, h hVar) {
        i.f(typeAlias, "$this$expandedType");
        i.f(hVar, "typeTable");
        if (typeAlias.bFw()) {
            Type bFx = typeAlias.bFx();
            i.e(bFx, "expandedType");
            return bFx;
        } else if (typeAlias.bFy()) {
            return hVar.lG(typeAlias.bFz());
        } else {
            throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
        }
    }
}
