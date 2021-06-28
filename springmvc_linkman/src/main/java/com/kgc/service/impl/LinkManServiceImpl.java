package com.kgc.service.impl;

import com.kgc.mapper.LinkManMapper;
import com.kgc.pojo.LinkMan;
import com.kgc.service.LinkManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkManServiceImpl implements LinkManService {

    @Autowired
    private LinkManMapper linkManMapper;

    @Override
    public List<LinkMan> findAll() {
        return linkManMapper.findAll();
    }

    @Override
    public int addLinkMan(LinkMan linkMan) {
        return linkManMapper.addLinkMan(linkMan);
    }
}
