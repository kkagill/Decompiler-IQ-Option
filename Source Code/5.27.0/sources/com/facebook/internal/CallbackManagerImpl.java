package com.facebook.internal;

import android.content.Intent;
import com.facebook.d;
import com.facebook.f;
import java.util.HashMap;
import java.util.Map;

public final class CallbackManagerImpl implements d {
    private static final String TAG = "CallbackManagerImpl";
    private static Map<Integer, a> xG = new HashMap();
    private Map<Integer, a> xH = new HashMap();

    public enum RequestCodeOffset {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8);
        
        private final int offset;

        private RequestCodeOffset(int i) {
            this.offset = i;
        }

        public int toRequestCode() {
            return f.hc() + this.offset;
        }
    }

    public interface a {
        boolean b(int i, Intent intent);
    }

    public static synchronized void a(int i, a aVar) {
        synchronized (CallbackManagerImpl.class) {
            aa.b((Object) aVar, "callback");
            if (xG.containsKey(Integer.valueOf(i))) {
                return;
            }
            xG.put(Integer.valueOf(i), aVar);
        }
    }

    private static synchronized a a(Integer num) {
        a aVar;
        synchronized (CallbackManagerImpl.class) {
            aVar = (a) xG.get(num);
        }
        return aVar;
    }

    private static boolean a(int i, int i2, Intent intent) {
        a a = a(Integer.valueOf(i));
        return a != null ? a.b(i2, intent) : false;
    }

    public void b(int i, a aVar) {
        aa.b((Object) aVar, "callback");
        this.xH.put(Integer.valueOf(i), aVar);
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        a aVar = (a) this.xH.get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar.b(i2, intent);
        }
        return a(i, i2, intent);
    }
}
