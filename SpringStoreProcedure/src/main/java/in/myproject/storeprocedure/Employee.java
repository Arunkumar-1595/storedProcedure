package in.myproject.storeprocedure;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQueries;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;
import jakarta.persistence.Table;

@Entity
@Table
@NamedStoredProcedureQueries({@NamedStoredProcedureQuery(name = "firststoredprocedure",procedureName = "insertEmployeeDetails", parameters = {@StoredProcedureParameter(name="emp_id", type=Integer.class, mode=ParameterMode.IN),
        @StoredProcedureParameter(name="emp_name", type=String.class, mode=ParameterMode.IN),
        @StoredProcedureParameter(name="emp_role", type=String.class, mode=ParameterMode.IN)}),
	@NamedStoredProcedureQuery( name="secondstoredprocedure",procedureName = "getEmployeeDetails"),
    @NamedStoredProcedureQuery( name="thirdstoredprocedure",procedureName = "getEmployeeDetailsById",parameters = {@StoredProcedureParameter(mode=ParameterMode.IN,name="employeeid",type = Integer.class)}),
    @NamedStoredProcedureQuery( name="fourthstoredprocedure",procedureName = "deleteEmployeeById",parameters = {@StoredProcedureParameter(mode=ParameterMode.IN,name="employeeid",type = Integer.class)}),
    @NamedStoredProcedureQuery(name = "fifthstoredprocedure",procedureName = "updateEmployeeDetails", parameters = {@StoredProcedureParameter(name="emp_id", type=Integer.class, mode=ParameterMode.IN),
        @StoredProcedureParameter(name="emp_name", type=String.class, mode=ParameterMode.IN),
        @StoredProcedureParameter(name="emp_role", type=String.class, mode=ParameterMode.IN)})})
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int emp_id;
	
	private String emp_name;
	
	private String emp_role;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_role() {
		return emp_role;
	}

	public void setEmp_role(String emp_role) {
		this.emp_role = emp_role;
	}
	
	

}
