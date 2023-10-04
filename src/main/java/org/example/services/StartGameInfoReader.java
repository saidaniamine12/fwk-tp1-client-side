package org.example.services;

import org.example.models.DefaultPlayer;
import org.example.models.DefaultSprite;
import org.example.models.StartGameInfo;

import java.io.IOException;
import java.io.ObjectInputStream;

public class StartGameInfoReader {

    public StartGameInfoReader() {
    }

    public static StartGameInfo readStartGameInfo(ObjectInputStream objectInputStream) {

        try {

            return (StartGameInfo) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static DefaultPlayer readPlayer(ObjectInputStream objectInputStream) {

        try {

            return (DefaultPlayer) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static DefaultSprite readSprite(ObjectInputStream objectInputStream) {

        try {

            return (DefaultSprite) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }

    }


}
