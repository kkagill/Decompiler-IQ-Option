package com.pro100svitlo.creditCardNfcReader.model;

import com.pro100svitlo.creditCardNfcReader.enums.EmvCardScheme;
import java.util.Collection;
import java.util.List;

public class EmvCard extends AbstractData {
    private static final long serialVersionUID = 736740432469989941L;
    private String aid;
    private String applicationLabel;
    private Collection<String> atrDescription;
    private String cardNumber;
    private String expireDate;
    private String holderFirstname;
    private String holderLastname;
    private int leftPinTry;
    private List<EmvTransactionRecord> listTransactions;
    private boolean nfcLocked;
    private Service service;
    private EmvCardScheme type;

    public void kR(String str) {
        this.aid = str;
    }

    public String bgF() {
        return this.holderLastname;
    }

    public void kS(String str) {
        this.holderLastname = str;
    }

    public String bgG() {
        return this.holderFirstname;
    }

    public void kT(String str) {
        this.holderFirstname = str;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public void kU(String str) {
        this.cardNumber = str;
    }

    public String aba() {
        return this.expireDate;
    }

    public void kV(String str) {
        this.expireDate = str;
    }

    public void bK(List<EmvTransactionRecord> list) {
        this.listTransactions = list;
    }

    public void a(EmvCardScheme emvCardScheme) {
        this.type = emvCardScheme;
    }

    public void kW(String str) {
        this.applicationLabel = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof EmvCard) {
            String str = this.cardNumber;
            if (str != null && str.equals(((EmvCard) obj).getCardNumber())) {
                return true;
            }
        }
        return false;
    }

    public void iH(int i) {
        this.leftPinTry = i;
    }

    public void a(Service service) {
        this.service = service;
    }

    public void fY(boolean z) {
        this.nfcLocked = z;
    }
}
