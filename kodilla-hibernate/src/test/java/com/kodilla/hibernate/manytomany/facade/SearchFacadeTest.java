package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SearchFacadeTest {

    @Autowired
    private SearchFacade searchFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testSearchCompaniesAndEmployees() {
        // Given
        Employee johnSmith = new Employee("John", "Smith");
        Company softwareMachine = new Company("Software Machine");
        johnSmith.getCompanies().add(softwareMachine);
        softwareMachine.getEmployees().add(johnSmith);
        companyDao.save(softwareMachine);
        employeeDao.save(johnSmith);

        // When
        List<Company> companies = searchFacade.findCompaniesByFragment("Soft");
        List<Employee> employees = searchFacade.findEmployeesByFragment("Smith");

        // Then
        assertEquals(17, companies.size());
        assertEquals(18, employees.size());

        // Cleanup
        try {
            companyDao.delete(softwareMachine);
            employeeDao.delete(johnSmith);
        } catch (Exception e) {
            // do nothing
        }
    }
}