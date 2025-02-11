package com.jumio.nv.api.helpers;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.jumio.commons.camera.ImageData;
import com.jumio.commons.log.Log;
import com.jumio.commons.utils.ImageUtil;
import com.jumio.core.data.document.ScanSide;
import com.jumio.core.mvp.model.InvokeOnUiThread;
import com.jumio.core.mvp.model.Publisher;
import com.jumio.core.mvp.model.Subscriber;
import com.jumio.nv.NetverifyDocumentData;
import com.jumio.nv.api.calls.NVBackend;
import com.jumio.nv.liveness.extraction.LivenessDataModel;
import com.jumio.nv.models.DocumentDataModel;
import com.jumio.nv.models.InitiateModel;
import com.jumio.nv.models.MerchantSettingsModel;
import com.jumio.nv.models.NVScanPartModel;
import com.jumio.nv.models.SelectionModel;
import com.jumio.nv.models.ServerSettingsModel;
import com.jumio.nv.models.UploadDataModel;
import com.jumio.persistence.DataAccess;
import com.jumio.sdk.models.CredentialsModel;
import java.io.Serializable;
import jumio.nv.core.e;
import jumio.nv.core.f;
import jumio.nv.core.i;

public class UploadManager extends Publisher<Boolean> {
    private byte[] a;
    private Context b;
    private ScanSide c;
    private CredentialsModel d;
    private boolean e;
    private c f;
    private a g;
    private b h;
    private d i;

    class a implements Subscriber<Void> {
        private a() {
        }

        @InvokeOnUiThread(false)
        /* renamed from: a */
        public void onResult(Void voidR) {
            UploadManager.this.onResult(voidR);
        }

        public void onError(Throwable th) {
            UploadManager.this.onError(th, jumio.nv.core.d.class);
        }
    }

    class b implements Subscriber<Void> {
        private b() {
        }

        @InvokeOnUiThread(false)
        /* renamed from: a */
        public void onResult(Void voidR) {
            if (UploadManager.this.e) {
                UploadManager.this.onResult(voidR);
                return;
            }
            NetverifyDocumentData netverifyDocumentData = new NetverifyDocumentData();
            SelectionModel selectionModel = (SelectionModel) DataAccess.load(UploadManager.this.b, SelectionModel.class);
            if (selectionModel != null) {
                selectionModel.populateData(netverifyDocumentData);
                if (!(selectionModel.getUploadModel() == null || selectionModel.getUploadModel().getDocumentData() == null)) {
                    selectionModel.getUploadModel().getDocumentData().populateData(netverifyDocumentData, selectionModel);
                    netverifyDocumentData.setExtractionMethod(selectionModel.getUploadModel().getExtractionMethod());
                }
            }
            InitiateModel initiateModel = (InitiateModel) DataAccess.load(UploadManager.this.b, InitiateModel.class);
            String jumioScanRef = initiateModel != null ? initiateModel.getJumioScanRef() : null;
            DataAccess.delete(UploadManager.this.b, MerchantSettingsModel.class);
            DataAccess.delete(UploadManager.this.b, ServerSettingsModel.class);
            DataAccess.delete(UploadManager.this.b, SelectionModel.class);
            DataAccess.delete(UploadManager.this.b, InitiateModel.class);
            LocalBroadcastManager.getInstance(UploadManager.this.b).sendBroadcast(new jumio.nv.core.a(netverifyDocumentData, jumioScanRef));
        }

        public void onError(Throwable th) {
            UploadManager.this.onError(th, e.class);
        }
    }

    class c implements Subscriber<DocumentDataModel> {
        private c() {
        }

        @InvokeOnUiThread(false)
        /* renamed from: a */
        public void onResult(DocumentDataModel documentDataModel) {
            if (UploadManager.this.e) {
                UploadManager.this.onResult(documentDataModel);
                return;
            }
            Serializable serializable = (SelectionModel) DataAccess.load(UploadManager.this.b, SelectionModel.class);
            if (serializable != null) {
                UploadDataModel uploadModel = serializable.getUploadModel();
                NVScanPartModel activePart = serializable.getUploadModel().getActivePart();
                NVScanPartModel nVScanPartModel = (NVScanPartModel) DataAccess.load(UploadManager.this.b, "fallbackScanPartModel");
                DocumentDataModel documentData = uploadModel.getDocumentData();
                if (nVScanPartModel == null || documentData == null) {
                    uploadModel.setDocumentData(activePart.getSideToScan(), documentDataModel);
                } else {
                    documentData.setAddressLine(documentDataModel.getAddressLine());
                    documentData.setCity(documentDataModel.getCity());
                    documentData.setPostCode(documentDataModel.getPostCode());
                    documentData.setSubdivision(documentDataModel.getSubdivision());
                    uploadModel.add(activePart);
                }
                DataAccess.update(UploadManager.this.b, SelectionModel.class, serializable);
                UploadManager.this.startData();
                return;
            }
            throw new RuntimeException("NVScanPresenter#extractDataAndClose(): selectionmodel cannot be null!!");
        }

