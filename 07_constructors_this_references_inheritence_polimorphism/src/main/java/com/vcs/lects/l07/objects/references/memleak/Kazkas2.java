package com.vcs.lects.l07.objects.references.memleak;

public class Kazkas2 {

	private References3 ref3;

	private byte[] buffer;

	public References3 getRef3() {
		return ref3;
	}

	public void setRef3(References3 ref3) {

		buffer = new byte[100000000];

		this.ref3 = ref3;
	}

}
