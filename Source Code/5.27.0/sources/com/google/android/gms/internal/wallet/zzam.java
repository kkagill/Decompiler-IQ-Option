package com.google.android.gms.internal.wallet;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamic.IFragmentWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

public final class zzam extends RemoteCreator<zzu> {
    private static zzam zzgn;

    public static zzn zza(Activity activity, IFragmentWrapper iFragmentWrapper, WalletFragmentOptions walletFragmentOptions, zzq zzq) {
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(activity, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        if (isGooglePlayServicesAvailable == 0) {
            try {
                if (zzgn == null) {
                    zzgn = new zzam();
                }
                return ((zzu) zzgn.getRemoteCreatorInstance(activity)).zza(ObjectWrapper.wrap(activity), iFragmentWrapper, walletFragmentOptions, zzq);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            } catch (RemoteCreatorException e2) {
                throw new RuntimeException(e2);
            }
        }
        throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
    }

    protected zzam() {
        super("com.google.android.gms.wallet.dynamite.WalletDynamiteCreatorImpl");
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
        if (queryLocalInterface instanceof zzu) {
            return (zzu) queryLocalInterface;
        }
        return new zzv(iBinder);
    }
}
