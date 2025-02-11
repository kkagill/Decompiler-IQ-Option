package androidx.work.impl.model;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;

@RestrictTo({Scope.LIBRARY_GROUP})
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@Index({"work_spec_id"})}, primaryKeys = {"name", "work_spec_id"})
public class WorkName {
    @ColumnInfo(name = "name")
    @NonNull
    public final String name;
    @ColumnInfo(name = "work_spec_id")
    @NonNull
    public final String workSpecId;

    public WorkName(@NonNull String str, @NonNull String str2) {
        this.name = str;
        this.workSpecId = str2;
    }
}
