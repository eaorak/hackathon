package models;

public class Person {

	public int id;
	public String name;
	public int age;
	public String address;
	public Location loc;
	public String imgUrl;

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", loc=" + loc + "]";
	}

}
