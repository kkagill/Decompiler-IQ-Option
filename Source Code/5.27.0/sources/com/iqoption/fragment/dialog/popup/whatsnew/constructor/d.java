package com.iqoption.fragment.dialog.popup.whatsnew.constructor;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStores;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.popupserver.response.PopupAnchor;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0003\u0019\u001a\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, bng = {"Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel;", "Landroidx/lifecycle/ViewModel;", "popup", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "(Lcom/iqoption/core/microservices/popupserver/response/Popup;)V", "action", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action;", "getAction", "()Landroidx/lifecycle/LiveData;", "actionData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "isInvalid", "", "()Z", "getPopup", "()Lcom/iqoption/core/microservices/popupserver/response/Popup;", "state", "Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$State;", "getState", "()Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$State;", "onCloseAction", "", "onNegativeAction", "onPositiveAction", "Action", "Companion", "State", "app_optionXRelease"})
/* compiled from: WhatsNewViewModel.kt */
public final class d extends ViewModel {
    public static final b dfX = new b();
    private static com.iqoption.core.microservices.popupserver.response.a dfn;
    private final com.iqoption.core.microservices.popupserver.response.a deL;
    private final c dfW = new c(this.deL.agi(), this.deL.agj());
    private final com.iqoption.core.data.b.b<a> dfl = new com.iqoption.core.data.b.b();
    private final LiveData<a> dfm = this.dfl;

