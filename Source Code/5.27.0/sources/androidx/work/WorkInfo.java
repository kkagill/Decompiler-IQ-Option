package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public final class WorkInfo {
    @NonNull
    private UUID mId;
    @NonNull
    private Data mOutputData;
    @NonNull
    private State mState;
    @NonNull
    private Set<String> mTags;

    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public WorkInfo(@NonNull UUID uuid, @NonNull State state, @NonNull Data data, @NonNull List<String> list) {
        this.mId = uuid;
        this.mState = state;
        this.mOutputData = data;
        this.mTags = new HashSet(list);
    }

    @NonNull
    public UUID getId() {
        return this.mId;
    }

    @NonNull
    public State getState() {
        return this.mState;
    }

    @NonNull
    public Data getOutputData() {
        return this.mOutputData;
    }

    @NonNull
    public Set<String> getTags() {
        return this.mTags;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        UUID uuid = this.mId;
        if (!uuid == null ? uuid.equals(workInfo.mId) : workInfo.mId == null) {
            return false;
        }
        if (this.mState != workInfo.mState) {
            return false;
        }
        Data data = this.mOutputData;
        if (!data == null ? data.equals(workInfo.mOutputData) : workInfo.mOutputData == null) {
            return false;
        }
        Set set = this.mTags;
        if (set != null) {
            z = set.equals(workInfo.mTags);
        } else if (workInfo.mTags != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        UUID uuid = this.mId;
        int i = 0;
        int hashCode = (uuid != null ? uuid.hashCode() : 0) * 31;
        State state = this.mState;
        hashCode = (hashCode + (state != null ? state.hashCode() : 0)) * 31;
        Data data = this.mOutputData;
        hashCode = (hashCode + (data != null ? data.hashCode() : 0)) * 31;
        Set set = this.mTags;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WorkInfo{mId='");
        stringBuilder.append(this.mId);
        stringBuilder.append('\'');
        stringBuilder.append(", mState=");
        stringBuilder.append(this.mState);
        stringBuilder.append(", mOutputData=");
        stringBuilder.append(this.mOutputData);
        stringBuilder.append(", mTags=");
        stringBuilder.append(this.mTags);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
