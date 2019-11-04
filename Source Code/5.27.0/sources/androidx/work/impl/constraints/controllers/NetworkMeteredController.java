package androidx.work.impl.constraints.controllers;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;

public class NetworkMeteredController extends ConstraintController<NetworkState> {
    private static final String TAG = Logger.tagWithPrefix("NetworkMeteredCtrlr");

    public NetworkMeteredController(Context context) {
        super(Trackers.getInstance(context).getNetworkStateTracker());
    }

    /* Access modifiers changed, original: 0000 */
    public boolean hasConstraint(@NonNull WorkSpec workSpec) {
        return workSpec.constraints.getRequiredNetworkType() == NetworkType.METERED;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isConstrained(@NonNull NetworkState networkState) {
        boolean z = true;
        if (VERSION.SDK_INT < 26) {
            Logger.get().debug(TAG, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return networkState.isConnected() ^ 1;
        }
        if (networkState.isConnected() && networkState.isMetered()) {
            z = false;
        }
        return z;
    }
}
