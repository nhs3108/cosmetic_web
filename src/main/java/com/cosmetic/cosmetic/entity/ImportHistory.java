package com.cosmetic.cosmetic.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "import_history")
public class ImportHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int importHistoryId;

    private int personInCharge;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public ImportHistory() {
    }

    public ImportHistory(int personInCharge, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.personInCharge = personInCharge;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getImportHistoryId() {
        return importHistoryId;
    }

    public void setImportHistoryId(int importHistoryId) {
        this.importHistoryId = importHistoryId;
    }

    public int getPersonInCharge() {
        return personInCharge;
    }

    public void setPersonInCharge(int personInCharge) {
        this.personInCharge = personInCharge;
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
