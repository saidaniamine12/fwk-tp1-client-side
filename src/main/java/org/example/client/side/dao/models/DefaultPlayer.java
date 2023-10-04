package org.example.client.side.dao.models;

import java.util.Map;

public class DefaultPlayer {

    private Long id;
    private String name;

    private Map<String,String> properties;

    public DefaultPlayer() {
    }

    public DefaultPlayer(Long id, String name, Map<String, String> properties) {
        this.id = id;
        this.name = name;
        this.properties = properties;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
