package com.cosmetic.cosmetic.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "export_history")
public class ExportHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int exportHistoryId;

    private  int personInCharge;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public ExportHistory() {
    }

    public ExportHistory(int personInCharge, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.personInCharge = personInCharge;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getExportHistoryId() {
        return exportHistoryId;
    }

    public void setExportHistoryId(int exportHistoryId) {
        this.exportHistoryId = exportHistoryId;
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

