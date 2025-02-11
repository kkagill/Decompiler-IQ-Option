package jumio.nv.core;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.jumio.analytics.JumioAnalytics;
import com.jumio.analytics.MetaInfo;
import com.jumio.analytics.MobileEvents;
import com.jumio.analytics.Screen;
import com.jumio.analytics.UserAction;
import com.jumio.commons.log.Log;
import com.jumio.core.mvp.model.InvokeOnUiThread;
import com.jumio.core.mvp.model.Subscriber;
import com.jumio.core.mvp.presenter.Presenter;
import com.jumio.core.plugins.PluginRegistry;
import com.jumio.core.plugins.PluginRegistry.PluginMode;
import com.jumio.nv.api.calls.NVBackend;
import com.jumio.nv.data.country.Country;
import com.jumio.nv.data.document.DocumentType;
import com.jumio.nv.data.document.NVDocumentType;
import com.jumio.nv.data.document.NVDocumentVariant;
import com.jumio.nv.models.CountryDocumentModel;
import com.jumio.nv.models.InitiateModel;
import com.jumio.nv.models.MerchantSettingsModel;
import com.jumio.nv.models.NVScanPartModel;
import com.jumio.nv.models.SelectionModel;
import com.jumio.nv.models.ServerSettingsModel;
import com.jumio.nv.models.TemplateModel;
import com.jumio.nv.view.interactors.SelectionView;
import com.jumio.persistence.DataAccess;
import com.jumio.sdk.exception.JumioError;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: SelectionPresenter */
public class ab extends Presenter<SelectionView> {
    private MerchantSettingsModel a;
    private ServerSettingsModel b;
    private List<Country> c;
    private SelectionModel d;
    private a e;
    private b f;
    private boolean g;
    private boolean h;
    private long i = 0;
    private ConditionVariable j = new ConditionVariable(false);

    /* compiled from: SelectionPresenter */
    class a implements Subscriber<String> {
        private a() {
        }

        /* synthetic */ a(ab abVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        @InvokeOnUiThread
        /* renamed from: a */
        public void onResult(String str) {
            if (!ab.this.isActive()) {
            }
        }

        @InvokeOnUiThread
        public void onError(Throwable th) {
            if (ab.this.isActive()) {
                JumioError errorFromThrowable = NVBackend.errorFromThrowable(((SelectionView) ab.this.getView()).getContext(), th, h.class);
                if (!errorFromThrowable.isRetryable()) {
                    ((SelectionView) ab.this.getView()).onError(errorFromThrowable);
                }
            }
        }
    }

    /* compiled from: SelectionPresenter */
    class b implements Subscriber<ServerSettingsModel> {
        @InvokeOnUiThread(false)
        /* renamed from: a */
        public void onResult(ServerSettingsModel serverSettingsModel) {
            if (ab.this.getView() != null) {
                DataAccess.update(((SelectionView) ab.this.getView()).getContext(), ServerSettingsModel.class, (Serializable) serverSettingsModel);
                Log.v("SelectionPresenter", "Settings model finally loaded, removing myself");
                NVBackend.unregisterFromUpdates(k.class, this);
                if (ab.this.a.isSendDebugInfo() || serverSettingsModel.isAnalyticsEnabled()) {
                    NVBackend.unlockAnalytics(((SelectionView) ab.this.getView()).getContext(), ((SelectionView) ab.this.getView()).getCredentialsModel());
                } else {
                    JumioAnalytics.disable();
                }
                ab.this.b = serverSettingsModel;
                ab.this.b();
            }
        }

        @InvokeOnUiThread
        public void onError(Throwable th) {
            if (ab.this.getView() != null) {
                ((SelectionView) ab.this.getView()).onError(NVBackend.errorFromThrowable(((SelectionView) ab.this.getView()).getContext(), th, k.class));
            }
        }
    }

    /* compiled from: SelectionPresenter */
    class c implements Subscriber<Void> {
        private c() {
        }

