package aplication;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		System.out.println("=== TEST 1: seller findbyId ====");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment");
		
		Department department = new Department(2, null);
		
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: seller findAll");
		list = sellerDao.findAll();
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		/*System.out.println("\n=== TEST 4: seller insert");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Very well! Row affected: " + newSeller.getId());
		
		System.out.println("\n=== TEST 5: seller update");
		seller = sellerDao.findById(1);
		seller.setNome("Thomas Shelby");
		sellerDao.update(seller);
		System.out.println("Atualizado!");*/
		
		System.out.println("\n=== TEST 6: seller delete");
		int id = 12;
		sellerDao.deleteById(id); 
		System.out.println("Id affected: " + id);
	}

}
