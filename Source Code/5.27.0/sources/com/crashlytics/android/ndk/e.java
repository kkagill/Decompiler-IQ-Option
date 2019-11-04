package com.crashlytics.android.ndk;

import io.fabric.sdk.android.services.c.a;
import io.fabric.sdk.android.services.common.t;
import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

/* compiled from: NdkCrashFilesManager */
class e implements b {
    private static final FileFilter sp = new FileFilter() {
        public boolean accept(File file) {
            return file.isDirectory();
        }
    };
    private final a oa;

    public e(a aVar) {
        this.oa = aVar;
    }

    private File gd() {
        return new File(this.oa.getFilesDir(), "native");
    }

    public File ga() {
        File gd = gd();
        if (!gd.isDirectory() && !gd.mkdir()) {
            return null;
        }
        File file = new File(gd, Long.toString(new t().bjw()));
        if (!file.mkdir()) {
            file = null;
        }
        return file;
    }

    private static TreeSet<File> m(File file) {
        if (file == null || !file.isDirectory()) {
            return new TreeSet();
        }
        File[] listFiles = file.listFiles(sp);
        TreeSet treeSet = new TreeSet(new Comparator<File>() {
            /* renamed from: a */
            public int compare(File file, File file2) {
                return file2.getName().compareTo(file.getName());
            }
        });
        treeSet.addAll(Arrays.asList(listFiles));
        return treeSet;
    }

    public TreeSet<File> gb() {
        return m(gd());
    }
}
