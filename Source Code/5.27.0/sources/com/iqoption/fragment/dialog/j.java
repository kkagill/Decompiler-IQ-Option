package com.iqoption.fragment.dialog;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.iqoption.app.managers.e;
import com.iqoption.x.R;
import java.math.BigDecimal;

/* compiled from: OtnEmissionStatisticsReceivedDelegate */
final class j extends g {
    private final Double der;
    private final Double des;
    private final BigDecimal dez;

    /* Access modifiers changed, original: 0000 */
    public String getEventName() {
        return "otn_receive-tokens-info-calculated";
    }

    j(@NonNull h hVar, @NonNull Bundle bundle) {
        BigDecimal bigDecimal;
        super(hVar);
        this.der = Double.valueOf(bundle.getDouble("arg.totalCommission"));
        this.des = Double.valueOf(bundle.getDouble("arg.yourCommission"));
        try {
            bigDecimal = new BigDecimal(bundle.getDouble("arg.otnAmount"));
        } catch (NumberFormatException unused) {
            bigDecimal = BigDecimal.ZERO;
        }
        this.dez = bigDecimal;
    }

    /* Access modifiers changed, original: 0000 */
    public CharSequence getTitle() {
        return eA(R.string.received_otn_amount);
    }

    /* Access modifiers changed, original: 0000 */
    public CharSequence aBW() {
        return eA(R.string.tokens_distributed);
    }

    /* Access modifiers changed, original: 0000 */
    public Double aBX() {
        return this.der;
    }

    /* Access modifiers changed, original: 0000 */
    public Double aBY() {
        return this.des;
    }

    /* Access modifiers changed, original: 0000 */
    public BigDecimal aBZ() {
        return e.Hv().HL();
    }

    /* Access modifiers changed, original: 0000 */
    public BigDecimal aCa() {
        return this.dez;
    }
}
