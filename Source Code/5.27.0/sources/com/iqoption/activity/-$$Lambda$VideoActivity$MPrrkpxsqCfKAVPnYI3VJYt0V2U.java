package com.iqoption.activity;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$VideoActivity$MPrrkpxsqCfKAVPnYI3VJYt0V2U implements OnErrorListener {
    private final /* synthetic */ VideoActivity f$0;
    private final /* synthetic */ String f$1;

    public /* synthetic */ -$$Lambda$VideoActivity$MPrrkpxsqCfKAVPnYI3VJYt0V2U(VideoActivity videoActivity, String str) {
        this.f$0 = videoActivity;
        this.f$1 = str;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        return this.f$0.a(this.f$1, mediaPlayer, i, i2);
    }
}
