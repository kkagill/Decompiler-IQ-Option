package androidx.work.impl.constraints.controllers;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;

public class NetworkConnectedController extends ConstraintController<NetworkState> {
    public NetworkConnectedController(Context context) {
        super(Trackers.getInstance(context).getNetworkStateTracker());
    }

    /* Access modifiers changed, original: 0000 */
    public boolean hasConstraint(@NonNull WorkSpec workSpec) {
        return workSpec.constraints.getRequiredNetworkType() == NetworkType.CONNECTED;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isConstrained(@NonNull NetworkState networkState) {
        boolean z = true;
        if (VERSION.SDK_INT < 26) {
            return networkState.isConnected() ^ 1;
        }
        if (networkState.isConnected() && networkState.isValidated()) {
            z = false;
        }
        return z;
    }
}
