package com.waitou.towards.model.activity;

import com.to.aboomy.recycler_lib.Displayable;

/**
 * auth aboom
 * date 2018/7/10
 */
public class TextBean implements Displayable {

    public String title;

    public String info;

    @Override
    public int getItemType() {
        return 2;
    }
}
