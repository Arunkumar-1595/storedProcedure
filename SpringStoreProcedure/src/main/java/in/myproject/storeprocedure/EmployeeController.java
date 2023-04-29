package in.myproject.storeprocedure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService es;
	
	
	@PostMapping(value = "/saveEmployee")
	public String saveEmployee(@RequestBody Employee data) {
		return es.saveEmployee(data);
		
	}
	
	@GetMapping("/allemployee")
	public List<Employee> getEmployeeDetails() {
		return es.getEmployeeDetails();
	}
	
	@GetMapping("/employeeusingid/{id}")
	public List<Employee> getEmployeeById(@PathVariable int id) {
		return es.getEmployeeById(id);
	}
	
	@DeleteMapping("/deleteemployee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return es.deleteEmployee(id);
	}
	
	@PutMapping("/updateEmployee/{id}")
	public String updateEmployee(@RequestBody Employee data, @PathVariable int id) {
		return es.updateEmployee(data, id);
	}
}
