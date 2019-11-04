package com.iqoption.analytics;

import androidx.core.app.NotificationCompat;
import com.google.common.collect.ImmutableList;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.iqoption.app.managers.l;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.u;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.mobbtech.connect.response.options.c;
import com.iqoption.portfolio.b;
import com.iqoption.portfolio.component.b.j;
import com.iqoption.portfolio.component.b.m;
import com.iqoption.util.g;

/* compiled from: PortfolioEventHelper */
public class k {
    public static void Cf() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "portfolio_show-open-deals").build());
    }

    public static void Cg() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "portfolio_show-closed-deals").build());
    }

    public static void Ch() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "portfolio_show-instruments-filter").build());
    }

    public static void dG(int i) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("filter_key", new JsonPrimitive(Integer.valueOf(i)));
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "portfolio_choose-instrument-filter").setParameters(jsonObject).build());
    }

    public static void a(b bVar) {
        JsonObject jsonObject = new JsonObject();
        InstrumentType instrumentType = bVar.getInstrumentType();
        jsonObject.add("instrument_type", new JsonPrimitive(instrumentType != null ? instrumentType.getServerValue() : ""));
        if (bVar.aQz() == 1) {
            ImmutableList aQy = bVar.aQy();
            if (!g.isEmpty(aQy)) {
                jsonObject.add("instrument_direction", new JsonPrimitive(((c) aQy.get(0)).isCall() ? NotificationCompat.CATEGORY_CALL : "put"));
            }
        }
        jsonObject.add("close_time ", new JsonPrimitive(Long.valueOf(bVar.getCloseTime())));
        jsonObject.add("pnl ", new JsonPrimitive(Double.valueOf(bVar.aQA().getSellPnl())));
        jsonObject.add("balance_type_id", new JsonPrimitive(Long.valueOf(com.iqoption.app.b.DG().DH())));
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "portfolio_show-closed-deal-details").setValue(Double.valueOf(bVar.aQA().getValue())).setParameters(jsonObject).build());
    }

    public static void a(InstrumentType instrumentType) {
        JsonObject jsonObject = new JsonObject();
        if (instrumentType != null) {
            jsonObject.add("instrument_type", new JsonPrimitive(instrumentType.getServerValue()));
        }
        jsonObject.add("balance_type_id", new JsonPrimitive(Long.valueOf(com.iqoption.app.b.DG().DH())));
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "portfolio_close-closed-deal-details").setParameters(jsonObject).build());
    }

    public static void a(j jVar, boolean z) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("instrument_type ", new JsonPrimitive(g.a(jVar)));
        jsonObject.add("balance_type_id", new JsonPrimitive(Long.valueOf(com.iqoption.app.b.DG().DH())));
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "portfolio_show-open-deal-details").setValue(Double.valueOf(z ? 1.0d : 0.0d)).setParameters(jsonObject).build());
    }

    public static void b(j jVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("instrument_type ", new JsonPrimitive(g.a(jVar)));
        jsonObject.add("instrument_direction", new JsonPrimitive(jVar.isCall() ? NotificationCompat.CATEGORY_CALL : "put"));
        jsonObject.add("close_time", new JsonPrimitive(Long.valueOf(l.HZ().Ib())));
        jsonObject.add("pnl", new JsonPrimitive(Double.valueOf(jVar.aQA().getSellPnl())));
        jsonObject.add("balance_type_id", new JsonPrimitive(Long.valueOf(com.iqoption.app.b.DG().DH())));
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "portfolio_sell-open-deal").setValue(Double.valueOf(jVar.aQA().getValue())).setParameters(jsonObject).build());
    }

    public static void Ci() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "portfolio_extend-potfolio").build());
    }

    public static void Cj() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "portfolio_rollup-extended-portfolio").build());
    }

    public static void b(j jVar, boolean z) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("instrument_type ", new JsonPrimitive(g.a(jVar)));
        jsonObject.add("balance_type_id", new JsonPrimitive(Long.valueOf(com.iqoption.app.b.DG().DH())));
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "portfolio_show-open-deal-details-ext").setValue(Double.valueOf(z ? 1.0d : 0.0d)).setParameters(jsonObject).build());
    }

    public static void c(j jVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("instrument_type ", new JsonPrimitive(g.a(jVar)));
        jsonObject.add("instrument_direction", new JsonPrimitive(jVar.isCall() ? NotificationCompat.CATEGORY_CALL : "put"));
        jsonObject.add("close_time", new JsonPrimitive(Long.valueOf(l.HZ().Ib())));
        jsonObject.add("pnl", new JsonPrimitive(Double.valueOf(jVar.aQA().getSellPnl())));
        jsonObject.add("balance_type_id", new JsonPrimitive(Long.valueOf(com.iqoption.app.b.DG().DH())));
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "portfolio_sell-open-deal-ext").setValue(Double.valueOf(jVar.aQA().getValue())).setParameters(jsonObject).build());
    }

    public static void Ck() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "portfolio_open-tpsl-limits-settings").build());
    }

    public static void Cl() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "portfolio_show-pending-deals").build());
    }

    public static void a(m mVar, boolean z) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "portfolio_pending-deal-details").setValue(Double.valueOf(z ? 1.0d : 0.0d)).setParameters(u.anp().o("instrument_type", mVar.Jt().getInstrumentType()).o("balance_type_id", Long.valueOf(com.iqoption.app.b.DG().DH())).anr()).build());
    }

    public static void b(m mVar, boolean z) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "portfolio_show-pending-deal-details-ext").setValue(Double.valueOf(z ? 1.0d : 0.0d)).setParameters(u.anp().o("instrument_type", mVar.Jt().getInstrumentType()).o("balance_type_id", Long.valueOf(com.iqoption.app.b.DG().DH())).anr()).build());
    }

    public static void a(m mVar) {
        String str = "balance_type_id";
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "portfolio_cancel-pending-deal").setParameters(u.anp().o("instrument_type", mVar.Jt().getInstrumentType()).o(str, Long.valueOf(com.iqoption.app.b.DG().DH())).anr()).build());
    }

    public static void b(m mVar) {
        String str = "balance_type_id";
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "portfolio_cancel-pending-deal-ext").setParameters(u.anp().o("instrument_type", mVar.Jt().getInstrumentType()).o(str, Long.valueOf(com.iqoption.app.b.DG().DH())).anr()).build());
    }

    public static Builder Cm() {
        return Event.Builder(Event.CATEGORY_POPUP_SERVED, "portfolio_confirm-pending-cancellation");
    }

    public static void aC(boolean z) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "portfolio_confirm-pending-cancellation-option").setValue(Double.valueOf(z ? 1.0d : 0.0d)).build());
    }
}
