package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.util.List;

public class zzd {
    private static final String[] ACCEPTABLE_ACCOUNT_TYPES = new String[]{"com.google", "com.google.work", "cn.google"};
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    @SuppressLint({"InlinedApi"})
    public static final String KEY_ANDROID_PACKAGE_NAME = "androidPackageName";
    @SuppressLint({"InlinedApi"})
    public static final String KEY_CALLER_UID = "callerUid";
    public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    public static final String WORK_ACCOUNT_TYPE = "com.google.work";
    private static final ComponentName zzm = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    private static final Logger zzn = new Logger("Auth", "GoogleAuthUtil");

    @Deprecated
    public static String getToken(Context context, String str, String str2) {
        return getToken(context, new Account(str, "com.google"), str2);
    }

    @Deprecated
    public static String getToken(Context context, String str, String str2, Bundle bundle) {
        return getToken(context, new Account(str, "com.google"), str2, bundle);
    }

    public static String getToken(Context context, Account account, String str) {
        return getToken(context, account, str, new Bundle());
    }

    public static String getToken(Context context, Account account, String str, Bundle bundle) {
        zzb(account);
        return zzb(context, account, str, bundle).zzb();
    }

    public static TokenData zzb(Context context, Account account, String str, Bundle bundle) {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        Preconditions.checkNotEmpty(str, "Scope cannot be empty or null.");
        zzb(account);
        ensurePlayServicesAvailable(context, 8400000);
        bundle = bundle == null ? new Bundle() : new Bundle(bundle);
        String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        if (TextUtils.isEmpty(bundle.getString(KEY_ANDROID_PACKAGE_NAME))) {
            bundle.putString(KEY_ANDROID_PACKAGE_NAME, str2);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        return (TokenData) zza(context, zzm, new zze(account, str, bundle));
    }

    @RequiresPermission("android.permission.MANAGE_ACCOUNTS")
    @Deprecated
    public static void invalidateToken(Context context, String str) {
        AccountManager.get(context).invalidateAuthToken("com.google", str);
    }

    public static void clearToken(Context context, String str) {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        ensurePlayServicesAvailable(context, 8400000);
        Bundle bundle = new Bundle();
        String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        if (!bundle.containsKey(KEY_ANDROID_PACKAGE_NAME)) {
            bundle.putString(KEY_ANDROID_PACKAGE_NAME, str2);
        }
        zza(context, zzm, new zzf(str, bundle));
    }

    public static List<AccountChangeEvent> getAccountChangeEvents(Context context, int i, String str) {
        Preconditions.checkNotEmpty(str, "accountName must be provided");
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        ensurePlayServicesAvailable(context, 8400000);
        return (List) zza(context, zzm, new zzg(str, i));
    }

    public static String getAccountId(Context context, String str) {
        Preconditions.checkNotEmpty(str, "accountName must be provided");
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        ensurePlayServicesAvailable(context, 8400000);
        return getToken(context, str, "^^_account_id_^^", new Bundle());
    }

    @TargetApi(23)
    public static Bundle removeAccount(Context context, Account account) {
        Preconditions.checkNotNull(context);
        zzb(account);
        ensurePlayServicesAvailable(context, 8400000);
        return (Bundle) zza(context, zzm, new zzh(account));
    }

    @TargetApi(26)
    public static Boolean requestGoogleAccountsAccess(Context context) {
        Preconditions.checkNotNull(context);
        ensurePlayServicesAvailable(context, 11400000);
        return (Boolean) zza(context, zzm, new zzi(context.getApplicationInfo().packageName));
    }

    private static void zzb(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        } else if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        } else {
            String[] strArr = ACCEPTABLE_ACCOUNT_TYPES;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                if (!strArr[i].equals(account.type)) {
                    i++;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("Account type not supported");
        }
    }

    private static void ensurePlayServicesAvailable(Context context, int i) {
        try {
            GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context.getApplicationContext(), i);
        } catch (GooglePlayServicesRepairableException e) {
            throw new GooglePlayServicesAvailabilityException(e.getConnectionStatusCode(), e.getMessage(), e.getIntent());
        } catch (GooglePlayServicesNotAvailableException e2) {
            throw new GoogleAuthException(e2.getMessage());
        }
    }

    private static <T> T zza(T t) {
        if (t != null) {
            return t;
        }
        zzn.w("GoogleAuthUtil", "Binder call returned null.");
        throw new IOException("Service unavailable.");
    }

    private static <T> T zza(Context context, ComponentName componentName, zzj<T> zzj) {
        String str = "Error on service connection.";
        ServiceConnection blockingServiceConnection = new BlockingServiceConnection();
        GmsClientSupervisor instance = GmsClientSupervisor.getInstance(context);
        String str2 = "GoogleAuthUtil";
        if (instance.bindService(componentName, blockingServiceConnection, str2)) {
            try {
                Object zzb = zzj.zzb(blockingServiceConnection.getService());
                instance.unbindService(componentName, blockingServiceConnection, str2);
                return zzb;
            } catch (RemoteException | InterruptedException e) {
                zzn.i(str2, str, e);
                throw new IOException(str, e);
            } catch (Throwable th) {
                instance.unbindService(componentName, blockingServiceConnection, str2);
            }
        } else {
            throw new IOException("Could not bind to service.");
        }
    }

    zzd() {
    }
}
