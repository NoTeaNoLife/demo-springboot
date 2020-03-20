package com.baldyoung.demospringboot.service;

import com.baldyoung.demospringboot.common.dao.Z_TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class Z_TestServiceImpl {
    @Autowired
    private Z_TestDao z_testDao;

    public Map getCreateDBSQL() {
        return z_testDao.showDataBaseCreateSQL();
    }
}
