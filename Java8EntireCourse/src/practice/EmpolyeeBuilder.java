package practice;

public class Employee {
    private String id;
    private String name;
    private Address address;
    private Long salary;

    public Employee(String id, String name, Address address, long salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public Employee() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", salary=" + salary +
                '}';
    }
}
