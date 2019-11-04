package com.iqoption.cardsverification.status;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.cardsverification.a.m;
import com.iqoption.cardsverification.g.f;
import com.iqoption.core.util.r;
import com.squareup.picasso.Picasso;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, bng = {"Lcom/iqoption/cardsverification/status/VerifyHintBottomSheetFragment;", "Lcom/iqoption/bottomsheet/BindingBottomSheetFragment;", "Lcom/iqoption/cardsverification/databinding/VerifySideHintBinding;", "()V", "cardHintData", "Lcom/iqoption/cardsverification/status/CardHintData;", "getCardHintData", "()Lcom/iqoption/cardsverification/status/CardHintData;", "cardHintData$delegate", "Lkotlin/Lazy;", "cardSideToMakePhotoOnClose", "Lcom/iqoption/cardsverification/status/CardSide;", "onBottomSheetClosed", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "provideViewBinding", "container", "Landroid/view/ViewGroup;", "Companion", "OnMakePhotoListener", "cardsverification_release"})
/* compiled from: VerifyHintBottomSheetFragment.kt */
public final class i extends com.iqoption.bottomsheet.a<m> {
    private static final String TAG;
    public static final a aCy = new a();
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(i.class), "cardHintData", "getCardHintData()Lcom/iqoption/cardsverification/status/CardHintData;"))};
    private final kotlin.d aCw = g.c(new VerifyHintBottomSheetFragment$cardHintData$2(this));
    private CardSide aCx;
    private HashMap apm;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, bng = {"Lcom/iqoption/cardsverification/status/VerifyHintBottomSheetFragment$Companion;", "", "()V", "ARG_CARD_HINT_DATA", "", "BACK_SIDE_IMAGE_RESOURCE_ID", "FRONT_SIDE_IMAGE_RESOURCE_ID", "TAG", "getTAG", "()Ljava/lang/String;", "show", "", "fm", "Landroidx/fragment/app/FragmentManager;", "containerViewId", "", "data", "Lcom/iqoption/cardsverification/status/CardHintData;", "cardsverification_release"})
    /* compiled from: VerifyHintBottomSheetFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return i.TAG;
        }

        public final void a(FragmentManager fragmentManager, @IdRes int i, c cVar) {
            kotlin.jvm.internal.i.f(fragmentManager, "fm");
            kotlin.jvm.internal.i.f(cVar, "data");
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            i iVar = new i();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_CARD_HINT_DATA", cVar);
            iVar.setArguments(bundle);
            a aVar = this;
            beginTransaction.add(i, iVar, aVar.Bx()).addToBackStack(aVar.Bx()).commit();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/cardsverification/status/VerifyHintBottomSheetFragment$OnMakePhotoListener;", "", "onMakePhotoClick", "", "cardSide", "Lcom/iqoption/cardsverification/status/CardSide;", "cardsverification_release"})
    /* compiled from: VerifyHintBottomSheetFragment.kt */
    public interface b {
        void a(CardSide cardSide);
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: VerifyHintBottomSheetFragment.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ i this$0;

        c(i iVar) {
            this.this$0 = iVar;
        }

        public final void onClick(View view) {
            this.this$0.KN();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: VerifyHintBottomSheetFragment.kt */
    static final class d implements OnClickListener {
        final /* synthetic */ CardSide aCz;
        final /* synthetic */ i this$0;

        d(i iVar, CardSide cardSide) {
            this.this$0 = iVar;
            this.aCz = cardSide;
        }

        public final void onClick(View view) {
            this.this$0.aCx = this.aCz;
            this.this$0.KN();
        }
    }

    private final c LM() {
        kotlin.d dVar = this.aCw;
        j jVar = anY[0];
        return (c) dVar.getValue();
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    static {
        String name = i.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    /* renamed from: l */
    public m j(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "container");
        m a = m.a(LayoutInflater.from(getContext()));
        if (a == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return a;
    }

    public void onViewCreated(View view, Bundle bundle) {
        StringBuilder stringBuilder;
        String str;
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        CardSide Lz = LM().Lz();
        int i = j.aob[Lz.ordinal()];
        String str2 = "Unexpected case: ";
        if (i == 1) {
            i = f.front_side;
        } else if (i == 2) {
            i = f.back_side;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(Lz);
            throw new IllegalStateException(stringBuilder.toString());
        }
        TextView textView = ((m) getBinding()).aBa;
        kotlin.jvm.internal.i.e(textView, "binding.verifyHintTitle");
        textView.setText(getString(i));
        i = j.axg[Lz.ordinal()];
        if (i == 1) {
            str = "verify_card_front_side";
        } else if (i == 2) {
            str = "verify_card_back_side";
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(Lz);
            throw new IllegalStateException(stringBuilder.toString());
        }
        Picasso with = Picasso.with(com.iqoption.core.ext.a.q(this));
        kotlin.jvm.internal.i.e(with, "Picasso.with(ctx)");
        r.a(with, str).into(((m) getBinding()).aAY);
        ((m) getBinding()).aAX.setOnClickListener(new c(this));
        TextView textView2 = ((m) getBinding()).aAZ;
        kotlin.jvm.internal.i.e(textView2, "binding.verifyHintPhoto");
        textView2.setOnClickListener(new d(this, Lz));
    }

    public void KR() {
        super.KR();
        CardSide cardSide = this.aCx;
        if (cardSide != null) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null) {
                ((b) parentFragment).a(cardSide);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.cardsverification.status.VerifyHintBottomSheetFragment.OnMakePhotoListener");
            }
        }
        this.aCx = (CardSide) null;
        com.iqoption.core.ext.a.t(this).popBackStack();
    }
}
