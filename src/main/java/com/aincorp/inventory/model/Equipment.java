package com.aincorp.inventory.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Алмаз on 17.10.2015.
 */
public class Equipment implements Serializable {

    /**
     * Уникальный номер
     */
    private Long equipmentId;

    /**
     * Группа
     */
    private EquipmentGroup equipmentGroup;

    /**
     * Наименование
     */
    private EquipmentProductName equipmentProductName;

    /**
     * Срок амортизации
     */
    private Date depreciationPeriod;

    /**
     * Иннв./сер. номер
     */
    private EquipmentSerialNumber equipmentSerialNumber;

    /**
     * Состояние
     */
    private EquipmentState equipmentState;

    /**
     * Количество
     */
    private Long quantity;

    /**
     * Примечание
     */
    private String description;

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

    public Equipment() {
    }

    public Equipment(EquipmentGroup equipmentGroup, EquipmentProductName equipmentProductName, Date depreciationPeriod, EquipmentSerialNumber equipmentSerialNumber, EquipmentState equipmentState, Long quantity, String description, Boolean deletedState, Date createDate, Date editDate) {
        this.equipmentGroup = equipmentGroup;
        this.equipmentProductName = equipmentProductName;
        this.depreciationPeriod = depreciationPeriod;
        this.equipmentSerialNumber = equipmentSerialNumber;
        this.equipmentState = equipmentState;
        this.quantity = quantity;
        this.description = description;
        this.deletedState = deletedState;
        this.createDate = createDate;
        this.editDate = editDate;
    }

    public Long getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Long equipmentId) {
        this.equipmentId = equipmentId;
    }

    public EquipmentGroup getEquipmentGroup() {
        return equipmentGroup;
    }

    public void setEquipmentGroup(EquipmentGroup equipmentGroup) {
        this.equipmentGroup = equipmentGroup;
    }

    public EquipmentProductName getEquipmentProductName() {
        return equipmentProductName;
    }

    public void setEquipmentProductName(EquipmentProductName equipmentProductName) {
        this.equipmentProductName = equipmentProductName;
    }

    public Date getDepreciationPeriod() {
        return depreciationPeriod;
    }

    public void setDepreciationPeriod(Date depreciationPeriod) {
        this.depreciationPeriod = depreciationPeriod;
    }

    public EquipmentSerialNumber getEquipmentSerialNumber() {
        return equipmentSerialNumber;
    }

    public void setEquipmentSerialNumber(EquipmentSerialNumber equipmentSerialNumber) {
        this.equipmentSerialNumber = equipmentSerialNumber;
    }

    public EquipmentState getEquipmentState() {
        return equipmentState;
    }

    public void setEquipmentState(EquipmentState equipmentState) {
        this.equipmentState = equipmentState;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
}
