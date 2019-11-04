package io.reactivex.disposables;

final class RunnableDisposable extends ReferenceDisposable<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    RunnableDisposable(Runnable runnable) {
        super(runnable);
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: p */
    public void cK(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RunnableDisposable(disposed=");
        stringBuilder.append(isDisposed());
        stringBuilder.append(", ");
        stringBuilder.append(get());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
