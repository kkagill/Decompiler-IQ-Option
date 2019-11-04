package com.iqoption.service;

import android.text.TextUtils;
import com.iqoption.mobbtech.connect.RequestManager;
import com.iqoption.service.d.a;
import java.io.StringReader;
import okhttp3.Request.Builder;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

/* compiled from: OkHttpWebSocketDelegate */
public class c extends d {
    private static final String TAG = "com.iqoption.service.c";
    private WebSocket dRJ;

    /* Access modifiers changed, original: 0000 */
    public void a(String str, final int i, final a aVar) {
        RequestManager.aOR().aOS().newWebSocket(new Builder().url(str).build(), new WebSocketListener() {
            public void onOpen(WebSocket webSocket, Response response) {
                super.onOpen(webSocket, response);
                c.this.dRJ = webSocket;
                aVar.ha(i);
            }

            public void onMessage(WebSocket webSocket, String str) {
                super.onMessage(webSocket, str);
                if (!TextUtils.isEmpty(str)) {
                    aVar.a(i, str, new StringReader(str));
                }
            }

            public void onFailure(WebSocket webSocket, Throwable th, Response response) {
                super.onFailure(webSocket, th, response);
                try {
                    webSocket.cancel();
                } catch (Exception unused) {
                }
                aVar.a(i, th, response);
            }

            public void onClosed(WebSocket webSocket, int i, String str) {
                super.onClosed(webSocket, i, str);
                aVar.hb(i);
            }

            public void onClosing(WebSocket webSocket, int i, String str) {
                super.onClosing(webSocket, i, str);
                aVar.hb(i);
            }

            public void onMessage(WebSocket webSocket, ByteString byteString) {
                super.onMessage(webSocket, byteString);
                aVar.hb(i);
            }
        });
    }

    /* Access modifiers changed, original: 0000 */
    public void fk(String str) {
        WebSocket webSocket = this.dRJ;
        if (webSocket != null) {
            webSocket.send(str);
        }
    }

    public void aTm() {
        WebSocket webSocket = this.dRJ;
        if (webSocket != null) {
            try {
                webSocket.close(1000, "Goodbye, World!");
            } catch (Exception unused) {
            }
        }
    }
}
