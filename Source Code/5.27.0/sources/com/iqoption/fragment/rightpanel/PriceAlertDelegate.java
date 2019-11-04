package com.iqoption.fragment.rightpanel;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.dto.ToastEntity;
import com.iqoption.e.yp;
import com.iqoption.x.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u000eH\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\u001a\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006!"}, bng = {"Lcom/iqoption/fragment/rightpanel/PriceAlertDelegate;", "Lcom/iqoption/fragment/rightpanel/RightPanelDelegate;", "f", "Lcom/iqoption/fragment/rightpanel/RightPanelFragment;", "asset", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "alert", "Lcom/iqoption/core/microservices/useralerts/response/AssetAlert;", "(Lcom/iqoption/fragment/rightpanel/RightPanelFragment;Lcom/iqoption/core/microservices/tradingengine/response/active/Active;Lcom/iqoption/core/microservices/useralerts/response/AssetAlert;)V", "getAlert", "()Lcom/iqoption/core/microservices/useralerts/response/AssetAlert;", "getAsset", "()Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "callRequest", "", "getAmount", "", "getInstrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "getMinMaxAmount", "", "isCallRequested", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "requestConfirmation", "shouldRequestConfirmation", "supports", "newActive", "app_optionXRelease"})
/* compiled from: PriceAlertDelegate.kt */
public final class PriceAlertDelegate extends RightPanelDelegate {
    private final com.iqoption.core.microservices.useralerts.response.a aoW;
    private final com.iqoption.core.microservices.tradingengine.response.active.a aoX;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/fragment/rightpanel/PriceAlertDelegate$onCreateView$1$clickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: PriceAlertDelegate.kt */
    public static final class a extends com.iqoption.core.ext.g {
        final /* synthetic */ yp doE;
        final /* synthetic */ PriceAlertDelegate doF;
        final /* synthetic */ n doG;
        final /* synthetic */ com.iqoption.alerts.ui.pricepicker.b doH;
        final /* synthetic */ com.iqoption.alerts.ui.optionspicker.b doI;
        final /* synthetic */ com.iqoption.o.d doJ;

        a(yp ypVar, PriceAlertDelegate priceAlertDelegate, n nVar, com.iqoption.alerts.ui.pricepicker.b bVar, com.iqoption.alerts.ui.optionspicker.b bVar2, com.iqoption.o.d dVar) {
            this.doE = ypVar;
            this.doF = priceAlertDelegate;
            this.doG = nVar;
            this.doH = bVar;
            this.doI = bVar2;
            this.doJ = dVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            String Bx;
            switch (view.getId()) {
                case R.id.btnClose /*2131362042*/:
                    this.doG.aHL();
                    return;
                case R.id.btnConfirm /*2131362047*/:
                    this.doG.aHG();
                    return;
                case R.id.valuePrice /*2131364321*/:
                    com.iqoption.alerts.ui.pricepicker.a a = com.iqoption.alerts.ui.pricepicker.a.aqj.a(new Rect(0, com.iqoption.core.ext.a.c((ViewDataBinding) this.doE, (int) R.dimen.dp53), com.iqoption.core.ext.a.c((ViewDataBinding) this.doE, (int) R.dimen.right_panel_width) + com.iqoption.core.ext.a.c((ViewDataBinding) this.doE, (int) R.dimen.dp4), com.iqoption.core.ext.a.c((ViewDataBinding) this.doE, (int) R.dimen.dp22)), 8388661, 1, this.doF.Bb().getActiveId(), this.doF.Bb().getInstrumentType().getServerValue());
                    Bx = com.iqoption.alerts.ui.pricepicker.a.aqj.Bx();
                    this.doF.getFragmentManager().beginTransaction().add(R.id.fragment, a, Bx).addToBackStack(Bx).commitAllowingStateLoss();
                    return;
                case R.id.valueRepeat /*2131364322*/:
                    Rect ah = com.iqoption.core.ext.a.ah(view);
                    ah.offset((0 - com.iqoption.core.ext.a.c((ViewDataBinding) this.doE, (int) R.dimen.dp8)) - com.iqoption.core.ext.a.c((ViewDataBinding) this.doE, (int) R.dimen.dp4), 0);
                    com.iqoption.alerts.ui.optionspicker.a a2 = com.iqoption.alerts.ui.optionspicker.a.apT.a(Integer.valueOf(ah.left), Integer.valueOf(ah.centerY()), 34, 1, this.doF.Bb().getActiveId(), this.doF.Bb().getInstrumentType().getServerValue());
                    Bx = com.iqoption.alerts.ui.optionspicker.a.apT.Bx();
                    this.doF.getFragmentManager().beginTransaction().add(R.id.fragment, a2, Bx).addToBackStack(Bx).commitAllowingStateLoss();
                    return;
                default:
                    return;
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "price", "", "kotlin.jvm.PlatformType", "onChanged", "com/iqoption/fragment/rightpanel/PriceAlertDelegate$onCreateView$1$1"})
    /* compiled from: PriceAlertDelegate.kt */
    static final class b<T> implements Observer<String> {
        final /* synthetic */ PriceAlertDelegate doF;
        final /* synthetic */ n doG;
        final /* synthetic */ com.iqoption.alerts.ui.pricepicker.b doH;
        final /* synthetic */ com.iqoption.alerts.ui.optionspicker.b doI;
        final /* synthetic */ com.iqoption.o.d doJ;

