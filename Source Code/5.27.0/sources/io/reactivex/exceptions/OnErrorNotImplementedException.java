package io.reactivex.exceptions;

public final class OnErrorNotImplementedException extends RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    public OnErrorNotImplementedException(String str, Throwable th) {
        if (th == null) {
            th = new NullPointerException();
        }
        super(str, th);
    }

    public OnErrorNotImplementedException(Throwable th) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ");
        stringBuilder.append(th);
        this(stringBuilder.toString(), th);
    }
}
