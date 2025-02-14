package com.coco.config;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {ServletConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	
	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter characterEncodingFilter =
				new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		characterEncodingFilter.setForceEncoding(true);
		
		return new Filter[] {characterEncodingFilter };
	}

	//FileUpload
	@Override
	protected void customizeRegistration(Dynamic registration) {
		registration.setInitParameter("throwsExceptionIfNoHandlerFound", "true");
		
		MultipartConfigElement multipartConfig = 
				new MultipartConfigElement("C:\\work\\springex\\uploadFolder", 20971520, 41943040, 20971520);
		
		registration.setMultipartConfig(multipartConfig);
	}
	
	
}