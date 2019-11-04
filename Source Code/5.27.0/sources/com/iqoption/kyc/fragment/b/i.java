package com.iqoption.kyc.fragment.b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager.OnBackStackChangedListener;
import androidx.recyclerview.widget.ItemTouchHelper.Callback;
import com.iqoption.core.d;
import com.iqoption.core.ui.fragment.b;
import com.iqoption.kyc.document.jumio.JumioException;
import com.iqoption.kyc.k;
import com.iqoption.kyc.s;
import com.iqoption.util.t;
import com.iqoption.util.y;
import com.jumio.MobileSDK;
import com.jumio.analytics.MobileEvents;
import com.jumio.core.enums.JumioDataCenter;
import com.jumio.core.exceptions.PlatformNotSupportedException;
import com.jumio.nv.NetverifyDocumentData;
import com.jumio.nv.NetverifySDK;

/* compiled from: KycNetverifyFragment */
public class i extends Fragment implements b {
    public static final String TAG = "com.iqoption.kyc.fragment.b.i";
    private String boV;
    private String buH;
    private y dxL;
    private com.iqoption.util.y.a dxN = new com.iqoption.util.y.a() {
        public void onKeyboardVisibilityChanged(boolean z) {
            if (z && i.this.isAdded() && t.a(i.this.getFragmentManager(), i.TAG)) {
                y.j(i.this.getActivity());
            }
        }
    };
    private OnBackStackChangedListener dxW = new OnBackStackChangedListener() {
        public void onBackStackChanged() {
            if (t.a(i.this.getFragmentManager(), i.TAG)) {
                i.this.aLm();
            }
        }
    };
    private String dyL;
    private String dyM;
    private k dyQ;
    private Boolean dyS;
    private Boolean dyT;
    private NetverifySDK dyU;
    private a dyV;
    private Long userId;

    /* compiled from: KycNetverifyFragment */
    public interface a {
        void a(String str, String str2, boolean z, int i);
    }

    public static i a(String str, String str2, String str3, String str4, Long l) {
        i iVar = new i();
        Bundle bundle = new Bundle();
        bundle.putString("KEY_API_TOKEN", str);
        bundle.putString("KEY_API_SECRET", str2);
        bundle.putString("KEY_MERCHANT_SCAN_REFERENCE", str4);
        bundle.putString("KEY_CALLBACK_URL", str3);
        bundle.putBoolean("KEY_ID_VERIFICATION", true);
        bundle.putLong("KEY_USER_ID", l.longValue());
        iVar.setArguments(bundle);
        return iVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.dyL = arguments.getString("KEY_API_TOKEN");
            this.dyM = arguments.getString("KEY_API_SECRET");
            String str = "KEY_USER_ID";
            this.userId = arguments.containsKey(str) ? Long.valueOf(arguments.getLong(str)) : null;
            str = "KEY_MERCHANT_SCAN_REFERENCE";
            this.buH = arguments.containsKey(str) ? arguments.getString(str) : null;
            str = "KEY_CALLBACK_URL";
            this.boV = arguments.containsKey(str) ? arguments.getString(str) : null;
            str = "KEY_ID_VERIFICATION";
            this.dyS = arguments.containsKey(str) ? Boolean.valueOf(arguments.getBoolean(str)) : null;
            str = "KEY_FACE_MATCH";
            this.dyT = arguments.containsKey(str) ? Boolean.valueOf(arguments.getBoolean(str)) : null;
        }
        this.dxL = new y(getActivity());
        aLm();
        com.iqoption.core.c.a.biN.execute(new Runnable() {
            public void run() {
                FragmentManager fragmentManager = i.this.getFragmentManager();
                if (i.this.aLo()) {
                    i.this.dyQ.a(i.this.dyU, MobileEvents.EVENTTYPE_ANDROID_LIFECYCLE);
                } else if (fragmentManager != null) {
                    fragmentManager.popBackStack();
                }
            }
        });
        return null;
    }

    private void aLm() {
        s.a((AppCompatActivity) getActivity());
    }

    public void onStart() {
        super.onStart();
        y.a(this.dxN);
    }

    public void onStop() {
        super.onStop();
        y.b(this.dxN);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        StringBuilder stringBuilder;
        if (context instanceof a) {
            this.dyV = (a) context;
            if (context instanceof k) {
                this.dyQ = (k) context;
                return;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(context.toString());
            stringBuilder.append(" must implement KycStartJumio");
            throw new RuntimeException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onDetach() {
        super.onDetach();
        this.dyV = null;
    }

    private boolean aLo() {
        try {
            MobileSDK.isRooted(getActivity());
            this.dyU = NetverifySDK.create(getActivity(), this.dyL, this.dyM, JumioDataCenter.EU);
            if (this.dyS != null) {
                this.dyU.setRequireVerification(this.dyS.booleanValue());
            }
            if (this.buH != null) {
                this.dyU.setMerchantScanReference(this.buH);
            }
            if (this.userId != null) {
                this.dyU.setCustomerId(this.userId.toString());
            }
            if (this.boV != null) {
                this.dyU.setCallbackUrl(this.boV);
            }
            if (this.dyT != null) {
                this.dyU.setRequireFaceMatch(this.dyT.booleanValue());
            }
            return true;
        } catch (PlatformNotSupportedException e) {
            com.crashlytics.android.a.ag("Jumio Netverify initializeNetverifySDK error. Platform is not supported");
            com.crashlytics.android.a.d(e);
            d.z("This platform is not supported", 1);
            return false;
        } catch (Exception e2) {
            com.crashlytics.android.a.ag("Jumio Netverify initializeNetverifySDK error");
            com.crashlytics.android.a.d(e2);
            com.iqoption.app.a.b.aQ(getContext());
            return false;
        }
    }

    public void a(com.iqoption.core.ui.fragment.a aVar) {
        if (aVar.alr() == NetverifySDK.REQUEST_CODE) {
            Intent als = aVar.als();
            int resultCode = aVar.getResultCode();
            if (als != null) {
                String stringExtra;
                if (resultCode == -1) {
                    stringExtra = als.getStringExtra(NetverifySDK.EXTRA_SCAN_REFERENCE);
                    NetverifyDocumentData netverifyDocumentData = (NetverifyDocumentData) als.getParcelableExtra(NetverifySDK.EXTRA_SCAN_DATA);
                    if (netverifyDocumentData != null) {
                        netverifyDocumentData.getMrzData();
                    }
                    com.iqoption.kyc.a.a.a(true, null, true);
                    this.dyV.a(this.buH, stringExtra, false, 0);
                } else if (resultCode == 0) {
                    stringExtra = als.getStringExtra(NetverifySDK.EXTRA_ERROR_MESSAGE);
                    int intExtra = als.getIntExtra(NetverifySDK.EXTRA_ERROR_CODE, 0);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Jumio Netverify error. errorMessage=");
                    stringBuilder.append(stringExtra);
                    stringBuilder.append("; errorCode=");
                    stringBuilder.append(intExtra);
                    String stringBuilder2 = stringBuilder.toString();
                    if (intExtra != Callback.DEFAULT_SWIPE_ANIMATION_DURATION) {
                        com.crashlytics.android.a.d(new JumioException(stringBuilder2));
                    }
                    com.iqoption.kyc.a.a.a(false, stringExtra, true);
                    com.iqoption.kyc.a.a.w(stringExtra, true);
                    this.dyV.a(this.buH, null, true, intExtra);
                }
                NetverifySDK netverifySDK = this.dyU;
                if (netverifySDK != null) {
                    netverifySDK.destroy();
                    this.dyU = null;
                }
            }
        }
    }
}
