package com.cosmetic.cosmetic.entity;

import javax.persistence.*;

@Entity
@Table(name = "promotion_product")
public class PromotionDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int promotionProductId;

    private int promotionId;

    private int productId;

    public PromotionDetail() {
    }

    public PromotionDetail(int promotionId, int productId) {
        this.promotionId = promotionId;
        this.productId = productId;
    }

    public int getPromotionProductId() {
        return promotionProductId;
    }

    public void setPromotionProductId(int promotionProductId) {
        this.promotionProductId = promotionProductId;
    }

    public int getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(int promotionId) {
        this.promotionId = promotionId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
