package org.ncu.test;

import org.ncu.dao.PersonDAO;

public class Main {

	public static void main(String[] args) {
		PersonDAO person_Dao = new PersonDAO();
		person_Dao.create();

	}

}