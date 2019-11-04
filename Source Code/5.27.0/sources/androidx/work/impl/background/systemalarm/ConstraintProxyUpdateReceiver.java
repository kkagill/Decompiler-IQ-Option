package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.ConstraintProxy.BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.StorageNotLowProxy;
import androidx.work.impl.utils.PackageManagerHelper;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    static final String ACTION = "androidx.work.impl.background.systemalarm.UpdateProxies";
    static final String KEY_BATTERY_CHARGING_PROXY_ENABLED = "KEY_BATTERY_CHARGING_PROXY_ENABLED";
    static final String KEY_BATTERY_NOT_LOW_PROXY_ENABLED = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED";
    static final String KEY_NETWORK_STATE_PROXY_ENABLED = "KEY_NETWORK_STATE_PROXY_ENABLED";
    static final String KEY_STORAGE_NOT_LOW_PROXY_ENABLED = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED";
    private static final String TAG = Logger.tagWithPrefix("ConstrntProxyUpdtRecvr");

    public static Intent newConstraintProxyUpdateIntent(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent(ACTION);
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra(KEY_BATTERY_NOT_LOW_PROXY_ENABLED, z).putExtra(KEY_BATTERY_CHARGING_PROXY_ENABLED, z2).putExtra(KEY_STORAGE_NOT_LOW_PROXY_ENABLED, z3).putExtra(KEY_NETWORK_STATE_PROXY_ENABLED, z4);
        return intent;
    }

    public void onReceive(Context context, Intent intent) {
        if (ACTION.equals(intent != null ? intent.getAction() : null)) {
            Logger.get().debug(TAG, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(intent.getBooleanExtra(KEY_BATTERY_NOT_LOW_PROXY_ENABLED, false)), Boolean.valueOf(intent.getBooleanExtra(KEY_BATTERY_CHARGING_PROXY_ENABLED, false)), Boolean.valueOf(intent.getBooleanExtra(KEY_STORAGE_NOT_LOW_PROXY_ENABLED, false)), Boolean.valueOf(intent.getBooleanExtra(KEY_NETWORK_STATE_PROXY_ENABLED, false))}), new Throwable[0]);
            PackageManagerHelper.setComponentEnabled(context, BatteryNotLowProxy.class, r0);
            PackageManagerHelper.setComponentEnabled(context, BatteryChargingProxy.class, r1);
            PackageManagerHelper.setComponentEnabled(context, StorageNotLowProxy.class, r4);
            PackageManagerHelper.setComponentEnabled(context, NetworkStateProxy.class, r11);
            return;
        }
        Logger.get().debug(TAG, String.format("Ignoring unknown action %s", new Object[]{intent != null ? intent.getAction() : null}), new Throwable[0]);
    }
}
