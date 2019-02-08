package com.vcs.lects.l08.abstractions.task.impl;

/**
 * Padaryti pakeitimus, kad duomenu Reader'is negaletu rasyti, o duomenu
 * Writer'is negaletu skaityti. Klase Resource turetu islikti. Parametru kiekis
 * - nepakisti.
 */

public class ResourceImpl implements Read, Write {
	private String data = "secret data";

	@Override
	public String readData() {
		return data;
	}

	@Override
	public void writeData(String data) {
		this.data = data;
	}
}

interface Read {
	public String readData();
}

interface Write {
	public void writeData(String data);
}

class Manager {

	public void readWrite(ResourceImpl data) {
		String secret = data.readData(); // Ok
		data.writeData("new data"); // Ok
	}

}

class Reader {
	public void read(Read data) {
		data.readData(); // Ok
		// data.writeData("new data"); // NOT OK
	}
}

class Writer {
	public void write(Write data) {
		// data.readData(); // NOT OK
		data.writeData("new data"); // Ok
	}
}
