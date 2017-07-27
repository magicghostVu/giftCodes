package model;

import com.google.gson.Gson;
import org.json.JSONObject;

/**
 * Created by magic_000 on 28/07/2017.
 */
public class GiftCodeForUser  extends AbstractGiftCodeModel {

    static Gson gson= new Gson();

    private int uid;

    @Override
    void update() {

    }

    @Override
    boolean save() {
        return false;
    }


    public String toJson(){
        return gson.toJson(this);
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

}
