package androidx.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexClassLoader;
import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.zip.ZipFile;

public final class MultiDex {
    private static final String CODE_CACHE_NAME = "code_cache";
    private static final String CODE_CACHE_SECONDARY_FOLDER_NAME = "secondary-dexes";
    private static final boolean IS_VM_MULTIDEX_CAPABLE = isVMMultidexCapable(System.getProperty("java.vm.version"));
    private static final int MAX_SUPPORTED_SDK_VERSION = 20;
    private static final int MIN_SDK_VERSION = 4;
    private static final String NO_KEY_PREFIX = "";
    private static final String OLD_SECONDARY_FOLDER_NAME = "secondary-dexes";
    static final String TAG = "MultiDex";
    private static final int VM_WITH_MULTIDEX_VERSION_MAJOR = 2;
    private static final int VM_WITH_MULTIDEX_VERSION_MINOR = 1;
    private static final Set<File> installedApk = new HashSet();

    private static final class V14 {
        private static final int EXTRACTED_SUFFIX_LENGTH = 4;
        private final ElementConstructor elementConstructor;

        private interface ElementConstructor {
            Object newInstance(File file, DexFile dexFile);
        }

        private static class ICSElementConstructor implements ElementConstructor {
            private final Constructor<?> elementConstructor;

            ICSElementConstructor(Class<?> cls) {
                this.elementConstructor = cls.getConstructor(new Class[]{File.class, ZipFile.class, DexFile.class});
                this.elementConstructor.setAccessible(true);
            }

            public Object newInstance(File file, DexFile dexFile) {
                return this.elementConstructor.newInstance(new Object[]{file, new ZipFile(file), dexFile});
            }
        }

        private static class JBMR11ElementConstructor implements ElementConstructor {
            private final Constructor<?> elementConstructor;

            JBMR11ElementConstructor(Class<?> cls) {
                this.elementConstructor = cls.getConstructor(new Class[]{File.class, File.class, DexFile.class});
                this.elementConstructor.setAccessible(true);
            }

            public Object newInstance(File file, DexFile dexFile) {
                return this.elementConstructor.newInstance(new Object[]{file, file, dexFile});
            }
        }

        private static class JBMR2ElementConstructor implements ElementConstructor {
            private final Constructor<?> elementConstructor;

            JBMR2ElementConstructor(Class<?> cls) {
                this.elementConstructor = cls.getConstructor(new Class[]{File.class, Boolean.TYPE, File.class, DexFile.class});
                this.elementConstructor.setAccessible(true);
            }

            public Object newInstance(File file, DexFile dexFile) {
                return this.elementConstructor.newInstance(new Object[]{file, Boolean.FALSE, file, dexFile});
            }
        }

