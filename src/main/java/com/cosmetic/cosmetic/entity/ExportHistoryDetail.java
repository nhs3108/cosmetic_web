package com.cosmetic.cosmetic.entity;

import javax.persistence.*;

@Entity
@Table(name = "export_details")
public class ExportHistoryDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int export_detail_id;

    private int export_history_id;

    private int product_id;

    private int quantity;

    private int price;

    public ExportHistoryDetail() {
    }

    public ExportHistoryDetail(int export_history_id,
                               int product_id, int quantity, int price) {
        this.export_history_id = export_history_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.price = price;
    }

    public int getExport_detail_id() {
        return export_detail_id;
    }

    public void setExport_detail_id(int export_detail_id) {
        this.export_detail_id = export_detail_id;
    }

    public int getExport_history_id() {
        return export_history_id;
    }

    public void setExport_history_id(int export_history_id) {
        this.export_history_id = export_history_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
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
