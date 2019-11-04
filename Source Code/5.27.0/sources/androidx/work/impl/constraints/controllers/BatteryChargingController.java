package androidx.work.impl.constraints.controllers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;

public class BatteryChargingController extends ConstraintController<Boolean> {
    public BatteryChargingController(Context context) {
        super(Trackers.getInstance(context).getBatteryChargingTracker());
    }

    /* Access modifiers changed, original: 0000 */
    public boolean hasConstraint(@NonNull WorkSpec workSpec) {
        return workSpec.constraints.requiresCharging();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isConstrained(@NonNull Boolean bool) {
        return bool.booleanValue() ^ 1;
    }
}
