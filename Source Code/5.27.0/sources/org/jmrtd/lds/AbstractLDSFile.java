package org.jmrtd.lds;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class AbstractLDSFile implements LDSFile {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -4908935713109830409L;

    public abstract void f(OutputStream outputStream);

    public abstract void r(InputStream inputStream);

    AbstractLDSFile() {
    }

    public byte[] getEncoded() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            f(byteArrayOutputStream);
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            eNz.log(Level.WARNING, "Exception", e);
            return null;
        }
    }
}
