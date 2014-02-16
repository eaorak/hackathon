package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Location;
import models.Person;
import play.mvc.Controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PersonController extends Controller {

	public static void index() {
		render();
	}

	private static List<Person> persons = new ArrayList<Person>();

	static {
		Location loc = new Location();
		loc.lat = 41.0933911f;
		loc.lon = 29.0045748f;

		Person p = new Person();
		p.id = 1;
		p.name = "Loris Medici";
		p.age = 38;
		p.address = "Istanbul";
		p.loc = loc;
		p.imgUrl = "http://www.emresupcin.com/wp-content/uploads/2013/02/Android_emresupcin.jpg";
		persons.add(p);

		p = new Person();
		p.id = 2;
		p.name = "Demet Akyildirim";
		p.age = 25;
		p.address = "Istanbul";
		p.loc = loc;
		p.imgUrl = "http://lifeonmymobile.com/wp-content/uploads/2012/01/android-girl.jpg";
		persons.add(p);

		p = new Person();
		p.id = 3;
		p.name = "Ender Aydin Orak";
		p.age = 33;
		p.address = "Istanbul";
		p.loc = loc;
		p.imgUrl = "http://www.androidde.net/wp-content/uploads/2012/07/android-logo.jpg";
		persons.add(p);
	}

	public static void create() {
	}

	public static void get() {
		String id = params.get("id");
		if (id == null) {
			renderJSON(persons);
		} else {
			int i = Integer.parseInt(id) - 1;
			renderJSON(persons.get(i));
		}
	}

	public static void update() {

	}

	public static void delete() {

	}

	public static void main(String[] args) {
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.setPrettyPrinting().create();
		String json = gson.toJson(persons.get(0));
		Person person = gson.fromJson(json, Person.class);
		System.out.println(json);
		System.out.println(person);
	}

}
