package com.vcs.lects.l12.design_patterns.factory;

import java.util.UUID;

public class VINRegister {

	public String generateUnicVIN() {

		return UUID.randomUUID().toString();

	}

}
