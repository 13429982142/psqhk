package com.kgc.controller;

import com.kgc.entry.Result;
import com.kgc.pojo.LinkMan;
import com.kgc.service.LinkManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/linkman")
public class LinkManController {

    @Autowired
    private LinkManService linkManService;

    @RequestMapping("/findAll")
    public Result findAll(){
        List<LinkMan> all = linkManService.findAll();
		System.out.println("我是你爹");
        return new Result(true,"查询成功",all);
    }

    @PostMapping("/addLinkMan")
    public Result addLinkMan(@RequestBody LinkMan linkMan){
        int i = linkManService.addLinkMan(linkMan);
        return new Result(true,"添加成功",i);
    }
}
