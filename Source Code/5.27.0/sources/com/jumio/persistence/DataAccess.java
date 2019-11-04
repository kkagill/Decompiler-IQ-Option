package com.jumio.persistence;

import android.content.Context;
import androidx.annotation.Nullable;
import com.jumio.commons.log.Log;
import java.io.IOException;
import java.io.Serializable;

public class DataAccess {
    private static final String TAG = "DataAccess";

    @Nullable
    public static synchronized <T extends Serializable> T load(Context context, Class<T> cls) {
        T restoreFromBlob;
        synchronized (DataAccess.class) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                restoreFromBlob = new Persistor(context, (Class) cls).restoreFromBlob();
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                String str = TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("loading ");
                stringBuilder.append(cls.getSimpleName());
                stringBuilder.append(" took ");
                stringBuilder.append(currentTimeMillis2);
                stringBuilder.append(" ms");
                stringBuilder.append(restoreFromBlob == null ? " (was null)" : "");
                Log.v(str, stringBuilder.toString());
            } catch (PersistenceException | IOException e) {
                Log.w(TAG, String.format("Error loading %s", new Object[]{cls.getName()}), e);
                restoreFromBlob = null;
            }
        }
        return restoreFromBlob;
    }

    @Nullable
    public static synchronized <T extends Serializable> T load(Context context, String str) {
        T restoreFromBlob;
        synchronized (DataAccess.class) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                restoreFromBlob = new Persistor(context, str).restoreFromBlob();
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                String str2 = TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("loading ");
                stringBuilder.append(str);
                stringBuilder.append(" took ");
                stringBuilder.append(currentTimeMillis2);
                stringBuilder.append(" ms");
                stringBuilder.append(restoreFromBlob == null ? " (was null)" : "");
                Log.v(str2, stringBuilder.toString());
            } catch (PersistenceException | IOException e) {
                Log.w(TAG, String.format("Error loading %s", new Object[]{str}), e);
                restoreFromBlob = null;
            }
        }
        return restoreFromBlob;
    }

    @Deprecated
    public static synchronized <T extends Serializable> void store(Context context, Class<T> cls, T t) {
        synchronized (DataAccess.class) {
            update(context, (Class) cls, (Serializable) t);
        }
    }

    @Deprecated
    public static synchronized <T extends Serializable> void store(Context context, String str, T t) {
        synchronized (DataAccess.class) {
            update(context, str, (Serializable) t);
        }
    }

    public static synchronized <T extends Serializable> void update(Context context, Class<T> cls, T t) {
        synchronized (DataAccess.class) {
            if (t == null) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            try {
                Persistor persistor = new Persistor(context, (Class) cls);
                persistor.delete();
                persistor.storeAsBlob(t);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                String str = TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("storing ");
                stringBuilder.append(t.getClass().getSimpleName());
                stringBuilder.append("took ");
                stringBuilder.append(currentTimeMillis2);
                stringBuilder.append(" ms");
                Log.v(str, stringBuilder.toString());
            } catch (PersistenceException | IOException e) {
                Log.w(TAG, String.format("Error persisting %s", new Object[]{cls.getName()}), e);
            }
        }
    }

    public static synchronized <T extends Serializable> void update(Context context, String str, T t) {
        synchronized (DataAccess.class) {
            if (t == null) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            try {
                Persistor persistor = new Persistor(context, str);
                persistor.delete();
                persistor.storeAsBlob(t);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                String str2 = TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("storing ");
                stringBuilder.append(str);
                stringBuilder.append("took ");
                stringBuilder.append(currentTimeMillis2);
                stringBuilder.append(" ms");
                Log.v(str2, stringBuilder.toString());
            } catch (PersistenceException | IOException e) {
                Log.w(TAG, String.format("Error persisting %s", new Object[]{str}), e);
            }
        }
        return;
    }

    public static synchronized <T extends Serializable> void delete(Context context, Class<T> cls) {
        synchronized (DataAccess.class) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                new Persistor(context, (Class) cls).delete();
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                String str = TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("deleting ");
                stringBuilder.append(cls.getSimpleName());
                stringBuilder.append("took ");
                stringBuilder.append(currentTimeMillis2);
                stringBuilder.append(" ms");
                Log.v(str, stringBuilder.toString());
            } catch (PersistenceException e) {
                Log.w(TAG, String.format("Error deleting %s", new Object[]{cls.getName()}), e);
            }
        }
        return;
    }

    public static synchronized <T extends Serializable> void delete(Context context, String str) {
        synchronized (DataAccess.class) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                new Persistor(context, str).delete();
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                String str2 = TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("deleting ");
                stringBuilder.append(str);
                stringBuilder.append("took ");
                stringBuilder.append(currentTimeMillis2);
                stringBuilder.append(" ms");
                Log.v(str2, stringBuilder.toString());
            } catch (PersistenceException e) {
                Log.w(TAG, String.format("Error deleting %s", new Object[]{str}), e);
            }
        }
        return;
    }
}
