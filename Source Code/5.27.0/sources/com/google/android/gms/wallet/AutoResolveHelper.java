package com.google.android.gms.wallet;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.internal.wallet.zze;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class AutoResolveHelper {
    public static final int RESULT_ERROR = 1;
    private static final long zzp = TimeUnit.MINUTES.toMillis(10);
    @VisibleForTesting
    static long zzq = SystemClock.elapsedRealtime();

    public static class zzb extends Fragment {
        private static String zzaa = "delivered";
        private static String zzx = "resolveCallId";
        private static String zzy = "requestCode";
        private static String zzz = "initializationElapsedRealtime";
        private int zzab;
        private zza<?> zzac;
        @VisibleForTesting
        private boolean zzad;

        private static Fragment zza(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt(zzx, i);
            bundle.putInt(zzy, i2);
            bundle.putLong(zzz, AutoResolveHelper.zzq);
            zzb zzb = new zzb();
            zzb.setArguments(bundle);
            return zzb;
        }

        public final void onCreate(@Nullable Bundle bundle) {
            super.onCreate(bundle);
            this.zzab = getArguments().getInt(zzy);
            if (AutoResolveHelper.zzq != getArguments().getLong(zzz)) {
                this.zzac = null;
            } else {
                this.zzac = (zza) zza.zzs.get(getArguments().getInt(zzx));
            }
            boolean z = bundle != null && bundle.getBoolean(zzaa);
            this.zzad = z;
        }

        public final void onResume() {
            super.onResume();
            zza zza = this.zzac;
            if (zza != null) {
                zza.zza(this);
                return;
            }
            String str = "AutoResolveHelper";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Sending canceled result for garbage collected task!");
            }
            zzb(null);
        }

        public final void onSaveInstanceState(Bundle bundle) {
            super.onSaveInstanceState(bundle);
            bundle.putBoolean(zzaa, this.zzad);
            zzc();
        }

        public final void onPause() {
            super.onPause();
            zzc();
        }

        private final void zzc() {
            zza zza = this.zzac;
            if (zza != null) {
                zza.zzb(this);
            }
        }

        private final void zzb(@Nullable Task<? extends AutoResolvableResult> task) {
            if (!this.zzad) {
                this.zzad = true;
                Activity activity = getActivity();
                activity.getFragmentManager().beginTransaction().remove(this).commit();
                if (task != null) {
                    AutoResolveHelper.zza(activity, this.zzab, (Task) task);
                    return;
                }
                AutoResolveHelper.zza(activity, this.zzab, 0, new Intent());
            }
        }
    }

    @VisibleForTesting
    static class zza<TResult extends AutoResolvableResult> implements OnCompleteListener<TResult>, Runnable {
        @VisibleForTesting
        private static final Handler zzr = new zze(Looper.getMainLooper());
        @VisibleForTesting
        static final SparseArray<zza<?>> zzs = new SparseArray(2);
        private static final AtomicInteger zzt = new AtomicInteger();
        int zzu;
        private zzb zzv;
        private Task<TResult> zzw;

        zza() {
        }

        public static <TResult extends AutoResolvableResult> zza<TResult> zza(Task<TResult> task) {
            zza zza = new zza();
            zza.zzu = zzt.incrementAndGet();
            zzs.put(zza.zzu, zza);
            zzr.postDelayed(zza, AutoResolveHelper.zzp);
            task.addOnCompleteListener(zza);
            return zza;
        }

        public final void zza(zzb zzb) {
            this.zzv = zzb;
            zzb();
        }

        public final void zzb(zzb zzb) {
            if (this.zzv == zzb) {
                this.zzv = null;
            }
        }

        public final void onComplete(@NonNull Task<TResult> task) {
            this.zzw = task;
            zzb();
        }

        public final void run() {
            zzs.delete(this.zzu);
        }

        private final void zzb() {
            if (this.zzw != null && this.zzv != null) {
                zzs.delete(this.zzu);
                zzr.removeCallbacks(this);
                this.zzv.zzb(this.zzw);
            }
        }
    }

    private AutoResolveHelper() {
    }

    @MainThread
    public static <TResult extends AutoResolvableResult> void resolveTask(@NonNull Task<TResult> task, @NonNull Activity activity, int i) {
        zza zza = zza.zza((Task) task);
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        Fragment zzb = zzb.zza(zza.zzu, i);
        int i2 = zza.zzu;
        StringBuilder stringBuilder = new StringBuilder(58);
        stringBuilder.append("com.google.android.gms.wallet.AutoResolveHelper");
        stringBuilder.append(i2);
        beginTransaction.add(zzb, stringBuilder.toString()).commit();
    }

    @Nullable
    public static Status getStatusFromIntent(@Nullable Intent intent) {
        return intent == null ? null : (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
    }

    public static void putStatusIntoIntent(@NonNull Intent intent, @Nullable Status status) {
        String str = "com.google.android.gms.common.api.AutoResolveHelper.status";
        if (status == null) {
            intent.removeExtra(str);
        } else {
            intent.putExtra(str, status);
        }
    }

    public static <TResult> void zza(Status status, TResult tResult, TaskCompletionSource<TResult> taskCompletionSource) {
        if (status.isSuccess()) {
            taskCompletionSource.setResult(tResult);
        } else {
            taskCompletionSource.setException(ApiExceptionUtil.fromStatus(status));
        }
    }

    private static void zza(Activity activity, int i, Task<? extends AutoResolvableResult> task) {
        String str = "AutoResolveHelper";
        if (activity.isFinishing()) {
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Ignoring task result for, Activity is finishing.");
            }
        } else if (task.getException() instanceof ResolvableApiException) {
            try {
                ((ResolvableApiException) task.getException()).startResolutionForResult(activity, i);
            } catch (SendIntentException e) {
                if (Log.isLoggable(str, 6)) {
                    Log.e(str, "Error starting pending intent!", e);
                }
            }
        } else {
            Intent intent = new Intent();
            int i2 = 1;
            if (task.isSuccessful()) {
                i2 = -1;
                ((AutoResolvableResult) task.getResult()).putIntoIntent(intent);
            } else if (task.getException() instanceof ApiException) {
                ApiException apiException = (ApiException) task.getException();
                putStatusIntoIntent(intent, new Status(apiException.getStatusCode(), apiException.getMessage(), null));
            } else {
                if (Log.isLoggable(str, 6)) {
                    Log.e(str, "Unexpected non API exception!", task.getException());
                }
                putStatusIntoIntent(intent, new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!"));
            }
            zza(activity, i, i2, intent);
        }
    }

    private static void zza(Activity activity, int i, int i2, Intent intent) {
        PendingIntent createPendingResult = activity.createPendingResult(i, intent, 1073741824);
        String str = "AutoResolveHelper";
        if (createPendingResult != null) {
            try {
                createPendingResult.send(i2);
            } catch (CanceledException e) {
                if (Log.isLoggable(str, 6)) {
                    Log.e(str, "Exception sending pending result", e);
                }
            }
        } else if (Log.isLoggable(str, 5)) {
            Log.w(str, "Null pending result returned when trying to deliver task result!");
        }
    }
}
