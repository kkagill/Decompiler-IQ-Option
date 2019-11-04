package com.google.android.gms.wallet.fragment;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.FragmentWrapper;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.internal.wallet.zzam;
import com.google.android.gms.internal.wallet.zzn;
import com.google.android.gms.internal.wallet.zzr;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.R;

@TargetApi(12)
public final class WalletFragment extends Fragment {
    private boolean zzfe = false;
    private WalletFragmentOptions zzfi;
    private WalletFragmentInitParams zzfj;
    private MaskedWalletRequest zzfk;
    private MaskedWallet zzfl;
    private Boolean zzfm;
    private zzb zzfr;
    private final FragmentWrapper zzfs = FragmentWrapper.wrap(this);
    private final zzc zzft = new zzc(this, null);
    private zza zzfu = new zza(this);
    private final Fragment zzfv = this;

    public interface OnStateChangedListener {
        void onStateChanged(WalletFragment walletFragment, int i, int i2, Bundle bundle);
    }

    private static class zzb implements LifecycleDelegate {
        private final zzn zzfp;

        private zzb(zzn zzn) {
            this.zzfp = zzn;
        }

        public final void onDestroy() {
        }

        public final void onDestroyView() {
        }

        public final void onLowMemory() {
        }

        private final void initialize(WalletFragmentInitParams walletFragmentInitParams) {
            try {
                this.zzfp.initialize(walletFragmentInitParams);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        private final void setEnabled(boolean z) {
            try {
                this.zzfp.setEnabled(z);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        private final void updateMaskedWalletRequest(MaskedWalletRequest maskedWalletRequest) {
            try {
                this.zzfp.updateMaskedWalletRequest(maskedWalletRequest);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        private final void updateMaskedWallet(MaskedWallet maskedWallet) {
            try {
                this.zzfp.updateMaskedWallet(maskedWallet);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        private final int getState() {
            try {
                return this.zzfp.getState();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public final void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                this.zzfp.zza(ObjectWrapper.wrap(activity), (WalletFragmentOptions) bundle.getParcelable("extraWalletFragmentOptions"), bundle2);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public final void onCreate(Bundle bundle) {
            try {
                this.zzfp.onCreate(bundle);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                return (View) ObjectWrapper.unwrap(this.zzfp.onCreateView(ObjectWrapper.wrap(layoutInflater), ObjectWrapper.wrap(viewGroup), bundle));
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public final void onStart() {
            try {
                this.zzfp.onStart();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public final void onResume() {
            try {
                this.zzfp.onResume();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public final void onPause() {
            try {
                this.zzfp.onPause();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public final void onStop() {
            try {
                this.zzfp.onStop();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        public final void onSaveInstanceState(Bundle bundle) {
            try {
                this.zzfp.onSaveInstanceState(bundle);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        private final void onActivityResult(int i, int i2, Intent intent) {
            try {
                this.zzfp.onActivityResult(i, i2, intent);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        /* synthetic */ zzb(zzn zzn, zzb zzb) {
            this(zzn);
        }
    }

    private class zzc extends DeferredLifecycleHelper<zzb> implements OnClickListener {
        private zzc() {
        }

        /* Access modifiers changed, original: protected|final */
        public final void createDelegate(OnDelegateCreatedListener<zzb> onDelegateCreatedListener) {
            Activity activity = WalletFragment.this.zzfv.getActivity();
            if (WalletFragment.this.zzfr == null && WalletFragment.this.zzfe && activity != null) {
                try {
                    WalletFragment.this.zzfr = new zzb(zzam.zza(activity, WalletFragment.this.zzfs, WalletFragment.this.zzfi, WalletFragment.this.zzfu), null);
                    WalletFragment.this.zzfi = null;
                    onDelegateCreatedListener.onDelegateCreated(WalletFragment.this.zzfr);
                    if (WalletFragment.this.zzfj != null) {
                        WalletFragment.this.zzfr.initialize(WalletFragment.this.zzfj);
                        WalletFragment.this.zzfj = null;
                    }
                    if (WalletFragment.this.zzfk != null) {
                        WalletFragment.this.zzfr.updateMaskedWalletRequest(WalletFragment.this.zzfk);
                        WalletFragment.this.zzfk = null;
                    }
                    if (WalletFragment.this.zzfl != null) {
                        WalletFragment.this.zzfr.updateMaskedWallet(WalletFragment.this.zzfl);
                        WalletFragment.this.zzfl = null;
                    }
                    if (WalletFragment.this.zzfm != null) {
                        WalletFragment.this.zzfr.setEnabled(WalletFragment.this.zzfm.booleanValue());
                        WalletFragment.this.zzfm = null;
                    }
                } catch (GooglePlayServicesNotAvailableException unused) {
                }
            }
        }

        /* Access modifiers changed, original: protected|final */
        public final void handleGooglePlayUnavailable(FrameLayout frameLayout) {
            Button button = new Button(WalletFragment.this.zzfv.getActivity());
            button.setText(R.string.wallet_buy_button_place_holder);
            int i = -2;
            int i2 = -1;
            if (WalletFragment.this.zzfi != null) {
                WalletFragmentStyle fragmentStyle = WalletFragment.this.zzfi.getFragmentStyle();
                if (fragmentStyle != null) {
                    DisplayMetrics displayMetrics = WalletFragment.this.zzfv.getResources().getDisplayMetrics();
                    i2 = fragmentStyle.zza("buyButtonWidth", displayMetrics, -1);
                    i = fragmentStyle.zza("buyButtonHeight", displayMetrics, -2);
                }
            }
            button.setLayoutParams(new LayoutParams(i2, i));
            button.setOnClickListener(this);
            frameLayout.addView(button);
        }

        public final void onClick(View view) {
            Activity activity = WalletFragment.this.zzfv.getActivity();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(activity, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE), activity, -1);
        }

        /* synthetic */ zzc(WalletFragment walletFragment, zzb zzb) {
            this();
        }
    }

    static class zza extends zzr {
        private OnStateChangedListener zzfw;
        private final WalletFragment zzfx;

        zza(WalletFragment walletFragment) {
            this.zzfx = walletFragment;
        }

        public final void zza(int i, int i2, Bundle bundle) {
            OnStateChangedListener onStateChangedListener = this.zzfw;
            if (onStateChangedListener != null) {
                onStateChangedListener.onStateChanged(this.zzfx, i, i2, bundle);
            }
        }

        public final void zza(OnStateChangedListener onStateChangedListener) {
            this.zzfw = onStateChangedListener;
        }
    }

    public static WalletFragment newInstance(WalletFragmentOptions walletFragmentOptions) {
        WalletFragment walletFragment = new WalletFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extraWalletFragmentOptions", walletFragmentOptions);
        walletFragment.zzfv.setArguments(bundle);
        return walletFragment;
    }

    public final void initialize(WalletFragmentInitParams walletFragmentInitParams) {
        zzb zzb = this.zzfr;
        if (zzb != null) {
            zzb.initialize(walletFragmentInitParams);
            this.zzfj = null;
            return;
        }
        String str = "WalletFragment";
        if (this.zzfj == null) {
            this.zzfj = walletFragmentInitParams;
            if (this.zzfk != null) {
                Log.w(str, "updateMaskedWalletRequest() was called before initialize()");
            }
            if (this.zzfl != null) {
                Log.w(str, "updateMaskedWallet() was called before initialize()");
                return;
            }
        }
        Log.w(str, "initialize(WalletFragmentInitParams) was called more than once. Ignoring.");
    }

    public final void updateMaskedWalletRequest(MaskedWalletRequest maskedWalletRequest) {
        zzb zzb = this.zzfr;
        if (zzb != null) {
            zzb.updateMaskedWalletRequest(maskedWalletRequest);
            this.zzfk = null;
            return;
        }
        this.zzfk = maskedWalletRequest;
    }

    public final void updateMaskedWallet(MaskedWallet maskedWallet) {
        zzb zzb = this.zzfr;
        if (zzb != null) {
            zzb.updateMaskedWallet(maskedWallet);
            this.zzfl = null;
            return;
        }
        this.zzfl = maskedWallet;
    }

    public final void setEnabled(boolean z) {
        zzb zzb = this.zzfr;
        if (zzb != null) {
            zzb.setEnabled(z);
            this.zzfm = null;
            return;
        }
        this.zzfm = Boolean.valueOf(z);
    }

    public final void setOnStateChangedListener(OnStateChangedListener onStateChangedListener) {
        this.zzfu.zza(onStateChangedListener);
    }

    public final int getState() {
        zzb zzb = this.zzfr;
        return zzb != null ? zzb.getState() : 0;
    }

    public final void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        if (this.zzfi == null) {
            this.zzfi = WalletFragmentOptions.zza((Context) activity, attributeSet);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("attrKeyWalletFragmentOptions", this.zzfi);
        this.zzft.onInflate(activity, bundle2, bundle);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            bundle.setClassLoader(WalletFragmentOptions.class.getClassLoader());
            WalletFragmentInitParams walletFragmentInitParams = (WalletFragmentInitParams) bundle.getParcelable("walletFragmentInitParams");
            if (walletFragmentInitParams != null) {
                if (this.zzfj != null) {
                    Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
                }
                this.zzfj = walletFragmentInitParams;
            }
            if (this.zzfk == null) {
                this.zzfk = (MaskedWalletRequest) bundle.getParcelable("maskedWalletRequest");
            }
            if (this.zzfl == null) {
                this.zzfl = (MaskedWallet) bundle.getParcelable("maskedWallet");
            }
            String str = "walletFragmentOptions";
            if (bundle.containsKey(str)) {
                this.zzfi = (WalletFragmentOptions) bundle.getParcelable(str);
            }
            str = "enabled";
            if (bundle.containsKey(str)) {
                this.zzfm = Boolean.valueOf(bundle.getBoolean(str));
            }
        } else if (this.zzfv.getArguments() != null) {
            WalletFragmentOptions walletFragmentOptions = (WalletFragmentOptions) this.zzfv.getArguments().getParcelable("extraWalletFragmentOptions");
            if (walletFragmentOptions != null) {
                walletFragmentOptions.zza(this.zzfv.getActivity());
                this.zzfi = walletFragmentOptions;
            }
        }
        this.zzfe = true;
        this.zzft.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.zzft.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public final void onStart() {
        super.onStart();
        this.zzft.onStart();
    }

    public final void onResume() {
        super.onResume();
        this.zzft.onResume();
        FragmentManager fragmentManager = this.zzfv.getActivity().getFragmentManager();
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(GooglePlayServicesUtil.GMS_ERROR_DIALOG);
        if (findFragmentByTag != null) {
            fragmentManager.beginTransaction().remove(findFragmentByTag).commit();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.zzfv.getActivity(), GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE), this.zzfv.getActivity(), -1);
        }
    }

    public final void onPause() {
        super.onPause();
        this.zzft.onPause();
    }

    public final void onStop() {
        super.onStop();
        this.zzft.onStop();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(WalletFragmentOptions.class.getClassLoader());
        this.zzft.onSaveInstanceState(bundle);
        WalletFragmentInitParams walletFragmentInitParams = this.zzfj;
        if (walletFragmentInitParams != null) {
            bundle.putParcelable("walletFragmentInitParams", walletFragmentInitParams);
            this.zzfj = null;
        }
        MaskedWalletRequest maskedWalletRequest = this.zzfk;
        if (maskedWalletRequest != null) {
            bundle.putParcelable("maskedWalletRequest", maskedWalletRequest);
            this.zzfk = null;
        }
        MaskedWallet maskedWallet = this.zzfl;
        if (maskedWallet != null) {
            bundle.putParcelable("maskedWallet", maskedWallet);
            this.zzfl = null;
        }
        WalletFragmentOptions walletFragmentOptions = this.zzfi;
        if (walletFragmentOptions != null) {
            bundle.putParcelable("walletFragmentOptions", walletFragmentOptions);
            this.zzfi = null;
        }
        Boolean bool = this.zzfm;
        if (bool != null) {
            bundle.putBoolean("enabled", bool.booleanValue());
            this.zzfm = null;
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.zzfe = false;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        zzb zzb = this.zzfr;
        if (zzb != null) {
            zzb.onActivityResult(i, i2, intent);
        }
    }
}
