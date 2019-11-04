package androidx.work;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import java.util.HashSet;
import java.util.Set;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class ContentUriTriggers {
    private final Set<Trigger> mTriggers = new HashSet();

    public static final class Trigger {
        private final boolean mTriggerForDescendants;
        @NonNull
        private final Uri mUri;

        Trigger(@NonNull Uri uri, boolean z) {
            this.mUri = uri;
            this.mTriggerForDescendants = z;
        }

        @NonNull
        public Uri getUri() {
            return this.mUri;
        }

        public boolean shouldTriggerForDescendants() {
            return this.mTriggerForDescendants;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Trigger trigger = (Trigger) obj;
            if (!(this.mTriggerForDescendants == trigger.mTriggerForDescendants && this.mUri.equals(trigger.mUri))) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (this.mUri.hashCode() * 31) + this.mTriggerForDescendants;
        }
    }

    public void add(@NonNull Uri uri, boolean z) {
        this.mTriggers.add(new Trigger(uri, z));
    }

    @NonNull
    public Set<Trigger> getTriggers() {
        return this.mTriggers;
    }

    public int size() {
        return this.mTriggers.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.mTriggers.equals(((ContentUriTriggers) obj).mTriggers);
    }

    public int hashCode() {
        return this.mTriggers.hashCode();
    }
}