    @i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\t\n\u000b\f\r\u000e\u000f\u0010B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0001\b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, bng = {"Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action;", "", "id", "", "title", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "Close", "Empty", "OpenAlertCreation", "OpenAsset", "OpenAssetInfo", "OpenDeposit", "OpenIndicatorsLibrary", "OpenMarketAnalysis", "Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action$Empty;", "Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action$Close;", "Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action$OpenIndicatorsLibrary;", "Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action$OpenAsset;", "Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action$OpenAssetInfo;", "Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action$OpenMarketAnalysis;", "Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action$OpenDeposit;", "Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action$OpenAlertCreation;", "app_optionXRelease"})
    /* compiled from: WhatsNewViewModel.kt */
    public static abstract class a {
        private final String id;
        private final String title;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, bng = {"Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action$Close;", "Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action;", "title", "", "(Ljava/lang/String;)V", "app_optionXRelease"})
        /* compiled from: WhatsNewViewModel.kt */
        public static final class a extends a {
            public a(String str) {
                kotlin.jvm.internal.i.f(str, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
                super("close", str, null);
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, bng = {"Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action$Empty;", "Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action;", "()V", "app_optionXRelease"})
        /* compiled from: WhatsNewViewModel.kt */
        public static final class b extends a {
            public static final b dfY = new b();

            private b() {
                super("close", "", null);
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, bng = {"Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action$OpenAlertCreation;", "Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action;", "title", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "activeId", "", "(Ljava/lang/String;Lcom/iqoption/core/data/model/InstrumentType;Ljava/lang/Integer;)V", "getActiveId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "app_optionXRelease"})
        /* compiled from: WhatsNewViewModel.kt */
        public static final class c extends a {
            private final Integer activeId;
            private final InstrumentType instrumentType;

            public c(String str, InstrumentType instrumentType, Integer num) {
                kotlin.jvm.internal.i.f(str, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
                super("open_alert_creation", str, null);
                this.instrumentType = instrumentType;
                this.activeId = num;
            }

            public final Integer aiq() {
                return this.activeId;
            }

            public final InstrumentType getInstrumentType() {
                return this.instrumentType;
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, bng = {"Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action$OpenAsset;", "Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action;", "title", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "activeId", "", "(Ljava/lang/String;Lcom/iqoption/core/data/model/InstrumentType;I)V", "getActiveId", "()I", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "app_optionXRelease"})
        /* compiled from: WhatsNewViewModel.kt */
        public static final class d extends a {
            private final int activeId;
            private final InstrumentType instrumentType;

            public d(String str, InstrumentType instrumentType, int i) {
                kotlin.jvm.internal.i.f(str, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
                kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
                super("open_asset", str, null);
                this.instrumentType = instrumentType;
                this.activeId = i;
            }

            public final int getActiveId() {
                return this.activeId;
            }

            public final InstrumentType getInstrumentType() {
                return this.instrumentType;
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, bng = {"Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action$OpenAssetInfo;", "Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action;", "title", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "activeId", "", "(Ljava/lang/String;Lcom/iqoption/core/data/model/InstrumentType;I)V", "getActiveId", "()I", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "app_optionXRelease"})
        /* compiled from: WhatsNewViewModel.kt */
        public static final class e extends a {
            private final int activeId;
            private final InstrumentType instrumentType;

            public e(String str, InstrumentType instrumentType, int i) {
                kotlin.jvm.internal.i.f(str, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
                kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
                super("open_asset_info", str, null);
                this.instrumentType = instrumentType;
                this.activeId = i;
            }

            public final int getActiveId() {
                return this.activeId;
            }

            public final InstrumentType getInstrumentType() {
                return this.instrumentType;
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, bng = {"Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action$OpenDeposit;", "Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action;", "title", "", "paymentMethodId", "", "(Ljava/lang/String;Ljava/lang/Long;)V", "getPaymentMethodId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "app_optionXRelease"})
        /* compiled from: WhatsNewViewModel.kt */
        public static final class f extends a {
            private final Long dfZ;

            public f(String str, Long l) {
                kotlin.jvm.internal.i.f(str, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
                super("open_deposit", str, null);
                this.dfZ = l;
            }

            public final Long aCI() {
                return this.dfZ;
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, bng = {"Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action$OpenIndicatorsLibrary;", "Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action;", "title", "", "(Ljava/lang/String;)V", "app_optionXRelease"})
        /* compiled from: WhatsNewViewModel.kt */
        public static final class g extends a {
            public g(String str) {
                kotlin.jvm.internal.i.f(str, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
                super("open_indicators_library", str, null);
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, bng = {"Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action$OpenMarketAnalysis;", "Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action;", "title", "", "(Ljava/lang/String;)V", "app_optionXRelease"})
        /* compiled from: WhatsNewViewModel.kt */
        public static final class h extends a {
            public h(String str) {
                kotlin.jvm.internal.i.f(str, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
                super("open_market_analysis", str, null);
            }
        }

        private a(String str, String str2) {
            this.id = str;
            this.title = str2;
        }

        public /* synthetic */ a(String str, String str2, f fVar) {
            this(str, str2);
        }

        public final String getId() {
            return this.id;
        }

        public final String getTitle() {
            return this.title;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J$\u00102\u001a\u00020'2\u0006\u00103\u001a\u00020\u00062\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J.\u00104\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u00103\u001a\u00020\u00062\u0006\u00105\u001a\u00020\fH\u0002R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\nR\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0018\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\nR\u0015\u0010$\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b%\u0010\u000eR\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0013\u0010,\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\nR\u0015\u0010.\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b/\u0010\u000eR\u0013\u00100\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\n¨\u00066"}, bng = {"Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$State;", "", "type", "Lcom/iqoption/core/microservices/popupserver/response/PopupAnchor;", "map", "", "", "(Lcom/iqoption/core/microservices/popupserver/response/PopupAnchor;Ljava/util/Map;)V", "bottomText", "getBottomText", "()Ljava/lang/String;", "bottomTextColor", "", "getBottomTextColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "header", "getHeader", "headerColor", "getHeaderColor", "image", "getImage", "isAutoPlay", "", "()Z", "isInvalid", "setInvalid", "(Z)V", "isLoop", "isMute", "link", "Lcom/iqoption/core/util/link/Link;", "getLink", "()Lcom/iqoption/core/util/link/Link;", "message", "getMessage", "messageColor", "getMessageColor", "negativeAction", "Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action;", "getNegativeAction", "()Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Action;", "positiveAction", "getPositiveAction", "title", "getTitle", "titleColor", "getTitleColor", "video", "getVideo", "parseAction", "buttonKey", "parseActionParameter", "index", "app_optionXRelease"})
    /* compiled from: WhatsNewViewModel.kt */
    public static final class c {
        private final String bDK;
        private final String bra;
        private final com.iqoption.core.util.b.a dfq;
        private boolean dft;
        private final boolean dga;
        private final boolean dgb;
        private final boolean dgc;
        private final Integer dgd;
        private final Integer dge;
        private final Integer dgf;
        private final String dgg;
        private final Integer dgh;
        private final a dgi;
        private final a dgj;
        private final String image;
        private final String message;
        private final String title;

        public c(PopupAnchor popupAnchor, Map<String, String> map) {
            String str;
            kotlin.jvm.internal.i.f(popupAnchor, "type");
            kotlin.jvm.internal.i.f(map, "map");
            this.image = (String) map.get("popup_image");
            this.bDK = (String) map.get("popup_video");
            boolean z = false;
            if (this.bDK != null) {
                str = (String) map.get("popup_video.autoplay");
                this.dga = str != null ? Boolean.parseBoolean(str) : false;
                str = (String) map.get("popup_video.loop");
                this.dgb = str != null ? Boolean.parseBoolean(str) : false;
                str = (String) map.get("popup_video.mute");
                this.dgc = str != null ? Boolean.parseBoolean(str) : false;
            } else {
                this.dga = false;
                this.dgb = false;
                this.dgc = false;
            }
            str = (String) map.get("popup_title_header");
            if (str == null) {
                this.dft = true;
                str = "";
            }
            this.bra = str;
            str = (String) map.get("popup_title_header.color");
            com.iqoption.core.util.b.a aVar = null;
            this.dgd = str != null ? com.iqoption.core.ext.a.fR(str) : null;
            str = "popup_title_message";
            this.title = (String) map.get(str);
            str = (String) map.get(str);
            this.dge = str != null ? com.iqoption.core.ext.a.fR(str) : null;
            this.message = (String) map.get("popup_message.text");
            str = (String) map.get("popup_message.text_color");
            this.dgf = str != null ? com.iqoption.core.ext.a.fR(str) : null;
            this.dgg = (String) map.get("popup_message.bottom_text");
            str = (String) map.get("popup_message.bottom_text_color");
            this.dgh = str != null ? com.iqoption.core.ext.a.fR(str) : null;
            str = (String) map.get("popup_message.link");
            String str2 = (String) map.get("popup_message.highlighted_text");
            if (!(str == null || str2 == null)) {
                aVar = new com.iqoption.core.util.b.a(str2, str);
            }
            this.dfq = aVar;
            if (this.dft || ((this.bDK == null && this.image == null) || (this.bDK != null && this.image == null))) {
                z = true;
            }
            this.dft = z;
            int i = e.aob[popupAnchor.ordinal()];
            if (i == 1) {
                this.dgi = c("popup_button_negative", map);
                this.dgj = c("popup_button_positive", map);
                if (kotlin.jvm.internal.i.y(this.dgi, b.dfY) || kotlin.jvm.internal.i.y(this.dgj, b.dfY)) {
                    this.dft = true;
                }
            } else if (i == 2) {
                this.dgi = b.dfY;
                this.dgj = c("popup_button", map);
                if (kotlin.jvm.internal.i.y(this.dgj, b.dfY)) {
                    this.dft = true;
                }
            } else if (i != 3) {
                this.dgi = b.dfY;
                this.dgj = b.dfY;
                this.dft = true;
            } else {
                this.dgi = b.dfY;
                this.dgj = b.dfY;
            }
        }

        public final String getImage() {
            return this.image;
        }

        public final String aCJ() {
            return this.bDK;
        }

        public final boolean aCK() {
            return this.dga;
        }

        public final boolean aCL() {
            return this.dgb;
        }

        public final boolean aCM() {
            return this.dgc;
        }

        public final String getHeader() {
            return this.bra;
        }

        public final Integer aCN() {
            return this.dgd;
        }

        public final String getTitle() {
            return this.title;
        }

        public final Integer aCO() {
            return this.dge;
        }

        public final String getMessage() {
            return this.message;
        }

        public final Integer aCP() {
            return this.dgf;
        }

        public final String aCQ() {
            return this.dgg;
        }

        public final Integer aCR() {
            return this.dgh;
        }

        public final com.iqoption.core.util.b.a aCt() {
            return this.dfq;
        }

        public final a aCS() {
            return this.dgi;
        }

        public final a aCT() {
            return this.dgj;
        }

        public final boolean isInvalid() {
            return this.dft;
        }

        /* JADX WARNING: Removed duplicated region for block: B:58:0x0100  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0085  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0092  */
        /* JADX WARNING: Missing block: B:26:0x008c, code skipped:
            if (r0 != null) goto L_0x0090;
     */
        /* JADX WARNING: Missing block: B:62:0x0107, code skipped:
            if (r0 != null) goto L_0x010b;
     */
        /* JADX WARNING: Missing block: B:85:0x0156, code skipped:
            if (r6 == null) goto L_0x0159;
     */
        private final com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a c(java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13) {
            /*
            r11 = this;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r0.append(r12);
            r1 = ".action";
            r0.append(r1);
            r0 = r0.toString();
            r0 = r13.get(r0);
            r0 = (java.lang.String) r0;
            r1 = new java.lang.StringBuilder;
            r1.<init>();
            r1.append(r12);
            r2 = ".title";
            r1.append(r2);
            r1 = r1.toString();
            r1 = r13.get(r1);
            r1 = (java.lang.String) r1;
            if (r0 == 0) goto L_0x019e;
        L_0x0030:
            if (r1 != 0) goto L_0x0034;
        L_0x0032:
            goto L_0x019e;
        L_0x0034:
            r2 = r0.hashCode();
            r3 = 2;
            r4 = 0;
            r5 = 1;
            r6 = 0;
            switch(r2) {
                case -766936182: goto L_0x0187;
                case -689331243: goto L_0x0176;
                case -285424206: goto L_0x0130;
                case -214071049: goto L_0x00d7;
                case 94756344: goto L_0x00c5;
                case 674632891: goto L_0x005c;
                case 2041379241: goto L_0x0041;
                default: goto L_0x003f;
            };
        L_0x003f:
            goto L_0x0198;
        L_0x0041:
            r2 = "open_deposit";
            r0 = r0.equals(r2);
            if (r0 == 0) goto L_0x0198;
        L_0x0049:
            r0 = new com.iqoption.fragment.dialog.popup.whatsnew.constructor.d$a$f;
            r12 = r11.a(r13, r12, r5);
            if (r12 == 0) goto L_0x0055;
        L_0x0051:
            r6 = kotlin.text.t.mX(r12);
        L_0x0055:
            r0.<init>(r1, r6);
            r0 = (com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a) r0;
            goto L_0x019d;
        L_0x005c:
            r2 = "open_asset";
            r0 = r0.equals(r2);
            if (r0 == 0) goto L_0x0198;
        L_0x0064:
            r0 = r11.a(r13, r12, r5);
            if (r0 == 0) goto L_0x00c0;
        L_0x006a:
            r2 = com.iqoption.core.data.model.InstrumentType.values();
            r7 = r2.length;
            r8 = 0;
        L_0x0070:
            if (r8 >= r7) goto L_0x0082;
        L_0x0072:
            r9 = r2[r8];
            r10 = r9.getServerValue();
            r10 = kotlin.jvm.internal.i.y(r10, r0);
            if (r10 == 0) goto L_0x007f;
        L_0x007e:
            goto L_0x0083;
        L_0x007f:
            r8 = r8 + 1;
            goto L_0x0070;
        L_0x0082:
            r9 = r6;
        L_0x0083:
            if (r9 == 0) goto L_0x008f;
        L_0x0085:
            r0 = com.iqoption.core.data.model.InstrumentType.UNKNOWN;
            if (r9 == r0) goto L_0x008b;
        L_0x0089:
            r0 = 1;
            goto L_0x008c;
        L_0x008b:
            r0 = 0;
        L_0x008c:
            if (r0 == 0) goto L_0x008f;
        L_0x008e:
            goto L_0x0090;
        L_0x008f:
            r9 = r6;
        L_0x0090:
            if (r9 == 0) goto L_0x00c0;
        L_0x0092:
            r12 = r11.a(r13, r12, r3);
            if (r12 == 0) goto L_0x00bb;
        L_0x0098:
            r12 = kotlin.text.t.mW(r12);
            if (r12 == 0) goto L_0x00ab;
        L_0x009e:
            r13 = r12;
            r13 = (java.lang.Number) r13;
            r13 = r13.intValue();
            if (r13 <= 0) goto L_0x00a8;
        L_0x00a7:
            r4 = 1;
        L_0x00a8:
            if (r4 == 0) goto L_0x00ab;
        L_0x00aa:
            r6 = r12;
        L_0x00ab:
            if (r6 == 0) goto L_0x00bb;
        L_0x00ad:
            r12 = r6.intValue();
            r13 = new com.iqoption.fragment.dialog.popup.whatsnew.constructor.d$a$d;
            r13.<init>(r1, r9, r12);
            r0 = r13;
            r0 = (com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a) r0;
            goto L_0x019d;
        L_0x00bb:
            r12 = com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a.b.dfY;
            r12 = (com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a) r12;
            return r12;
        L_0x00c0:
            r12 = com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a.b.dfY;
            r12 = (com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a) r12;
            return r12;
        L_0x00c5:
            r12 = "close";
            r12 = r0.equals(r12);
            if (r12 == 0) goto L_0x0198;
        L_0x00cd:
            r12 = new com.iqoption.fragment.dialog.popup.whatsnew.constructor.d$a$a;
            r12.<init>(r1);
            r0 = r12;
            r0 = (com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a) r0;
            goto L_0x019d;
        L_0x00d7:
            r2 = "open_alert_creation";
            r0 = r0.equals(r2);
            if (r0 == 0) goto L_0x0198;
        L_0x00df:
            r0 = r11.a(r13, r12, r5);
            if (r0 == 0) goto L_0x010a;
        L_0x00e5:
            r2 = com.iqoption.core.data.model.InstrumentType.values();
            r7 = r2.length;
            r8 = 0;
        L_0x00eb:
            if (r8 >= r7) goto L_0x00fd;
        L_0x00ed:
            r9 = r2[r8];
            r10 = r9.getServerValue();
            r10 = kotlin.jvm.internal.i.y(r10, r0);
            if (r10 == 0) goto L_0x00fa;
        L_0x00f9:
            goto L_0x00fe;
        L_0x00fa:
            r8 = r8 + 1;
            goto L_0x00eb;
        L_0x00fd:
            r9 = r6;
        L_0x00fe:
            if (r9 == 0) goto L_0x010a;
        L_0x0100:
            r0 = com.iqoption.core.data.model.InstrumentType.UNKNOWN;
            if (r9 == r0) goto L_0x0106;
        L_0x0104:
            r0 = 1;
            goto L_0x0107;
        L_0x0106:
            r0 = 0;
        L_0x0107:
            if (r0 == 0) goto L_0x010a;
        L_0x0109:
            goto L_0x010b;
        L_0x010a:
            r9 = r6;
        L_0x010b:
            r12 = r11.a(r13, r12, r3);
            if (r12 == 0) goto L_0x0126;
        L_0x0111:
            r12 = kotlin.text.t.mW(r12);
            if (r12 == 0) goto L_0x0126;
        L_0x0117:
            r13 = r12;
            r13 = (java.lang.Number) r13;
            r13 = r13.intValue();
            if (r13 <= 0) goto L_0x0121;
        L_0x0120:
            r4 = 1;
        L_0x0121:
            if (r4 == 0) goto L_0x0124;
        L_0x0123:
            goto L_0x0125;
        L_0x0124:
            r12 = r6;
        L_0x0125:
            r6 = r12;
        L_0x0126:
            r12 = new com.iqoption.fragment.dialog.popup.whatsnew.constructor.d$a$c;
            r12.<init>(r1, r9, r6);
            r0 = r12;
            r0 = (com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a) r0;
            goto L_0x019d;
        L_0x0130:
            r2 = "open_asset_info";
            r0 = r0.equals(r2);
            if (r0 == 0) goto L_0x0198;
        L_0x0138:
            r0 = r11.a(r13, r12, r5);
            if (r0 == 0) goto L_0x0159;
        L_0x013e:
            r2 = com.iqoption.core.data.model.InstrumentType.values();
            r5 = r2.length;
        L_0x0143:
            if (r4 >= r5) goto L_0x0156;
        L_0x0145:
            r7 = r2[r4];
            r8 = r7.getServerValue();
            r8 = kotlin.jvm.internal.i.y(r8, r0);
            if (r8 == 0) goto L_0x0153;
        L_0x0151:
            r6 = r7;
            goto L_0x0156;
        L_0x0153:
            r4 = r4 + 1;
            goto L_0x0143;
        L_0x0156:
            if (r6 == 0) goto L_0x0159;
        L_0x0158:
            goto L_0x015b;
        L_0x0159:
            r6 = com.iqoption.core.data.model.InstrumentType.UNKNOWN;
        L_0x015b:
            r12 = r11.a(r13, r12, r3);
            if (r12 == 0) goto L_0x016c;
        L_0x0161:
            r12 = kotlin.text.t.mW(r12);
            if (r12 == 0) goto L_0x016c;
        L_0x0167:
            r12 = r12.intValue();
            goto L_0x016d;
        L_0x016c:
            r12 = -1;
        L_0x016d:
            r13 = new com.iqoption.fragment.dialog.popup.whatsnew.constructor.d$a$e;
            r13.<init>(r1, r6, r12);
            r0 = r13;
            r0 = (com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a) r0;
            goto L_0x019d;
        L_0x0176:
            r12 = "open_indicators_library";
            r12 = r0.equals(r12);
            if (r12 == 0) goto L_0x0198;
        L_0x017e:
            r12 = new com.iqoption.fragment.dialog.popup.whatsnew.constructor.d$a$g;
            r12.<init>(r1);
            r0 = r12;
            r0 = (com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a) r0;
            goto L_0x019d;
        L_0x0187:
            r12 = "open_market_analysis";
            r12 = r0.equals(r12);
            if (r12 == 0) goto L_0x0198;
        L_0x018f:
            r12 = new com.iqoption.fragment.dialog.popup.whatsnew.constructor.d$a$h;
            r12.<init>(r1);
            r0 = r12;
            r0 = (com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a) r0;
            goto L_0x019d;
        L_0x0198:
            r12 = com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a.b.dfY;
            r0 = r12;
            r0 = (com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a) r0;
        L_0x019d:
            return r0;
        L_0x019e:
            r12 = com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a.b.dfY;
            r12 = (com.iqoption.fragment.dialog.popup.whatsnew.constructor.d.a) r12;
            return r12;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.dialog.popup.whatsnew.constructor.d$c.c(java.lang.String, java.util.Map):com.iqoption.fragment.dialog.popup.whatsnew.constructor.d$a");
        }

        private final String a(Map<String, String> map, String str, int i) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(".action_param");
            stringBuilder.append(i);
            return (String) map.get(stringBuilder.toString());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\r\u001a\u0002H\u000e\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011H\u0016¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u0018"}, bng = {"Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel$Companion;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "ACTION_CLOSE", "", "ACTION_OPEN_ALERT_CREATION", "ACTION_OPEN_ASSET", "ACTION_OPEN_ASSET_INFO", "ACTION_OPEN_DEPOSIT", "ACTION_OPEN_INDICATORS_LIBRARY", "ACTION_OPEN_MARKET_ANALYSIS", "POPUP", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "get", "Lcom/iqoption/fragment/dialog/popup/whatsnew/constructor/WhatsNewViewModel;", "f", "Landroidx/fragment/app/Fragment;", "popup", "app_optionXRelease"})
    /* compiled from: WhatsNewViewModel.kt */
    public static final class b implements Factory {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public <T extends ViewModel> T create(Class<T> cls) {
            kotlin.jvm.internal.i.f(cls, "modelClass");
            com.iqoption.core.microservices.popupserver.response.a aCs = d.dfn;
            if (aCs == null) {
                kotlin.jvm.internal.i.lG("POPUP");
            }
            return new d(aCs);
        }

        public final d b(Fragment fragment, com.iqoption.core.microservices.popupserver.response.a aVar) {
            kotlin.jvm.internal.i.f(fragment, "f");
            kotlin.jvm.internal.i.f(aVar, "popup");
            b bVar = this;
            d.dfn = aVar;
            ViewModel viewModel = new ViewModelProvider(ViewModelStores.of(fragment), (Factory) this).get(d.class);
            kotlin.jvm.internal.i.e(viewModel, "if (factory != null) {\n …f(f)\n    }[T::class.java]");
            return (d) viewModel;
        }
    }

    public d(com.iqoption.core.microservices.popupserver.response.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "popup");
        this.deL = aVar;
    }

    public final com.iqoption.core.microservices.popupserver.response.a aCn() {
        return this.deL;
    }

    public final c aCF() {
        return this.dfW;
    }

    public final LiveData<a> aCp() {
        return this.dfm;
    }

    public final boolean isInvalid() {
        return this.dfW.isInvalid();
    }

    public final void aCq() {
        this.dfl.setValue(new a(""));
    }

    public final void aCG() {
        this.dfl.setValue(this.dfW.aCS());
    }

    public final void aCH() {
        this.dfl.setValue(this.dfW.aCT());
    }
}
