package com.iqoption.view.text;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import com.iqoption.view.d.e;

/* compiled from: LongTouchHandler */
public class g {
    private long bNB;
    private boolean bNC;
    private OnTouchListener eik;
    private b eil;
    private Runnable eim;
    final Handler handler;
    private View mView;

    /* compiled from: LongTouchHandler */
    public static final class a {
        private long bNB = 150;
        private OnTouchListener eik = null;
        private b eil;
        private View view;

        public a ci(View view) {
            this.view = view;
            return this;
        }

        public a a(OnTouchListener onTouchListener) {
            this.eik = onTouchListener;
            return this;
        }

        public a a(b bVar) {
            this.eil = bVar;
            return this;
        }

        public g aYG() {
            return new g(this, null);
        }
    }

    /* compiled from: LongTouchHandler */
    public interface b {
        void bj(View view);
    }

    /* synthetic */ g(a aVar, AnonymousClass1 anonymousClass1) {
        this(aVar);
    }

    private g(a aVar) {
        this.handler = new Handler();
        this.bNB = 150;
        this.eik = null;
        this.bNC = false;
        this.eim = new Runnable() {
            public void run() {
                if (g.this.bNC) {
                    g.this.amK();
                    g.this.handler.postDelayed(g.this.eim, g.this.bNB);
                }
            }
        };
        this.mView = aVar.view;
        this.bNB = aVar.bNB;
        this.eik = aVar.eik;
        this.eil = aVar.eil;
        init();
    }

    private void init() {
        this.mView.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                g.this.amK();
            }
        });
        this.mView.setOnLongClickListener(new OnLongClickListener() {
            public boolean onLongClick(View view) {
                g.this.bNC = true;
                g.this.handler.postDelayed(g.this.eim, g.this.bNB);
                return false;
            }
        });
        this.mView.setOnTouchListener(new e(this.eik) {
            public boolean d(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1 && g.this.bNC) {
                    g.this.bNC = false;
                    g.this.handler.removeCallbacks(g.this.eim);
                }
                return false;
            }
        });
    }

    private void amK() {
        b bVar = this.eil;
        if (bVar != null) {
            bVar.bj(this.mView);
        }
    }
}
