package com.iqoption.dto;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import org.json.JSONObject;

public class Answer {
    public int id;
    public String name;
    public int nextQuestionId;

    public static Answer fromJSON(int i, JSONObject jSONObject) {
        Answer answer = new Answer();
        answer.name = jSONObject.getString(ConditionalUserProperty.NAME);
        answer.nextQuestionId = jSONObject.getInt("next_question");
        answer.id = i;
        return answer;
    }
}
