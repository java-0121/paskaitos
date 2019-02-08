package com.vcs.lets.l15.res.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class WebUtil {

	public static StringBuilder readContent(String target) {

		StringBuilder builder = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader((new URL(target)).openStream()));
			in.lines().forEachOrdered(ln -> builder.append(ln + "\n"));
			in.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return builder;
	}

}
