package com.vcs.lects.l09.generics;

/**
 * @author owr
 *
 * @param <T>
 *            - parametras kuris....
 */
public class ManoWrapperis<T> {

	private T sk;

	public ManoWrapperis(T sk) {
		this.sk = sk;

	}

	public void setObject(T sk) {
		this.sk = sk;
	}

	public T rezultatas() {
		return sk;
	}

	// public <K> K rezultatas(Class<K> k) {
	// return (K) sk2;
	// }

}
