package com.iqoption.dto;

import org.json.JSONObject;

public class Payment {
    public long created;
    public String paymentMethod;
    public String state;
    public double sum;
    public String type;

    public static Payment json2payment(JSONObject jSONObject) {
        Payment payment = new Payment();
        payment.state = jSONObject.optString("state");
        payment.sum = jSONObject.optDouble("user_balance");
        payment.type = jSONObject.optString("type");
        payment.created = jSONObject.optLong("created");
        payment.paymentMethod = jSONObject.optString("payment_method_id");
        return payment;
    }
}
