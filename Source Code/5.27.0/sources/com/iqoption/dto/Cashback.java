package com.iqoption.dto;

import org.json.JSONObject;

public class Cashback {
    public boolean cashbackEnabled = false;
    public double collected;
    public double current;
    public double earned;
    public double high;
    public boolean isLastLevelNotified;
    public int level;
    public double willGet;

    public void asJson(JSONObject jSONObject) {
        this.cashbackEnabled = jSONObject.getBoolean("enabled");
        if (this.cashbackEnabled) {
            this.level = jSONObject.getInt("level");
            this.current = jSONObject.getDouble("cashback_in_progress");
            String str = "cashback_this_level";
            this.high = jSONObject.getDouble(str);
            this.collected = jSONObject.getDouble("cashback_on_balance");
            this.earned = jSONObject.getDouble("cashback_prev_level");
            this.willGet = jSONObject.getDouble(str);
            str = "last_level_notified";
            if (jSONObject.has(str) && !jSONObject.getBoolean(str)) {
                this.isLastLevelNotified = true;
            }
        }
    }
}
