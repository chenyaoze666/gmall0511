package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * com.atguigu.gmall.user.service
 *
 * @author cyz
 * @create 2020/05/13 20-45
 */
public interface UserService {

    List<UmsMember> getAllUser();

    int updateUser(UmsMember umsMember);

    int insertUser(UmsMember umsMember);

    int deleteUserById(String id);

    UmsMember getUserById(String id);

    List<UmsMember> getUserByUserName(String username);

    List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByMemberId(String memberId);

    int updateUmsMemberReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress);

    int insertUmsMemberReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress);

    int deleteUmsMemberReceiveAddressById(String id);

    UmsMemberReceiveAddress getUmsMemberReceiveAddressById(String id);

    List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByName(String name);

    List<UmsMemberReceiveAddress> getAllUmsMemberReceiveAddress();
}
