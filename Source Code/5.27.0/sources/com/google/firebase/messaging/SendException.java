package com.google.firebase.messaging;

import java.util.Locale;

public final class SendException extends Exception {
    private final int errorCode;

    SendException(String str) {
        super(str);
        int i = 0;
        if (str != null) {
            str = str.toLowerCase(Locale.US);
            int i2 = -1;
            switch (str.hashCode()) {
                case -1743242157:
                    if (str.equals("service_not_available")) {
                        i2 = 3;
                        break;
                    }
                    break;
                case -1290953729:
                    if (str.equals("toomanymessages")) {
                        i2 = 4;
                        break;
                    }
                    break;
                case -920906446:
                    if (str.equals("invalid_parameters")) {
                        i2 = 0;
                        break;
                    }
                    break;
                case -617027085:
                    if (str.equals("messagetoobig")) {
                        i2 = 2;
                        break;
                    }
                    break;
                case -95047692:
                    if (str.equals("missing_to")) {
                        i2 = 1;
                        break;
                    }
                    break;
            }
            if (i2 == 0 || i2 == 1) {
                i = 1;
            } else if (i2 == 2) {
                i = 2;
            } else if (i2 == 3) {
                i = 3;
            } else if (i2 == 4) {
                i = 4;
            }
        }
        this.errorCode = i;
    }
}
