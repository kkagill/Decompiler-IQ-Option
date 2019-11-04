package com.iqoption.activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.VideoView;
import androidx.core.view.ViewCompat;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.k;
import com.iqoption.core.analytics.c;
import com.iqoption.fragment.account.security.touchId.PasscodeFragment;
import com.iqoption.service.WebSocketHandler;
import com.iqoption.x.R;

public class VideoActivity extends b {
    public static final String TAG = "com.iqoption.activity.VideoActivity";
    private VideoView ajS;
    private WebView ajT;
    private ProgressBar ajU;
    private boolean ajV;
    private String ajW;
    private String ajX;
    private c ajY;
    private int mProgress = 0;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.videoview_activity);
        Bundle bundleExtra = getIntent().getBundleExtra("params");
        String string = bundleExtra.getString("path");
        String string2 = bundleExtra.getString("id");
        bundleExtra.getInt("REQUEST_CODE", 0);
        this.ajW = bundleExtra.getString("RETURN_PARAM");
        this.ajX = bundleExtra.getString("ARG_SCREEN_OPENED_EVENT");
        String str = "PROGRESS";
        this.mProgress = bundleExtra.getInt(str);
        if (bundle != null) {
            this.mProgress = bundle.getInt(str);
        }
        this.ajV = bundleExtra.getBoolean("IS_EDUCATION_VIDEO", false);
        this.ajT = (WebView) findViewById(R.id.webViewHolder);
        this.ajT.setWebChromeClient(new WebChromeClient());
        this.ajT.getSettings().setJavaScriptEnabled(true);
        this.ajT.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.ajT.setLayerType(1, null);
        this.ajU = (ProgressBar) findViewById(R.id.progressBarVideo);
        this.ajS = (VideoView) findViewById(R.id.videoHolder);
        this.ajS.setMediaController(new MediaController(this));
        this.ajS.setOnErrorListener(new -$$Lambda$VideoActivity$MPrrkpxsqCfKAVPnYI3VJYt0V2U(this, string2));
        this.ajS.setOnPreparedListener(new OnPreparedListener() {
            public void onPrepared(MediaPlayer mediaPlayer) {
                VideoActivity.this.ajU.setVisibility(8);
            }
        });
        this.ajS.setOnCompletionListener(new OnCompletionListener() {
            public void onCompletion(MediaPlayer mediaPlayer) {
                if (VideoActivity.this.ajV) {
                    k.f(VideoActivity.this.getApplicationContext(), 16);
                }
                VideoActivity.this.finish();
            }
        });
        this.ajS.setVideoPath(string);
        this.ajS.seekTo(this.mProgress);
        this.ajS.start();
    }

    private /* synthetic */ boolean a(String str, MediaPlayer mediaPlayer, int i, int i2) {
        if (this.ajV) {
            this.ajU.setVisibility(8);
            this.ajS.setVisibility(8);
            this.ajT.setVisibility(0);
            this.ajT.loadData(dc(str), "text/html", "UTF-8");
        } else {
            finish();
        }
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void Ay() {
        this.mProgress = this.ajS.getCurrentPosition() > 0 ? this.ajS.getCurrentPosition() : this.mProgress;
        Intent intent = new Intent();
        intent.putExtra("IS_EDUCATION_VIDEO", this.ajV);
        intent.putExtra("PROGRESS", this.mProgress);
        intent.putExtra("RETURN_PARAM", this.ajW);
        setResult(-1, intent);
    }

    /* Access modifiers changed, original: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("PROGRESS", this.ajS.getCurrentPosition() > 0 ? this.ajS.getCurrentPosition() : this.mProgress);
    }

    /* Access modifiers changed, original: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.mProgress = bundle.getInt("PROGRESS");
    }

    public void onPause() {
        super.onPause();
        c cVar = this.ajY;
        if (cVar != null) {
            cVar.Cc();
        }
        Ay();
        this.ajS.pause();
        PasscodeFragment.bv(this);
    }

    public void onResume() {
        super.onResume();
        if (this.ajX != null) {
            this.ajY = IQApp.Eu().EC().dm(this.ajX);
        }
        this.ajS.seekTo(this.mProgress);
    }

    public void onBackPressed() {
        Ay();
        super.onBackPressed();
    }

    public void finish() {
        Ay();
        super.finish();
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        super.onStart();
        WebSocketHandler.aTn().cj(TAG);
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
        super.onStop();
        WebSocketHandler.aTn().n(TAG, 30000);
    }

    public String dc(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<iframe class=\"youtube-player\" style=\"border: 0; width: 100%; height: 95%;padding:0px; margin:0px\" id=\"ytplayer\" type=\"text/html\" src=\"http://www.youtube.com/embed/");
        stringBuilder.append(str);
        stringBuilder.append("?fs=0\" frameborder=\"0\" allowfullscreen autobuffer controls onclick=\"this.play()\">\n</iframe>\n");
        return stringBuilder.toString();
    }
}
