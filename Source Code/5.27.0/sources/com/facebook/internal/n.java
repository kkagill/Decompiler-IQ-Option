package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import com.facebook.f;
import java.util.Locale;

/* compiled from: ImageRequest */
public class n {
    private Context context;
    private boolean zb;
    private Uri zf;
    private b zg;
    private Object zh;

    /* compiled from: ImageRequest */
    public static class a {
        private Context context;
        private boolean zb;
        private b zg;
        private Object zh;
        private Uri zi;

        public a(Context context, Uri uri) {
            aa.b((Object) uri, "imageUri");
            this.context = context;
            this.zi = uri;
        }

        public a a(b bVar) {
            this.zg = bVar;
            return this;
        }

        public a aa(Object obj) {
            this.zh = obj;
            return this;
        }

        public a F(boolean z) {
            this.zb = z;
            return this;
        }

        public n kn() {
            return new n(this);
        }
    }

    /* compiled from: ImageRequest */
    public interface b {
        void a(o oVar);
    }

    public static Uri a(String str, int i, int i2) {
        aa.H(str, "userId");
        i = Math.max(i, 0);
        i2 = Math.max(i2, 0);
        if (i == 0 && i2 == 0) {
            throw new IllegalArgumentException("Either width or height must be greater than 0");
        }
        Builder path = Uri.parse(x.kI()).buildUpon().path(String.format(Locale.US, "%s/%s/picture", new Object[]{f.gU(), str}));
        if (i2 != 0) {
            path.appendQueryParameter("height", String.valueOf(i2));
        }
        if (i != 0) {
            path.appendQueryParameter("width", String.valueOf(i));
        }
        path.appendQueryParameter("migration_overrides", "{october_2012:true}");
        return path.build();
    }

    private n(a aVar) {
        this.context = aVar.context;
        this.zf = aVar.zi;
        this.zg = aVar.zg;
        this.zb = aVar.zb;
        this.zh = aVar.zh == null ? new Object() : aVar.zh;
    }

    public Context getContext() {
        return this.context;
    }

    public Uri kj() {
        return this.zf;
    }

    public b kk() {
        return this.zg;
    }

    public boolean kl() {
        return this.zb;
    }

    public Object km() {
        return this.zh;
    }
}
