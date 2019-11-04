package com.iqoption.core.data.a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;
import kotlin.text.d;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/core/data/filestore/FolderFileStore;", "Lcom/iqoption/core/data/filestore/FileStore;", "folder", "Ljava/io/File;", "(Ljava/io/File;)V", "clear", "", "file", "key", "", "getKeys", "", "getReader", "Ljava/io/Reader;", "getText", "remove", "save", "reader", "contents", "Companion", "core_release"})
/* compiled from: FolderFileStore.kt */
public final class c implements a {
    private static final String TAG = c.class.getSimpleName();
    @Deprecated
    public static final a bcH = new a();
    private final File folder;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"Lcom/iqoption/core/data/filestore/FolderFileStore$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "core_release"})
    /* compiled from: FolderFileStore.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public c(File file) {
        kotlin.jvm.internal.i.f(file, "folder");
        this.folder = file;
        if (!this.folder.exists() && !this.folder.mkdirs()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not create directory: ");
            stringBuilder.append(this.folder);
            throw new FileNotFoundException(stringBuilder.toString());
        }
    }

    private final File fI(String str) {
        return new File(this.folder, str);
    }

    public List<String> getKeys() {
        File[] listFiles = this.folder.listFiles();
        kotlin.jvm.internal.i.e(listFiles, "folder.listFiles()");
        Collection arrayList = new ArrayList(listFiles.length);
        for (Object obj : listFiles) {
            kotlin.jvm.internal.i.e(obj, "it");
            arrayList.add(obj.getName());
        }
        return (List) arrayList;
    }

    public String r(String str) {
        kotlin.jvm.internal.i.f(str, "key");
        try {
            File fI = fI(str);
            if (!fI.exists()) {
                fI = null;
            }
            return fI != null ? e.a(fI, null, 1, null) : null;
        } catch (IOException unused) {
            return null;
        }
    }

    public Reader fG(String str) {
        kotlin.jvm.internal.i.f(str, "key");
        InputStreamReader inputStreamReader = null;
        try {
            File fI = fI(str);
            if (!fI.exists()) {
                fI = null;
            }
            if (fI != null) {
                inputStreamReader = new InputStreamReader(new FileInputStream(fI), d.UTF_8);
            }
        } catch (IOException unused) {
        }
        return inputStreamReader;
    }

    public void ae(String str, String str2) {
        kotlin.jvm.internal.i.f(str, "key");
        kotlin.jvm.internal.i.f(str2, "contents");
        try {
            e.a(fI(str), str2, null, 2, null);
        } catch (IOException unused) {
        }
    }

    public void remove(String str) {
        kotlin.jvm.internal.i.f(str, "key");
        fI(str).delete();
    }

    public void clear() {
        File[] listFiles = this.folder.listFiles();
        kotlin.jvm.internal.i.e(listFiles, "folder.listFiles()");
        for (File delete : listFiles) {
            delete.delete();
        }
    }
}
