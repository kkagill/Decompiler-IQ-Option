package com.google.android.youtube.player;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.youtube.player.YouTubePlayer.e;

public class b extends Fragment implements e {
    private final a QZ = new a(this, (byte) 0);
    private Bundle Ra;
    private c Rb;
    private com.google.android.youtube.player.YouTubePlayer.b Rc;
    private String d;
    private boolean f;

    private final class a implements b {
        private a() {
        }

        /* synthetic */ a(b bVar, byte b) {
            this();
        }

        public final void a(c cVar) {
        }
    }

    private void a() {
        c cVar = this.Rb;
        if (cVar != null && this.Rc != null) {
            cVar.a(this.f);
            this.Rb.a(getActivity(), this, this.d, this.Rc, this.Ra);
            this.Ra = null;
            this.Rc = null;
        }
    }

    public void a(String str, com.google.android.youtube.player.YouTubePlayer.b bVar) {
        this.d = com.google.android.youtube.player.internal.b.c(str, "Developer key cannot be null or empty");
        this.Rc = bVar;
        a();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.Ra = bundle != null ? bundle.getBundle("YouTubePlayerSupportFragment.KEY_PLAYER_VIEW_STATE") : null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.Rb = new c(getActivity(), null, 0, this.QZ);
        a();
        return this.Rb;
    }

    public void onDestroy() {
        if (this.Rb != null) {
            FragmentActivity activity = getActivity();
            c cVar = this.Rb;
            boolean z = activity == null || activity.isFinishing();
            cVar.b(z);
        }
        super.onDestroy();
    }

    public void onDestroyView() {
        this.Rb.c(getActivity().isFinishing());
        this.Rb = null;
        super.onDestroyView();
    }

    public void onPause() {
        this.Rb.c();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.Rb.b();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        c cVar = this.Rb;
        bundle.putBundle("YouTubePlayerSupportFragment.KEY_PLAYER_VIEW_STATE", cVar != null ? cVar.py() : this.Ra);
    }

    public void onStart() {
        super.onStart();
        this.Rb.a();
    }

    public void onStop() {
        this.Rb.d();
        super.onStop();
    }
}