        static void install(ClassLoader classLoader, List<? extends File> list) {
            Object obj = MultiDex.findField(classLoader, "pathList").get(classLoader);
            Object[] makeDexElements = new V14().makeDexElements(list);
            try {
                MultiDex.expandFieldArray(obj, "dexElements", makeDexElements);
            } catch (NoSuchFieldException e) {
                Log.w(MultiDex.TAG, "Failed find field 'dexElements' attempting 'pathElements'", e);
                MultiDex.expandFieldArray(obj, "pathElements", makeDexElements);
            }
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* JADX WARNING: Failed to process nested try/catch */
        private V14() {
            /*
            r2 = this;
            r2.<init>();
            r0 = "dalvik.system.DexPathList$Element";
            r0 = java.lang.Class.forName(r0);
            r1 = new androidx.multidex.MultiDex$V14$ICSElementConstructor;	 Catch:{ NoSuchMethodException -> 0x000f }
            r1.<init>(r0);	 Catch:{ NoSuchMethodException -> 0x000f }
            goto L_0x001a;
        L_0x000f:
            r1 = new androidx.multidex.MultiDex$V14$JBMR11ElementConstructor;	 Catch:{ NoSuchMethodException -> 0x0015 }
            r1.<init>(r0);	 Catch:{ NoSuchMethodException -> 0x0015 }
            goto L_0x001a;
        L_0x0015:
            r1 = new androidx.multidex.MultiDex$V14$JBMR2ElementConstructor;
            r1.<init>(r0);
        L_0x001a:
            r2.elementConstructor = r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.multidex.MultiDex$V14.<init>():void");
        }

        private Object[] makeDexElements(List<? extends File> list) {
            Object[] objArr = new Object[list.size()];
            for (int i = 0; i < objArr.length; i++) {
                File file = (File) list.get(i);
                objArr[i] = this.elementConstructor.newInstance(file, DexFile.loadDex(file.getPath(), optimizedPathFor(file), 0));
            }
            return objArr;
        }

        private static String optimizedPathFor(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(name.substring(0, name.length() - EXTRACTED_SUFFIX_LENGTH));
            stringBuilder.append(".dex");
            return new File(parentFile, stringBuilder.toString()).getPath();
        }
    }

    private static final class V19 {
        private V19() {
        }

        static void install(ClassLoader classLoader, List<? extends File> list, File file) {
            Object obj = MultiDex.findField(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            MultiDex.expandFieldArray(obj, "dexElements", makeDexElements(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Object obj2;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Log.w(MultiDex.TAG, "Exception in makeDexElement", (IOException) it.next());
                }
                Field access$000 = MultiDex.findField(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr = (IOException[]) access$000.get(obj);
                if (iOExceptionArr == null) {
                    obj2 = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    Object obj3 = new IOException[(arrayList.size() + iOExceptionArr.length)];
                    arrayList.toArray(obj3);
                    System.arraycopy(iOExceptionArr, 0, obj3, arrayList.size(), iOExceptionArr.length);
                    obj2 = obj3;
                }
                access$000.set(obj, obj2);
                IOException iOException = new IOException("I/O exception during makeDexElement");
                iOException.initCause((Throwable) arrayList.get(0));
                throw iOException;
            }
        }

        private static Object[] makeDexElements(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
            return (Object[]) MultiDex.findMethod(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, new Object[]{arrayList, file, arrayList2});
        }
    }

    private static final class V4 {
        private V4() {
        }

        static void install(ClassLoader classLoader, List<? extends File> list) {
            int size = list.size();
            Field access$000 = MultiDex.findField(classLoader, "path");
            StringBuilder stringBuilder = new StringBuilder((String) access$000.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File file = (File) listIterator.next();
                String absolutePath = file.getAbsolutePath();
                stringBuilder.append(':');
                stringBuilder.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = file;
                zipFileArr[previousIndex] = new ZipFile(file);
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(absolutePath);
                stringBuilder2.append(".dex");
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, stringBuilder2.toString(), 0);
            }
            access$000.set(classLoader, stringBuilder.toString());
            MultiDex.expandFieldArray(classLoader, "mPaths", strArr);
            MultiDex.expandFieldArray(classLoader, "mFiles", fileArr);
            MultiDex.expandFieldArray(classLoader, "mZips", zipFileArr);
            MultiDex.expandFieldArray(classLoader, "mDexs", dexFileArr);
        }
    }

    private MultiDex() {
    }

    public static void install(Context context) {
        String str = TAG;
        Log.i(str, "Installing application");
        if (IS_VM_MULTIDEX_CAPABLE) {
            Log.i(str, "VM has multidex support, MultiDex support library is disabled.");
        } else if (VERSION.SDK_INT >= 4) {
            try {
                ApplicationInfo applicationInfo = getApplicationInfo(context);
                if (applicationInfo == null) {
                    Log.i(str, "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                    return;
                }
                doInstallation(context, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir), "secondary-dexes", "", true);
                Log.i(str, "install done");
            } catch (Exception e) {
                Log.e(str, "MultiDex installation failure", e);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("MultiDex installation failed (");
                stringBuilder.append(e.getMessage());
                stringBuilder.append(").");
                throw new RuntimeException(stringBuilder.toString());
            }
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("MultiDex installation failed. SDK ");
            stringBuilder2.append(VERSION.SDK_INT);
            stringBuilder2.append(" is unsupported. Min SDK version is ");
            stringBuilder2.append(4);
            stringBuilder2.append(".");
            throw new RuntimeException(stringBuilder2.toString());
        }
    }

    public static void installInstrumentation(Context context, Context context2) {
        String str = TAG;
        Log.i(str, "Installing instrumentation");
        if (IS_VM_MULTIDEX_CAPABLE) {
            Log.i(str, "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        String str2 = ".";
        if (VERSION.SDK_INT >= 4) {
            try {
                ApplicationInfo applicationInfo = getApplicationInfo(context);
                if (applicationInfo == null) {
                    Log.i(str, "No ApplicationInfo available for instrumentation, i.e. running on a test Context: MultiDex support library is disabled.");
                    return;
                }
                ApplicationInfo applicationInfo2 = getApplicationInfo(context2);
                if (applicationInfo2 == null) {
                    Log.i(str, "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(context.getPackageName());
                stringBuilder.append(str2);
                String stringBuilder2 = stringBuilder.toString();
                File file = new File(applicationInfo2.dataDir);
                File file2 = new File(applicationInfo.sourceDir);
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(stringBuilder2);
                stringBuilder3.append("secondary-dexes");
                doInstallation(context2, file2, file, stringBuilder3.toString(), stringBuilder2, false);
                doInstallation(context2, new File(applicationInfo2.sourceDir), file, "secondary-dexes", "", false);
                Log.i(str, "Installation done");
                return;
            } catch (Exception e) {
                Log.e(str, "MultiDex installation failure", e);
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append("MultiDex installation failed (");
                stringBuilder4.append(e.getMessage());
                stringBuilder4.append(").");
                throw new RuntimeException(stringBuilder4.toString());
            }
        }
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append("MultiDex installation failed. SDK ");
        stringBuilder5.append(VERSION.SDK_INT);
        stringBuilder5.append(" is unsupported. Min SDK version is ");
        stringBuilder5.append(4);
        stringBuilder5.append(str2);
        throw new RuntimeException(stringBuilder5.toString());
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x009d */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:39|40|41|42|43) */
    private static void doInstallation(android.content.Context r5, java.io.File r6, java.io.File r7, java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
        r0 = installedApk;
        monitor-enter(r0);
        r1 = installedApk;	 Catch:{ all -> 0x009e }
        r1 = r1.contains(r6);	 Catch:{ all -> 0x009e }
        if (r1 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r0);	 Catch:{ all -> 0x009e }
        return;
    L_0x000d:
        r1 = installedApk;	 Catch:{ all -> 0x009e }
        r1.add(r6);	 Catch:{ all -> 0x009e }
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x009e }
        r2 = 20;
        if (r1 <= r2) goto L_0x0055;
    L_0x0018:
        r1 = "MultiDex";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x009e }
        r3.<init>();	 Catch:{ all -> 0x009e }
        r4 = "MultiDex is not guaranteed to work in SDK version ";
        r3.append(r4);	 Catch:{ all -> 0x009e }
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x009e }
        r3.append(r4);	 Catch:{ all -> 0x009e }
        r4 = ": SDK version higher than ";
        r3.append(r4);	 Catch:{ all -> 0x009e }
        r3.append(r2);	 Catch:{ all -> 0x009e }
        r2 = " should be backed by ";
        r3.append(r2);	 Catch:{ all -> 0x009e }
        r2 = "runtime with built-in multidex capabilty but it's not the ";
        r3.append(r2);	 Catch:{ all -> 0x009e }
        r2 = "case here: java.vm.version=\"";
        r3.append(r2);	 Catch:{ all -> 0x009e }
        r2 = "java.vm.version";
        r2 = java.lang.System.getProperty(r2);	 Catch:{ all -> 0x009e }
        r3.append(r2);	 Catch:{ all -> 0x009e }
        r2 = "\"";
        r3.append(r2);	 Catch:{ all -> 0x009e }
        r2 = r3.toString();	 Catch:{ all -> 0x009e }
        android.util.Log.w(r1, r2);	 Catch:{ all -> 0x009e }
    L_0x0055:
        r1 = getDexClassloader(r5);	 Catch:{ all -> 0x009e }
        if (r1 != 0) goto L_0x005d;
    L_0x005b:
        monitor-exit(r0);	 Catch:{ all -> 0x009e }
        return;
    L_0x005d:
        clearOldDexDir(r5);	 Catch:{ Throwable -> 0x0061 }
        goto L_0x0069;
    L_0x0061:
        r2 = move-exception;
        r3 = "MultiDex";
        r4 = "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.";
        android.util.Log.w(r3, r4, r2);	 Catch:{ all -> 0x009e }
    L_0x0069:
        r7 = getDexDir(r5, r7, r8);	 Catch:{ all -> 0x009e }
        r8 = new androidx.multidex.MultiDexExtractor;	 Catch:{ all -> 0x009e }
        r8.<init>(r6, r7);	 Catch:{ all -> 0x009e }
        r6 = 0;
        r2 = 0;
        r2 = r8.load(r5, r9, r2);	 Catch:{ all -> 0x0099 }
        installSecondaryDexes(r1, r7, r2);	 Catch:{ IOException -> 0x007c }
        goto L_0x008e;
    L_0x007c:
        r2 = move-exception;
        if (r10 == 0) goto L_0x0098;
    L_0x007f:
        r10 = "MultiDex";
        r3 = "Failed to install extracted secondary dex files, retrying with forced extraction";
        android.util.Log.w(r10, r3, r2);	 Catch:{ all -> 0x0099 }
        r10 = 1;
        r5 = r8.load(r5, r9, r10);	 Catch:{ all -> 0x0099 }
        installSecondaryDexes(r1, r7, r5);	 Catch:{ all -> 0x0099 }
    L_0x008e:
        r8.close();	 Catch:{ IOException -> 0x0092 }
        goto L_0x0093;
    L_0x0092:
        r6 = move-exception;
    L_0x0093:
        if (r6 != 0) goto L_0x0097;
    L_0x0095:
        monitor-exit(r0);	 Catch:{ all -> 0x009e }
        return;
    L_0x0097:
        throw r6;	 Catch:{ all -> 0x009e }
    L_0x0098:
        throw r2;	 Catch:{ all -> 0x0099 }
    L_0x0099:
        r5 = move-exception;
        r8.close();	 Catch:{ IOException -> 0x009d }
    L_0x009d:
        throw r5;	 Catch:{ all -> 0x009e }
    L_0x009e:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x009e }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.multidex.MultiDex.doInstallation(android.content.Context, java.io.File, java.io.File, java.lang.String, java.lang.String, boolean):void");
    }

    private static ClassLoader getDexClassloader(Context context) {
        String str = TAG;
        try {
            ClassLoader classLoader = context.getClassLoader();
            if (VERSION.SDK_INT >= 14) {
                if (classLoader instanceof BaseDexClassLoader) {
                    return classLoader;
                }
            } else if ((classLoader instanceof DexClassLoader) || (classLoader instanceof PathClassLoader)) {
                return classLoader;
            }
            Log.e(str, "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
            return null;
        } catch (RuntimeException e) {
            Log.w(str, "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e);
            return null;
        }
    }

    private static ApplicationInfo getApplicationInfo(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException e) {
            Log.w(TAG, "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
            return null;
        }
    }

    static boolean isVMMultidexCapable(String str) {
        boolean z = false;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            String str2 = null;
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreTokens()) {
                str2 = stringTokenizer.nextToken();
            }
            if (!(nextToken == null || str2 == null)) {
                try {
                    int parseInt = Integer.parseInt(nextToken);
                    int parseInt2 = Integer.parseInt(str2);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VM with version ");
        stringBuilder.append(str);
        stringBuilder.append(z ? " has multidex support" : " does not have multidex support");
        Log.i(TAG, stringBuilder.toString());
        return z;
    }

    private static void installSecondaryDexes(ClassLoader classLoader, File file, List<? extends File> list) {
        if (!list.isEmpty()) {
            if (VERSION.SDK_INT >= 19) {
                V19.install(classLoader, list, file);
            } else if (VERSION.SDK_INT >= 14) {
                V14.install(classLoader, list);
            } else {
                V4.install(classLoader, list);
            }
        }
    }

    private static Field findField(Object obj, String str) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Field ");
        stringBuilder.append(str);
        stringBuilder.append(" not found in ");
        stringBuilder.append(obj.getClass());
        throw new NoSuchFieldException(stringBuilder.toString());
    }

    private static Method findMethod(Object obj, String str, Class<?>... clsArr) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Method ");
        stringBuilder.append(str);
        stringBuilder.append(" with parameters ");
        stringBuilder.append(Arrays.asList(clsArr));
        stringBuilder.append(" not found in ");
        stringBuilder.append(obj.getClass());
        throw new NoSuchMethodException(stringBuilder.toString());
    }

    private static void expandFieldArray(Object obj, String str, Object[] objArr) {
        Field findField = findField(obj, str);
        Object[] objArr2 = (Object[]) findField.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        findField.set(obj, objArr3);
    }

    private static void clearOldDexDir(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Clearing old secondary dex dir (");
            stringBuilder.append(file.getPath());
            String str = ").";
            stringBuilder.append(str);
            String stringBuilder2 = stringBuilder.toString();
            String str2 = TAG;
            Log.i(str2, stringBuilder2);
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to list secondary dex dir content (");
                stringBuilder.append(file.getPath());
                stringBuilder.append(str);
                Log.w(str2, stringBuilder.toString());
                return;
            }
            for (File file2 : listFiles) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Trying to delete old file ");
                stringBuilder3.append(file2.getPath());
                stringBuilder3.append(" of size ");
                stringBuilder3.append(file2.length());
                Log.i(str2, stringBuilder3.toString());
                if (file2.delete()) {
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Deleted old file ");
                    stringBuilder3.append(file2.getPath());
                    Log.i(str2, stringBuilder3.toString());
                } else {
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Failed to delete old file ");
                    stringBuilder3.append(file2.getPath());
                    Log.w(str2, stringBuilder3.toString());
                }
            }
            if (file.delete()) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Deleted old secondary dex dir ");
                stringBuilder.append(file.getPath());
                Log.i(str2, stringBuilder.toString());
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to delete secondary dex dir ");
                stringBuilder.append(file.getPath());
                Log.w(str2, stringBuilder.toString());
            }
        }
    }

    private static File getDexDir(Context context, File file, String str) {
        String str2 = CODE_CACHE_NAME;
        File file2 = new File(file, str2);
        try {
            mkdirChecked(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), str2);
            mkdirChecked(file2);
        }
        File file3 = new File(file2, str);
        mkdirChecked(file3);
        return file3;
    }

    private static void mkdirChecked(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            String str = "Failed to create dir ";
            String str2 = TAG;
            if (parentFile == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(file.getPath());
                stringBuilder.append(". Parent file is null.");
                Log.e(str2, stringBuilder.toString());
            } else {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str);
                stringBuilder2.append(file.getPath());
                stringBuilder2.append(". parent file is a dir ");
                stringBuilder2.append(parentFile.isDirectory());
                stringBuilder2.append(", a file ");
                stringBuilder2.append(parentFile.isFile());
                stringBuilder2.append(", exists ");
                stringBuilder2.append(parentFile.exists());
                stringBuilder2.append(", readable ");
                stringBuilder2.append(parentFile.canRead());
                stringBuilder2.append(", writable ");
                stringBuilder2.append(parentFile.canWrite());
                Log.e(str2, stringBuilder2.toString());
            }
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Failed to create directory ");
            stringBuilder3.append(file.getPath());
            throw new IOException(stringBuilder3.toString());
        }
    }
}
