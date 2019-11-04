package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TransitionValues {
    final ArrayList<Transition> mTargetedTransitions = new ArrayList();
    public final Map<String, Object> values = new HashMap();
    public View view;

    public boolean equals(Object obj) {
        if (obj instanceof TransitionValues) {
            TransitionValues transitionValues = (TransitionValues) obj;
            if (this.view == transitionValues.view && this.values.equals(transitionValues.values)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.view.hashCode() * 31) + this.values.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TransitionValues@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        stringBuilder.append(":\n");
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("    view = ");
        stringBuilder3.append(this.view);
        stringBuilder2 = "\n";
        stringBuilder3.append(stringBuilder2);
        String stringBuilder4 = stringBuilder3.toString();
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append(stringBuilder4);
        stringBuilder5.append("    values:");
        stringBuilder4 = stringBuilder5.toString();
        for (String str : this.values.keySet()) {
            StringBuilder stringBuilder6 = new StringBuilder();
            stringBuilder6.append(stringBuilder4);
            stringBuilder6.append("    ");
            stringBuilder6.append(str);
            stringBuilder6.append(": ");
            stringBuilder6.append(this.values.get(str));
            stringBuilder6.append(stringBuilder2);
            stringBuilder4 = stringBuilder6.toString();
        }
        return stringBuilder4;
    }
}
