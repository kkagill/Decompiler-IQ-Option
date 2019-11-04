package com.google.android.gms.wallet;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ApiOptions.HasAccountOptions;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.wallet.zzaf;
import com.google.android.gms.internal.wallet.zzan;
import com.google.android.gms.internal.wallet.zzao;
import com.google.android.gms.internal.wallet.zzg;
import com.google.android.gms.internal.wallet.zzy;
import com.google.android.gms.wallet.wobs.WalletObjects;
import java.util.Locale;

public final class Wallet {
    public static final Api<WalletOptions> API = new Api("Wallet.API", CLIENT_BUILDER, CLIENT_KEY);
    private static final AbstractClientBuilder<zzaf, WalletOptions> CLIENT_BUILDER = new zzaq();
    private static final ClientKey<zzaf> CLIENT_KEY = new ClientKey();
    @Deprecated
    public static final Payments Payments = new zzy();
    private static final WalletObjects zzer = new zzao();
    private static final zzg zzes = new zzan();

    public static final class WalletOptions implements HasAccountOptions {
        private final Account account;
        public final int environment;
        public final int theme;
        @VisibleForTesting
        final boolean zzet;

        public static final class Builder {
            private int environment = 3;
            private int theme = 0;
            private boolean zzet = true;

            public final Builder setEnvironment(int i) {
                if (i == 0 || i == 0 || i == 2 || i == 1 || i == 3) {
                    this.environment = i;
                    return this;
                }
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", new Object[]{Integer.valueOf(i)}));
            }

            public final Builder setTheme(int i) {
                if (i == 0 || i == 1) {
                    this.theme = i;
                    return this;
                }
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid theme value %d", new Object[]{Integer.valueOf(i)}));
            }

            @Deprecated
            public final Builder useGoogleWallet() {
                this.zzet = false;
                return this;
            }

            public final WalletOptions build() {
                return new WalletOptions(this, null);
            }
        }

        private WalletOptions() {
            this(new Builder());
        }

        public final Account getAccount() {
            return null;
        }

        private WalletOptions(Builder builder) {
            this.environment = builder.environment;
            this.theme = builder.theme;
            this.zzet = builder.zzet;
            this.account = null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof WalletOptions)) {
                return false;
            }
            WalletOptions walletOptions = (WalletOptions) obj;
            if (Objects.equal(Integer.valueOf(this.environment), Integer.valueOf(walletOptions.environment)) && Objects.equal(Integer.valueOf(this.theme), Integer.valueOf(walletOptions.theme)) && Objects.equal(null, null) && Objects.equal(Boolean.valueOf(this.zzet), Boolean.valueOf(walletOptions.zzet))) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hashCode(Integer.valueOf(this.environment), Integer.valueOf(this.theme), null, Boolean.valueOf(this.zzet));
        }

        /* synthetic */ WalletOptions(Builder builder, zzaq zzaq) {
            this(builder);
        }
    }

    public static abstract class zza<R extends Result> extends ApiMethodImpl<R, zzaf> {
        public zza(GoogleApiClient googleApiClient) {
            super(Wallet.API, googleApiClient);
        }

        @VisibleForTesting
        /* renamed from: zza */
        public abstract void doExecute(zzaf zzaf);
    }

    public static abstract class zzb extends zza<Status> {
        public zzb(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* Access modifiers changed, original: protected|synthetic */
        public /* synthetic */ Result createFailedResult(Status status) {
            return status;
        }
    }

    public static PaymentsClient getPaymentsClient(@NonNull Activity activity, @NonNull WalletOptions walletOptions) {
        return new PaymentsClient(activity, walletOptions);
    }

    public static PaymentsClient getPaymentsClient(@NonNull Context context, @NonNull WalletOptions walletOptions) {
        return new PaymentsClient(context, walletOptions);
    }

    public static WalletObjectsClient getWalletObjectsClient(@NonNull Activity activity, @Nullable WalletOptions walletOptions) {
        return new WalletObjectsClient(activity, walletOptions);
    }

    private Wallet() {
    }
}
