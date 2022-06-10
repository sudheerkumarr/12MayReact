package com.example.service;

import java.util.List;

import com.example.entity.Address;
import com.example.repository.AddressRepositoryImpl;
import com.example.repository.IAddressRepository;

public class AddressServiceImpl implements IAddressService{
	
	IAddressRepository addrRepo = new AddressRepositoryImpl();

	@Override
	public Address addAddress(Address addr) {
		return addrRepo.addAddress(addr);
	}

	@Override
	public Address deleteAddressById(int addrId) {
		// search address
		Address addr = addrRepo.getAddressById(addrId);
		Address deletedAddr=null;
		if(addr!= null) {
		   // delete address
			deletedAddr = addrRepo.deleteAddressById(addrId);
		} 
		return deletedAddr; 
	}

	@Override
	public Address updateAddress(Address addr) {
		//search addr
		Address searchAddr = addrRepo.getAddressById(addr.getAddrId());
		Address updatedAddr = null;
		//update addr 
		if(searchAddr !=null) {
			updatedAddr = addrRepo.updateAddress(addr);
		}
		//  return updated address
		return updatedAddr;
	}

	@Override
	public List<Address> getAllAddresses() {
		
		return null;
	}

	@Override
	public Address getAddressById(int addrId) {
		
		return null;
	}

	@Override
	public List<Address> getAddressByEmployeeId(int empId) {
		
		return null;
	}

}
