package com.cosmetic.cosmetic.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "import_details")
public class ImportHistoryDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int import_detail_id;

    private int import_history_id;

    private int product_id;

    private int quantity;

    private int original_id;

    private int total_price;

    public ImportHistoryDetail() {
    }

    public ImportHistoryDetail(int import_history_id,
                               int product_id,
                               int quantity,
                               int original_id,
                               int total_price) {
        this.import_history_id = import_history_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.original_id = original_id;
        this.total_price = total_price;
    }

    public int getImport_detail_id() {
        return import_detail_id;
    }

    public void setImport_detail_id(int import_detail_id) {
        this.import_detail_id = import_detail_id;
    }

    public int getImport_history_id() {
        return import_history_id;
    }

    public void setImport_history_id(int import_history_id) {
        this.import_history_id = import_history_id;
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

    public int getOriginal_id() {
        return original_id;
    }

    public void setOriginal_id(int original_id) {
        this.original_id = original_id;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }
}
