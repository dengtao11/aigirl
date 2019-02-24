package cn.aigirl.web.controller;

import cn.aigirl.demain.Employee;
import cn.aigirl.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class UserController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
   public AjaxResult login(@RequestBody Employee employee){
        if(employee.getName().equals("admin")&&employee.getPsw().equals("admin")){
            return AjaxResult.me().setMsg("登陆成功");
        }else {
            return AjaxResult.me().setSuccess(false).setMsg("登录失败");
        }
   }

}
