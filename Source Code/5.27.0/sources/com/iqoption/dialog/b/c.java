package com.iqoption.dialog.b;

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.iqoption.analytics.EventManager;
import com.iqoption.dto.Event;

/* compiled from: TpslEventHelper */
public class c {
    public static void aur() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "tpsl-limits_add-profit-limits").build());
    }

    public static void aus() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "tpsl-limits_delete-profit-limits").build());
    }

    public static void aut() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "tpsl-limits_switch-percentage-amount").build());
    }

    public static void hT(String str) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("button_value ", new JsonPrimitive(str));
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "tpsl-limits_keyboard-button").setParameters(jsonObject).build());
    }

    public static void auu() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "tpsl-limits_keyboard-button-delete").build());
    }

    public static void a(String str, boolean z, double d) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("value_type ", new JsonPrimitive(str));
        jsonObject.add("is_error ", new JsonPrimitive(Boolean.valueOf(z)));
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "tpsl-limits_keyboard-button-done").setValue(Double.valueOf(d)).setParameters(jsonObject).build());
    }

    public static void auv() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_POPUP_SERVED, " tpsl-limits_error").build());
    }

    public static void a(String str, int i, String str2, boolean z, double d) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("limit_type ", new JsonPrimitive(str));
        jsonObject.add("modification_type ", new JsonPrimitive(Integer.valueOf(i)));
        jsonObject.add("value_type ", new JsonPrimitive(str2));
        jsonObject.add("is_error ", new JsonPrimitive(Boolean.valueOf(z)));
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "tpsl-limits_change-limits").setValue(Double.valueOf(d)).setParameters(jsonObject).build());
    }

    public static void auw() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_POPUP_SERVED, "tpsl-limits_cancel").build());
    }

    public static void aux() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_POPUP_SERVED, "tpsl-limits_save").build());
    }

    public static void dc(boolean z) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "tpsl_enable-margin-add-on").setValue(Double.valueOf(z ? 1.0d : 0.0d)).build());
    }
}
