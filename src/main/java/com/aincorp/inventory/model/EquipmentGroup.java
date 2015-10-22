package com.aincorp.inventory.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * Created by Алмаз on 17.10.2015.
 */
public class EquipmentGroup implements Serializable {

    /**
     * Уникальный номер
     */
    private Long equipmentGroupId;

    /**
     * Название группы
     */
    private String equipmentGroupName;

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

    public EquipmentGroup() {
    }

    public EquipmentGroup(Long equipmentGroupId, String equipmentGroupName, Boolean deletedState, Date createDate, Date editDate, Set<Equipment> equipments) {
        this.equipmentGroupId = equipmentGroupId;
        this.equipmentGroupName = equipmentGroupName;
        this.deletedState = deletedState;
        this.createDate = createDate;
        this.editDate = editDate;
        this.equipments = equipments;
    }

    public Long getEquipmentGroupId() {
        return equipmentGroupId;
    }

    public void setEquipmentGroupId(Long equipmentGroupId) {
        this.equipmentGroupId = equipmentGroupId;
    }

    public String getEquipmentGroupName() {
        return equipmentGroupName;
    }

    public void setEquipmentGroupName(String equipmentGroupName) {
        this.equipmentGroupName = equipmentGroupName;
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
