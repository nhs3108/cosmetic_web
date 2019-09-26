package com.cosmetic.cosmetic.entity;

import javax.persistence.*;

@Entity
@Table(name = "export_details")
public class ExportHistoryDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int exportDetailId;

    private int exportHistoryId;

    private int productId;

    private int quantity;

    private int price;

    public ExportHistoryDetail() {
    }

    public ExportHistoryDetail(int exportHistoryId, int productId, int quantity, int price) {
        this.exportHistoryId = exportHistoryId;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public int getExportDetailId() {
        return exportDetailId;
    }

    public void setExportDetailId(int exportDetailId) {
        this.exportDetailId = exportDetailId;
    }

    public int getExportHistoryId() {
        return exportHistoryId;
    }

    public void setExportHistoryId(int exportHistoryId) {
        this.exportHistoryId = exportHistoryId;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
