package com.aincorp.inventory.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * Created by Алмаз on 18.10.2015.
 */
public class EquipmentProductName implements Serializable {

    /**
     * Уникальный номер
     */
    private Long equipmentProductNameId;

    /**
     * Имя продукта
     */
    private String productName;

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

    public EquipmentProductName() {
    }

    public EquipmentProductName(Long equipmentProductNameId, String productName, Boolean deletedState, Date createDate, Date editDate, Set<Equipment> equipments) {
        this.equipmentProductNameId = equipmentProductNameId;
        this.productName = productName;
        this.deletedState = deletedState;
        this.createDate = createDate;
        this.editDate = editDate;
        this.equipments = equipments;
    }

    public Long getEquipmentProductNameId() {
        return equipmentProductNameId;
    }

    public void setEquipmentProductNameId(Long equipmentProductNameId) {
        this.equipmentProductNameId = equipmentProductNameId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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
