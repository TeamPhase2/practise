package practice;

public class EmpolyeeBuilder {
    private String id;
    private String name;
    private Address address;
    private Long salary;

    public EmpolyeeBuilder() {
    }

    public EmpolyeeBuilder(String id, String name, Address address, Long salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;

    }


    public EmpolyeeBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public EmpolyeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmpolyeeBuilder setSalary(Long salary) {
        this.salary = salary;
        return this;
    }

    public EmpolyeeBuilder setAddress(Address address) {
        this.address = address;
        return this;
    }


    public Employee build() {
        return new Employee(id, name, address, salary);
    }
}
