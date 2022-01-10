package Java.FuctionalInterfaces;

public class Address {
	
	private String id;
	private String state;
	private String city;
	
	public Address(String id, String state, String city) 
    {
        this.id = id;
        this.state = state;
        this.city = city;      
    }    
	
	

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}


	@Override
    public String toString()
    {
		return "Id : "+id+", State : "+state+", City : "+city;
    }
	
    public static void main(String[] args) {
    	
    }



	public String getAddress() {
		
		return city;
	}

}
