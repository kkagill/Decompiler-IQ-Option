package com.iqoption.vip;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.analytics.r;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.e.aat;
import com.iqoption.e.aav;
import com.iqoption.x.R;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0019\u001a\u001b\u001cB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0016R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, bng = {"Lcom/iqoption/vip/VipEducationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "vipManager", "Lcom/iqoption/microservice/vip/VipManager;", "(Lcom/iqoption/microservice/vip/VipManager;)V", "categorySessionsMap", "", "", "", "Lcom/iqoption/vip/VipEducationAdapter$ItemWrapper;", "items", "", "getItemCount", "", "getItemId", "position", "getItemViewType", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "EducationItemViewHolder", "EducationSessionItemViewHolder", "ItemWrapper", "app_optionXRelease"})
/* compiled from: VipEducationAdapter.kt */
public final class h extends Adapter<ViewHolder> {
    public static final a ejI = new a();
    private final com.iqoption.microservice.vip.d ejE;
    private final Map<Long, List<d>> ejH = new LinkedHashMap();
    private final List<d> iA = new ArrayList();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/vip/VipEducationAdapter$Companion;", "", "()V", "VIEW_TYPE_CATEGORY", "", "VIEW_TYPE_SESSION", "app_optionXRelease"})
    /* compiled from: VipEducationAdapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001d"}, bng = {"Lcom/iqoption/vip/VipEducationAdapter$ItemWrapper;", "", "viewType", "", "sessionBg", "category", "Lcom/iqoption/microservice/vip/TrainingSessionCategory;", "session", "Lcom/iqoption/microservice/vip/TrainingSession;", "(IILcom/iqoption/microservice/vip/TrainingSessionCategory;Lcom/iqoption/microservice/vip/TrainingSession;)V", "getCategory", "()Lcom/iqoption/microservice/vip/TrainingSessionCategory;", "getSession", "()Lcom/iqoption/microservice/vip/TrainingSession;", "getSessionBg", "()I", "getViewType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "app_optionXRelease"})
    /* compiled from: VipEducationAdapter.kt */
    public static final class d {
        public static final a ejT = new a();
        private final int cWK;
        private final int ejQ;
        private final com.iqoption.microservice.vip.c ejR;
        private final com.iqoption.microservice.vip.b ejS;

        @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, bng = {"Lcom/iqoption/vip/VipEducationAdapter$ItemWrapper$Companion;", "", "()V", "fromCategory", "Lcom/iqoption/vip/VipEducationAdapter$ItemWrapper;", "category", "Lcom/iqoption/microservice/vip/TrainingSessionCategory;", "fromSession", "session", "Lcom/iqoption/microservice/vip/TrainingSession;", "bgResource", "", "app_optionXRelease"})
        /* compiled from: VipEducationAdapter.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(f fVar) {
                this();
            }

            public final d b(com.iqoption.microservice.vip.b bVar, int i) {
                kotlin.jvm.internal.i.f(bVar, "session");
                return new d(2, i, null, bVar);
            }

            public final d a(com.iqoption.microservice.vip.c cVar) {
                kotlin.jvm.internal.i.f(cVar, "category");
                return new d(1, 0, cVar, null);
            }
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    if ((this.cWK == dVar.cWK ? 1 : null) != null) {
                        if (!((this.ejQ == dVar.ejQ ? 1 : null) != null && kotlin.jvm.internal.i.y(this.ejR, dVar.ejR) && kotlin.jvm.internal.i.y(this.ejS, dVar.ejS))) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = ((this.cWK * 31) + this.ejQ) * 31;
            com.iqoption.microservice.vip.c cVar = this.ejR;
            int i2 = 0;
            i = (i + (cVar != null ? cVar.hashCode() : 0)) * 31;
            com.iqoption.microservice.vip.b bVar = this.ejS;
            if (bVar != null) {
                i2 = bVar.hashCode();
            }
            return i + i2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ItemWrapper(viewType=");
            stringBuilder.append(this.cWK);
            stringBuilder.append(", sessionBg=");
            stringBuilder.append(this.ejQ);
            stringBuilder.append(", category=");
            stringBuilder.append(this.ejR);
            stringBuilder.append(", session=");
            stringBuilder.append(this.ejS);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public d(int i, int i2, com.iqoption.microservice.vip.c cVar, com.iqoption.microservice.vip.b bVar) {
            this.cWK = i;
            this.ejQ = i2;
            this.ejR = cVar;
            this.ejS = bVar;
        }

        public final int aZk() {
            return this.ejQ;
        }

        public final com.iqoption.microservice.vip.c aZl() {
            return this.ejR;
        }

        public final com.iqoption.microservice.vip.b aZm() {
            return this.ejS;
        }

        public final int asd() {
            return this.cWK;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u001e\u0010\u0012\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, bng = {"Lcom/iqoption/vip/VipEducationAdapter$EducationItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/iqoption/databinding/VipEducationItemViewBinding;", "adapter", "Lcom/iqoption/vip/VipEducationAdapter;", "(Lcom/iqoption/databinding/VipEducationItemViewBinding;Lcom/iqoption/vip/VipEducationAdapter;)V", "getAdapter", "()Lcom/iqoption/vip/VipEducationAdapter;", "getBinding", "()Lcom/iqoption/databinding/VipEducationItemViewBinding;", "bind", "", "trainingCategory", "Lcom/iqoption/microservice/vip/TrainingSessionCategory;", "sessions", "", "Lcom/iqoption/vip/VipEducationAdapter$ItemWrapper;", "handleOpenClose", "app_optionXRelease"})
    /* compiled from: VipEducationAdapter.kt */
    public static final class b extends ViewHolder {
        private final aat ejJ;
        private final h ejK;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
        /* compiled from: VipEducationAdapter.kt */
        static final class a implements OnClickListener {
            final /* synthetic */ List dST;
            final /* synthetic */ b ejL;
            final /* synthetic */ com.iqoption.microservice.vip.c ejM;

            a(b bVar, com.iqoption.microservice.vip.c cVar, List list) {
                this.ejL = bVar;
                this.ejM = cVar;
                this.dST = list;
            }

            public final void onClick(View view) {
                r.aqZ.R(this.ejM.getId());
                this.ejL.a(this.dST, this.ejM);
            }
        }

        public b(aat aat, h hVar) {
            kotlin.jvm.internal.i.f(aat, "binding");
            kotlin.jvm.internal.i.f(hVar, "adapter");
            super(aat.getRoot());
            this.ejJ = aat;
            this.ejK = hVar;
        }

        public final void a(com.iqoption.microservice.vip.c cVar, List<d> list) {
            kotlin.jvm.internal.i.f(cVar, "trainingCategory");
            kotlin.jvm.internal.i.f(list, "sessions");
            TextView textView = this.ejJ.alH;
            kotlin.jvm.internal.i.e(textView, "binding.title");
            textView.setText(cVar.getTitle());
            textView = this.ejJ.aRu;
            kotlin.jvm.internal.i.e(textView, "binding.subtitle");
            View view = this.itemView;
            String str = "itemView";
            kotlin.jvm.internal.i.e(view, str);
            textView.setText(view.getResources().getQuantityString(R.plurals.sessions, list.size(), new Object[]{Integer.valueOf(list.size())}));
            boolean containsAll = this.ejK.iA.containsAll(list);
            ImageView imageView = this.ejJ.cuR;
            kotlin.jvm.internal.i.e(imageView, "binding.downIcon");
            imageView.setRotation(containsAll ? 180.0f : 0.0f);
            this.ejJ.getRoot().setBackgroundResource(containsAll ? R.drawable.vip_education_item_bg_top : R.drawable.vip_education_item_bg);
            this.ejJ.cuR.setOnClickListener(new a(this, cVar, list));
            View view2 = this.itemView;
            kotlin.jvm.internal.i.e(view2, str);
            Picasso.with(view2.getContext()).load(cVar.aOB()).into(this.ejJ.cuQ);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x007e A:{LOOP_END, LOOP:0: B:4:0x0050->B:16:0x007e} */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0082 A:{SYNTHETIC, EDGE_INSN: B:25:0x0082->B:18:0x0082 ?: BREAK  } */
        private final void a(java.util.List<com.iqoption.vip.h.d> r10, com.iqoption.microservice.vip.c r11) {
            /*
            r9 = this;
            r0 = r9.ejK;
            r0 = r0.iA;
            r10 = (java.util.Collection) r10;
            r0 = r0.containsAll(r10);
            r1 = 50;
            if (r0 == 0) goto L_0x002f;
        L_0x0010:
            r11 = r9.ejJ;
            r11 = r11.cuR;
            r11 = r11.animate();
            r0 = 0;
            r11 = r11.rotation(r0);
            r11 = r11.setDuration(r1);
            r11.start();
            r11 = r9.ejK;
            r11 = r11.iA;
            r11.removeAll(r10);
            goto L_0x00a3;
        L_0x002f:
            r0 = r9.ejJ;
            r0 = r0.cuR;
            r0 = r0.animate();
            r3 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;
            r0 = r0.rotation(r3);
            r0 = r0.setDuration(r1);
            r0.start();
            r0 = r9.ejK;
            r0 = r0.iA;
            r0 = r0.iterator();
            r1 = 0;
            r2 = 0;
        L_0x0050:
            r3 = r0.hasNext();
            r4 = 1;
            if (r3 == 0) goto L_0x0081;
        L_0x0057:
            r3 = r0.next();
            r3 = (com.iqoption.vip.h.d) r3;
            r5 = r3.asd();
            if (r5 != r4) goto L_0x007a;
        L_0x0063:
            r3 = r3.aZl();
            if (r3 != 0) goto L_0x006c;
        L_0x0069:
            kotlin.jvm.internal.i.bnJ();
        L_0x006c:
            r5 = r3.getId();
            r7 = r11.getId();
            r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
            if (r3 != 0) goto L_0x007a;
        L_0x0078:
            r3 = 1;
            goto L_0x007b;
        L_0x007a:
            r3 = 0;
        L_0x007b:
            if (r3 == 0) goto L_0x007e;
        L_0x007d:
            goto L_0x0082;
        L_0x007e:
            r2 = r2 + 1;
            goto L_0x0050;
        L_0x0081:
            r2 = -1;
        L_0x0082:
            r11 = r9.ejK;
            r11 = r11.iA;
            r11 = r11.size();
            r11 = r11 - r4;
            if (r2 >= r11) goto L_0x009a;
        L_0x008f:
            r11 = r9.ejK;
            r11 = r11.iA;
            r2 = r2 + r4;
            r11.addAll(r2, r10);
            goto L_0x00a3;
        L_0x009a:
            r11 = r9.ejK;
            r11 = r11.iA;
            r11.addAll(r10);
        L_0x00a3:
            r10 = r9.ejK;
            r10.notifyDataSetChanged();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.vip.h$b.a(java.util.List, com.iqoption.microservice.vip.c):void");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, bng = {"Lcom/iqoption/vip/VipEducationAdapter$EducationSessionItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/iqoption/databinding/VipEducationSessionItemBinding;", "(Lcom/iqoption/databinding/VipEducationSessionItemBinding;)V", "getBinding", "()Lcom/iqoption/databinding/VipEducationSessionItemBinding;", "bind", "", "session", "Lcom/iqoption/microservice/vip/TrainingSession;", "bgResource", "", "app_optionXRelease"})
    /* compiled from: VipEducationAdapter.kt */
    public static final class c extends ViewHolder {
        private final aav ejN;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
        /* compiled from: VipEducationAdapter.kt */
        static final class a implements OnClickListener {
            final /* synthetic */ c ejO;
            final /* synthetic */ com.iqoption.microservice.vip.b ejP;

            a(c cVar, com.iqoption.microservice.vip.b bVar) {
                this.ejO = cVar;
                this.ejP = bVar;
            }

            public final void onClick(View view) {
                r.aqZ.i(this.ejP.aOA(), this.ejP.getId());
                com.iqoption.vip.e.a aVar = e.ejC;
                view = this.ejO.itemView;
                kotlin.jvm.internal.i.e(view, "itemView");
                Context context = view.getContext();
                if (context != null) {
                    com.iqoption.vip.e.a.a(aVar, (FragmentActivity) context, this.ejP.getId(), false, 4, null);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            }
        }

        public c(aav aav) {
            kotlin.jvm.internal.i.f(aav, "binding");
            super(aav.getRoot());
            this.ejN = aav;
        }

        public final void a(com.iqoption.microservice.vip.b bVar, int i) {
            kotlin.jvm.internal.i.f(bVar, "session");
            TextView textView = this.ejN.alH;
            kotlin.jvm.internal.i.e(textView, "binding.title");
            textView.setText(bVar.getTitle());
            textView = this.ejN.aRu;
            kotlin.jvm.internal.i.e(textView, "binding.subtitle");
            textView.setText(TimeUtil.bRM.bp(bVar.getDuration()));
            this.ejN.getRoot().setBackgroundResource(i);
            this.ejN.getRoot().setOnClickListener(new a(this, bVar));
        }
    }

    public h(com.iqoption.microservice.vip.d dVar) {
        kotlin.jvm.internal.i.f(dVar, "vipManager");
        this.ejE = dVar;
        setHasStableIds(true);
        for (com.iqoption.microservice.vip.c cVar : this.ejE.aOK()) {
            int i;
            this.iA.add(d.ejT.a(cVar));
            Collection arrayList = new ArrayList();
            Iterator it = this.ejE.aOL().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((com.iqoption.microservice.vip.b) next).aOA() == cVar.getId()) {
                    i = 1;
                }
                if (i != 0) {
                    arrayList.add(next);
                }
            }
            List list = (List) arrayList;
            int size = list.size();
            Iterable iterable = list;
            Collection arrayList2 = new ArrayList(n.e(iterable, 10));
            for (Object next2 : iterable) {
                int i2 = i + 1;
                if (i < 0) {
                    m.bno();
                }
                arrayList2.add(d.ejT.b((com.iqoption.microservice.vip.b) next2, size + -1 == i ? R.drawable.vip_education_item_bottom : R.drawable.vip_education_item_middle));
                i = i2;
            }
            this.ejH.put(Long.valueOf(cVar.getId()), (List) arrayList2);
        }
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        ViewDataBinding inflate;
        if (i == 1) {
            inflate = DataBindingUtil.inflate(from, R.layout.vip_education_item_view, viewGroup, false);
            kotlin.jvm.internal.i.e(inflate, "DataBindingUtil.inflate(…item_view, parent, false)");
            return new b((aat) inflate, this);
        }
        inflate = DataBindingUtil.inflate(from, R.layout.vip_education_session_item, viewGroup, false);
        kotlin.jvm.internal.i.e(inflate, "DataBindingUtil\n        …sion_item, parent, false)");
        return new c((aav) inflate);
    }

    public int getItemViewType(int i) {
        return ((d) this.iA.get(i)).asd();
    }

    public int getItemCount() {
        return this.iA.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        kotlin.jvm.internal.i.f(viewHolder, "holder");
        d dVar = (d) this.iA.get(i);
        if (dVar.asd() == 1) {
            b bVar = (b) viewHolder;
            com.iqoption.microservice.vip.c aZl = dVar.aZl();
            if (aZl == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            Object obj = this.ejH.get(Long.valueOf(dVar.aZl().getId()));
            if (obj == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            bVar.a(aZl, (List) obj);
            return;
        }
        c cVar = (c) viewHolder;
        com.iqoption.microservice.vip.b aZm = dVar.aZm();
        if (aZm == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        cVar.a(aZm, dVar.aZk());
    }

    public long getItemId(int i) {
        d dVar = (d) this.iA.get(i);
        if (dVar.asd() == 1) {
            com.iqoption.microservice.vip.c aZl = dVar.aZl();
            if (aZl == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            return aZl.getId();
        }
        com.iqoption.microservice.vip.b aZm = dVar.aZm();
        if (aZm == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return -aZm.getId();
    }
}
