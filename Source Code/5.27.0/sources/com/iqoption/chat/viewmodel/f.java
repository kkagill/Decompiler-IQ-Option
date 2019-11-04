package com.iqoption.chat.viewmodel;

import android.os.Environment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.common.collect.Ordering;
import io.reactivex.p;
import io.reactivex.q;
import io.reactivex.s;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0004R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\rX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, bng = {"Lcom/iqoption/chat/viewmodel/FilePickerViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "currentFolder", "Ljava/io/File;", "kotlin.jvm.PlatformType", "fileItems", "Landroidx/lifecycle/LiveData;", "", "Lcom/iqoption/chat/viewmodel/FileItem;", "getFileItems", "()Landroidx/lifecycle/LiveData;", "fileItemsData", "Landroidx/lifecycle/MutableLiveData;", "isEmpty", "", "isEmptyData", "openFolderTask", "Lio/reactivex/disposables/Disposable;", "canGoUp", "goUp", "", "openFolder", "folder", "Companion", "chat_release"})
/* compiled from: FilePickerViewModel.kt */
public final class f extends ViewModel {
    private static final Ordering<File> ORDERING = Ordering.from((Comparator) b.aXb).compound((Comparator) Ordering.natural());
    private static final String TAG = f.class.getSimpleName();
    private static final File aWZ = Environment.getExternalStorageDirectory();
    public static final a aXa = new a();
    private File aWT = aWZ;
    private final MutableLiveData<List<e>> aWU;
    private final MutableLiveData<Boolean> aWV;
    private io.reactivex.disposables.b aWW;
    private final LiveData<List<e>> aWX;
    private final LiveData<Boolean> aWY;

    @i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n \u0006*\u0004\u0018\u00010\t0\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, bng = {"Lcom/iqoption/chat/viewmodel/FilePickerViewModel$Companion;", "", "()V", "ORDERING", "Lcom/google/common/collect/Ordering;", "Ljava/io/File;", "kotlin.jvm.PlatformType", "ROOT_FOLDER", "TAG", "", "getTAG", "()Ljava/lang/String;", "get", "Lcom/iqoption/chat/viewmodel/FilePickerViewModel;", "f", "Landroidx/fragment/app/Fragment;", "chat_release"})
    /* compiled from: FilePickerViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final f l(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "f");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(f.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(f)…kerViewModel::class.java]");
            return (f) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "f1", "Ljava/io/File;", "kotlin.jvm.PlatformType", "f2", "compare"})
    /* compiled from: FilePickerViewModel.kt */
    static final class b<T> implements Comparator<T> {
        public static final b aXb = new b();

        b() {
        }

        /* renamed from: a */
        public final int compare(File file, File file2) {
            kotlin.jvm.internal.i.e(file, "f1");
            String str = "f2";
            if (file.isDirectory()) {
                kotlin.jvm.internal.i.e(file2, str);
                if (!file2.isDirectory()) {
                    return -1;
                }
            }
            if (!file.isDirectory()) {
                kotlin.jvm.internal.i.e(file2, str);
                if (file2.isDirectory()) {
                    return 1;
                }
            }
            return 0;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012 \u0010\u0002\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "it", "Lio/reactivex/SingleEmitter;", "", "Lcom/iqoption/chat/viewmodel/FileItem;", "kotlin.jvm.PlatformType", "subscribe"})
    /* compiled from: FilePickerViewModel.kt */
    static final class c<T> implements s<T> {
        final /* synthetic */ File aXc;

        c(File file) {
            this.aXc = file;
        }

        public final void a(q<List<e>> qVar) {
            String str = "it";
            kotlin.jvm.internal.i.f(qVar, str);
            if (com.iqoption.core.ext.a.fP("android.permission.READ_EXTERNAL_STORAGE")) {
                File[] listFiles = this.aXc.listFiles();
                kotlin.jvm.internal.i.e(listFiles, "folder\n                 …             .listFiles()");
                Ordering Tr = f.ORDERING;
                kotlin.jvm.internal.i.e(Tr, "ORDERING");
                Iterable<File> c = i.c((Object[]) listFiles, (Comparator) Tr);
                Collection arrayList = new ArrayList(n.e(c, 10));
                for (File file : c) {
                    kotlin.jvm.internal.i.e(file, str);
                    arrayList.add(new e(file));
                }
                qVar.onSuccess((List) arrayList);
                return;
            }
            qVar.onError(new SecurityException("Permission android.permission.READ_EXTERNAL_STORAGE is denied"));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/chat/viewmodel/FileItem;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: FilePickerViewModel.kt */
    static final class d<T> implements io.reactivex.b.f<List<? extends e>> {
        final /* synthetic */ f aXd;

        d(f fVar) {
            this.aXd = fVar;
        }

        /* renamed from: v */
        public final void accept(List<e> list) {
            this.aXd.aWU.setValue(list);
            this.aXd.aWV.setValue(Boolean.valueOf(list.isEmpty()));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: FilePickerViewModel.kt */
    static final class e<T> implements io.reactivex.b.f<Throwable> {
        public static final e aXe = new e();

        e() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    public f() {
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(m.emptyList());
        this.aWU = mutableLiveData;
        mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(Boolean.valueOf(false));
        this.aWV = mutableLiveData;
        this.aWX = this.aWU;
        this.aWY = this.aWV;
    }

    public final LiveData<List<e>> Tn() {
        return this.aWX;
    }

    public final LiveData<Boolean> To() {
        return this.aWY;
    }

    public final boolean Tp() {
        File file = this.aWT;
        kotlin.jvm.internal.i.e(file, "currentFolder");
        String path = file.getPath();
        File file2 = aWZ;
        kotlin.jvm.internal.i.e(file2, "ROOT_FOLDER");
        return kotlin.jvm.internal.i.y(path, file2.getPath()) ^ 1;
    }

    public final void Tq() {
        File file = this.aWT;
        kotlin.jvm.internal.i.e(file, "currentFolder");
        file = file.getParentFile();
        kotlin.jvm.internal.i.e(file, "currentFolder.parentFile");
        r(file);
    }

    public static /* synthetic */ void a(f fVar, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            file = aWZ;
            kotlin.jvm.internal.i.e(file, "ROOT_FOLDER");
        }
        fVar.r(file);
    }

    public final void r(File file) {
        kotlin.jvm.internal.i.f(file, "folder");
        this.aWT = file;
        this.aWU.setValue(m.emptyList());
        this.aWV.setValue(Boolean.valueOf(false));
        io.reactivex.disposables.b bVar = this.aWW;
        if (bVar != null) {
            bVar.dispose();
        }
        this.aWW = p.a((s) new c(file)).g(com.iqoption.core.rx.i.akj()).h(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new d(this), (io.reactivex.b.f) e.aXe);
    }
}
