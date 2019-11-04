package com.iqoption.a;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.google.common.collect.ImmutableList;
import com.iqoption.a.e.e;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.l;
import com.iqoption.dto.entity.iqbus.SignalLegacy;
import com.iqoption.e.wj;
import com.iqoption.x.R;

/* compiled from: PriceMovementsHighFrequencyAdapter */
public class f extends Adapter<d<wj>> {
    private static final String TAG = "com.iqoption.a.f";
    @Nullable
    private RecyclerView alz;
    private ImmutableList<SignalLegacy> amK;
    private final a amL;

    /* compiled from: PriceMovementsHighFrequencyAdapter */
    public interface a {
        void b(SignalLegacy signalLegacy, View view);
    }

    public f(a aVar, ImmutableList<SignalLegacy> immutableList) {
        this.amK = immutableList;
        this.amL = aVar;
        setHasStableIds(true);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.alz = recyclerView;
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.alz = null;
    }

    public void a(ImmutableList<SignalLegacy> immutableList) {
        this.amK = immutableList;
        notifyDataSetChanged();
        com.iqoption.core.c.a.biN.postDelayed(new Runnable() {
            public void run() {
                if (f.this.alz != null) {
                    f.this.alz.getLayoutManager().scrollToPosition(0);
                }
            }
        }, 200);
    }

    public long getItemId(int i) {
        return i < this.amK.size() ? ((SignalLegacy) this.amK.get(i)).id.longValue() : -1;
    }

    public int getItemViewType(int i) {
        return super.getItemViewType(i);
    }

    /* renamed from: b */
    public d<wj> onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new d((wj) DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.price_movements_high_frequecy_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(d<wj> dVar, int i) {
        final SignalLegacy signalLegacy = (SignalLegacy) this.amK.get(i);
        IQApp.Eu().getApplicationContext();
        String dU = com.iqoption.app.helpers.a.Gs().dU(signalLegacy.active_id.intValue());
        a((d) dVar, signalLegacy);
        ((wj) dVar.amm).cqk.setText(dU);
        e b = e.b(signalLegacy);
        ((wj) dVar.amm).cql.setTextColor(b.amF);
        int indexOf = b.amB.indexOf(37);
        if (indexOf == -1) {
            ((wj) dVar.amm).cql.setText(b.amB);
        } else {
            SpannableString spannableString = new SpannableString(b.amB);
            spannableString.setSpan(new StyleSpan(1), indexOf, indexOf + 1, 33);
            ((wj) dVar.amm).cql.setText(spannableString);
        }
        dVar.itemView.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (f.this.amL != null) {
                    f.this.amL.b(signalLegacy, view);
                }
            }
        });
    }

    private void a(d<wj> dVar, SignalLegacy signalLegacy) {
        final View root = ((wj) dVar.amm).getRoot();
        ValueAnimator valueAnimator = (ValueAnimator) root.getTag(R.id.valueAnimatorTag);
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
            root.setTag(R.id.valueAnimatorTag, null);
        }
        long Ib = l.HZ().Ib() - (signalLegacy.created.longValue() * 1000);
        if (Ib >= 0) {
            float f = (float) Ib;
            if (f < 10000.0f) {
                float f2 = 1.0f - (f / 10000.0f);
                long j = (long) (f2 * 10000.0f);
                int argb = Color.argb((int) (((0.20000002f * f2) + 0.3f) * 255.0f), 147, 168, 194);
                int argb2 = Color.argb(25, 147, 168, 194);
                ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(argb), Integer.valueOf(argb2)});
                ofObject.addUpdateListener(new AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((GradientDrawable) root.getBackground()).setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
                root.setTag(R.id.valueAnimatorTag, ofObject);
                ofObject.setDuration(j);
                ofObject.start();
                return;
            }
        }
        ((GradientDrawable) root.getBackground()).setColor(Color.argb(25, 147, 168, 194));
    }

    public int getItemCount() {
        ImmutableList immutableList = this.amK;
        return immutableList == null ? 0 : immutableList.size();
    }
}
