package com.noveogroup.android.log;

import com.noveogroup.android.log.Logger.Level;

/* compiled from: SimpleLogger */
public class f extends a {
    private final b eCh;

    public f(String str, b bVar) {
        super(str);
        this.eCh = bVar;
    }

    public boolean a(Level level) {
        b bVar = this.eCh;
        return bVar != null && bVar.a(level);
    }

    public void a(Level level, String str, Throwable th) {
        b bVar = this.eCh;
        if (bVar != null) {
            bVar.a(getName(), level, th, str);
        }
    }

    public void a(Level level, Throwable th, String str, Object... objArr) {
        b bVar = this.eCh;
        if (bVar != null) {
            bVar.a(getName(), level, th, str, objArr);
        }
    }
}
