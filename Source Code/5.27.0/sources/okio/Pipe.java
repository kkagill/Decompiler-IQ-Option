package okio;

import com.iqoption.dto.entity.position.Position;
import java.io.IOException;

public final class Pipe {
    final Buffer buffer = new Buffer();
    final long maxBufferSize;
    private final Sink sink = new PipeSink();
    boolean sinkClosed;
    private final Source source = new PipeSource();
    boolean sourceClosed;

    final class PipeSink implements Sink {
        final Timeout timeout = new Timeout();

        PipeSink() {
        }

        public void write(Buffer buffer, long j) {
            synchronized (Pipe.this.buffer) {
                if (Pipe.this.sinkClosed) {
                    throw new IllegalStateException(Position.STATUS_CLOSED);
                }
                while (j > 0) {
                    if (Pipe.this.sourceClosed) {
                        throw new IOException("source is closed");
                    }
                    long size = Pipe.this.maxBufferSize - Pipe.this.buffer.size();
                    if (size == 0) {
                        this.timeout.waitUntilNotified(Pipe.this.buffer);
                    } else {
                        long min = Math.min(size, j);
                        Pipe.this.buffer.write(buffer, min);
                        j -= min;
                        Pipe.this.buffer.notifyAll();
                    }
                }
            }
        }

        public void flush() {
            synchronized (Pipe.this.buffer) {
                if (Pipe.this.sinkClosed) {
                    throw new IllegalStateException(Position.STATUS_CLOSED);
                }
                if (Pipe.this.sourceClosed) {
                    if (Pipe.this.buffer.size() > 0) {
                        throw new IOException("source is closed");
                    }
                }
            }
        }

        public void close() {
            synchronized (Pipe.this.buffer) {
                if (Pipe.this.sinkClosed) {
                    return;
                }
                if (Pipe.this.sourceClosed) {
                    if (Pipe.this.buffer.size() > 0) {
                        throw new IOException("source is closed");
                    }
                }
                Pipe.this.sinkClosed = true;
                Pipe.this.buffer.notifyAll();
            }
        }

        public Timeout timeout() {
            return this.timeout;
        }
    }

    final class PipeSource implements Source {
        final Timeout timeout = new Timeout();

        PipeSource() {
        }

        public long read(Buffer buffer, long j) {
            synchronized (Pipe.this.buffer) {
                if (Pipe.this.sourceClosed) {
                    throw new IllegalStateException(Position.STATUS_CLOSED);
                }
                while (Pipe.this.buffer.size() == 0) {
                    if (Pipe.this.sinkClosed) {
                        return -1;
                    }
                    this.timeout.waitUntilNotified(Pipe.this.buffer);
                }
                long read = Pipe.this.buffer.read(buffer, j);
                Pipe.this.buffer.notifyAll();
                return read;
            }
        }

        public void close() {
            synchronized (Pipe.this.buffer) {
                Pipe.this.sourceClosed = true;
                Pipe.this.buffer.notifyAll();
            }
        }

        public Timeout timeout() {
            return this.timeout;
        }
    }

    public Pipe(long j) {
        if (j >= 1) {
            this.maxBufferSize = j;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("maxBufferSize < 1: ");
        stringBuilder.append(j);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final Source source() {
        return this.source;
    }

    public final Sink sink() {
        return this.sink;
    }
}
