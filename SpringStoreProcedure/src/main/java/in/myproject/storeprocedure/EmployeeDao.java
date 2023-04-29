package in.myproject.storeprocedure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.StoredProcedureQuery;

@Repository
public class EmployeeDao {
	
	@Autowired
	EntityManager em;
	

	public String saveEmployee(Employee data) {
		// TODO Auto-generated method stub
		StoredProcedureQuery storedProcedure = em.createNamedStoredProcedureQuery("firststoredprocedure");
		storedProcedure.setParameter("emp_id", data.getEmp_id())
		.setParameter("emp_name", data.getEmp_name())
		.setParameter("emp_role", data.getEmp_role());
        storedProcedure.execute();

		return "data saved";
	}

	
	@SuppressWarnings("unchecked")
	public List<Employee> getEmployeeDetails() {

		List<Employee> getEmployees = em.createNamedStoredProcedureQuery("secondstoredprocedure").getResultList();
		return getEmployees;
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getEmployeeById(int id) {
		
		List <Employee> getemployeeById =  em.createNamedStoredProcedureQuery("thirdstoredprocedure").setParameter("employeeid",id).getResultList();
		
		return getemployeeById;
	}


	public String deleteEmployee(int id) {
		// TODO Auto-generated method stub
		StoredProcedureQuery deleteemployee = em.createNamedStoredProcedureQuery("fourthstoredprocedure").setParameter("employeeid", id);
		return "Employee deleted";
	}


	public String updateEmployee(Employee data, int id) {
		// TODO Auto-generated method stub
		StoredProcedureQuery updateemployee=em.createNamedStoredProcedureQuery("fifthstoredprocedure");
		updateemployee.setParameter("emp_id", data.getEmp_id())
		.setParameter("emp_name", data.getEmp_name())
		.setParameter("emp_role", data.getEmp_role());
		updateemployee.execute();
		return "Employee Details Updated";
	}
	
}
