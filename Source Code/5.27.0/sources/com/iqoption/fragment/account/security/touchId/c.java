package com.iqoption.fragment.account.security.touchId;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.databinding.DataBindingUtil;
import com.google.common.b.e;
import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.t;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.d;
import com.iqoption.dto.Event;
import com.iqoption.e.u;
import com.iqoption.x.R;
import java.lang.ref.WeakReference;

/* compiled from: TurnOnTouchIdViewHelper */
public class c implements OnCheckedChangeListener {
    public static final String TAG = "com.iqoption.fragment.account.security.touchId.c";
    private u dal;
    private b dam;
    private a dan = new a();

    /* compiled from: TurnOnTouchIdViewHelper */
    private static class a {
        private final WeakReference<c> dao;

        private a(c cVar) {
            this.dao = new WeakReference(cVar);
        }

        @e
        public void onPasscode(com.iqoption.app.b.e.b bVar) {
            c cVar = (c) this.dao.get();
            if (cVar != null) {
                c.a(((Long) bVar.getValue()).longValue() >= 0, cVar);
            }
        }
    }

    /* compiled from: TurnOnTouchIdViewHelper */
    public interface b {
        void azo();

        t<Long> dx(boolean z);
    }

    /* compiled from: TurnOnTouchIdViewHelper */
    private static class c extends com.iqoption.system.c.b<c, Long> {
        private final boolean cZT;

        public c(c cVar, boolean z) {
            super(cVar);
            this.cZT = z;
        }

        /* renamed from: a */
        public void v(c cVar, Long l) {
            c(cVar);
        }

        /* renamed from: a */
        public void c(c cVar, Throwable th) {
            c(cVar);
            c.a(d.aP(cVar.getView().getContext()).FM() >= 0, cVar);
        }

        private static void c(c cVar) {
            cVar.dal.bTd.d(false, false);
        }
    }

    public static c a(Context context, ViewGroup viewGroup, boolean z, b bVar) {
        c cVar = new c();
        cVar.dam = bVar;
        cVar.a(context, viewGroup);
        cVar.dal.getRoot().setTag(TAG);
        a(z, cVar);
        cVar.dal.bTd.setOnCheckedChangeListener(cVar);
        return cVar;
    }

    public Object azX() {
        return this.dan;
    }

    private static void a(boolean z, c cVar) {
        cVar.dal.bTd.setOnCheckedChangeListener(null);
        cVar.dal.bTd.setChecked(z);
        cVar.dal.bTe.setText(z ? R.string.turn_passcode_off : R.string.turn_passcode_on);
        cVar.dal.bTh.setVisibility(z ? 0 : 8);
        cVar.dal.bTd.setOnCheckedChangeListener(cVar);
    }

    public View getView() {
        return this.dal.getRoot();
    }

    private void a(Context context, ViewGroup viewGroup) {
        this.dal = (u) DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.account_security_turn_on_touch_id_fragment, viewGroup, viewGroup != null);
        this.dal.a(this);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.dal.bTd.d(true, true);
        p.a(this.dam.dx(z), new c(this, z), com.iqoption.core.c.a.biN);
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "security_touch-id-set").setValue(Double.valueOf(z ? 1.0d : 0.0d)).build());
    }

    public void azo() {
        this.dam.azo();
    }
}
