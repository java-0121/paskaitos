package com.vcs.lets.l15.res.res_02_txt_apache;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class AppApacheFileWriter {

	public static void main(String[] args) throws IOException {

		File f = new File("duomenys.dat");

		List<String> lines = new ArrayList<>();

		int c = 0;
		String line = "";
		while (line.length() < 100) {
			line += "-" + c++;
			lines.add(line);
		}

		FileUtils.writeLines(f, "UTF-8", lines, true);
	}
}
