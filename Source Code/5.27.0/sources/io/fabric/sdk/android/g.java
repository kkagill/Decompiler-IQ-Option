package io.fabric.sdk.android;

import io.fabric.sdk.android.services.common.u;
import io.fabric.sdk.android.services.concurrency.Priority;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import io.fabric.sdk.android.services.concurrency.c;

/* compiled from: InitializationTask */
class g<Result> extends c<Void, Void, Result> {
    final h<Result> nP;

    public g(h<Result> hVar) {
        this.nP = hVar;
    }

    /* Access modifiers changed, original: protected */
    public void onPreExecute() {
        super.onPreExecute();
        u lj = lj("onPreExecute");
        try {
            boolean ee = this.nP.ee();
            lj.bjM();
            if (ee) {
                return;
            }
        } catch (UnmetDependencyException e) {
            throw e;
        } catch (Exception e2) {
            c.biX().e("Fabric", "Failure onPreExecute()", e2);
            lj.bjM();
        } catch (Throwable th) {
            lj.bjM();
            cancel(true);
        }
        cancel(true);
    }

    /* Access modifiers changed, original: protected|varargs */
    public Result doInBackground(Void... voidArr) {
        u lj = lj("doInBackground");
        Result ec = !isCancelled() ? this.nP.ec() : null;
        lj.bjM();
        return ec;
    }

    /* Access modifiers changed, original: protected */
    public void onPostExecute(Result result) {
        this.nP.onPostExecute(result);
        this.nP.eMi.cx(result);
    }

    /* Access modifiers changed, original: protected */
    public void onCancelled(Result result) {
        this.nP.onCancelled(result);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.nP.getIdentifier());
        stringBuilder.append(" Initialization was cancelled");
        this.nP.eMi.f(new InitializationException(stringBuilder.toString()));
    }

    public Priority fq() {
        return Priority.HIGH;
    }

    private u lj(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.nP.getIdentifier());
        stringBuilder.append(".");
        stringBuilder.append(str);
        u uVar = new u(stringBuilder.toString(), "KitInitialization");
        uVar.bjL();
        return uVar;
    }
}