        /* synthetic */ c(ab abVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        /* renamed from: a */
        public void onResult(Void voidR) {
            ab.this.j.open();
        }

        public void onError(Throwable th) {
            ab.this.j.open();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onCreate() {
        super.onCreate();
        String str = "SelectionPresenter";
        if (this.a == null) {
            Log.d(str, "loading merchant settings from persistence");
            this.a = (MerchantSettingsModel) DataAccess.load(((SelectionView) getView()).getContext(), MerchantSettingsModel.class);
            if (this.a == null) {
                this.a = new MerchantSettingsModel();
            }
        }
        SelectionModel selectionModel = (SelectionModel) DataAccess.load(((SelectionView) getView()).getContext(), SelectionModel.class);
        this.d = selectionModel;
        if (selectionModel == null) {
            this.d = new SelectionModel();
            DataAccess.update(((SelectionView) getView()).getContext(), SelectionModel.class, this.d);
        }
        if (this.b == null) {
            Log.d(str, "loading server settings from persistence");
            this.b = (ServerSettingsModel) DataAccess.load(((SelectionView) getView()).getContext(), ServerSettingsModel.class);
        }
        ServerSettingsModel serverSettingsModel = this.b;
        if (serverSettingsModel != null && serverSettingsModel.isLoaded()) {
            this.j.open();
            b();
        } else if (!this.a.isCountryPreSelected()) {
            this.j.open();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        this.f = new b();
        NVBackend.registerForUpdates(((SelectionView) getView()).getContext(), k.class, this.f);
        this.e = new a(this, null);
        NVBackend.registerForUpdates(((SelectionView) getView()).getContext(), h.class, this.e);
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
        NVBackend.unregisterFromUpdates(k.class, this.f);
        NVBackend.unregisterFromUpdates(h.class, this.e);
    }

    public void a(String str, NVDocumentType nVDocumentType, NVDocumentVariant nVDocumentVariant) {
        if (b(str)) {
            Country a = a(str);
            this.d.setSelectedCountry(a);
            List<DocumentType> a2 = a(a);
            a(a, (List) a2);
            for (DocumentType documentType : a2) {
                if (documentType.getId() == nVDocumentType) {
                    this.d.setSelectedDoctype(documentType);
                    break;
                }
            }
            if (this.d.getSelectedDoctype() == null) {
                throw new IllegalArgumentException("Unsupported document type");
            } else if (this.d.getSelectedDoctype().isDocumentVariantAccepted(nVDocumentVariant)) {
                this.d.setSelectedVariant(nVDocumentVariant);
                e();
                return;
            } else {
                throw new IllegalArgumentException("Unsupported document variant");
            }
        }
        throw new IllegalArgumentException("Unsupported country code");
    }

    public List<DocumentType> a(Country country) {
        CountryDocumentModel countryModel = this.b.getCountryModel();
        boolean isVerificationRequired = this.d.isVerificationRequired();
        boolean z = !this.d.isVerificationRequired() && this.a.isDataExtractionOnMobileOnly();
        return countryModel.getDocumentTypesFor(country, isVerificationRequired, z, this.a.getSupportedDocumentTypes(), this.a.getDocumentVariant());
    }

    public void a(DocumentType documentType, NVDocumentVariant nVDocumentVariant) {
        this.g = true;
        this.d.setSelectedDoctype(documentType);
        this.d.setSelectedVariant(nVDocumentVariant);
        e();
    }

    public void a() {
        NVBackend.forceRetry();
    }

    public void a(JumioError jumioError) {
        if (getView() != null) {
            InitiateModel initiateModel = (InitiateModel) DataAccess.load(((SelectionView) getView()).getContext(), InitiateModel.class);
            LocalBroadcastManager.getInstance(((SelectionView) getView()).getContext()).sendBroadcast(new a(jumioError.getErrorCode(), jumioError.getLocalizedError(((SelectionView) getView()).getContext()), initiateModel != null ? initiateModel.getJumioScanRef() : null));
        }
    }

    /* Access modifiers changed, original: protected */
    public void b() {
        this.g = false;
        this.h = false;
        ((SelectionView) getView()).getNfcController().downloadCertificates(this.b);
        if (this.a.requireVerification()) {
            ad.a(((SelectionView) getView()).getContext());
        }
        if (!(this.b.getEnabledFields() == null || this.b.getEnabledFields().length() == 0)) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.b.getEnabledFields().split(",")));
            String str = "idFaceMatch";
            if (!this.a.isFaceMatchSet() && arrayList.contains(str)) {
                this.a.setFaceMatchEnabled(true);
            } else if (!arrayList.contains(str)) {
                this.a.setFaceMatchEnabled(false);
            }
            DataAccess.update(((SelectionView) getView()).getContext(), MerchantSettingsModel.class, this.a);
        }
        SelectionModel selectionModel = this.d;
        boolean z = this.b.isVerificationAllowed() && this.a.requireVerification();
        selectionModel.setVerificationRequired(z);
        selectionModel = this.d;
        z = this.b.getEnabledFields() != null && this.b.getEnabledFields().contains("idAddress");
        selectionModel.setAddressEnabled(z);
        CountryDocumentModel countryModel = this.b.getCountryModel();
        z = this.d.isVerificationRequired();
        boolean z2 = !this.d.isVerificationRequired() && this.a.isDataExtractionOnMobileOnly();
        this.c = countryModel.getCountriesFor(z, z2, this.a.getSupportedDocumentTypes(), this.a.getDocumentVariant());
        Collections.sort(this.c);
        InitiateModel initiateModel = (InitiateModel) DataAccess.load(((SelectionView) getView()).getContext(), InitiateModel.class);
        if (initiateModel == null || initiateModel.getJumioScanRef() == null) {
            NVBackend.initiate(((SelectionView) getView()).getContext(), ((SelectionView) getView()).getCredentialsModel(), this.a, this.b, null);
        }
        Country c = c();
        this.d.setSelectedCountry(c);
        this.d.setSelectedDoctype(null);
        this.d.setSelectedVariant(null);
        if (c != null) {
            CountryDocumentModel countryModel2 = this.b.getCountryModel();
            boolean isVerificationRequired = this.d.isVerificationRequired();
            boolean z3 = !this.d.isVerificationRequired() && this.a.isDataExtractionOnMobileOnly();
            List documentTypesFor = countryModel2.getDocumentTypesFor(c, isVerificationRequired, z3, this.a.getSupportedDocumentTypes(), this.a.getDocumentVariant());
            a(c, documentTypesFor);
            if (documentTypesFor.size() == 1) {
                this.d.setSelectedDoctype((DocumentType) documentTypesFor.get(0));
            }
            if (this.d.getSelectedDoctype() != null) {
                if (this.a.isDocumentVariantPreSelected() && this.d.getSelectedDoctype().isDocumentVariantAccepted(this.a.getDocumentVariant())) {
                    this.d.setSelectedVariant(this.a.getDocumentVariant());
                } else if (!this.d.getSelectedDoctype().hasPaperVariant()) {
                    this.d.setSelectedVariant(NVDocumentVariant.PLASTIC);
                }
            }
            if (this.a.isCountryPreSelected() && this.a.getIsoCode().equals(this.d.getSelectedCountry().getIsoCode()) && d()) {
                this.g = true;
                this.h = true;
            }
        }
        DataAccess.update(((SelectionView) getView()).getContext(), SelectionModel.class, this.d);
        final Handler handler = new Handler(Looper.getMainLooper());
        if (d() && this.g) {
            new Thread(new Runnable() {
                public void run() {
                    ab.this.j.block(5000 - (System.currentTimeMillis() - ab.this.i));
                    handler.post(new Runnable() {
                        public void run() {
                            ab.this.e();
                        }
                    });
                }
            }).start();
        } else {
            handler.post(new Runnable() {
                public void run() {
                    if (ab.this.hasView()) {
                        JumioAnalytics.add(MobileEvents.pageView(JumioAnalytics.getSessionId(), Screen.SCAN_OPTIONS, null));
                        Country selectedCountry = ab.this.d.getSelectedCountry();
                        boolean z = false;
                        Object obj = (selectedCountry == null || !selectedCountry.getIsoCode().equals(ab.this.a.getIsoCode())) ? null : 1;
                        SelectionView selectionView = (SelectionView) ab.this.getView();
                        List i = ab.this.c;
                        boolean z2 = selectedCountry == null || obj == null;
                        selectionView.onCountriesReceived(i, selectedCountry, z2);
                        if (selectedCountry != null) {
                            ((SelectionView) ab.this.getView()).onDocumentTypesReceived(ab.this.a(selectedCountry), ab.this.a.getDocumentVariant());
                        }
                        SelectionView selectionView2 = (SelectionView) ab.this.getView();
                        if (selectedCountry == null) {
                            z = true;
                        }
                        selectionView2.hideLoading(true, z);
                    }
                }
            });
        }
    }

