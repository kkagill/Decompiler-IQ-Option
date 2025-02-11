package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public abstract class TaskApiCall<A extends AnyClient, ResultT> {
    private final Feature[] zakd;
    private final boolean zakk;

    @KeepForSdk
    public static class Builder<A extends AnyClient, ResultT> {
        private Feature[] zakd;
        private boolean zakk;
        private RemoteCall<A, TaskCompletionSource<ResultT>> zakl;

        private Builder() {
            this.zakk = true;
        }

        @KeepForSdk
        @Deprecated
        public Builder<A, ResultT> execute(BiConsumer<A, TaskCompletionSource<ResultT>> biConsumer) {
            this.zakl = new zacj(biConsumer);
            return this;
        }

        @KeepForSdk
        public Builder<A, ResultT> run(RemoteCall<A, TaskCompletionSource<ResultT>> remoteCall) {
            this.zakl = remoteCall;
            return this;
        }

        @KeepForSdk
        public Builder<A, ResultT> setFeatures(Feature... featureArr) {
            this.zakd = featureArr;
            return this;
        }

        @KeepForSdk
        public Builder<A, ResultT> setAutoResolveMissingFeatures(boolean z) {
            this.zakk = z;
            return this;
        }

        @KeepForSdk
        public TaskApiCall<A, ResultT> build() {
            Preconditions.checkArgument(this.zakl != null, "execute parameter required");
            return new zack(this, this.zakd, this.zakk);
        }

        /* synthetic */ Builder(zaci zaci) {
            this();
        }
    }

    @KeepForSdk
    @Deprecated
    public TaskApiCall() {
        this.zakd = null;
        this.zakk = false;
    }

    @KeepForSdk
    public abstract void doExecute(A a, TaskCompletionSource<ResultT> taskCompletionSource);

    @KeepForSdk
    private TaskApiCall(Feature[] featureArr, boolean z) {
        this.zakd = featureArr;
        this.zakk = z;
    }

    @Nullable
    public final Feature[] zabt() {
        return this.zakd;
    }

    @KeepForSdk
    public boolean shouldAutoResolveMissingFeatures() {
        return this.zakk;
    }

    @KeepForSdk
    public static <A extends AnyClient, ResultT> Builder<A, ResultT> builder() {
        return new Builder();
    }

    /* synthetic */ TaskApiCall(Feature[] featureArr, boolean z, zaci zaci) {
        this(featureArr, z);
    }
}
