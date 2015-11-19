package com.nexb.shopr4.dataModel.View;

/**
 * Created by Christian on 14-11-2015.
 */
public class ShopListViewCategory extends ShopListViewContent {
    private String name;
    private final int CatId;

    public ShopListViewCategory(String name, int CatId) {
        this.name = name;
        this.CatId=CatId;
    }

    public int getCatId() {        return CatId;    }

    public String getName() {
        return name;
    }


    @Override
    public contentType getType() {
        return contentType.CATEGORY;
    }
}
