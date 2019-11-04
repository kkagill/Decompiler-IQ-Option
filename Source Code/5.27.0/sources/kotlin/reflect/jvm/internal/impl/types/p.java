package kotlin.reflect.jvm.internal.impl.types;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.aa;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.av;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.z;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* compiled from: ErrorUtils */
public class p {
    private static final v fwT = new v() {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = (i == 1 || i == 4 || i == 5 || i == 6 || i == 8 || i == 9 || i == 12 || i == 13) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            int i2 = (i == 1 || i == 4 || i == 5 || i == 6 || i == 8 || i == 9 || i == 12 || i == 13) ? 2 : 3;
            Object[] objArr = new Object[i2];
            String str2 = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$1";
            switch (i) {
                case 1:
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 12:
                case 13:
                    objArr[0] = str2;
                    break;
                case 2:
                case 7:
                    objArr[0] = "fqName";
                    break;
                case 3:
                    objArr[0] = "nameFilter";
                    break;
                case 10:
                    objArr[0] = "visitor";
                    break;
                case 11:
                    objArr[0] = "targetModule";
                    break;
                default:
                    objArr[0] = "capability";
                    break;
            }
            String str3 = "getSubPackagesOf";
            if (i == 1) {
                objArr[1] = "getAnnotations";
            } else if (i == 4) {
                objArr[1] = str3;
            } else if (i == 5) {
                objArr[1] = "getName";
            } else if (i == 6) {
                objArr[1] = "getStableName";
            } else if (i == 8) {
                objArr[1] = "getAllDependencyModules";
            } else if (i == 9) {
                objArr[1] = "getExpectedByModules";
            } else if (i == 12) {
                objArr[1] = "getOriginal";
            } else if (i != 13) {
                objArr[1] = str2;
            } else {
                objArr[1] = "getBuiltIns";
            }
            switch (i) {
                case 1:
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 12:
                case 13:
                    break;
                case 2:
                case 3:
                    objArr[2] = str3;
                    break;
                case 7:
                    objArr[2] = "getPackage";
                    break;
                case 10:
                    objArr[2] = "accept";
                    break;
                case 11:
                    objArr[2] = "shouldSeeInternalsOf";
                    break;
                default:
                    objArr[2] = "getCapability";
                    break;
            }
            str = String.format(str, objArr);
            IllegalArgumentException illegalStateException = (i == 1 || i == 4 || i == 5 || i == 6 || i == 8 || i == 9 || i == 12 || i == 13) ? new IllegalStateException(str) : new IllegalArgumentException(str);
            throw illegalStateException;
        }

        public <R, D> R a(m<R, D> mVar, D d) {
            if (mVar == null) {
                AnonymousClass1.$$$reportNull$$$0(10);
            }
            return null;
        }

        public k brj() {
            return null;
        }

        public k bsW() {
            return this;
        }

        public boolean c(v vVar) {
            if (vVar == null) {
                AnonymousClass1.$$$reportNull$$$0(11);
            }
            return false;
        }

        public f brE() {
            f bug = f.fdA.bug();
            if (bug == null) {
                AnonymousClass1.$$$reportNull$$$0(1);
            }
            return bug;
        }

        public Collection<kotlin.reflect.jvm.internal.impl.name.b> a(kotlin.reflect.jvm.internal.impl.name.b bVar, kotlin.jvm.a.b<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> bVar2) {
            if (bVar == null) {
                AnonymousClass1.$$$reportNull$$$0(2);
            }
            if (bVar2 == null) {
                AnonymousClass1.$$$reportNull$$$0(3);
            }
            List emptyList = m.emptyList();
            if (emptyList == null) {
                AnonymousClass1.$$$reportNull$$$0(4);
            }
            return emptyList;
        }

        public kotlin.reflect.jvm.internal.impl.name.f bsZ() {
            kotlin.reflect.jvm.internal.impl.name.f mu = kotlin.reflect.jvm.internal.impl.name.f.mu("<ERROR MODULE>");
            if (mu == null) {
                AnonymousClass1.$$$reportNull$$$0(5);
            }
            return mu;
        }

        public aa f(kotlin.reflect.jvm.internal.impl.name.b bVar) {
            if (bVar == null) {
                AnonymousClass1.$$$reportNull$$$0(7);
            }
            throw new IllegalStateException("Should not be called!");
        }

