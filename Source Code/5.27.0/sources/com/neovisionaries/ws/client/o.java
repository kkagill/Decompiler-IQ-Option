package com.neovisionaries.ws.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: ListenerManager */
class o {
    private final af dRF;
    private boolean ezQ = true;
    private List<al> ezR;
    private final List<al> mListeners = new ArrayList();

    public o(af afVar) {
        this.dRF = afVar;
    }

    public void a(al alVar) {
        if (alVar != null) {
            synchronized (this.mListeners) {
                this.mListeners.add(alVar);
                this.ezQ = true;
            }
        }
    }

    private List<al> beY() {
        synchronized (this.mListeners) {
            if (this.ezQ) {
                ArrayList arrayList = new ArrayList(this.mListeners.size());
                for (al add : this.mListeners) {
                    arrayList.add(add);
                }
                this.ezR = arrayList;
                this.ezQ = false;
                return arrayList;
            }
            List list = this.ezR;
            return list;
        }
    }

    public void a(WebSocketState webSocketState) {
        for (al alVar : beY()) {
            try {
                alVar.a(this.dRF, webSocketState);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    public void R(Map<String, List<String>> map) {
        for (al alVar : beY()) {
            try {
                alVar.a(this.dRF, (Map) map);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    public void a(aj ajVar, aj ajVar2, boolean z) {
        for (al alVar : beY()) {
            try {
                alVar.a(this.dRF, ajVar, ajVar2, z);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    public void a(aj ajVar) {
        for (al alVar : beY()) {
            try {
                alVar.a(this.dRF, ajVar);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    public void b(aj ajVar) {
        for (al alVar : beY()) {
            try {
                alVar.b(this.dRF, ajVar);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    public void c(aj ajVar) {
        for (al alVar : beY()) {
            try {
                alVar.c(this.dRF, ajVar);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    public void d(aj ajVar) {
        for (al alVar : beY()) {
            try {
                alVar.d(this.dRF, ajVar);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    public void e(aj ajVar) {
        for (al alVar : beY()) {
            try {
                alVar.e(this.dRF, ajVar);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    public void f(aj ajVar) {
        for (al alVar : beY()) {
            try {
                alVar.f(this.dRF, ajVar);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    public void g(aj ajVar) {
        for (al alVar : beY()) {
            try {
                alVar.g(this.dRF, ajVar);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    public void kw(String str) {
        for (al alVar : beY()) {
            try {
                alVar.a(this.dRF, str);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    public void q(byte[] bArr) {
        for (al alVar : beY()) {
            try {
                alVar.a(this.dRF, bArr);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    public void r(byte[] bArr) {
        for (al alVar : beY()) {
            try {
                alVar.b(this.dRF, bArr);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    public void h(aj ajVar) {
        for (al alVar : beY()) {
            try {
                alVar.h(this.dRF, ajVar);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    public void i(aj ajVar) {
        for (al alVar : beY()) {
            try {
                alVar.i(this.dRF, ajVar);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    public void j(aj ajVar) {
        for (al alVar : beY()) {
            try {
                alVar.j(this.dRF, ajVar);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    public void a(ThreadType threadType, Thread thread) {
        for (al alVar : beY()) {
            try {
                alVar.a(this.dRF, threadType, thread);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    public void b(ThreadType threadType, Thread thread) {
        for (al alVar : beY()) {
            try {
                alVar.b(this.dRF, threadType, thread);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    public void c(ThreadType threadType, Thread thread) {
        for (al alVar : beY()) {
            try {
                alVar.c(this.dRF, threadType, thread);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    public void a(WebSocketException webSocketException) {
        for (al alVar : beY()) {
            try {
                alVar.a(this.dRF, webSocketException);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    public void a(WebSocketException webSocketException, aj ajVar) {
        for (al alVar : beY()) {
            try {
                alVar.b(this.dRF, webSocketException, ajVar);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    public void a(WebSocketException webSocketException, List<aj> list) {
        for (al alVar : beY()) {
            try {
                alVar.a(this.dRF, webSocketException, (List) list);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    public void a(WebSocketException webSocketException, byte[] bArr) {
        for (al alVar : beY()) {
            try {
                alVar.b(this.dRF, webSocketException, bArr);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    public void b(WebSocketException webSocketException, byte[] bArr) {
        for (al alVar : beY()) {
            try {
                alVar.a(this.dRF, webSocketException, bArr);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    public void b(WebSocketException webSocketException, aj ajVar) {
        for (al alVar : beY()) {
            try {
                alVar.a(this.dRF, webSocketException, ajVar);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    public void b(WebSocketException webSocketException) {
        for (al alVar : beY()) {
            try {
                alVar.b(this.dRF, webSocketException);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }

    private void a(al alVar, Throwable th) {
        try {
            alVar.a(this.dRF, th);
        } catch (Throwable unused) {
        }
    }

    public void f(String str, List<String[]> list) {
        for (al alVar : beY()) {
            try {
                alVar.a(this.dRF, str, (List) list);
            } catch (Throwable th) {
                a(alVar, th);
            }
        }
    }
}
