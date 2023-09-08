package com.example.lab4_20203651.Controladores;

import com.example.lab4_20203651.Entity.Employees;
import com.example.lab4_20203651.Repositories.EmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@Controller
public class employeesController {

    final EmployeeRepository employeeRepository;

    public employeesController(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    @RequestMapping(value = {"/lab4/employees","/"}, method = RequestMethod.GET)
    public String listarEmployees(Model model){
        List<Employees> listaEmployee = employeeRepository.listarEmployee();
        model.addAttribute("listaEmployee",listaEmployee);
        return "Employees";
    }

}
