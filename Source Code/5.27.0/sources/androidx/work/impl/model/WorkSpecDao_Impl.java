package androidx.work.impl.model;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.lifecycle.ComputableLiveData;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.InvalidationTracker.Observer;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.WorkInfo.State;
import androidx.work.impl.model.WorkSpec.IdAndState;
import androidx.work.impl.model.WorkSpec.WorkInfoPojo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class WorkSpecDao_Impl implements WorkSpecDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter __insertionAdapterOfWorkSpec;
    private final SharedSQLiteStatement __preparedStmtOfDelete;
    private final SharedSQLiteStatement __preparedStmtOfIncrementWorkSpecRunAttemptCount;
    private final SharedSQLiteStatement __preparedStmtOfMarkWorkSpecScheduled;
    private final SharedSQLiteStatement __preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast;
    private final SharedSQLiteStatement __preparedStmtOfResetScheduledState;
    private final SharedSQLiteStatement __preparedStmtOfResetWorkSpecRunAttemptCount;
    private final SharedSQLiteStatement __preparedStmtOfSetOutput;
    private final SharedSQLiteStatement __preparedStmtOfSetPeriodStartTime;

    public WorkSpecDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfWorkSpec = new EntityInsertionAdapter<WorkSpec>(roomDatabase) {
            public String createQuery() {
                return "INSERT OR IGNORE INTO `WorkSpec`(`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, WorkSpec workSpec) {
                if (workSpec.id == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, workSpec.id);
                }
                supportSQLiteStatement.bindLong(2, (long) WorkTypeConverters.stateToInt(workSpec.state));
                if (workSpec.workerClassName == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, workSpec.workerClassName);
                }
                if (workSpec.inputMergerClassName == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, workSpec.inputMergerClassName);
                }
                byte[] toByteArray = Data.toByteArray(workSpec.input);
                if (toByteArray == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindBlob(5, toByteArray);
                }
                toByteArray = Data.toByteArray(workSpec.output);
                if (toByteArray == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindBlob(6, toByteArray);
                }
                supportSQLiteStatement.bindLong(7, workSpec.initialDelay);
                supportSQLiteStatement.bindLong(8, workSpec.intervalDuration);
                supportSQLiteStatement.bindLong(9, workSpec.flexDuration);
                supportSQLiteStatement.bindLong(10, (long) workSpec.runAttemptCount);
                supportSQLiteStatement.bindLong(11, (long) WorkTypeConverters.backoffPolicyToInt(workSpec.backoffPolicy));
                supportSQLiteStatement.bindLong(12, workSpec.backoffDelayDuration);
                supportSQLiteStatement.bindLong(13, workSpec.periodStartTime);
                supportSQLiteStatement.bindLong(14, workSpec.minimumRetentionDuration);
                supportSQLiteStatement.bindLong(15, workSpec.scheduleRequestedAt);
                Constraints constraints = workSpec.constraints;
                if (constraints != null) {
                    supportSQLiteStatement.bindLong(16, (long) WorkTypeConverters.networkTypeToInt(constraints.getRequiredNetworkType()));
                    supportSQLiteStatement.bindLong(17, (long) constraints.requiresCharging());
                    supportSQLiteStatement.bindLong(18, (long) constraints.requiresDeviceIdle());
                    supportSQLiteStatement.bindLong(19, (long) constraints.requiresBatteryNotLow());
                    supportSQLiteStatement.bindLong(20, (long) constraints.requiresStorageNotLow());
                    supportSQLiteStatement.bindLong(21, constraints.getTriggerContentUpdateDelay());
                    supportSQLiteStatement.bindLong(22, constraints.getTriggerMaxContentDelay());
                    byte[] contentUriTriggersToByteArray = WorkTypeConverters.contentUriTriggersToByteArray(constraints.getContentUriTriggers());
                    if (contentUriTriggersToByteArray == null) {
                        supportSQLiteStatement.bindNull(23);
                        return;
                    } else {
                        supportSQLiteStatement.bindBlob(23, contentUriTriggersToByteArray);
                        return;
                    }
                }
                supportSQLiteStatement.bindNull(16);
                supportSQLiteStatement.bindNull(17);
                supportSQLiteStatement.bindNull(18);
                supportSQLiteStatement.bindNull(19);
                supportSQLiteStatement.bindNull(20);
                supportSQLiteStatement.bindNull(21);
                supportSQLiteStatement.bindNull(22);
                supportSQLiteStatement.bindNull(23);
            }
        };
        this.__preparedStmtOfDelete = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.__preparedStmtOfSetOutput = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.__preparedStmtOfSetPeriodStartTime = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET period_start_time=? WHERE id=?";
            }
        };
        this.__preparedStmtOfIncrementWorkSpecRunAttemptCount = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.__preparedStmtOfResetWorkSpecRunAttemptCount = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.__preparedStmtOfMarkWorkSpecScheduled = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.__preparedStmtOfResetScheduledState = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        this.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        };
    }

    public void insertWorkSpec(WorkSpec workSpec) {
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfWorkSpec.insert((Object) workSpec);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void delete(String str) {
        SupportSQLiteStatement acquire = this.__preparedStmtOfDelete.acquire();
        this.__db.beginTransaction();
        if (str == null) {
            try {
                acquire.bindNull(1);
            } catch (Throwable th) {
                this.__db.endTransaction();
                this.__preparedStmtOfDelete.release(acquire);
            }
        } else {
            acquire.bindString(1, str);
        }
        acquire.executeUpdateDelete();
        this.__db.setTransactionSuccessful();
        this.__db.endTransaction();
        this.__preparedStmtOfDelete.release(acquire);
    }

    public void setOutput(String str, Data data) {
        SupportSQLiteStatement acquire = this.__preparedStmtOfSetOutput.acquire();
        this.__db.beginTransaction();
        try {
            byte[] toByteArray = Data.toByteArray(data);
            if (toByteArray == null) {
                acquire.bindNull(1);
            } else {
                acquire.bindBlob(1, toByteArray);
            }
            if (str == null) {
                acquire.bindNull(2);
            } else {
                acquire.bindString(2, str);
            }
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfSetOutput.release(acquire);
        }
    }

    public void setPeriodStartTime(String str, long j) {
        SupportSQLiteStatement acquire = this.__preparedStmtOfSetPeriodStartTime.acquire();
        this.__db.beginTransaction();
        try {
            acquire.bindLong(1, j);
            if (str == null) {
                acquire.bindNull(2);
            } else {
                acquire.bindString(2, str);
            }
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfSetPeriodStartTime.release(acquire);
        }
    }

    public int incrementWorkSpecRunAttemptCount(String str) {
        SupportSQLiteStatement acquire = this.__preparedStmtOfIncrementWorkSpecRunAttemptCount.acquire();
        this.__db.beginTransaction();
        if (str == null) {
            try {
                acquire.bindNull(1);
            } catch (Throwable th) {
                this.__db.endTransaction();
                this.__preparedStmtOfIncrementWorkSpecRunAttemptCount.release(acquire);
            }
        } else {
            acquire.bindString(1, str);
        }
        int executeUpdateDelete = acquire.executeUpdateDelete();
        this.__db.setTransactionSuccessful();
        this.__db.endTransaction();
        this.__preparedStmtOfIncrementWorkSpecRunAttemptCount.release(acquire);
        return executeUpdateDelete;
    }

    public int resetWorkSpecRunAttemptCount(String str) {
        SupportSQLiteStatement acquire = this.__preparedStmtOfResetWorkSpecRunAttemptCount.acquire();
        this.__db.beginTransaction();
        if (str == null) {
            try {
                acquire.bindNull(1);
            } catch (Throwable th) {
                this.__db.endTransaction();
                this.__preparedStmtOfResetWorkSpecRunAttemptCount.release(acquire);
            }
        } else {
            acquire.bindString(1, str);
        }
        int executeUpdateDelete = acquire.executeUpdateDelete();
        this.__db.setTransactionSuccessful();
        this.__db.endTransaction();
        this.__preparedStmtOfResetWorkSpecRunAttemptCount.release(acquire);
        return executeUpdateDelete;
    }

    public int markWorkSpecScheduled(String str, long j) {
        SupportSQLiteStatement acquire = this.__preparedStmtOfMarkWorkSpecScheduled.acquire();
        this.__db.beginTransaction();
        try {
            acquire.bindLong(1, j);
            if (str == null) {
                acquire.bindNull(2);
            } else {
                acquire.bindString(2, str);
            }
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfMarkWorkSpecScheduled.release(acquire);
        }
    }

    public int resetScheduledState() {
        SupportSQLiteStatement acquire = this.__preparedStmtOfResetScheduledState.acquire();
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfResetScheduledState.release(acquire);
        }
    }

    public void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast() {
        SupportSQLiteStatement acquire = this.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast.acquire();
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast.release(acquire);
        }
    }

    public WorkSpec getWorkSpec(String str) {
        Throwable th;
        String str2 = str;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str2);
        }
        Cursor query = this.__db.query(acquire);
        RoomSQLiteQuery roomSQLiteQuery;
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = query.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = query.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = query.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = query.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = query.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = query.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = query.getColumnIndexOrThrow("minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                WorkSpec workSpec;
                int columnIndexOrThrow15 = query.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = query.getColumnIndexOrThrow("required_network_type");
                int i = columnIndexOrThrow14;
                columnIndexOrThrow14 = query.getColumnIndexOrThrow("requires_charging");
                int i2 = columnIndexOrThrow13;
                columnIndexOrThrow13 = query.getColumnIndexOrThrow("requires_device_idle");
                int i3 = columnIndexOrThrow12;
                columnIndexOrThrow12 = query.getColumnIndexOrThrow("requires_battery_not_low");
                int i4 = columnIndexOrThrow11;
                columnIndexOrThrow11 = query.getColumnIndexOrThrow("requires_storage_not_low");
                int i5 = columnIndexOrThrow10;
                columnIndexOrThrow10 = query.getColumnIndexOrThrow("trigger_content_update_delay");
                int i6 = columnIndexOrThrow9;
                columnIndexOrThrow9 = query.getColumnIndexOrThrow("trigger_max_content_delay");
                int i7 = columnIndexOrThrow8;
                columnIndexOrThrow8 = query.getColumnIndexOrThrow("content_uri_triggers");
                if (query.moveToFirst()) {
                    str2 = query.getString(columnIndexOrThrow);
                    String string = query.getString(columnIndexOrThrow3);
                    int i8 = columnIndexOrThrow7;
                    Constraints constraints = new Constraints();
                    constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(query.getInt(columnIndexOrThrow16)));
                    columnIndexOrThrow16 = query.getInt(columnIndexOrThrow14);
                    boolean z = false;
                    constraints.setRequiresCharging(columnIndexOrThrow16 != 0);
                    constraints.setRequiresDeviceIdle(query.getInt(columnIndexOrThrow13) != 0);
                    constraints.setRequiresBatteryNotLow(query.getInt(columnIndexOrThrow12) != 0);
                    if (query.getInt(columnIndexOrThrow11) != 0) {
                        z = true;
                    }
                    constraints.setRequiresStorageNotLow(z);
                    constraints.setTriggerContentUpdateDelay(query.getLong(columnIndexOrThrow10));
                    constraints.setTriggerMaxContentDelay(query.getLong(columnIndexOrThrow9));
                    constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(query.getBlob(columnIndexOrThrow8)));
                    workSpec = new WorkSpec(str2, string);
                    workSpec.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                    workSpec.inputMergerClassName = query.getString(columnIndexOrThrow4);
                    workSpec.input = Data.fromByteArray(query.getBlob(columnIndexOrThrow5));
                    workSpec.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow6));
                    workSpec.initialDelay = query.getLong(i8);
                    workSpec.intervalDuration = query.getLong(i7);
                    workSpec.flexDuration = query.getLong(i6);
                    workSpec.runAttemptCount = query.getInt(i5);
                    workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(i4));
                    workSpec.backoffDelayDuration = query.getLong(i3);
                    workSpec.periodStartTime = query.getLong(i2);
                    workSpec.minimumRetentionDuration = query.getLong(i);
                    workSpec.scheduleRequestedAt = query.getLong(columnIndexOrThrow15);
                    workSpec.constraints = constraints;
                } else {
                    workSpec = null;
                }
                query.close();
                roomSQLiteQuery.release();
                return workSpec;
            } catch (Throwable th2) {
                th = th2;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public WorkSpec[] getWorkSpecs(List<String> list) {
        Throwable th;
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT * FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size + 0);
        int i = 1;
        for (String str : list) {
            if (str == null) {
                acquire.bindNull(i);
            } else {
                acquire.bindString(i, str);
            }
            i++;
        }
        Cursor query = this.__db.query(acquire);
        RoomSQLiteQuery roomSQLiteQuery;
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = query.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = query.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = query.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = query.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = query.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = query.getColumnIndexOrThrow("period_start_time");
            i = query.getColumnIndexOrThrow("minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                WorkSpec[] workSpecArr;
                int columnIndexOrThrow14 = query.getColumnIndexOrThrow("schedule_requested_at");
                size = query.getColumnIndexOrThrow("required_network_type");
                int i2 = i;
                i = query.getColumnIndexOrThrow("requires_charging");
                int i3 = columnIndexOrThrow13;
                columnIndexOrThrow13 = query.getColumnIndexOrThrow("requires_device_idle");
                int i4 = columnIndexOrThrow12;
                columnIndexOrThrow12 = query.getColumnIndexOrThrow("requires_battery_not_low");
                int i5 = columnIndexOrThrow11;
                columnIndexOrThrow11 = query.getColumnIndexOrThrow("requires_storage_not_low");
                int i6 = columnIndexOrThrow10;
                columnIndexOrThrow10 = query.getColumnIndexOrThrow("trigger_content_update_delay");
                int i7 = columnIndexOrThrow9;
                columnIndexOrThrow9 = query.getColumnIndexOrThrow("trigger_max_content_delay");
                int i8 = columnIndexOrThrow8;
                columnIndexOrThrow8 = query.getColumnIndexOrThrow("content_uri_triggers");
                int i9 = columnIndexOrThrow7;
                WorkSpec[] workSpecArr2 = new WorkSpec[query.getCount()];
                int i10 = 0;
                while (query.moveToNext()) {
                    workSpecArr = workSpecArr2;
                    String string = query.getString(columnIndexOrThrow);
                    int i11 = columnIndexOrThrow;
                    String string2 = query.getString(columnIndexOrThrow3);
                    int i12 = columnIndexOrThrow3;
                    Constraints constraints = new Constraints();
                    int i13 = size;
                    constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(query.getInt(size)));
                    constraints.setRequiresCharging(query.getInt(i) != 0);
                    constraints.setRequiresDeviceIdle(query.getInt(columnIndexOrThrow13) != 0);
                    constraints.setRequiresBatteryNotLow(query.getInt(columnIndexOrThrow12) != 0);
                    constraints.setRequiresStorageNotLow(query.getInt(columnIndexOrThrow11) != 0);
                    int i14 = columnIndexOrThrow12;
                    constraints.setTriggerContentUpdateDelay(query.getLong(columnIndexOrThrow10));
                    constraints.setTriggerMaxContentDelay(query.getLong(columnIndexOrThrow9));
                    constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(query.getBlob(columnIndexOrThrow8)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                    workSpec.inputMergerClassName = query.getString(columnIndexOrThrow4);
                    workSpec.input = Data.fromByteArray(query.getBlob(columnIndexOrThrow5));
                    workSpec.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow6));
                    columnIndexOrThrow7 = columnIndexOrThrow13;
                    columnIndexOrThrow = i9;
                    workSpec.initialDelay = query.getLong(columnIndexOrThrow);
                    columnIndexOrThrow12 = i8;
                    i8 = i;
                    workSpec.intervalDuration = query.getLong(columnIndexOrThrow12);
                    i = columnIndexOrThrow4;
                    columnIndexOrThrow13 = i7;
                    i7 = columnIndexOrThrow5;
                    workSpec.flexDuration = query.getLong(columnIndexOrThrow13);
                    columnIndexOrThrow4 = i6;
                    workSpec.runAttemptCount = query.getInt(columnIndexOrThrow4);
                    columnIndexOrThrow5 = i5;
                    i9 = columnIndexOrThrow;
                    workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(columnIndexOrThrow5));
                    i5 = columnIndexOrThrow13;
                    columnIndexOrThrow = i4;
                    i4 = columnIndexOrThrow12;
                    workSpec.backoffDelayDuration = query.getLong(columnIndexOrThrow);
                    columnIndexOrThrow12 = i3;
                    i3 = i;
                    workSpec.periodStartTime = query.getLong(columnIndexOrThrow12);
                    i6 = columnIndexOrThrow4;
                    i = columnIndexOrThrow5;
                    columnIndexOrThrow13 = i2;
                    workSpec.minimumRetentionDuration = query.getLong(columnIndexOrThrow13);
                    columnIndexOrThrow5 = columnIndexOrThrow12;
                    i2 = columnIndexOrThrow13;
                    columnIndexOrThrow4 = columnIndexOrThrow14;
                    workSpec.scheduleRequestedAt = query.getLong(columnIndexOrThrow4);
                    workSpec.constraints = constraints;
                    workSpecArr[i10] = workSpec;
                    i10++;
                    columnIndexOrThrow14 = columnIndexOrThrow4;
                    columnIndexOrThrow13 = columnIndexOrThrow7;
                    columnIndexOrThrow4 = i3;
                    workSpecArr2 = workSpecArr;
                    columnIndexOrThrow3 = i12;
                    columnIndexOrThrow12 = i14;
                    size = i13;
                    i3 = columnIndexOrThrow5;
                    columnIndexOrThrow5 = i7;
                    i7 = i5;
                    i5 = i;
                    i = i8;
                    i8 = i4;
                    i4 = columnIndexOrThrow;
                    columnIndexOrThrow = i11;
                }
                workSpecArr = workSpecArr2;
                query.close();
                roomSQLiteQuery.release();
                return workSpecArr;
            } catch (Throwable th2) {
                th = th2;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<IdAndState> getWorkSpecIdAndStatesForName(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        Cursor query = this.__db.query(acquire);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            List<IdAndState> arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                IdAndState idAndState = new IdAndState();
                idAndState.id = query.getString(columnIndexOrThrow);
                idAndState.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                arrayList.add(idAndState);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public List<String> getAllWorkSpecIds() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec", 0);
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

    public State getState(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        Cursor query = this.__db.query(acquire);
        try {
            State intToState = query.moveToFirst() ? WorkTypeConverters.intToState(query.getInt(0)) : null;
            query.close();
            acquire.release();
            return intToState;
        } catch (Throwable th) {
            query.close();
            acquire.release();
        }
    }

    public WorkInfoPojo getWorkStatusPojoForId(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output FROM workspec WHERE id=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        Cursor query;
        try {
            WorkInfoPojo workInfoPojo;
            query = this.__db.query(acquire);
            ArrayMap arrayMap = new ArrayMap();
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("output");
            if (query.moveToFirst()) {
                workInfoPojo = new WorkInfoPojo();
                workInfoPojo.id = query.getString(columnIndexOrThrow);
                workInfoPojo.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                workInfoPojo.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow3));
                if (!query.isNull(columnIndexOrThrow)) {
                    String string = query.getString(columnIndexOrThrow);
                    List list = (ArrayList) arrayMap.get(string);
                    if (list == null) {
                        list = new ArrayList();
                        arrayMap.put(string, list);
                    }
                    workInfoPojo.tags = list;
                }
            } else {
                workInfoPojo = null;
            }
            __fetchRelationshipWorkTagAsjavaLangString(arrayMap);
            this.__db.setTransactionSuccessful();
            query.close();
            acquire.release();
            this.__db.endTransaction();
            return workInfoPojo;
        } catch (Throwable th) {
            this.__db.endTransaction();
        }
    }

    public List<WorkInfoPojo> getWorkStatusPojoForIds(List<String> list) {
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT id, state, output FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size + 0);
        size = 1;
        for (String str : list) {
            if (str == null) {
                acquire.bindNull(size);
            } else {
                acquire.bindString(size, str);
            }
            size++;
        }
        this.__db.beginTransaction();
        Cursor query;
        try {
            query = this.__db.query(acquire);
            ArrayMap arrayMap = new ArrayMap();
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("output");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                WorkInfoPojo workInfoPojo = new WorkInfoPojo();
                workInfoPojo.id = query.getString(columnIndexOrThrow);
                workInfoPojo.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                workInfoPojo.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow3));
                if (!query.isNull(columnIndexOrThrow)) {
                    String string = query.getString(columnIndexOrThrow);
                    List list2 = (ArrayList) arrayMap.get(string);
                    if (list2 == null) {
                        list2 = new ArrayList();
                        arrayMap.put(string, list2);
                    }
                    workInfoPojo.tags = list2;
                }
                arrayList.add(workInfoPojo);
            }
            __fetchRelationshipWorkTagAsjavaLangString(arrayMap);
            this.__db.setTransactionSuccessful();
            query.close();
            acquire.release();
            this.__db.endTransaction();
            return arrayList;
        } catch (Throwable th) {
            this.__db.endTransaction();
        }
    }

    public LiveData<List<WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(List<String> list) {
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT id, state, output FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size + 0);
        size = 1;
        for (String str : list) {
            if (str == null) {
                acquire.bindNull(size);
            } else {
                acquire.bindString(size, str);
            }
            size++;
        }
        return new ComputableLiveData<List<WorkInfoPojo>>(this.__db.getQueryExecutor()) {
            private Observer _observer;

            /* Access modifiers changed, original: protected */
            public List<WorkInfoPojo> compute() {
                if (this._observer == null) {
                    this._observer = new Observer("WorkTag", "workspec") {
                        public void onInvalidated(@NonNull Set<String> set) {
                            AnonymousClass10.this.invalidate();
                        }
                    };
                    WorkSpecDao_Impl.this.__db.getInvalidationTracker().addWeakObserver(this._observer);
                }
                WorkSpecDao_Impl.this.__db.beginTransaction();
                Cursor query;
                try {
                    query = WorkSpecDao_Impl.this.__db.query(acquire);
                    ArrayMap arrayMap = new ArrayMap();
                    int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
                    int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
                    int columnIndexOrThrow3 = query.getColumnIndexOrThrow("output");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        WorkInfoPojo workInfoPojo = new WorkInfoPojo();
                        workInfoPojo.id = query.getString(columnIndexOrThrow);
                        workInfoPojo.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                        workInfoPojo.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow3));
                        if (!query.isNull(columnIndexOrThrow)) {
                            String string = query.getString(columnIndexOrThrow);
                            List list = (ArrayList) arrayMap.get(string);
                            if (list == null) {
                                list = new ArrayList();
                                arrayMap.put(string, list);
                            }
                            workInfoPojo.tags = list;
                        }
                        arrayList.add(workInfoPojo);
                    }
                    WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                    WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                    query.close();
                    WorkSpecDao_Impl.this.__db.endTransaction();
                    return arrayList;
                } catch (Throwable th) {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }

            /* Access modifiers changed, original: protected */
            public void finalize() {
                acquire.release();
            }
        }.getLiveData();
    }

    public List<WorkInfoPojo> getWorkStatusPojoForTag(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        Cursor query;
        try {
            query = this.__db.query(acquire);
            ArrayMap arrayMap = new ArrayMap();
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("output");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                WorkInfoPojo workInfoPojo = new WorkInfoPojo();
                workInfoPojo.id = query.getString(columnIndexOrThrow);
                workInfoPojo.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                workInfoPojo.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow3));
                if (!query.isNull(columnIndexOrThrow)) {
                    String string = query.getString(columnIndexOrThrow);
                    List list = (ArrayList) arrayMap.get(string);
                    if (list == null) {
                        list = new ArrayList();
                        arrayMap.put(string, list);
                    }
                    workInfoPojo.tags = list;
                }
                arrayList.add(workInfoPojo);
            }
            __fetchRelationshipWorkTagAsjavaLangString(arrayMap);
            this.__db.setTransactionSuccessful();
            query.close();
            acquire.release();
            this.__db.endTransaction();
            return arrayList;
        } catch (Throwable th) {
            this.__db.endTransaction();
        }
    }

    public LiveData<List<WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(String str) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        return new ComputableLiveData<List<WorkInfoPojo>>(this.__db.getQueryExecutor()) {
            private Observer _observer;

            /* Access modifiers changed, original: protected */
            public List<WorkInfoPojo> compute() {
                if (this._observer == null) {
                    this._observer = new Observer("WorkTag", "workspec", "worktag") {
                        public void onInvalidated(@NonNull Set<String> set) {
                            AnonymousClass11.this.invalidate();
                        }
                    };
                    WorkSpecDao_Impl.this.__db.getInvalidationTracker().addWeakObserver(this._observer);
                }
                WorkSpecDao_Impl.this.__db.beginTransaction();
                Cursor query;
                try {
                    query = WorkSpecDao_Impl.this.__db.query(acquire);
                    ArrayMap arrayMap = new ArrayMap();
                    int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
                    int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
                    int columnIndexOrThrow3 = query.getColumnIndexOrThrow("output");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        WorkInfoPojo workInfoPojo = new WorkInfoPojo();
                        workInfoPojo.id = query.getString(columnIndexOrThrow);
                        workInfoPojo.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                        workInfoPojo.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow3));
                        if (!query.isNull(columnIndexOrThrow)) {
                            String string = query.getString(columnIndexOrThrow);
                            List list = (ArrayList) arrayMap.get(string);
                            if (list == null) {
                                list = new ArrayList();
                                arrayMap.put(string, list);
                            }
                            workInfoPojo.tags = list;
                        }
                        arrayList.add(workInfoPojo);
                    }
                    WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                    WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                    query.close();
                    WorkSpecDao_Impl.this.__db.endTransaction();
                    return arrayList;
                } catch (Throwable th) {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }

            /* Access modifiers changed, original: protected */
            public void finalize() {
                acquire.release();
            }
        }.getLiveData();
    }

    public List<WorkInfoPojo> getWorkStatusPojoForName(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        Cursor query;
        try {
            query = this.__db.query(acquire);
            ArrayMap arrayMap = new ArrayMap();
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("output");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                WorkInfoPojo workInfoPojo = new WorkInfoPojo();
                workInfoPojo.id = query.getString(columnIndexOrThrow);
                workInfoPojo.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                workInfoPojo.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow3));
                if (!query.isNull(columnIndexOrThrow)) {
                    String string = query.getString(columnIndexOrThrow);
                    List list = (ArrayList) arrayMap.get(string);
                    if (list == null) {
                        list = new ArrayList();
                        arrayMap.put(string, list);
                    }
                    workInfoPojo.tags = list;
                }
                arrayList.add(workInfoPojo);
            }
            __fetchRelationshipWorkTagAsjavaLangString(arrayMap);
            this.__db.setTransactionSuccessful();
            query.close();
            acquire.release();
            this.__db.endTransaction();
            return arrayList;
        } catch (Throwable th) {
            this.__db.endTransaction();
        }
    }

    public LiveData<List<WorkInfoPojo>> getWorkStatusPojoLiveDataForName(String str) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        return new ComputableLiveData<List<WorkInfoPojo>>(this.__db.getQueryExecutor()) {
            private Observer _observer;

            /* Access modifiers changed, original: protected */
            public List<WorkInfoPojo> compute() {
                if (this._observer == null) {
                    this._observer = new Observer("WorkTag", "workspec", "workname") {
                        public void onInvalidated(@NonNull Set<String> set) {
                            AnonymousClass12.this.invalidate();
                        }
                    };
                    WorkSpecDao_Impl.this.__db.getInvalidationTracker().addWeakObserver(this._observer);
                }
                WorkSpecDao_Impl.this.__db.beginTransaction();
                Cursor query;
                try {
                    query = WorkSpecDao_Impl.this.__db.query(acquire);
                    ArrayMap arrayMap = new ArrayMap();
                    int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
                    int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
                    int columnIndexOrThrow3 = query.getColumnIndexOrThrow("output");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        WorkInfoPojo workInfoPojo = new WorkInfoPojo();
                        workInfoPojo.id = query.getString(columnIndexOrThrow);
                        workInfoPojo.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                        workInfoPojo.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow3));
                        if (!query.isNull(columnIndexOrThrow)) {
                            String string = query.getString(columnIndexOrThrow);
                            List list = (ArrayList) arrayMap.get(string);
                            if (list == null) {
                                list = new ArrayList();
                                arrayMap.put(string, list);
                            }
                            workInfoPojo.tags = list;
                        }
                        arrayList.add(workInfoPojo);
                    }
                    WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                    WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                    query.close();
                    WorkSpecDao_Impl.this.__db.endTransaction();
                    return arrayList;
                } catch (Throwable th) {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }

            /* Access modifiers changed, original: protected */
            public void finalize() {
                acquire.release();
            }
        }.getLiveData();
    }

    public List<Data> getInputsFromPrerequisites(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        Cursor query = this.__db.query(acquire);
        try {
            List<Data> arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(Data.fromByteArray(query.getBlob(0)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public List<String> getUnfinishedWorkWithTag(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
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

    public List<String> getUnfinishedWorkWithName(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
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

    public List<String> getAllUnfinishedWork() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
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

    public List<WorkSpec> getEligibleWorkForScheduling(int i) {
        Throwable th;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        acquire.bindLong(1, (long) i);
        Cursor query = this.__db.query(acquire);
        RoomSQLiteQuery roomSQLiteQuery;
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = query.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = query.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = query.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = query.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = query.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = query.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = query.getColumnIndexOrThrow("minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                i = query.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow15 = query.getColumnIndexOrThrow("required_network_type");
                int i2 = columnIndexOrThrow14;
                columnIndexOrThrow14 = query.getColumnIndexOrThrow("requires_charging");
                int i3 = columnIndexOrThrow13;
                columnIndexOrThrow13 = query.getColumnIndexOrThrow("requires_device_idle");
                int i4 = columnIndexOrThrow12;
                columnIndexOrThrow12 = query.getColumnIndexOrThrow("requires_battery_not_low");
                int i5 = columnIndexOrThrow11;
                columnIndexOrThrow11 = query.getColumnIndexOrThrow("requires_storage_not_low");
                int i6 = columnIndexOrThrow10;
                columnIndexOrThrow10 = query.getColumnIndexOrThrow("trigger_content_update_delay");
                int i7 = columnIndexOrThrow9;
                columnIndexOrThrow9 = query.getColumnIndexOrThrow("trigger_max_content_delay");
                int i8 = columnIndexOrThrow8;
                columnIndexOrThrow8 = query.getColumnIndexOrThrow("content_uri_triggers");
                int i9 = columnIndexOrThrow7;
                int i10 = columnIndexOrThrow6;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(columnIndexOrThrow);
                    int i11 = columnIndexOrThrow;
                    String string2 = query.getString(columnIndexOrThrow3);
                    int i12 = columnIndexOrThrow3;
                    Constraints constraints = new Constraints();
                    int i13 = columnIndexOrThrow15;
                    constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(query.getInt(columnIndexOrThrow15)));
                    constraints.setRequiresCharging(query.getInt(columnIndexOrThrow14) != 0);
                    constraints.setRequiresDeviceIdle(query.getInt(columnIndexOrThrow13) != 0);
                    constraints.setRequiresBatteryNotLow(query.getInt(columnIndexOrThrow12) != 0);
                    constraints.setRequiresStorageNotLow(query.getInt(columnIndexOrThrow11) != 0);
                    int i14 = columnIndexOrThrow13;
                    constraints.setTriggerContentUpdateDelay(query.getLong(columnIndexOrThrow10));
                    constraints.setTriggerMaxContentDelay(query.getLong(columnIndexOrThrow9));
                    constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(query.getBlob(columnIndexOrThrow8)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                    workSpec.inputMergerClassName = query.getString(columnIndexOrThrow4);
                    workSpec.input = Data.fromByteArray(query.getBlob(columnIndexOrThrow5));
                    columnIndexOrThrow15 = i10;
                    workSpec.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow15));
                    i10 = columnIndexOrThrow15;
                    columnIndexOrThrow6 = columnIndexOrThrow14;
                    columnIndexOrThrow = i9;
                    workSpec.initialDelay = query.getLong(columnIndexOrThrow);
                    i9 = columnIndexOrThrow;
                    columnIndexOrThrow14 = columnIndexOrThrow2;
                    columnIndexOrThrow15 = i8;
                    workSpec.intervalDuration = query.getLong(columnIndexOrThrow15);
                    i8 = columnIndexOrThrow15;
                    columnIndexOrThrow2 = columnIndexOrThrow14;
                    columnIndexOrThrow = i7;
                    workSpec.flexDuration = query.getLong(columnIndexOrThrow);
                    columnIndexOrThrow15 = i6;
                    workSpec.runAttemptCount = query.getInt(columnIndexOrThrow15);
                    columnIndexOrThrow14 = i5;
                    i6 = columnIndexOrThrow15;
                    workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(columnIndexOrThrow14));
                    i7 = columnIndexOrThrow;
                    columnIndexOrThrow15 = i4;
                    i4 = columnIndexOrThrow2;
                    workSpec.backoffDelayDuration = query.getLong(columnIndexOrThrow15);
                    columnIndexOrThrow2 = columnIndexOrThrow15;
                    i5 = columnIndexOrThrow14;
                    columnIndexOrThrow = i3;
                    workSpec.periodStartTime = query.getLong(columnIndexOrThrow);
                    i3 = columnIndexOrThrow;
                    columnIndexOrThrow14 = columnIndexOrThrow2;
                    columnIndexOrThrow15 = i2;
                    workSpec.minimumRetentionDuration = query.getLong(columnIndexOrThrow15);
                    columnIndexOrThrow = i;
                    i2 = columnIndexOrThrow15;
                    columnIndexOrThrow2 = columnIndexOrThrow14;
                    workSpec.scheduleRequestedAt = query.getLong(columnIndexOrThrow);
                    workSpec.constraints = constraints;
                    arrayList.add(workSpec);
                    i = columnIndexOrThrow;
                    columnIndexOrThrow14 = columnIndexOrThrow6;
                    columnIndexOrThrow = i11;
                    columnIndexOrThrow3 = i12;
                    columnIndexOrThrow13 = i14;
                    columnIndexOrThrow15 = i13;
                    int i15 = i4;
                    i4 = columnIndexOrThrow2;
                    columnIndexOrThrow2 = i15;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<WorkSpec> getScheduledWork() {
        Throwable th;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        Cursor query = this.__db.query(acquire);
        RoomSQLiteQuery roomSQLiteQuery;
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = query.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = query.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = query.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = query.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = query.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = query.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = query.getColumnIndexOrThrow("minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = query.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = query.getColumnIndexOrThrow("required_network_type");
                int i = columnIndexOrThrow14;
                columnIndexOrThrow14 = query.getColumnIndexOrThrow("requires_charging");
                int i2 = columnIndexOrThrow13;
                columnIndexOrThrow13 = query.getColumnIndexOrThrow("requires_device_idle");
                int i3 = columnIndexOrThrow12;
                columnIndexOrThrow12 = query.getColumnIndexOrThrow("requires_battery_not_low");
                int i4 = columnIndexOrThrow11;
                columnIndexOrThrow11 = query.getColumnIndexOrThrow("requires_storage_not_low");
                int i5 = columnIndexOrThrow10;
                columnIndexOrThrow10 = query.getColumnIndexOrThrow("trigger_content_update_delay");
                int i6 = columnIndexOrThrow9;
                columnIndexOrThrow9 = query.getColumnIndexOrThrow("trigger_max_content_delay");
                int i7 = columnIndexOrThrow8;
                columnIndexOrThrow8 = query.getColumnIndexOrThrow("content_uri_triggers");
                int i8 = columnIndexOrThrow7;
                int i9 = columnIndexOrThrow6;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(columnIndexOrThrow);
                    int i10 = columnIndexOrThrow;
                    String string2 = query.getString(columnIndexOrThrow3);
                    int i11 = columnIndexOrThrow3;
                    Constraints constraints = new Constraints();
                    int i12 = columnIndexOrThrow16;
                    constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(query.getInt(columnIndexOrThrow16)));
                    constraints.setRequiresCharging(query.getInt(columnIndexOrThrow14) != 0);
                    constraints.setRequiresDeviceIdle(query.getInt(columnIndexOrThrow13) != 0);
                    constraints.setRequiresBatteryNotLow(query.getInt(columnIndexOrThrow12) != 0);
                    constraints.setRequiresStorageNotLow(query.getInt(columnIndexOrThrow11) != 0);
                    int i13 = columnIndexOrThrow13;
                    constraints.setTriggerContentUpdateDelay(query.getLong(columnIndexOrThrow10));
                    constraints.setTriggerMaxContentDelay(query.getLong(columnIndexOrThrow9));
                    constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(query.getBlob(columnIndexOrThrow8)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                    workSpec.inputMergerClassName = query.getString(columnIndexOrThrow4);
                    workSpec.input = Data.fromByteArray(query.getBlob(columnIndexOrThrow5));
                    columnIndexOrThrow16 = i9;
                    workSpec.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow16));
                    i9 = columnIndexOrThrow16;
                    columnIndexOrThrow6 = columnIndexOrThrow14;
                    columnIndexOrThrow = i8;
                    workSpec.initialDelay = query.getLong(columnIndexOrThrow);
                    i8 = columnIndexOrThrow;
                    columnIndexOrThrow14 = columnIndexOrThrow2;
                    columnIndexOrThrow16 = i7;
                    workSpec.intervalDuration = query.getLong(columnIndexOrThrow16);
                    i7 = columnIndexOrThrow16;
                    columnIndexOrThrow2 = columnIndexOrThrow14;
                    columnIndexOrThrow = i6;
                    workSpec.flexDuration = query.getLong(columnIndexOrThrow);
                    columnIndexOrThrow16 = i5;
                    workSpec.runAttemptCount = query.getInt(columnIndexOrThrow16);
                    columnIndexOrThrow14 = i4;
                    i5 = columnIndexOrThrow16;
                    workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(columnIndexOrThrow14));
                    i6 = columnIndexOrThrow;
                    columnIndexOrThrow16 = i3;
                    i3 = columnIndexOrThrow2;
                    workSpec.backoffDelayDuration = query.getLong(columnIndexOrThrow16);
                    columnIndexOrThrow2 = columnIndexOrThrow16;
                    i4 = columnIndexOrThrow14;
                    columnIndexOrThrow = i2;
                    workSpec.periodStartTime = query.getLong(columnIndexOrThrow);
                    i2 = columnIndexOrThrow;
                    columnIndexOrThrow14 = columnIndexOrThrow2;
                    columnIndexOrThrow16 = i;
                    workSpec.minimumRetentionDuration = query.getLong(columnIndexOrThrow16);
                    i = columnIndexOrThrow16;
                    columnIndexOrThrow2 = columnIndexOrThrow14;
                    columnIndexOrThrow = columnIndexOrThrow15;
                    workSpec.scheduleRequestedAt = query.getLong(columnIndexOrThrow);
                    workSpec.constraints = constraints;
                    arrayList.add(workSpec);
                    columnIndexOrThrow15 = columnIndexOrThrow;
                    columnIndexOrThrow14 = columnIndexOrThrow6;
                    columnIndexOrThrow = i10;
                    columnIndexOrThrow3 = i11;
                    columnIndexOrThrow13 = i13;
                    columnIndexOrThrow16 = i12;
                    int i14 = i3;
                    i3 = columnIndexOrThrow2;
                    columnIndexOrThrow2 = i14;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<WorkSpec> getEnqueuedWork() {
        Throwable th;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0", 0);
        Cursor query = this.__db.query(acquire);
        RoomSQLiteQuery roomSQLiteQuery;
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = query.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = query.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = query.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = query.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = query.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = query.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = query.getColumnIndexOrThrow("minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = query.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = query.getColumnIndexOrThrow("required_network_type");
                int i = columnIndexOrThrow14;
                columnIndexOrThrow14 = query.getColumnIndexOrThrow("requires_charging");
                int i2 = columnIndexOrThrow13;
                columnIndexOrThrow13 = query.getColumnIndexOrThrow("requires_device_idle");
                int i3 = columnIndexOrThrow12;
                columnIndexOrThrow12 = query.getColumnIndexOrThrow("requires_battery_not_low");
                int i4 = columnIndexOrThrow11;
                columnIndexOrThrow11 = query.getColumnIndexOrThrow("requires_storage_not_low");
                int i5 = columnIndexOrThrow10;
                columnIndexOrThrow10 = query.getColumnIndexOrThrow("trigger_content_update_delay");
                int i6 = columnIndexOrThrow9;
                columnIndexOrThrow9 = query.getColumnIndexOrThrow("trigger_max_content_delay");
                int i7 = columnIndexOrThrow8;
                columnIndexOrThrow8 = query.getColumnIndexOrThrow("content_uri_triggers");
                int i8 = columnIndexOrThrow7;
                int i9 = columnIndexOrThrow6;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(columnIndexOrThrow);
                    int i10 = columnIndexOrThrow;
                    String string2 = query.getString(columnIndexOrThrow3);
                    int i11 = columnIndexOrThrow3;
                    Constraints constraints = new Constraints();
                    int i12 = columnIndexOrThrow16;
                    constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(query.getInt(columnIndexOrThrow16)));
                    constraints.setRequiresCharging(query.getInt(columnIndexOrThrow14) != 0);
                    constraints.setRequiresDeviceIdle(query.getInt(columnIndexOrThrow13) != 0);
                    constraints.setRequiresBatteryNotLow(query.getInt(columnIndexOrThrow12) != 0);
                    constraints.setRequiresStorageNotLow(query.getInt(columnIndexOrThrow11) != 0);
                    int i13 = columnIndexOrThrow13;
                    constraints.setTriggerContentUpdateDelay(query.getLong(columnIndexOrThrow10));
                    constraints.setTriggerMaxContentDelay(query.getLong(columnIndexOrThrow9));
                    constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(query.getBlob(columnIndexOrThrow8)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                    workSpec.inputMergerClassName = query.getString(columnIndexOrThrow4);
                    workSpec.input = Data.fromByteArray(query.getBlob(columnIndexOrThrow5));
                    columnIndexOrThrow16 = i9;
                    workSpec.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow16));
                    i9 = columnIndexOrThrow16;
                    columnIndexOrThrow6 = columnIndexOrThrow14;
                    columnIndexOrThrow = i8;
                    workSpec.initialDelay = query.getLong(columnIndexOrThrow);
                    i8 = columnIndexOrThrow;
                    columnIndexOrThrow14 = columnIndexOrThrow2;
                    columnIndexOrThrow16 = i7;
                    workSpec.intervalDuration = query.getLong(columnIndexOrThrow16);
                    i7 = columnIndexOrThrow16;
                    columnIndexOrThrow2 = columnIndexOrThrow14;
                    columnIndexOrThrow = i6;
                    workSpec.flexDuration = query.getLong(columnIndexOrThrow);
                    columnIndexOrThrow16 = i5;
                    workSpec.runAttemptCount = query.getInt(columnIndexOrThrow16);
                    columnIndexOrThrow14 = i4;
                    i5 = columnIndexOrThrow16;
                    workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(columnIndexOrThrow14));
                    i6 = columnIndexOrThrow;
                    columnIndexOrThrow16 = i3;
                    i3 = columnIndexOrThrow2;
                    workSpec.backoffDelayDuration = query.getLong(columnIndexOrThrow16);
                    columnIndexOrThrow2 = columnIndexOrThrow16;
                    i4 = columnIndexOrThrow14;
                    columnIndexOrThrow = i2;
                    workSpec.periodStartTime = query.getLong(columnIndexOrThrow);
                    i2 = columnIndexOrThrow;
                    columnIndexOrThrow14 = columnIndexOrThrow2;
                    columnIndexOrThrow16 = i;
                    workSpec.minimumRetentionDuration = query.getLong(columnIndexOrThrow16);
                    i = columnIndexOrThrow16;
                    columnIndexOrThrow2 = columnIndexOrThrow14;
                    columnIndexOrThrow = columnIndexOrThrow15;
                    workSpec.scheduleRequestedAt = query.getLong(columnIndexOrThrow);
                    workSpec.constraints = constraints;
                    arrayList.add(workSpec);
                    columnIndexOrThrow15 = columnIndexOrThrow;
                    columnIndexOrThrow14 = columnIndexOrThrow6;
                    columnIndexOrThrow = i10;
                    columnIndexOrThrow3 = i11;
                    columnIndexOrThrow13 = i13;
                    columnIndexOrThrow16 = i12;
                    int i14 = i3;
                    i3 = columnIndexOrThrow2;
                    columnIndexOrThrow2 = i14;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public int setState(State state, String... strArr) {
        int executeUpdateDelete;
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("UPDATE workspec SET state=");
        newStringBuilder.append("?");
        newStringBuilder.append(" WHERE id IN (");
        StringUtil.appendPlaceholders(newStringBuilder, strArr.length);
        newStringBuilder.append(")");
        SupportSQLiteStatement compileStatement = this.__db.compileStatement(newStringBuilder.toString());
        compileStatement.bindLong(1, (long) WorkTypeConverters.stateToInt(state));
        int i = 2;
        for (String str : strArr) {
            if (str == null) {
                compileStatement.bindNull(i);
            } else {
                compileStatement.bindString(i, str);
            }
            i++;
        }
        this.__db.beginTransaction();
        try {
            executeUpdateDelete = compileStatement.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
        }
    }

    private void __fetchRelationshipWorkTagAsjavaLangString(ArrayMap<String, ArrayList<String>> arrayMap) {
        Set<String> keySet = arrayMap.keySet();
        if (!keySet.isEmpty()) {
            int size;
            if (arrayMap.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
                int i;
                ArrayMap arrayMap2 = new ArrayMap((int) RoomDatabase.MAX_BIND_PARAMETER_CNT);
                size = arrayMap.size();
                ArrayMap arrayMap3 = arrayMap2;
                int i2 = 0;
                while (true) {
                    i = 0;
                    while (i2 < size) {
                        arrayMap3.put(arrayMap.keyAt(i2), arrayMap.valueAt(i2));
                        i2++;
                        i++;
                        if (i == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
                            __fetchRelationshipWorkTagAsjavaLangString(arrayMap3);
                            arrayMap3 = new ArrayMap((int) RoomDatabase.MAX_BIND_PARAMETER_CNT);
                        }
                    }
                    break;
                }
                if (i > 0) {
                    __fetchRelationshipWorkTagAsjavaLangString(arrayMap3);
                }
                return;
            }
            StringBuilder newStringBuilder = StringUtil.newStringBuilder();
            newStringBuilder.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            StringUtil.appendPlaceholders(newStringBuilder, size2);
            newStringBuilder.append(")");
            RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size2 + 0);
            size2 = 1;
            for (String str : keySet) {
                if (str == null) {
                    acquire.bindNull(size2);
                } else {
                    acquire.bindString(size2, str);
                }
                size2++;
            }
            Cursor query = this.__db.query(acquire);
            try {
                size = query.getColumnIndex("work_spec_id");
                if (size != -1) {
                    while (query.moveToNext()) {
                        if (!query.isNull(size)) {
                            ArrayList arrayList = (ArrayList) arrayMap.get(query.getString(size));
                            if (arrayList != null) {
                                arrayList.add(query.getString(0));
                            }
                        }
                    }
                    query.close();
                }
            } finally {
                query.close();
            }
        }
    }
}
