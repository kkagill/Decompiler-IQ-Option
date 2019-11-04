package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

final class j {
    private final Messenger acZ;
    private final an ada;

    j(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.acZ = new Messenger(iBinder);
            this.ada = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.ada = new an(iBinder);
            this.acZ = null;
        } else {
            String str = "Invalid interface descriptor: ";
            interfaceDescriptor = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", interfaceDescriptor.length() != 0 ? str.concat(interfaceDescriptor) : new String(str));
            throw new RemoteException();
        }
    }

    /* Access modifiers changed, original: final */
    public final void send(Message message) {
        Messenger messenger = this.acZ;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        an anVar = this.ada;
        if (anVar != null) {
            anVar.send(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