    private Country c() {
        Country country = null;
        if (this.d.getSelectedCountry() != null) {
            for (Country isoCode : this.c) {
                if (isoCode.getIsoCode().equals(this.d.getSelectedCountry().getIsoCode())) {
                    country = this.d.getSelectedCountry();
                }
            }
            return country;
        }
        String isoCode2 = this.a.getIsoCode();
        if (this.a.isCountryPreSelected() && b(isoCode2)) {
            return a(isoCode2);
        }
        if (b(this.b.getCountryForIp())) {
            return a(this.b.getCountryForIp());
        }
        return null;
    }

    private Country a(String str) {
        for (Country country : this.c) {
            if (country.getIsoCode().equals(str)) {
                return country;
            }
        }
        return null;
    }

    private boolean b(String str) {
        return a(str) != null;
    }

    private void a(Country country, List<DocumentType> list) {
        if (PluginRegistry.hasPlugin(PluginMode.TEMPLATE_MATCHER) && !this.a.hasWaitedForInitialize()) {
            ArrayList arrayList = new ArrayList();
            for (DocumentType id : list) {
                arrayList.add(id.getId());
            }
            arrayList.remove(NVDocumentType.PASSPORT);
            arrayList.remove(NVDocumentType.VISA);
            TemplateModel templateModel = new TemplateModel(((SelectionView) getView()).getContext());
            if (arrayList.size() != 0) {
                this.j.close();
                this.i = System.currentTimeMillis();
                templateModel.add(new c(this, null));
                templateModel.getOrLoad(country, (NVDocumentType[]) arrayList.toArray(new NVDocumentType[arrayList.size()]), this.b);
            }
        }
    }

