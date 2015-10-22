package com.aincorp.inventory.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * Created by Алмаз on 18.10.2015.
 */
public class EquipmentSerialNumber implements Serializable {

    /**
     * Уникальный номер
     */
    private Long equipmentSerialNumberId;

    /**
     * Название серийного номера
     */
    private String equipmentSerialNumberName;

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

    public EquipmentSerialNumber() {
    }

    public EquipmentSerialNumber(Long equipmentSerialNumberId, String equipmentSerialNumberName, Boolean deletedState, Date createDate, Date editDate, Set<Equipment> equipments) {
        this.equipmentSerialNumberId = equipmentSerialNumberId;
        this.equipmentSerialNumberName = equipmentSerialNumberName;
        this.deletedState = deletedState;
        this.createDate = createDate;
        this.editDate = editDate;
        this.equipments = equipments;
    }

    public Long getEquipmentSerialNumberId() {
        return equipmentSerialNumberId;
    }

    public void setEquipmentSerialNumberId(Long equipmentSerialNumberId) {
        this.equipmentSerialNumberId = equipmentSerialNumberId;
    }

    public String getEquipmentSerialNumberName() {
        return equipmentSerialNumberName;
    }

    public void setEquipmentSerialNumberName(String equipmentSerialNumberName) {
        this.equipmentSerialNumberName = equipmentSerialNumberName;
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
