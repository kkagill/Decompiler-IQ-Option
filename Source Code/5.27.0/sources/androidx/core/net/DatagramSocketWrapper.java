package androidx.core.net;

import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketImpl;

class DatagramSocketWrapper extends Socket {

    private static class DatagramSocketImplWrapper extends SocketImpl {
        DatagramSocketImplWrapper(DatagramSocket datagramSocket, FileDescriptor fileDescriptor) {
            this.localport = datagramSocket.getLocalPort();
            this.fd = fileDescriptor;
        }

        /* Access modifiers changed, original: protected */
        public void accept(SocketImpl socketImpl) {
            throw new UnsupportedOperationException();
        }

        /* Access modifiers changed, original: protected */
        public int available() {
            throw new UnsupportedOperationException();
        }

        /* Access modifiers changed, original: protected */
        public void bind(InetAddress inetAddress, int i) {
            throw new UnsupportedOperationException();
        }

        /* Access modifiers changed, original: protected */
        public void close() {
            throw new UnsupportedOperationException();
        }

        /* Access modifiers changed, original: protected */
        public void connect(String str, int i) {
            throw new UnsupportedOperationException();
        }

        /* Access modifiers changed, original: protected */
        public void connect(InetAddress inetAddress, int i) {
            throw new UnsupportedOperationException();
        }

        /* Access modifiers changed, original: protected */
        public void create(boolean z) {
            throw new UnsupportedOperationException();
        }

        /* Access modifiers changed, original: protected */
        public InputStream getInputStream() {
            throw new UnsupportedOperationException();
        }

        /* Access modifiers changed, original: protected */
        public OutputStream getOutputStream() {
            throw new UnsupportedOperationException();
        }

        /* Access modifiers changed, original: protected */
        public void listen(int i) {
            throw new UnsupportedOperationException();
        }

        /* Access modifiers changed, original: protected */
        public void connect(SocketAddress socketAddress, int i) {
            throw new UnsupportedOperationException();
        }

        /* Access modifiers changed, original: protected */
        public void sendUrgentData(int i) {
            throw new UnsupportedOperationException();
        }

        public Object getOption(int i) {
            throw new UnsupportedOperationException();
        }

        public void setOption(int i, Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    DatagramSocketWrapper(DatagramSocket datagramSocket, FileDescriptor fileDescriptor) {
        super(new DatagramSocketImplWrapper(datagramSocket, fileDescriptor));
    }
}
