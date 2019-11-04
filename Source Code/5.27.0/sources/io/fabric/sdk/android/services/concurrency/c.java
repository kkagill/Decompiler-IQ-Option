package io.fabric.sdk.android.services.concurrency;

import io.fabric.sdk.android.services.concurrency.AsyncTask.Status;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PriorityAsyncTask */
public abstract class c<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> implements a<i>, f, i {
    private final g eNZ = new g();

    /* compiled from: PriorityAsyncTask */
    private static class a<Result> implements Executor {
        private final c eOa;
        private final Executor executor;

        public a(Executor executor, c cVar) {
            this.executor = executor;
            this.eOa = cVar;
        }

        public void execute(Runnable runnable) {
            this.executor.execute(new e<Result>(runnable, null) {
                public <T extends a<i> & f & i> T bjV() {
                    return a.this.eOa;
                }
            });
        }
    }

    public final void a(ExecutorService executorService, Params... paramsArr) {
        super.a(new a(executorService, this), (Object[]) paramsArr);
    }

    public int compareTo(Object obj) {
        return Priority.compareTo(this, obj);
    }

    /* renamed from: a */
    public void cy(i iVar) {
        if (bjO() == Status.PENDING) {
            ((a) ((f) bjV())).cy(iVar);
            return;
        }
        throw new IllegalStateException("Must not add Dependency after task is running");
    }

    public Collection<i> bjh() {
        return ((a) ((f) bjV())).bjh();
    }

    public boolean bjQ() {
        return ((a) ((f) bjV())).bjQ();
    }

    public Priority fq() {
        return ((f) bjV()).fq();
    }

    public void gn(boolean z) {
        ((i) ((f) bjV())).gn(z);
    }

    public boolean isFinished() {
        return ((i) ((f) bjV())).isFinished();
    }

    public void Y(Throwable th) {
        ((i) ((f) bjV())).Y(th);
    }

    public <T extends a<i> & f & i> T bjV() {
        return this.eNZ;
    }
}
