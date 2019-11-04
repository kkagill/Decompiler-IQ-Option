package com.iqoption.util;

import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$MusicUtil$UJp6Z730l5i9QA6BurfhWiW2Log implements OnLoadCompleteListener {
    public static final /* synthetic */ -$$Lambda$MusicUtil$UJp6Z730l5i9QA6BurfhWiW2Log INSTANCE = new -$$Lambda$MusicUtil$UJp6Z730l5i9QA6BurfhWiW2Log();

    private /* synthetic */ -$$Lambda$MusicUtil$UJp6Z730l5i9QA6BurfhWiW2Log() {
    }

    public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
        MusicUtil.ebK.put(i, true);
    }
}
