package kotlin.reflect.jvm.internal.impl.resolve;

import com.facebook.g;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.a.m;
import kotlin.l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ad;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.av;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.p;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.z;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.o;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.checker.b;
import kotlin.reflect.jvm.internal.impl.types.checker.b.a;
import kotlin.reflect.jvm.internal.impl.types.checker.c;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.y;
import kotlin.reflect.jvm.internal.impl.utils.i;

public class OverridingUtil {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final List<ExternalOverridabilityCondition> ftc = u.T(ServiceLoader.load(ExternalOverridabilityCondition.class, ExternalOverridabilityCondition.class.getClassLoader()));
    public static final OverridingUtil ftd = new OverridingUtil(new a() {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean a(an anVar, an anVar2) {
            if (anVar == null) {
                AnonymousClass1.$$$reportNull$$$0(0);
            }
            if (anVar2 == null) {
                AnonymousClass1.$$$reportNull$$$0(1);
            }
            return anVar.equals(anVar2);
        }
    });
    private final a fte;

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$9 */
    static /* synthetic */ class AnonymousClass9 {
        static final /* synthetic */ int[] ftl = new int[Result.values().length];
        static final /* synthetic */ int[] ftm = new int[Result.values().length];
        static final /* synthetic */ int[] ftn = new int[Modality.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0048 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Missing block: B:35:?, code skipped:
            return;
     */
        static {
            /*
            r0 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.values();
            r0 = r0.length;
            r0 = new int[r0];
            ftn = r0;
            r0 = 1;
            r1 = ftn;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = ftn;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = ftn;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r4 = ftn;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r4 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.values();
            r4 = r4.length;
            r4 = new int[r4];
            ftm = r4;
            r4 = ftm;	 Catch:{ NoSuchFieldError -> 0x0048 }
            r5 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;	 Catch:{ NoSuchFieldError -> 0x0048 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0048 }
            r4[r5] = r0;	 Catch:{ NoSuchFieldError -> 0x0048 }
        L_0x0048:
            r4 = ftm;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r5 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.CONFLICT;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0052 }
            r4[r5] = r1;	 Catch:{ NoSuchFieldError -> 0x0052 }
        L_0x0052:
            r4 = ftm;	 Catch:{ NoSuchFieldError -> 0x005c }
            r5 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.INCOMPATIBLE;	 Catch:{ NoSuchFieldError -> 0x005c }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x005c }
            r4[r5] = r2;	 Catch:{ NoSuchFieldError -> 0x005c }
        L_0x005c:
            r4 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.values();
            r4 = r4.length;
            r4 = new int[r4];
            ftl = r4;
            r4 = ftl;	 Catch:{ NoSuchFieldError -> 0x006f }
            r5 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.OVERRIDABLE;	 Catch:{ NoSuchFieldError -> 0x006f }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x006f }
            r4[r5] = r0;	 Catch:{ NoSuchFieldError -> 0x006f }
        L_0x006f:
            r0 = ftl;	 Catch:{ NoSuchFieldError -> 0x0079 }
            r4 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.CONFLICT;	 Catch:{ NoSuchFieldError -> 0x0079 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0079 }
            r0[r4] = r1;	 Catch:{ NoSuchFieldError -> 0x0079 }
        L_0x0079:
            r0 = ftl;	 Catch:{ NoSuchFieldError -> 0x0083 }
            r1 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE;	 Catch:{ NoSuchFieldError -> 0x0083 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0083 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0083 }
        L_0x0083:
            r0 = ftl;	 Catch:{ NoSuchFieldError -> 0x008d }
            r1 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN;	 Catch:{ NoSuchFieldError -> 0x008d }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x008d }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x008d }
        L_0x008d:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$AnonymousClass9.<clinit>():void");
        }
    }

    public static class OverrideCompatibilityInfo {
        private static final OverrideCompatibilityInfo fto = new OverrideCompatibilityInfo(Result.OVERRIDABLE, "SUCCESS");
        private final Result ftp;
        private final String ftq;

        public enum Result {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0055  */
        private static /* synthetic */ void $$$reportNull$$$0(int r11) {
            /*
            r0 = 6;
            r1 = 5;
            r2 = 3;
            r3 = 1;
            if (r11 == r3) goto L_0x000f;
        L_0x0006:
            if (r11 == r2) goto L_0x000f;
        L_0x0008:
            if (r11 == r1) goto L_0x000f;
        L_0x000a:
            if (r11 == r0) goto L_0x000f;
        L_0x000c:
            r4 = "@NotNull method %s.%s must not return null";
            goto L_0x0011;
        L_0x000f:
            r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        L_0x0011:
            r5 = 2;
            if (r11 == r3) goto L_0x001c;
        L_0x0014:
            if (r11 == r2) goto L_0x001c;
        L_0x0016:
            if (r11 == r1) goto L_0x001c;
        L_0x0018:
            if (r11 == r0) goto L_0x001c;
        L_0x001a:
            r6 = 2;
            goto L_0x001d;
        L_0x001c:
            r6 = 3;
        L_0x001d:
            r6 = new java.lang.Object[r6];
            r7 = "success";
            r8 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
            r9 = 0;
            if (r11 == r3) goto L_0x0033;
        L_0x0027:
            if (r11 == r2) goto L_0x0033;
        L_0x0029:
            if (r11 == r1) goto L_0x0030;
        L_0x002b:
            if (r11 == r0) goto L_0x0033;
        L_0x002d:
            r6[r9] = r8;
            goto L_0x0037;
        L_0x0030:
            r6[r9] = r7;
            goto L_0x0037;
        L_0x0033:
            r10 = "debugMessage";
            r6[r9] = r10;
        L_0x0037:
            r9 = "conflict";
            r10 = "incompatible";
            switch(r11) {
                case 1: goto L_0x0051;
                case 2: goto L_0x004e;
                case 3: goto L_0x0051;
                case 4: goto L_0x004b;
                case 5: goto L_0x0051;
                case 6: goto L_0x0051;
                case 7: goto L_0x0046;
                case 8: goto L_0x0041;
                default: goto L_0x003e;
            };
        L_0x003e:
            r6[r3] = r7;
            goto L_0x0053;
        L_0x0041:
            r7 = "getDebugMessage";
            r6[r3] = r7;
            goto L_0x0053;
        L_0x0046:
            r7 = "getResult";
            r6[r3] = r7;
            goto L_0x0053;
        L_0x004b:
            r6[r3] = r9;
            goto L_0x0053;
        L_0x004e:
            r6[r3] = r10;
            goto L_0x0053;
        L_0x0051:
            r6[r3] = r8;
        L_0x0053:
            if (r11 == r3) goto L_0x0064;
        L_0x0055:
            if (r11 == r2) goto L_0x0061;
        L_0x0057:
            if (r11 == r1) goto L_0x005c;
        L_0x0059:
            if (r11 == r0) goto L_0x005c;
        L_0x005b:
            goto L_0x0066;
        L_0x005c:
            r7 = "<init>";
            r6[r5] = r7;
            goto L_0x0066;
        L_0x0061:
            r6[r5] = r9;
            goto L_0x0066;
        L_0x0064:
            r6[r5] = r10;
        L_0x0066:
            r4 = java.lang.String.format(r4, r6);
            if (r11 == r3) goto L_0x0078;
        L_0x006c:
            if (r11 == r2) goto L_0x0078;
        L_0x006e:
            if (r11 == r1) goto L_0x0078;
        L_0x0070:
            if (r11 == r0) goto L_0x0078;
        L_0x0072:
            r11 = new java.lang.IllegalStateException;
            r11.<init>(r4);
            goto L_0x007d;
        L_0x0078:
            r11 = new java.lang.IllegalArgumentException;
            r11.<init>(r4);
        L_0x007d:
            throw r11;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo.$$$reportNull$$$0(int):void");
        }

        public static OverrideCompatibilityInfo bMU() {
            OverrideCompatibilityInfo overrideCompatibilityInfo = fto;
            if (overrideCompatibilityInfo == null) {
                $$$reportNull$$$0(0);
            }
            return overrideCompatibilityInfo;
        }

        public static OverrideCompatibilityInfo mE(String str) {
            if (str == null) {
                $$$reportNull$$$0(1);
            }
            return new OverrideCompatibilityInfo(Result.INCOMPATIBLE, str);
        }

        public static OverrideCompatibilityInfo mF(String str) {
            if (str == null) {
                $$$reportNull$$$0(3);
            }
            return new OverrideCompatibilityInfo(Result.CONFLICT, str);
        }

        public OverrideCompatibilityInfo(Result result, String str) {
            if (result == null) {
                $$$reportNull$$$0(5);
            }
            if (str == null) {
                $$$reportNull$$$0(6);
            }
            this.ftp = result;
            this.ftq = str;
        }

        public Result bMV() {
            Result result = this.ftp;
            if (result == null) {
                $$$reportNull$$$0(7);
            }
            return result;
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        IllegalArgumentException illegalArgumentException;
        int i3 = i;
        if (!(i3 == 1 || i3 == 3 || i3 == 11 || i3 == 16 || i3 == 90 || i3 == 93 || i3 == 98 || i3 == 102 || i3 == 6 || i3 == 7 || i3 == 39 || i3 == 40)) {
            switch (i3) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    break;
                default:
                    switch (i3) {
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                            break;
                        default:
                            switch (i3) {
                                case 74:
                                case 75:
                                case 76:
                                case 77:
                                case 78:
                                    break;
                                default:
                                    switch (i3) {
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                            }
                    }
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i3 == 1 || i3 == 3 || i3 == 11 || i3 == 16 || i3 == 90 || i3 == 93 || i3 == 98 || i3 == 102 || i3 == 6 || i3 == 7 || i3 == 39 || i3 == 40)) {
            switch (i3) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    break;
                default:
                    switch (i3) {
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                            break;
                        default:
                            switch (i3) {
                                case 74:
                                case 75:
                                case 76:
                                case 77:
                                case 78:
                                    break;
                                default:
                                    switch (i3) {
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                            }
                    }
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
        switch (i3) {
            case 1:
            case 3:
            case 6:
            case 7:
            case 11:
            case 16:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 39:
            case 40:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 84:
            case 85:
            case 86:
            case 87:
            case 90:
            case 93:
            case 98:
            case 102:
                objArr[0] = str2;
                break;
            case 2:
            case 4:
                objArr[0] = "candidateSet";
                break;
            case 5:
                objArr[0] = "transformFirst";
                break;
            case 8:
                objArr[0] = "f";
                break;
            case 9:
                objArr[0] = g.TAG;
                break;
            case 10:
            case 12:
                objArr[0] = "descriptor";
                break;
            case 13:
                objArr[0] = "result";
                break;
            case 14:
            case 17:
            case 25:
            case 35:
                objArr[0] = "superDescriptor";
                break;
            case 15:
            case 18:
            case 26:
            case 36:
                objArr[0] = "subDescriptor";
                break;
            case 37:
                objArr[0] = "firstParameters";
                break;
            case 38:
                objArr[0] = "secondParameters";
                break;
            case 41:
                objArr[0] = "typeInSuper";
                break;
            case 42:
                objArr[0] = "typeInSub";
                break;
            case 43:
            case 46:
                objArr[0] = "typeChecker";
                break;
            case 44:
                objArr[0] = "superTypeParameter";
                break;
            case 45:
                objArr[0] = "subTypeParameter";
                break;
            case 47:
                objArr[0] = ConditionalUserProperty.NAME;
                break;
            case 48:
                objArr[0] = "membersFromSupertypes";
                break;
            case 49:
                objArr[0] = "membersFromCurrent";
                break;
            case 50:
            case 56:
            case 59:
            case 80:
            case 83:
            case 91:
                objArr[0] = "current";
                break;
            case 51:
            case 57:
            case 61:
            case 81:
            case 101:
                objArr[0] = "strategy";
                break;
            case 52:
                objArr[0] = "overriding";
                break;
            case 53:
                objArr[0] = "fromSuper";
                break;
            case 54:
                objArr[0] = "fromCurrent";
                break;
            case 55:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 58:
            case 60:
                objArr[0] = "notOverridden";
                break;
            case 62:
            case 64:
            case 68:
                objArr[0] = "a";
                break;
            case 63:
            case 65:
            case 70:
                objArr[0] = "b";
                break;
            case 66:
                objArr[0] = "candidate";
                break;
            case 67:
            case 82:
            case 88:
            case 105:
                objArr[0] = "descriptors";
                break;
            case 69:
                objArr[0] = "aReturnType";
                break;
            case 71:
                objArr[0] = "bReturnType";
                break;
            case 72:
            case 79:
                objArr[0] = "overridables";
                break;
            case 73:
            case 96:
                objArr[0] = "descriptorByHandle";
                break;
            case 89:
                objArr[0] = "classModality";
                break;
            case 92:
                objArr[0] = "toFilter";
                break;
            case 94:
            case 99:
                objArr[0] = "overrider";
                break;
            case 95:
            case 100:
                objArr[0] = "extractFrom";
                break;
            case 97:
                objArr[0] = "onConflict";
                break;
            case 103:
            case 104:
                objArr[0] = "memberDescriptor";
                break;
            default:
                objArr[0] = "equalityAxioms";
                break;
        }
        if (i3 == 1) {
            objArr[1] = "createWithEqualityAxioms";
        } else if (i3 == 3) {
            objArr[1] = "filterOutOverridden";
        } else if (i3 != 11) {
            if (i3 != 16) {
                if (i3 == 90) {
                    objArr[1] = "getMinimalModality";
                } else if (i3 != 93) {
                    if (i3 != 98 && i3 != 102) {
                        if (i3 != 6 && i3 != 7) {
                            if (i3 != 39 && i3 != 40) {
                                switch (i3) {
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                        break;
                                    default:
                                        switch (i3) {
                                            case 27:
                                            case 28:
                                            case 29:
                                            case 30:
                                            case 31:
                                            case 32:
                                            case 33:
                                            case 34:
                                                objArr[1] = "isOverridableByWithoutExternalConditions";
                                                break;
                                            default:
                                                switch (i3) {
                                                    case 74:
                                                    case 75:
                                                    case 76:
                                                    case 77:
                                                    case 78:
                                                        objArr[1] = "selectMostSpecificMember";
                                                        break;
                                                    default:
                                                        switch (i3) {
                                                            case 84:
                                                            case 85:
                                                            case 86:
                                                            case 87:
                                                                objArr[1] = "determineModalityForFakeOverride";
                                                                break;
                                                            default:
                                                                objArr[1] = str2;
                                                                break;
                                                        }
                                                }
                                        }
                                }
                            }
                            objArr[1] = "createTypeChecker";
                        } else {
                            objArr[1] = "filterOverrides";
                        }
                    } else {
                        objArr[1] = "extractMembersOverridableInBothWays";
                    }
                } else {
                    objArr[1] = "filterVisibleFakeOverrides";
                }
            }
            objArr[1] = "isOverridableBy";
        } else {
            objArr[1] = "getOverriddenDeclarations";
        }
        switch (i3) {
            case 1:
            case 3:
            case 6:
            case 7:
            case 11:
            case 16:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 39:
            case 40:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 84:
            case 85:
            case 86:
            case 87:
            case 90:
            case 93:
            case 98:
            case 102:
                break;
            case 2:
                objArr[2] = "filterOutOverridden";
                break;
            case 4:
            case 5:
                objArr[2] = "filterOverrides";
                break;
            case 8:
            case 9:
                objArr[2] = "overrides";
                break;
            case 10:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 12:
            case 13:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 14:
            case 15:
            case 17:
            case 18:
                objArr[2] = "isOverridableBy";
                break;
            case 25:
            case 26:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 35:
            case 36:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 37:
            case 38:
                objArr[2] = "createTypeChecker";
                break;
            case 41:
            case 42:
            case 43:
                objArr[2] = "areTypesEquivalent";
                break;
            case 44:
            case 45:
            case 46:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 52:
            case 53:
                objArr[2] = "isVisibleForOverride";
                break;
            case 54:
            case 55:
            case 56:
            case 57:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 58:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 59:
            case 60:
            case 61:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 62:
            case 63:
                objArr[2] = "isMoreSpecific";
                break;
            case 64:
            case 65:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 66:
            case 67:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 68:
            case 69:
            case 70:
            case 71:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 72:
            case 73:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 79:
            case 80:
            case 81:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 82:
            case 83:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 88:
            case 89:
                objArr[2] = "getMinimalModality";
                break;
            case 91:
            case 92:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 94:
            case 95:
            case 96:
            case 97:
            case 99:
            case 100:
            case 101:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 103:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 104:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 105:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithEqualityAxioms";
                break;
        }
        str = String.format(str, objArr);
        if (!(i3 == 1 || i3 == 3 || i3 == 11 || i3 == 16 || i3 == 90 || i3 == 93 || i3 == 98 || i3 == 102 || i3 == 6 || i3 == 7 || i3 == 39 || i3 == 40)) {
            switch (i3) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    break;
                default:
                    switch (i3) {
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                            break;
                        default:
                            switch (i3) {
                                case 74:
                                case 75:
                                case 76:
                                case 77:
                                case 78:
                                    break;
                                default:
                                    switch (i3) {
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                            break;
                                        default:
                                            illegalArgumentException = new IllegalArgumentException(str);
                                            break;
                                    }
                            }
                    }
            }
        }
        illegalArgumentException = new IllegalStateException(str);
        throw illegalArgumentException;
    }

    public static OverridingUtil a(a aVar) {
        if (aVar == null) {
            $$$reportNull$$$0(0);
        }
        return new OverridingUtil(aVar);
    }

    private OverridingUtil(a aVar) {
        this.fte = aVar;
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> Set<D> q(Set<D> set) {
        if (set == null) {
            $$$reportNull$$$0(2);
        }
        Set a = a((Set) set, new m<D, D, Pair<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a>>() {
            /* renamed from: h */
            public Pair<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a> w(D d, D d2) {
                return new Pair(d, d2);
            }
        });
        if (a == null) {
            $$$reportNull$$$0(3);
        }
        return a;
    }

    public static <D> Set<D> a(Set<D> set, m<? super D, ? super D, Pair<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a>> mVar) {
        if (set == null) {
            $$$reportNull$$$0(4);
        }
        if (mVar == null) {
            $$$reportNull$$$0(5);
        }
        if (set.size() <= 1) {
            if (set == null) {
                $$$reportNull$$$0(6);
            }
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object next : set) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) mVar.w(next, it.next());
                kotlin.reflect.jvm.internal.impl.descriptors.a aVar = (kotlin.reflect.jvm.internal.impl.descriptors.a) pair.bnj();
                kotlin.reflect.jvm.internal.impl.descriptors.a aVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) pair.bnk();
                if (c(aVar, aVar2)) {
                    it.remove();
                } else if (c(aVar2, aVar)) {
                    break;
                }
            }
            linkedHashSet.add(next);
        }
        return linkedHashSet;
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> boolean c(D d, D d2) {
        if (d == null) {
            $$$reportNull$$$0(8);
        }
        if (d2 == null) {
            $$$reportNull$$$0(9);
        }
        if (!d.equals(d2) && a.fsJ.d(d.bsO(), d2.bsO())) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.a bsO = d2.bsO();
        for (kotlin.reflect.jvm.internal.impl.descriptors.a d3 : c.f(d)) {
            if (a.fsJ.d(bsO, d3)) {
                return true;
            }
        }
        return false;
    }

    public static Set<CallableMemberDescriptor> A(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(10);
        }
        Set linkedHashSet = new LinkedHashSet();
        a(callableMemberDescriptor, linkedHashSet);
        return linkedHashSet;
    }

    private static void a(CallableMemberDescriptor callableMemberDescriptor, Set<CallableMemberDescriptor> set) {
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(12);
        }
        if (set == null) {
            $$$reportNull$$$0(13);
        }
        if (callableMemberDescriptor.bsT().isReal()) {
            set.add(callableMemberDescriptor);
        } else if (callableMemberDescriptor.bsR().isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No overridden descriptors found for (fake override) ");
            stringBuilder.append(callableMemberDescriptor);
            throw new IllegalStateException(stringBuilder.toString());
        } else {
            for (CallableMemberDescriptor a : callableMemberDescriptor.bsR()) {
                a(a, (Set) set);
            }
        }
    }

    public OverrideCompatibilityInfo c(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, d dVar) {
        if (aVar == null) {
            $$$reportNull$$$0(14);
        }
        if (aVar2 == null) {
            $$$reportNull$$$0(15);
        }
        OverrideCompatibilityInfo a = a(aVar, aVar2, dVar, false);
        if (a == null) {
            $$$reportNull$$$0(16);
        }
        return a;
    }

    public OverrideCompatibilityInfo a(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, d dVar, boolean z) {
        if (aVar == null) {
            $$$reportNull$$$0(17);
        }
        if (aVar2 == null) {
            $$$reportNull$$$0(18);
        }
        OverrideCompatibilityInfo b = b(aVar, aVar2, z);
        Object obj = b.bMV() == Result.OVERRIDABLE ? 1 : null;
        Iterator it = ftc.iterator();
        while (true) {
            String str = "External condition";
            String str2 = "External condition failed";
            OverrideCompatibilityInfo mF;
            if (it.hasNext()) {
                ExternalOverridabilityCondition externalOverridabilityCondition = (ExternalOverridabilityCondition) it.next();
                if (externalOverridabilityCondition.bvx() != Contract.CONFLICTS_ONLY) {
                    if (obj == null || externalOverridabilityCondition.bvx() != Contract.SUCCESS_ONLY) {
                        int i = AnonymousClass9.ftl[externalOverridabilityCondition.a(aVar, aVar2, dVar).ordinal()];
                        if (i == 1) {
                            obj = 1;
                        } else if (i == 2) {
                            mF = OverrideCompatibilityInfo.mF(str2);
                            if (mF == null) {
                                $$$reportNull$$$0(19);
                            }
                            return mF;
                        } else if (i == 3) {
                            mF = OverrideCompatibilityInfo.mE(str);
                            if (mF == null) {
                                $$$reportNull$$$0(20);
                            }
                            return mF;
                        }
                    }
                }
            } else if (obj == null) {
                if (b == null) {
                    $$$reportNull$$$0(21);
                }
                return b;
            } else {
                for (ExternalOverridabilityCondition externalOverridabilityCondition2 : ftc) {
                    if (externalOverridabilityCondition2.bvx() == Contract.CONFLICTS_ONLY) {
                        int i2 = AnonymousClass9.ftl[externalOverridabilityCondition2.a(aVar, aVar2, dVar).ordinal()];
                        if (i2 == 1) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Contract violation in ");
                            stringBuilder.append(externalOverridabilityCondition2.getClass().getName());
                            stringBuilder.append(" condition. It's not supposed to end with success");
                            throw new IllegalStateException(stringBuilder.toString());
                        } else if (i2 == 2) {
                            mF = OverrideCompatibilityInfo.mF(str2);
                            if (mF == null) {
                                $$$reportNull$$$0(22);
                            }
                            return mF;
                        } else if (i2 == 3) {
                            mF = OverrideCompatibilityInfo.mE(str);
                            if (mF == null) {
                                $$$reportNull$$$0(23);
                            }
                            return mF;
                        }
                    }
                }
                mF = OverrideCompatibilityInfo.bMU();
                if (mF == null) {
                    $$$reportNull$$$0(24);
                }
                return mF;
            }
        }
    }

    public OverrideCompatibilityInfo b(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, boolean z) {
        if (aVar == null) {
            $$$reportNull$$$0(25);
        }
        if (aVar2 == null) {
            $$$reportNull$$$0(26);
        }
        OverrideCompatibilityInfo d = d(aVar, aVar2);
        if (d != null) {
            if (d == null) {
                $$$reportNull$$$0(27);
            }
            return d;
        }
        List h = h(aVar);
        List h2 = h(aVar2);
        List bsM = aVar.bsM();
        List bsM2 = aVar2.bsM();
        int i = 0;
        OverrideCompatibilityInfo mF;
        if (bsM.size() != bsM2.size()) {
            while (true) {
                String str = "Type parameter number mismatch";
                if (i >= h.size()) {
                    mF = OverrideCompatibilityInfo.mF(str);
                    if (mF == null) {
                        $$$reportNull$$$0(29);
                    }
                    return mF;
                } else if (b.fxI.d((w) h.get(i), (w) h2.get(i))) {
                    i++;
                } else {
                    mF = OverrideCompatibilityInfo.mE(str);
                    if (mF == null) {
                        $$$reportNull$$$0(28);
                    }
                    return mF;
                }
            }
        }
        b o = o(bsM, bsM2);
        int i2 = 0;
        while (i2 < bsM.size()) {
            if (a((ao) bsM.get(i2), (ao) bsM2.get(i2), o)) {
                i2++;
            } else {
                mF = OverrideCompatibilityInfo.mE("Type parameter bounds mismatch");
                if (mF == null) {
                    $$$reportNull$$$0(30);
                }
                return mF;
            }
        }
        int i3 = 0;
        while (i3 < h.size()) {
            if (a((w) h.get(i3), (w) h2.get(i3), o)) {
                i3++;
            } else {
                mF = OverrideCompatibilityInfo.mE("Value parameter type mismatch");
                if (mF == null) {
                    $$$reportNull$$$0(31);
                }
                return mF;
            }
        }
        if ((aVar instanceof s) && (aVar2 instanceof s) && ((s) aVar).bto() != ((s) aVar2).bto()) {
            mF = OverrideCompatibilityInfo.mF("Incompatible suspendability");
            if (mF == null) {
                $$$reportNull$$$0(32);
            }
            return mF;
        }
        if (z) {
            w bsN = aVar.bsN();
            w bsN2 = aVar2.bsN();
            if (!(bsN == null || bsN2 == null)) {
                if (y.aJ(bsN2) && y.aJ(bsN)) {
                    i = 1;
                }
                if (i == 0 && !o.c(bsN2, bsN)) {
                    mF = OverrideCompatibilityInfo.mF("Return type mismatch");
                    if (mF == null) {
                        $$$reportNull$$$0(33);
                    }
                    return mF;
                }
            }
        }
        mF = OverrideCompatibilityInfo.bMU();
        if (mF == null) {
            $$$reportNull$$$0(34);
        }
        return mF;
    }

    public static OverrideCompatibilityInfo d(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        if (aVar == null) {
            $$$reportNull$$$0(35);
        }
        if (aVar2 == null) {
            $$$reportNull$$$0(36);
        }
        boolean z = aVar instanceof s;
        if (!z || (aVar2 instanceof s)) {
            boolean z2 = aVar instanceof ae;
            if (!z2 || (aVar2 instanceof ae)) {
                if (!z && !z2) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("This type of CallableDescriptor cannot be checked for overridability: ");
                    stringBuilder.append(aVar);
                    throw new IllegalArgumentException(stringBuilder.toString());
                } else if (!aVar.bsZ().equals(aVar2.bsZ())) {
                    return OverrideCompatibilityInfo.mE("Name mismatch");
                } else {
                    OverrideCompatibilityInfo e = e(aVar, aVar2);
                    return e != null ? e : null;
                }
            }
        }
        return OverrideCompatibilityInfo.mE("Member kind mismatch");
    }

    private b o(List<ao> list, List<ao> list2) {
        if (list == null) {
            $$$reportNull$$$0(37);
        }
        if (list2 == null) {
            $$$reportNull$$$0(38);
        }
        b b;
        if (list.isEmpty()) {
            b = c.b(this.fte);
            if (b == null) {
                $$$reportNull$$$0(39);
            }
            return b;
        }
        final HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            hashMap.put(((ao) list.get(i)).brm(), ((ao) list2.get(i)).brm());
        }
        b = c.b(new a() {
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                Object[] objArr = new Object[3];
                if (i != 1) {
                    objArr[0] = "a";
                } else {
                    objArr[0] = "b";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$3";
                objArr[2] = "equals";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            public boolean a(an anVar, an anVar2) {
                boolean z = false;
                if (anVar == null) {
                    AnonymousClass3.$$$reportNull$$$0(0);
                }
                if (anVar2 == null) {
                    AnonymousClass3.$$$reportNull$$$0(1);
                }
                if (OverridingUtil.this.fte.a(anVar, anVar2)) {
                    return true;
                }
                an anVar3 = (an) hashMap.get(anVar);
                an anVar4 = (an) hashMap.get(anVar2);
                if ((anVar3 != null && anVar3.equals(anVar2)) || (anVar4 != null && anVar4.equals(anVar))) {
                    z = true;
                }
                return z;
            }
        });
        if (b == null) {
            $$$reportNull$$$0(40);
        }
        return b;
    }

    private static OverrideCompatibilityInfo e(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        Object obj = 1;
        Object obj2 = aVar.bsK() == null ? 1 : null;
        if (aVar2.bsK() != null) {
            obj = null;
        }
        if (obj2 != obj) {
            return OverrideCompatibilityInfo.mE("Receiver presence mismatch");
        }
        return aVar.bsP().size() != aVar2.bsP().size() ? OverrideCompatibilityInfo.mE("Value parameter number mismatch") : null;
    }

    private static boolean a(w wVar, w wVar2, b bVar) {
        if (wVar == null) {
            $$$reportNull$$$0(41);
        }
        if (wVar2 == null) {
            $$$reportNull$$$0(42);
        }
        if (bVar == null) {
            $$$reportNull$$$0(43);
        }
        Object obj = (y.aJ(wVar) && y.aJ(wVar2)) ? 1 : null;
        if (obj != null || bVar.d(wVar, wVar2)) {
            return true;
        }
        return false;
    }

    private static boolean a(ao aoVar, ao aoVar2, b bVar) {
        if (aoVar == null) {
            $$$reportNull$$$0(44);
        }
        if (aoVar2 == null) {
            $$$reportNull$$$0(45);
        }
        if (bVar == null) {
            $$$reportNull$$$0(46);
        }
        List<w> bod = aoVar.bod();
        ArrayList arrayList = new ArrayList(aoVar2.bod());
        if (bod.size() != arrayList.size()) {
            return false;
        }
        for (w wVar : bod) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (a(wVar, (w) listIterator.next(), bVar)) {
                    listIterator.remove();
                }
            }
            return false;
        }
        return true;
    }

    private static List<w> h(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        ah bsK = aVar.bsK();
        ArrayList arrayList = new ArrayList();
        if (bsK != null) {
            arrayList.add(bsK.bpT());
        }
        for (ar bpT : aVar.bsP()) {
            arrayList.add(bpT.bpT());
        }
        return arrayList;
    }

    public static void a(f fVar, Collection<? extends CallableMemberDescriptor> collection, Collection<? extends CallableMemberDescriptor> collection2, d dVar, h hVar) {
        if (fVar == null) {
            $$$reportNull$$$0(47);
        }
        if (collection == null) {
            $$$reportNull$$$0(48);
        }
        if (collection2 == null) {
            $$$reportNull$$$0(49);
        }
        if (dVar == null) {
            $$$reportNull$$$0(50);
        }
        if (hVar == null) {
            $$$reportNull$$$0(51);
        }
        Collection linkedHashSet = new LinkedHashSet(collection);
        for (CallableMemberDescriptor a : collection2) {
            linkedHashSet.removeAll(a(a, (Collection) collection, dVar, hVar));
        }
        a(dVar, linkedHashSet, hVar);
    }

    public static boolean a(t tVar, t tVar2) {
        if (tVar == null) {
            $$$reportNull$$$0(52);
        }
        if (tVar2 == null) {
            $$$reportNull$$$0(53);
        }
        return !av.b(tVar2.brx()) && av.a((o) tVar2, (k) tVar);
    }

    private static Collection<CallableMemberDescriptor> a(CallableMemberDescriptor callableMemberDescriptor, Collection<? extends CallableMemberDescriptor> collection, d dVar, h hVar) {
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(54);
        }
        if (collection == null) {
            $$$reportNull$$$0(55);
        }
        if (dVar == null) {
            $$$reportNull$$$0(56);
        }
        if (hVar == null) {
            $$$reportNull$$$0(57);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        i bQf = i.bQf();
        for (t tVar : collection) {
            Result bMV = ftd.c(tVar, callableMemberDescriptor, dVar).bMV();
            boolean a = a((t) callableMemberDescriptor, tVar);
            int i = AnonymousClass9.ftm[bMV.ordinal()];
            if (i == 1) {
                if (a) {
                    bQf.add(tVar);
                }
                arrayList.add(tVar);
            } else if (i == 2) {
                if (a) {
                    hVar.b(tVar, callableMemberDescriptor);
                }
                arrayList.add(tVar);
            }
        }
        hVar.a(callableMemberDescriptor, bQf);
        return arrayList;
    }

    private static boolean M(Collection<CallableMemberDescriptor> collection) {
        if (collection == null) {
            $$$reportNull$$$0(58);
        }
        if (collection.size() < 2) {
            return true;
        }
        final k brj = ((CallableMemberDescriptor) collection.iterator().next()).brj();
        return u.d((Iterable) collection, (kotlin.jvm.a.b) new kotlin.jvm.a.b<CallableMemberDescriptor, Boolean>() {
            /* renamed from: C */
            public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
                return Boolean.valueOf(callableMemberDescriptor.brj() == brj);
            }
        });
    }

    private static void a(d dVar, Collection<CallableMemberDescriptor> collection, h hVar) {
        if (dVar == null) {
            $$$reportNull$$$0(59);
        }
        if (collection == null) {
            $$$reportNull$$$0(60);
        }
        if (hVar == null) {
            $$$reportNull$$$0(61);
        }
        if (M(collection)) {
            for (CallableMemberDescriptor singleton : collection) {
                a(Collections.singleton(singleton), dVar, hVar);
            }
            return;
        }
        Queue linkedList = new LinkedList(collection);
        while (!linkedList.isEmpty()) {
            a(a(j.P(linkedList), linkedList, hVar), dVar, hVar);
        }
    }

    public static boolean f(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        if (aVar == null) {
            $$$reportNull$$$0(62);
        }
        if (aVar2 == null) {
            $$$reportNull$$$0(63);
        }
        w bsN = aVar.bsN();
        w bsN2 = aVar2.bsN();
        boolean z = false;
        if (!a((o) aVar, (o) aVar2)) {
            return false;
        }
        if (aVar instanceof s) {
            return a(aVar, bsN, aVar2, bsN2);
        }
        if (aVar instanceof ae) {
            ae aeVar = (ae) aVar;
            ae aeVar2 = (ae) aVar2;
            if (!a(aeVar.btH(), aeVar2.btH())) {
                return false;
            }
            if (aeVar.btW() && aeVar2.btW()) {
                return ftd.o(aVar.bsM(), aVar2.bsM()).d(bsN, bsN2);
            }
            if ((aeVar.btW() || !aeVar2.btW()) && a(aVar, bsN, aVar2, bsN2)) {
                z = true;
            }
            return z;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected callable: ");
        stringBuilder.append(aVar.getClass());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static boolean a(o oVar, o oVar2) {
        if (oVar == null) {
            $$$reportNull$$$0(64);
        }
        if (oVar2 == null) {
            $$$reportNull$$$0(65);
        }
        Integer c = av.c(oVar.brx(), oVar2.brx());
        return c == null || c.intValue() >= 0;
    }

    private static boolean a(ad adVar, ad adVar2) {
        return (adVar == null || adVar2 == null) ? true : a((o) adVar, (o) adVar2);
    }

    private static boolean a(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, Collection<kotlin.reflect.jvm.internal.impl.descriptors.a> collection) {
        if (aVar == null) {
            $$$reportNull$$$0(66);
        }
        if (collection == null) {
            $$$reportNull$$$0(67);
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.a f : collection) {
            if (!f(aVar, f)) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, w wVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, w wVar2) {
        if (aVar == null) {
            $$$reportNull$$$0(68);
        }
        if (wVar == null) {
            $$$reportNull$$$0(69);
        }
        if (aVar2 == null) {
            $$$reportNull$$$0(70);
        }
        if (wVar2 == null) {
            $$$reportNull$$$0(71);
        }
        return ftd.o(aVar.bsM(), aVar2.bsM()).c(wVar, wVar2);
    }

    public static <H> H a(Collection<H> collection, kotlin.jvm.a.b<H, kotlin.reflect.jvm.internal.impl.descriptors.a> bVar) {
        if (collection == null) {
            $$$reportNull$$$0(72);
        }
        if (bVar == null) {
            $$$reportNull$$$0(73);
        }
        Object J;
        if (collection.size() == 1) {
            J = u.J(collection);
            if (J == null) {
                $$$reportNull$$$0(74);
            }
            return J;
        }
        ArrayList arrayList = new ArrayList(2);
        Collection c = u.c((Iterable) collection, (kotlin.jvm.a.b) bVar);
        H J2 = u.J(collection);
        kotlin.reflect.jvm.internal.impl.descriptors.a aVar = (kotlin.reflect.jvm.internal.impl.descriptors.a) bVar.invoke(J2);
        for (H next : collection) {
            kotlin.reflect.jvm.internal.impl.descriptors.a aVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) bVar.invoke(next);
            if (a(aVar2, c)) {
                arrayList.add(next);
            }
            if (f(aVar2, aVar) && !f(aVar, aVar2)) {
                J2 = next;
            }
        }
        if (arrayList.isEmpty()) {
            if (J2 == null) {
                $$$reportNull$$$0(75);
            }
            return J2;
        } else if (arrayList.size() == 1) {
            J = u.J(arrayList);
            if (J == null) {
                $$$reportNull$$$0(76);
            }
            return J;
        } else {
            H h = null;
            for (H next2 : arrayList) {
                if (!kotlin.reflect.jvm.internal.impl.types.t.aE(((kotlin.reflect.jvm.internal.impl.descriptors.a) bVar.invoke(next2)).bsN())) {
                    h = next2;
                    break;
                }
            }
            if (h != null) {
                if (h == null) {
                    $$$reportNull$$$0(77);
                }
                return h;
            }
            J = u.J(arrayList);
            if (J == null) {
                $$$reportNull$$$0(78);
            }
            return J;
        }
    }

    private static void a(Collection<CallableMemberDescriptor> collection, d dVar, h hVar) {
        Collection collection2;
        if (collection2 == null) {
            $$$reportNull$$$0(79);
        }
        if (dVar == null) {
            $$$reportNull$$$0(80);
        }
        if (hVar == null) {
            $$$reportNull$$$0(81);
        }
        Collection a = a(dVar, (Collection) collection2);
        boolean isEmpty = a.isEmpty();
        if (!isEmpty) {
            collection2 = a;
        }
        CallableMemberDescriptor a2 = ((CallableMemberDescriptor) a(collection2, new kotlin.jvm.a.b<CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a>() {
            /* renamed from: D */
            public CallableMemberDescriptor invoke(CallableMemberDescriptor callableMemberDescriptor) {
                return callableMemberDescriptor;
            }
        })).a(dVar, a(collection2, dVar), isEmpty ? av.fdh : av.fdg, Kind.FAKE_OVERRIDE, false);
        hVar.a(a2, collection2);
        hVar.g(a2);
    }

    private static Modality a(Collection<CallableMemberDescriptor> collection, d dVar) {
        Modality modality;
        if (collection == null) {
            $$$reportNull$$$0(82);
        }
        if (dVar == null) {
            $$$reportNull$$$0(83);
        }
        boolean z = false;
        Object obj = null;
        Object obj2 = null;
        for (CallableMemberDescriptor callableMemberDescriptor : collection) {
            int i = AnonymousClass9.ftn[callableMemberDescriptor.bru().ordinal()];
            if (i == 1) {
                modality = Modality.FINAL;
                if (modality == null) {
                    $$$reportNull$$$0(84);
                }
                return modality;
            } else if (i == 2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Member cannot have SEALED modality: ");
                stringBuilder.append(callableMemberDescriptor);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (i == 3) {
                obj = 1;
            } else if (i == 4) {
                obj2 = 1;
            }
        }
        if (!(!dVar.brB() || dVar.bru() == Modality.ABSTRACT || dVar.bru() == Modality.SEALED)) {
            z = true;
        }
        if (obj != null && obj2 == null) {
            modality = Modality.OPEN;
            if (modality == null) {
                $$$reportNull$$$0(85);
            }
            return modality;
        } else if (obj != null || obj2 == null) {
            HashSet hashSet = new HashSet();
            for (CallableMemberDescriptor A : collection) {
                hashSet.addAll(A(A));
            }
            modality = a(q(hashSet), z, dVar.bru());
            if (modality == null) {
                $$$reportNull$$$0(87);
            }
            return modality;
        } else {
            modality = z ? dVar.bru() : Modality.ABSTRACT;
            if (modality == null) {
                $$$reportNull$$$0(86);
            }
            return modality;
        }
    }

    private static Modality a(Collection<CallableMemberDescriptor> collection, boolean z, Modality modality) {
        if (collection == null) {
            $$$reportNull$$$0(88);
        }
        if (modality == null) {
            $$$reportNull$$$0(89);
        }
        Enum enumR = Modality.ABSTRACT;
        for (CallableMemberDescriptor callableMemberDescriptor : collection) {
            Enum bru = (z && callableMemberDescriptor.bru() == Modality.ABSTRACT) ? modality : callableMemberDescriptor.bru();
            if (bru.compareTo(enumR) < 0) {
                enumR = bru;
            }
        }
        if (enumR == null) {
            $$$reportNull$$$0(90);
        }
        return enumR;
    }

    private static Collection<CallableMemberDescriptor> a(final d dVar, Collection<CallableMemberDescriptor> collection) {
        if (dVar == null) {
            $$$reportNull$$$0(91);
        }
        if (collection == null) {
            $$$reportNull$$$0(92);
        }
        List b = u.b((Iterable) collection, (kotlin.jvm.a.b) new kotlin.jvm.a.b<CallableMemberDescriptor, Boolean>() {
            /* renamed from: C */
            public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
                boolean z = !av.b(callableMemberDescriptor.brx()) && av.a((o) callableMemberDescriptor, dVar);
                return Boolean.valueOf(z);
            }
        });
        if (b == null) {
            $$$reportNull$$$0(93);
        }
        return b;
    }

    public static <H> Collection<H> a(H h, Collection<H> collection, kotlin.jvm.a.b<H, kotlin.reflect.jvm.internal.impl.descriptors.a> bVar, kotlin.jvm.a.b<H, l> bVar2) {
        if (h == null) {
            $$$reportNull$$$0(94);
        }
        if (collection == null) {
            $$$reportNull$$$0(95);
        }
        if (bVar == null) {
            $$$reportNull$$$0(96);
        }
        if (bVar2 == null) {
            $$$reportNull$$$0(97);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h);
        kotlin.reflect.jvm.internal.impl.descriptors.a aVar = (kotlin.reflect.jvm.internal.impl.descriptors.a) bVar.invoke(h);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            kotlin.reflect.jvm.internal.impl.descriptors.a aVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) bVar.invoke(next);
            if (h == next) {
                it.remove();
            } else {
                Result g = g(aVar, aVar2);
                if (g == Result.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (g == Result.CONFLICT) {
                    bVar2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static Result g(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        Result bMV = ftd.c(aVar2, aVar, null).bMV();
        Result bMV2 = ftd.c(aVar, aVar2, null).bMV();
        if (bMV == Result.OVERRIDABLE && bMV2 == Result.OVERRIDABLE) {
            return Result.OVERRIDABLE;
        }
        return (bMV == Result.CONFLICT || bMV2 == Result.CONFLICT) ? Result.CONFLICT : Result.INCOMPATIBLE;
    }

    private static Collection<CallableMemberDescriptor> a(final CallableMemberDescriptor callableMemberDescriptor, Queue<CallableMemberDescriptor> queue, final h hVar) {
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(99);
        }
        if (queue == null) {
            $$$reportNull$$$0(100);
        }
        if (hVar == null) {
            $$$reportNull$$$0(101);
        }
        Collection a = a((Object) callableMemberDescriptor, (Collection) queue, new kotlin.jvm.a.b<CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a>() {
            /* renamed from: E */
            public kotlin.reflect.jvm.internal.impl.descriptors.a invoke(CallableMemberDescriptor callableMemberDescriptor) {
                return callableMemberDescriptor;
            }
        }, new kotlin.jvm.a.b<CallableMemberDescriptor, l>() {
            /* renamed from: w */
            public l invoke(CallableMemberDescriptor callableMemberDescriptor) {
                hVar.c(callableMemberDescriptor, callableMemberDescriptor);
                return l.eVB;
            }
        });
        if (a == null) {
            $$$reportNull$$$0(102);
        }
        return a;
    }

    public static void a(CallableMemberDescriptor callableMemberDescriptor, kotlin.jvm.a.b<CallableMemberDescriptor, l> bVar) {
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(103);
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : callableMemberDescriptor.bsR()) {
            if (callableMemberDescriptor2.brx() == av.fdg) {
                a(callableMemberDescriptor2, (kotlin.jvm.a.b) bVar);
            }
        }
        if (callableMemberDescriptor.brx() == av.fdg) {
            aw awVar;
            aw B = B(callableMemberDescriptor);
            if (B == null) {
                if (bVar != null) {
                    bVar.invoke(callableMemberDescriptor);
                }
                awVar = av.fde;
            } else {
                awVar = B;
            }
            if (callableMemberDescriptor instanceof z) {
                ((z) callableMemberDescriptor).d(awVar);
                for (CallableMemberDescriptor callableMemberDescriptor22 : ((ae) callableMemberDescriptor).btI()) {
                    a(callableMemberDescriptor22, B == null ? null : bVar);
                }
            } else if (callableMemberDescriptor instanceof p) {
                ((p) callableMemberDescriptor).d(awVar);
            } else {
                kotlin.reflect.jvm.internal.impl.descriptors.impl.y yVar = (kotlin.reflect.jvm.internal.impl.descriptors.impl.y) callableMemberDescriptor;
                yVar.d(awVar);
                if (awVar != yVar.btF().brx()) {
                    yVar.gG(false);
                }
            }
        }
    }

    private static aw B(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(104);
        }
        Collection<CallableMemberDescriptor> bsR = callableMemberDescriptor.bsR();
        aw N = N(bsR);
        if (N == null) {
            return null;
        }
        if (callableMemberDescriptor.bsT() != Kind.FAKE_OVERRIDE) {
            return N.bud();
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : bsR) {
            if (callableMemberDescriptor2.bru() != Modality.ABSTRACT && !callableMemberDescriptor2.brx().equals(N)) {
                return null;
            }
        }
        return N;
    }

    public static aw N(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            $$$reportNull$$$0(105);
        }
        if (collection.isEmpty()) {
            return av.fdl;
        }
        aw awVar;
        loop0:
        while (true) {
            awVar = null;
            for (CallableMemberDescriptor brx : collection) {
                aw brx2 = brx.brx();
                if (awVar != null) {
                    Integer c = av.c(brx2, awVar);
                    if (c != null) {
                        if (c.intValue() <= 0) {
                        }
                    }
                }
                awVar = brx2;
            }
            break loop0;
        }
        if (awVar == null) {
            return null;
        }
        for (CallableMemberDescriptor brx3 : collection) {
            Integer c2 = av.c(awVar, brx3.brx());
            if (c2 != null) {
                if (c2.intValue() < 0) {
                }
            }
            return null;
        }
        return awVar;
    }
}
