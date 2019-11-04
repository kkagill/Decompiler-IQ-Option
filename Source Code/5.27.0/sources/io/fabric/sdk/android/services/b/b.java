package io.fabric.sdk.android.services.b;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.j;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: EventsFilesManager */
public abstract class b<T> {
    protected final Context context;
    protected final a<T> eOk;
    protected final j eOl;
    protected final c eOm;
    private final int eOn;
    protected volatile long eOo;
    protected final List<d> eOp = new CopyOnWriteArrayList();

    /* compiled from: EventsFilesManager */
    static class a {
        final File file;
        final long timestamp;

        public a(File file, long j) {
            this.file = file;
            this.timestamp = j;
        }
    }

    public abstract String ex();

    /* Access modifiers changed, original: protected */
    public int ez() {
        return 8000;
    }

    public b(Context context, a<T> aVar, j jVar, c cVar, int i) {
        this.context = context.getApplicationContext();
        this.eOk = aVar;
        this.eOm = cVar;
        this.eOl = jVar;
        this.eOo = this.eOl.bjw();
        this.eOn = i;
    }

    public void cB(T t) {
        byte[] T = this.eOk.T(t);
        jr(T.length);
        this.eOm.W(T);
    }

    public void a(d dVar) {
        if (dVar != null) {
            this.eOp.add(dVar);
        }
    }

    public boolean er() {
        String str;
        boolean z = true;
        if (this.eOm.bkf()) {
            str = null;
            z = false;
        } else {
            str = ex();
            this.eOm.lw(str);
            CommonUtils.a(this.context, 4, "Fabric", String.format(Locale.US, "generated new file %s", new Object[]{str}));
            this.eOo = this.eOl.bjw();
        }
        lu(str);
        return z;
    }

    private void jr(int i) {
        if (!this.eOm.aZ(i, ez())) {
            CommonUtils.a(this.context, 4, "Fabric", String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[]{Integer.valueOf(this.eOm.bke()), Integer.valueOf(i), Integer.valueOf(ez())}));
            er();
        }
    }

    /* Access modifiers changed, original: protected */
    public int ey() {
        return this.eOn;
    }

    private void lu(String str) {
        for (d ai : this.eOp) {
            try {
                ai.ai(str);
            } catch (Exception e) {
                CommonUtils.a(this.context, "One of the roll over listeners threw an exception", e);
            }
        }
    }

    public List<File> bkb() {
        return this.eOm.js(1);
    }

    public void bN(List<File> list) {
        this.eOm.bO(list);
    }

    public void bkc() {
        c cVar = this.eOm;
        cVar.bO(cVar.bkg());
        this.eOm.bkh();
    }

    public void bkd() {
        List<File> bkg = this.eOm.bkg();
        int ey = ey();
        if (bkg.size() > ey) {
            int size = bkg.size() - ey;
            CommonUtils.K(this.context, String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[]{Integer.valueOf(bkg.size()), Integer.valueOf(ey), Integer.valueOf(size)}));
            TreeSet treeSet = new TreeSet(new Comparator<a>() {
                /* renamed from: a */
                public int compare(a aVar, a aVar2) {
                    return (int) (aVar.timestamp - aVar2.timestamp);
                }
            });
            for (File file : bkg) {
                treeSet.add(new a(file, lv(file.getName())));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((a) it.next()).file);
                if (arrayList.size() == size) {
                    break;
                }
            }
            this.eOm.bO(arrayList);
        }
    }

    public long lv(String str) {
        String[] split = str.split("_");
        if (split.length != 3) {
            return 0;
        }
        try {
            return Long.valueOf(split[2]).longValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
