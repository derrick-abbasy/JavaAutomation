package com.example.pages;

import java.net.URI;
import java.net.URISyntaxException;
import javax.websocket.ContainerProvider;
import javax.websocket.WebSocketContainer;
import javax.websocket.Session;
import javax.websocket.ClientEndpoint;
import javax.websocket.OnOpen;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.DeploymentException;
import java.io.IOException;

@ClientEndpoint
public class WebSocketClientTest {

    private Session session;

    @OnOpen
    public void onOpen(Session session) {
        this.session = session;
        System.out.println("Connected to WebSocket server");
        try {
            session.getBasicRemote().sendText("Hello, WebSocket server!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @OnClose
    public void onClose() {
        System.out.println("Disconnected from WebSocket server");
    }

    @OnMessage
    public void onMessage(String message) {
        System.out.println("Received message: " + message);
    }

    public static void main(String[] args) {
        WebSocketContainer container = ContainerProvider.getWebSocketContainer();
      
        String uri = "ws://localhost:64327/devtools/browser/f925ad8b-4757-4f40-93f7-66d3d339b6f4";

        try {
            container.connectToServer(WebSocketClientTest.class, new URI(uri));
        } catch (URISyntaxException | DeploymentException | IOException e) {
            e.printStackTrace();
        }
    }
}
