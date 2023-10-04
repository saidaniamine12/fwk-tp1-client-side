package org.example.client.side.models;

import java.util.Map;

public class DefaultSprite {
    private Long id;

    private String kind;
    private String name;

    private String Location;

    private String direction;

    private Long playerId;

    private Map<String,String> map;

    public DefaultSprite() {
    }

    public DefaultSprite(Long id, String kind, String name, String location, String direction, Long playerId, Map<String, String> map) {
        this.id = id;
        this.kind = kind;
        this.name = name;
        Location = location;
        this.direction = direction;
        this.playerId = playerId;
        this.map = map;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
