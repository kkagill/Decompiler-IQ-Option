package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.JsonReader;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.c.t;
import com.airbnb.lottie.d.h;
import com.airbnb.lottie.network.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: LottieCompositionFactory */
public class f {
    private static final Map<String, n<e>> dC = new HashMap();

    public static n<e> c(final Context context, final String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("url_");
        stringBuilder.append(str);
        return a(stringBuilder.toString(), new Callable<m<e>>() {
            /* renamed from: ar */
            public m<e> call() {
                return b.f(context, str);
            }
        });
    }

    public static n<e> d(Context context, final String str) {
        context = context.getApplicationContext();
        return a(str, new Callable<m<e>>() {
            /* renamed from: ar */
            public m<e> call() {
                return f.e(context, str);
            }
        });
    }

    @WorkerThread
    public static m<e> e(Context context, String str) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("asset_");
            stringBuilder.append(str);
            String stringBuilder2 = stringBuilder.toString();
            if (str.endsWith(".zip")) {
                return a(new ZipInputStream(context.getAssets().open(str)), stringBuilder2);
            }
            return b(context.getAssets().open(str), stringBuilder2);
        } catch (IOException e) {
            return new m(e);
        }
    }

    public static n<e> a(Context context, @RawRes final int i) {
        context = context.getApplicationContext();
        return a(v(i), new Callable<m<e>>() {
            /* renamed from: ar */
            public m<e> call() {
                return f.b(context, i);
            }
        });
    }

    @WorkerThread
    public static m<e> b(Context context, @RawRes int i) {
        try {
            return b(context.getResources().openRawResource(i), v(i));
        } catch (NotFoundException e) {
            return new m(e);
        }
    }

    private static String v(@RawRes int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("rawRes_");
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    public static n<e> a(final InputStream inputStream, @Nullable final String str) {
        return a(str, new Callable<m<e>>() {
            /* renamed from: ar */
            public m<e> call() {
                return f.b(inputStream, str);
            }
        });
    }

    @WorkerThread
    public static m<e> b(InputStream inputStream, @Nullable String str) {
        return a(inputStream, str, true);
    }

    @WorkerThread
    private static m<e> a(InputStream inputStream, @Nullable String str, boolean z) {
        try {
            m<e> c = c(new JsonReader(new InputStreamReader(inputStream)), str);
            return c;
        } finally {
            if (z) {
                h.closeQuietly(inputStream);
            }
        }
    }

    public static n<e> b(final JsonReader jsonReader, @Nullable final String str) {
        return a(str, new Callable<m<e>>() {
            /* renamed from: ar */
            public m<e> call() {
                return f.c(jsonReader, str);
            }
        });
    }

    @WorkerThread
    public static m<e> c(JsonReader jsonReader, @Nullable String str) {
        return a(jsonReader, str, true);
    }

    private static m<e> a(JsonReader jsonReader, @Nullable String str, boolean z) {
        try {
            Object d = t.d(jsonReader);
            com.airbnb.lottie.model.f.bm().a(str, d);
            m mVar = new m(d);
            if (z) {
                h.closeQuietly(jsonReader);
            }
            return mVar;
        } catch (Exception e) {
            m mVar2 = new m(e);
            if (z) {
                h.closeQuietly(jsonReader);
            }
            return mVar2;
        } catch (Throwable e2) {
            if (z) {
                h.closeQuietly(jsonReader);
            }
            throw e2;
        }
    }

    @WorkerThread
    public static m<e> a(ZipInputStream zipInputStream, @Nullable String str) {
        try {
            m<e> b = b(zipInputStream, str);
            return b;
        } finally {
            h.closeQuietly(zipInputStream);
        }
    }

    @WorkerThread
    private static m<e> b(ZipInputStream zipInputStream, @Nullable String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            Object obj = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (name.contains(".json")) {
                    obj = (e) a(new JsonReader(new InputStreamReader(zipInputStream)), null, false).getValue();
                } else {
                    if (!name.contains(".png")) {
                        if (!name.contains(".webp")) {
                            zipInputStream.closeEntry();
                        }
                    }
                    String[] split = name.split("/");
                    hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (obj == null) {
                return new m(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Entry entry : hashMap.entrySet()) {
                h a = a((e) obj, (String) entry.getKey());
                if (a != null) {
                    a.setBitmap(h.a((Bitmap) entry.getValue(), a.getWidth(), a.getHeight()));
                }
            }
            for (Entry entry2 : obj.ao().entrySet()) {
                if (((h) entry2.getValue()).getBitmap() == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("There is no image for ");
                    stringBuilder.append(((h) entry2.getValue()).getFileName());
                    return new m(new IllegalStateException(stringBuilder.toString()));
                }
            }
            com.airbnb.lottie.model.f.bm().a(str, obj);
            return new m(obj);
        } catch (IOException e) {
            return new m(e);
        }
    }

    @Nullable
    private static h a(e eVar, String str) {
        for (h hVar : eVar.ao().values()) {
            if (hVar.getFileName().equals(str)) {
                return hVar;
            }
        }
        return null;
    }

    private static n<e> a(@Nullable final String str, Callable<m<e>> callable) {
        final e z = str == null ? null : com.airbnb.lottie.model.f.bm().z(str);
        if (z != null) {
            return new n(new Callable<m<e>>() {
                /* renamed from: ar */
                public m<e> call() {
                    return new m(z);
                }
            });
        }
        if (str != null && dC.containsKey(str)) {
            return (n) dC.get(str);
        }
        n nVar = new n(callable);
        nVar.a(new i<e>() {
            /* renamed from: a */
            public void onResult(e eVar) {
                if (str != null) {
                    com.airbnb.lottie.model.f.bm().a(str, eVar);
                }
                f.dC.remove(str);
            }
        });
        nVar.c(new i<Throwable>() {
            /* renamed from: a */
            public void onResult(Throwable th) {
                f.dC.remove(str);
            }
        });
        dC.put(str, nVar);
        return nVar;
    }
}
