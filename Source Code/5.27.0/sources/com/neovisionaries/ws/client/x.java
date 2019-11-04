package com.neovisionaries.ws.client;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;
import java.util.Map.Entry;

/* compiled from: ProxyHandshaker */
class x {
    private final Socket eAh;
    private final y eAi;
    private final String ezt;
    private final int ezu;

    public x(Socket socket, String str, int i, y yVar) {
        this.eAh = socket;
        this.ezt = str;
        this.ezu = i;
        this.eAi = yVar;
    }

    public void amK() {
        bfc();
        bfe();
    }

    private void bfc() {
        byte[] kx = p.kx(bfd());
        OutputStream outputStream = this.eAh.getOutputStream();
        outputStream.write(kx);
        outputStream.flush();
    }

    private String bfd() {
        String format = String.format("%s:%d", new Object[]{this.ezt, Integer.valueOf(this.ezu)});
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CONNECT ");
        stringBuilder.append(format);
        stringBuilder.append(" HTTP/1.1");
        String str = "\r\n";
        stringBuilder.append(str);
        stringBuilder.append("Host: ");
        stringBuilder.append(format);
        stringBuilder.append(str);
        l(stringBuilder);
        m(stringBuilder);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    private void l(StringBuilder stringBuilder) {
        for (Entry entry : this.eAi.getHeaders().entrySet()) {
            String str = (String) entry.getKey();
            for (String str2 : (List) entry.getValue()) {
                String str22;
                if (str22 == null) {
                    str22 = "";
                }
                stringBuilder.append(str);
                stringBuilder.append(": ");
                stringBuilder.append(str22);
                stringBuilder.append("\r\n");
            }
        }
    }

    private void m(StringBuilder stringBuilder) {
        String id = this.eAi.getId();
        if (id != null && id.length() != 0) {
            String password = this.eAi.getPassword();
            if (password == null) {
                password = "";
            }
            id = String.format("%s:%s", new Object[]{id, password});
            stringBuilder.append("Proxy-Authorization: Basic ");
            stringBuilder.append(b.encode(id));
            stringBuilder.append("\r\n");
        }
    }

    private void bfe() {
        InputStream inputStream = this.eAh.getInputStream();
        g(inputStream);
        h(inputStream);
    }

    private void g(InputStream inputStream) {
        String c = p.c(inputStream, "UTF-8");
        if (c == null || c.length() == 0) {
            throw new IOException("The response from the proxy server does not contain a status line.");
        }
        String[] split = c.split(" +", 3);
        StringBuilder stringBuilder;
        if (split.length >= 2) {
            if (!"200".equals(split[1])) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("The status code in the response from the proxy server is not '200 Connection established'. The status line is: ");
                stringBuilder.append(c);
                throw new IOException(stringBuilder.toString());
            }
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("The status line in the response from the proxy server is badly formatted. The status line is: ");
        stringBuilder.append(c);
        throw new IOException(stringBuilder.toString());
    }

    private void h(InputStream inputStream) {
        while (true) {
            int i = 0;
            while (true) {
                int read = inputStream.read();
                if (read == -1) {
                    throw new EOFException("The end of the stream from the proxy server was reached unexpectedly.");
                } else if (read == 10) {
                    if (i == 0) {
                        return;
                    }
                } else if (read != 13) {
                    i++;
                } else {
                    read = inputStream.read();
                    if (read == -1) {
                        throw new EOFException("The end of the stream from the proxy server was reached unexpectedly after a carriage return.");
                    } else if (read != 10) {
                        i += 2;
                    } else if (i == 0) {
                        return;
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public String bff() {
        return this.ezt;
    }
}
