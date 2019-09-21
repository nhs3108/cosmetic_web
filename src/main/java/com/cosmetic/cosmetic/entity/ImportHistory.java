package com.cosmetic.cosmetic.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "import_history")
public class ImportHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int import_history_id;

    private int person_in_charge;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;

    public ImportHistory() {
    }

    public ImportHistory(int person_in_charge,
                         LocalDateTime created_at,
                         LocalDateTime updated_at) {
        this.person_in_charge = person_in_charge;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getImport_history_id() {
        return import_history_id;
    }

    public void setImport_history_id(int import_history_id) {
        this.import_history_id = import_history_id;
    }

    public int getPerson_in_charge() {
        return person_in_charge;
    }

    public void setPerson_in_charge(int person_in_charge) {
        this.person_in_charge = person_in_charge;
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
