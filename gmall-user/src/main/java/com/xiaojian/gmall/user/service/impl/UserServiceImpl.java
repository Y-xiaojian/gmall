package com.xiaojian.gmall.user.service.impl;

import com.xiaojian.gmall.bean.UmsMember;
import com.xiaojian.gmall.bean.UmsMemberReceiveAddress;
import com.xiaojian.gmall.service.UserService;
import com.xiaojian.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.xiaojian.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Override
    public List<UmsMember> getAllUser() {
     List<UmsMember> umsMemberList= userMapper.selectAll();// userMapper.selectAllUser();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByMemberId(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setId(memberId);

        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddressList;
    }
}
