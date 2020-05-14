package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * com.atguigu.gmall.user.controller
 *
 * @author cyz
 * @create 2020/05/13 20-45
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("updateUser")
    @ResponseBody
    public int updateUser(@RequestBody UmsMember umsMember){
        return userService.updateUser(umsMember);
    }


    @RequestMapping("insertUser")
    @ResponseBody
    public int insertUser(@RequestBody UmsMember umsMember){
        return userService.insertUser(umsMember);
    }

    @RequestMapping("deleteUserById")
    @ResponseBody
    public int deleteUserById(String id){
        return userService.deleteUserById(id);
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }

    @RequestMapping("getUserById")
    @ResponseBody
    public UmsMember getUserById(String id){
        UmsMember umsMember = userService.getUserById(id);
        return umsMember;
    }

    @RequestMapping("getUserByUserName")
    @ResponseBody
    public List<UmsMember> getUserByUserName(String username){
        List<UmsMember> umsMembers = userService.getUserByUserName(username);
        return umsMembers;
    }

    @RequestMapping("getUmsMemberReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = userService.getUmsMemberReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddressList;
    }


    @RequestMapping("updateUmsMemberReceiveAddress")
    @ResponseBody
    public int updateUmsMemberReceiveAddress(@RequestBody UmsMemberReceiveAddress umsMemberReceiveAddress){
        return userService.updateUmsMemberReceiveAddress(umsMemberReceiveAddress);
    }


    @RequestMapping("insertUmsMemberReceiveAddress")
    @ResponseBody
    public int insertUmsMemberReceiveAddress(@RequestBody UmsMemberReceiveAddress umsMemberReceiveAddress){
        return userService.insertUmsMemberReceiveAddress(umsMemberReceiveAddress);
    }

    @RequestMapping("deleteUmsMemberReceiveAddressById")
    @ResponseBody
    public int deleteUmsMemberReceiveAddressById(String id){
        return userService.deleteUmsMemberReceiveAddressById(id);
    }

    @RequestMapping("getAllUmsMemberReceiveAddress")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getAllUmsMemberReceiveAddress(){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getAllUmsMemberReceiveAddress();
        return umsMemberReceiveAddresses;
    }

    @RequestMapping("getUmsMemberReceiveAddressById")
    @ResponseBody
    public UmsMemberReceiveAddress getUmsMemberReceiveAddressById(String id){
        UmsMemberReceiveAddress umsMemberReceiveAddress = userService.getUmsMemberReceiveAddressById(id);
        return umsMemberReceiveAddress;
    }

    @RequestMapping("getUmsMemberReceiveAddressByName")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getUserByUmsMemberReceiveAddressName(String name){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getUmsMemberReceiveAddressByName(name);
        return umsMemberReceiveAddresses;
    }




    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }
}
