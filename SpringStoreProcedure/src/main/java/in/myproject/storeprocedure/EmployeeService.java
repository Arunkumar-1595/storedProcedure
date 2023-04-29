package in.myproject.storeprocedure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao ed;

	public List<Employee> getEmployeeDetails() {
		
		return ed.getEmployeeDetails();
	}

	public List<Employee> getEmployeeById(int id) {
		
		return ed.getEmployeeById(id);
	}

	public String saveEmployee(Employee data) {
		// TODO Auto-generated method stub
		return ed.saveEmployee(data);
	}

	public String deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return ed.deleteEmployee(id);
	}

	public String updateEmployee(Employee data, int id) {
		// TODO Auto-generated method stub
		return ed.updateEmployee(data, id);
	}

}
