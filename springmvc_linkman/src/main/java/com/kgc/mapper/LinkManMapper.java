package com.kgc.mapper;

import com.kgc.pojo.LinkMan;
import org.springframework.stereotype.Component;

import java.util.List;

public interface LinkManMapper {
    List<LinkMan> findAll();

    int addLinkMan(LinkMan linkMan);
}
