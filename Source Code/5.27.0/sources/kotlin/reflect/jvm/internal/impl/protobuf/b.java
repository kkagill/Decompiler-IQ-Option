package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: AbstractParser */
public abstract class b<MessageType extends n> implements p<MessageType> {
    private static final f fpD = f.bKV();

    private UninitializedMessageException a(MessageType messageType) {
        if (messageType instanceof a) {
            return ((a) messageType).bKi();
        }
        return new UninitializedMessageException(messageType);
    }

    private MessageType b(MessageType messageType) {
        if (messageType == null || messageType.isInitialized()) {
            return messageType;
        }
        throw a(messageType).bLO().g(messageType);
    }

    public MessageType a(d dVar, f fVar) {
        n nVar;
        try {
            e bKo = dVar.bKo();
            nVar = (n) b(bKo, fVar);
            bKo.lT(0);
            return nVar;
        } catch (InvalidProtocolBufferException e) {
            throw e.g(nVar);
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    /* renamed from: b */
    public MessageType c(d dVar, f fVar) {
        return b(a(dVar, fVar));
    }

    public MessageType f(InputStream inputStream, f fVar) {
        e n = e.n(inputStream);
        n nVar = (n) b(n, fVar);
        try {
            n.lT(0);
            return nVar;
        } catch (InvalidProtocolBufferException e) {
            throw e.g(nVar);
        }
    }

    /* renamed from: g */
    public MessageType k(InputStream inputStream, f fVar) {
        return b(f(inputStream, fVar));
    }

    /* renamed from: l */
    public MessageType m(InputStream inputStream) {
        return k(inputStream, fpD);
    }

    public MessageType h(InputStream inputStream, f fVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return f(new a(inputStream, e.a(read, inputStream)), fVar);
        } catch (IOException e) {
            throw new InvalidProtocolBufferException(e.getMessage());
        }
    }

    /* renamed from: i */
    public MessageType j(InputStream inputStream, f fVar) {
        return b(h(inputStream, fVar));
    }
}
