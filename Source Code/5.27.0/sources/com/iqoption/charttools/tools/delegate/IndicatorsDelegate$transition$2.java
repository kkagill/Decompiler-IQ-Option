package com.iqoption.charttools.tools.delegate;

import androidx.core.view.GravityCompat;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.Slide;
import androidx.transition.TransitionSet;
import com.iqoption.core.graphics.animation.j;
import com.iqoption.x.R;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Landroidx/transition/TransitionSet;", "invoke"})
/* compiled from: IndicatorsDelegate.kt */
final class IndicatorsDelegate$transition$2 extends Lambda implements a<TransitionSet> {
    public static final IndicatorsDelegate$transition$2 aNz = new IndicatorsDelegate$transition$2();

    IndicatorsDelegate$transition$2() {
        super(0);
    }

    /* renamed from: PZ */
    public final TransitionSet invoke() {
        TransitionSet transitionSet = new TransitionSet();
        Slide slide = new Slide(GravityCompat.END);
        slide.addTarget((int) R.id.btnClose);
        transitionSet.addTransition(slide);
        slide = new Slide(48);
        slide.addTarget((int) R.id.tabs);
        transitionSet.addTransition(slide);
        Fade fade = new Fade(2);
        fade.addTarget((int) R.id.pager);
        transitionSet.addTransition(fade);
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.addTarget((int) R.id.searchContent);
        changeBounds.addTarget((int) R.id.searchIcon);
        changeBounds.addTarget((int) R.id.searchField);
        changeBounds.setInterpolator(j.XJ());
        transitionSet.addTransition(changeBounds);
        fade = new Fade(1);
        fade.addTarget((int) R.id.pager);
        fade.addTarget((int) R.id.searchResults);
        transitionSet.addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setDuration(400);
        return transitionSet;
    }
}
