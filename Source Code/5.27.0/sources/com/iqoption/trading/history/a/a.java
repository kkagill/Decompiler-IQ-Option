package com.iqoption.trading.history.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.iqoption.dto.entity.position.Position;
import java.util.Collections;
import java.util.List;

/* compiled from: PortfolioTradingPositionWrapper */
public final class a {
    @SerializedName("raw_event")
    private Position position;

    /* compiled from: PortfolioTradingPositionWrapper */
    public static class a {
        @SerializedName("positions")
        private List<a> bwQ;

        @NonNull
        public List<a> agl() {
            List<a> list = this.bwQ;
            return list != null ? list : Collections.emptyList();
        }
    }

    @Nullable
    public Position aVd() {
        return this.position;
    }
}
