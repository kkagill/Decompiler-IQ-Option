package com.iqoption.microservice.c.a;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* compiled from: OtnLeaderBoardResponse */
public final class a {
    @SerializedName("isSuccessful")
    private boolean blS;
    @SerializedName("result")
    private a dGO;

    /* compiled from: OtnLeaderBoardResponse */
    public static final class a {
        @SerializedName("user_id")
        private int buc;
        @SerializedName("top_size")
        private int bwk;
        @SerializedName("positional")
        private Map<Integer, Object> dGP;
        @SerializedName("position")
        private int dGQ;
        @SerializedName("score")
        private double dGR;
        @SerializedName("next_emission_amount")
        private double dGS;

        public int aOj() {
            return this.dGQ;
        }

        public int aOk() {
            return this.bwk;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Result{userId=");
            stringBuilder.append(this.buc);
            stringBuilder.append(", usersRowMap=");
            stringBuilder.append(this.dGP);
            stringBuilder.append(", currentUserPosition=");
            stringBuilder.append(this.dGQ);
            stringBuilder.append(", currentUserScore=");
            stringBuilder.append(this.dGR);
            stringBuilder.append(", topSize =");
            stringBuilder.append(this.bwk);
            stringBuilder.append(", nextEmissionAmount=");
            stringBuilder.append(this.dGS);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public a aOi() {
        return this.dGO;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OtnLeaderBoardResponse{isSuccessful=");
        stringBuilder.append(this.blS);
        stringBuilder.append(", result=");
        stringBuilder.append(this.dGO);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
