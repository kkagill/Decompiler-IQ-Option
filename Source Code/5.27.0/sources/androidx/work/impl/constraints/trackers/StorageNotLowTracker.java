package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.work.Logger;

@RestrictTo({Scope.LIBRARY_GROUP})
public class StorageNotLowTracker extends BroadcastReceiverConstraintTracker<Boolean> {
    private static final String TAG = Logger.tagWithPrefix("StorageNotLowTracker");

    public StorageNotLowTracker(Context context) {
        super(context);
    }

    public Boolean getInitialState() {
        Intent registerReceiver = this.mAppContext.registerReceiver(null, getIntentFilter());
        Boolean valueOf = Boolean.valueOf(true);
        if (!(registerReceiver == null || registerReceiver.getAction() == null)) {
            String action = registerReceiver.getAction();
            Object obj = -1;
            int hashCode = action.hashCode();
            if (hashCode != -1181163412) {
                if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    obj = null;
                }
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                obj = 1;
            }
            if (obj != null) {
                if (obj != 1) {
                    return null;
                }
                return Boolean.valueOf(false);
            }
        }
        return valueOf;
    }

    public IntentFilter getIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    public void onBroadcastReceive(Context context, @NonNull Intent intent) {
        if (intent.getAction() != null) {
            Logger.get().debug(TAG, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            Object obj = -1;
            int hashCode = action.hashCode();
            if (hashCode != -1181163412) {
                if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    obj = null;
                }
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                obj = 1;
            }
            if (obj == null) {
                setState(Boolean.valueOf(true));
            } else if (obj == 1) {
                setState(Boolean.valueOf(false));
            }
        }
    }
}
