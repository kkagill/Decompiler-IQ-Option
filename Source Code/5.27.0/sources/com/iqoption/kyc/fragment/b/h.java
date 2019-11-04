package com.iqoption.kyc.fragment.b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
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
import com.jumio.dv.DocumentVerificationSDK;

/* compiled from: KycMultiDocumentFragment */
public class h extends Fragment implements b {
    public static final String TAG = "com.iqoption.kyc.fragment.b.h";
    private String boV;
    private String buH;
    private String documentType;
    private y dxL;
    private com.iqoption.util.y.a dxN = new com.iqoption.util.y.a() {
        public void onKeyboardVisibilityChanged(boolean z) {
            if (z && h.this.isAdded() && t.a(h.this.getFragmentManager(), h.TAG)) {
                y.j(h.this.getActivity());
            }
        }
    };
    private OnBackStackChangedListener dxW = new OnBackStackChangedListener() {
        public void onBackStackChanged() {
            if (t.a(h.this.getFragmentManager(), h.TAG)) {
                h.this.aLm();
            }
        }
    };
    private String dyL;
    private String dyM;
    private String dyN;
    private DocumentVerificationSDK dyO;
    private a dyP;
    private k dyQ;
    private Long userId;

    /* compiled from: KycMultiDocumentFragment */
    public interface a {
        void b(String str, String str2, boolean z, int i);
    }

    public static h a(String str, String str2, String str3, String str4, String str5, String str6, Long l) {
        h hVar = new h();
        Bundle bundle = new Bundle();
        bundle.putString("KEY_API_TOKEN", str);
        bundle.putString("KEY_API_SECRET", str2);
        bundle.putString("KEY_DOCUMENT_TYPE", str4);
        bundle.putString("KEY_ISO_COUNTRY", str5);
        bundle.putString("KEY_MERCHANT_SCAN_REFERENCE", str6);
        bundle.putString("KEY_CALLBACK_URL", str3);
        bundle.putLong("KEY_USER_ID", l.longValue());
        hVar.setArguments(bundle);
        return hVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.dyL = arguments.getString("KEY_API_TOKEN");
            this.dyM = arguments.getString("KEY_API_SECRET");
            this.documentType = arguments.getString("KEY_DOCUMENT_TYPE");
            this.dyN = arguments.getString("KEY_ISO_COUNTRY");
            String str = "KEY_MERCHANT_SCAN_REFERENCE";
            this.buH = arguments.containsKey(str) ? arguments.getString(str) : null;
            str = "KEY_USER_ID";
            this.userId = arguments.containsKey(str) ? Long.valueOf(arguments.getLong(str)) : null;
            str = "KEY_CALLBACK_URL";
            this.boV = arguments.containsKey(str) ? arguments.getString(str) : null;
            String str2 = this.dyN;
            if (str2 != null) {
                str2.length();
            }
        }
        this.dxL = new y(getActivity());
        aLm();
        com.iqoption.core.c.a.biN.execute(new Runnable() {
            public void run() {
                if (h.this.aLn()) {
                    h.this.dyQ.a(h.this.dyO, MobileEvents.EVENTTYPE_USERACTION);
                } else {
                    h.this.getFragmentManager().popBackStack();
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
            this.dyP = (a) context;
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
        this.dyP = null;
    }

    public void onDestroyView() {
        getFragmentManager().removeOnBackStackChangedListener(this.dxW);
        super.onDestroyView();
    }

    private boolean aLn() {
        try {
            DocumentVerificationSDK.isSupportedPlatform(getContext());
            MobileSDK.isRooted(getActivity());
            this.dyO = DocumentVerificationSDK.create(getActivity(), this.dyL, this.dyM, JumioDataCenter.EU);
            this.dyO.setType(this.documentType);
            this.dyO.setCountry(this.dyN);
            if (this.buH != null) {
                this.dyO.setMerchantScanReference(this.buH);
            }
            if (this.userId != null) {
                this.dyO.setCustomerId(this.userId.toString());
            }
            if ("CUSTOM".equals(this.documentType)) {
                this.dyO.setCustomDocumentCode("OTHER");
            }
            if (this.boV != null) {
                this.dyO.setCallbackUrl(this.boV);
            }
            return true;
        } catch (PlatformNotSupportedException e) {
            com.crashlytics.android.a.ag("Jumio MultiDocument initializeNetverifySDK error. Platform is not supported");
            com.crashlytics.android.a.d(e);
            d.z("This platform is not supported", 1);
            return false;
        } catch (Exception e2) {
            com.crashlytics.android.a.ag("Jumio MultiDocument initializeNetverifySDK error");
            com.crashlytics.android.a.d(e2);
            com.iqoption.app.a.b.Gq();
            return false;
        }
    }

    public void a(com.iqoption.core.ui.fragment.a aVar) {
        int resultCode = aVar.getResultCode();
        int alr = aVar.alr();
        Intent als = aVar.als();
        if (alr == DocumentVerificationSDK.REQUEST_CODE && als != null) {
            if (resultCode == -1) {
                String stringExtra = als.getStringExtra(DocumentVerificationSDK.EXTRA_SCAN_REFERENCE);
                com.iqoption.kyc.a.a.a(true, null, true);
                this.dyP.b(this.buH, stringExtra, false, 0);
            } else if (resultCode == 0) {
                String stringExtra2 = als.getStringExtra(DocumentVerificationSDK.EXTRA_ERROR_MESSAGE);
                int intExtra = als.getIntExtra(DocumentVerificationSDK.EXTRA_ERROR_CODE, 0);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Jumio Multidocument error. errorMessage=");
                stringBuilder.append(stringExtra2);
                stringBuilder.append("; errorCode=");
                stringBuilder.append(intExtra);
                String stringBuilder2 = stringBuilder.toString();
                if (intExtra != Callback.DEFAULT_SWIPE_ANIMATION_DURATION) {
                    com.crashlytics.android.a.d(new JumioException(stringBuilder2));
                }
                com.iqoption.kyc.a.a.a(false, stringExtra2, true);
                com.iqoption.kyc.a.a.w(stringExtra2, true);
                this.dyP.b(this.buH, null, true, intExtra);
            }
            DocumentVerificationSDK documentVerificationSDK = this.dyO;
            if (documentVerificationSDK != null) {
                documentVerificationSDK.destroy();
                this.dyO = null;
            }
        }
    }
}
