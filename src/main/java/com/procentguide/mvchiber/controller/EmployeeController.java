package com.procentguide.mvchiber.controller;

import com.procentguide.mvchiber.dao.EmployeeDAO;
import com.procentguide.mvchiber.entity.Employee;
import com.procentguide.mvchiber.service.EmloyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class EmployeeController {

    @Autowired
    private EmloyeeService emloyeeService;

    @RequestMapping("/")
    public String showAllEmps(Model model){

        List<Employee> allEmps = emloyeeService.getAllEmployees();
        model.addAttribute("allEmps",allEmps);

        return "all-employees";
    }

    @RequestMapping("/addEmployee")
    public String addNewEmployee(Model model){

        Employee employee = new Employee();
        model.addAttribute("employee",employee);

        return "employee-info";
    }


    @RequestMapping("/saveEmployee")
    public String saveEmp(@ModelAttribute("employee") Employee employee){

        emloyeeService.saveEmployee(employee);
        return "redirect:/";
    }

    @RequestMapping("updateInfo")
    public String updateEmp(@RequestParam("empId") int id,Model model ){

        Employee employee = emloyeeService.getEmp(id);
        model.addAttribute("employee",employee);
        return "employee-info";

    }

    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("empId") int id){

        emloyeeService.deleteEmployee(id);

        return "redirect:/";

    }


}
