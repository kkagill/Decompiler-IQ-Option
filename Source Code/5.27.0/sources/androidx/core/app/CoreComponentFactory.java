package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;

@RequiresApi(api = 28)
@RestrictTo({Scope.LIBRARY_GROUP})
public class CoreComponentFactory extends AppComponentFactory {
    private static final String TAG = "CoreComponentFactory";

    @RestrictTo({Scope.LIBRARY_GROUP})
    public interface CompatWrapped {
        Object getWrapper();
    }

    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return (Activity) checkCompatWrapper(super.instantiateActivity(classLoader, str, intent));
    }

    public Application instantiateApplication(ClassLoader classLoader, String str) {
        return (Application) checkCompatWrapper(super.instantiateApplication(classLoader, str));
    }

    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return (BroadcastReceiver) checkCompatWrapper(super.instantiateReceiver(classLoader, str, intent));
    }

    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return (ContentProvider) checkCompatWrapper(super.instantiateProvider(classLoader, str));
    }

    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        return (Service) checkCompatWrapper(super.instantiateService(classLoader, str, intent));
    }

    static <T> T checkCompatWrapper(T t) {
        if (t instanceof CompatWrapped) {
            Object wrapper = ((CompatWrapped) t).getWrapper();
            if (wrapper != null) {
                return wrapper;
            }
        }
        return t;
    }
}
