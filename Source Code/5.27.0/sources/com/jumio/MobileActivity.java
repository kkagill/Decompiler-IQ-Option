package com.jumio;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.jumio.sdk.models.CredentialsModel;

public class MobileActivity extends AppCompatActivity {
    public static final String EXTRA_CREDENTIALS = "com.jumio.nv.MobileActivity.EXTRA_CREDENTIALS";
    public static final String EXTRA_CUSTOM_THEME = "com.jumio.nv.MobileActivity.EXTRA_CUSTOM_THEME";
    private CredentialsModel credentialsModel = null;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() != null) {
            int i = 0;
            if (getIntent().getExtras() != null) {
                i = getIntent().getExtras().getInt(EXTRA_CUSTOM_THEME);
            }
            if (i != 0) {
                setTheme(i);
            }
            if (this.credentialsModel == null) {
                Intent intent = getIntent();
                String str = EXTRA_CREDENTIALS;
                if (intent != null) {
                    this.credentialsModel = (CredentialsModel) getIntent().getSerializableExtra(str);
                } else if (bundle != null) {
                    this.credentialsModel = (CredentialsModel) bundle.getSerializable(str);
                }
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            bundle.putSerializable(EXTRA_CREDENTIALS, this.credentialsModel);
        }
    }

    /* Access modifiers changed, original: protected */
    public CredentialsModel getCredentialsModel() {
        return this.credentialsModel;
    }
}
