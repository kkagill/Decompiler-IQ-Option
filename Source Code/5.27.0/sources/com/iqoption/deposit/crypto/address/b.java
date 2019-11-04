package com.iqoption.deposit.crypto.address;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.common.base.Optional;
import com.iqoption.core.microservices.billing.response.crypto.CryptoDepositStatus;
import com.iqoption.core.util.z;
import io.reactivex.b.l;
import io.reactivex.p;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.t;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.n;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 =2\u00020\u0001:\u0002=>B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u0006H\u0002J0\u00101\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0012020\u001d0\u00112\u0006\u0010\u0007\u001a\u00020\u00062\b\u00104\u001a\u0004\u0018\u00010\u0012J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002J\b\u00109\u001a\u000206H\u0002J\u0016\u0010:\u001a\u0002062\u0006\u0010;\u001a\u00020\u00122\u0006\u0010<\u001a\u00020\u0016R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068B@BX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0019X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u0019X\u0004¢\u0006\u0002\n\u0000R(\u0010\u001b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u001e*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001d0\u001d0\u001cX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0014R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u0019X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010)0)0\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010,\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b-\u0010!¨\u0006?"}, bng = {"Lcom/iqoption/deposit/crypto/address/DepositCryptoRequisitesViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableAndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "<set-?>", "", "billingId", "getBillingId", "()J", "setBillingId", "(J)V", "billingId$delegate", "Lkotlin/properties/ReadWriteProperty;", "depositSelectionViewModel", "Lcom/iqoption/deposit/DepositSelectionViewModel;", "expireTime", "Landroidx/lifecycle/LiveData;", "", "getExpireTime", "()Landroidx/lifecycle/LiveData;", "expireTimeColor", "", "getExpireTimeColor", "expireTimeColorLiveData", "Landroidx/lifecycle/MutableLiveData;", "expireTimeLiveData", "expireTimeProcessor", "Lio/reactivex/processors/FlowableProcessor;", "Lcom/google/common/base/Optional;", "kotlin.jvm.PlatformType", "normalColor", "getNormalColor", "()I", "normalColor$delegate", "Lkotlin/Lazy;", "qrCodeBitmap", "Landroid/graphics/Bitmap;", "getQrCodeBitmap", "qrCodeBitmapLiveData", "requestsProcessor", "Lcom/iqoption/deposit/crypto/address/DepositCryptoRequisitesViewModel$QRCodeRequest;", "timeWasPositive", "", "warningColor", "getWarningColor", "warningColor$delegate", "formatExpiryTime", "millisSource", "getRequisites", "Lkotlin/Pair;", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDepositRequisites;", "existedFiatMask", "handleUpdateDepositStatus", "", "cryptoDeposit", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "refreshCryptoDepositManually", "requestQrCode", "data", "size", "Companion", "QRCodeRequest", "deposit_release"})
/* compiled from: DepositCryptoRequisitesViewModel.kt */
public final class b extends com.iqoption.core.ui.f.c {
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(b.class), "billingId", "getBillingId()J")), k.a(new PropertyReference1Impl(k.G(b.class), "normalColor", "getNormalColor()I")), k.a(new PropertyReference1Impl(k.G(b.class), "warningColor", "getWarningColor()I"))};
    private static final long czs = TimeUnit.MINUTES.toMillis(3);
    public static final a czt = new a();
    private com.iqoption.deposit.k cxD;
    private final kotlin.f.d czg = kotlin.f.a.eWg.bnQ();
    private final io.reactivex.processors.a<b> czh;
    private final MutableLiveData<Bitmap> czi;
    private final LiveData<Bitmap> czj;
    private final io.reactivex.processors.a<Optional<Long>> czk;
    private final MutableLiveData<String> czl;
    private final LiveData<String> czm;
    private final MutableLiveData<Integer> czn;
    private final LiveData<Integer> czo;
    private final kotlin.d czp;
    private final kotlin.d czq;
    private boolean czr;

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/deposit/crypto/address/DepositCryptoRequisitesViewModel$Companion;", "", "()V", "EXPIRATION_FORMAT", "", "WARNING_THRESHOLD_MILLIS", "", "get", "Lcom/iqoption/deposit/crypto/address/DepositCryptoRequisitesViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "billingId", "deposit_release"})
    /* compiled from: DepositCryptoRequisitesViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b a(Fragment fragment, long j) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(b.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…tesViewModel::class.java)");
            b bVar = (b) viewModel;
            bVar.cxD = com.iqoption.deposit.k.cxn.C(fragment);
            bVar.br(j);
            return bVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, bng = {"Lcom/iqoption/deposit/crypto/address/DepositCryptoRequisitesViewModel$QRCodeRequest;", "", "data", "", "size", "", "(Ljava/lang/String;I)V", "getData", "()Ljava/lang/String;", "getSize", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "deposit_release"})
    /* compiled from: DepositCryptoRequisitesViewModel.kt */
    private static final class b {
        private final String czC;
        private final int size;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (kotlin.jvm.internal.i.y(this.czC, bVar.czC)) {
                        if ((this.size == bVar.size ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.czC;
            return ((str != null ? str.hashCode() : 0) * 31) + this.size;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("QRCodeRequest(data=");
            stringBuilder.append(this.czC);
            stringBuilder.append(", size=");
            stringBuilder.append(this.size);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public b(String str, int i) {
            kotlin.jvm.internal.i.f(str, "data");
            this.czC = str;
            this.size = i;
        }

        public final String getData() {
            return this.czC;
        }

        public final int getSize() {
            return this.size;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDepositStatusUpdate;", "test"})
    /* compiled from: DepositCryptoRequisitesViewModel.kt */
    /* renamed from: com.iqoption.deposit.crypto.address.b$11 */
    static final class AnonymousClass11<T> implements l<com.iqoption.core.microservices.billing.response.crypto.d> {
        final /* synthetic */ b czv;

        AnonymousClass11(b bVar) {
            this.czv = bVar;
        }

        /* renamed from: c */
        public final boolean test(com.iqoption.core.microservices.billing.response.crypto.d dVar) {
            kotlin.jvm.internal.i.f(dVar, "it");
            return dVar.ZF() == this.czv.ZF();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "update", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDepositStatusUpdate;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: DepositCryptoRequisitesViewModel.kt */
    /* renamed from: com.iqoption.deposit.crypto.address.b$2 */
    static final class AnonymousClass2<T> implements io.reactivex.b.f<com.iqoption.core.microservices.billing.response.crypto.d> {
        final /* synthetic */ b czv;

        AnonymousClass2(b bVar) {
            this.czv = bVar;
        }

        /* renamed from: b */
        public final void accept(com.iqoption.core.microservices.billing.response.crypto.d dVar) {
            this.czv.d(dVar.aaf());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;", "accept"})
    /* compiled from: DepositCryptoRequisitesViewModel.kt */
    /* renamed from: com.iqoption.deposit.crypto.address.b$4 */
    static final class AnonymousClass4<T> implements io.reactivex.b.f<Bitmap> {
        final /* synthetic */ b czv;

        AnonymousClass4(b bVar) {
            this.czv = bVar;
        }

        /* renamed from: c */
        public final void accept(Bitmap bitmap) {
            this.czv.czi.postValue(bitmap);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"})
    /* compiled from: DepositCryptoRequisitesViewModel.kt */
    /* renamed from: com.iqoption.deposit.crypto.address.b$8 */
    static final class AnonymousClass8<T> implements io.reactivex.b.f<Long> {
        final /* synthetic */ b czv;

        AnonymousClass8(b bVar) {
            this.czv = bVar;
        }

        /* renamed from: o */
        public final void accept(Long l) {
            if (l == null || l.longValue() != 0) {
                this.czv.czr = true;
            } else if (this.czv.czr) {
                this.czv.aqI();
            } else {
                this.czv.czn.postValue(Integer.valueOf(this.czv.aqH()));
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "leftMillis", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"})
    /* compiled from: DepositCryptoRequisitesViewModel.kt */
    /* renamed from: com.iqoption.deposit.crypto.address.b$9 */
    static final class AnonymousClass9<T> implements io.reactivex.b.f<Long> {
        final /* synthetic */ b czv;

        AnonymousClass9(b bVar) {
            this.czv = bVar;
        }

        /* renamed from: o */
        public final void accept(Long l) {
            int g;
            MutableLiveData h = this.czv.czl;
            b bVar = this.czv;
            kotlin.jvm.internal.i.e(l, "leftMillis");
            h.postValue(bVar.bs(l.longValue()));
            if (l.longValue() <= b.czs) {
                g = this.czv.aqH();
            } else {
                g = this.czv.aqG();
            }
            Integer num = (Integer) this.czv.czn.getValue();
            if (num == null || g != num.intValue()) {
                this.czv.czn.postValue(Integer.valueOf(g));
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDepositRequisites;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: DepositCryptoRequisitesViewModel.kt */
    static final class c<T> implements io.reactivex.b.f<com.iqoption.core.microservices.billing.response.crypto.c> {
        final /* synthetic */ b czv;

        c(b bVar) {
            this.czv = bVar;
        }

        /* renamed from: a */
        public final void accept(com.iqoption.core.microservices.billing.response.crypto.c cVar) {
            this.czv.czk.onNext(Optional.an(cVar != null ? Long.valueOf(cVar.aab()) : null));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lkotlin/Pair;", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDepositRequisites;", "", "kotlin.jvm.PlatformType", "requisites", "apply"})
    /* compiled from: DepositCryptoRequisitesViewModel.kt */
    static final class d<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
        final /* synthetic */ String czD;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/util/Optional;", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "apply"})
        /* compiled from: DepositCryptoRequisitesViewModel.kt */
        static final class a<T, R> implements io.reactivex.b.g<T, R> {
            public static final a czF = new a();

            a() {
            }

            /* renamed from: d */
            public final String apply(z<com.iqoption.core.microservices.configuration.a.d> zVar) {
                kotlin.jvm.internal.i.f(zVar, "it");
                return ((com.iqoption.core.microservices.configuration.a.d) zVar.get()).getMask();
            }
        }

        d(String str) {
            this.czD = str;
        }

        /* renamed from: b */
        public final p<Pair<com.iqoption.core.microservices.billing.response.crypto.c, String>> apply(final com.iqoption.core.microservices.billing.response.crypto.c cVar) {
            kotlin.jvm.internal.i.f(cVar, "requisites");
            CharSequence charSequence = this.czD;
            Object obj = (charSequence == null || u.Y(charSequence)) ? 1 : null;
            if (obj != null) {
                obj = com.iqoption.core.data.repository.c.bdy.fO(cVar.ZO()).blg().t(a.czF);
            } else {
                obj = p.cI(this.czD);
            }
            kotlin.jvm.internal.i.e(obj, "if (existedFiatMask.isNu…                        }");
            return obj.t(new io.reactivex.b.g<T, R>() {
                /* renamed from: hJ */
                public final Pair<com.iqoption.core.microservices.billing.response.crypto.c, String> apply(String str) {
                    kotlin.jvm.internal.i.f(str, "mask");
                    return new Pair(cVar, str);
                }
            });
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001aV\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002 \u0005**\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lcom/google/common/base/Optional;", "Lkotlin/Pair;", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDepositRequisites;", "", "kotlin.jvm.PlatformType", "it", "apply"})
    /* compiled from: DepositCryptoRequisitesViewModel.kt */
    static final class e<T, R> implements io.reactivex.b.g<T, R> {
        public static final e czG = new e();

        e() {
        }

        /* renamed from: b */
        public final Optional<Pair<com.iqoption.core.microservices.billing.response.crypto.c, String>> apply(Pair<com.iqoption.core.microservices.billing.response.crypto.c, String> pair) {
            kotlin.jvm.internal.i.f(pair, "it");
            return Optional.am(pair);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001aV\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002 \u0005**\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, bng = {"<anonymous>", "Lcom/google/common/base/Optional;", "Lkotlin/Pair;", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDepositRequisites;", "", "kotlin.jvm.PlatformType", "it", "", "apply"})
    /* compiled from: DepositCryptoRequisitesViewModel.kt */
    static final class f<T, R> implements io.reactivex.b.g<Throwable, Optional<Pair<? extends com.iqoption.core.microservices.billing.response.crypto.c, ? extends String>>> {
        public static final f czH = new f();

        f() {
        }

        /* renamed from: x */
        public final Optional<Pair<com.iqoption.core.microservices.billing.response.crypto.c, String>> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return Optional.pW();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "deposits", "", "Lcom/iqoption/core/microservices/billing/response/crypto/CryptoDeposit;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: DepositCryptoRequisitesViewModel.kt */
    static final class g<T> implements io.reactivex.b.f<List<? extends com.iqoption.core.microservices.billing.response.crypto.a>> {
        final /* synthetic */ b czv;

        g(b bVar) {
            this.czv = bVar;
        }

        /* renamed from: v */
        public final void accept(List<com.iqoption.core.microservices.billing.response.crypto.a> list) {
            CryptoDepositStatus cryptoDepositStatus;
            Object obj;
            List<com.iqoption.core.microservices.billing.response.crypto.a> list2 = list;
            kotlin.jvm.internal.i.e(list2, "deposits");
            Iterator it = list2.iterator();
            Object obj2;
            do {
                cryptoDepositStatus = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((com.iqoption.core.microservices.billing.response.crypto.a) obj).ZF() == this.czv.ZF()) {
                    obj2 = 1;
                    continue;
                } else {
                    obj2 = null;
                    continue;
                }
            } while (obj2 == null);
            com.iqoption.core.microservices.billing.response.crypto.a aVar = (com.iqoption.core.microservices.billing.response.crypto.a) obj;
            if (aVar != null) {
                cryptoDepositStatus = aVar.ZR();
            }
            if (cryptoDepositStatus != null) {
                if (com.iqoption.core.ext.c.b((Object) cryptoDepositStatus, CryptoDepositStatus.PENDING, CryptoDepositStatus.SUCCESS, CryptoDepositStatus.FAILED, CryptoDepositStatus.EXPIRED)) {
                    this.czv.d(aVar);
                    return;
                }
            }
            if (cryptoDepositStatus == CryptoDepositStatus.NEW) {
                this.czv.d(com.iqoption.core.microservices.billing.response.crypto.a.a(aVar, 0, null, 0.0d, null, null, null, CryptoDepositStatus.FAILED, 0, 0, null, 0, null, null, 0, null, 0, null, 131007, null));
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: DepositCryptoRequisitesViewModel.kt */
    static final class h<T> implements io.reactivex.b.f<Throwable> {
        public static final h czI = new h();

        h() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    private final long ZF() {
        return ((Number) this.czg.b(this, anY[0])).longValue();
    }

    private final int aqG() {
        kotlin.d dVar = this.czp;
        j jVar = anY[1];
        return ((Number) dVar.getValue()).intValue();
    }

    private final int aqH() {
        kotlin.d dVar = this.czq;
        j jVar = anY[2];
        return ((Number) dVar.getValue()).intValue();
    }

    private final void br(long j) {
        this.czg.a(this, anY[0], Long.valueOf(j));
    }

    public b(Application application) {
        kotlin.jvm.internal.i.f(application, "app");
        super(application);
        io.reactivex.processors.a bmJ = BehaviorProcessor.bmG().bmJ();
        kotlin.jvm.internal.i.e(bmJ, "BehaviorProcessor.create…Request>().toSerialized()");
        this.czh = bmJ;
        this.czi = new MutableLiveData();
        this.czj = this.czi;
        bmJ = BehaviorProcessor.bmG().bmJ();
        kotlin.jvm.internal.i.e(bmJ, "BehaviorProcessor.create…l<Long>>().toSerialized()");
        this.czk = bmJ;
        this.czl = new MutableLiveData();
        this.czm = this.czl;
        this.czn = new MutableLiveData();
        this.czo = this.czn;
        this.czp = g.c(new DepositCryptoRequisitesViewModel$normalColor$2(application));
        this.czq = g.c(new DepositCryptoRequisitesViewModel$warningColor$2(application));
        io.reactivex.disposables.b a = this.czh.c(com.iqoption.core.rx.i.aki()).bkY().g(AnonymousClass1.czu).c(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new AnonymousClass4(this), (io.reactivex.b.f) AnonymousClass5.czx);
        kotlin.jvm.internal.i.e(a, "requestsProcessor\n      …r ->  }\n                )");
        b(a);
        a = this.czk.c(com.iqoption.core.rx.i.aki()).k(AnonymousClass6.czy).g(AnonymousClass7.czA).bkT().c((io.reactivex.b.f) new AnonymousClass8(this)).c(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new AnonymousClass9(this), (io.reactivex.b.f) AnonymousClass10.czB);
        kotlin.jvm.internal.i.e(a, "expireTimeProcessor\n    …      }\n                )");
        b(a);
        a = com.iqoption.core.microservices.billing.a.bmi.Zv().b((l) new AnonymousClass11(this)).c(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new AnonymousClass2(this), (io.reactivex.b.f) AnonymousClass3.czw);
        kotlin.jvm.internal.i.e(a, "CashBoxRequests.getCrypt…r ->  }\n                )");
        b(a);
    }

    public final LiveData<Bitmap> aqD() {
        return this.czj;
    }

    public final LiveData<String> aqE() {
        return this.czm;
    }

    public final LiveData<Integer> aqF() {
        return this.czo;
    }

    private final void aqI() {
        io.reactivex.disposables.b a = com.iqoption.core.microservices.billing.a.bmi.Zu().g(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new g(this), (io.reactivex.b.f) h.czI);
        kotlin.jvm.internal.i.e(a, "CashBoxRequests.getCrypt…r ->  }\n                )");
        b(a);
    }

    private final void d(com.iqoption.core.microservices.billing.response.crypto.a aVar) {
        if (com.iqoption.core.ext.c.b(aVar.ZR(), CryptoDepositStatus.PENDING, CryptoDepositStatus.SUCCESS, CryptoDepositStatus.FAILED, CryptoDepositStatus.EXPIRED)) {
            com.iqoption.deposit.k kVar = this.cxD;
            if (kVar == null) {
                kotlin.jvm.internal.i.lG("depositSelectionViewModel");
            }
            kVar.a(aVar);
        }
    }

    private final String bs(long j) {
        j = TimeUnit.MILLISECONDS.toSeconds(j - TimeUnit.MINUTES.toMillis(TimeUnit.MILLISECONDS.toMinutes(j)));
        n nVar = n.eWf;
        Object[] objArr = new Object[]{Long.valueOf(r0), Long.valueOf(j)};
        String format = String.format("%02d:%02d", Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.i.e(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public final void M(String str, int i) {
        kotlin.jvm.internal.i.f(str, "data");
        this.czh.onNext(new b(str, i));
    }

    public final LiveData<Optional<Pair<com.iqoption.core.microservices.billing.response.crypto.c, String>>> i(long j, String str) {
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(com.iqoption.core.microservices.billing.a.bmi.aS(j).h((io.reactivex.b.f) new c(this)).q(new d(str)).t(e.czG).u(f.czH).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).bkO());
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…  .toFlowable()\n        )");
        return fromPublisher;
    }
}
