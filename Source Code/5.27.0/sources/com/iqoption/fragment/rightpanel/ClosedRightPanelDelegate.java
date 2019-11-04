package com.iqoption.fragment.rightpanel;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.app.managers.l;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.ext.g;
import com.iqoption.core.microservices.kyc.response.restriction.b;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.core.util.af;
import com.iqoption.dto.entity.ActiveQuote;
import com.iqoption.e.wz;
import com.iqoption.fragment.ah;
import com.iqoption.view.a.b.a;
import com.iqoption.x.R;
import com.squareup.picasso.Picasso;
import java.util.Objects;

public final class ClosedRightPanelDelegate extends RightPanelDelegate implements AnimatorUpdateListener, a {
    private com.iqoption.core.microservices.tradingengine.response.active.a anF;
    private String dmm;
    private int dmn;
    private int dmo;
    private ValueAnimator dmp;
    private wz dmq;

    public /* bridge */ /* synthetic */ boolean aFo() {
        return super.aFo();
    }

    @Nullable
    public /* bridge */ /* synthetic */ b aFp() {
        return super.aFp();
    }

    public /* bridge */ /* synthetic */ LiveData aFq() {
        return super.aFq();
    }

    public /* bridge */ /* synthetic */ RightPanelFragment aFr() {
        return super.aFr();
    }

    public /* bridge */ /* synthetic */ TradeRoomActivity aFs() {
        return super.aFs();
    }

    public /* bridge */ /* synthetic */ void aFt() {
        super.aFt();
    }

    public /* bridge */ /* synthetic */ void bA(View view) {
        super.bA(view);
    }

    @NonNull
    public /* bridge */ /* synthetic */ Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    public /* bridge */ /* synthetic */ ah getTradeFragment() {
        return super.getTradeFragment();
    }

    ClosedRightPanelDelegate(RightPanelFragment rightPanelFragment, com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        super(rightPanelFragment);
        e(aVar);
        com.iqoption.view.a.b.aYv().a((a) this);
        this.dmo = com.iqoption.core.ext.a.a((Fragment) rightPanelFragment, (int) R.color.white);
        this.dmn = com.iqoption.core.ext.a.a((Fragment) rightPanelFragment, (int) R.color.grey_blue_70);
    }

    public void onTick(long j) {
        bM(j);
    }

    public boolean aFe() {
        throw new UnsupportedOperationException("This delegate does not implement the method");
    }

    public void aFf() {
        throw new UnsupportedOperationException("This delegate does not implement the method");
    }

    public void aFg() {
        throw new UnsupportedOperationException("This delegate does not implement the method");
    }

    public boolean aFh() {
        throw new UnsupportedOperationException("This delegate does not implement the method");
    }

    public double ZC() {
        throw new UnsupportedOperationException("This delegate does not implement the method");
    }

    public double[] aFd() {
        throw new UnsupportedOperationException("This delegate does not implement the method");
    }

    public InstrumentType getInstrumentType() {
        throw new UnsupportedOperationException("This delegate does not implement the method");
    }

