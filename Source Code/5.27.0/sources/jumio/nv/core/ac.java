package jumio.nv.core;

import android.content.Context;
import android.os.Handler;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.jumio.analytics.JumioAnalytics;
import com.jumio.analytics.MobileEvents;
import com.jumio.commons.log.Log;
import com.jumio.core.data.document.ScanSide;
import com.jumio.core.mvp.model.InvokeOnUiThread;
import com.jumio.core.mvp.model.Subscriber;
import com.jumio.core.mvp.presenter.Presenter;
import com.jumio.nv.NetverifyDocumentData;
import com.jumio.nv.api.calls.NVBackend;
import com.jumio.nv.api.helpers.UploadManager;
import com.jumio.nv.models.AdditionalDataPointsModel;
import com.jumio.nv.models.DocumentDataModel;
import com.jumio.nv.models.InitiateModel;
import com.jumio.nv.models.OfflineDataModel;
import com.jumio.nv.models.SelectionModel;
import com.jumio.nv.models.ServerSettingsModel;
import com.jumio.nv.models.UploadDataModel;
import com.jumio.nv.view.interactors.UploadView;
import com.jumio.persistence.DataAccess;
import com.jumio.sdk.exception.JumioError;
import com.jumio.sdk.models.CredentialsModel;
import java.io.Serializable;

/* compiled from: UploadPresenter */
public class ac extends Presenter<UploadView> {
    private UploadManager a;
    private b b;
    private a c;
    private boolean d;

    /* compiled from: UploadPresenter */
    class a implements Subscriber<Void> {
        private a() {
        }

