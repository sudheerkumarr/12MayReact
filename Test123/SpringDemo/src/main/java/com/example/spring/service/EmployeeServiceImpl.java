package com.example.spring.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.dto.AddressDto;
import com.example.spring.dto.EmpDto;
import com.example.spring.dto.RegRespDto;
import com.example.spring.dto.RegisterDto;
import com.example.spring.entity.Address;
import com.example.spring.entity.Employee;
import com.example.spring.entity.Login;
import com.example.spring.entity.Skill;
import com.example.spring.exception.EmployeeFoundException;
import com.example.spring.exception.EmployeeNotFoundException;
import com.example.spring.repository.IEmployeeRepository;
import com.example.spring.repository.ILoginRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeRepository empRepo;
	
	@Autowired
	ILoginRepository loginRepo;

	private static Logger logger = LogManager.getLogger();

	@Override
	public List<Employee> getAllEmployees() {
		logger.debug("Calling empRepo findAll() method");
		return empRepo.findAll();
	}

	@Override
	public Employee getEmpById(int empId) throws EmployeeNotFoundException {
		logger.info("Sending get request to repository...");
		Optional<Employee> emp = empRepo.findById(empId);

		if (emp.isPresent()) {
			logger.info("Received emp from db");
			logger.info("Returning emp to controller");
			return emp.get();
		} else {
			logger.info("Failed to get emp from db");
			throw new EmployeeNotFoundException("Employee not found with emp id " + empId);
		}

	}

	@Override
	public Employee addEmployee(Employee emp) {
		return empRepo.save(emp);
	}

	@Override
	public Employee updateEmployeeById(int empId, Employee emp) throws EmployeeNotFoundException {
		// find emp based on id
		Optional<Employee> dbEmp = empRepo.findById(empId);

		// if emp present, update emp with new details else return exception/null
		if (dbEmp.isPresent()) {
			return empRepo.save(emp);
		} else {
			throw new EmployeeNotFoundException("Employee not found with emp id " + empId);
		}
	}

	@Override
	public Employee deleteEmployee(int empId) {
		// find emp based on emp id
		Optional<Employee> emp = empRepo.findById(empId);

		// delete emp if present else return null or throw exception
		if (emp.isPresent()) {
			empRepo.deleteById(empId);
		} else {
			return null;
		}
		// return emp
		return emp.get();
	}

	// update emp name
	@Override
	public Employee updateEmployeeName(int empId, String newName) {
		// find emp by id
		Optional<Employee> emp = empRepo.findById(empId); // 2, Shiva
		if (emp.isPresent()) {
			// update name
			Employee dbEmp = emp.get();
			dbEmp.setEmpName(newName);
			return empRepo.save(dbEmp);
		} else {
			// if emp not found in db, return null or throw exception
			return null;
		}

	}

	// Update emp address
	@Override
	public Employee updateEmpAddr(int empId, Address newAddr) {
		// find emp
		Optional<Employee> emp = empRepo.findById(empId);
		if (emp.isPresent()) {
			// update addr
			// get emp from optional container
			Employee dbEmp = emp.get();

			// add new addr to the existing emp
			dbEmp.getAddress().add(newAddr);
			System.out.println();

			// update emp details in db
			return empRepo.save(dbEmp);
		} else {
			return null;
		}
	}

	// Update employee skills
	@Override
	public Employee updateEmpSkill(int empId, Skill skill) {
		Optional<Employee> emp = empRepo.findById(empId);
		if (emp.isPresent()) {
			// update skills
			Employee dbEmp = emp.get();
			dbEmp.getSkills().add(skill);
			return empRepo.save(dbEmp);
		} else {
			return null;
		}
	}

	@Override
	public List<Employee> getEmpByName(String empName) {

		return empRepo.findByEmpName(empName);
	}

	@Override
	public List<Employee> getEmpBySalary(double salary) {
		return empRepo.findBySalary(salary);
	}

	@Override
	public List<Employee> getEmpBySalaryGreaterThan(double salary) {
		return empRepo.findBySalaryGreaterThan(salary);
	}

	@Override
	public List<Employee> getEmpByDob(LocalDate dob) {
		return empRepo.getEmpByDob(dob);
	}

	@Override
	public List<Skill> getEmpSkills() {
		// logic to fetch emp skill
		return null;
	}

	@Override
	public Employee updateEmpDob(int empId, LocalDate date) throws EmployeeNotFoundException {
		Optional<Employee> emp = empRepo.findById(empId);
		if (emp.isPresent()) {
			// update date of birth
			Employee dbEmp = emp.get();
			dbEmp.setDob(date);
			return empRepo.save(dbEmp);
		} else {
			throw new EmployeeNotFoundException("Employee not found with id: " + empId);
		}

	}

	@Override
	public EmpDto getEmpDtoById(int empId) throws EmployeeNotFoundException {
		logger.info("Sending get request to repository...");
		Optional<Employee> empOpt = empRepo.findById(empId);

		if (empOpt.isPresent()) {
			logger.info("Received emp from db");
			logger.info("Returning emp to controller");
			Employee emp = empOpt.get();
			// convert emp to empDto obj
			EmpDto empDto = new EmpDto();
			empDto.setEmpId(emp.getEmpId());
			empDto.setEmpName(emp.getEmpName());
			empDto.setSalary(emp.getSalary());
			empDto.setDob(emp.getDob());
			empDto.setEmail(emp.getLogin().getEmail());
			return empDto;
		} else {
			logger.info("Failed to get emp from db");
			throw new EmployeeNotFoundException("Employee not found with emp id " + empId);
		}

	}

	@Override
	public EmpDto updateEmpDtoById(int empId, EmpDto empDto) throws EmployeeNotFoundException {
		// find emp based on id
		Optional<Employee> empOpt = empRepo.findById(empId);

		// if emp present, update emp with new details else return exception/null
		if (empOpt.isPresent()) {
			// convert EmpDto to Employee obj
			Employee dbEmp = empOpt.get();
			dbEmp.setEmpName(empDto.getEmpName());
			dbEmp.setSalary(empDto.getSalary());
			dbEmp.setDob(empDto.getDob());
			Login login= dbEmp.getLogin();
			login.setEmail(empDto.getEmail());
			dbEmp.setLogin(login);
			empRepo.save(dbEmp);
			return empDto;
		} else {
			throw new EmployeeNotFoundException("Employee not found with emp id " + empId);
		}
		
	}

	@Override
	public RegRespDto regEmployee(RegisterDto regDto) throws EmployeeFoundException {
		Optional<Login> loginOpt = loginRepo.findById(regDto.getEmail());
		if(loginOpt.isPresent()) {
			throw new EmployeeFoundException("Given email address "+regDto.getEmail()+" present already! Choose different one");
		}
		
		// Convert RegisterDto to Employee obj
		// Create emp obj
		Employee emp = new Employee();
		
		// Update emp obj details
		emp.setEmpName(regDto.getEmpName());
		
		Login login = new Login();
		login.setEmail(regDto.getEmail());
		login.setPassword(regDto.getPassword());
		login.setRole(regDto.getRole());
		login.setLoggedIn(false);
		
		emp.setLogin(login);
		
		// Save emp obj in db
		Employee newEmp = empRepo.save(emp);
		
		// convert Employee obj to RegRespDto obj
		
		RegRespDto resDto = new RegRespDto();
		resDto.setEmpName(newEmp.getEmpName());
		resDto.setEmail(newEmp.getLogin().getEmail());
		resDto.setRole(newEmp.getLogin().getRole());
		resDto.setLoggedIn(newEmp.getLogin().isLoggedIn());
		
		return resDto;
		
	}

	@Override
	public Employee getEmpByEmail(String email) {
		return empRepo.getEmpByEmail(email);
	}

}
