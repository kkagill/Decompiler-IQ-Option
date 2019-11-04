package com.jumio.dv;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.jumio.MobileSDK;
import com.jumio.commons.camera.PreviewProperties;
import com.jumio.commons.utils.JumioBroadcastManager;
import com.jumio.core.enums.JumioCameraPosition;
import com.jumio.core.enums.JumioDataCenter;
import com.jumio.core.exceptions.MissingPermissionException;
import com.jumio.core.util.JumioUrlValidator;
import com.jumio.dv.c.a;
import com.jumio.dv.models.DvScanPartModel;
import com.jumio.dv.models.DvSettingsModel;
import com.jumio.persistence.DataAccess;
import com.jumio.sdk.models.CredentialsModel;

public class DocumentVerificationSDK extends MobileSDK {
    public static final String EXTRA_ERROR_CODE = "com.jumio.dv.DocumentVerificationSDK.EXTRA_ERROR_CODE";
    public static final String EXTRA_ERROR_MESSAGE = "com.jumio.dv.DocumentVerificationSDK.EXTRA_ERROR_MESSAGE";
    public static final String EXTRA_SCAN_REFERENCE = "com.jumio.dv.DocumentVerificationSDK.EXTRA_SCAN_REFERENCE";
    public static int REQUEST_CODE = 300;
    private static DocumentVerificationSDK a;
    private DvSettingsModel b;
    private CredentialsModel c;
    private Activity d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private boolean m = false;
    private boolean n = true;

    private DocumentVerificationSDK(Activity activity, String str, String str2, JumioDataCenter jumioDataCenter) {
        String str3 = "";
        this.e = str3;
        this.f = str3;
        this.g = str3;
        this.h = str3;
        this.i = str3;
        this.j = str3;
        this.k = str3;
        this.l = str3;
        if (activity != null) {
            MobileSDK.checkSDKRequirements(activity, false);
            DataAccess.delete((Context) activity, DvSettingsModel.class);
            DataAccess.delete((Context) activity, DvScanPartModel.class);
            this.d = activity;
            this.c = new CredentialsModel();
            this.c.setApiToken(str);
            this.c.setApiSecret(str2);
            this.c.setDataCenter(jumioDataCenter);
            return;
        }
        throw new NullPointerException("rootActivity is null");
    }

    public static synchronized DocumentVerificationSDK create(Activity activity, String str, String str2, JumioDataCenter jumioDataCenter) {
        DocumentVerificationSDK documentVerificationSDK;
        synchronized (DocumentVerificationSDK.class) {
            if (a == null) {
                a = new DocumentVerificationSDK(activity, str, str2, jumioDataCenter);
            }
            documentVerificationSDK = a;
        }
        return documentVerificationSDK;
    }

    private static synchronized void a() {
        synchronized (DocumentVerificationSDK.class) {
            a = null;
        }
    }

    public static boolean isSupportedPlatform(Context context) {
        return MobileSDK.isSupportedPlatform(context, false);
    }

    public synchronized void destroy() {
        DataAccess.delete(this.d, DvScanPartModel.class);
        DataAccess.delete(this.d, DvSettingsModel.class);
        DataAccess.delete(this.d, PreviewProperties.class);
        JumioBroadcastManager.destroy();
        a();
        super.destroy();
    }

    public void setCustomerId(String str) {
        if (str == null || str.length() == 0 || str.length() > 100) {
            throw new IllegalArgumentException("CustomerId invalid");
        }
        this.f = str;
    }

    public void setCountry(String str) {
        if (str == null || str.length() == 0 || str.length() > 3) {
            throw new IllegalArgumentException("Country invalid");
        }
        this.g = str;
    }

    public void setType(String str) {
        if (str == null || str.length() == 0 || str.length() > 100) {
            throw new IllegalArgumentException("Type invalid");
        }
        this.h = str;
    }

    public void setMerchantScanReference(String str) {
        if (str == null || str.length() == 0 || str.length() > 100) {
            throw new IllegalArgumentException("MerchantScanReference invalid");
        }
        this.i = str;
    }

    public void setMerchantReportingCriteria(String str) {
        if (str == null) {
            str = "";
        } else if (str.length() > 255) {
            str = str.substring(0, 255);
        }
        this.e = str;
    }

    public void setCameraPosition(JumioCameraPosition jumioCameraPosition) {
        this.m = jumioCameraPosition == JumioCameraPosition.FRONT;
    }

    private void b() {
        a.a();
        String str = this.g;
        if (str == null || str.length() == 0 || this.g.length() > 100) {
            throw new IllegalArgumentException("Country invalid");
        }
        str = this.h;
        if (str == null || str.length() == 0 || this.h.length() > 100) {
            throw new IllegalArgumentException("Type invalid");
        }
        str = this.f;
        if (str == null || str.length() == 0 || this.f.length() > 100) {
            throw new IllegalArgumentException("CustomerID invalid");
        }
        str = this.i;
        if (str == null || str.length() == 0 || this.i.length() > 100) {
            throw new IllegalArgumentException("MerchantScanReference invalid");
        } else if (this.j.length() <= 100) {
            this.b = new DvSettingsModel();
            this.b.setContext(this.d);
            DataAccess.delete(this.d, DvSettingsModel.class);
            DataAccess.delete(this.d, DvScanPartModel.class);
            DataAccess.delete(this.d, PreviewProperties.class);
            this.b.setCountry(this.g);
            this.b.setType(this.h);
            this.b.setMerchantScanReference(this.i);
            this.b.setCustomerId(this.f);
            this.b.setCallbackUrl(this.k);
            this.b.setMerchantReportingCriteria(this.e);
            this.b.setCustomDocumentCode(this.j);
            this.b.setDocumentName(this.l);
            this.b.setCameraFacingFront(this.m);
            this.b.setEnableExtraction(this.n);
        } else {
            throw new IllegalArgumentException("CustomDocumentCode invalid");
        }
    }

    public Intent getIntent() {
        if (MobileSDK.hasAllRequiredPermissions(this.d)) {
            b();
            DataAccess.store(this.d, DvSettingsModel.class, this.b);
            return super.getIntent(this.d, DocumentVerificationActivity.class, this.c);
        }
        throw new MissingPermissionException(MobileSDK.getMissingPermissions(this.d));
    }

    public void start() {
        this.d.startActivityForResult(getIntent(), REQUEST_CODE);
    }

    public void setCustomDocumentCode(String str) {
        if (str == null) {
            str = "";
        } else if (str.length() > 100) {
            str = str.substring(0, 100);
        }
        this.j = str;
    }

    public void setCallbackUrl(String str) {
        if (str == null) {
            str = "";
        }
        if (!new JumioUrlValidator(new String[]{"https"}, false, false, false, false).isValid(str) || str.length() > 255) {
            Log.w("NetverifySDK", "The provided callback url is not valid!");
        } else {
            this.k = str;
        }
    }

    public void setDocumentName(String str) {
        this.l = str;
    }

    public void setEnableExtraction(boolean z) {
        this.n = z;
    }
}
