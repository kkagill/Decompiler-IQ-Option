package com.airbnb.lottie.a.a;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.graphics.Path.Op;
import android.os.Build.VERSION;
import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.model.content.MergePaths.MergePathsMode;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi(19)
/* compiled from: MergePathsContent */
public class l implements j, m {
    private final Path fJ = new Path();
    private final Path fK = new Path();
    private final MergePaths fL;
    private final Path fb = new Path();
    private final List<m> fr = new ArrayList();
    private final String name;

    /* compiled from: MergePathsContent */
    /* renamed from: com.airbnb.lottie.a.a.l$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] fM = new int[MergePathsMode.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Missing block: B:13:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.values();
            r0 = r0.length;
            r0 = new int[r0];
            fM = r0;
            r0 = fM;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.MERGE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = fM;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.ADD;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = fM;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.SUBTRACT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = fM;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.INTERSECT;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = fM;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.a.a.l$AnonymousClass1.<clinit>():void");
        }
    }

    public l(MergePaths mergePaths) {
        if (VERSION.SDK_INT >= 19) {
            this.name = mergePaths.getName();
            this.fL = mergePaths;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    public void a(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVar = (c) listIterator.previous();
            if (cVar instanceof m) {
                this.fr.add((m) cVar);
                listIterator.remove();
            }
        }
    }

    public void a(List<c> list, List<c> list2) {
        for (int i = 0; i < this.fr.size(); i++) {
            ((m) this.fr.get(i)).a(list, list2);
        }
    }

    public Path getPath() {
        this.fb.reset();
        if (this.fL.isHidden()) {
            return this.fb;
        }
        int i = AnonymousClass1.fM[this.fL.bQ().ordinal()];
        if (i == 1) {
            aH();
        } else if (i == 2) {
            a(Op.UNION);
        } else if (i == 3) {
            a(Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            a(Op.INTERSECT);
        } else if (i == 5) {
            a(Op.XOR);
        }
        return this.fb;
    }

    public String getName() {
        return this.name;
    }

    private void aH() {
        for (int i = 0; i < this.fr.size(); i++) {
            this.fb.addPath(((m) this.fr.get(i)).getPath());
        }
    }

    @TargetApi(19)
    private void a(Op op) {
        this.fK.reset();
        this.fJ.reset();
        for (int size = this.fr.size() - 1; size >= 1; size--) {
            m mVar = (m) this.fr.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                List aC = dVar.aC();
                for (int size2 = aC.size() - 1; size2 >= 0; size2--) {
                    Path path = ((m) aC.get(size2)).getPath();
                    path.transform(dVar.aD());
                    this.fK.addPath(path);
                }
            } else {
                this.fK.addPath(mVar.getPath());
            }
        }
        int i = 0;
        m mVar2 = (m) this.fr.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List aC2 = dVar2.aC();
            while (i < aC2.size()) {
                Path path2 = ((m) aC2.get(i)).getPath();
                path2.transform(dVar2.aD());
                this.fJ.addPath(path2);
                i++;
            }
        } else {
            this.fJ.set(mVar2.getPath());
        }
        this.fb.op(this.fJ, this.fK, op);
    }
}
