package com.iqoption.chat.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import io.reactivex.b.f;
import io.reactivex.b.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0006R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\nX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00048F¢\u0006\u0006\u001a\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\nX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\b¨\u0006\u0018"}, bng = {"Lcom/iqoption/chat/viewmodel/AttachmentPickerViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "previews", "Landroidx/lifecycle/LiveData;", "", "Lcom/iqoption/chat/viewmodel/AttachmentPreview;", "getPreviews", "()Landroidx/lifecycle/LiveData;", "previewsData", "Landroidx/lifecycle/MutableLiveData;", "selectEvent", "Lcom/iqoption/chat/viewmodel/SelectEvent;", "getSelectEvent", "selectEventData", "selectedCount", "", "getSelectedCount", "loadPreviews", "", "setup", "toggle", "preview", "Companion", "chat_release"})
/* compiled from: AttachmentPickerViewModel.kt */
public final class a extends com.iqoption.core.ui.f.d {
    private static final String TAG = a.class.getSimpleName();
    private static final kotlin.d aWy = g.c(AttachmentPickerViewModel$Companion$instance$2.aWA);
    public static final a aWz = new a();
    private final MutableLiveData<List<b>> aWw;
    private final MutableLiveData<n> aWx;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, bng = {"Lcom/iqoption/chat/viewmodel/AttachmentPickerViewModel$Companion;", "", "()V", "SELECTED_MAX", "", "TAG", "", "kotlin.jvm.PlatformType", "instance", "Lcom/iqoption/chat/viewmodel/AttachmentPickerViewModel;", "getInstance", "()Lcom/iqoption/chat/viewmodel/AttachmentPickerViewModel;", "instance$delegate", "Lkotlin/Lazy;", "get", "chat_release"})
    /* compiled from: AttachmentPickerViewModel.kt */
    public static final class a {
        static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "instance", "getInstance()Lcom/iqoption/chat/viewmodel/AttachmentPickerViewModel;"))};

        private final a Tf() {
            kotlin.d Te = a.aWy;
            a aVar = a.aWz;
            j jVar = anY[0];
            return (a) Te.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final a Tg() {
            return Tf();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/chat/viewmodel/AttachmentPreview;", "it", "Ljava/io/File;", "apply"})
    /* compiled from: AttachmentPickerViewModel.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b aWB = new b();

        b() {
        }

        public final List<b> apply(List<? extends File> list) {
            kotlin.jvm.internal.i.f(list, "it");
            Iterable<File> g = u.g(list, 10);
            Collection arrayList = new ArrayList(n.e(g, 10));
            for (File bVar : g) {
                arrayList.add(new b(bVar));
            }
            return (List) arrayList;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/chat/viewmodel/AttachmentPreview;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: AttachmentPickerViewModel.kt */
    static final class c<T> implements f<List<? extends b>> {
        final /* synthetic */ a aWC;

        c(a aVar) {
            this.aWC = aVar;
        }

        /* renamed from: v */
        public final void accept(List<b> list) {
            this.aWC.aWw.postValue(list);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: AttachmentPickerViewModel.kt */
    static final class d<T> implements f<Throwable> {
        public static final d aWD = new d();

        d() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    private a() {
        this.aWw = new MutableLiveData();
        this.aWx = new MutableLiveData();
    }

    public /* synthetic */ a(f fVar) {
        this();
    }

    public final void setup() {
        o.aYQ.clear();
    }

    public final LiveData<List<b>> Ta() {
        return this.aWw;
    }

    public final LiveData<Integer> Tb() {
        return o.aYQ.TX();
    }

    public final LiveData<n> Tc() {
        return this.aWx;
    }

    public final void i(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "preview");
        bVar.setSelected(bVar.isSelected() ^ 1);
        this.aWx.setValue(new n(bVar, 0, 2, null));
    }

    public final void Td() {
        com.iqoption.chat.g.aOn.QS().t(b.aWB).g(com.iqoption.core.rx.i.akj()).h(com.iqoption.core.rx.i.aki()).a((f) new c(this), (f) d.aWD);
    }
}
