package org.jmrtd.lds;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractLDSInfo implements LDSElement {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -2340098256249194537L;

    public abstract void f(OutputStream outputStream);

    public byte[] getEncoded() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            f(byteArrayOutputStream);
            byteArrayOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            eNz.log(Level.WARNING, "Exception: ", e);
            return null;
        }
    }
}