        b(PriceAlertDelegate priceAlertDelegate, n nVar, com.iqoption.alerts.ui.pricepicker.b bVar, com.iqoption.alerts.ui.optionspicker.b bVar2, com.iqoption.o.d dVar) {
            this.doF = priceAlertDelegate;
            this.doG = nVar;
            this.doH = bVar;
            this.doI = bVar2;
            this.doJ = dVar;
        }

        /* renamed from: dg */
        public final void onChanged(String str) {
            if (str != null) {
                this.doG.iy(str);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "selected", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V", "com/iqoption/fragment/rightpanel/PriceAlertDelegate$onCreateView$1$3"})
    /* compiled from: PriceAlertDelegate.kt */
    static final class c<T> implements Observer<Integer> {
        final /* synthetic */ PriceAlertDelegate doF;
        final /* synthetic */ n doG;
        final /* synthetic */ com.iqoption.alerts.ui.pricepicker.b doH;
        final /* synthetic */ com.iqoption.alerts.ui.optionspicker.b doI;
        final /* synthetic */ com.iqoption.o.d doJ;
        final /* synthetic */ AlertRepeat[] doK;

        c(AlertRepeat[] alertRepeatArr, PriceAlertDelegate priceAlertDelegate, n nVar, com.iqoption.alerts.ui.pricepicker.b bVar, com.iqoption.alerts.ui.optionspicker.b bVar2, com.iqoption.o.d dVar) {
            this.doK = alertRepeatArr;
            this.doF = priceAlertDelegate;
            this.doG = nVar;
            this.doH = bVar;
            this.doI = bVar2;
            this.doJ = dVar;
        }

        /* renamed from: b */
        public final void onChanged(Integer num) {
            if (num != null) {
                AlertRepeat alertRepeat = (AlertRepeat) i.e((Object[]) this.doK, num.intValue());
                if (alertRepeat != null) {
                    this.doG.b(alertRepeat);
                }
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "price", "", "kotlin.jvm.PlatformType", "onChanged", "com/iqoption/fragment/rightpanel/PriceAlertDelegate$onCreateView$1$6"})
    /* compiled from: PriceAlertDelegate.kt */
    static final class d<T> implements Observer<String> {
        final /* synthetic */ yp doE;
        final /* synthetic */ PriceAlertDelegate doF;
        final /* synthetic */ n doG;
        final /* synthetic */ com.iqoption.alerts.ui.pricepicker.b doH;
        final /* synthetic */ com.iqoption.alerts.ui.optionspicker.b doI;
        final /* synthetic */ com.iqoption.o.d doJ;

        d(yp ypVar, PriceAlertDelegate priceAlertDelegate, n nVar, com.iqoption.alerts.ui.pricepicker.b bVar, com.iqoption.alerts.ui.optionspicker.b bVar2, com.iqoption.o.d dVar) {
            this.doE = ypVar;
            this.doF = priceAlertDelegate;
            this.doG = nVar;
            this.doH = bVar;
            this.doI = bVar2;
            this.doJ = dVar;
        }

        /* renamed from: dg */
        public final void onChanged(String str) {
            if (str != null) {
                TextView textView = this.doE.ctV;
                kotlin.jvm.internal.i.e(textView, "valueCurrent");
                textView.setText(str);
                this.doH.setPrice(str);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "pair", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "onChanged", "com/iqoption/fragment/rightpanel/PriceAlertDelegate$onCreateView$1$9"})
    /* compiled from: PriceAlertDelegate.kt */
    static final class e<T> implements Observer<Pair<? extends String, ? extends Boolean>> {
        final /* synthetic */ PriceAlertDelegate doF;
        final /* synthetic */ n doG;
        final /* synthetic */ com.iqoption.alerts.ui.pricepicker.b doH;
        final /* synthetic */ com.iqoption.alerts.ui.optionspicker.b doI;
        final /* synthetic */ com.iqoption.o.d doJ;

        e(PriceAlertDelegate priceAlertDelegate, n nVar, com.iqoption.alerts.ui.pricepicker.b bVar, com.iqoption.alerts.ui.optionspicker.b bVar2, com.iqoption.o.d dVar) {
            this.doF = priceAlertDelegate;
            this.doG = nVar;
            this.doH = bVar;
            this.doI = bVar2;
            this.doJ = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Pair<String, Boolean> pair) {
            if (pair != null) {
                String str = (String) pair.getFirst();
                com.iqoption.o.d dVar;
                ToastEntity toastEntity;
                ToastEntity toastEntity2;
                if (((Boolean) pair.bni()).booleanValue()) {
                    this.doG.aHF();
                    dVar = this.doJ;
                    toastEntity = toastEntity2;
                    toastEntity2 = new ToastEntity(R.drawable.local_toast_type_indicator_green, SystemClock.elapsedRealtimeNanos(), str, null, ToastEntity.TOAST_DURATION, null, null, null, 232, null);
                    dVar.b(toastEntity);
                    return;
                }
                dVar = this.doJ;
                toastEntity = toastEntity2;
                toastEntity2 = new ToastEntity(R.drawable.local_toast_type_indicator_red, SystemClock.elapsedRealtimeNanos(), str, null, ToastEntity.ERROR_TOAST_DURATION, null, null, null, 232, null);
                dVar.b(toastEntity);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "isPickerShown", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: PriceAlertDelegate.kt */
    static final class f<T> implements Observer<Boolean> {
        final /* synthetic */ yp doE;

        f(yp ypVar) {
            this.doE = ypVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (bool != null) {
                TextView textView = this.doE.ctW;
                kotlin.jvm.internal.i.e(textView, "valuePrice");
                textView.setSelected(bool.booleanValue());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "isPickerShown", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: PriceAlertDelegate.kt */
    static final class g<T> implements Observer<Boolean> {
        final /* synthetic */ yp doE;

        g(yp ypVar) {
            this.doE = ypVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (bool != null) {
                TextView textView = this.doE.ctX;
                kotlin.jvm.internal.i.e(textView, "valueRepeat");
                textView.setSelected(bool.booleanValue());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "price", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: PriceAlertDelegate.kt */
    static final class h<T> implements Observer<String> {
        final /* synthetic */ yp doE;

        h(yp ypVar) {
            this.doE = ypVar;
        }

        /* renamed from: dg */
        public final void onChanged(String str) {
            if (str != null) {
                TextView textView = this.doE.ctW;
                kotlin.jvm.internal.i.e(textView, "valuePrice");
                textView.setText(str);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "repeat", "Lcom/iqoption/fragment/rightpanel/AlertRepeat;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: PriceAlertDelegate.kt */
    static final class i<T> implements Observer<AlertRepeat> {
        final /* synthetic */ yp doE;

        i(yp ypVar) {
            this.doE = ypVar;
        }

        /* renamed from: a */
        public final void onChanged(AlertRepeat alertRepeat) {
            if (alertRepeat != null) {
                this.doE.ctX.setText(alertRepeat.getLabelResId());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "isShowLoading", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: PriceAlertDelegate.kt */
    static final class j<T> implements Observer<Boolean> {
        final /* synthetic */ yp doE;

        j(yp ypVar) {
            this.doE = ypVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            String str = "btnConfirmLabel";
            String str2 = "btnConfirmProgress";
            ProgressBar progressBar;
            TextView textView;
            if (kotlin.jvm.internal.i.y(bool, Boolean.valueOf(true))) {
                progressBar = this.doE.ctR;
                kotlin.jvm.internal.i.e(progressBar, str2);
                com.iqoption.core.ext.a.ak(progressBar);
                textView = this.doE.ctQ;
                kotlin.jvm.internal.i.e(textView, str);
                com.iqoption.core.ext.a.al(textView);
                return;
            }
            progressBar = this.doE.ctR;
            kotlin.jvm.internal.i.e(progressBar, str2);
            com.iqoption.core.ext.a.al(progressBar);
            textView = this.doE.ctQ;
            kotlin.jvm.internal.i.e(textView, str);
            com.iqoption.core.ext.a.ak(textView);
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean b(com.iqoption.core.microservices.tradingengine.response.active.a aVar, com.iqoption.core.microservices.useralerts.response.a aVar2) {
        kotlin.jvm.internal.i.f(aVar, "newActive");
        return aVar2 != null;
    }

    public final com.iqoption.core.microservices.tradingengine.response.active.a Bb() {
        return this.aoX;
    }

    public PriceAlertDelegate(RightPanelFragment rightPanelFragment, com.iqoption.core.microservices.tradingengine.response.active.a aVar, com.iqoption.core.microservices.useralerts.response.a aVar2) {
        kotlin.jvm.internal.i.f(rightPanelFragment, "f");
        kotlin.jvm.internal.i.f(aVar, "asset");
        kotlin.jvm.internal.i.f(aVar2, "alert");
        super(rightPanelFragment);
        this.aoX = aVar;
        this.aoW = aVar2;
    }

    public boolean aFe() {
        throw new UnsupportedOperationException("This delegate does not implement the method");
    }

    public void aFf() {
        throw new UnsupportedOperationException("This delegate does not implement the method");
    }

    public void aFg() {
        throw new UnsupportedOperationException("This delegate does not implement the method");
    }

    public boolean aFh() {
        throw new UnsupportedOperationException("This delegate does not implement the method");
    }

    public double ZC() {
        throw new UnsupportedOperationException("This delegate does not implement the method");
    }

    public double[] aFd() {
        throw new UnsupportedOperationException("This delegate does not implement the method");
    }

    public InstrumentType getInstrumentType() {
        throw new UnsupportedOperationException("This delegate does not implement the method");
    }

    /* Access modifiers changed, original: protected */
    public View e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LayoutInflater layoutInflater2 = layoutInflater;
        kotlin.jvm.internal.i.f(layoutInflater2, "inflater");
        ViewGroup viewGroup2 = viewGroup;
        kotlin.jvm.internal.i.f(viewGroup2, "container");
        com.iqoption.o.d.b bVar = com.iqoption.o.d.dUK;
        TradeRoomActivity aFs = aFs();
        String str = "mainActivity";
        kotlin.jvm.internal.i.e(aFs, str);
        com.iqoption.o.d F = bVar.F(aFs);
        com.iqoption.fragment.rightpanel.n.a aVar = n.doT;
        aFs = aFs();
        kotlin.jvm.internal.i.e(aFs, str);
        n s = aVar.s(aFs);
        com.iqoption.alerts.ui.pricepicker.b.a aVar2 = com.iqoption.alerts.ui.pricepicker.b.aqp;
        aFs = aFs();
        kotlin.jvm.internal.i.e(aFs, str);
        com.iqoption.alerts.ui.pricepicker.b c = aVar2.c(aFs);
        com.iqoption.alerts.ui.optionspicker.b.a aVar3 = com.iqoption.alerts.ui.optionspicker.b.aqi;
        aFs = aFs();
        kotlin.jvm.internal.i.e(aFs, str);
        com.iqoption.alerts.ui.optionspicker.b b = aVar3.b(aFs);
        yp ypVar = (yp) com.iqoption.core.ext.a.a(layoutInflater2, (int) R.layout.right_panel_price_alert, viewGroup2, false, 4, null);
        ypVar.alH.setText(this.aoW.getId() > 0 ? R.string.edit_alert : R.string.set_alert);
        com.iqoption.alerts.ui.optionspicker.b bVar2 = b;
        OnClickListener aVar4 = new a(ypVar, this, s, c, bVar2, F);
        ypVar.bYA.setOnClickListener(aVar4);
        ypVar.ctP.setOnClickListener(aVar4);
        ypVar.ctW.setOnClickListener(aVar4);
        ypVar.ctX.setOnClickListener(aVar4);
        yp ypVar2 = ypVar;
        c.a(com.iqoption.core.util.e.a(this.aoW.getValue(), this.aoX.getPrecision(), null, false, false, false, false, null, null, 254, null), this.aoX.getPrecision(), n.doT.Y(this.aoX), true);
        LifecycleOwner lifecycleOwner = this;
        com.iqoption.alerts.ui.optionspicker.b bVar3 = bVar2;
        c.BH().observe(lifecycleOwner, new b(this, s, c, bVar2, F));
        c.BB().observe(lifecycleOwner, new f(ypVar2));
        AlertRepeat[] values = AlertRepeat.values();
        Collection arrayList = new ArrayList(values.length);
        for (AlertRepeat labelResId : values) {
            arrayList.add(getString(labelResId.getLabelResId()));
        }
        List list = (List) arrayList;
        int length = values.length;
        int i = 0;
        while (i < length) {
            if ((values[i].getActivations() == this.aoW.getActivations() ? 1 : null) != null) {
                break;
            }
            i++;
        }
        i = -1;
        bVar3.a(list, i);
        n nVar = s;
        com.iqoption.alerts.ui.pricepicker.b bVar4 = c;
        bVar2 = bVar3;
        yp ypVar3 = ypVar2;
        com.iqoption.o.d dVar = F;
        bVar3.BC().observe(aFr(), new c(values, this, nVar, bVar4, bVar2, dVar));
        bVar3.BB().observe(lifecycleOwner, new g(ypVar3));
        s.aHA().observe(lifecycleOwner, new h(ypVar3));
        s.aHB().observe(lifecycleOwner, new d(ypVar3, this, nVar, bVar4, bVar2, dVar));
        s.aHC().observe(lifecycleOwner, new i(ypVar3));
        s.aHD().observe(lifecycleOwner, new j(ypVar3));
        s.aHE().observe(lifecycleOwner, new e(this, s, c, bVar3, F));
        s.W(this.aoX);
        View root = ypVar3.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        return root;
    }
}
