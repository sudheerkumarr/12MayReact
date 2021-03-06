package com.example.repository;

import java.util.List;

import com.example.entity.Address;
import com.example.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AddressRepositoryImpl implements IAddressRepository {

	@Override
	public Address addAddress(Address addr) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em= emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(addr);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		return addr;
		
	}

	@Override
	public Address deleteAddressById(int addrId) {

		return null;
	}

	@Override
	public Address updateAddress(Address addr) {
		
		return null;
	}

	@Override
	public List<Address> getAllAddresses() {
		
		return null;
	}

	@Override
	public Address getAddressById(int addrId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em= emf.createEntityManager();
		
		// Get address by id
		Address addr= em.find(Address.class, addrId);
		
		em.close();
		emf.close();
		
		return addr;
		
	}

	@Override
	public List<Address> getAddressByEmployeeId(int empId) {
		
		return null;
	}

}
