package com.kgc.service;

import com.kgc.pojo.LinkMan;

import java.util.List;

public interface LinkManService {
    List<LinkMan> findAll();

    int addLinkMan(LinkMan linkMan);
}
