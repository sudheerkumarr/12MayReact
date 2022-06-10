package com.example.service;

import java.util.List;

import com.example.entity.Address;

public interface IAddressService {

	Address addAddress(Address addr);
	Address deleteAddressById(int addrId);
	Address updateAddress(Address addr);
	List<Address> getAllAddresses();
	Address getAddressById(int addrId);
	List<Address> getAddressByEmployeeId(int empId);
	
}
