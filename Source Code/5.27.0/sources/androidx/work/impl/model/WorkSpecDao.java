package androidx.work.impl.model;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.work.Data;
import androidx.work.WorkInfo.State;
import androidx.work.impl.model.WorkSpec.IdAndState;
import androidx.work.impl.model.WorkSpec.WorkInfoPojo;
import java.util.List;

@Dao
public interface WorkSpecDao {
    @Query("DELETE FROM workspec WHERE id=:id")
    void delete(String str);

    @Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)")
    List<String> getAllUnfinishedWork();

    @Query("SELECT id FROM workspec")
    List<String> getAllWorkSpecIds();

    @Query("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 LIMIT (SELECT MAX(:schedulerLimit-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))")
    List<WorkSpec> getEligibleWorkForScheduling(int i);

    @Query("SELECT * FROM workspec WHERE state=0")
    List<WorkSpec> getEnqueuedWork();

    @Query("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id)")
    List<Data> getInputsFromPrerequisites(String str);

    @Query("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1")
    List<WorkSpec> getScheduledWork();

    @Query("SELECT state FROM workspec WHERE id=:id")
    State getState(String str);

    @Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<String> getUnfinishedWorkWithName(@NonNull String str);

    @Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    List<String> getUnfinishedWorkWithTag(@NonNull String str);

    @Query("SELECT * FROM workspec WHERE id=:id")
    WorkSpec getWorkSpec(String str);

    @Query("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<IdAndState> getWorkSpecIdAndStatesForName(String str);

    @Query("SELECT * FROM workspec WHERE id IN (:ids)")
    WorkSpec[] getWorkSpecs(List<String> list);

    @Transaction
    @Query("SELECT id, state, output FROM workspec WHERE id=:id")
    WorkInfoPojo getWorkStatusPojoForId(String str);

    @Transaction
    @Query("SELECT id, state, output FROM workspec WHERE id IN (:ids)")
    List<WorkInfoPojo> getWorkStatusPojoForIds(List<String> list);

    @Transaction
    @Query("SELECT id, state, output FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<WorkInfoPojo> getWorkStatusPojoForName(String str);

    @Transaction
    @Query("SELECT id, state, output FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    List<WorkInfoPojo> getWorkStatusPojoForTag(String str);

    @Transaction
    @Query("SELECT id, state, output FROM workspec WHERE id IN (:ids)")
    LiveData<List<WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(List<String> list);

    @Transaction
    @Query("SELECT id, state, output FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    LiveData<List<WorkInfoPojo>> getWorkStatusPojoLiveDataForName(String str);

    @Transaction
    @Query("SELECT id, state, output FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    LiveData<List<WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(String str);

    @Query("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=:id")
    int incrementWorkSpecRunAttemptCount(String str);

    @Insert(onConflict = 5)
    void insertWorkSpec(WorkSpec workSpec);

    @Query("UPDATE workspec SET schedule_requested_at=:startTime WHERE id=:id")
    int markWorkSpecScheduled(@NonNull String str, long j);

    @Query("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))")
    void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();

    @Query("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)")
    int resetScheduledState();

    @Query("UPDATE workspec SET run_attempt_count=0 WHERE id=:id")
    int resetWorkSpecRunAttemptCount(String str);

    @Query("UPDATE workspec SET output=:output WHERE id=:id")
    void setOutput(String str, Data data);

    @Query("UPDATE workspec SET period_start_time=:periodStartTime WHERE id=:id")
    void setPeriodStartTime(String str, long j);

    @Query("UPDATE workspec SET state=:state WHERE id IN (:ids)")
    int setState(State state, String... strArr);
}
