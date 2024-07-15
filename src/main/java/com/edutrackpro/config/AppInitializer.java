package com.edutrackpro.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	// provide the config class
	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] configClass = { AppConfig.class };
		return configClass;
	}

	// provide URL Mapping
	@Override
	protected String[] getServletMappings() {
		String[] urlMapping = { "/edutrackpro.com/*" };
		return urlMapping;
	}
}
