package com.iqoption.dialog.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.common.collect.ImmutableList;
import com.iqoption.core.microservices.tradingengine.response.active.j;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.dialog.a.c.-CC;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.dto.entity.position.PositionItem;
import com.iqoption.e.es;
import com.iqoption.e.fe;
import com.iqoption.e.fg;
import com.iqoption.e.fq;
import com.iqoption.util.ak;
import com.iqoption.x.R;
import com.squareup.picasso.Picasso;
import java.util.List;

/* compiled from: MultiComponentFactory */
final class d implements c {
    private final com.iqoption.core.microservices.tradingengine.response.active.a anF = com.iqoption.app.helpers.a.Gs().c(Integer.valueOf(this.position.getActiveId()));
    private final List<Position> bwQ;
    private final a cHL;
    private final Context context;
    private final Position position;

    /* compiled from: MultiComponentFactory */
    private static final class a {
        final String cHM = com.iqoption.app.b.DG().DO();
        @ColorInt
        final int cHN;
        @ColorInt
        final int cHO;
        @ColorInt
        final int cHP;
        @ColorInt
        final int cHQ;

        a(Context context) {
            this.cHN = ContextCompat.getColor(context, R.color.white);
            this.cHO = ContextCompat.getColor(context, R.color.grey_blur_70);
            this.cHP = ContextCompat.getColor(context, R.color.red);
            this.cHQ = ContextCompat.getColor(context, R.color.green);
        }
    }

    /* compiled from: MultiComponentFactory */
    private static final class b extends Adapter<c> {
        private final List<Position> bwQ;
        private final a cHL;
        private final j cHR;

        b(List<Position> list, j jVar, a aVar) {
            this.bwQ = list;
            this.cHL = aVar;
            this.cHR = jVar;
        }

        /* renamed from: z */
        public c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new c(fq.l(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), this.cHL);
        }

        /* renamed from: a */
        public void onBindViewHolder(c cVar, int i) {
            cVar.a((Position) this.bwQ.get(i), this.cHR);
        }

        public int getItemCount() {
            return this.bwQ.size();
        }
    }

    /* compiled from: MultiComponentFactory */
    private static final class c extends ViewHolder {
        private final a cHL;
        private final fq cHS;

        c(fq fqVar, a aVar) {
            super(fqVar.getRoot());
            this.cHS = fqVar;
            this.cHL = aVar;
        }

        /* Access modifiers changed, original: 0000 */
        public void a(Position position, j jVar) {
            View[][] a = a(this.cHS);
            for (int i = 0; i < a.length; i++) {
                a(jVar, (PositionItem) u.h(position.getPositionItems(), i), a[i][0], (ImageView) a[i][1], (TextView) a[i][2], (TextView) a[i][3], (TextView) a[i][4], (TextView) a[i][5]);
            }
        }

        private void a(j jVar, PositionItem positionItem, View view, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
            if (positionItem == null) {
                view.setVisibility(8);
                return;
            }
            com.iqoption.core.microservices.tradingengine.response.active.a aVar;
            view.setVisibility(0);
            if (jVar == null) {
                aVar = null;
            } else {
                aVar = jVar.fa(positionItem.getActiveId());
            }
            if (aVar != null) {
                textView.setText(com.iqoption.core.microservices.tradingengine.response.active.d.B(aVar));
                String image = aVar.getImage();
                if (!TextUtils.isEmpty(image)) {
                    Picasso.with(view.getContext()).load(image).into(imageView);
                }
                textView2.setText(com.iqoption.core.util.j.fr(aVar.getPrecision()).format(positionItem.getValue()));
                textView3.setText(com.iqoption.core.util.j.fr(aVar.getPrecision()).format(positionItem.getCloseUnderlyingPrice()));
            }
            if (positionItem.isCall()) {
                ak.k(textView2, R.drawable.ic_indicator_call_10dp);
            } else {
                ak.k(textView2, R.drawable.ic_indicator_put_10dp);
            }
            String status = positionItem.getStatus();
            int i = -1;
            int hashCode = status.hashCode();
            if (hashCode != 117724) {
                if (hashCode != 3327780) {
                    if (hashCode == 3536084 && status.equals("sold")) {
                        i = 2;
                    }
                } else if (status.equals("lost")) {
                    i = 0;
                }
            } else if (status.equals("win")) {
                i = 1;
            }
            if (i == 0) {
                textView4.setText(R.string.status_lose);
                textView4.setTextColor(this.cHL.cHP);
            } else if (i == 1) {
                textView4.setText(R.string.status_profit);
                textView4.setTextColor(this.cHL.cHQ);
            } else if (i != 2) {
                textView4.setText(null);
            } else {
                textView4.setText(R.string.sold);
                textView4.setTextColor(this.cHL.cHO);
            }
        }

        private View[][] a(fq fqVar) {
            r1 = new View[3][];
            r1[0] = new View[]{fqVar.caK, fqVar.caB, fqVar.caE, fqVar.caQ, fqVar.caH, fqVar.caN};
            r1[1] = new View[]{fqVar.caL, fqVar.caC, fqVar.caF, fqVar.caR, fqVar.caI, fqVar.caO};
            r1[2] = new View[]{fqVar.caM, fqVar.caD, fqVar.caG, fqVar.caS, fqVar.caJ, fqVar.caP};
            return r1;
        }
    }

    public /* synthetic */ void a(@NonNull com.iqoption.dialog.a.a.d dVar) {
        -CC.$default$a(this, dVar);
    }

    @Nullable
    public /* synthetic */ com.iqoption.dialog.a.a.d d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return -CC.$default$d(this, layoutInflater, viewGroup);
    }

    d(Context context, ImmutableList<Position> immutableList) {
        this.context = context;
        this.bwQ = immutableList;
        this.position = (Position) immutableList.get(0);
        this.cHL = new a(context);
    }

    @NonNull
    public View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        int i = 0;
        fg k = fg.k(layoutInflater, viewGroup, false);
        double d = 0.0d;
        for (Position position : this.bwQ) {
            d += position.getCloseInvestSum();
            i += position.getPositionItems().size();
        }
        k.cap.setText(com.iqoption.util.c.a.aj(this.anF));
        k.cal.setText(com.iqoption.util.j.d(this.cHL.cHM, Double.valueOf(d)));
        k.can.setText(String.valueOf(i));
        k.cao.setText(TimeUtil.c(this.position.getExpired(), 1));
        ak.setDrawableLeft(k.cao, AppCompatResources.getDrawable(context, R.drawable.ic_flag_new));
        return k.getRoot();
    }

    @NonNull
    public View c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fe.j(layoutInflater, viewGroup, false).getRoot();
    }

    @NonNull
    public Adapter atC() {
        return new b(this.bwQ, (j) this.anF, this.cHL);
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, OnClickListener onClickListener) {
        es h = es.h(layoutInflater, viewGroup, false);
        h.cad.setOnClickListener(onClickListener);
        return h.getRoot();
    }
}
