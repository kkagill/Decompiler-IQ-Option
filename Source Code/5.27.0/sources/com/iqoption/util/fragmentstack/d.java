package com.iqoption.util.fragmentstack;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/util/fragmentstack/VisibilityAwareFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/iqoption/util/fragmentstack/FragmentVisibilityChangeListener;", "Lcom/iqoption/util/fragmentstack/FragmentVisibilityChangeHolder;", "()V", "listeners", "", "addFragmentVisibilityChangeListener", "", "listener", "onInvisible", "onVisible", "app_optionXRelease"})
/* compiled from: VisibilityAwareFragment.kt */
public class d extends Fragment implements c {
    private HashMap apm;
    private final List<c> gb = new ArrayList();

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public void aXa() {
        for (c aXa : this.gb) {
            aXa.aXa();
        }
    }

    public void aXb() {
        for (c aXb : this.gb) {
            aXb.aXb();
        }
    }
}
