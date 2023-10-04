package org.example.client.side.client;

import org.example.client.side.models.SocketType;
import org.example.client.side.models.StartGameInfo;

public interface MainClientDAO {

    //creat socket and wait for client connection
    void start(String serverAddress,Integer port);

    //read from client and convert to string
    void onLoopReceiveModelChanged();

    StartGameInfo connect(SocketType socketType);

    // send MoveLEFT to server
    void sendMoveLeft(String message);

    //connection close
    void close();
}