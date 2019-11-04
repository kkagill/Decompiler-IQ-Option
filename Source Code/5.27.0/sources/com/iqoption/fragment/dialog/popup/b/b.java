package com.iqoption.fragment.dialog.popup.b;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStores;
import com.google.android.gms.plus.PlusShare;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0003\u0018\u0019\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, bng = {"Lcom/iqoption/fragment/dialog/popup/toast/TemplateToastViewModel;", "Landroidx/lifecycle/ViewModel;", "popup", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "(Lcom/iqoption/core/microservices/popupserver/response/Popup;)V", "action", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/fragment/dialog/popup/toast/TemplateToastViewModel$Action;", "getAction", "()Landroidx/lifecycle/LiveData;", "actionData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "isInvalid", "", "()Z", "getPopup", "()Lcom/iqoption/core/microservices/popupserver/response/Popup;", "state", "Lcom/iqoption/fragment/dialog/popup/toast/TemplateToastViewModel$State;", "getState", "()Lcom/iqoption/fragment/dialog/popup/toast/TemplateToastViewModel$State;", "onAction", "", "onCloseAction", "Action", "Companion", "State", "app_optionXRelease"})
/* compiled from: TemplateToastViewModel.kt */
public final class b extends ViewModel {
    private static com.iqoption.core.microservices.popupserver.response.a dfn;
    public static final b dfo = new b();
    private final com.iqoption.core.microservices.popupserver.response.a deL;
    private final c dfk = new c(this.deL.agj());
    private final com.iqoption.core.data.b.b<a> dfl = new com.iqoption.core.data.b.b();
    private final LiveData<a> dfm = this.dfl;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\t\nB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0001\u0002\u000b\f¨\u0006\r"}, bng = {"Lcom/iqoption/fragment/dialog/popup/toast/TemplateToastViewModel$Action;", "", "id", "", "title", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "Close", "Empty", "Lcom/iqoption/fragment/dialog/popup/toast/TemplateToastViewModel$Action$Empty;", "Lcom/iqoption/fragment/dialog/popup/toast/TemplateToastViewModel$Action$Close;", "app_optionXRelease"})
    /* compiled from: TemplateToastViewModel.kt */
    public static abstract class a {
        private final String id;
        private final String title;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, bng = {"Lcom/iqoption/fragment/dialog/popup/toast/TemplateToastViewModel$Action$Close;", "Lcom/iqoption/fragment/dialog/popup/toast/TemplateToastViewModel$Action;", "title", "", "(Ljava/lang/String;)V", "app_optionXRelease"})
        /* compiled from: TemplateToastViewModel.kt */
        public static final class a extends a {
            public a(String str) {
                kotlin.jvm.internal.i.f(str, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
                super("close", str, null);
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, bng = {"Lcom/iqoption/fragment/dialog/popup/toast/TemplateToastViewModel$Action$Empty;", "Lcom/iqoption/fragment/dialog/popup/toast/TemplateToastViewModel$Action;", "()V", "app_optionXRelease"})
        /* compiled from: TemplateToastViewModel.kt */
        public static final class b extends a {
            public static final b dfp = new b();

            private b() {
                super("close", "", null);
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

    @i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J$\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00042\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0002R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0011\u0010\u001d\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001a¨\u0006!"}, bng = {"Lcom/iqoption/fragment/dialog/popup/toast/TemplateToastViewModel$State;", "", "map", "", "", "(Ljava/util/Map;)V", "action", "Lcom/iqoption/fragment/dialog/popup/toast/TemplateToastViewModel$Action;", "getAction", "()Lcom/iqoption/fragment/dialog/popup/toast/TemplateToastViewModel$Action;", "duration", "", "getDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "isInvalid", "", "()Z", "setInvalid", "(Z)V", "link", "Lcom/iqoption/core/util/link/Link;", "getLink", "()Lcom/iqoption/core/util/link/Link;", "message", "getMessage", "()Ljava/lang/String;", "removable", "getRemovable", "title", "getTitle", "parseAction", "buttonKey", "app_optionXRelease"})
    /* compiled from: TemplateToastViewModel.kt */
    public static final class c {
        private final com.iqoption.core.util.b.a dfq;
        private final boolean dfr;
        private final a dfs;
        private boolean dft;
        private final Long duration;
        private final String message;
        private final String title;

        public c(Map<String, String> map) {
            kotlin.jvm.internal.i.f(map, "map");
            String str = (String) map.get("popup_title");
            boolean z = true;
            String str2 = "";
            if (str == null) {
                this.dft = true;
                str = str2;
            }
            this.title = str;
            str = (String) map.get("popup_message.text");
            if (str == null) {
                str = str2;
            }
            this.message = str;
            str = (String) map.get("duration");
            com.iqoption.core.util.b.a aVar = null;
            this.duration = str != null ? Long.valueOf(Long.parseLong(str)) : null;
            str = (String) map.get("removable");
            if (str != null) {
                z = Boolean.parseBoolean(str);
            }
            this.dfr = z;
            str = (String) map.get("popup_message.link");
            String str3 = (String) map.get("popup_message.highlighted_text");
            if (!(str == null || str3 == null)) {
                aVar = new com.iqoption.core.util.b.a(str3, str);
            }
            this.dfq = aVar;
            this.dfs = b("popup_button", map);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getMessage() {
            return this.message;
        }

        public final com.iqoption.core.util.b.a aCt() {
            return this.dfq;
        }

        public final Long getDuration() {
            return this.duration;
        }

        public final boolean aCu() {
            return this.dfr;
        }

        public final a aCv() {
            return this.dfs;
        }

        public final boolean isInvalid() {
            return this.dft;
        }

        private final a b(String str, Map<String, String> map) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(".action");
            String str2 = (String) map.get(stringBuilder.toString());
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(".title");
            str = (String) map.get(stringBuilder2.toString());
            if (str2 == null || str == null) {
                return b.dfp;
            }
            a aVar;
            if (str2.hashCode() == 94756344 && str2.equals("close")) {
                aVar = new a(str);
            } else {
                aVar = b.dfp;
            }
            return aVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0007\u001a\u0002H\b\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, bng = {"Lcom/iqoption/fragment/dialog/popup/toast/TemplateToastViewModel$Companion;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "ACTION_CLOSE", "", "POPUP", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "get", "Lcom/iqoption/fragment/dialog/popup/toast/TemplateToastViewModel;", "f", "Landroidx/fragment/app/Fragment;", "popup", "app_optionXRelease"})
    /* compiled from: TemplateToastViewModel.kt */
    public static final class b implements Factory {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public <T extends ViewModel> T create(Class<T> cls) {
            kotlin.jvm.internal.i.f(cls, "modelClass");
            com.iqoption.core.microservices.popupserver.response.a aCs = b.dfn;
            if (aCs == null) {
                kotlin.jvm.internal.i.lG("POPUP");
            }
            return new b(aCs);
        }

        public final b a(Fragment fragment, com.iqoption.core.microservices.popupserver.response.a aVar) {
            kotlin.jvm.internal.i.f(fragment, "f");
            kotlin.jvm.internal.i.f(aVar, "popup");
            b bVar = this;
            b.dfn = aVar;
            ViewModel viewModel = new ViewModelProvider(ViewModelStores.of(fragment), (Factory) this).get(b.class);
            kotlin.jvm.internal.i.e(viewModel, "if (factory != null) {\n …f(f)\n    }[T::class.java]");
            return (b) viewModel;
        }
    }

    public b(com.iqoption.core.microservices.popupserver.response.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "popup");
        this.deL = aVar;
    }

    public final com.iqoption.core.microservices.popupserver.response.a aCn() {
        return this.deL;
    }

    public final c aCo() {
        return this.dfk;
    }

    public final LiveData<a> aCp() {
        return this.dfm;
    }

    public final boolean isInvalid() {
        return this.dfk.isInvalid();
    }

    public final void aCq() {
        if (this.dfk.aCu()) {
            this.dfl.setValue(b.dfp);
        }
    }

    public final void aCr() {
        this.dfl.setValue(this.dfk.aCv());
    }
}
