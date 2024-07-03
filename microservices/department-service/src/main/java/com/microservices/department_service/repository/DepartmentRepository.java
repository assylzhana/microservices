package com.microservices.department_service.repository;

import com.microservices.department_service.model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentRepository {
    private List<Department> departmentList = new ArrayList<>();

    public Department addDepartment(Department department){
        departmentList.add(department);
        return department;
    }

    public List<Department> findAll() {
        return departmentList;
    }

    public Department findById(Long id ){
        return departmentList
                .stream()
                .filter(department -> department.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
