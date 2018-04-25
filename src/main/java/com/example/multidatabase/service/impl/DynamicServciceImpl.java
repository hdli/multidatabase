package com.example.multidatabase.service.impl;

import com.example.multidatabase.annotation.DS;
import com.example.multidatabase.mapper.DynamicDSMapper;
import com.example.multidatabase.service.DynamicServcice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lihuidong on 2018-4-26.
 */
@Service
public class DynamicServciceImpl implements DynamicServcice {

    @Autowired
    private DynamicDSMapper dynamicDSMapper;

    @DS()
    @Override
    public Integer ds1() {
        return dynamicDSMapper.queryJournal();
    }

    @DS(name = "logic")
    @Override
    public String ds2() {
        return dynamicDSMapper.queryUser();
    }

    @DS(name = "dao")
    @Override
    public String ds3() {
        return dynamicDSMapper.queryType();
    }
}
