package com.aincorp.inventory.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * Created by Алмаз on 18.10.2015.
 */
public class EquipmentState implements Serializable {

    /**
     * Уникальный номер
     */
    private Long equipmentStateId;

    /**
     * Наименование состояния
     */
    private String equipmentSateName;

    /**
     * Метка удаления
     */
    private Boolean deletedState;

    /**
     * Дата создания
     */
    private Date createDate;

    /**
     * Дата редактирования
     */
    private Date editDate;

    private Set<Equipment> equipments;

    public EquipmentState() {
    }

    public EquipmentState(Long equipmentStateId, String equipmentSateName, Boolean deletedState, Date createDate, Date editDate, Set<Equipment> equipments) {
        this.equipmentStateId = equipmentStateId;
        this.equipmentSateName = equipmentSateName;
        this.deletedState = deletedState;
        this.createDate = createDate;
        this.editDate = editDate;
        this.equipments = equipments;
    }

    public Long getEquipmentStateId() {
        return equipmentStateId;
    }

    public void setEquipmentStateId(Long equipmentStateId) {
        this.equipmentStateId = equipmentStateId;
    }

    public String getEquipmentSateName() {
        return equipmentSateName;
    }

    public void setEquipmentSateName(String equipmentSateName) {
        this.equipmentSateName = equipmentSateName;
    }

    public Boolean getDeletedState() {
        return deletedState;
    }

    public void setDeletedState(Boolean deletedState) {
        this.deletedState = deletedState;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getEditDate() {
        return editDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public Set<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(Set<Equipment> equipments) {
        this.equipments = equipments;
    }
}
