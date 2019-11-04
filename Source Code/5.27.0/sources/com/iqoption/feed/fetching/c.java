package com.iqoption.feed.fetching;

import android.content.Context;
import com.a.a.a;
import com.iqoption.core.d;
import com.iqoption.core.util.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import kotlin.i;
import kotlin.jvm.a.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\b\u0018\u00010\u0010R\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0011\u001a\u00020\u0005J\"\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, bng = {"Lcom/iqoption/feed/fetching/CacheWrapper;", "", "context", "Landroid/content/Context;", "cacheDir", "", "cacheSize", "", "(Landroid/content/Context;Ljava/lang/String;J)V", "cache", "Lcom/jakewharton/disklrucache/DiskLruCache;", "locker", "Lcom/iqoption/feed/fetching/DiskCacheWriteLocker;", "ensureCache", "", "get", "Lcom/jakewharton/disklrucache/DiskLruCache$Snapshot;", "key", "streamToRead", "Ljava/io/FileInputStream;", "write", "writer", "Lkotlin/Function1;", "Ljava/io/OutputStream;", "", "feed_release"})
/* compiled from: CacheWrapper.kt */
public final class c {
    private volatile a cRT;
    private final d cRU = new d();
    private final String cRV;
    private final long cacheSize;
    private final Context context;

    public c(Context context, String str, long j) {
        kotlin.jvm.internal.i.f(context, "context");
        kotlin.jvm.internal.i.f(str, "cacheDir");
        this.context = context;
        this.cRV = str;
        this.cacheSize = j;
    }

    public final void e(String str, b<? super OutputStream, Boolean> bVar) {
        kotlin.jvm.internal.i.f(str, "key");
        kotlin.jvm.internal.i.f(bVar, "writer");
        awt();
        this.cRU.id(str);
        a.a ko;
        OutputStream hX;
        try {
            a aVar = this.cRT;
            ko = aVar != null ? aVar.ko(str) : null;
            if (ko != null) {
                hX = ko.hX(0);
                kotlin.jvm.internal.i.e(hX, "os");
                if (((Boolean) bVar.invoke(hX)).booleanValue()) {
                    ko.commit();
                }
                l.b(hX);
                ko.abortUnlessCommitted();
            }
            this.cRU.ie(str);
        } catch (Throwable th) {
            this.cRU.ie(str);
        }
    }

    public final FileInputStream ib(String str) {
        kotlin.jvm.internal.i.f(str, "key");
        com.a.a.a.c ic = ic(str);
        return (FileInputStream) (ic != null ? ic.ia(0) : null);
    }

    private final com.a.a.a.c ic(String str) {
        awt();
        a aVar = this.cRT;
        return aVar != null ? aVar.ic(str) : null;
    }

    private final void awt() {
        if (this.cRT == null) {
            synchronized (this) {
                if (this.cRT == null) {
                    this.cRT = a.a(new File(this.context.getCacheDir(), this.cRV), d.Un().getVersionCode(), 1, this.cacheSize);
                }
                kotlin.l lVar = kotlin.l.eVB;
            }
        }
    }
}
