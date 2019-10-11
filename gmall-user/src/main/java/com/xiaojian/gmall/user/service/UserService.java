package com.xiaojian.gmall.user.service;

import com.xiaojian.gmall.user.bean.UmsMember;
import com.xiaojian.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByMemberId(String memberId);
}
