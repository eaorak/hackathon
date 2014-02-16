package controllers;

import play.mvc.Before;
import play.mvc.Controller;

public class PersonController extends Controller {

	public static void index() {
		render();
	}

	@Before
	public static void init() {

	}

	public static void create() {

	}

	public static void get() {
		String id = params.get("id");
		if (id == null) {

		}
	}

	public static void update() {

	}

	public static void delete() {

	}

}
