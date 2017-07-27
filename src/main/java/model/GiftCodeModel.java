package model;

import model.sub_properties.GameItem;

/**
 * Created by Fresher on 27/07/2017.
 */
public class GiftCodeModel extends AbstractModel {
    private String _id;
    private GameItem[] gameItems;

    @Override
    void update() {

    }

    @Override
    boolean save() {
        return false;
    }


    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public GameItem[] getGameItems() {
        return gameItems;
    }

    public void setGameItems(GameItem[] gameItems) {
        this.gameItems = gameItems;
    }
}
