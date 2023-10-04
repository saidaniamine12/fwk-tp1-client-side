package org.example.dao.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketMainServerDAO implements MainServerDAO{
    private ServerSocket serverSocket;


    public SocketMainServerDAO() {
        this.serverSocket = null;
    }

    public void start(String serverAddress,Integer port) throws IOException {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while (true){
                //wait for client connection (listen)
                Socket clientSocket = serverSocket.accept(); //establishes connection
                System.out.println("Connection established");
                //
                InputStream obj = clientSocket.getInputStream();
                DataInputStream dis = new DataInputStream(obj);
                String  message= (String) dis.readUTF();
                System.out.println("Message = " + message);

                //handle the client data in a separate thread

            }

        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public void onLoopReceiveModelChanged() {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                //TODO

            }
        });
        thread1.start();
    }

    public String write() {
        return null;
    }

    public void close() {

    }
}
