package com.iqoption.core.ui.a;

import android.os.Build.VERSION;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentManager;
import com.iqoption.core.ui.fragment.d;
import com.iqoption.core.util.v;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0014J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/core/ui/activity/IQActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "keyboardUtil", "Lcom/iqoption/core/util/KeyboardUtil;", "isKeyboardVisible", "", "onBackConsumed", "", "f", "Lcom/iqoption/core/ui/fragment/IQFragment;", "onBackPressed", "onCloseByBack", "onPause", "onResume", "core_release"})
/* compiled from: IQActivity.kt */
public abstract class a extends AppCompatActivity {
    private v bHc;

    /* Access modifiers changed, original: protected */
    public void a(d dVar) {
        kotlin.jvm.internal.i.f(dVar, "f");
    }

    /* Access modifiers changed, original: protected */
    public void zL() {
    }

    public void onResume() {
        super.onResume();
        this.bHc = new v(this);
    }

    public void onPause() {
        super.onPause();
        this.bHc = (v) null;
    }

    public final boolean akX() {
        v vVar = this.bHc;
        return vVar != null && vVar.anu();
    }

    public void onBackPressed() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        kotlin.jvm.internal.i.e(supportFragmentManager, "fragmentManager");
        if (!supportFragmentManager.isStateSaved() || VERSION.SDK_INT > 25) {
            List fragments = supportFragmentManager.getFragments();
            kotlin.jvm.internal.i.e(fragments, "fragmentManager.fragments");
            int size = fragments.size();
            int i = 0;
            while (i < size) {
                Object obj = fragments.get((fragments.size() - 1) - i);
                if (!(obj instanceof d)) {
                    obj = null;
                }
                d dVar = (d) obj;
                if (dVar == null || !dVar.aly()) {
                    i++;
                } else {
                    a(dVar);
                    return;
                }
            }
            zL();
            ActivityCompat.finishAfterTransition(this);
        }
    }
}
