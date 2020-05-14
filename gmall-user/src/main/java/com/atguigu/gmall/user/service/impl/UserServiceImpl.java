package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.atguigu.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * com.atguigu.gmall.user.service.impl
 *
 * @author cyz
 * @create 2020/05/13 20-46
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList = userMapper.selectAll();
        return umsMemberList;
    }

    @Override
    public int updateUser(UmsMember umsMember) {
        int row = userMapper.updateByPrimaryKeySelective(umsMember);
        return row;
    }

    @Override
    public int insertUser(UmsMember umsMember) {
        int row = userMapper.insertSelective(umsMember);
        return row;
    }

    @Override
    public int deleteUserById(String id) {
        int row = userMapper.deleteByPrimaryKey(id);
        return row;
    }

    @Override
    public UmsMember getUserById(String id) {
        UmsMember umsMember = userMapper.selectByPrimaryKey(id);
        return umsMember;
    }

    @Override
    public List<UmsMember> getUserByUserName(String username) {

        Example example = new Example(UmsMember.class);
        example.createCriteria().andLike("username", "%" + username + "%");

        List<UmsMember> umsMembers = userMapper.selectByExample(example);
        return umsMembers;
    }

    @Override
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByMemberId(String memberId) {


        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);

        List<UmsMemberReceiveAddress> UmsMemberReceiveAddressList = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);

        return UmsMemberReceiveAddressList;
    }


    @Override
    public int updateUmsMemberReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress) {
        int row = umsMemberReceiveAddressMapper.updateByPrimaryKeySelective(umsMemberReceiveAddress);
        return row;
    }

    @Override
    public int insertUmsMemberReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress) {
        int row = umsMemberReceiveAddressMapper.insertSelective(umsMemberReceiveAddress);
        return row;
    }

    @Override
    public int deleteUmsMemberReceiveAddressById(String id) {
        int row = umsMemberReceiveAddressMapper.deleteByPrimaryKey(id);
        return row;
    }

    @Override
    public UmsMemberReceiveAddress getUmsMemberReceiveAddressById(String id) {
        UmsMemberReceiveAddress msMemberReceiveAddress = umsMemberReceiveAddressMapper.selectByPrimaryKey(id);
        return msMemberReceiveAddress;
    }

    @Override
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByName(String name) {
        Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andLike("name", "%" + name + "%");

        List<UmsMemberReceiveAddress> msMemberReceiveAddresList = umsMemberReceiveAddressMapper.selectByExample(example);
        return msMemberReceiveAddresList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getAllUmsMemberReceiveAddress() {
        List<UmsMemberReceiveAddress> msMemberReceiveAddresList = umsMemberReceiveAddressMapper.selectAll();
        return msMemberReceiveAddresList;
    }
}
