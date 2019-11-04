package com.jumio.nv.nfc.core;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.nfc.Tag;
import androidx.annotation.NonNull;
import com.jumio.commons.log.Log;
import com.jumio.core.mvp.model.PublisherWithUpdate;
import com.jumio.core.mvp.model.SubscriberWithUpdate;
import com.jumio.nv.extraction.NfcController;
import com.jumio.nv.models.ServerSettingsModel;
import com.jumio.nv.nfc.core.communication.TagAccessSpec;
import java.security.Security;
import java.security.cert.CertificateException;
import jumio.nv.nfc.e;
import jumio.nv.nfc.g;
import jumio.nv.nfc.h;
import jumio.nv.nfc.j;
import jumio.nv.nfc.o;
import org.spongycastle.jce.provider.BouncyCastleProvider;

public class NfcControllerImpl extends PublisherWithUpdate<o, o> implements NfcController {
    private static final int PENDING_INTENT_NFC_SETTINGS = 11;
    private static final int PENDING_INTENT_NFC_TECH_DETECTED = 10;
    private static final String TAG = "NfcControllerImp";
    private j mAuthenticator;
    private Context mContext;
    private h mDatabase;
    boolean mForegroundDispatchActive;
    private boolean mIsActive;
    private transient NfcAdapter mNfcAdapter;
    private TagAccessSpec mTagAccess;

    class a implements SubscriberWithUpdate<o, o> {
        private a() {
        }

        /* renamed from: a */
        public void onUpdate(o oVar) {
            NfcControllerImpl.this.publishUpdate(oVar);
        }

        /* renamed from: b */
        public void onResult(o oVar) {
            NfcControllerImpl.this.publishResult(oVar);
        }

        public void onError(Throwable th) {
            NfcControllerImpl.this.publishError(th);
        }
    }

    private void initSecurityProviders() {
    }

    public void stop() {
    }

    public NfcControllerImpl(@NonNull Context context) {
        this(context, null);
    }

    NfcControllerImpl(@NonNull Context context, TagAccessSpec tagAccessSpec) {
        this.mForegroundDispatchActive = false;
        this.mIsActive = false;
        this.mContext = context;
        this.mTagAccess = tagAccessSpec;
        Security.insertProviderAt(new BouncyCastleProvider(), 1);
    }

    public void downloadCertificates(ServerSettingsModel serverSettingsModel) {
        if (serverSettingsModel != null && serverSettingsModel.isCdnUsable()) {
            try {
                this.mDatabase = new h(serverSettingsModel);
            } catch (CertificateException unused) {
                this.mDatabase = null;
            }
        }
    }

    public void start(Activity activity) {
        enableForegroundDispatch(activity, 10);
    }

    public void pause(Activity activity) {
        disableForegroundDispatch(activity);
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void enableForegroundDispatch(Activity activity, int i) {
        if (!this.mForegroundDispatchActive) {
            this.mForegroundDispatchActive = true;
            initNfcAdapter();
            if (this.mNfcAdapter != null) {
                Intent intent = new Intent();
                intent.addFlags(536870912);
                PendingIntent createPendingResult = activity.createPendingResult(i, intent, 0);
                if (createPendingResult != null) {
                    try {
                        this.mNfcAdapter.enableForegroundDispatch(activity, createPendingResult, new IntentFilter[]{new IntentFilter("android.nfc.action.TECH_DISCOVERED"), new IntentFilter("android.nfc.action.TAG_DISCOVERED")}, new String[][]{new String[]{"android.nfc.tech.IsoDep"}});
                    } catch (Exception e) {
                        Log.printStackTrace(e);
                    }
                }
            }
        } else {
            return;
        }
        return;
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void disableForegroundDispatch(Activity activity) {
        this.mForegroundDispatchActive = false;
        initNfcAdapter();
        if (this.mNfcAdapter != null) {
            try {
                this.mNfcAdapter.disableForegroundDispatch(activity);
            } catch (Exception e) {
                Log.printStackTrace(e);
            }
        }
        return;
    }

    public synchronized boolean isNfcEnabled() {
        boolean z;
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this.mContext);
        z = defaultAdapter != null && defaultAdapter.isEnabled();
        return z;
    }

    /* Access modifiers changed, original: protected */
    public void tagDetected(g gVar, TagAccessSpec tagAccessSpec) {
        j jVar = this.mAuthenticator;
        if (jVar == null || !jVar.a()) {
            this.mAuthenticator = new j(this.mDatabase, gVar, tagAccessSpec);
            this.mAuthenticator.subscribe(new a());
            this.mAuthenticator.b();
        }
    }

    public boolean hasRootCertificate(String str) {
        h hVar = this.mDatabase;
        return hVar != null && hVar.a(str);
    }

    public boolean hasNfcFeature() {
        return this.mContext.getPackageManager().hasSystemFeature("android.hardware.nfc");
    }

    public boolean consumeIntent(int i, Intent intent) {
        if (!this.mIsActive) {
            return false;
        }
        if (i != 10) {
            if (i != 11) {
            }
            return false;
        }
        resolveIntent(intent);
        return true;
    }

    public void setTagAccess(Object obj) {
        if (obj instanceof TagAccessSpec) {
            this.mTagAccess = (TagAccessSpec) obj;
            return;
        }
        throw new IllegalArgumentException("accessSpec must be of type TagAccessSpec");
    }

    public void setEnabled(boolean z) {
        this.mIsActive = z;
    }

    private void resolveIntent(Intent intent) {
        if (this.mTagAccess != null) {
            String action = intent.getAction();
            String str = "android.nfc.extra.TAG";
            if ("android.nfc.action.TECH_DISCOVERED".equals(action) && (intent.getFlags() & 1048576) == 0) {
                tagDetected(new g((Tag) intent.getParcelableExtra(str)), this.mTagAccess);
                return;
            } else if ("android.nfc.action.TAG_DISCOVERED".equals(action) && (intent.getFlags() & 1048576) == 0) {
                tagDetected(new g((Tag) intent.getParcelableExtra(str)), this.mTagAccess);
                return;
            } else {
                return;
            }
        }
        throw new e("NFC tag access was null! Call NfcController.setTagAccess() before starting the scan!");
    }

    private synchronized void initNfcAdapter() {
        NfcManager nfcManager = (NfcManager) this.mContext.getSystemService("nfc");
        if (nfcManager != null) {
            this.mNfcAdapter = nfcManager.getDefaultAdapter();
        }
        if (this.mNfcAdapter != null) {
            try {
                this.mNfcAdapter.isEnabled();
            } catch (Exception e) {
                Log.printStackTrace(e);
            }
            try {
                this.mNfcAdapter.isEnabled();
            } catch (Exception e2) {
                Log.printStackTrace(e2);
            }
        }
        return;
    }
}
