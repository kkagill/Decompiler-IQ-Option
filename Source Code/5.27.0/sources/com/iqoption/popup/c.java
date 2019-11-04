package com.iqoption.popup;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.gson.JsonObject;
import com.iqoption.core.microservices.popupserver.response.PopupAnchor;
import com.iqoption.core.microservices.popupserver.response.PopupFormat;
import io.reactivex.b.g;
import io.reactivex.processors.PublishProcessor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 >2\u00020\u0001:\u0001>B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000eJ\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0004J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010!\u001a\u00020\u0004H\u0007J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u0004J\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0#2\u0006\u0010$\u001a\u00020%J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0#2\u0006\u0010&\u001a\u00020'2\u0006\u0010$\u001a\u00020%J(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0#2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00152\f\u0010)\u001a\b\u0012\u0004\u0012\u00020%0\u0015J\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0#2\u0006\u0010+\u001a\u00020'J\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0#2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020'0\u0015J\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0#2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020%0\u0015J\b\u0010/\u001a\u00020 H\u0014J\u0018\u00100\u001a\u00020 2\u0006\u00101\u001a\u0002022\u0006\u0010!\u001a\u00020\u0004H\u0002J\u0010\u00103\u001a\u00020 2\u0006\u00101\u001a\u000202H\u0002J\u0016\u00104\u001a\u00020 2\u0006\u00105\u001a\u0002062\u0006\u0010\u001d\u001a\u00020\u000eJ\u0016\u00104\u001a\u00020 2\u0006\u00105\u001a\u0002062\u0006\u0010\u001e\u001a\u00020\u0004J\u001e\u00104\u001a\u00020 2\u0006\u00105\u001a\u0002062\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u00107\u001a\u000208J\u0016\u00109\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u0004J \u0010;\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020=2\b\u0010:\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u000b*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R'\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00150\u00148BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006?"}, bng = {"Lcom/iqoption/popup/PopupViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "CLOSE_EVENT", "", "LOGGING_CONSUMER", "Lio/reactivex/functions/Consumer;", "", "SHOW_EVENT", "SUBMIT_EVENT", "TAG", "kotlin.jvm.PlatformType", "deleteSubject", "Lio/reactivex/processors/FlowableProcessor;", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "popupManager", "Lcom/iqoption/popup/PopupManager;", "popupStream", "Lio/reactivex/Flowable;", "", "getPopupStream", "()Lio/reactivex/Flowable;", "popupStream$delegate", "Lkotlin/Lazy;", "isShowing", "", "isShown", "popup", "tag", "notifyPopupHidden", "", "event", "observePopup", "Landroidx/lifecycle/LiveData;", "anchor", "Lcom/iqoption/core/microservices/popupserver/response/PopupAnchor;", "format", "Lcom/iqoption/core/microservices/popupserver/response/PopupFormat;", "formats", "anchors", "observePopupFormat", "formatName", "observePopupFormats", "formatNames", "observePopups", "onCleared", "sendEventClosedPopup", "popupId", "", "sendEventShowedPopup", "showPopup", "runnable", "Ljava/lang/Runnable;", "priority", "Lcom/iqoption/popup/PopupPriority;", "submitNY20019Nps", "comment", "submitNps", "score", "", "Companion", "dialogs_release"})
/* compiled from: PopupViewModel.kt */
public final class c extends ViewModel {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(c.class), "popupStream", "getPopupStream()Lio/reactivex/Flowable;"))};
    public static final a dKG = new a();
    private final String TAG = c.class.getSimpleName();
    private final io.reactivex.b.f<Throwable> aMn = b.dKH;
    private final io.reactivex.disposables.a aqB = new io.reactivex.disposables.a();
    private final String dKA = "show";
    private final String dKB = "close";
    private final String dKC = "send";
    private final b dKD = new b();
    private final io.reactivex.processors.a<com.iqoption.core.microservices.popupserver.response.a> dKE;
    private final kotlin.d dKF;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/popup/PopupViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/popup/PopupViewModel;", "a", "Landroidx/fragment/app/FragmentActivity;", "dialogs_release"})
    /* compiled from: PopupViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c A(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "a");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(c.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(a)…pupViewModel::class.java)");
            return (c) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: PopupViewModel.kt */
    static final class f implements Runnable {
        final /* synthetic */ Runnable dKV;
        final /* synthetic */ com.iqoption.core.microservices.popupserver.response.a dfa;
        final /* synthetic */ c this$0;

        f(c cVar, com.iqoption.core.microservices.popupserver.response.a aVar, Runnable runnable) {
            this.this$0 = cVar;
            this.dfa = aVar;
            this.dKV = runnable;
        }

        public final void run() {
            this.this$0.bY(this.dfa.getId().longValue());
            this.dKV.run();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PopupViewModel.kt */
    static final class b<T> implements io.reactivex.b.f<Throwable> {
        public static final b dKH = new b();

        b() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, bng = {"com/iqoption/popup/PopupViewModel$observePopup$1", "Landroidx/lifecycle/MutableLiveData;", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "dialogs_release"})
    /* compiled from: PopupViewModel.kt */
    public static final class c extends MutableLiveData<com.iqoption.core.microservices.popupserver.response.a> {
        final /* synthetic */ List dKI;
        final /* synthetic */ List dKJ;
        final /* synthetic */ c this$0;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "popups", "apply"})
        /* compiled from: PopupViewModel.kt */
        /* renamed from: com.iqoption.popup.c$c$1 */
        static final class AnonymousClass1<T, R> implements g<T, R> {
            final /* synthetic */ c dKK;

            AnonymousClass1(c cVar) {
                this.dKK = cVar;
            }

            public final List<com.iqoption.core.microservices.popupserver.response.a> apply(List<com.iqoption.core.microservices.popupserver.response.a> list) {
                kotlin.jvm.internal.i.f(list, "popups");
                Collection arrayList = new ArrayList();
                for (Object next : list) {
                    com.iqoption.core.microservices.popupserver.response.a aVar = (com.iqoption.core.microservices.popupserver.response.a) next;
                    Object obj = (this.dKK.dKI.contains(aVar.agk()) && this.dKK.dKJ.contains(aVar.agi())) ? 1 : null;
                    if (obj != null) {
                        arrayList.add(next);
                    }
                }
                return (List) arrayList;
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "popups", "", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "kotlin.jvm.PlatformType", "accept"})
        /* compiled from: PopupViewModel.kt */
        /* renamed from: com.iqoption.popup.c$c$2 */
        static final class AnonymousClass2<T> implements io.reactivex.b.f<List<? extends com.iqoption.core.microservices.popupserver.response.a>> {
            final /* synthetic */ c dKK;

            AnonymousClass2(c cVar) {
                this.dKK = cVar;
            }

            /* renamed from: v */
            public final void accept(List<com.iqoption.core.microservices.popupserver.response.a> list) {
                kotlin.jvm.internal.i.e(list, "popups");
                for (com.iqoption.core.microservices.popupserver.response.a postValue : list) {
                    this.dKK.postValue(postValue);
                }
            }
        }

        c(c cVar, List list, List list2) {
            this.this$0 = cVar;
            this.dKI = list;
            this.dKJ = list2;
            cVar.aQm().g(new AnonymousClass1(this)).d(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new AnonymousClass2(this), (io.reactivex.b.f) AnonymousClass3.dKL);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, bng = {"com/iqoption/popup/PopupViewModel$observePopupFormats$1", "Landroidx/lifecycle/MutableLiveData;", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "dialogs_release"})
    /* compiled from: PopupViewModel.kt */
    public static final class d extends MutableLiveData<com.iqoption.core.microservices.popupserver.response.a> {
        final /* synthetic */ List dKM;
        final /* synthetic */ c this$0;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "popups", "apply"})
        /* compiled from: PopupViewModel.kt */
        /* renamed from: com.iqoption.popup.c$d$1 */
        static final class AnonymousClass1<T, R> implements g<T, R> {
            final /* synthetic */ d dKN;

            AnonymousClass1(d dVar) {
                this.dKN = dVar;
            }

            public final List<com.iqoption.core.microservices.popupserver.response.a> apply(List<com.iqoption.core.microservices.popupserver.response.a> list) {
                kotlin.jvm.internal.i.f(list, "popups");
                Collection arrayList = new ArrayList();
                for (Object next : list) {
                    if (this.dKN.dKM.contains(((com.iqoption.core.microservices.popupserver.response.a) next).agk())) {
                        arrayList.add(next);
                    }
                }
                return (List) arrayList;
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "popups", "", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "kotlin.jvm.PlatformType", "accept"})
        /* compiled from: PopupViewModel.kt */
        /* renamed from: com.iqoption.popup.c$d$2 */
        static final class AnonymousClass2<T> implements io.reactivex.b.f<List<? extends com.iqoption.core.microservices.popupserver.response.a>> {
            final /* synthetic */ d dKN;

            AnonymousClass2(d dVar) {
                this.dKN = dVar;
            }

            /* renamed from: v */
            public final void accept(List<com.iqoption.core.microservices.popupserver.response.a> list) {
                kotlin.jvm.internal.i.e(list, "popups");
                for (com.iqoption.core.microservices.popupserver.response.a postValue : list) {
                    this.dKN.postValue(postValue);
                }
            }
        }

        d(c cVar, List list) {
            this.this$0 = cVar;
            this.dKM = list;
            cVar.aQm().g(new AnonymousClass1(this)).d(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new AnonymousClass2(this), (io.reactivex.b.f) AnonymousClass3.dKO);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, bng = {"com/iqoption/popup/PopupViewModel$observePopups$1", "Landroidx/lifecycle/MutableLiveData;", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "dialogs_release"})
    /* compiled from: PopupViewModel.kt */
    public static final class e extends MutableLiveData<com.iqoption.core.microservices.popupserver.response.a> {
        final /* synthetic */ List dKJ;
        final /* synthetic */ c this$0;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "it", "apply"})
        /* compiled from: PopupViewModel.kt */
        /* renamed from: com.iqoption.popup.c$e$1 */
        static final class AnonymousClass1<T, R> implements g<T, R> {
            final /* synthetic */ e dKP;

            AnonymousClass1(e eVar) {
                this.dKP = eVar;
            }

            public final List<com.iqoption.core.microservices.popupserver.response.a> apply(List<com.iqoption.core.microservices.popupserver.response.a> list) {
                kotlin.jvm.internal.i.f(list, "it");
                Collection arrayList = new ArrayList();
                for (Object next : list) {
                    if (this.dKP.dKJ.contains(((com.iqoption.core.microservices.popupserver.response.a) next).agi())) {
                        arrayList.add(next);
                    }
                }
                return (List) arrayList;
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "popups", "", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "kotlin.jvm.PlatformType", "accept"})
        /* compiled from: PopupViewModel.kt */
        /* renamed from: com.iqoption.popup.c$e$2 */
        static final class AnonymousClass2<T> implements io.reactivex.b.f<List<? extends com.iqoption.core.microservices.popupserver.response.a>> {
            final /* synthetic */ e dKP;

            AnonymousClass2(e eVar) {
                this.dKP = eVar;
            }

            /* renamed from: v */
            public final void accept(List<com.iqoption.core.microservices.popupserver.response.a> list) {
                kotlin.jvm.internal.i.e(list, "popups");
                for (com.iqoption.core.microservices.popupserver.response.a postValue : list) {
                    this.dKP.postValue(postValue);
                }
            }
        }

        e(c cVar, List list) {
            this.this$0 = cVar;
            this.dKJ = list;
            cVar.aQm().g(new AnonymousClass1(this)).d(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new AnonymousClass2(this), (io.reactivex.b.f) AnonymousClass3.dKQ);
        }
    }

    public static final c A(FragmentActivity fragmentActivity) {
        return dKG.A(fragmentActivity);
    }

    private final io.reactivex.e<List<com.iqoption.core.microservices.popupserver.response.a>> aQm() {
        kotlin.d dVar = this.dKF;
        j jVar = anY[0];
        return (io.reactivex.e) dVar.getValue();
    }

    public final void m(com.iqoption.core.microservices.popupserver.response.a aVar) {
        a(this, aVar, null, 2, null);
    }

    public c() {
        io.reactivex.processors.a bmJ = PublishProcessor.bmK().bmJ();
        kotlin.jvm.internal.i.e(bmJ, "PublishProcessor.create<Popup>().toSerialized()");
        this.dKE = bmJ;
        this.dKF = g.c(new PopupViewModel$popupStream$2(this));
    }

    public final LiveData<com.iqoption.core.microservices.popupserver.response.a> a(PopupAnchor popupAnchor) {
        kotlin.jvm.internal.i.f(popupAnchor, "anchor");
        return bl(l.listOf(popupAnchor));
    }

    public final LiveData<com.iqoption.core.microservices.popupserver.response.a> bl(List<? extends PopupAnchor> list) {
        kotlin.jvm.internal.i.f(list, "anchors");
        return new e(this, list);
    }

    public final LiveData<com.iqoption.core.microservices.popupserver.response.a> a(PopupFormat popupFormat) {
        kotlin.jvm.internal.i.f(popupFormat, "formatName");
        return bm(l.listOf(popupFormat));
    }

    public final LiveData<com.iqoption.core.microservices.popupserver.response.a> bm(List<? extends PopupFormat> list) {
        kotlin.jvm.internal.i.f(list, "formatNames");
        return new d(this, list);
    }

    public final LiveData<com.iqoption.core.microservices.popupserver.response.a> a(PopupFormat popupFormat, PopupAnchor popupAnchor) {
        kotlin.jvm.internal.i.f(popupFormat, "format");
        kotlin.jvm.internal.i.f(popupAnchor, "anchor");
        return j(l.listOf(popupFormat), l.listOf(popupAnchor));
    }

    public final LiveData<com.iqoption.core.microservices.popupserver.response.a> j(List<? extends PopupFormat> list, List<? extends PopupAnchor> list2) {
        kotlin.jvm.internal.i.f(list, "formats");
        kotlin.jvm.internal.i.f(list2, "anchors");
        return new c(this, list, list2);
    }

    public final void a(Runnable runnable, com.iqoption.core.microservices.popupserver.response.a aVar) {
        kotlin.jvm.internal.i.f(runnable, "runnable");
        kotlin.jvm.internal.i.f(aVar, "popup");
        if (!n(aVar)) {
            this.dKE.onNext(aVar);
            this.dKD.a(new f(this, aVar, runnable), String.valueOf(aVar.getId().longValue()));
        }
    }

    public static /* synthetic */ void a(c cVar, com.iqoption.core.microservices.popupserver.response.a aVar, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = cVar.dKB;
        }
        cVar.a(aVar, str);
    }

    public final void a(com.iqoption.core.microservices.popupserver.response.a aVar, String str) {
        kotlin.jvm.internal.i.f(aVar, "popup");
        kotlin.jvm.internal.i.f(str, "event");
        o(aVar.getId().longValue(), str);
        this.dKD.jr(String.valueOf(aVar.getId().longValue()));
    }

    public final boolean n(com.iqoption.core.microservices.popupserver.response.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "popup");
        return this.dKD.js(String.valueOf(aVar.getId().longValue()));
    }

    public final void a(com.iqoption.core.microservices.popupserver.response.a aVar, int i, String str) {
        kotlin.jvm.internal.i.f(aVar, "popup");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("score", (Number) Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        jsonObject.addProperty("comment", str);
        this.aqB.e(com.iqoption.core.microservices.popupserver.a.bwG.a(aVar.getId().longValue(), this.dKC, jsonObject).b(com.iqoption.core.rx.i.aki()).a(io.reactivex.internal.a.a.aMp, this.aMn));
    }

    private final void bY(long j) {
        this.aqB.e(com.iqoption.core.microservices.popupserver.a.a(com.iqoption.core.microservices.popupserver.a.bwG, j, this.dKA, null, 4, null).b(com.iqoption.core.rx.i.aki()).a(io.reactivex.internal.a.a.aMp, this.aMn));
    }

    private final void o(long j, String str) {
        this.aqB.e(com.iqoption.core.microservices.popupserver.a.a(com.iqoption.core.microservices.popupserver.a.bwG, j, str, null, 4, null).b(com.iqoption.core.rx.i.aki()).a(io.reactivex.internal.a.a.aMp, this.aMn));
    }

    /* Access modifiers changed, original: protected */
    public void onCleared() {
        super.onCleared();
        this.aqB.clear();
        this.dKD.onStop();
    }

    public final boolean isShowing() {
        return this.dKD.isShowing();
    }

    public final void a(Runnable runnable, String str) {
        kotlin.jvm.internal.i.f(runnable, "runnable");
        kotlin.jvm.internal.i.f(str, "tag");
        this.dKD.a(runnable, str);
    }

    public final void a(Runnable runnable, String str, PopupPriority popupPriority) {
        kotlin.jvm.internal.i.f(runnable, "runnable");
        kotlin.jvm.internal.i.f(str, "tag");
        kotlin.jvm.internal.i.f(popupPriority, "priority");
        this.dKD.a(runnable, str, popupPriority);
    }

    public final void jr(String str) {
        kotlin.jvm.internal.i.f(str, "tag");
        this.dKD.jr(str);
    }

    public final boolean js(String str) {
        kotlin.jvm.internal.i.f(str, "tag");
        return this.dKD.js(str);
    }
}
