package com.vcs.lets.l15.res.res_03_txt_properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class AppPropertiesTranslate {

	private Map<Langs, Properties> props = new HashMap<>();

	public static void main(String[] args) throws IOException {

		AppPropertiesTranslate app = new AppPropertiesTranslate();

		Langs lang = Langs.lt;

		for (int i = 1; i <= 13; i++) {
			System.out.println(app.props.get(lang).getProperty("menuo_" + i, "??? menuo_" + i + "???"));
		}

	}

	public AppPropertiesTranslate() throws IOException {

		for (Langs lang : Langs.values()) {
			props.put(lang, loadProp(lang.toString()));
		}

	}

	private Properties loadProp(String lang) throws IOException {
		File f = new File("settings_" + lang.toUpperCase() + ".properties");

		InputStream is = new FileInputStream(f);

		Properties prop = new Properties();
		prop.load(is);
		return prop;
	}

}
