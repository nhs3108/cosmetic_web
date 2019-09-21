package com.cosmetic.cosmetic.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "export_history")
public class ExportHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int export_history_id;

    private  int preson_in_charge;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;

    public ExportHistory() {
    }

    public ExportHistory(int preson_in_charge,
                         LocalDateTime created_at,
                         LocalDateTime updated_at) {
        this.preson_in_charge = preson_in_charge;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getExport_history_id() {
        return export_history_id;
    }

    public void setExport_history_id(int export_history_id) {
        this.export_history_id = export_history_id;
    }

    public int getPreson_in_charge() {
        return preson_in_charge;
    }

    public void setPreson_in_charge(int preson_in_charge) {
        this.preson_in_charge = preson_in_charge;
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
