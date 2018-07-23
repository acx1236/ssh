package com.ssh.dao;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MainDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void save() {
    }

    public void update() {
//        String sql = "update abframe_spc.device_apply_data set work_orderid = 1 where id = 0";
        String sql = "update test set name = 'update' where id = 1";
        SQLQuery sqlQuery = sessionFactory.getCurrentSession().createSQLQuery(sql);
        sqlQuery.executeUpdate();
    }

}