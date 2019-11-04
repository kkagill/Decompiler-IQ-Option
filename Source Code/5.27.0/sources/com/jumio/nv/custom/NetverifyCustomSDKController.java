package com.jumio.nv.custom;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.jumio.core.data.document.ScanSide;
import com.jumio.nv.NetverifyDocumentData;
import com.jumio.nv.NetverifySDK;
import com.jumio.nv.api.calls.NVBackend;
import com.jumio.nv.data.country.Country;
import com.jumio.nv.data.document.DocumentType;
import com.jumio.nv.data.document.NVDocumentType;
import com.jumio.nv.data.document.NVDocumentVariant;
import com.jumio.nv.enums.NVErrorCase;
import com.jumio.nv.extraction.NfcController;
import com.jumio.nv.models.InitiateModel;
import com.jumio.nv.models.NVScanPartModel;
import com.jumio.nv.models.SelectionModel;
import com.jumio.nv.models.UploadDataModel;
import com.jumio.nv.view.interactors.SelectionView;
import com.jumio.nv.view.interactors.UploadView;
import com.jumio.persistence.DataAccess;
import com.jumio.sdk.exception.JumioError;
import com.jumio.sdk.models.CredentialsModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import jumio.nv.core.a;
import jumio.nv.core.ab;
import jumio.nv.core.ac;
import jumio.nv.core.b;

public final class NetverifyCustomSDKController {
    private HashMap<String, NetverifyCountry> countryList;
    private InternalController internalController;
    private boolean isValid;
    private NetverifyCustomScanPresenter netverifyCustomScanPresenter;
    private ab selectionPresenter = new ab();
    private ac uploadPresenter;

    public class InternalController extends b implements SelectionView, UploadView, b.b {
        private Context context;
        private CredentialsModel credentialsModel;
        private boolean isFinished;
        private NetverifyCustomSDKInterface netverifyCustomSDKInterface;

        public int getCloseDelay() {
            return 0;
        }

        public void hideLoading(boolean z, boolean z2) {
        }

        public void onDocumentTypesReceived(List<DocumentType> list, NVDocumentVariant nVDocumentVariant) {
        }

        public void uploadComplete() {
        }

        private InternalController(NetverifyCustomSDKInterface netverifyCustomSDKInterface) {
            this.isFinished = false;
            this.netverifyCustomSDKInterface = netverifyCustomSDKInterface;
        }

        public void create(Activity activity, CredentialsModel credentialsModel, boolean z) {
            super.create(activity, credentialsModel, z);
            setInterface(this);
            this.context = activity;
            this.credentialsModel = credentialsModel;
        }

        public void destroy() {
            NetverifyCustomSDKController.this.isValid = false;
            if (!this.isFinished) {
                InitiateModel initiateModel = (InitiateModel) DataAccess.load(this.context, InitiateModel.class);
                JumioError jumioError = new JumioError(NVErrorCase.CANCEL_TYPE_USER);
                finishSDK(this.context, new a(jumioError.getErrorCode(), jumioError.getLocalizedError(this.context), initiateModel != null ? initiateModel.getJumioScanRef() : null));
            }
            NVBackend.cancelAllPending();
            super.destroy();
        }

        public Context getContext() {
            return this.context;
        }

        public void onError(Throwable th) {
            if (th instanceof JumioError) {
                InitiateModel initiateModel = (InitiateModel) DataAccess.load(this.context, InitiateModel.class);
                JumioError jumioError = (JumioError) th;
                this.netverifyCustomSDKInterface.onNetverifyError(jumioError.getErrorCode(), jumioError.getLocalizedError(this.context), jumioError.isRetryable(), initiateModel != null ? initiateModel.getJumioScanRef() : null);
            }
        }

        public CredentialsModel getCredentialsModel() {
            return this.credentialsModel;
        }

        public void jumpToScanFragment(boolean z) {
            this.netverifyCustomSDKInterface.onNetverifyResourcesLoaded();
        }

        public void onCountriesReceived(List<Country> list, Country country, boolean z) {
            NetverifyCustomSDKController.this.countryList = new HashMap();
            for (int i = 0; i < list.size(); i++) {
                Country country2 = (Country) list.get(i);
                List<DocumentType> a = NetverifyCustomSDKController.this.selectionPresenter.a(country2);
                HashMap hashMap = new HashMap();
                for (DocumentType documentType : a) {
                    hashMap.put(documentType.getId(), Boolean.valueOf(documentType.hasPaperVariant()));
                }
                NetverifyCustomSDKController.this.countryList.put(country2.getIsoCode(), new NetverifyCountry(country2.getIsoCode(), Collections.unmodifiableMap(hashMap)));
            }
            this.netverifyCustomSDKInterface.onNetverifyCountriesReceived(NetverifyCustomSDKController.this.countryList, country != null ? country.getIsoCode() : "");
        }

        public NfcController getNfcController() {
            return super.getNfcController(this.context);
        }