        public g btw() {
            kotlin.reflect.jvm.internal.impl.builtins.d bqu = kotlin.reflect.jvm.internal.impl.builtins.d.bqu();
            if (bqu == null) {
                AnonymousClass1.$$$reportNull$$$0(13);
            }
            return bqu;
        }
    };
    private static final a fwU = new a(kotlin.reflect.jvm.internal.impl.name.f.mu("<ERROR CLASS>"));
    public static final ad fwV = mK("<LOOP IN SUPERTYPES>");
    private static final w fwW = mK("<ERROR PROPERTY TYPE>");
    private static final ae fwX = bPn();
    private static final Set<ae> fwY = Collections.singleton(fwX);

    /* compiled from: ErrorUtils */
    public static class d implements an {
        private final ao fxb;
        private final an fxc;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            int i2 = (i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3;
            Object[] objArr = new Object[i2];
            String str2 = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$UninferredParameterTypeConstructor";
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                objArr[0] = str2;
            } else {
                objArr[0] = "descriptor";
            }
            if (i == 1) {
                objArr[1] = "getTypeParameterDescriptor";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getSupertypes";
            } else if (i != 4) {
                objArr[1] = str2;
            } else {
                objArr[1] = "getBuiltIns";
            }
            if (!(i == 1 || i == 2 || i == 3 || i == 4)) {
                objArr[2] = "<init>";
            }
            str = String.format(str, objArr);
            IllegalArgumentException illegalStateException = (i == 1 || i == 2 || i == 3 || i == 4) ? new IllegalStateException(str) : new IllegalArgumentException(str);
            throw illegalStateException;
        }

        public ao bPq() {
            ao aoVar = this.fxb;
            if (aoVar == null) {
                $$$reportNull$$$0(1);
            }
            return aoVar;
        }

        public List<ao> getParameters() {
            List parameters = this.fxc.getParameters();
            if (parameters == null) {
                $$$reportNull$$$0(2);
            }
            return parameters;
        }

        public Collection<w> bup() {
            Collection bup = this.fxc.bup();
            if (bup == null) {
                $$$reportNull$$$0(3);
            }
            return bup;
        }

        public boolean brS() {
            return this.fxc.brS();
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.f brQ() {
            return this.fxc.brQ();
        }

        public g btw() {
            g Q = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.Q(this.fxb);
            if (Q == null) {
                $$$reportNull$$$0(4);
            }
            return Q;
        }
    }

    /* compiled from: ErrorUtils */
    public static class b implements h {
        private final String ftq;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str;
            int i2;
            IllegalArgumentException illegalArgumentException;
            if (!(i == 7 || i == 18)) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i == 7 || i == 18)) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            }
            i2 = 2;
            Object[] objArr = new Object[i2];
            String str2 = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorScope";
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 8:
                case 14:
                case 19:
                    objArr[0] = ConditionalUserProperty.NAME;
                    break;
                case 2:
                case 4:
                case 6:
                case 9:
                case 15:
                    objArr[0] = "location";
                    break;
                case 7:
                case 10:
                case 11:
                case 12:
                case 13:
                case 18:
                    objArr[0] = str2;
                    break;
                case 16:
                    objArr[0] = "kindFilter";
                    break;
                case 17:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "debugMessage";
                    break;
            }
            String str3 = "getContributedDescriptors";
            String str4 = "getContributedFunctions";
            String str5 = "getContributedVariables";
            if (i == 7) {
                objArr[1] = str5;
            } else if (i != 18) {
                switch (i) {
                    case 10:
                        objArr[1] = str4;
                        break;
                    case 11:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 12:
                        objArr[1] = "getVariableNames";
                        break;
                    case 13:
                        objArr[1] = "getClassifierNames";
                        break;
                    default:
                        objArr[1] = str2;
                        break;
                }
            } else {
                objArr[1] = str3;
            }
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedClassifier";
                    break;
                case 3:
                case 4:
                    objArr[2] = "getContributedClassifierIncludeDeprecated";
                    break;
                case 5:
                case 6:
                    objArr[2] = str5;
                    break;
                case 7:
                case 10:
                case 11:
                case 12:
                case 13:
                case 18:
                    break;
                case 8:
                case 9:
                    objArr[2] = str4;
                    break;
                case 14:
                case 15:
                    objArr[2] = "recordLookup";
                    break;
                case 16:
                case 17:
                    objArr[2] = str3;
                    break;
                case 19:
                    objArr[2] = "definitelyDoesNotContainName";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            str = String.format(str, objArr);
            if (!(i == 7 || i == 18)) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        illegalArgumentException = new IllegalArgumentException(str);
                        break;
                }
            }
            illegalArgumentException = new IllegalStateException(str);
            throw illegalArgumentException;
        }

        /* synthetic */ b(String str, AnonymousClass1 anonymousClass1) {
            this(str);
        }

        private b(String str) {
            if (str == null) {
                $$$reportNull$$$0(0);
            }
            this.ftq = str;
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.f c(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
            if (fVar == null) {
                $$$reportNull$$$0(1);
            }
            if (bVar == null) {
                $$$reportNull$$$0(2);
            }
            return p.mI(fVar.boi());
        }

        /* renamed from: h */
        public Set<? extends ae> a(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
            if (fVar == null) {
                $$$reportNull$$$0(5);
            }
            if (bVar == null) {
                $$$reportNull$$$0(6);
            }
            Set bPp = p.fwY;
            if (bPp == null) {
                $$$reportNull$$$0(7);
            }
            return bPp;
        }

        /* renamed from: i */
        public Set<? extends ai> b(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
            if (fVar == null) {
                $$$reportNull$$$0(8);
            }
            if (bVar == null) {
                $$$reportNull$$$0(9);
            }
            Set singleton = Collections.singleton(p.a(this));
            if (singleton == null) {
                $$$reportNull$$$0(10);
            }
            return singleton;
        }

        public Set<kotlin.reflect.jvm.internal.impl.name.f> bux() {
            Set emptySet = Collections.emptySet();
            if (emptySet == null) {
                $$$reportNull$$$0(11);
            }
            return emptySet;
        }

        public Set<kotlin.reflect.jvm.internal.impl.name.f> buy() {
            Set emptySet = Collections.emptySet();
            if (emptySet == null) {
                $$$reportNull$$$0(12);
            }
            return emptySet;
        }

        public Collection<k> a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, kotlin.jvm.a.b<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> bVar) {
            if (dVar == null) {
                $$$reportNull$$$0(16);
            }
            if (bVar == null) {
                $$$reportNull$$$0(17);
            }
            List emptyList = Collections.emptyList();
            if (emptyList == null) {
                $$$reportNull$$$0(18);
            }
            return emptyList;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ErrorScope{");
            stringBuilder.append(this.ftq);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    /* compiled from: ErrorUtils */
    private static class c implements h {
        private final String ftq;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 11:
                case 13:
                    objArr[0] = ConditionalUserProperty.NAME;
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                case 12:
                    objArr[0] = "location";
                    break;
                case 9:
                    objArr[0] = "kindFilter";
                    break;
                case 10:
                    objArr[0] = "nameFilter";
                    break;
                case 14:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "message";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ThrowingScope";
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedClassifier";
                    break;
                case 3:
                case 4:
                    objArr[2] = "getContributedClassifierIncludeDeprecated";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedVariables";
                    break;
                case 7:
                case 8:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 9:
                case 10:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 11:
                case 12:
                    objArr[2] = "recordLookup";
                    break;
                case 13:
                    objArr[2] = "definitelyDoesNotContainName";
                    break;
                case 14:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* synthetic */ c(String str, AnonymousClass1 anonymousClass1) {
            this(str);
        }

        private c(String str) {
            if (str == null) {
                $$$reportNull$$$0(0);
            }
            this.ftq = str;
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.f c(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
            if (fVar == null) {
                $$$reportNull$$$0(1);
            }
            if (bVar == null) {
                $$$reportNull$$$0(2);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.ftq);
            stringBuilder.append(", required name: ");
            stringBuilder.append(fVar);
            throw new IllegalStateException(stringBuilder.toString());
        }

        public Collection<? extends ae> a(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
            if (fVar == null) {
                $$$reportNull$$$0(5);
            }
            if (bVar == null) {
                $$$reportNull$$$0(6);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.ftq);
            stringBuilder.append(", required name: ");
            stringBuilder.append(fVar);
            throw new IllegalStateException(stringBuilder.toString());
        }

        public Collection<? extends ai> b(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
            if (fVar == null) {
                $$$reportNull$$$0(7);
            }
            if (bVar == null) {
                $$$reportNull$$$0(8);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.ftq);
            stringBuilder.append(", required name: ");
            stringBuilder.append(fVar);
            throw new IllegalStateException(stringBuilder.toString());
        }

        public Collection<k> a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, kotlin.jvm.a.b<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> bVar) {
            if (dVar == null) {
                $$$reportNull$$$0(9);
            }
            if (bVar == null) {
                $$$reportNull$$$0(10);
            }
            throw new IllegalStateException(this.ftq);
        }

        public Set<kotlin.reflect.jvm.internal.impl.name.f> bux() {
            throw new IllegalStateException();
        }

        public Set<kotlin.reflect.jvm.internal.impl.name.f> buy() {
            throw new IllegalStateException();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ThrowingScope{");
            stringBuilder.append(this.ftq);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    /* compiled from: ErrorUtils */
    private static class a extends kotlin.reflect.jvm.internal.impl.descriptors.impl.h {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = (i == 2 || i == 4 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            int i2 = (i == 2 || i == 4 || i == 6) ? 2 : 3;
            Object[] objArr = new Object[i2];
            String str2 = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorClassDescriptor";
            switch (i) {
                case 1:
                    objArr[0] = "substitutor";
                    break;
                case 2:
                case 4:
                case 6:
                    objArr[0] = str2;
                    break;
                case 3:
                    objArr[0] = "typeArguments";
                    break;
                case 5:
                    objArr[0] = "typeSubstitution";
                    break;
                default:
                    objArr[0] = ConditionalUserProperty.NAME;
                    break;
            }
            String str3 = "getMemberScope";
            String str4 = "substitute";
            if (i == 2) {
                objArr[1] = str4;
            } else if (i == 4 || i == 6) {
                objArr[1] = str3;
            } else {
                objArr[1] = str2;
            }
            switch (i) {
                case 1:
                    objArr[2] = str4;
                    break;
                case 2:
                case 4:
                case 6:
                    break;
                case 3:
                case 5:
                    objArr[2] = str3;
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            str = String.format(str, objArr);
            IllegalArgumentException illegalStateException = (i == 2 || i == 4 || i == 6) ? new IllegalStateException(str) : new IllegalArgumentException(str);
            throw illegalStateException;
        }

        /* renamed from: g */
        public kotlin.reflect.jvm.internal.impl.descriptors.d f(TypeSubstitutor typeSubstitutor) {
            if (typeSubstitutor == null) {
                $$$reportNull$$$0(1);
            }
            return this;
        }

        public a(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            if (fVar == null) {
                $$$reportNull$$$0(0);
            }
            super(p.bPo(), fVar, Modality.OPEN, ClassKind.CLASS, Collections.emptyList(), aj.fcV, false, LockBasedStorageManager.fwt);
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f a = kotlin.reflect.jvm.internal.impl.descriptors.impl.f.a(this, f.fdA.bug(), true, aj.fcV);
            a.a(Collections.emptyList(), av.fdd);
            h mJ = p.mJ(bsZ().boi());
            a.Q(new o(p.a("<ERROR>", this), mJ));
            a(mJ, Collections.singleton(a), a);
        }

        public String toString() {
            return bsZ().boi();
        }

        public h a(as asVar) {
            if (asVar == null) {
                $$$reportNull$$$0(5);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error scope for class ");
            stringBuilder.append(bsZ());
            stringBuilder.append(" with arguments: ");
            stringBuilder.append(asVar);
            h mJ = p.mJ(stringBuilder.toString());
            if (mJ == null) {
                $$$reportNull$$$0(6);
            }
            return mJ;
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        IllegalArgumentException illegalStateException;
        switch (i) {
            case 2:
            case 4:
            case 6:
            case 7:
            case 8:
            case 10:
            case 12:
            case 14:
            case 17:
            case 20:
            case 23:
            case 25:
            case 27:
            case 30:
            case 31:
            case 33:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 2:
            case 4:
            case 6:
            case 7:
            case 8:
            case 10:
            case 12:
            case 14:
            case 17:
            case 20:
            case 23:
            case 25:
            case 27:
            case 30:
            case 31:
            case 33:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils";
        switch (i) {
            case 1:
            case 3:
            case 5:
            case 11:
            case 18:
            case 24:
                objArr[0] = "debugMessage";
                break;
            case 2:
            case 4:
            case 6:
            case 7:
            case 8:
            case 10:
            case 12:
            case 14:
            case 17:
            case 20:
            case 23:
            case 25:
            case 27:
            case 30:
            case 31:
            case 33:
                objArr[0] = str2;
                break;
            case 9:
                objArr[0] = "ownerScope";
                break;
            case 13:
            case 15:
            case 26:
            case 28:
                objArr[0] = "debugName";
                break;
            case 16:
                objArr[0] = "typeConstructor";
                break;
            case 19:
            case 22:
                objArr[0] = "arguments";
                break;
            case 21:
                objArr[0] = "presentableName";
                break;
            case 29:
                objArr[0] = "errorClass";
                break;
            case 32:
                objArr[0] = "typeParameterDescriptor";
                break;
            default:
                objArr[0] = "function";
                break;
        }
        String str3 = "createUninferredParameterType";
        String str4 = "createErrorTypeConstructorWithCustomDebugName";
        String str5 = "createErrorTypeConstructor";
        String str6 = "createUnresolvedType";
        String str7 = "createErrorTypeWithArguments";
        String str8 = "createErrorTypeWithCustomConstructor";
        String str9 = "createErrorTypeWithCustomDebugName";
        String str10 = "createErrorType";
        String str11 = "createErrorFunction";
        String str12 = "createErrorScope";
        String str13 = "createErrorClass";
        switch (i) {
            case 2:
                objArr[1] = str13;
                break;
            case 4:
            case 6:
            case 7:
                objArr[1] = str12;
                break;
            case 8:
                objArr[1] = "createErrorProperty";
                break;
            case 10:
                objArr[1] = str11;
                break;
            case 12:
                objArr[1] = str10;
                break;
            case 14:
                objArr[1] = str9;
                break;
            case 17:
                objArr[1] = str8;
                break;
            case 20:
                objArr[1] = str7;
                break;
            case 23:
                objArr[1] = str6;
                break;
            case 25:
                objArr[1] = str5;
                break;
            case 27:
            case 30:
                objArr[1] = str4;
                break;
            case 31:
                objArr[1] = "getErrorModule";
                break;
            case 33:
                objArr[1] = str3;
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = str13;
                break;
            case 2:
            case 4:
            case 6:
            case 7:
            case 8:
            case 10:
            case 12:
            case 14:
            case 17:
            case 20:
            case 23:
            case 25:
            case 27:
            case 30:
            case 31:
            case 33:
                break;
            case 3:
            case 5:
                objArr[2] = str12;
                break;
            case 9:
                objArr[2] = str11;
                break;
            case 11:
                objArr[2] = str10;
                break;
            case 13:
                objArr[2] = str9;
                break;
            case 15:
            case 16:
                objArr[2] = str8;
                break;
            case 18:
            case 19:
                objArr[2] = str7;
                break;
            case 21:
            case 22:
                objArr[2] = str6;
                break;
            case 24:
                objArr[2] = str5;
                break;
            case 26:
            case 28:
            case 29:
                objArr[2] = str4;
                break;
            case 32:
                objArr[2] = str3;
                break;
            default:
                objArr[2] = "containsErrorTypeInParameters";
                break;
        }
        str = String.format(str, objArr);
        switch (i) {
            case 2:
            case 4:
            case 6:
            case 7:
            case 8:
            case 10:
            case 12:
            case 14:
            case 17:
            case 20:
            case 23:
            case 25:
            case 27:
            case 30:
            case 31:
            case 33:
                illegalStateException = new IllegalStateException(str);
                break;
            default:
                illegalStateException = new IllegalArgumentException(str);
                break;
        }
        throw illegalStateException;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.d mI(String str) {
        if (str == null) {
            $$$reportNull$$$0(1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<ERROR CLASS: ");
        stringBuilder.append(str);
        stringBuilder.append(">");
        return new a(kotlin.reflect.jvm.internal.impl.name.f.mu(stringBuilder.toString()));
    }

    public static h mJ(String str) {
        if (str == null) {
            $$$reportNull$$$0(3);
        }
        h C = C(str, false);
        if (C == null) {
            $$$reportNull$$$0(4);
        }
        return C;
    }

    public static h C(String str, boolean z) {
        if (str == null) {
            $$$reportNull$$$0(5);
        }
        if (z) {
            return new c(str, null);
        }
        return new b(str, null);
    }

    private static z bPn() {
        z a = z.a(fwU, f.fdA.bug(), Modality.OPEN, av.fde, true, kotlin.reflect.jvm.internal.impl.name.f.mu("<ERROR PROPERTY>"), Kind.DECLARATION, aj.fcV, false, false, false, false, false, false);
        a.a(fwW, Collections.emptyList(), null, null);
        if (a == null) {
            $$$reportNull$$$0(8);
        }
        return a;
    }

    private static ai a(b bVar) {
        if (bVar == null) {
            $$$reportNull$$$0(9);
        }
        kotlin.reflect.jvm.internal.impl.types.a.a aVar = new kotlin.reflect.jvm.internal.impl.types.a.a(fwU, bVar);
        aVar.a(null, null, Collections.emptyList(), Collections.emptyList(), mK("<ERROR FUNCTION RETURN TYPE>"), Modality.OPEN, av.fde);
        return aVar;
    }

    public static ad mK(String str) {
        if (str == null) {
            $$$reportNull$$$0(11);
        }
        ad g = g(str, Collections.emptyList());
        if (g == null) {
            $$$reportNull$$$0(12);
        }
        return g;
    }

    public static ad mL(String str) {
        if (str == null) {
            $$$reportNull$$$0(13);
        }
        ad a = a(str, mN(str));
        if (a == null) {
            $$$reportNull$$$0(14);
        }
        return a;
    }

    public static ad a(String str, an anVar) {
        if (str == null) {
            $$$reportNull$$$0(15);
        }
        if (anVar == null) {
            $$$reportNull$$$0(16);
        }
        return new o(anVar, mJ(str));
    }

    public static ad g(String str, List<ap> list) {
        if (str == null) {
            $$$reportNull$$$0(18);
        }
        if (list == null) {
            $$$reportNull$$$0(19);
        }
        return new o(mM(str), mJ(str), list, false);
    }

    public static an mM(String str) {
        if (str == null) {
            $$$reportNull$$$0(24);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ERROR : ");
        stringBuilder.append(str);
        stringBuilder.append("]");
        an a = a(stringBuilder.toString(), fwU);
        if (a == null) {
            $$$reportNull$$$0(25);
        }
        return a;
    }

    public static an mN(String str) {
        if (str == null) {
            $$$reportNull$$$0(26);
        }
        an a = a(str, fwU);
        if (a == null) {
            $$$reportNull$$$0(27);
        }
        return a;
    }

    private static an a(final String str, final a aVar) {
        if (str == null) {
            $$$reportNull$$$0(28);
        }
        if (aVar == null) {
            $$$reportNull$$$0(29);
        }
        return new an() {
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                Object[] objArr = new Object[2];
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$2";
                if (i == 1) {
                    objArr[1] = "getSupertypes";
                } else if (i != 2) {
                    objArr[1] = "getParameters";
                } else {
                    objArr[1] = "getBuiltIns";
                }
                throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", objArr));
            }

            public boolean brS() {
                return false;
            }

            public List<ao> getParameters() {
                List emptyList = m.emptyList();
                if (emptyList == null) {
                    AnonymousClass2.$$$reportNull$$$0(0);
                }
                return emptyList;
            }

            public Collection<w> bup() {
                List emptyList = m.emptyList();
                if (emptyList == null) {
                    AnonymousClass2.$$$reportNull$$$0(1);
                }
                return emptyList;
            }

            public kotlin.reflect.jvm.internal.impl.descriptors.f brQ() {
                return aVar;
            }

            public g btw() {
                kotlin.reflect.jvm.internal.impl.builtins.d bqu = kotlin.reflect.jvm.internal.impl.builtins.d.bqu();
                if (bqu == null) {
                    AnonymousClass2.$$$reportNull$$$0(2);
                }
                return bqu;
            }

            public String toString() {
                return str;
            }
        };
    }

    public static boolean Y(k kVar) {
        boolean z = false;
        if (kVar == null) {
            return false;
        }
        if (Z(kVar) || Z(kVar.brj()) || kVar == fwT) {
            z = true;
        }
        return z;
    }

    private static boolean Z(k kVar) {
        return kVar instanceof a;
    }

    public static v bPo() {
        v vVar = fwT;
        if (vVar == null) {
            $$$reportNull$$$0(31);
        }
        return vVar;
    }

    public static boolean aD(w wVar) {
        return wVar != null && (wVar.bMZ() instanceof d);
    }
}
