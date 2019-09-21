package com.cosmetic.cosmetic.entity;

import javax.persistence.*;

@Entity
@Table(name = "promotion_product")
public class PromotionDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int promotion_product_id;

    private int promotion_id;

    private int product_id;

    public PromotionDetail() {
    }

    public PromotionDetail(int promotion_id, int product_id) {
        this.promotion_id = promotion_id;
        this.product_id = product_id;
    }

    public int getPromotion_product_id() {
        return promotion_product_id;
    }

    public void setPromotion_product_id(int promotion_product_id) {
        this.promotion_product_id = promotion_product_id;
    }

    public int getPromotion_id() {
        return promotion_id;
    }

    public void setPromotion_id(int promotion_id) {
        this.promotion_id = promotion_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
}
