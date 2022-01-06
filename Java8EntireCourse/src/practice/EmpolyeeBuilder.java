package practice;

public class EmpolyeeBuilder {
    private Integer id;
    private String name;
    private String address;
    private String color;

    public EmpolyeeBuilder() {
    }


    public EmpolyeeBuilder setId(Integer id) {
        this.id = id;
        return this;

    }

    public EmpolyeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmpolyeeBuilder setAddress(String address) {
        this.address = address;
        return this;
    }


    public EmpolyeeBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Employee build() {
        return new Employee(id, name, address, color);
    }
}
