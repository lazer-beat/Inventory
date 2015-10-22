package com.aincorp.inventory.dao.impl;

import com.aincorp.inventory.dao.EquipmentDAO;
import com.aincorp.inventory.model.Equipment;
import com.aincorp.inventory.persistence.HibernateUtil;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Алмаз on 10.10.2015.
 */
public class EquipmentDAOImpl implements EquipmentDAO {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(EquipmentDAOImpl.class);

    Session session = null;
    Transaction transaction = null;

    @Override
    public void saveEquipment(Equipment equipment) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.save(equipment);

            transaction.commit();

        } catch (RuntimeException e) {
            try {
                transaction.rollback();
            } catch (RuntimeException rbe) {
                logger.error("Couldn’t roll back transaction", rbe);
            }
            throw e;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
