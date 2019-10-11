package com.xiaojian.gmall.service;

import com.xiaojian.gmall.bean.UmsMember;
import com.xiaojian.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByMemberId(String memberId);
}
