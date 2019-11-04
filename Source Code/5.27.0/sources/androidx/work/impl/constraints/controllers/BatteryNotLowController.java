package androidx.work.impl.constraints.controllers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;

public class BatteryNotLowController extends ConstraintController<Boolean> {
    public BatteryNotLowController(Context context) {
        super(Trackers.getInstance(context).getBatteryNotLowTracker());
    }

    /* Access modifiers changed, original: 0000 */
    public boolean hasConstraint(@NonNull WorkSpec workSpec) {
        return workSpec.constraints.requiresBatteryNotLow();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isConstrained(@NonNull Boolean bool) {
        return bool.booleanValue() ^ 1;
    }
}
