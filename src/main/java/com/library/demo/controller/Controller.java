package com.library.demo.controller;

import com.library.demo.model.Company;
import com.library.demo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;

@RestController
@RequestMapping(path = "/demo")
public class Controller {
    @Autowired
    CompanyRepository companyRepository;
    @PostMapping(path = "/add")
    public String Add(@RequestBody Company company){
        System.out.println("id:" + company.getId());
        System.out.println("name:" + company.getName());
        companyRepository.save(company);
        return "done";

    }
}
