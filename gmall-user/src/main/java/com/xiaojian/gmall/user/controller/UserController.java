package com.xiaojian.gmall.user.controller;

import com.xiaojian.gmall.user.bean.UmsMember;
import com.xiaojian.gmall.user.bean.UmsMemberReceiveAddress;
import com.xiaojian.gmall.user.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
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
