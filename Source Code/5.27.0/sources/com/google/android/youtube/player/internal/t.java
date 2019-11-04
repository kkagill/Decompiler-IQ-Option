package com.google.android.youtube.player.internal;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.google.android.youtube.player.YouTubePlayer.a;
import com.google.android.youtube.player.YouTubePlayer.c;
import com.google.android.youtube.player.YouTubePlayer.d;

public final class t implements YouTubePlayer {
    private d RB;
    private f RC;

    public t(d dVar, f fVar) {
        this.RB = (d) b.d(dVar, "connectionClient cannot be null");
        this.RC = (f) b.d(fVar, "embeddedPlayer cannot be null");
    }

    public final void a(Configuration configuration) {
        try {
            this.RC.a(configuration);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void a(final a aVar) {
        try {
            this.RC.a(new g.a() {
                public final void a(boolean z) {
                    aVar.onFullscreen(z);
                }
            });
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void a(final c cVar) {
        try {
            this.RC.a(new h.a() {
                public final void a() {
                    cVar.pt();
                }

                public final void a(int i) {
                    cVar.bl(i);
                }

                public final void a(boolean z) {
                    cVar.ag(z);
                }

                public final void b() {
                    cVar.onPaused();
                }

                public final void c() {
                    cVar.onStopped();
                }
            });
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void a(final d dVar) {
        try {
            this.RC.a(new i.a() {
                public final void a() {
                    dVar.pu();
                }

                public final void a(String str) {
                    dVar.bL(str);
                }

                public final void b() {
                    dVar.pv();
                }

                public final void b(String str) {
                    ErrorReason valueOf;
                    try {
                        valueOf = ErrorReason.valueOf(str);
                    } catch (IllegalArgumentException | NullPointerException unused) {
                        valueOf = ErrorReason.UNKNOWN;
                    }
                    dVar.a(valueOf);
                }

                public final void c() {
                    dVar.pw();
                }

                public final void d() {
                    dVar.px();
                }
            });
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void a(boolean z) {
        try {
            this.RC.a(z);
            this.RB.a(z);
            this.RB.d();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final boolean a(int i, KeyEvent keyEvent) {
        try {
            return this.RC.a(i, keyEvent);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void b() {
        try {
            this.RC.m();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void b(boolean z) {
        try {
            this.RC.e(z);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final boolean b(int i, KeyEvent keyEvent) {
        try {
            return this.RC.b(i, keyEvent);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void bK(String str) {
        j(str, 0);
    }

    public final void bk(int i) {
        try {
            this.RC.a(i);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void c() {
        try {
            this.RC.pF();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void d() {
        try {
            this.RC.o();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void e() {
        try {
            this.RC.p();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void f() {
        try {
            this.RC.q();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void g() {
        try {
            this.RC.l();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final boolean isPlaying() {
        try {
            return this.RC.c();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void j(String str, int i) {
        try {
            this.RC.i(str, i);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final View pK() {
        try {
            return (View) x.a(this.RC.pH());
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final Bundle pL() {
        try {
            return this.RC.pG();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void pause() {
        try {
            this.RC.b();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void play() {
        try {
            this.RC.a();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final int pr() {
        try {
            return this.RC.pC();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final int ps() {
        try {
            return this.RC.pD();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void setFullscreen(boolean z) {
        try {
            this.RC.b(z);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final boolean u(Bundle bundle) {
        try {
            return this.RC.u(bundle);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }
}
