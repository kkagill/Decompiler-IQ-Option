package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import java.util.List;

public abstract class InputMerger {
    private static final String TAG = Logger.tagWithPrefix("InputMerger");

    @NonNull
    public abstract Data merge(@NonNull List<Data> list);

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static InputMerger fromClassName(String str) {
        try {
            return (InputMerger) Class.forName(str).newInstance();
        } catch (Exception e) {
            Logger logger = Logger.get();
            String str2 = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trouble instantiating + ");
            stringBuilder.append(str);
            logger.error(str2, stringBuilder.toString(), e);
            return null;
        }
    }
}