        /* synthetic */ a(ac acVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        /* renamed from: a */
        public void onResult(Void voidR) {
            if (ac.this.isActive()) {
                Log.d("UploadPresenter", "finalize call finished");
                ((UploadView) ac.this.getView()).uploadComplete();
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        ac.this.a();
                    }
                }, (long) ((UploadView) ac.this.getView()).getCloseDelay());
            }
        }

        public void onError(Throwable th) {
            if (ac.this.isActive()) {
                Log.d("UploadPresenter", "finalize call finished");
                ac.this.a.onError(th, g.class);
            }
        }
    }

    /* compiled from: UploadPresenter */
    class b implements Subscriber<String> {
        private b() {
        }

        /* synthetic */ b(ac acVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        @InvokeOnUiThread
        /* renamed from: a */
        public void onResult(String str) {
            if (!ac.this.isActive()) {
            }
        }

        @InvokeOnUiThread
        public void onError(Throwable th) {
            if (ac.this.isActive()) {
                ac.this.a.onError(th, h.class);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        Log.i("UploadPresenter", "registering for updates");
        SelectionModel selectionModel = (SelectionModel) DataAccess.load(((UploadView) getView()).getContext(), SelectionModel.class);
        ServerSettingsModel serverSettingsModel = (ServerSettingsModel) DataAccess.load(((UploadView) getView()).getContext(), ServerSettingsModel.class);
        if (selectionModel != null && serverSettingsModel != null) {
            if (selectionModel.isVerificationRequired() && serverSettingsModel.isAdditionalDataPointsEnabled()) {
                Serializable serializable = (AdditionalDataPointsModel) DataAccess.load(((UploadView) getView()).getContext(), AdditionalDataPointsModel.class);
                if (serializable == null) {
                    serializable = new AdditionalDataPointsModel();
                }
                serializable.setCountryForIp(serverSettingsModel.getCountryForIp());
                DocumentDataModel documentDataModel = (DocumentDataModel) DataAccess.load(((UploadView) getView()).getContext(), DocumentDataModel.class);
                if (documentDataModel == null || documentDataModel.getIssuingCountry() == null) {
                    serializable.setIssuingCountry(selectionModel.getSelectedCountry().getIsoCode());
                } else {
                    serializable.setIssuingCountry(documentDataModel.getIssuingCountry());
                }
                DataAccess.update(((UploadView) getView()).getContext(), AdditionalDataPointsModel.class, serializable);
                serializable.setNumberOfCancels(ad.a(((UploadView) getView()).getContext(), "Jumio05"));
                serializable.setNumberOfRetakes(ad.a(((UploadView) getView()).getContext(), "Jumio03"));
                serializable.setNumberOfVerifications(ad.a(((UploadView) getView()).getContext(), "Jumio04"));
                long j = 0;
                try {
                    j = (System.currentTimeMillis() - ad.d(((UploadView) getView()).getContext())) / 1000;
                } catch (Exception e) {
                    Log.printStackTrace(e);
                }
                serializable.setSecondsInSdk((int) j);
                JumioAnalytics.add(MobileEvents.additionalData(JumioAnalytics.getSessionId(), serializable.getAdditionalDataPointsMap()));
            }
            Context context = ((UploadView) getView()).getContext();
            ScanSide sideToScan = selectionModel.getUploadModel().getActivePart().getSideToScan();
            CredentialsModel credentialsModel = ((UploadView) getView()).getCredentialsModel();
            boolean z = selectionModel != null && selectionModel.isVerificationRequired();
            this.a = new UploadManager(context, sideToScan, credentialsModel, z);
            this.a.add(new Subscriber<Boolean>() {
                /* renamed from: a */
                public void onResult(Boolean bool) {
                }

                public void onError(Throwable th) {
                    if (ac.this.isActive()) {
                        ((UploadView) ac.this.getView()).onError(th);
                    }
                }
            });
            this.a.addSubscribers();
            this.b = new b(this, null);
            NVBackend.registerForUpdates(((UploadView) getView()).getContext(), h.class, this.b);
            this.c = new a(this, null);
            NVBackend.registerForUpdates(((UploadView) getView()).getContext(), g.class, this.c);
            NVBackend.forceRetry();
            if (this.d) {
                a();
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
        Log.i("UploadPresenter", "unregistering from updates");
        NVBackend.unregisterFromUpdates(g.class, this.c);
        NVBackend.unregisterFromUpdates(g.class, this.b);
    }

    /* Access modifiers changed, original: protected */
    public void a() {
        if (isActive()) {
            SelectionModel selectionModel = (SelectionModel) DataAccess.load(((UploadView) getView()).getContext(), SelectionModel.class);
            if (selectionModel != null) {
                NetverifyDocumentData netverifyDocumentData = new NetverifyDocumentData();
                UploadDataModel uploadModel = selectionModel.getUploadModel();
                if (uploadModel != null) {
                    selectionModel.populateData(netverifyDocumentData);
                    DocumentDataModel documentData = uploadModel.getDocumentData();
                    if (documentData != null) {
                        documentData.populateData(netverifyDocumentData, selectionModel);
                    }
                    OfflineDataModel offlineDataModel = (OfflineDataModel) DataAccess.load(((UploadView) getView()).getContext(), OfflineDataModel.class);
                    if (offlineDataModel != null) {
                        offlineDataModel.populateData(netverifyDocumentData);
                    }
                    netverifyDocumentData.setExtractionMethod(uploadModel.getExtractionMethod());
                    InitiateModel initiateModel = (InitiateModel) DataAccess.load(((UploadView) getView()).getContext(), InitiateModel.class);
                    LocalBroadcastManager.getInstance(((UploadView) getView()).getContext()).sendBroadcast(new a(netverifyDocumentData, initiateModel != null ? initiateModel.getJumioScanRef() : null));
                } else {
                    return;
                }
            }
            return;
        }
        this.d = true;
    }

    public void b() {
        NVBackend.forceRetry();
    }

    public void a(JumioError jumioError) {
        InitiateModel initiateModel = (InitiateModel) DataAccess.load(((UploadView) getView()).getContext(), InitiateModel.class);
        LocalBroadcastManager.getInstance(((UploadView) getView()).getContext()).sendBroadcast(new a(jumioError.getErrorCode(), jumioError.getLocalizedError(((UploadView) getView()).getContext()), initiateModel != null ? initiateModel.getJumioScanRef() : null));
    }
}
