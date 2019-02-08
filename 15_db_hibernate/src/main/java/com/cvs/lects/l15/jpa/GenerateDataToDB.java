package com.cvs.lects.l15.jpa;

import java.util.List;
import java.util.Random;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GenerateDataToDB {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		GenerateDataToDB gen = new GenerateDataToDB();

		gen.addPerson(sessionFactory);

		List<Person> persons = gen.listPersons(sessionFactory);

		for (Person person : persons) {
			System.out.println(person.getName() + " " + person.getSurname() + " " + person.getId());
		}

		sessionFactory.close();
	}

	private void addPerson(SessionFactory sessionFactory) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Random rnd = new Random();

		int rndBound = rnd.nextInt(3000);

		Person p = null;
		for (int i = 0; i < rndBound; i++) {
			p = new Person();
			p.setName("Petras" + rnd.nextInt());
			p.setSurname("Pavardauskas");
			session.save(p);
		}

		session.getTransaction().commit();
	}

	private List<Person> listPersons(SessionFactory sessionFactory) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		TypedQuery<Person> result = session.createQuery("SELECT obj FROM Person obj", Person.class);

		List<Person> persons = result.getResultList();

		session.getTransaction().commit();

		return persons;
	}

}
