package com.iqoption.util;

import android.app.Activity;
import android.content.Context;
import android.media.SoundPool;
import android.media.SoundPool.Builder;
import android.os.Build.VERSION;
import android.util.SparseBooleanArray;
import com.iqoption.app.d;
import com.iqoption.x.R;
import java.util.HashMap;
import java.util.Map;

public class MusicUtil {
    private static SoundPool ebI;
    private static final Map<Sound, Integer> ebJ = new HashMap();
    private static final SparseBooleanArray ebK = new SparseBooleanArray();

    public enum Sound {
        WIN(R.raw.win),
        LOSE(R.raw.lose),
        GAME_WIN(R.raw.game_win),
        GAME_LOSE(R.raw.game_lose),
        DO_BUY(R.raw.do_buy),
        ALERT_TRIGGERED(R.raw.alert_triggered);
        
        final int resId;

        private Sound(int i) {
            this.resId = i;
        }
    }

    public static boolean bN(Context context) {
        return d.aP(context).FA();
    }

    public static void n(Activity activity) {
        activity.setVolumeControlStream(3);
        int i = 0;
        if (VERSION.SDK_INT >= 21) {
            ebI = new Builder().build();
        } else {
            ebI = new SoundPool(2, 3, 0);
        }
        ebI.setOnLoadCompleteListener(-$$Lambda$MusicUtil$UJp6Z730l5i9QA6BurfhWiW2Log.INSTANCE);
        Sound[] values = Sound.values();
        int length = values.length;
        while (i < length) {
            b(activity, values[i]);
            i++;
        }
    }

    public static void a(Context context, Sound sound) {
        if (bN(context) && b(sound)) {
            ebI.play(a(sound), 1.0f, 1.0f, 0, 0, 1.0f);
        }
    }

    private static int a(Sound sound) {
        Integer num = (Integer) ebJ.get(sound);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static void b(Context context, Sound sound) {
        ebJ.put(sound, Integer.valueOf(ebI.load(context, sound.resId, 1)));
    }

    private static boolean b(Sound sound) {
        Integer num = (Integer) ebJ.get(sound);
        if (num == null) {
            return false;
        }
        return ebK.get(num.intValue(), false);
    }
}
