package dao;

import model.GiftCodeModel;

/**
 * Created by Fresher on 27/07/2017.
 */
public interface GiftCodeDAO {

    //
    GiftCodeModel getGiftCodeById(String Id);

    boolean save(GiftCodeModel giftCodeModel);

}
