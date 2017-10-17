/**
 * 
 */
package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import entry.Student;
import service.StudentService;

/**
 * @title  UserController
 * @author Administrator
 * @date   2017年8月31日上午11:00:05
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	public StudentService studentService;
     
   @RequestMapping("/nameInfo")
   public String getName(Model model){
     model.addAttribute("name","张三");
     return "index";
   }
   
   @RequestMapping(value="/stuInfo",method=RequestMethod.GET)
   @ResponseBody
   public List<Student> getInfo(){
	   List<Student> list = studentService.queryAll();
	   
	   
	   return list;
   }
   
}
