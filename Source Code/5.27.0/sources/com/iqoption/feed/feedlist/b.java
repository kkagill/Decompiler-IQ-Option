package com.iqoption.feed.feedlist;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.iqoption.core.ext.g;
import com.iqoption.core.microservices.feed.response.c;
import com.iqoption.core.microservices.tradingengine.response.active.d;
import com.iqoption.core.util.e;
import com.iqoption.feed.feedlist.c.a;
import com.iqoption.feed.i;
import java.util.Locale;

/* compiled from: ContentViewHolder */
public abstract class b extends h implements a {
    private final int aBn;
    private final int amj;
    private final int amk;
    private final a cQD;
    @Nullable
    protected d cQE;
    @Nullable
    private LottieAnimationView cQF;
    private boolean cQG = false;

    @NonNull
    public abstract ViewGroup avT();

    @NonNull
    public abstract TextView avU();

    @NonNull
    public abstract TextView avV();

    public b(View view, a aVar) {
        super(view);
        this.aBn = ContextCompat.getColor(view.getContext(), com.iqoption.feed.i.b.grey_blur);
        this.cQD = aVar;
        this.amk = ContextCompat.getColor(view.getContext(), com.iqoption.feed.i.b.red);
        this.amj = ContextCompat.getColor(view.getContext(), com.iqoption.feed.i.b.green);
    }

    @CallSuper
    public void m(d dVar) {
        if (this.cQE != dVar) {
            this.cQE = dVar;
            avQ();
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(final d dVar, final LottieAnimationView lottieAnimationView, TextView textView) {
        final com.iqoption.core.microservices.feed.response.a YQ = dVar.YQ();
        textView.setTextColor(YQ.adM() ? -1 : this.aBn);
        this.cQF = lottieAnimationView;
        AnonymousClass1 anonymousClass1 = new g() {
            public void M(View view) {
                if (!((!b.this.cQF.isAnimating() && !b.this.cQD.l(dVar)) || YQ.adM() || b.this.cQF.isAnimating())) {
                    lottieAnimationView.setProgress(0.0f);
                    lottieAnimationView.Z();
                }
            }
        };
        textView.setOnClickListener(anonymousClass1);
        this.cQF.setOnClickListener(anonymousClass1);
        if (!this.cQF.isAnimating()) {
            this.cQF.setProgress(YQ.adM() ? 1.0f : 0.0f);
        }
    }

    /* Access modifiers changed, original: protected */
    public void h(TextView textView, int i) {
        if (i == 0) {
            textView.setText(i.g.like_it);
            return;
        }
        textView.setText(this.itemView.getContext().getString(i.g.like_it_n1, new Object[]{String.valueOf(i)}));
    }

    /* Access modifiers changed, original: protected */
    public void avO() {
        if (!Ng()) {
            avP();
        }
    }

    /* Access modifiers changed, original: protected */
    public void avP() {
        c adN = this.cQE.YQ().adN();
        if (adN != null) {
            a(adN);
        }
    }

    public void recycle() {
        LottieAnimationView lottieAnimationView = this.cQF;
        if (lottieAnimationView != null) {
            lottieAnimationView.ac();
            this.cQF.setProgress(0.0f);
        }
        avQ();
    }

    private void avQ() {
        a(null);
    }

    private void a(@Nullable c cVar) {
        this.cQG = cVar != null;
        com.iqoption.asset.mediators.a avY = this.cQE.avY();
        com.iqoption.core.microservices.tradingengine.response.active.a Jt = avY != null ? avY.Jt() : null;
        ViewGroup avT = avT();
        if (Jt == null || cVar == null) {
            avT.setVisibility(8);
            return;
        }
        TextView avU = avU();
        String B = d.B(Jt);
        int action = cVar.getAction();
        if (action == 0) {
            avU.setTextColor(this.amk);
            avU.setText(this.itemView.getResources().getString(i.g.sell_n1, new Object[]{B}));
            avT.setBackgroundResource(i.d.micro_sell_feed_bg);
        } else if (action != 1) {
            avU.setTextColor(this.amj);
            avU.setText(this.itemView.getResources().getString(i.g.trade_n1, new Object[]{B}));
            avT.setBackgroundResource(i.d.micro_buy_feed_bg);
        } else {
            avU.setTextColor(this.amj);
            avU.setText(this.itemView.getResources().getString(i.g.buy_n1, new Object[]{B}));
            avT.setBackgroundResource(i.d.micro_buy_feed_bg);
        }
        avT.setVisibility(0);
        avT.setOnClickListener(new g() {
            public void M(View view) {
                if (b.this.cQE.YQ().adN() != null) {
                    b.this.cQD.f(b.this.cQE.YQ());
                }
            }
        });
        avS();
    }

    private boolean avR() {
        return this.cQE.YQ().adN() != null;
    }

    private void avS() {
        com.iqoption.asset.mediators.a avY = this.cQE.avY();
        if (avR() || avY == null) {
            TextView avV = avV();
            com.iqoption.core.microservices.f.a.a.a JS = avY.JS();
            CharSequence charSequence = "";
            if (JS == null) {
                avV.setText(charSequence);
            } else if (JS.ahz().isValid() && JS.ahw().isValid()) {
                double doubleValue;
                String q = e.q(JS.ahz().ahD().doubleValue() + (JS.ahw().ahD().doubleValue() / 2.0d));
                if (JS.ahy().isValid()) {
                    doubleValue = JS.ahy().ahD().doubleValue();
                    if (doubleValue >= 0.0d) {
                        charSequence = String.format(Locale.US, "(+%.2f%%)", new Object[]{Double.valueOf(doubleValue)});
                    } else {
                        charSequence = String.format(Locale.US, "(%.2f%%)", new Object[]{Double.valueOf(doubleValue)});
                    }
                } else {
                    doubleValue = 0.0d;
                }
                if (TextUtils.isEmpty(charSequence)) {
                    avV.setText(q);
                } else {
                    SpannableString spannableString = new SpannableString(String.format(Locale.US, "%s %s", new Object[]{q, charSequence}));
                    int i = this.amk;
                    if (doubleValue >= 0.0d) {
                        i = this.amj;
                    }
                    spannableString.setSpan(new ForegroundColorSpan(i), spannableString.toString().indexOf(charSequence), spannableString.length(), 17);
                    avV.setText(spannableString);
                }
            } else {
                avV.setText(charSequence);
            }
        }
    }

    public boolean avM() {
        return this.cQG;
    }

    @Nullable
    public Integer avW() {
        d dVar = this.cQE;
        return dVar != null ? Integer.valueOf(dVar.YQ().getId()) : null;
    }
}
