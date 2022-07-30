package com.chunchun.twitchrecommend.entity.request;

import com.chunchun.twitchrecommend.entity.db.Item;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FavoriteRequestBody {
    @JsonProperty("favorite")
    private Item favoriteItem;

    public Item getFavoriteItem() {
        return favoriteItem;
    }

}
