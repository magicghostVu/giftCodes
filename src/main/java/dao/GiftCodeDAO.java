package dao;

import model.AbstractGiftCodeModel;

/**
 * Created by Fresher on 27/07/2017.
 */
public interface GiftCodeDAO {

    //
    AbstractGiftCodeModel getGiftCodeById(String Id);

    boolean save(AbstractGiftCodeModel giftCodeModel);

}
