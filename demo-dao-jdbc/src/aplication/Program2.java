package aplication;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		List<Department> list = new ArrayList<>();
		
		System.out.println("=== TEST 1: insert Department");
		Department department = new Department(null, "Programador");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		//departmentDao.insert(department);
		System.out.println("Insert successfully");
		
		System.out.println("\n=== TEST 2: update Department");
		department.setId(7);
		department.setNome("Dev junior");
		//departmentDao.update(department);
		System.out.println("Update successfully");
		
		System.out.println("\n=== TEST 3: delete Department");
		//departmentDao.deleteById(7);
		System.out.println("Deleted with successfully");
		
		System.out.println("\n=== TEST 4: findById department");
		department = departmentDao.findById(4);
		System.out.println(department);
		
		System.out.println("\n=== TEST 5: findAll department");
		list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}

	}

}
