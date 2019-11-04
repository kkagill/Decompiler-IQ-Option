package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.am;
import kotlin.reflect.jvm.internal.impl.descriptors.am.a;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.resolve.c;
import kotlin.reflect.jvm.internal.impl.storage.h;

/* compiled from: ClassTypeConstructorImpl */
public class e extends b implements an {
    private final Collection<w> ffI;
    private final d fuR;
    private final List<ao> ws;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        int i2 = (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = str2;
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (!(i == 4 || i == 5 || i == 6 || i == 7)) {
            objArr[2] = "<init>";
        }
        str = String.format(str, objArr);
        IllegalArgumentException illegalStateException = (i == 4 || i == 5 || i == 6 || i == 7) ? new IllegalStateException(str) : new IllegalArgumentException(str);
        throw illegalStateException;
    }

    public boolean brS() {
        return true;
    }

    public e(d dVar, List<? extends ao> list, Collection<w> collection, h hVar) {
        if (dVar == null) {
            $$$reportNull$$$0(0);
        }
        if (list == null) {
            $$$reportNull$$$0(1);
        }
        if (collection == null) {
            $$$reportNull$$$0(2);
        }
        if (hVar == null) {
            $$$reportNull$$$0(3);
        }
        super(hVar);
        this.fuR = dVar;
        this.ws = Collections.unmodifiableList(new ArrayList(list));
        this.ffI = Collections.unmodifiableCollection(collection);
    }

    public List<ao> getParameters() {
        List list = this.ws;
        if (list == null) {
            $$$reportNull$$$0(4);
        }
        return list;
    }

    public String toString() {
        return c.w(this.fuR).boi();
    }

    /* renamed from: brR */
    public d brQ() {
        d dVar = this.fuR;
        if (dVar == null) {
            $$$reportNull$$$0(5);
        }
        return dVar;
    }

    /* Access modifiers changed, original: protected */
    public Collection<w> brO() {
        Collection collection = this.ffI;
        if (collection == null) {
            $$$reportNull$$$0(6);
        }
        return collection;
    }

    /* Access modifiers changed, original: protected */
    public am brT() {
        a aVar = a.fcX;
        if (aVar == null) {
            $$$reportNull$$$0(7);
        }
        return aVar;
    }
}
