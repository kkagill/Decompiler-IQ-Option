package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.internal.d;

public class CustomTabMainActivity extends Activity {
    public static final String sY;
    public static final String sZ;
    public static final String ta;
    public static final String tb;
    private boolean tc = true;
    private BroadcastReceiver td;

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(CustomTabMainActivity.class.getSimpleName());
        stringBuilder.append(".extra_params");
        sY = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(CustomTabMainActivity.class.getSimpleName());
        stringBuilder.append(".extra_chromePackage");
        sZ = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(CustomTabMainActivity.class.getSimpleName());
        stringBuilder.append(".extra_url");
        ta = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(CustomTabMainActivity.class.getSimpleName());
        stringBuilder.append(".action_refresh");
        tb = stringBuilder.toString();
    }

    public static final String gG() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("fb");
        stringBuilder.append(f.go());
        stringBuilder.append("://authorize");
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (CustomTabActivity.sU.equals(getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle == null) {
            bundle = getIntent().getBundleExtra(sY);
            new d("oauth", bundle).b(this, getIntent().getStringExtra(sZ));
            this.tc = false;
            this.td = new BroadcastReceiver() {
                public void onReceive(Context context, Intent intent) {
                    Intent intent2 = new Intent(CustomTabMainActivity.this, CustomTabMainActivity.class);
                    intent2.setAction(CustomTabMainActivity.tb);
                    intent2.putExtra(CustomTabMainActivity.ta, intent.getStringExtra(CustomTabMainActivity.ta));
                    intent2.addFlags(603979776);
                    CustomTabMainActivity.this.startActivity(intent2);
                }
            };
            LocalBroadcastManager.getInstance(this).registerReceiver(this.td, new IntentFilter(CustomTabActivity.sU));
        }
    }

    /* Access modifiers changed, original: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (tb.equals(intent.getAction())) {
            LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent(CustomTabActivity.sV));
            a(-1, intent);
        } else if (CustomTabActivity.sU.equals(intent.getAction())) {
            a(-1, intent);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onResume() {
        super.onResume();
        if (this.tc) {
            a(0, null);
        }
        this.tc = true;
    }

    private void a(int i, Intent intent) {
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.td);
        if (intent != null) {
            setResult(i, intent);
        } else {
            setResult(i);
        }
        finish();
    }
}
