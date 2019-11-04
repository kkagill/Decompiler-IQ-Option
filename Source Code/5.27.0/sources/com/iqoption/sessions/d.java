package com.iqoption.sessions;

import android.os.Build.VERSION;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.common.primitives.Longs;
import com.iqoption.config.Platform;
import com.iqoption.mobbtech.connect.RequestManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0014J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0002J \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, bng = {"Lcom/iqoption/sessions/ActiveSessionsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "disposables", "", "Lio/reactivex/disposables/Disposable;", "sessionsDataSource", "Lcom/iqoption/core/microservices/auth/response/Session;", "getSessionsDataSource", "()Ljava/util/List;", "getActiveSessions", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/core/ui/Resource;", "Ljava/lang/Void;", "onCleared", "", "parseUserAgentString", "", "uaParser", "Lua_parser/Parser;", "platform", "Lcom/iqoption/config/Platform;", "ua", "terminateSessions", "", "Companion", "app_optionXRelease"})
/* compiled from: ActiveSessionsViewModel.kt */
public final class d extends ViewModel {
    public static final a dSW = new a();
    private final List<io.reactivex.disposables.b> dSU = new ArrayList();
    private final List<com.iqoption.core.microservices.auth.response.g> dSV = new ArrayList();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/sessions/ActiveSessionsViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/sessions/ActiveSessionsViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "app_optionXRelease"})
    /* compiled from: ActiveSessionsViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final d D(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(d.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ac…onsViewModel::class.java)");
            return (d) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/auth/response/Session;", "sessionsResponse", "Lcom/iqoption/core/microservices/auth/response/SessionsResponse;", "apply"})
    /* compiled from: ActiveSessionsViewModel.kt */
    static final class b<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ d dSX;

        b(d dVar) {
            this.dSX = dVar;
        }

        /* renamed from: a */
        public final List<com.iqoption.core.microservices.auth.response.g> apply(com.iqoption.core.microservices.auth.response.i iVar) {
            kotlin.jvm.internal.i.f(iVar, "sessionsResponse");
            List<com.iqoption.core.microservices.auth.response.g> arrayList = new ArrayList();
            arrayList.addAll(iVar.Zp());
            String str = "";
            if (VERSION.SDK_INT > 19) {
                try {
                    d.f fVar = new d.f();
                    for (com.iqoption.core.microservices.auth.response.g gVar : arrayList) {
                        gVar.gf(this.dSX.a(fVar, gVar.Zn().Dx(), gVar.Zn().hu()));
                    }
                } catch (Throwable unused) {
                    for (com.iqoption.core.microservices.auth.response.g gf : arrayList) {
                        gf.gf(str);
                    }
                }
            } else {
                for (com.iqoption.core.microservices.auth.response.g gf2 : arrayList) {
                    gf2.gf(str);
                }
            }
            RequestManager aOR = RequestManager.aOR();
            kotlin.jvm.internal.i.e(aOR, "RequestManager.getInstance()");
            final String aOU = aOR.aOU();
            q.a(arrayList, new Comparator<com.iqoption.core.microservices.auth.response.g>() {
                /* renamed from: a */
                public final int compare(com.iqoption.core.microservices.auth.response.g gVar, com.iqoption.core.microservices.auth.response.g gVar2) {
                    boolean y = kotlin.jvm.internal.i.y(aOU, gVar.getId());
                    boolean y2 = kotlin.jvm.internal.i.y(aOU, gVar2.getId());
                    if (y) {
                        return -1;
                    }
                    if (y2) {
                        return 1;
                    }
                    return -Longs.compare(gVar.Zn().ki(), gVar2.Zn().ki());
                }
            });
            return arrayList;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/auth/response/Session;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ActiveSessionsViewModel.kt */
    static final class c<T> implements io.reactivex.b.f<List<com.iqoption.core.microservices.auth.response.g>> {
        final /* synthetic */ MutableLiveData $liveData;
        final /* synthetic */ d dSX;

        c(d dVar, MutableLiveData mutableLiveData) {
            this.dSX = dVar;
            this.$liveData = mutableLiveData;
        }

        /* renamed from: v */
        public final void accept(List<com.iqoption.core.microservices.auth.response.g> list) {
            this.dSX.aTQ().clear();
            List aTQ = this.dSX.aTQ();
            kotlin.jvm.internal.i.e(list, "it");
            aTQ.addAll(list);
            this.$liveData.postValue(com.iqoption.core.ui.d.a.a(com.iqoption.core.ui.d.bHb, null, 1, null));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ActiveSessionsViewModel.kt */
    static final class d<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ MutableLiveData $liveData;

        d(MutableLiveData mutableLiveData) {
            this.$liveData = mutableLiveData;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.$liveData.postValue(com.iqoption.core.ui.d.a.a(com.iqoption.core.ui.d.bHb, th, th.getMessage(), null, 4, null));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "", "it", "Lcom/iqoption/core/microservices/auth/response/SessionsResponse;", "apply"})
    /* compiled from: ActiveSessionsViewModel.kt */
    static final class e<T, R> implements io.reactivex.b.g<T, R> {
        public static final e dSZ = new e();

        e() {
        }

        /* renamed from: a */
        public final List<String> apply(com.iqoption.core.microservices.auth.response.i iVar) {
            kotlin.jvm.internal.i.f(iVar, "it");
            Iterable<com.iqoption.core.microservices.auth.response.g> Zp = iVar.Zp();
            Collection arrayList = new ArrayList(n.e(Zp, 10));
            for (com.iqoption.core.microservices.auth.response.g id : Zp) {
                arrayList.add(id.getId());
            }
            return (List) arrayList;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "sessions", "", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ActiveSessionsViewModel.kt */
    static final class f<T> implements io.reactivex.b.f<List<? extends String>> {
        final /* synthetic */ MutableLiveData $liveData;
        final /* synthetic */ d dSX;

        f(d dVar, MutableLiveData mutableLiveData) {
            this.dSX = dVar;
            this.$liveData = mutableLiveData;
        }

        /* renamed from: v */
        public final void accept(List<String> list) {
            List aTQ = this.dSX.aTQ();
            Collection arrayList = new ArrayList();
            for (Object next : this.dSX.aTQ()) {
                if (list.contains(((com.iqoption.core.microservices.auth.response.g) next).getId())) {
                    arrayList.add(next);
                }
            }
            aTQ.removeAll((List) arrayList);
            this.$liveData.postValue(com.iqoption.core.ui.d.a.a(com.iqoption.core.ui.d.bHb, null, 1, null));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: ActiveSessionsViewModel.kt */
    static final class g<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ MutableLiveData $liveData;

        g(MutableLiveData mutableLiveData) {
            this.$liveData = mutableLiveData;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.$liveData.postValue(com.iqoption.core.ui.d.a.a(com.iqoption.core.ui.d.bHb, th, th.getMessage(), null, 4, null));
        }
    }

    public final List<com.iqoption.core.microservices.auth.response.g> aTQ() {
        return this.dSV;
    }

    public final LiveData<com.iqoption.core.ui.d<Void>> aTR() {
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.postValue(com.iqoption.core.ui.d.a.b(com.iqoption.core.ui.d.bHb, null, 1, null));
        io.reactivex.disposables.b a = com.iqoption.core.microservices.auth.a.blA.Ze().t(new b(this)).g(com.iqoption.core.rx.i.akj()).h(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new c(this, mutableLiveData), (io.reactivex.b.f) new d(mutableLiveData));
        kotlin.jvm.internal.i.e(a, "AuthRequests.\n          …sage))\n                })");
        this.dSU.add(a);
        return mutableLiveData;
    }

    public final LiveData<com.iqoption.core.ui.d<Void>> bs(List<com.iqoption.core.microservices.auth.response.g> list) {
        kotlin.jvm.internal.i.f(list, "terminateSessions");
        Iterable<com.iqoption.core.microservices.auth.response.g> iterable = list;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (com.iqoption.core.microservices.auth.response.g id : iterable) {
            arrayList.add(id.getId());
        }
        List list2 = (List) arrayList;
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.postValue(com.iqoption.core.ui.d.a.b(com.iqoption.core.ui.d.bHb, null, 1, null));
        io.reactivex.disposables.b a = com.iqoption.core.microservices.auth.a.blA.az(list2).t(e.dSZ).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new f(this, mutableLiveData), (io.reactivex.b.f) new g(mutableLiveData));
        kotlin.jvm.internal.i.e(a, "AuthRequests.terminateSe…sage))\n                })");
        this.dSU.add(a);
        return mutableLiveData;
    }

    /* Access modifiers changed, original: protected */
    public void onCleared() {
        for (io.reactivex.disposables.b dispose : this.dSU) {
            dispose.dispose();
        }
        this.dSU.clear();
        super.onCleared();
    }

    private final String a(d.f fVar, Platform platform, String str) {
        d.a od = fVar.od(str);
        String str2 = ")";
        String str3 = " (";
        String str4 = ".";
        String str5 = " ";
        StringBuilder stringBuilder;
        if (platform == Platform.WEB_HODLY || platform == Platform.WEB_MOBILE || platform == Platform.WEB || platform == Platform.WEB_WALLET) {
            if (od.fNa.fNf == null || od.fNa.fNg == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(od.fMZ.hn);
                stringBuilder.append(str5);
                stringBuilder.append(od.fMZ.fNf);
                stringBuilder.append(str4);
                stringBuilder.append(od.fMZ.fNg);
                return stringBuilder.toString();
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(od.fMZ.hn);
            stringBuilder.append(str5);
            stringBuilder.append(od.fMZ.fNf);
            stringBuilder.append(str4);
            stringBuilder.append(od.fMZ.fNg);
            stringBuilder.append(str3);
            stringBuilder.append(od.fNa.hn);
            stringBuilder.append(str5);
            stringBuilder.append(od.fNa.fNf);
            stringBuilder.append(str4);
            stringBuilder.append(od.fNa.fNg);
            stringBuilder.append(str2);
            return stringBuilder.toString();
        } else if (od.fNa.fNf == null || od.fNa.fNg == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(od.fNb.hn);
            stringBuilder.append(str3);
            stringBuilder.append(od.fNa.hn);
            stringBuilder.append(str2);
            return stringBuilder.toString();
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(od.fNb.hn);
            stringBuilder.append(str3);
            stringBuilder.append(od.fNa.hn);
            stringBuilder.append(str5);
            stringBuilder.append(od.fNa.fNf);
            stringBuilder.append(str4);
            stringBuilder.append(od.fNa.fNg);
            stringBuilder.append(str2);
            return stringBuilder.toString();
        }
    }
}
