package com.iqoption.cardsverification.repository;

import com.iqoption.core.microservices.billing.verification.response.CardStatus;
import com.iqoption.core.microservices.billing.verification.response.c;
import com.iqoption.core.util.z;
import io.reactivex.b.f;
import io.reactivex.e;
import io.reactivex.processors.PublishProcessor;
import java.util.List;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001aJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0004R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000Rs\u0010\u0006\u001aZ\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u0005*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t0\b\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u0005*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t0\u0007j\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u0005*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t`\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rRV\u0010\u0010\u001aJ\u0012F\u0012D\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t \u0005*\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0012j\u0004\u0018\u0001`\u00130\u0012j\u0002`\u00130\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, bng = {"Lcom/iqoption/cardsverification/repository/VerifyCardsRepository;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "cardsStream", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "Lcom/iqoption/core/util/Optional;", "", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "Lcom/iqoption/core/rx/livestream/OptionalLiveStreamSupplier;", "getCardsStream", "()Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "cardsStream$delegate", "Lkotlin/Lazy;", "customMutatorProcessor", "Lio/reactivex/processors/PublishProcessor;", "Lkotlin/Function1;", "Lcom/iqoption/cardsverification/repository/CardsMutator;", "applyNewCardStatus", "source", "card", "newStatus", "Lcom/iqoption/core/microservices/billing/verification/response/CardStatus;", "observeCards", "Lio/reactivex/Flowable;", "setVerifyCardUploaded", "Lio/reactivex/Completable;", "uuid", "cardsverification_release"})
/* compiled from: VerifyCardsRepository.kt */
public final class a {
    private static final String TAG = a.class.getSimpleName();
    private static final d aBG = g.c(VerifyCardsRepository$cardsStream$2.aBJ);
    private static final PublishProcessor<b<List<c>, List<c>>> aBH;
    public static final a aBI = new a();
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "cardsStream", "getCardsStream()Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;"))};

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "newStatus", "Lcom/iqoption/core/microservices/billing/verification/response/CardStatus;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: VerifyCardsRepository.kt */
    static final class a<T> implements f<CardStatus> {
        final /* synthetic */ c aBM;

        a(c cVar) {
            this.aBM = cVar;
        }

        /* renamed from: f */
        public final void accept(CardStatus cardStatus) {
            a.aBH.onNext(new VerifyCardsRepository$setVerifyCardUploaded$1$1(this, cardStatus));
        }
    }

    private final com.iqoption.core.rx.a.a<z<List<c>>, List<c>> Ln() {
        d dVar = aBG;
        j jVar = anY[0];
        return (com.iqoption.core.rx.a.a) dVar.getValue();
    }

    static {
        PublishProcessor bmK = PublishProcessor.bmK();
        kotlin.jvm.internal.i.e(bmK, "PublishProcessor.create<CardsMutator>()");
        aBH = bmK;
    }

    private a() {
    }

    public final e<List<c>> Lo() {
        return Ln().ako();
    }

    public final io.reactivex.a a(c cVar, String str) {
        kotlin.jvm.internal.i.f(cVar, "card");
        kotlin.jvm.internal.i.f(str, "uuid");
        io.reactivex.a blf = com.iqoption.core.microservices.billing.verification.a.boJ.gh(str).h((f) new a(cVar)).blf();
        kotlin.jvm.internal.i.e(blf, "VerificationRequests.set…         .ignoreElement()");
        return blf;
    }

    private final List<c> a(List<c> list, c cVar, CardStatus cardStatus) {
        int i = 0;
        for (c id : list) {
            if ((cVar.getId() == id.getId() ? 1 : null) != null) {
                break;
            }
            i++;
        }
        i = -1;
        return i != -1 ? com.iqoption.core.ext.c.a((List) list, i, c.a((c) list.get(i), 0, null, null, cardStatus, null, 23, null)) : list;
    }
}
