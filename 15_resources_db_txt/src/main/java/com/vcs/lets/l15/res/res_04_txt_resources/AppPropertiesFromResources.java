package com.vcs.lets.l15.res.res_04_txt_resources;

import java.io.IOException;
import java.util.ResourceBundle;

import com.vcs.lets.l15.res.utils.WebUtil;

public class AppPropertiesFromResources {

	public static void main(String[] args) throws IOException {

		ResourceBundle rBundleLt = ResourceBundle.getBundle("settings_LT");

		// System.out.println(rBundleLt.getString("service_url_for_read_2"));

		System.out.println(WebUtil.readContent(rBundleLt.getString("service_url_for_read_" + args[0])));

	}

}