        public void onError(Throwable th) {
            UploadManager.this.onError(th, f.class);
        }
    }

    class d implements Subscriber<Void> {
        @InvokeOnUiThread(false)
        /* renamed from: a */
        public void onResult(Void voidR) {
        }

        private d() {
        }

        public void onError(Throwable th) {
            UploadManager.this.onError(th, i.class);
        }
    }

    public UploadManager(Context context, ScanSide scanSide, CredentialsModel credentialsModel, boolean z) {
        this.b = context;
        this.c = scanSide;
        this.d = credentialsModel;
        this.e = z;
    }

    public void addSubscribers() {
        if (this.f == null) {
            this.f = new c();
            NVBackend.registerForUpdates(this.b, f.class, this.f);
        }
        if (this.g == null) {
            this.g = new a();
            NVBackend.registerForUpdates(this.b, jumio.nv.core.d.class, this.g);
        }
        if (this.h == null) {
            this.h = new b();
            NVBackend.registerForUpdates(this.b, e.class, this.h);
        }
        if (this.i == null) {
            this.i = new d();
            NVBackend.registerForUpdates(this.b, i.class, this.i);
        }
    }

    public void removeSubscribers() {
        c cVar = this.f;
        if (cVar != null) {
            NVBackend.unregisterFromUpdates(f.class, cVar);
            this.f = null;
        }
        a aVar = this.g;
        if (aVar != null) {
            NVBackend.unregisterFromUpdates(jumio.nv.core.d.class, aVar);
            this.g = null;
        }
        b bVar = this.h;
        if (bVar != null) {
            NVBackend.unregisterFromUpdates(e.class, bVar);
            this.h = null;
        }
        d dVar = this.i;
        if (dVar != null) {
            NVBackend.unregisterFromUpdates(i.class, dVar);
            this.i = null;
        }
    }

    public void startAddPart(SelectionModel selectionModel) {
        NVScanPartModel scan = selectionModel.getUploadModel().getScan(this.c);
        if (scan != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("add part of ");
            stringBuilder.append(selectionModel.getSelectedDoctype());
            stringBuilder.append(" on ");
            stringBuilder.append(scan.getSideToScan());
            Log.i("Network", stringBuilder.toString());
            byte[] imageData = scan.getScannedImage().getImageData();
            this.g = new a();
            NVBackend.addPart(this.b, this.d, scan, null, imageData);
        }
    }

    public void startData() {
        NVBackend.data(this.b, this.d, null);
    }

    public void startExtractData(SelectionModel selectionModel, ScanSide scanSide) {
        ImageData imageDataForPart = selectionModel.getUploadModel().getImageDataForPart(scanSide);
        if (imageDataForPart != null) {
            Bitmap decodeFile = BitmapFactory.decodeFile(imageDataForPart.getImagePath());
            if (decodeFile != null) {
                this.a = ImageUtil.bitmapToFormat(decodeFile, CompressFormat.JPEG, 80);
            } else {
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("extract data of ");
        stringBuilder.append(selectionModel.getSelectedDoctype());
        stringBuilder.append(" on ");
        stringBuilder.append(scanSide);
        Log.i("Network", stringBuilder.toString());
        NVBackend.extractData(this.b, this.d, null, this.a);
    }

    public void startLiveness(LivenessDataModel livenessDataModel) {
        if (livenessDataModel != null && livenessDataModel.getFrames() != null && livenessDataModel.getFrames().length != 0) {
            NVBackend.liveness(this.b, this.d, null, livenessDataModel.getFrames());
        }
    }

    public void cancel() {
        NVBackend.cancelAllPending();
    }

    @InvokeOnUiThread(false)
    public void onResult(Object obj) {
        if (obj instanceof DocumentDataModel) {
            Serializable serializable = (SelectionModel) DataAccess.load(this.b, SelectionModel.class);
            if (serializable != null) {
                serializable.getUploadModel().setDocumentData(this.c, (DocumentDataModel) obj);
                DataAccess.update(this.b, SelectionModel.class, serializable);
            }
        }
        publishResult(Boolean.valueOf(true));
    }

    public void onError(Throwable th, Class<?> cls) {
        publishError(NVBackend.errorFromThrowable(this.b, th, cls));
    }
}
