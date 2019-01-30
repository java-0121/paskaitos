package com.vcs.lects.l08.inheritance.task.people;

public class TaskPeaople {

}

// Tevine klase
class Zmogus {

	// HAS IT
	private Plaukai plaukai;

	// HAS IT
	private Pilietybe[] pilietybes;

	// HAS IT
	private Suo[] sunys;

}

// Suauges IS IT - Zmogus
class Suauges extends Zmogus {
}

// Vaikas IS IT - Zmogus
class Vaikas extends Zmogus {
}

// Moteris IS IT - Suauges
class Moteris extends Suauges {
}

// ...
class Motina extends Moteris {
}

class Vyras extends Suauges {
}

class Tevas extends Vyras {
}

class Plaukai {
}

class Suo {

	private Plaukai kailis;

}

class Pilietybe {
}
