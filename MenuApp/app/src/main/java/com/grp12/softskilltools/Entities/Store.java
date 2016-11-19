package com.grp12.softskilltools.Entities;

/**
 * Created by mathiaslarsen on 18/11/2016.
 */

public class Store {
    private User user;
    private Purchase purchase;
    private AbstractItem item;
    private int qty;

    public Store(User user, Purchase purchase, AbstractItem item){
        this.purchase = purchase;
        this.user = user;
        this.item = item;

    }
    public void addToBasket(AbstractItem item, Purchase purchase, int qty){
        purchase.addItem(item,qty);
    }




}