    private boolean d() {
        SelectionModel selectionModel = this.d;
        return (selectionModel == null || selectionModel.getSelectedCountry() == null || this.d.getSelectedDoctype() == null || this.d.getSelectedVariant() == null) ? false : true;
    }

    private void e() {
        SelectionModel selectionModel = this.d;
        if (selectionModel != null) {
            selectionModel.setUploadModel(null);
            if (d()) {
                f();
            }
        }
    }

    private void f() {
        if (hasView()) {
            this.d.buildUploadModel(((SelectionView) getView()).getContext());
            Serializable serializable = (NVScanPartModel) this.d.getUploadModel().getScans().get(0);
            DataAccess.delete(((SelectionView) getView()).getContext(), "fallbackScanPartModel");
            DataAccess.update(((SelectionView) getView()).getContext(), NVScanPartModel.class, serializable);
            this.d.getUploadModel().setActivePart(0);
            DataAccess.update(((SelectionView) getView()).getContext(), SelectionModel.class, this.d);
            if (!this.h) {
                MetaInfo metaInfo = new MetaInfo();
                metaInfo.put("country", this.d.getSelectedCountry().getIsoCode());
                metaInfo.put("idType", this.d.getSelectedDoctype().toString());
                metaInfo.put("idStyle", this.d.getSelectedVariant().toString());
                JumioAnalytics.add(MobileEvents.userAction(JumioAnalytics.getSessionId(), Screen.SCAN_OPTIONS, UserAction.SCAN_OPTIONS_COMPLETED, metaInfo));
            }
            ((SelectionView) getView()).jumpToScanFragment(this.h);
        }
    }
}
