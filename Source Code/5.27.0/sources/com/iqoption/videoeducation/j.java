package com.iqoption.videoeducation;

import androidx.annotation.MainThread;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.analytics.q;
import com.iqoption.core.d;
import com.iqoption.x.R;
import io.reactivex.b.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0007J\b\u0010\u001d\u001a\u00020\u001cH\u0007J\b\u0010\u001e\u001a\u00020\u001cH\u0014J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u0010H\u0007J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#H\u0007J\b\u0010$\u001a\u00020\u001cH\u0007J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'H\u0007R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\r\u0010\bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\bR\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\nX\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0005\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\bR\u001f\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0005\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\bR\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, bng = {"Lcom/iqoption/videoeducation/VideoEducationViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "catalogItems", "Landroidx/lifecycle/LiveData;", "", "Lcom/iqoption/videoeducation/VideoCatalogAdapterItem;", "getCatalogItems", "()Landroidx/lifecycle/LiveData;", "catalogItemsData", "Landroidx/lifecycle/MutableLiveData;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "isSearchShown", "", "openedCatalog", "Lcom/iqoption/videoeducation/model/VideoCatalog;", "getOpenedCatalog", "openedCatalogData", "tagItems", "Lcom/iqoption/videoeducation/VideoTagItem;", "getTagItems", "videoItems", "Lcom/iqoption/videoeducation/VideoAdapterItem;", "getVideoItems", "videosHelper", "Lcom/iqoption/videoeducation/VideosHelper;", "closeCatalog", "", "hideSearch", "onCleared", "openCatalog", "catalog", "setTextQuery", "constraint", "", "startSearch", "toggleTag", "tag", "Lcom/iqoption/core/microservices/videoeducation/response/Tag;", "Companion", "app_optionXRelease"})
/* compiled from: VideoEducationViewModel.kt */
public final class j extends ViewModel {
    private static final String TAG = j.class.getSimpleName();
    public static final a ecL = new a();
    private final io.reactivex.disposables.a bJT = new io.reactivex.disposables.a();
    private final MutableLiveData<List<d>> ecI = new MutableLiveData();
    private final MutableLiveData<com.iqoption.videoeducation.c.a> ecJ = new MutableLiveData();
    private o ecK;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, bng = {"Lcom/iqoption/videoeducation/VideoEducationViewModel$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "get", "Lcom/iqoption/videoeducation/VideoEducationViewModel;", "a", "Landroidx/fragment/app/FragmentActivity;", "app_optionXRelease"})
    /* compiled from: VideoEducationViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final j I(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "a");
            Factory factory = (Factory) null;
            ViewModelProvider of = ViewModelProviders.of(fragmentActivity);
            kotlin.jvm.internal.i.e(of, "ViewModelProviders.of(a)");
            ViewModel viewModel = of.get(j.class);
            kotlin.jvm.internal.i.e(viewModel, "if (factory != null) {\n …f(a)\n    }[T::class.java]");
            return (j) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "catalogs", "", "Lcom/iqoption/videoeducation/model/VideoCatalog;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: VideoEducationViewModel.kt */
    /* renamed from: com.iqoption.videoeducation.j$1 */
    static final class AnonymousClass1<T> implements f<List<? extends com.iqoption.videoeducation.c.a>> {
        final /* synthetic */ j ecM;

        AnonymousClass1(j jVar) {
            this.ecM = jVar;
        }

        /* renamed from: v */
        public final void accept(List<com.iqoption.videoeducation.c.a> list) {
            MutableLiveData a = this.ecM.ecI;
            kotlin.jvm.internal.i.e(list, "catalogs");
            Collection arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                String str = null;
                if (!it.hasNext()) {
                    break;
                }
                Object obj;
                com.iqoption.videoeducation.c.a aVar = (com.iqoption.videoeducation.c.a) it.next();
                if (aVar.aXm().isEmpty()) {
                    obj = null;
                } else {
                    String stringBuilder;
                    String On = aVar.aXE().On();
                    String ajl = aVar.aXE().ajl();
                    int aXC = aVar.aXC();
                    if (aXC > 0) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(aXC);
                        stringBuilder2.append(' ');
                        stringBuilder2.append(d.getString(R.string.video));
                        stringBuilder = stringBuilder2.toString();
                    } else {
                        stringBuilder = null;
                    }
                    aXC = aVar.aXD();
                    if (aXC > 0) {
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(aXC);
                        stringBuilder3.append(' ');
                        stringBuilder3.append(d.b(R.plurals.new_video, aXC, new Object[0]));
                        str = stringBuilder3.toString();
                    }
                    f fVar = new f(aVar, ajl, On, stringBuilder, str);
                }
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            Object obj2 = (List) arrayList;
            if ((((Collection) obj2).isEmpty() ^ 1) == 0) {
                obj2 = null;
            }
            if (obj2 == null) {
                obj2 = l.listOf(new e());
            }
            a.postValue(obj2);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: VideoEducationViewModel.kt */
    /* renamed from: com.iqoption.videoeducation.j$2 */
    static final class AnonymousClass2<T> implements f<Throwable> {
        final /* synthetic */ j ecM;

        AnonymousClass2(j jVar) {
            this.ecM = jVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.ecM.ecI.postValue(l.listOf(new e()));
        }
    }

    public static final j I(FragmentActivity fragmentActivity) {
        return ecL.I(fragmentActivity);
    }

    public j() {
        this.ecI.setValue(l.listOf(new g()));
        this.bJT.e(i.ecx.aXk().d(com.iqoption.core.rx.i.aki()).a((f) new AnonymousClass1(this), (f) new AnonymousClass2(this)));
    }

    public final LiveData<List<d>> aXo() {
        return this.ecI;
    }

    public final LiveData<com.iqoption.videoeducation.c.a> aXp() {
        return this.ecJ;
    }

    public final LiveData<Boolean> aAz() {
        o oVar = this.ecK;
        return oVar != null ? oVar.aAz() : null;
    }

    public final LiveData<List<c>> aXq() {
        o oVar = this.ecK;
        return oVar != null ? oVar.aXq() : null;
    }

    public final LiveData<List<n>> aXr() {
        o oVar = this.ecK;
        return oVar != null ? oVar.aXr() : null;
    }

    /* Access modifiers changed, original: protected */
    public void onCleared() {
        super.onCleared();
        this.bJT.clear();
    }

    @MainThread
    public final void a(com.iqoption.videoeducation.c.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "catalog");
        this.ecJ.setValue(aVar);
        this.ecK = new o(aVar.aXE().getId());
        q.O(aVar.aXE().getId());
    }

    @MainThread
    public final void aXs() {
        this.ecJ.setValue(null);
        o oVar = this.ecK;
        if (oVar != null) {
            oVar.dispose();
        }
        this.ecK = (o) null;
        q.CC();
    }

    @MainThread
    public final void Qr() {
        o oVar = this.ecK;
        if (oVar != null) {
            oVar.aXx();
        }
    }

    @MainThread
    public final void aXt() {
        o oVar = this.ecK;
        if (oVar != null) {
            oVar.aXt();
        }
    }

    @MainThread
    public final void P(CharSequence charSequence) {
        kotlin.jvm.internal.i.f(charSequence, "constraint");
        o oVar = this.ecK;
        if (oVar != null) {
            oVar.A(charSequence);
        }
    }

    @MainThread
    public final void a(com.iqoption.core.microservices.videoeducation.response.f fVar) {
        kotlin.jvm.internal.i.f(fVar, "tag");
        o oVar = this.ecK;
        if (oVar != null) {
            oVar.a(fVar);
        }
    }
}
