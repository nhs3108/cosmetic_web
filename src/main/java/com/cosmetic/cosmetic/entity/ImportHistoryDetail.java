package com.cosmetic.cosmetic.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "import_details")
public class ImportHistoryDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int importDetailId;

    private int importHistoryId;

    private int productId;

    private int quantity;

    private int originalId;

    private int totalPrice;

    public ImportHistoryDetail() {
    }

    public ImportHistoryDetail(int importHistoryId, int productId, int quantity, int originalId, int totalPrice) {
        this.importHistoryId = importHistoryId;
        this.productId = productId;
        this.quantity = quantity;
        this.originalId = originalId;
        this.totalPrice = totalPrice;
    }

    public int getImportDetailId() {
        return importDetailId;
    }

    public void setImportDetailId(int importDetailId) {
        this.importDetailId = importDetailId;
    }

    public int getImportHistoryId() {
        return importHistoryId;
    }

    public void setImportHistoryId(int importHistoryId) {
        this.importHistoryId = importHistoryId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getOriginalId() {
        return originalId;
    }

    public void setOriginalId(int originalId) {
        this.originalId = originalId;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
