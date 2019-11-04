package io.fabric.sdk.android;

import android.content.Context;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.b;
import io.fabric.sdk.android.services.concurrency.i;
import java.io.File;
import java.util.Collection;

/* compiled from: Kit */
public abstract class h<Result> implements Comparable<h> {
    Context context;
    g<Result> eMA = new g(this);
    final b eMB = ((b) getClass().getAnnotation(b.class));
    f<Result> eMi;
    c eMz;
    IdManager pj;

    public abstract Result ec();

    /* Access modifiers changed, original: protected */
    public boolean ee() {
        return true;
    }

    public abstract String getIdentifier();

    public abstract String getVersion();

    /* Access modifiers changed, original: protected */
    public void onCancelled(Result result) {
    }

    /* Access modifiers changed, original: protected */
    public void onPostExecute(Result result) {
    }

    /* Access modifiers changed, original: 0000 */
    public void a(Context context, c cVar, f<Result> fVar, IdManager idManager) {
        this.eMz = cVar;
        this.context = new d(context, getIdentifier(), getPath());
        this.eMi = fVar;
        this.pj = idManager;
    }

    /* Access modifiers changed, original: final */
    public final void initialize() {
        this.eMA.a(this.eMz.biW(), (Void) null);
    }

    /* Access modifiers changed, original: protected */
    public IdManager bje() {
        return this.pj;
    }

    public Context getContext() {
        return this.context;
    }

    public c bjf() {
        return this.eMz;
    }

    public String getPath() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(".Fabric");
        stringBuilder.append(File.separator);
        stringBuilder.append(getIdentifier());
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public int compareTo(h hVar) {
        if (b(hVar)) {
            return 1;
        }
        if (hVar.b(this)) {
            return -1;
        }
        if (bjg() && !hVar.bjg()) {
            return 1;
        }
        if (bjg() || !hVar.bjg()) {
            return 0;
        }
        return -1;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean b(h hVar) {
        if (bjg()) {
            for (Class isAssignableFrom : this.eMB.value()) {
                if (isAssignableFrom.isAssignableFrom(hVar.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bjg() {
        return this.eMB != null;
    }

    /* Access modifiers changed, original: protected */
    public Collection<i> bjh() {
        return this.eMA.bjh();
    }
}
