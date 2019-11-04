package com.iqoption.charttools.tools;

import android.animation.TimeInterpolator;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.TransitionSet;
import com.iqoption.core.graphics.animation.j;
import com.iqoption.x.R;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Landroidx/transition/TransitionSet;", "invoke"})
/* compiled from: ToolsFragment.kt */
final class ToolsFragment$changeTransition$2 extends Lambda implements a<TransitionSet> {
    public static final ToolsFragment$changeTransition$2 aLM = new ToolsFragment$changeTransition$2();

    ToolsFragment$changeTransition$2() {
        super(0);
    }

    /* renamed from: PZ */
    public final TransitionSet invoke() {
        TransitionSet transitionSet = new TransitionSet();
        Fade fade = new Fade(2);
        fade.addTarget((int) R.id.toolsContent);
        transitionSet.addTransition(fade);
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.addTarget((int) R.id.card);
        changeBounds.addTarget((int) R.id.toolsContent);
        transitionSet.addTransition(changeBounds);
        fade = new Fade(1);
        fade.addTarget((int) R.id.toolsContent);
        transitionSet.addTransition(fade);
        transitionSet.setDuration(250);
        transitionSet.setInterpolator((TimeInterpolator) j.XJ());
        return transitionSet;
    }
}
