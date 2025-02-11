package androidx.room;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.room.RoomDatabase.Builder;

public class Room {
    private static final String CURSOR_CONV_SUFFIX = "_CursorConverter";
    static final String LOG_TAG = "ROOM";
    public static final String MASTER_TABLE_NAME = "room_master_table";

    @NonNull
    public static <T extends RoomDatabase> Builder<T> databaseBuilder(@NonNull Context context, @NonNull Class<T> cls, @NonNull String str) {
        if (str != null && str.trim().length() != 0) {
            return new Builder(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }

    @NonNull
    public static <T extends RoomDatabase> Builder<T> inMemoryDatabaseBuilder(@NonNull Context context, @NonNull Class<T> cls) {
        return new Builder(context, cls, null);
    }

    @NonNull
    static <T, C> T getGeneratedImplementation(Class<C> cls, String str) {
        StringBuilder stringBuilder;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(canonicalName.replace('.', '_'));
        stringBuilder2.append(str);
        str = stringBuilder2.toString();
        StringBuilder stringBuilder3;
        try {
            if (name.isEmpty()) {
                name = str;
            } else {
                stringBuilder3 = new StringBuilder();
                stringBuilder3.append(name);
                stringBuilder3.append(".");
                stringBuilder3.append(str);
                name = stringBuilder3.toString();
            }
            return Class.forName(name).newInstance();
        } catch (ClassNotFoundException unused) {
            stringBuilder3 = new StringBuilder();
            stringBuilder3.append("cannot find implementation for ");
            stringBuilder3.append(cls.getCanonicalName());
            stringBuilder3.append(". ");
            stringBuilder3.append(str);
            stringBuilder3.append(" does not exist");
            throw new RuntimeException(stringBuilder3.toString());
        } catch (IllegalAccessException unused2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot access the constructor");
            stringBuilder.append(cls.getCanonicalName());
            throw new RuntimeException(stringBuilder.toString());
        } catch (InstantiationException unused3) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to create an instance of ");
            stringBuilder.append(cls.getCanonicalName());
            throw new RuntimeException(stringBuilder.toString());
        }
    }
}
