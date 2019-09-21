package com.cosmetic.cosmetic.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int promotion_id;

    private int discount;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;

    public Promotion() {
    }

    public Promotion(int promotion_id, int discount, LocalDateTime startTime,
                     LocalDateTime endTime, LocalDateTime created_at,
                     LocalDateTime updated_at) {
        this.promotion_id = promotion_id;
        this.discount = discount;
        this.startTime = startTime;
        this.endTime = endTime;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getPromotion_id() {
        return promotion_id;
    }

    public void setPromotion_id(int promotion_id) {
        this.promotion_id = promotion_id;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }
}
