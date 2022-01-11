import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

import java.util.List;

public class Employee {

    private String id;
    private String name;
    private Long salary;
    private List<Address> addressList;
    public Employee() {}
    public Employee(String id, String name, Long salary, List<Address> addressList) {
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

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", addressList=" + addressList +
                '}';
    }
}
