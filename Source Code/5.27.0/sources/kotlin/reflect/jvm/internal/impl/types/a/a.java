package kotlin.reflect.jvm.internal.impl.types.a;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ad;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.p;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.p.b;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: ErrorSimpleFunctionDescriptorImpl */
public class a extends ad {
    private final b fyf;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        int i2 = (i == 6 || i == 7 || i == 8) ? 2 : 3;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl";
        switch (i) {
            case 1:
                objArr[0] = "ownerScope";
                break;
            case 2:
                objArr[0] = "newOwner";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "annotations";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = str2;
                break;
            case 9:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "createSubstitutedCopy";
        if (i == 6) {
            objArr[1] = str3;
        } else if (i == 7) {
            objArr[1] = "copy";
        } else if (i != 8) {
            objArr[1] = str2;
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
                objArr[2] = str3;
                break;
            case 6:
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        str = String.format(str, objArr);
        IllegalArgumentException illegalStateException = (i == 6 || i == 7 || i == 8) ? new IllegalStateException(str) : new IllegalArgumentException(str);
        throw illegalStateException;
    }

    public void K(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            $$$reportNull$$$0(9);
        }
    }

    public <V> V a(kotlin.reflect.jvm.internal.impl.descriptors.a.a<V> aVar) {
        return null;
    }

    /* Access modifiers changed, original: protected */
    public p a(k kVar, s sVar, Kind kind, f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar2, aj ajVar) {
        if (kVar == null) {
            $$$reportNull$$$0(2);
        }
        if (kind == null) {
            $$$reportNull$$$0(3);
        }
        if (fVar2 == null) {
            $$$reportNull$$$0(4);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(5);
        }
        return this;
    }

    public boolean bto() {
        return false;
    }

    /* renamed from: f */
    public ai c(k kVar, Modality modality, aw awVar, Kind kind, boolean z) {
        return this;
    }

    public a(d dVar, b bVar) {
        if (dVar == null) {
            $$$reportNull$$$0(0);
        }
        if (bVar == null) {
            $$$reportNull$$$0(1);
        }
        super(dVar, null, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA.bug(), f.mu("<ERROR FUNCTION>"), Kind.DECLARATION, aj.fcV);
        this.fyf = bVar;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.s.a<? extends ai> btp() {
        return new kotlin.reflect.jvm.internal.impl.descriptors.s.a<ai>() {
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                String str;
                int i2;
                IllegalArgumentException illegalArgumentException;
                int i3 = i;
                if (!(i3 == 1 || i3 == 3 || i3 == 5 || i3 == 10 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 18 || i3 == 30 || i3 == 7 || i3 == 8)) {
                    switch (i3) {
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                            break;
                        default:
                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                            break;
                    }
                }
                str = "@NotNull method %s.%s must not return null";
                if (!(i3 == 1 || i3 == 3 || i3 == 5 || i3 == 10 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 18 || i3 == 30 || i3 == 7 || i3 == 8)) {
                    switch (i3) {
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                            break;
                        default:
                            i2 = 3;
                            break;
                    }
                }
                i2 = 2;
                Object[] objArr = new Object[i2];
                String str2 = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl$1";
                switch (i3) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                    case 14:
                    case 16:
                    case 18:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 30:
                        objArr[0] = str2;
                        break;
                    case 2:
                        objArr[0] = "modality";
                        break;
                    case 4:
                        objArr[0] = "visibility";
                        break;
                    case 6:
                        objArr[0] = "kind";
                        break;
                    case 9:
                        objArr[0] = ConditionalUserProperty.NAME;
                        break;
                    case 11:
                    case 17:
                        objArr[0] = "parameters";
                        break;
                    case 13:
                        objArr[0] = "substitution";
                        break;
                    case 15:
                        objArr[0] = "userDataKey";
                        break;
                    case 19:
                        objArr[0] = "type";
                        break;
                    case 29:
                        objArr[0] = "additionalAnnotations";
                        break;
                    default:
                        objArr[0] = "owner";
                        break;
                }
                String str3 = "setOwner";
                if (i3 == 1) {
                    objArr[1] = str3;
                } else if (i3 == 3) {
                    objArr[1] = "setModality";
                } else if (i3 == 5) {
                    objArr[1] = "setVisibility";
                } else if (i3 == 10) {
                    objArr[1] = "setName";
                } else if (i3 == 12) {
                    objArr[1] = "setValueParameters";
                } else if (i3 == 14) {
                    objArr[1] = "setSubstitution";
                } else if (i3 == 16) {
                    objArr[1] = "putUserData";
                } else if (i3 == 18) {
                    objArr[1] = "setTypeParameters";
                } else if (i3 == 30) {
                    objArr[1] = "setAdditionalAnnotations";
                } else if (i3 == 7) {
                    objArr[1] = "setKind";
                } else if (i3 != 8) {
                    switch (i3) {
                        case 20:
                            objArr[1] = "setReturnType";
                            break;
                        case 21:
                            objArr[1] = "setExtensionReceiverParameter";
                            break;
                        case 22:
                            objArr[1] = "setDispatchReceiverParameter";
                            break;
                        case 23:
                            objArr[1] = "setOriginal";
                            break;
                        case 24:
                            objArr[1] = "setSignatureChange";
                            break;
                        case 25:
                            objArr[1] = "setPreserveSourceElement";
                            break;
                        case 26:
                            objArr[1] = "setDropOriginalInContainingParts";
                            break;
                        case 27:
                            objArr[1] = "setHiddenToOvercomeSignatureClash";
                            break;
                        case 28:
                            objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                            break;
                        default:
                            objArr[1] = str2;
                            break;
                    }
                } else {
                    objArr[1] = "setCopyOverrides";
                }
                switch (i3) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                    case 14:
                    case 16:
                    case 18:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 30:
                        break;
                    case 2:
                        objArr[2] = "setModality";
                        break;
                    case 4:
                        objArr[2] = "setVisibility";
                        break;
                    case 6:
                        objArr[2] = "setKind";
                        break;
                    case 9:
                        objArr[2] = "setName";
                        break;
                    case 11:
                        objArr[2] = "setValueParameters";
                        break;
                    case 13:
                        objArr[2] = "setSubstitution";
                        break;
                    case 15:
                        objArr[2] = "putUserData";
                        break;
                    case 17:
                        objArr[2] = "setTypeParameters";
                        break;
                    case 19:
                        objArr[2] = "setReturnType";
                        break;
                    case 29:
                        objArr[2] = "setAdditionalAnnotations";
                        break;
                    default:
                        objArr[2] = str3;
                        break;
                }
                str = String.format(str, objArr);
                if (!(i3 == 1 || i3 == 3 || i3 == 5 || i3 == 10 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 18 || i3 == 30 || i3 == 7 || i3 == 8)) {
                    switch (i3) {
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                            break;
                        default:
                            illegalArgumentException = new IllegalArgumentException(str);
                            break;
                    }
                }
                illegalArgumentException = new IllegalStateException(str);
                throw illegalArgumentException;
            }

