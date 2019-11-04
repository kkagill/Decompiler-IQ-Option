package com.iqoption.view.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.base.Suppliers;
import com.google.common.base.n;
import com.iqoption.app.IQApp;
import com.iqoption.util.s;
import com.iqoption.x.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: RemoteAnimations */
public final class d {
    private static final n<d> dne = Suppliers.a(-$$Lambda$d$Wp-_OgabpF7KheSjHSUwkFC6hvk.INSTANCE);
    private final ExecutorService cRG = Executors.newCachedThreadPool();
    private final Context context;
    private volatile a ehi;
    private Map<String, b> ehj = new ConcurrentHashMap();
    private File ehk;
    private List<b> iV;

    /* compiled from: RemoteAnimations */
    private static final class a {
        c ehl;
        String name;

        private a() {
        }

        /* synthetic */ a(RemoteAnimations$1 remoteAnimations$1) {
            this();
        }

        /* Access modifiers changed, original: 0000 */
        public void a(String str, c cVar) {
            this.name = str;
            this.ehl = cVar;
        }
    }

    /* compiled from: RemoteAnimations */
    private final class b implements Runnable {
        private volatile boolean cancelled;
        private b ehm;

        b(b bVar) {
            this.ehm = bVar;
        }

        /* Access modifiers changed, original: 0000 */
        public void cancel() {
            this.cancelled = true;
        }

        public void run() {
            try {
                if (!(d.this.ehi == null || d.this.ehi.ehl == null)) {
                    d.this.ehi.ehl.recycle();
                    d.this.ehi.ehl = null;
                }
                Resources resources = IQApp.Eu().getResources();
                c cVar = new c(this.ehm.ehf);
                int i = 0;
                while (!cVar.isCompleted() && !cVar.isRecycled()) {
                    Bitmap hN = hN(i);
                    if (hN != null) {
                        cVar.addFrame(new BitmapDrawable(resources, hN), this.ehm.ehg);
                    } else {
                        cVar.recycle();
                    }
                    i++;
                    if (this.cancelled && !cVar.isRecycled()) {
                        cVar.recycle();
                    }
                }
                if (!this.cancelled) {
                    if (d.this.ehi == null) {
                        d.this.ehi = new a();
                    }
                    d.this.ehi.a(this.ehm.name, cVar);
                }
            } catch (Throwable th) {
                d.this.ehj.remove(this.ehm.name);
            }
            d.this.ehj.remove(this.ehm.name);
        }

        @Nullable
        private Bitmap hN(int i) {
            String fz = com.iqoption.core.d.EE().fz(this.ehm.frames[i]);
            File file = new File(new File(d.this.ehk, this.ehm.name), String.valueOf(fz.hashCode()));
            Bitmap jW = file.exists() ? jW(file.getPath()) : null;
            if (jW == null) {
                jW = jX(fz);
                if (jW != null) {
                    a(file, jW);
                }
            }
            return jW;
        }

        private void a(@NonNull File file, @NonNull Bitmap bitmap) {
            File parentFile = file.getParentFile();
            if (parentFile.exists() || parentFile.mkdirs()) {
                try {
                    bitmap.compress(CompressFormat.PNG, 100, new FileOutputStream(file));
                } catch (FileNotFoundException unused) {
                }
            }
        }

        private Bitmap jW(@NonNull String str) {
            Bitmap bitmap = null;
            int i = 0;
            while (bitmap == null && i < 3) {
                bitmap = BitmapFactory.decodeFile(str);
                i++;
            }
            return bitmap;
        }

        private Bitmap jX(@NonNull String str) {
            Bitmap bitmap = null;
            int i = 0;
            while (bitmap == null && i < 3) {
                try {
                    bitmap = BitmapFactory.decodeStream(new URL(str).openStream());
                } catch (IOException unused) {
                }
                i++;
            }
            return bitmap;
        }
    }

    public static void init() {
        aYA().aYB();
    }

    public static void jT(@Nullable String str) {
        d aYA = aYA();
        if (str == null) {
            str = "CRYPTO";
        }
        aYA.jU(str);
    }

    private static d aYA() {
        return (d) dne.get();
    }

    private d(Context context) {
        this.context = context;
    }

    private void aYB() {
        this.cRG.submit(new -$$Lambda$d$elnq3zJFtYgjWwtN-B9W6qkjM0k(this));
    }

    private /* synthetic */ void aYC() {
        if (this.iV == null) {
            synchronized (d.class) {
                this.iV = (List) s.a(this.context, R.raw.remote_animations, new RemoteAnimations$1(this).getType());
            }
        }
    }

    private boolean isInitialized() {
        return this.iV != null;
    }

    private void jU(@NonNull String str) {
        if (isInitialized()) {
            b jV = jV(str);
            if (jV != null && !this.ehj.containsKey(jV.name)) {
                if (this.ehj.size() >= 3) {
                    for (b cancel : this.ehj.values()) {
                        cancel.cancel();
                    }
                    this.ehj.clear();
                }
                if (this.ehk == null) {
                    this.ehk = new File(this.context.getFilesDir(), "remote_anim");
                }
                if (this.ehk.exists() || this.ehk.mkdirs()) {
                    b bVar = new b(jV);
                    this.cRG.submit(bVar);
                    this.ehj.put(jV.name, bVar);
                }
            }
        }
    }

    @Nullable
    private b jV(@NonNull String str) {
        for (b bVar : this.iV) {
            if (str.equalsIgnoreCase(bVar.name)) {
                return bVar;
            }
        }
        return null;
    }
}
