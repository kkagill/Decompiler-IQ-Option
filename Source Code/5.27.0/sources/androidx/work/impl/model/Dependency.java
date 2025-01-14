package androidx.work.impl.model;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;

@RestrictTo({Scope.LIBRARY_GROUP})
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"}), @ForeignKey(childColumns = {"prerequisite_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@Index({"work_spec_id"}), @Index({"prerequisite_id"})}, primaryKeys = {"work_spec_id", "prerequisite_id"})
public class Dependency {
    @ColumnInfo(name = "prerequisite_id")
    @NonNull
    public final String prerequisiteId;
    @ColumnInfo(name = "work_spec_id")
    @NonNull
    public final String workSpecId;

    public Dependency(@NonNull String str, @NonNull String str2) {
        this.workSpecId = str;
        this.prerequisiteId = str2;
    }
}
