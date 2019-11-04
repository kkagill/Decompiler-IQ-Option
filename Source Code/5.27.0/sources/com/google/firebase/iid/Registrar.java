package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseApp;
import com.google.firebase.a.d;
import com.google.firebase.c.f;
import com.google.firebase.c.g;
import com.google.firebase.components.b;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import java.util.Arrays;
import java.util.List;

@KeepForSdk
@Keep
public final class Registrar implements h {

    private static class a implements com.google.firebase.iid.a.a {
        private final FirebaseInstanceId acN;

        public a(FirebaseInstanceId firebaseInstanceId) {
            this.acN = firebaseInstanceId;
        }
    }

    @Keep
    public final List<b<?>> getComponents() {
        b wf = b.q(FirebaseInstanceId.class).a(n.v(FirebaseApp.class)).a(n.v(d.class)).a(n.v(g.class)).a(q.adi).wc().wf();
        b wf2 = b.q(com.google.firebase.iid.a.a.class).a(n.v(FirebaseInstanceId.class)).a(p.adi).wf();
        b S = f.S("fire-iid", "18.0.0");
        return Arrays.asList(new b[]{wf, wf2, S});
    }
}
