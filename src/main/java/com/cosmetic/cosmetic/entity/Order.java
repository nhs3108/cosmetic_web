package com.cosmetic.cosmetic.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderdId;

    private int userId;

    private String status;

    private String comment;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public Order() {
    }

    public Order(int userId, String status, String comment, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.userId = userId;
        this.status = status;
        this.comment = comment;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getOrderdId() {
        return orderdId;
    }

    public void setOrderdId(int orderdId) {
        this.orderdId = orderdId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
