package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;

public final class WorkNameDao_Impl implements WorkNameDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter __insertionAdapterOfWorkName;

    public WorkNameDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfWorkName = new EntityInsertionAdapter<WorkName>(roomDatabase) {
            public String createQuery() {
                return "INSERT OR IGNORE INTO `WorkName`(`name`,`work_spec_id`) VALUES (?,?)";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, WorkName workName) {
                if (workName.name == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, workName.name);
                }
                if (workName.workSpecId == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, workName.workSpecId);
                }
            }
        };
    }

    public void insert(WorkName workName) {
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfWorkName.insert((Object) workName);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public List<String> getWorkSpecIdsWithName(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT work_spec_id FROM workname WHERE name=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        Cursor query = this.__db.query(acquire);
        try {
            List<String> arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(query.getString(0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }
}
