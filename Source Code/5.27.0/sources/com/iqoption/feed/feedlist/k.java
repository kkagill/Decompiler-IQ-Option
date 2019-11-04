package com.iqoption.feed.feedlist;

import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.c;
import com.iqoption.core.microservices.feed.response.a;
import com.iqoption.feed.j;
import com.iqoption.feed.j.b;

/* compiled from: YouTubeHolderPlayer */
public class k implements j {
    private final b cPj;
    private final FrameLayout cQy;
    @Nullable
    private a cRh;
    @Nullable
    private c cRi;

    public k(FrameLayout frameLayout, b bVar) {
        this.cQy = frameLayout;
        this.cPj = bVar;
    }

    public void awf() {
        final String awh = awh();
        if (!TextUtils.isEmpty(awh) && !this.cPj.hX(awh)) {
            awg();
            this.cPj.a(new j.a() {
                public void onError() {
                }

                public void a(c cVar, YouTubePlayer youTubePlayer) {
                    ViewGroup viewGroup = (ViewGroup) cVar.getParent();
                    Object obj = k.this.cQy == viewGroup ? 1 : null;
                    if (viewGroup != null && obj == null) {
                        viewGroup.removeView(cVar);
                    }
                    k.this.cRi = cVar;
                    if (viewGroup == null || obj == null) {
                        k.this.cQy.addView(k.this.cRi);
                    }
                    try {
                        if (!k.this.cPj.hX(awh)) {
                            k.this.cPj.bK(awh);
                        } else if (!youTubePlayer.isPlaying()) {
                            if (youTubePlayer.ps() == youTubePlayer.pr()) {
                                youTubePlayer.bk(0);
                            }
                            youTubePlayer.play();
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    public void awg() {
        String awh = awh();
        if (awh != null) {
            this.cPj.hW(awh);
        }
        c cVar = this.cRi;
        if (cVar != null) {
            this.cQy.removeView(cVar);
        }
    }

    public void g(a aVar) {
        this.cRh = aVar;
    }

    @Nullable
    private String awh() {
        a aVar = this.cRh;
        if (aVar == null) {
            return null;
        }
        if (!"YouTube".equals(aVar.getSource())) {
            return null;
        }
        String path = Uri.parse(this.cRh.adH()).getPath();
        int indexOf = path.indexOf("embed/");
        if (indexOf >= 0) {
            return path.substring(indexOf + 6);
        }
        if (path.startsWith("/") && path.length() > 1) {
            path = path.substring(1);
        }
        return path;
    }
}
