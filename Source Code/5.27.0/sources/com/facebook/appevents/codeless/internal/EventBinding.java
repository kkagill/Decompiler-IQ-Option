package com.facebook.appevents.codeless.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class EventBinding {
    private final String eventName;
    private final String wc;
    private final MappingMethod wo;
    private final ActionType wp;
    private final String wq;
    private final List<PathComponent> wr;
    private final List<a> ws;
    private final String wt;
    private final String wu;

    public enum ActionType {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    public enum MappingMethod {
        MANUAL,
        INFERENCE
    }

    public EventBinding(String str, MappingMethod mappingMethod, ActionType actionType, String str2, List<PathComponent> list, List<a> list2, String str3, String str4, String str5) {
        this.eventName = str;
        this.wo = mappingMethod;
        this.wp = actionType;
        this.wq = str2;
        this.wr = list;
        this.ws = list2;
        this.wt = str3;
        this.wu = str4;
        this.wc = str5;
    }

    public static List<EventBinding> c(JSONArray jSONArray) {
        int length;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (jSONArray != null) {
            try {
                length = jSONArray.length();
            } catch (IllegalArgumentException | JSONException unused) {
            }
        } else {
            length = 0;
        }
        while (i < length) {
            arrayList.add(f(jSONArray.getJSONObject(i)));
            i++;
        }
        return arrayList;
    }

    public static EventBinding f(JSONObject jSONObject) {
        String string = jSONObject.getString("event_name");
        MappingMethod valueOf = MappingMethod.valueOf(jSONObject.getString("method").toUpperCase(Locale.ENGLISH));
        ActionType valueOf2 = ActionType.valueOf(jSONObject.getString("event_type").toUpperCase(Locale.ENGLISH));
        String string2 = jSONObject.getString("app_version");
        JSONArray jSONArray = jSONObject.getJSONArray("path");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new PathComponent(jSONArray.getJSONObject(i)));
        }
        String optString = jSONObject.optString("path_type", "absolute");
        jSONArray = jSONObject.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList2.add(new a(jSONArray.getJSONObject(i2)));
            }
        }
        return new EventBinding(string, valueOf, valueOf2, string2, arrayList, arrayList2, jSONObject.optString("component_id"), optString, jSONObject.optString("activity_name"));
    }

    public List<PathComponent> iJ() {
        return Collections.unmodifiableList(this.wr);
    }

    public List<a> iK() {
        return Collections.unmodifiableList(this.ws);
    }

    public String getEventName() {
        return this.eventName;
    }

    public ActionType iL() {
        return this.wp;
    }

    public String iM() {
        return this.wc;
    }
}
