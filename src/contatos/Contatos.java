package contatos;

public class Contatos {
	
	private Integer id;
	private String name;
	private Integer age;
	private String telephone;
	private Endereco endereco = new Endereco();
	
	public Contatos() {
		
	}
	public Contatos(int id, String name, int age, String telephone, Endereco endereco) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.telephone = telephone;
		this.endereco = endereco;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setAddress(Endereco endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", age=" + age + ", telephone=" + telephone + endereco + "]";
	}
}

public class Endereco {
	private String street;
	private Integer number;
	private String burgh;
	private String city;
	private String state;
	
	public Endereco() {
		
	}
	public Endereco(String street, Integer number, String burgh, String city, String state) {
		super();
		this.street = street;
		this.number = number;
		this.burgh = burgh;
		this.city = city;
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getBurgh() {
		return burgh;
	}
	public void setBurgh(String burgh) {
		this.burgh = burgh;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return ", street=" + street + ", number=" + number + ", burgh=" + burgh + ", city=" + city + ", state="
				+ state;
	}
}