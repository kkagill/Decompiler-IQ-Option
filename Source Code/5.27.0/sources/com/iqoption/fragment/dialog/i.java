package com.iqoption.fragment.dialog;

import androidx.annotation.NonNull;
import com.iqoption.app.managers.e;
import com.iqoption.x.R;
import java.math.BigDecimal;

/* compiled from: OtnEmissionStatisticsExpectedDelegate */
final class i extends g {
    /* Access modifiers changed, original: 0000 */
    public String getEventName() {
        return "otn_expected-otn-amount";
    }

    i(@NonNull h hVar) {
        super(hVar);
    }

    /* Access modifiers changed, original: 0000 */
    public CharSequence getTitle() {
        return eA(R.string.expected_otn_amount);
    }

    /* Access modifiers changed, original: 0000 */
    public CharSequence aBW() {
        return eA(R.string.tokens_to_be_distributed);
    }

    /* Access modifiers changed, original: 0000 */
    public Double aBX() {
        return e.Hv().HH();
    }

    /* Access modifiers changed, original: 0000 */
    public Double aBY() {
        return e.Hv().HG();
    }

    /* Access modifiers changed, original: 0000 */
    public BigDecimal aBZ() {
        return e.Hv().HK();
    }

    /* Access modifiers changed, original: 0000 */
    public BigDecimal aCa() {
        return e.Hv().HF();
    }
}
