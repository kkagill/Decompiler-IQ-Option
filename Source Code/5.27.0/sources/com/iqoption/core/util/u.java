package com.iqoption.core.util;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;

/* compiled from: JsonUtils */
public final class u {

    /* compiled from: JsonUtils */
    public static class b {
        private final JsonObject bQO;

        public static b anq() {
            return new b();
        }

        public static b i(JsonObject jsonObject) {
            return jsonObject == null ? new b() : new b(jsonObject);
        }

        private b() {
            this(new JsonObject());
        }

        private b(JsonObject jsonObject) {
            this.bQO = jsonObject;
        }

        public <T> b o(String str, T t) {
            a(this.bQO, str, (Object) t);
            return this;
        }

        public <T> b c(String str, List<T> list) {
            a(this.bQO, str, (List) list);
            return this;
        }

        public JsonObject anr() {
            return this.bQO;
        }

        private static <T> void a(JsonObject jsonObject, String str, T t) {
            if (t != null) {
                b(jsonObject, str, t);
            }
        }

        private static <T> void b(JsonObject jsonObject, String str, T t) {
            if (t == null) {
                jsonObject.add(str, null);
            } else if (t instanceof Character) {
                jsonObject.addProperty(str, (Character) t);
            } else if (t instanceof Number) {
                jsonObject.addProperty(str, (Number) t);
            } else if (t instanceof Boolean) {
                jsonObject.addProperty(str, (Boolean) t);
            } else {
                jsonObject.addProperty(str, t.toString());
            }
        }

        private static <T> void a(JsonObject jsonObject, String str, List<T> list) {
            JsonArray jsonArray = new JsonArray();
            for (Object next : list) {
                if (next != null) {
                    if (next instanceof Character) {
                        jsonArray.add((Character) next);
                        return;
                    } else if (next instanceof Number) {
                        jsonArray.add((Number) next);
                    } else if (next instanceof Boolean) {
                        jsonArray.add((Boolean) next);
                    } else {
                        jsonArray.add(next.toString());
                    }
                }
            }
            jsonObject.add(str, jsonArray);
        }
    }

    /* compiled from: JsonUtils */
    static class a {
        static Boolean k(JsonElement jsonElement) {
            if (jsonElement != null) {
                try {
                    if (jsonElement.isJsonPrimitive()) {
                        return Boolean.valueOf(jsonElement.getAsJsonPrimitive().getAsBoolean());
                    }
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }

        static Double c(JsonElement jsonElement) {
            if (jsonElement != null) {
                try {
                    if (jsonElement.isJsonPrimitive()) {
                        return Double.valueOf(jsonElement.getAsJsonPrimitive().getAsDouble());
                    }
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }

        static Integer l(JsonElement jsonElement) {
            if (jsonElement != null) {
                try {
                    if (jsonElement.isJsonPrimitive()) {
                        return Integer.valueOf((int) jsonElement.getAsJsonPrimitive().getAsDouble());
                    }
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }

        static Long d(JsonElement jsonElement) {
            if (jsonElement != null) {
                try {
                    if (jsonElement.isJsonPrimitive()) {
                        return Long.valueOf((long) jsonElement.getAsJsonPrimitive().getAsDouble());
                    }
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }

        static String m(JsonElement jsonElement) {
            if (jsonElement != null) {
                try {
                    if (jsonElement.isJsonPrimitive()) {
                        return jsonElement.getAsJsonPrimitive().getAsString();
                    }
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
    }

    public static b anp() {
        return b.anq();
    }

    public static Double c(JsonElement jsonElement) {
        return a.c(jsonElement);
    }

    public static Long d(JsonElement jsonElement) {
        return a.d(jsonElement);
    }

    public static double e(JsonElement jsonElement) {
        return a(jsonElement, 0.0d);
    }

    public static double a(JsonElement jsonElement, double d) {
        Double c = a.c(jsonElement);
        return c != null ? c.doubleValue() : d;
    }

    public static long f(JsonElement jsonElement) {
        return a(jsonElement, 0);
    }

    public static long a(JsonElement jsonElement, long j) {
        Long d = a.d(jsonElement);
        return d != null ? d.longValue() : j;
    }

    public static int g(JsonElement jsonElement) {
        return a(jsonElement, 0);
    }

    public static int a(JsonElement jsonElement, int i) {
        Integer l = a.l(jsonElement);
        return l != null ? l.intValue() : i;
    }

    public static boolean h(JsonElement jsonElement) {
        return a(jsonElement, false);
    }

    public static boolean a(JsonElement jsonElement, boolean z) {
        Boolean k = a.k(jsonElement);
        return k != null ? k.booleanValue() : z;
    }

    public static String i(JsonElement jsonElement) {
        return a(jsonElement, "");
    }

    public static String a(JsonElement jsonElement, String str) {
        String m = a.m(jsonElement);
        return m != null ? m : str;
    }

    private static JsonObject j(JsonElement jsonElement) {
        return (jsonElement == null || !jsonElement.isJsonObject()) ? null : jsonElement.getAsJsonObject();
    }

    public static JsonElement b(JsonElement jsonElement, String str) {
        JsonObject j = j(jsonElement);
        return j != null ? j.get(str) : null;
    }
}