        public void finishSDK(Intent intent) {
            this.isFinished = true;
            String str = "com.jumio.nv.RESULT";
            int intExtra = intent.getIntExtra(str, 1);
            String str2 = NetverifySDK.EXTRA_SCAN_REFERENCE;
            if (intExtra == -1) {
                this.netverifyCustomSDKInterface.onNetverifyFinished((NetverifyDocumentData) intent.getSerializableExtra(NetverifySDK.EXTRA_SCAN_DATA), intent.getStringExtra(str2));
            } else if (intent.getIntExtra(str, 1) == 0) {
                String stringExtra = intent.getStringExtra(str2);
                this.netverifyCustomSDKInterface.onNetverifyError(intent.getStringExtra(NetverifySDK.EXTRA_ERROR_CODE), intent.getStringExtra(NetverifySDK.EXTRA_ERROR_MESSAGE), false, stringExtra);
            }
            if (NetverifyCustomSDKController.this.uploadPresenter != null) {
                NetverifyCustomSDKController.this.uploadPresenter.deactivate();
                NetverifyCustomSDKController.this.uploadPresenter.detachView();
                NetverifyCustomSDKController.this.uploadPresenter = null;
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void partDestroyed() {
            NetverifyCustomSDKController.this.netverifyCustomScanPresenter = null;
        }
    }

    public NetverifyCustomSDKController(Activity activity, CredentialsModel credentialsModel, NetverifyCustomSDKInterface netverifyCustomSDKInterface) {
        this.internalController = new InternalController(netverifyCustomSDKInterface);
        this.internalController.create(activity, credentialsModel, true);
        this.selectionPresenter.attachView(this.internalController);
        this.selectionPresenter.activate();
        this.isValid = true;
    }

    public List<ScanSide> setDocumentConfiguration(NetverifyCountry netverifyCountry, NVDocumentType nVDocumentType, NVDocumentVariant nVDocumentVariant) {
        if (this.isValid) {
            this.selectionPresenter.activate();
            this.selectionPresenter.a(netverifyCountry.getIsoCode(), nVDocumentType, nVDocumentVariant);
            SelectionModel selectionModel = (SelectionModel) DataAccess.load(this.internalController.getContext(), SelectionModel.class);
            if (selectionModel == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            UploadDataModel uploadModel = selectionModel.getUploadModel();
            if (uploadModel == null) {
                return null;
            }
            for (NVScanPartModel sideToScan : uploadModel.getScans()) {
                arrayList.add(sideToScan.getSideToScan());
            }
            return arrayList;
        }
        throw new SDKNotConfiguredException("Controller is already destroyed");
    }

    public NetverifyCustomScanPresenter startScanForPart(ScanSide scanSide, NetverifyCustomScanView netverifyCustomScanView, NetverifyCustomConfirmationView netverifyCustomConfirmationView, NetverifyCustomScanInterface netverifyCustomScanInterface) {
        if (!this.isValid) {
            throw new SDKNotConfiguredException("Controller is already destroyed");
        } else if (this.netverifyCustomScanPresenter == null) {
            this.selectionPresenter.deactivate();
            Serializable serializable = (SelectionModel) DataAccess.load(this.internalController.getContext(), SelectionModel.class);
            Serializable serializable2 = null;
            if (serializable == null) {
                return null;
            }
            UploadDataModel uploadModel = serializable.getUploadModel();
            if (uploadModel == null) {
                return null;
            }
            for (NVScanPartModel nVScanPartModel : uploadModel.getScans()) {
                if (nVScanPartModel.getSideToScan() == scanSide) {
                    serializable2 = nVScanPartModel;
                }
            }
            DataAccess.delete(this.internalController.getContext(), "fallbackScanPartModel");
            DataAccess.update(this.internalController.getContext(), NVScanPartModel.class, serializable2);
            if (serializable2 != null) {
                uploadModel.setActivePart(serializable2.getPartIndex());
            }
            DataAccess.update(this.internalController.getContext(), SelectionModel.class, serializable);
            this.netverifyCustomScanPresenter = new NetverifyCustomScanPresenter(this.internalController, netverifyCustomScanView, netverifyCustomConfirmationView, netverifyCustomScanInterface);
            return this.netverifyCustomScanPresenter;
        } else {
            throw new SDKNotConfiguredException("Another part is already in progress");
        }
    }

    public void retry() {
        if (this.isValid) {
            NVBackend.forceRetry();
            return;
        }
        throw new SDKNotConfiguredException("Controller is already destroyed");
    }

    public void finish() {
        if (this.isValid) {
            SelectionModel selectionModel = (SelectionModel) DataAccess.load(this.internalController.getContext(), SelectionModel.class);
            if (selectionModel != null) {
                UploadDataModel uploadModel = selectionModel.getUploadModel();
                if (uploadModel == null || uploadModel.allPartsScanned()) {
                    NVBackend.finalizeCall(this.internalController.getContext(), this.internalController.getCredentialsModel(), null);
                    if (this.uploadPresenter == null) {
                        this.uploadPresenter = new ac();
                        this.uploadPresenter.attachView(this.internalController);
                        this.uploadPresenter.activate();
                    }
                    return;
                }
                throw new SDKNotConfiguredException("Parts missing");
            }
            return;
        }
        throw new SDKNotConfiguredException("Controller is already destroyed");
    }

    public void pause() {
        if (this.isValid) {
            InternalController internalController = this.internalController;
            internalController.pause(internalController.getContext());
            this.internalController.stop();
            return;
        }
        throw new SDKNotConfiguredException("Controller is already destroyed");
    }

    public void resume() {
        if (this.isValid) {
            this.internalController.start();
            InternalController internalController = this.internalController;
            internalController.resume(internalController.getContext());
            return;
        }
        throw new SDKNotConfiguredException("Controller is already destroyed");
    }

    public void destroy() {
        if (this.isValid) {
            this.isValid = false;
            ac acVar = this.uploadPresenter;
            if (acVar != null) {
                acVar.deactivate();
                this.uploadPresenter.detachView();
            }
            ab abVar = this.selectionPresenter;
            if (abVar != null) {
                abVar.deactivate();
                this.selectionPresenter.detachView();
            }
            this.internalController.destroy();
            return;
        }
        throw new SDKNotConfiguredException("Controller is already destroyed");
    }
}
