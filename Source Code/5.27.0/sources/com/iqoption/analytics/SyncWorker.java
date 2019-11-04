package com.iqoption.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker.Result;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class SyncWorker extends Worker {
    private static final String TAG = "com.iqoption.analytics.SyncWorker";

    public SyncWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @NonNull
    public Result doWork() {
        EventManager.BS().BW();
        return Result.success();
    }
}
