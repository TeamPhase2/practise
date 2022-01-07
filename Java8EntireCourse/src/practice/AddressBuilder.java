package practice;

public class AddressBuilder {
    private Integer id;
    private String city;
    private String state;

    public AddressBuilder(Integer id, String city, String state) {
        this.id = id;
        this.city = city;
        this.state = state;
    }

    public AddressBuilder setId(Integer id) {
        this.id = id;
        return this;
    }

    public AddressBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public AddressBuilder setState(String state) {
        this.state = state;
        return this;

    }
    public Address build() {
        return new Address(id, city, state);
    }
    public AddressBuilder(){}
}
