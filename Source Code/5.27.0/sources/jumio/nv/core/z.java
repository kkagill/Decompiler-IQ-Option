package jumio.nv.core;

import com.jumio.core.mvp.presenter.Presenter;
import com.jumio.nv.data.country.Country;
import com.jumio.nv.models.CountryDocumentModel;
import com.jumio.nv.models.MerchantSettingsModel;
import com.jumio.nv.models.SelectionModel;
import com.jumio.nv.models.ServerSettingsModel;
import com.jumio.nv.view.interactors.CountryListView;
import com.jumio.persistence.DataAccess;
import java.util.Collections;
import java.util.List;

/* compiled from: CountryListPresenter */
public class z extends Presenter<CountryListView> {
    private ServerSettingsModel a;
    private SelectionModel b;
    private MerchantSettingsModel c;

    /* Access modifiers changed, original: protected */
    public void onStart() {
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
    }

    /* Access modifiers changed, original: protected */
    public void onCreate() {
        super.onCreate();
        this.a = (ServerSettingsModel) DataAccess.load(((CountryListView) getView()).getContext(), ServerSettingsModel.class);
        this.c = (MerchantSettingsModel) DataAccess.load(((CountryListView) getView()).getContext(), MerchantSettingsModel.class);
        this.b = (SelectionModel) DataAccess.load(((CountryListView) getView()).getContext(), SelectionModel.class);
    }

    public List<Country> a() {
        if (this.b != null) {
            ServerSettingsModel serverSettingsModel = this.a;
            if (!(serverSettingsModel == null || this.c == null)) {
                CountryDocumentModel countryModel = serverSettingsModel.getCountryModel();
                boolean isVerificationRequired = this.b.isVerificationRequired();
                boolean z = !this.b.isVerificationRequired() && this.c.isDataExtractionOnMobileOnly();
                List countriesFor = countryModel.getCountriesFor(isVerificationRequired, z, this.c.getSupportedDocumentTypes(), this.c.getDocumentVariant());
                Collections.sort(countriesFor);
                return countriesFor;
            }
        }
        return null;
    }

    public void a(Country country) {
        this.b.setSelectedCountry(country);
        if (getView() != null && ((CountryListView) getView()).getContext() != null) {
            DataAccess.update(((CountryListView) getView()).getContext(), SelectionModel.class, this.b);
        }
    }
}
