package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.av;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.c;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.g;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.i;
import kotlin.reflect.jvm.internal.impl.storage.b;
import kotlin.reflect.jvm.internal.impl.storage.e;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: EnumEntrySyntheticClassDescriptor */
public class n extends g {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final f fdr;
    private final an fen;
    private final h fes;
    private final e<Set<kotlin.reflect.jvm.internal.impl.name.f>> fet;

    /* compiled from: EnumEntrySyntheticClassDescriptor */
    private class a extends i {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final b<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends ai>> feu;
        private final b<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends ae>> fev;
        private final e<Collection<k>> few;
        final /* synthetic */ n fex;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str;
            int i2;
            IllegalArgumentException illegalArgumentException;
            int i3 = i;
            if (!(i3 == 3 || i3 == 5 || i3 == 8 || i3 == 14 || i3 == 10 || i3 == 11)) {
                switch (i3) {
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i3 == 3 || i3 == 5 || i3 == 8 || i3 == 14 || i3 == 10 || i3 == 11)) {
                switch (i3) {
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            }
            i2 = 2;
            Object[] objArr = new Object[i2];
            String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
            switch (i3) {
                case 1:
                case 4:
                case 6:
                case 9:
                case 12:
                    objArr[0] = ConditionalUserProperty.NAME;
                    break;
                case 2:
                case 7:
                    objArr[0] = "location";
                    break;
                case 3:
                case 5:
                case 8:
                case 10:
                case 11:
                case 14:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                    objArr[0] = str2;
                    break;
                case 13:
                    objArr[0] = "fromSupertypes";
                    break;
                case 15:
                    objArr[0] = "kindFilter";
                    break;
                case 16:
                    objArr[0] = "nameFilter";
                    break;
                case 22:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            String str3 = "resolveFakeOverrides";
            String str4 = "computeFunctions";
            String str5 = "getContributedFunctions";
            String str6 = "computeProperties";
            String str7 = "getContributedVariables";
            if (i3 == 3) {
                objArr[1] = str7;
            } else if (i3 == 5) {
                objArr[1] = str6;
            } else if (i3 == 8) {
                objArr[1] = str5;
            } else if (i3 == 14) {
                objArr[1] = str3;
            } else if (i3 == 10) {
                objArr[1] = str4;
            } else if (i3 != 11) {
                switch (i3) {
                    case 17:
                        objArr[1] = "getContributedDescriptors";
                        break;
                    case 18:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 19:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 20:
                        objArr[1] = "getClassifierNames";
                        break;
                    case 21:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = str2;
                        break;
                }
            } else {
                objArr[1] = "getSupertypeScope";
            }
            switch (i3) {
                case 1:
                case 2:
                    objArr[2] = str7;
                    break;
                case 3:
                case 5:
                case 8:
                case 10:
                case 11:
                case 14:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                    break;
                case 4:
                    objArr[2] = str6;
                    break;
                case 6:
                case 7:
                    objArr[2] = str5;
                    break;
                case 9:
                    objArr[2] = str4;
                    break;
                case 12:
                case 13:
                    objArr[2] = str3;
                    break;
                case 15:
                case 16:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 22:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            str = String.format(str, objArr);
            if (!(i3 == 3 || i3 == 5 || i3 == 8 || i3 == 14 || i3 == 10 || i3 == 11)) {
                switch (i3) {
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                        break;
                    default:
                        illegalArgumentException = new IllegalArgumentException(str);
                        break;
                }
            }
            illegalArgumentException = new IllegalStateException(str);
            throw illegalArgumentException;
        }

        static {
            Class cls = n.class;
        }

        public a(final n nVar, kotlin.reflect.jvm.internal.impl.storage.h hVar) {
            if (hVar == null) {
                $$$reportNull$$$0(0);
            }
            this.fex = nVar;
            this.feu = hVar.q(new kotlin.jvm.a.b<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends ai>>() {
                /* renamed from: h */
                public Collection<? extends ai> invoke(kotlin.reflect.jvm.internal.impl.name.f fVar) {
                    return a.this.g(fVar);
                }
            });
            this.fev = hVar.q(new kotlin.jvm.a.b<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends ae>>() {
                /* renamed from: h */
                public Collection<? extends ae> invoke(kotlin.reflect.jvm.internal.impl.name.f fVar) {
                    return a.this.f(fVar);
                }
            });
            this.few = hVar.f(new kotlin.jvm.a.a<Collection<k>>() {
                /* renamed from: boS */
                public Collection<k> invoke() {
                    return a.this.buw();
                }
            });
        }

        public Collection<? extends ae> a(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
            if (fVar == null) {
                $$$reportNull$$$0(1);
            }
            if (bVar == null) {
                $$$reportNull$$$0(2);
            }
            Collection collection = (Collection) this.fev.invoke(fVar);
            if (collection == null) {
                $$$reportNull$$$0(3);
            }
            return collection;
        }

        private Collection<? extends ae> f(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            if (fVar == null) {
                $$$reportNull$$$0(4);
            }
            Collection a = a(fVar, buv().a(fVar, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
            if (a == null) {
                $$$reportNull$$$0(5);
            }
            return a;
        }

        public Collection<? extends ai> b(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
            if (fVar == null) {
                $$$reportNull$$$0(6);
            }
            if (bVar == null) {
                $$$reportNull$$$0(7);
            }
            Collection collection = (Collection) this.feu.invoke(fVar);
            if (collection == null) {
                $$$reportNull$$$0(8);
            }
            return collection;
        }

        private Collection<? extends ai> g(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            if (fVar == null) {
                $$$reportNull$$$0(9);
            }
            Collection a = a(fVar, buv().b(fVar, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
            if (a == null) {
                $$$reportNull$$$0(10);
            }
            return a;
        }

        private h buv() {
            h bsF = ((w) this.fex.brm().bup().iterator().next()).bsF();
            if (bsF == null) {
                $$$reportNull$$$0(11);
            }
            return bsF;
        }

        private <D extends CallableMemberDescriptor> Collection<? extends D> a(kotlin.reflect.jvm.internal.impl.name.f fVar, Collection<? extends D> collection) {
            if (fVar == null) {
                $$$reportNull$$$0(12);
            }
            if (collection == null) {
                $$$reportNull$$$0(13);
            }
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            OverridingUtil.a(fVar, collection, Collections.emptySet(), this.fex, new g() {
                private static /* synthetic */ void $$$reportNull$$$0(int i) {
                    Object[] objArr = new Object[3];
                    if (i == 1) {
                        objArr[0] = "fromSuper";
                    } else if (i != 2) {
                        objArr[0] = "fakeOverride";
                    } else {
                        objArr[0] = "fromCurrent";
                    }
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                    if (i == 1 || i == 2) {
                        objArr[2] = "conflict";
                    } else {
                        objArr[2] = "addFakeOverride";
                    }
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
                }

                /* Access modifiers changed, original: protected */
                public void a(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
                    if (callableMemberDescriptor == null) {
                        AnonymousClass4.$$$reportNull$$$0(1);
                    }
                    if (callableMemberDescriptor2 == null) {
                        AnonymousClass4.$$$reportNull$$$0(2);
                    }
                }

                public void g(CallableMemberDescriptor callableMemberDescriptor) {
                    if (callableMemberDescriptor == null) {
                        AnonymousClass4.$$$reportNull$$$0(0);
                    }
                    OverridingUtil.a(callableMemberDescriptor, null);
                    linkedHashSet.add(callableMemberDescriptor);
                }
            });
            return linkedHashSet;
        }

        public Collection<k> a(d dVar, kotlin.jvm.a.b<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> bVar) {
            if (dVar == null) {
                $$$reportNull$$$0(15);
            }
            if (bVar == null) {
                $$$reportNull$$$0(16);
            }
            Collection collection = (Collection) this.few.invoke();
            if (collection == null) {
                $$$reportNull$$$0(17);
            }
            return collection;
        }

        private Collection<k> buw() {
            HashSet hashSet = new HashSet();
            for (kotlin.reflect.jvm.internal.impl.name.f fVar : (Set) this.fex.fet.invoke()) {
                hashSet.addAll(b(fVar, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
                hashSet.addAll(a(fVar, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
            }
            return hashSet;
        }

        public Set<kotlin.reflect.jvm.internal.impl.name.f> bux() {
            Set set = (Set) this.fex.fet.invoke();
            if (set == null) {
                $$$reportNull$$$0(19);
            }
            return set;
        }

        public Set<kotlin.reflect.jvm.internal.impl.name.f> buy() {
            Set set = (Set) this.fex.fet.invoke();
            if (set == null) {
                $$$reportNull$$$0(21);
            }
            return set;
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        IllegalArgumentException illegalArgumentException;
        if (i != 6) {
            switch (i) {
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 6) {
            switch (i) {
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 10:
                objArr[0] = ConditionalUserProperty.NAME;
                break;
            case 3:
            case 11:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 12:
                objArr[0] = "annotations";
                break;
            case 5:
            case 13:
                objArr[0] = "source";
                break;
            case 6:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = str2;
                break;
            case 8:
                objArr[0] = "containingClass";
                break;
            case 9:
                objArr[0] = "supertype";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        String str3 = "create";
        if (i != 6) {
            switch (i) {
                case 14:
                    objArr[1] = "getUnsubstitutedMemberScope";
                    break;
                case 15:
                    objArr[1] = "getStaticScope";
                    break;
                case 16:
                    objArr[1] = "getConstructors";
                    break;
                case 17:
                    objArr[1] = "getTypeConstructor";
                    break;
                case 18:
                    objArr[1] = "getKind";
                    break;
                case 19:
                    objArr[1] = "getModality";
                    break;
                case 20:
                    objArr[1] = "getVisibility";
                    break;
                case 21:
                    objArr[1] = "getAnnotations";
                    break;
                case 22:
                    objArr[1] = "getDeclaredTypeParameters";
                    break;
                case 23:
                    objArr[1] = "getSealedSubclasses";
                    break;
                default:
                    objArr[1] = str2;
                    break;
            }
        }
        objArr[1] = str3;
        switch (i) {
            case 6:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = str3;
                break;
        }
        str = String.format(str, objArr);
        if (i != 6) {
            switch (i) {
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    break;
                default:
                    illegalArgumentException = new IllegalArgumentException(str);
                    break;
            }
        }
        illegalArgumentException = new IllegalStateException(str);
        throw illegalArgumentException;
    }

    public boolean AZ() {
        return false;
    }

    public boolean brA() {
        return false;
    }

    public boolean brB() {
        return false;
    }

    public boolean brC() {
        return false;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.d brq() {
        return null;
    }

    public c brw() {
        return null;
    }

    public boolean bry() {
        return false;
    }

    public boolean brz() {
        return false;
    }

    public static n a(kotlin.reflect.jvm.internal.impl.storage.h hVar, kotlin.reflect.jvm.internal.impl.descriptors.d dVar, kotlin.reflect.jvm.internal.impl.name.f fVar, e<Set<kotlin.reflect.jvm.internal.impl.name.f>> eVar, f fVar2, aj ajVar) {
        if (hVar == null) {
            $$$reportNull$$$0(0);
        }
        if (dVar == null) {
            $$$reportNull$$$0(1);
        }
        if (fVar == null) {
            $$$reportNull$$$0(2);
        }
        if (eVar == null) {
            $$$reportNull$$$0(3);
        }
        if (fVar2 == null) {
            $$$reportNull$$$0(4);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(5);
        }
        return new n(hVar, dVar, dVar.bsY(), fVar, eVar, fVar2, ajVar);
    }

    private n(kotlin.reflect.jvm.internal.impl.storage.h hVar, kotlin.reflect.jvm.internal.impl.descriptors.d dVar, w wVar, kotlin.reflect.jvm.internal.impl.name.f fVar, e<Set<kotlin.reflect.jvm.internal.impl.name.f>> eVar, f fVar2, aj ajVar) {
        if (hVar == null) {
            $$$reportNull$$$0(7);
        }
        if (dVar == null) {
            $$$reportNull$$$0(8);
        }
        if (wVar == null) {
            $$$reportNull$$$0(9);
        }
        if (fVar == null) {
            $$$reportNull$$$0(10);
        }
        if (eVar == null) {
            $$$reportNull$$$0(11);
        }
        if (fVar2 == null) {
            $$$reportNull$$$0(12);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(13);
        }
        super(hVar, dVar, fVar, ajVar, false);
        this.fdr = fVar2;
        this.fen = new kotlin.reflect.jvm.internal.impl.types.e(this, Collections.emptyList(), Collections.singleton(wVar), hVar);
        this.fes = new a(this, hVar);
        this.fet = eVar;
    }

    public h bro() {
        h hVar = this.fes;
        if (hVar == null) {
            $$$reportNull$$$0(14);
        }
        return hVar;
    }

    public h brl() {
        h.c cVar = h.c.fuD;
        if (cVar == null) {
            $$$reportNull$$$0(15);
        }
        return cVar;
    }

    public Collection<c> brs() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            $$$reportNull$$$0(16);
        }
        return emptyList;
    }

    public an brm() {
        an anVar = this.fen;
        if (anVar == null) {
            $$$reportNull$$$0(17);
        }
        return anVar;
    }

    public ClassKind brt() {
        ClassKind classKind = ClassKind.ENUM_ENTRY;
        if (classKind == null) {
            $$$reportNull$$$0(18);
        }
        return classKind;
    }

    public Modality bru() {
        Modality modality = Modality.FINAL;
        if (modality == null) {
            $$$reportNull$$$0(19);
        }
        return modality;
    }

    public aw brx() {
        aw awVar = av.fde;
        if (awVar == null) {
            $$$reportNull$$$0(20);
        }
        return awVar;
    }

    public f brE() {
        f fVar = this.fdr;
        if (fVar == null) {
            $$$reportNull$$$0(21);
        }
        return fVar;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("enum entry ");
        stringBuilder.append(bsZ());
        return stringBuilder.toString();
    }

    public List<ao> brI() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            $$$reportNull$$$0(22);
        }
        return emptyList;
    }

    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> brH() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            $$$reportNull$$$0(23);
        }
        return emptyList;
    }
}
