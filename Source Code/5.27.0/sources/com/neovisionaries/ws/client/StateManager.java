package com.neovisionaries.ws.client;

class StateManager {
    private WebSocketState eAH = WebSocketState.CREATED;
    private CloseInitiator eAI = CloseInitiator.NONE;

    enum CloseInitiator {
        NONE,
        SERVER,
        CLIENT
    }

    public WebSocketState bfu() {
        return this.eAH;
    }

    public void b(WebSocketState webSocketState) {
        this.eAH = webSocketState;
    }

    public void a(CloseInitiator closeInitiator) {
        this.eAH = WebSocketState.CLOSING;
        if (this.eAI == CloseInitiator.NONE) {
            this.eAI = closeInitiator;
        }
    }

    public boolean bfv() {
        return this.eAI == CloseInitiator.SERVER;
    }
}
