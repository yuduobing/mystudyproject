package yun520.mybatis_pluscode.us.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yun520.mybatis_pluscode.us.entity.SysUser;
import yun520.mybatis_pluscode.us.mapper.UserDAO1;

import java.util.List;

@RestController
public class TestControl {
    @Autowired
    private UserDAO1 userDAO;

    @RequestMapping("/a")
    public  List<SysUser> test(){

        		List<SysUser> users = userDAO.selectList(null);
                return  users;
    }



}
