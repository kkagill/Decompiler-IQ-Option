package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.a.b;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.c;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.load.java.structure.i;
import kotlin.reflect.jvm.internal.impl.load.java.structure.j;
import kotlin.reflect.jvm.internal.impl.load.java.structure.p;
import kotlin.reflect.jvm.internal.impl.load.java.structure.q;
import kotlin.reflect.jvm.internal.impl.load.java.structure.v;
import kotlin.reflect.jvm.internal.impl.load.java.structure.y;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.g;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.l;

/* compiled from: DescriptorResolverUtils */
public final class a {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 5 || i == 11 || i == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        int i2 = (i == 5 || i == 11 || i == 17) ? 2 : 3;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = str2;
                break;
            case 19:
                objArr[0] = "annotationClass";
                break;
            case 20:
                objArr[0] = "member";
                break;
            case 21:
            case 22:
                objArr[0] = "method";
                break;
            case 23:
                objArr[0] = "fqName";
                break;
            default:
                objArr[0] = ConditionalUserProperty.NAME;
                break;
        }
        String str3 = "resolveOverrides";
        String str4 = "resolveOverridesForStaticMembers";
        String str5 = "resolveOverridesForNonStaticMembers";
        if (i == 5) {
            objArr[1] = str5;
        } else if (i == 11) {
            objArr[1] = str4;
        } else if (i != 17) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        switch (i) {
            case 5:
            case 11:
            case 17:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = str4;
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = str3;
                break;
            case 18:
            case 19:
                objArr[2] = "getAnnotationParameterByName";
                break;
            case 20:
                objArr[2] = "isObjectMethodInInterface";
                break;
            case 21:
                objArr[2] = "isObjectMethod";
                break;
            case 22:
            case 23:
                objArr[2] = "isMethodWithOneParameterWithFqName";
                break;
            default:
                objArr[2] = str5;
                break;
        }
        str = String.format(str, objArr);
        IllegalArgumentException illegalStateException = (i == 5 || i == 11 || i == 17) ? new IllegalStateException(str) : new IllegalArgumentException(str);
        throw illegalStateException;
    }

    public static <D extends CallableMemberDescriptor> Collection<D> a(f fVar, Collection<D> collection, Collection<D> collection2, d dVar, l lVar) {
        if (fVar == null) {
            $$$reportNull$$$0(0);
        }
        if (collection == null) {
            $$$reportNull$$$0(1);
        }
        if (collection2 == null) {
            $$$reportNull$$$0(2);
        }
        if (dVar == null) {
            $$$reportNull$$$0(3);
        }
        if (lVar == null) {
            $$$reportNull$$$0(4);
        }
        Collection a = a(fVar, collection, collection2, dVar, lVar, false);
        if (a == null) {
            $$$reportNull$$$0(5);
        }
        return a;
    }

    public static <D extends CallableMemberDescriptor> Collection<D> b(f fVar, Collection<D> collection, Collection<D> collection2, d dVar, l lVar) {
        if (fVar == null) {
            $$$reportNull$$$0(6);
        }
        if (collection == null) {
            $$$reportNull$$$0(7);
        }
        if (collection2 == null) {
            $$$reportNull$$$0(8);
        }
        if (dVar == null) {
            $$$reportNull$$$0(9);
        }
        if (lVar == null) {
            $$$reportNull$$$0(10);
        }
        Collection a = a(fVar, collection, collection2, dVar, lVar, true);
        if (a == null) {
            $$$reportNull$$$0(11);
        }
        return a;
    }

    private static <D extends CallableMemberDescriptor> Collection<D> a(f fVar, Collection<D> collection, Collection<D> collection2, d dVar, final l lVar, final boolean z) {
        if (fVar == null) {
            $$$reportNull$$$0(12);
        }
        if (collection == null) {
            $$$reportNull$$$0(13);
        }
        if (collection2 == null) {
            $$$reportNull$$$0(14);
        }
        if (dVar == null) {
            $$$reportNull$$$0(15);
        }
        if (lVar == null) {
            $$$reportNull$$$0(16);
        }
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        OverridingUtil.a(fVar, collection, collection2, dVar, new g() {
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                Object[] objArr = new Object[3];
                if (i == 1) {
                    objArr[0] = "fromSuper";
                } else if (i == 2) {
                    objArr[0] = "fromCurrent";
                } else if (i == 3) {
                    objArr[0] = "member";
                } else if (i != 4) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "overridden";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
                if (i == 1 || i == 2) {
                    objArr[2] = "conflict";
                } else if (i == 3 || i == 4) {
                    objArr[2] = "setOverriddenDescriptors";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            public void a(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
                if (callableMemberDescriptor == null) {
                    AnonymousClass1.$$$reportNull$$$0(1);
                }
                if (callableMemberDescriptor2 == null) {
                    AnonymousClass1.$$$reportNull$$$0(2);
                }
            }

            public void g(CallableMemberDescriptor callableMemberDescriptor) {
                if (callableMemberDescriptor == null) {
                    AnonymousClass1.$$$reportNull$$$0(0);
                }
                OverridingUtil.a(callableMemberDescriptor, new b<CallableMemberDescriptor, kotlin.l>() {
                    private static /* synthetic */ void $$$reportNull$$$0(int i) {
                        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"}));
                    }

                    /* renamed from: w */
                    public kotlin.l invoke(CallableMemberDescriptor callableMemberDescriptor) {
                        if (callableMemberDescriptor == null) {
                            AnonymousClass1.$$$reportNull$$$0(0);
                        }
                        lVar.d(callableMemberDescriptor);
                        return kotlin.l.eVB;
                    }
                });
                linkedHashSet.add(callableMemberDescriptor);
            }

            public void a(CallableMemberDescriptor callableMemberDescriptor, Collection<? extends CallableMemberDescriptor> collection) {
                if (callableMemberDescriptor == null) {
                    AnonymousClass1.$$$reportNull$$$0(3);
                }
                if (collection == null) {
                    AnonymousClass1.$$$reportNull$$$0(4);
                }
                if (!z || callableMemberDescriptor.bsT() == Kind.FAKE_OVERRIDE) {
                    super.a(callableMemberDescriptor, collection);
                }
            }
        });
        return linkedHashSet;
    }

    public static ar b(f fVar, d dVar) {
        if (fVar == null) {
            $$$reportNull$$$0(18);
        }
        if (dVar == null) {
            $$$reportNull$$$0(19);
        }
        Collection brs = dVar.brs();
        if (brs.size() != 1) {
            return null;
        }
        for (ar arVar : ((c) brs.iterator().next()).bsP()) {
            if (arVar.bsZ().equals(fVar)) {
                return arVar;
            }
        }
        return null;
    }

    public static boolean a(p pVar) {
        if (pVar == null) {
            $$$reportNull$$$0(20);
        }
        return pVar.bxC().isInterface() && (pVar instanceof q) && a((q) pVar);
    }

    public static boolean a(q qVar) {
        if (qVar == null) {
            $$$reportNull$$$0(21);
        }
        String boi = qVar.bsZ().boi();
        if (boi.equals("toString") || boi.equals("hashCode")) {
            return qVar.bsP().isEmpty();
        }
        return boi.equals("equals") ? a(qVar, "java.lang.Object") : false;
    }

    private static boolean a(q qVar, String str) {
        if (qVar == null) {
            $$$reportNull$$$0(22);
        }
        if (str == null) {
            $$$reportNull$$$0(23);
        }
        List bsP = qVar.bsP();
        boolean z = true;
        if (bsP.size() == 1) {
            v bxA = ((y) bsP.get(0)).bxA();
            if (bxA instanceof j) {
                i bxs = ((j) bxA).bxs();
                if (bxs instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.g) {
                    kotlin.reflect.jvm.internal.impl.name.b btB = ((kotlin.reflect.jvm.internal.impl.load.java.structure.g) bxs).btB();
                    if (btB == null || !btB.boi().equals(str)) {
                        z = false;
                    }
                    return z;
                }
            }
        }
        return false;
    }
}
