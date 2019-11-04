package com.iqoption.core.data.repository;

import com.iqoption.core.manager.ac;
import com.iqoption.core.microservices.kyc.response.KycVerificationContext;
import com.iqoption.core.microservices.kyc.response.VerificationType;
import com.iqoption.core.util.z;
import io.reactivex.p;
import io.reactivex.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001$B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u000f\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u0002J6\u0010\u0010\u001a0\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0004j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b`\u0007H\u0002J$\u0010\u0011\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\u0004\u0012\u00020\u000e0\u0004j\b\u0012\u0004\u0012\u00020\u000e`\u0007H\u0002J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J\b\u0010\u0017\u001a\u0004\u0018\u00010\tJ\b\u0010\u0018\u001a\u00020\u0019H\u0007J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u000b0\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bJ\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u001bJ\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00050\u001bJ\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001bR.\u0010\u0003\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R@\u0010\n\u001a4\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\u0004j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u0001`\u0007X\u000e¢\u0006\u0002\n\u0000R.\u0010\r\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, bng = {"Lcom/iqoption/core/data/repository/KycRepository;", "", "()V", "levelStream", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/core/microservices/kyc/response/VerificationLevelData;", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "profileFields", "Lcom/iqoption/core/microservices/kyc/response/ProfileFieldsResponse;", "restrictionsStream", "", "Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestriction;", "verificationDataStream", "Lcom/iqoption/core/microservices/kyc/response/VerificationInitData;", "createLevelStream", "createRestrictionsStream", "createVerificationDataStream", "getKycDocuments", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/kyc/response/document/KycDocumentsResult;", "type", "Lcom/iqoption/core/microservices/kyc/response/VerificationType;", "getProfileFields", "initProfileFields", "Lio/reactivex/Completable;", "observeKycCustomerSteps", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "newVerificationContext", "Lcom/iqoption/core/microservices/kyc/response/KycVerificationContext;", "observeLevel", "observeRestrictions", "observeTradeRestriction", "Lcom/iqoption/core/microservices/kyc/response/restriction/KycRequirementAction;", "observeVerificationInitData", "KycRestrictionMutator", "core_release"})
/* compiled from: KycRepository.kt */
public final class d {
    private static volatile com.iqoption.core.rx.a.a<z<List<com.iqoption.core.microservices.kyc.response.restriction.b>>, List<com.iqoption.core.microservices.kyc.response.restriction.b>> bdC;
    private static volatile com.iqoption.core.rx.a.a<z<com.iqoption.core.microservices.kyc.response.j>, com.iqoption.core.microservices.kyc.response.j> bdD;
    private static volatile com.iqoption.core.microservices.kyc.response.b bdE;
    public static final d bdF = new d();

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, bng = {"Lcom/iqoption/core/data/repository/KycRepository$KycRestrictionMutator;", "", "restrictions", "", "Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestriction;", "change", "Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestrictionDataChanged;", "(Ljava/util/List;Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestrictionDataChanged;)V", "getChange", "()Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestrictionDataChanged;", "getRestrictions", "()Ljava/util/List;", "applyChange", "newChange", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"})
    /* compiled from: KycRepository.kt */
    private static final class a {
        private final List<com.iqoption.core.microservices.kyc.response.restriction.b> bdG;
        private final com.iqoption.core.microservices.kyc.response.restriction.c bdH;

        public a() {
            this(null, null, 3, null);
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bdH, r3.bdH) != false) goto L_0x001f;
     */
        public boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof com.iqoption.core.data.repository.d.a;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (com.iqoption.core.data.repository.d.a) r3;
            r0 = r2.bdG;
            r1 = r3.bdG;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.bdH;
            r3 = r3.bdH;
            r3 = kotlin.jvm.internal.i.y(r0, r3);
            if (r3 == 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r3 = 0;
            return r3;
        L_0x001f:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.data.repository.d$a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            List list = this.bdG;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            com.iqoption.core.microservices.kyc.response.restriction.c cVar = this.bdH;
            if (cVar != null) {
                i = cVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("KycRestrictionMutator(restrictions=");
            stringBuilder.append(this.bdG);
            stringBuilder.append(", change=");
            stringBuilder.append(this.bdH);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public a(List<com.iqoption.core.microservices.kyc.response.restriction.b> list, com.iqoption.core.microservices.kyc.response.restriction.c cVar) {
            this.bdG = list;
            this.bdH = cVar;
        }

        public /* synthetic */ a(List list, com.iqoption.core.microservices.kyc.response.restriction.c cVar, int i, f fVar) {
            if ((i & 1) != 0) {
                list = (List) null;
            }
            if ((i & 2) != 0) {
                cVar = (com.iqoption.core.microservices.kyc.response.restriction.c) null;
            }
            this(list, cVar);
        }

        public final List<com.iqoption.core.microservices.kyc.response.restriction.b> WZ() {
            return this.bdG;
        }

        public final com.iqoption.core.microservices.kyc.response.restriction.c Xa() {
            return this.bdH;
        }

        public final a a(com.iqoption.core.microservices.kyc.response.restriction.c cVar) {
            kotlin.jvm.internal.i.f(cVar, "newChange");
            List list = this.bdG;
            if (list == null) {
                list = m.emptyList();
            }
            int i = e.aob[cVar.afE().ordinal()];
            Collection arrayList;
            Object a;
            if (i == 1) {
                list = u.i((Collection) list, (Object) new com.iqoption.core.microservices.kyc.response.restriction.b(cVar.afC(), cVar.afD()));
            } else if (i == 2) {
                arrayList = new ArrayList();
                for (Object a2 : list) {
                    if ((((com.iqoption.core.microservices.kyc.response.restriction.b) a2).afC() != cVar.afC() ? 1 : null) != null) {
                        arrayList.add(a2);
                    }
                }
                list = (List) arrayList;
            } else if (i == 3) {
                Iterable<Object> iterable = list;
                arrayList = new ArrayList(n.e(iterable, 10));
                for (Object a22 : iterable) {
                    if (a22.afC() == cVar.afC()) {
                        a22 = com.iqoption.core.microservices.kyc.response.restriction.b.a(a22, null, cVar.afD(), 1, null);
                    }
                    arrayList.add(a22);
                }
                list = (List) arrayList;
            }
            return new a(list, null, 2, null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/data/repository/KycRepository$KycRestrictionMutator;", "it", "Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestrictionsData;", "apply"})
    /* compiled from: KycRepository.kt */
    static final class b<T, R> implements io.reactivex.b.g<T, R> {
        public static final b bdI = new b();

        b() {
        }

        /* renamed from: a */
        public final a apply(com.iqoption.core.microservices.kyc.response.restriction.d dVar) {
            kotlin.jvm.internal.i.f(dVar, "it");
            return new a(dVar.WZ(), null, 2, null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/data/repository/KycRepository$KycRestrictionMutator;", "old", "update", "apply"})
    /* compiled from: KycRepository.kt */
    static final class c<T1, T2, R> implements io.reactivex.b.c<a, a, a> {
        public static final c bdJ = new c();

        c() {
        }

        /* renamed from: a */
        public final a apply(a aVar, a aVar2) {
            kotlin.jvm.internal.i.f(aVar, "old");
            kotlin.jvm.internal.i.f(aVar2, "update");
            com.iqoption.core.microservices.kyc.response.restriction.c Xa = aVar2.Xa();
            if (Xa == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            return aVar.a(Xa);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestriction;", "it", "Lcom/iqoption/core/data/repository/KycRepository$KycRestrictionMutator;", "apply"})
    /* compiled from: KycRepository.kt */
    static final class d<T, R> implements io.reactivex.b.g<T, R> {
        public static final d bdK = new d();

        d() {
        }

        /* renamed from: a */
        public final List<com.iqoption.core.microservices.kyc.response.restriction.b> apply(a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            List<com.iqoption.core.microservices.kyc.response.restriction.b> WZ = aVar.WZ();
            return WZ != null ? WZ : m.emptyList();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/data/repository/KycRepository$KycRestrictionMutator;", "it", "Lcom/iqoption/core/microservices/kyc/response/restriction/KycRestrictionDataChanged;", "apply"})
    /* compiled from: KycRepository.kt */
    static final class e<T, R> implements io.reactivex.b.g<T, R> {
        public static final e bdL = new e();

        e() {
        }

        /* renamed from: b */
        public final a apply(com.iqoption.core.microservices.kyc.response.restriction.c cVar) {
            kotlin.jvm.internal.i.f(cVar, "it");
            return new a(null, cVar, 1, null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/kyc/response/VerificationInitData;", "old", "update", "apply"})
    /* compiled from: KycRepository.kt */
    static final class f<T1, T2, R> implements io.reactivex.b.c<com.iqoption.core.microservices.kyc.response.j, com.iqoption.core.microservices.kyc.response.j, com.iqoption.core.microservices.kyc.response.j> {
        public static final f bdM = new f();

        f() {
        }

        /* renamed from: a */
        public final com.iqoption.core.microservices.kyc.response.j apply(com.iqoption.core.microservices.kyc.response.j jVar, com.iqoption.core.microservices.kyc.response.j jVar2) {
            kotlin.jvm.internal.i.f(jVar, "old");
            kotlin.jvm.internal.i.f(jVar2, "update");
            return com.iqoption.core.microservices.kyc.response.j.a(jVar, jVar2.aeH(), null, null, null, 14, null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/kyc/response/VerificationInitData;", "it", "Lcom/iqoption/core/microservices/kyc/response/VerificationLevelData;", "apply"})
    /* compiled from: KycRepository.kt */
    static final class g<T, R> implements io.reactivex.b.g<T, R> {
        public static final g bdN = new g();

        g() {
        }

        /* renamed from: a */
        public final com.iqoption.core.microservices.kyc.response.j apply(com.iqoption.core.microservices.kyc.response.k kVar) {
            kotlin.jvm.internal.i.f(kVar, "it");
            return new com.iqoption.core.microservices.kyc.response.j(kVar, null, null, null, 14, null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/kyc/response/document/KycDocumentsResult;", "source", "apply"})
    /* compiled from: KycRepository.kt */
    static final class h<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ VerificationType bdO;

        h(VerificationType verificationType) {
            this.bdO = verificationType;
        }

        /* renamed from: a */
        public final com.iqoption.core.microservices.kyc.response.document.e apply(com.iqoption.core.microservices.kyc.response.document.e eVar) {
            kotlin.jvm.internal.i.f(eVar, "source");
            if (this.bdO == null) {
                return eVar;
            }
            Collection arrayList = new ArrayList();
            for (Object next : eVar.aeT()) {
                if ((((com.iqoption.core.microservices.kyc.response.document.b) next).aeO() == this.bdO ? 1 : null) != null) {
                    arrayList.add(next);
                }
            }
            return new com.iqoption.core.microservices.kyc.response.document.e((List) arrayList);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/kyc/response/ProfileFieldsResponse;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: KycRepository.kt */
    static final class i<T> implements io.reactivex.b.f<com.iqoption.core.microservices.kyc.response.b> {
        public static final i bdP = new i();

        i() {
        }

        /* renamed from: a */
        public final void accept(com.iqoption.core.microservices.kyc.response.b bVar) {
            d.bdE = bVar;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: KycRepository.kt */
    static final class j<T> implements io.reactivex.b.f<Throwable> {
        public static final j bdQ = new j();

        j() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "it", "", "apply"})
    /* compiled from: KycRepository.kt */
    static final class k<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
        public static final k bdR = new k();

        k() {
        }

        /* renamed from: fE */
        public final p<List<com.iqoption.core.microservices.kyc.response.step.c>> apply(String str) {
            kotlin.jvm.internal.i.f(str, "it");
            return com.iqoption.core.microservices.kyc.c.bur.aeB();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/kyc/response/step/KycCustomerStep;", "steps", "apply"})
    /* compiled from: KycRepository.kt */
    static final class l<T, R> implements io.reactivex.b.g<T, R> {
        public static final l bdS = new l();

        l() {
        }

        public final List<com.iqoption.core.microservices.kyc.response.step.c> apply(List<com.iqoption.core.microservices.kyc.response.step.c> list) {
            kotlin.jvm.internal.i.f(list, "steps");
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (com.iqoption.core.microservices.kyc.response.step.d.afK().contains(((com.iqoption.core.microservices.kyc.response.step.c) next).afH())) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    private d() {
    }

    public final io.reactivex.e<com.iqoption.core.microservices.kyc.response.j> WT() {
        if (bdD == null) {
            synchronized (d.class) {
                if (bdD == null) {
                    bdD = bdF.WU();
                }
                kotlin.l lVar = kotlin.l.eVB;
            }
        }
        com.iqoption.core.rx.a.a aVar = bdD;
        if (aVar != null) {
            io.reactivex.e<com.iqoption.core.microservices.kyc.response.j> ako = aVar.ako();
            if (ako != null) {
                return ako;
            }
        }
        io.reactivex.e bkQ = io.reactivex.e.bkQ();
        kotlin.jvm.internal.i.e(bkQ, "Flowable.empty()");
        return bkQ;
    }

    private final com.iqoption.core.rx.a.a<z<com.iqoption.core.microservices.kyc.response.j>, com.iqoption.core.microservices.kyc.response.j> WU() {
        io.reactivex.e bkO = com.iqoption.core.microservices.kyc.c.bur.aez().bkO();
        io.reactivex.e g = com.iqoption.core.microservices.kyc.c.bur.aeA().g(g.bdN);
        kotlin.jvm.internal.i.e(g, "KycRequests.getVerificat…erificationInitData(it) }");
        io.reactivex.e a = bkO.c((org.a.b) g).a((io.reactivex.b.c) f.bdM);
        kotlin.jvm.internal.i.e(a, "initial\n                …elData)\n                }");
        return ac.a(ac.bkp, "VerificationData", a, 0, null, 12, null);
    }

    public static final p<com.iqoption.core.microservices.kyc.response.document.e> a(VerificationType verificationType) {
        p t = com.iqoption.core.microservices.kyc.a.aet().t(new h(verificationType));
        kotlin.jvm.internal.i.e(t, "KycDocumentRequests.getK…e\n            }\n        }");
        return t;
    }

    public final io.reactivex.e<List<com.iqoption.core.microservices.kyc.response.step.c>> a(KycVerificationContext kycVerificationContext) {
        io.reactivex.a b;
        if (kycVerificationContext != null) {
            b = com.iqoption.core.microservices.kyc.c.bur.b(kycVerificationContext);
        } else {
            b = io.reactivex.a.bkL();
            kotlin.jvm.internal.i.e(b, "Completable.complete()");
        }
        io.reactivex.e g = b.cC("").q(k.bdR).bkO().c((org.a.b) com.iqoption.core.microservices.kyc.c.bur.aeC()).g(l.bdS);
        kotlin.jvm.internal.i.e(g, "updateContextCompletable…contains(it.stepType) } }");
        return g;
    }

    public static final io.reactivex.a WV() {
        io.reactivex.a bkL;
        if (bdE != null) {
            bkL = io.reactivex.a.bkL();
            kotlin.jvm.internal.i.e(bkL, "Completable.complete()");
            return bkL;
        }
        bkL = com.iqoption.core.microservices.kyc.c.bur.aeD().h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).w(new com.iqoption.core.rx.backoff.a(3, null, 0, null, null, null, 62, null)).h((io.reactivex.b.f) i.bdP).blf().a((io.reactivex.b.f) j.bdQ).bkM();
        kotlin.jvm.internal.i.e(bkL, "KycRequests.getProfileFi…       .onErrorComplete()");
        return bkL;
    }

    public final com.iqoption.core.microservices.kyc.response.b WW() {
        return bdE;
    }

    public final io.reactivex.e<List<com.iqoption.core.microservices.kyc.response.restriction.b>> WX() {
        if (bdC == null) {
            synchronized (d.class) {
                if (bdC == null) {
                    bdC = bdF.WY();
                }
                kotlin.l lVar = kotlin.l.eVB;
            }
        }
        com.iqoption.core.rx.a.a aVar = bdC;
        if (aVar != null) {
            io.reactivex.e<List<com.iqoption.core.microservices.kyc.response.restriction.b>> ako = aVar.ako();
            if (ako != null) {
                return ako;
            }
        }
        io.reactivex.e bkQ = io.reactivex.e.bkQ();
        kotlin.jvm.internal.i.e(bkQ, "Flowable.empty()");
        return bkQ;
    }

    private final com.iqoption.core.rx.a.a<z<List<com.iqoption.core.microservices.kyc.response.restriction.b>>, List<com.iqoption.core.microservices.kyc.response.restriction.b>> WY() {
        io.reactivex.e g = com.iqoption.core.microservices.kyc.c.bur.aeE().bkO().g(b.bdI);
        kotlin.jvm.internal.i.e(g, "KycRequests.getRestricti…ions = it.restrictions) }");
        io.reactivex.e g2 = com.iqoption.core.microservices.kyc.c.bur.aeF().g(e.bdL);
        kotlin.jvm.internal.i.e(g2, "KycRequests.getRestricti…ionMutator(change = it) }");
        io.reactivex.e g3 = g.c((org.a.b) g2).a((io.reactivex.b.c) c.bdJ).g(d.bdK);
        kotlin.jvm.internal.i.e(g3, "initial.concatWith(updat…rictions ?: emptyList() }");
        return ac.bkp.a("KYC Restrictions", g3, 10, TimeUnit.MINUTES);
    }
}
