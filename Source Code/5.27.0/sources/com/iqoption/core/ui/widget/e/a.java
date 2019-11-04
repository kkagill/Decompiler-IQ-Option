package com.iqoption.core.ui.widget.e;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import androidx.annotation.NonNull;

/* compiled from: LongTouchHandler */
public class a {
    private static final Handler bNA = new Handler(Looper.getMainLooper());
    private long bNB = 150;
    private boolean bNC = false;
    private b bND;
    final View view;

    /* compiled from: LongTouchHandler */
    private class a implements OnClickListener, OnLongClickListener, OnTouchListener, Runnable {
        private a() {
        }

        public void onClick(View view) {
            a.this.amK();
        }

        public boolean onLongClick(View view) {
            a.this.bNC = true;
            a.bNA.postDelayed(this, a.this.bNB);
            return false;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1 && a.this.bNC) {
                a.this.bNC = false;
                a.bNA.removeCallbacks(this);
            }
            return false;
        }

        public void run() {
            if (a.this.bNC) {
                a.this.amK();
                a.bNA.postDelayed(this, a.this.bNB);
            }
        }
    }

    /* compiled from: LongTouchHandler */
    public interface b {
        void onPerform(@NonNull View view, boolean z);
    }

    public a(@NonNull View view) {
        this.view = view;
        a aVar = new a();
        view.setOnClickListener(aVar);
        view.setOnLongClickListener(aVar);
        view.setOnTouchListener(aVar);
    }

    public void a(b bVar) {
        this.bND = bVar;
    }

    /* Access modifiers changed, original: 0000 */
    public void amK() {
        b bVar = this.bND;
        if (bVar != null) {
            bVar.onPerform(this.view, this.bNC);
        }
    }
}
