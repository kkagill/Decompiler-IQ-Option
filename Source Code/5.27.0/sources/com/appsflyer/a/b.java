package com.appsflyer.a;

import java.util.Scanner;

public class b {
    private String lO;
    private String lc;
    private String lw;
    private String lx;

    public b(String str, String str2, String str3) {
        this.lw = str;
        this.lx = str2;
        this.lO = str3;
    }

    public b(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.lw = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.lO = nextLine.substring(8).trim();
            } else if (nextLine.startsWith("data=")) {
                this.lx = nextLine.substring(5).trim();
            }
        }
        scanner.close();
    }

    public String getVersion() {
        return this.lO;
    }

    public String dI() {
        return this.lx;
    }

    public String dJ() {
        return this.lw;
    }

    public String dK() {
        return this.lc;
    }

    public void ad(String str) {
        this.lc = str;
    }
}
