package practice;

public class Employee
{
    private Integer id;
    private String name;
    private String address;
    private String color;

    public Employee(Integer id, String name, String address, String color) {
        this.id=id;
        this.name=name;
        this.address=address;
        this.color=color;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Employee Id--"+id+" "+"Name---"+name+"  "+"Address---"+address+" "+"color--"+color;
    }
}
