package com.iqoption.portfolio.fragment;

import android.widget.TextView;
import com.iqoption.core.d;
import com.iqoption.portfolio.component.m;
import com.iqoption.portfolio.f;
import com.iqoption.x.R;

/* compiled from: PortfolioAppBarHelper */
final class g implements o {
    private final i dPr;
    private final TextView dPs;
    private final TextView dPt;
    private final TextView dPu;

    /* compiled from: PortfolioAppBarHelper */
    static final class a {
        private final i dPr;
        private TextView dPs;
        private TextView dPt;
        private TextView dPu;

        a(i iVar) {
            this.dPr = iVar;
        }

        /* Access modifiers changed, original: 0000 */
        public a n(TextView textView) {
            this.dPs = textView;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public a o(TextView textView) {
            this.dPt = textView;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public a p(TextView textView) {
            this.dPu = textView;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public g aSy() {
            return new g(this);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void eX(boolean z) {
    }

    private g(a aVar) {
        this.dPr = aVar.dPr;
        this.dPs = aVar.dPs;
        this.dPt = aVar.dPt;
        this.dPu = aVar.dPu;
    }

    public m aRX() {
        return this.dPr.aRX();
    }

    /* Access modifiers changed, original: 0000 */
    public void b(f fVar) {
        if (d.Un().Dq()) {
            this.dPs.setVisibility(8);
            return;
        }
        this.dPs.setVisibility(0);
        switch (fVar.aQD()) {
            case 0:
                this.dPs.setText(R.string.all_assets);
                break;
            case 1:
                this.dPs.setText(R.string.expiration);
                break;
            case 2:
                this.dPs.setText(R.string.no_expiration);
                break;
            case 3:
                this.dPs.setText(R.string.binary);
                break;
            case 4:
                this.dPs.setText(R.string.cfd);
                break;
            case 5:
                this.dPs.setText(R.string.forex);
                break;
            case 6:
                this.dPs.setText(R.string.crypto);
                break;
            case 7:
                this.dPs.setText(R.string.digital);
                break;
            case 8:
                this.dPs.setText(R.string.fx);
                break;
            case 9:
                this.dPs.setText(R.string.multy);
                break;
            default:
                this.dPs.setText(null);
                break;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void c(f fVar) {
        this.dPr.aSc().a(this.dPt, this.dPu, fVar.aQI());
    }
}
