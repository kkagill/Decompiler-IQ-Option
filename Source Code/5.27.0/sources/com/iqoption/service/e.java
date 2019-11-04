package com.iqoption.service;

import com.iqoption.core.data.model.InstrumentType;
import java.lang.ref.WeakReference;

/* compiled from: WebSocketEvents */
public interface e {

    /* compiled from: WebSocketEvents */
    public static class a implements e {
    }

    /* compiled from: WebSocketEvents */
    public static class c implements e {
    }

    /* compiled from: WebSocketEvents */
    public static class e implements e {
    }

    /* compiled from: WebSocketEvents */
    public static class g implements e {
        public final String bvZ;

        g(String str) {
            this.bvZ = str;
        }
    }

    /* compiled from: WebSocketEvents */
    public static class h implements e {
    }

    /* compiled from: WebSocketEvents */
    public static class i implements e {
        public String toString() {
            return "RECONNECT SOCKET";
        }
    }

    /* compiled from: WebSocketEvents */
    public static class j implements e {
    }

    /* compiled from: WebSocketEvents */
    public static class l implements e {
    }

    /* compiled from: WebSocketEvents */
    public static class m implements e {
    }

    /* compiled from: WebSocketEvents */
    public static class b extends com.iqoption.system.a.c<Boolean> implements e {
    }

    /* compiled from: WebSocketEvents */
    public static class d extends com.iqoption.system.a.c<InstrumentType> implements e {
    }

    /* compiled from: WebSocketEvents */
    public static class k extends com.iqoption.system.a.c<Boolean> implements e {
    }

    /* compiled from: WebSocketEvents */
    public static class f extends com.iqoption.system.a.c<WeakReference<WebSocketHandler>> implements e {
    }
}
