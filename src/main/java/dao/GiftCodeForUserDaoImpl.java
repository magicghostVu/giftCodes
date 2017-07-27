package dao;

import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import config.ServerConfig;
import model.AbstractGiftCodeModel;
import model.GiftCodeForUser;
import model.sub_properties.GameItem;
import org.bson.Document;
import org.json.JSONArray;
import org.json.JSONObject;
import work.with.db.DatabaseConn;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by magic_000 on 28/07/2017.
 */
public class GiftCodeForUserDaoImpl implements GiftCodeForUserDao {
    private DatabaseConn databaseConn;
    static Gson gson = new Gson();

    @Override
    public GiftCodeForUser getGiftCodeForUserById(String id) {
        MongoCollection<Document> giftCodeUserColl = databaseConn.getCollection(ServerConfig.GIFT_CODE_FOR_USER_COLL);
        Document q = new Document();
        q.put("_id", id);
        Document res = giftCodeUserColl.find(q).limit(1).first();
        if(res!=null){
            return convertDocumentToGiftCodeForUser(res);
        }else{
            return null;
        }

    }

    @Override
    public boolean save(GiftCodeForUser giftCodeForUser) {




        return false;
    }


    public DatabaseConn getDatabaseConn() {
        return databaseConn;
    }

    public void setDatabaseConn(DatabaseConn databaseConn) {
        this.databaseConn = databaseConn;
    }


    private GiftCodeForUser convertDocumentToGiftCodeForUser(Document document) {
        JSONObject jsonObject = new JSONObject(document.toJson());
        JSONArray arrayItem = jsonObject.getJSONArray("gameItems");
        jsonObject.remove("gameItems");
        List<GameItem> gameItemList = IntStream.range(0, arrayItem.length())
                .mapToObj(arrayItem::getJSONObject).map(JSONObject::toString)
                .map(stringJson -> gson.fromJson(stringJson, GameItem.class)).collect(Collectors.toList());
        GiftCodeForUser giftCodeForUser = gson.fromJson(jsonObject.toString(), GiftCodeForUser.class);
        giftCodeForUser.setGameItems(gameItemList);
        return giftCodeForUser;
    }

}
