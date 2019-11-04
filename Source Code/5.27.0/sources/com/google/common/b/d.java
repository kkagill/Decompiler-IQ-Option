package com.google.common.b;

import com.google.common.base.e;
import com.google.common.base.i;
import com.google.common.util.concurrent.x;
import com.iqoption.dto.entity.position.Position;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: EventBus */
public class d {
    private static final Logger logger = Logger.getLogger(d.class.getName());
    private final h Yc;
    private final i Yd;
    private final c Ye;
    private final Executor executor;
    private final String identifier;

    /* compiled from: EventBus */
    static final class a implements h {
        static final a Yf = new a();

        a() {
        }

        public void b(Throwable th, g gVar) {
            Logger a = a(gVar);
            if (a.isLoggable(Level.SEVERE)) {
                a.log(Level.SEVERE, b(gVar), th);
            }
        }

        private static Logger a(g gVar) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(d.class.getName());
            stringBuilder.append(".");
            stringBuilder.append(gVar.uM().uK());
            return Logger.getLogger(stringBuilder.toString());
        }

        private static String b(g gVar) {
            Method uO = gVar.uO();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Exception thrown by subscriber method ");
            stringBuilder.append(uO.getName());
            stringBuilder.append('(');
            stringBuilder.append(uO.getParameterTypes()[0].getName());
            stringBuilder.append(')');
            stringBuilder.append(" on subscriber ");
            stringBuilder.append(gVar.uN());
            stringBuilder.append(" when dispatching event: ");
            stringBuilder.append(gVar.uG());
            return stringBuilder.toString();
        }
    }

    public d() {
        this(Position.CLOSE_REASON_DEFAULT);
    }

    public d(String str) {
        this(str, x.vG(), c.uH(), a.Yf);
    }

    d(String str, Executor executor, c cVar, h hVar) {
        this.Yd = new i(this);
        this.identifier = (String) i.checkNotNull(str);
        this.executor = (Executor) i.checkNotNull(executor);
        this.Ye = (c) i.checkNotNull(cVar);
        this.Yc = (h) i.checkNotNull(hVar);
    }

    public final String uK() {
        return this.identifier;
    }

    /* Access modifiers changed, original: final */
    public final Executor uL() {
        return this.executor;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(Throwable th, g gVar) {
        i.checkNotNull(th);
        i.checkNotNull(gVar);
        try {
            this.Yc.b(th, gVar);
        } catch (Throwable th2) {
            logger.log(Level.SEVERE, String.format(Locale.ROOT, "Exception %s thrown while handling exception: %s", new Object[]{th2, th}), th2);
        }
    }

    public void bb(Object obj) {
        this.Yd.bb(obj);
    }

    public void bc(Object obj) {
        this.Yd.bc(obj);
    }

    public void bd(Object obj) {
        Iterator bh = this.Yd.bh(obj);
        if (bh.hasNext()) {
            this.Ye.a(obj, bh);
        } else if (!(obj instanceof b)) {
            bd(new b(this, obj));
        }
    }

    public String toString() {
        return e.aj(this).ak(this.identifier).toString();
    }
}
