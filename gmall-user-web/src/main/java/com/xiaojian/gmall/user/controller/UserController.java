package com.xiaojian.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xiaojian.gmall.bean.UmsMember;
import com.xiaojian.gmall.bean.UmsMemberReceiveAddress;
import com.xiaojian.gmall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Reference
    UserService userService;


//   查询所有的用户信息
    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
      List<UmsMember> umsMembers=  userService.getAllUser();
      return umsMembers;
    }

    //根据memberId查询对应的用户收货地址信息
    @RequestMapping("UmsMemberReceiveAddress")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getUmsAddressByMemberId(String memberId){

      List<UmsMemberReceiveAddress> umsMemberReceiveAddresses =  userService.getUmsMemberReceiveAddressByMemberId(memberId);
      return umsMemberReceiveAddresses;
    }


    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hellow yuzijun index";
    }
}
