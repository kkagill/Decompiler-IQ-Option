package com.iqoption.chat;

import android.os.Environment;
import io.reactivex.p;
import io.reactivex.q;
import io.reactivex.s;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.i;
import kotlin.text.Regex;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/chat/StorageRepository;", "", "()V", "IMG_FILTER", "Ljava/io/FileFilter;", "IMG_REX_EX", "Lkotlin/text/Regex;", "collect", "", "Ljava/io/File;", "dir", "filter", "getImageFiles", "Lio/reactivex/Single;", "chat_release"})
/* compiled from: StorageRepository.kt */
public final class g {
    private static final Regex aOl = new Regex(".+\\.(jpg|JPG|JPEG|png|PNG)");
    private static final FileFilter aOm = a.aOo;
    public static final g aOn = new g();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Ljava/io/File;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: StorageRepository.kt */
    static final class a implements FileFilter {
        public static final a aOo = new a();

        a() {
        }

        public final boolean accept(File file) {
            kotlin.jvm.internal.i.e(file, "it");
            String name = file.getName();
            kotlin.jvm.internal.i.e(name, "it.name");
            return g.aOl.L(name);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012 \u0010\u0002\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "it", "Lio/reactivex/SingleEmitter;", "", "Ljava/io/File;", "kotlin.jvm.PlatformType", "subscribe"})
    /* compiled from: StorageRepository.kt */
    static final class b<T> implements s<T> {
        public static final b aOp = new b();

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"})
        /* compiled from: Comparisons.kt */
        public static final class a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return b.c(Long.valueOf(((File) t2).lastModified()), Long.valueOf(((File) t).lastModified()));
            }
        }

        b() {
        }

        public final void a(q<List<File>> qVar) {
            kotlin.jvm.internal.i.f(qVar, "it");
            if (com.iqoption.core.ext.a.fP("android.permission.READ_EXTERNAL_STORAGE")) {
                g gVar = g.aOn;
                File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                kotlin.jvm.internal.i.e(externalStoragePublicDirectory, "getExternalStoragePublicDirectory(DIRECTORY_DCIM)");
                List a = gVar.a(externalStoragePublicDirectory, g.aOm);
                g gVar2 = g.aOn;
                File externalStoragePublicDirectory2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                kotlin.jvm.internal.i.e(externalStoragePublicDirectory2, "getExternalStoragePublic…ctory(DIRECTORY_PICTURES)");
                List a2 = gVar2.a(externalStoragePublicDirectory2, g.aOm);
                g gVar3 = g.aOn;
                File externalStoragePublicDirectory3 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                kotlin.jvm.internal.i.e(externalStoragePublicDirectory3, "getExternalStoragePublic…tory(DIRECTORY_DOWNLOADS)");
                qVar.onSuccess(u.a((Iterable) u.b((Collection) u.b((Collection) a, (Iterable) a2), (Iterable) gVar3.a(externalStoragePublicDirectory3, g.aOm)), (Comparator) new a()));
                return;
            }
            qVar.onError(new SecurityException("Requires android.permission.READ_EXTERNAL_STORAGE permission"));
        }
    }

    private g() {
    }

    public final p<List<File>> QS() {
        p a = p.a((s) b.aOp);
        kotlin.jvm.internal.i.e(a, "Single.create {\n        …e\n            }\n        }");
        return a;
    }

    private final List<File> a(File file, FileFilter fileFilter) {
        List arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (Object obj : listFiles) {
                kotlin.jvm.internal.i.e(obj, "file");
                if (obj.isDirectory() && !obj.isHidden()) {
                    arrayList.addAll(aOn.a(obj, fileFilter));
                } else if (fileFilter.accept(obj)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }
}
