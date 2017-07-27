package model;

import model.sub_properties.GameItem;

import java.util.List;

/**
 * Created by Fresher on 27/07/2017.
 */
public class AbstractGiftCodeModel {

    // gift code will return to client
    private String _id;
    private List<GameItem> gameItems;
    private long lastModified;
    private int timesCanUsed;
    private int timesUsed;

    void update() {

    }


    boolean save() {
        return false;
    }

    String toJson() {
        return null;
    }


    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public List<GameItem> getGameItems() {
        return gameItems;
    }

    public void setGameItems(List<GameItem> gameItems) {
        this.gameItems = gameItems;
    }


    public long getLastModified() {
        return lastModified;
    }

    public void setLastModified(long lastModified) {
        this.lastModified = lastModified;
    }

    public int getTimesCanUsed() {
        return timesCanUsed;
    }

    public void setTimesCanUsed(int timesCanUsed) {
        this.timesCanUsed = timesCanUsed;
    }

    public int getTimesUsed() {
        return timesUsed;
    }

    public void setTimesUsed(int timesUsed) {
        this.timesUsed = timesUsed;
    }


}
