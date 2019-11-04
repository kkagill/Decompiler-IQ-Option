package com.iqoption.dto;

import android.text.Html;
import org.json.JSONObject;

public class Article {
    public String answer;
    public String question;

    public Article(JSONObject jSONObject) {
        String str = "";
        String str2 = "\n";
        this.answer = Html.fromHtml(jSONObject.getString("text")).toString().replace(str2, str);
        this.question = Html.fromHtml(jSONObject.getString("header")).toString().replace(str2, str);
    }
}
