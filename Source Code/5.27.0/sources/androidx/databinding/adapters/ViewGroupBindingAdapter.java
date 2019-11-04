package androidx.databinding.adapters;

import android.animation.LayoutTransition;
import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@BindingMethods({@BindingMethod(attribute = "android:alwaysDrawnWithCache", method = "setAlwaysDrawnWithCacheEnabled", type = ViewGroup.class), @BindingMethod(attribute = "android:animationCache", method = "setAnimationCacheEnabled", type = ViewGroup.class), @BindingMethod(attribute = "android:splitMotionEvents", method = "setMotionEventSplittingEnabled", type = ViewGroup.class)})
@RestrictTo({Scope.LIBRARY})
public class ViewGroupBindingAdapter {

    public interface OnAnimationEnd {
        void onAnimationEnd(Animation animation);
    }

    public interface OnAnimationRepeat {
        void onAnimationRepeat(Animation animation);
    }

    public interface OnAnimationStart {
        void onAnimationStart(Animation animation);
    }

    public interface OnChildViewAdded {
        void onChildViewAdded(View view, View view2);
    }

    public interface OnChildViewRemoved {
        void onChildViewRemoved(View view, View view2);
    }

    @TargetApi(11)
    @BindingAdapter({"android:animateLayoutChanges"})
    public static void setAnimateLayoutChanges(ViewGroup viewGroup, boolean z) {
        if (z) {
            viewGroup.setLayoutTransition(new LayoutTransition());
        } else {
            viewGroup.setLayoutTransition(null);
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onChildViewAdded", "android:onChildViewRemoved"})
    public static void setListener(ViewGroup viewGroup, final OnChildViewAdded onChildViewAdded, final OnChildViewRemoved onChildViewRemoved) {
        if (onChildViewAdded == null && onChildViewRemoved == null) {
            viewGroup.setOnHierarchyChangeListener(null);
        } else {
            viewGroup.setOnHierarchyChangeListener(new OnHierarchyChangeListener() {
                public void onChildViewAdded(View view, View view2) {
                    OnChildViewAdded onChildViewAdded = onChildViewAdded;
                    if (onChildViewAdded != null) {
                        onChildViewAdded.onChildViewAdded(view, view2);
                    }
                }

                public void onChildViewRemoved(View view, View view2) {
                    OnChildViewRemoved onChildViewRemoved = onChildViewRemoved;
                    if (onChildViewRemoved != null) {
                        onChildViewRemoved.onChildViewRemoved(view, view2);
                    }
                }
            });
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onAnimationStart", "android:onAnimationEnd", "android:onAnimationRepeat"})
    public static void setListener(ViewGroup viewGroup, final OnAnimationStart onAnimationStart, final OnAnimationEnd onAnimationEnd, final OnAnimationRepeat onAnimationRepeat) {
        if (onAnimationStart == null && onAnimationEnd == null && onAnimationRepeat == null) {
            viewGroup.setLayoutAnimationListener(null);
        } else {
            viewGroup.setLayoutAnimationListener(new AnimationListener() {
                public void onAnimationStart(Animation animation) {
                    OnAnimationStart onAnimationStart = onAnimationStart;
                    if (onAnimationStart != null) {
                        onAnimationStart.onAnimationStart(animation);
                    }
                }

                public void onAnimationEnd(Animation animation) {
                    OnAnimationEnd onAnimationEnd = onAnimationEnd;
                    if (onAnimationEnd != null) {
                        onAnimationEnd.onAnimationEnd(animation);
                    }
                }

                public void onAnimationRepeat(Animation animation) {
                    OnAnimationRepeat onAnimationRepeat = onAnimationRepeat;
                    if (onAnimationRepeat != null) {
                        onAnimationRepeat.onAnimationRepeat(animation);
                    }
                }
            });
        }
    }
}