            public kotlin.reflect.jvm.internal.impl.descriptors.s.a<ai> N(w wVar) {
                if (wVar == null) {
                    AnonymousClass1.$$$reportNull$$$0(19);
                }
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.descriptors.s.a<ai> a(Kind kind) {
                if (kind == null) {
                    AnonymousClass1.$$$reportNull$$$0(6);
                }
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.descriptors.s.a<ai> a(Modality modality) {
                if (modality == null) {
                    AnonymousClass1.$$$reportNull$$$0(2);
                }
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.descriptors.s.a<ai> a(ah ahVar) {
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.descriptors.s.a<ai> a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar) {
                if (fVar == null) {
                    AnonymousClass1.$$$reportNull$$$0(29);
                }
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.descriptors.s.a<ai> a(aw awVar) {
                if (awVar == null) {
                    AnonymousClass1.$$$reportNull$$$0(4);
                }
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.descriptors.s.a<ai> b(ah ahVar) {
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.descriptors.s.a<ai> b(as asVar) {
                if (asVar == null) {
                    AnonymousClass1.$$$reportNull$$$0(13);
                }
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.descriptors.s.a<ai> btq() {
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.descriptors.s.a<ai> btr() {
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.descriptors.s.a<ai> bts() {
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.descriptors.s.a<ai> btt() {
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.descriptors.s.a<ai> btu() {
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.descriptors.s.a<ai> cb(List<ar> list) {
                if (list == null) {
                    AnonymousClass1.$$$reportNull$$$0(11);
                }
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.descriptors.s.a<ai> e(f fVar) {
                if (fVar == null) {
                    AnonymousClass1.$$$reportNull$$$0(9);
                }
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.descriptors.s.a<ai> gq(boolean z) {
                return this;
            }

            public kotlin.reflect.jvm.internal.impl.descriptors.s.a<ai> i(k kVar) {
                if (kVar == null) {
                    AnonymousClass1.$$$reportNull$$$0(0);
                }
                return this;
            }

            /* renamed from: bPN */
            public ai btv() {
                return a.this;
            }
        };
    }
}