    /* Access modifiers changed, original: 0000 */
    @NonNull
    public View e(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        this.dmq = (wz) DataBindingUtil.inflate(layoutInflater, R.layout.right_panel_closed, viewGroup, false);
        aGq();
        return this.dmq.getRoot();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean b(@NonNull com.iqoption.core.microservices.tradingengine.response.active.a aVar, com.iqoption.core.microservices.useralerts.response.a aVar2) {
        if (aVar2 == null && !com.iqoption.util.c.a.z(aVar)) {
            return aVar.isSuspended();
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public void T(@NonNull com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        super.T(aVar);
        e(aVar);
    }

    /* Access modifiers changed, original: 0000 */
    public void destroy() {
        super.destroy();
        aGt();
        this.dmq.cqU.setOnClickListener(null);
        com.iqoption.view.a.b.aYv().b((a) this);
        aGs();
    }

    private void e(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        this.anF = aVar;
        if (this.dmq != null) {
            aGq();
        }
    }

    private void aGq() {
        String image = this.anF.getImage();
        if (!TextUtils.isEmpty(image)) {
            Picasso.with(getContext()).load(image).into(this.dmq.cqR);
        }
        bM(l.HZ().Ib());
    }

    private void aGr() {
        if (this.dmp == null) {
            this.dmp = new ValueAnimator();
            this.dmp.addUpdateListener(this);
            this.dmp.setIntValues(new int[]{this.dmo, this.dmn});
            this.dmp.setEvaluator(com.iqoption.core.graphics.animation.a.XC());
            this.dmp.setRepeatCount(-1);
            this.dmp.setRepeatMode(2);
            this.dmp.setDuration(500);
        } else {
            aGs();
        }
        this.dmp.start();
    }

    private void aGs() {
        ValueAnimator valueAnimator = this.dmp;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.dmq.alH.setTextColor(ContextCompat.getColor(getContext(), R.color.white));
    }

    private void bM(long j) {
        if (!com.iqoption.util.c.a.d(this.anF, j) || this.anF.isSuspended()) {
            String ak = com.iqoption.util.c.a.ak(this.anF);
            int equals = Objects.equals(ak, this.dmm) ^ 1;
            if (equals != 0) {
                this.dmm = ak;
            }
            String str = null;
            if (ak == null || ActiveQuote.PHASE_CLOSED.equals(ak) || ActiveQuote.PHASE_CLOSING_AUCTION.equals(ak)) {
                if (equals != 0) {
                    aGs();
                }
                long aY = this.anF.aY(j);
                if (aY == Long.MAX_VALUE || this.anF.isSuspended()) {
                    this.dmq.alH.setMaxLines(1);
                    this.dmq.alH.setText(getContext().getString(R.string.unavailable));
                    this.dmq.cqS.setVisibility(8);
                } else {
                    this.dmq.alH.setMaxLines(2);
                    this.dmq.alH.setText(getContext().getString(R.string.asset_closed));
                    this.dmq.cqS.setVisibility(0);
                    this.dmq.cqS.setText(TimeUtil.r(j, aY));
                }
            } else if (equals != 0) {
                this.dmq.alH.setMaxLines(5);
                this.dmq.cqS.setVisibility(8);
                Object obj = -1;
                int hashCode = ak.hashCode();
                if (hashCode != 73) {
                    if (hashCode == 80 && ak.equals(ActiveQuote.PHASE_OPENING_AUCTION)) {
                        obj = null;
                    }
                } else if (ak.equals(ActiveQuote.PHASE_INTRADAY_AUCTION)) {
                    obj = 1;
                }
                if (obj == null) {
                    aGr();
                    this.dmq.alH.setText(af.ht(getContext().getString(R.string.opening_auction)));
                    str = getString(R.string.due_to_closed_auction);
                } else if (obj == 1) {
                    aGs();
                    this.dmq.alH.setText(getContext().getString(R.string.one_day_auction));
                    str = getString(R.string.due_to_closed_auction);
                }
            }
            if (equals != 0) {
                aGt();
                if (str != null) {
                    this.dmq.cqU.setVisibility(0);
                    this.dmq.cqU.setOnClickListener(new g() {
                        public void M(View view) {
                            ClosedRightPanelDelegate.this.dmq.cqT.toggle();
                            if (ClosedRightPanelDelegate.this.dmq.cqT.isChecked()) {
                                ClosedRightPanelDelegate.this.aFr().c(str, null, false, Integer.valueOf(com.iqoption.core.ext.a.ai(ClosedRightPanelDelegate.this.dmq.cqT).y));
                                return;
                            }
                            ClosedRightPanelDelegate.this.aGt();
                        }
                    });
                    return;
                }
                this.dmq.cqU.setVisibility(8);
                return;
            }
            return;
        }
        com.iqoption.view.a.b.aYv().b((a) this);
        aFr().ac(this.anF);
    }

    private void aGt() {
        this.dmq.cqT.setChecked(false);
        aFr().aGt();
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.dmq.alH.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
