package Java.FuctionalInterfaces;

import java.util.List;

public class Employee {
	
	private String id;
	private String name;
	private long salary;
	private List<Address> addressList;
	
	public Employee(String id, String name, long salary, List<Address> addressList) 
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.addressList = addressList;
    }    
	
	

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public long getSalary() {
		return salary;
	}



	public void setSalary(long salary) {
		this.salary = salary;
	}



	public List<Address> getAddressList() {
		return addressList;
	}



	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}

	@Override
    public String toString()
    {
		return "Id : "+id+", Name : "+name+", Salary : "+salary+", AddressList : "+addressList;
    }
	
}

