package com.ssh.service.impl;

import com.ssh.dao.MainDao;
import com.ssh.service.IMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class MainServiceImpl implements IMainService {

    @Autowired
    private MainDao mainDao;

    @Transactional
    @Override
    public void save() {
        mainDao.save();
        System.err.println("save");
    }

    @Transactional
    @Override
    public void update() {
        mainDao.update();
        System.err.println("update");
    }

}
