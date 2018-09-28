/**
 * 
 *//*
package com.mindtree.configuration;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages="com.mindtree.wehealu")
@Configuration
public class SpringDispatcherConfig implements WebMvcConfigurer {
	
	@Bean
	public InternalResourceViewResolver jspViewResolver() {
		InternalResourceViewResolver viewResolverA = new InternalResourceViewResolver();
		
		viewResolverA.setPrefix("/WEB-INF/jsp/");
		viewResolverA.setSuffix(".jsp");
		viewResolverA.setOrder(1);
		
		return viewResolverA;
	}

	@Override
	public void configurePathMatch(PathMatchConfigurer configurer) {
		// Do nothing because of these is not required.
	}

	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		// Do nothing because of these is not required.
	}

	@Override
	public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
		// Do nothing because of these is not required.
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		// Do nothing because of these is not required.
	}

	@Override
	public void addFormatters(FormatterRegistry registry) {
		// Do nothing because of these is not required.
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// Do nothing because of these is not required.
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// Do nothing because of these is not required.
	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// Do nothing because of these is not required.
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// Do nothing because of these is not required.
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// Do nothing because of these is not required.
	}

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
		// Do nothing because of these is not required.
	}

	@Override
	public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> returnValueHandlers) {
		// Do nothing because of these is not required.
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		// Do nothing because of these is not required.
	}

	@Override
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		// Do nothing because of these is not required.
	}

	@Override
	public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {
		// Do nothing because of these is not required.
	}

	@Override
	public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {
		// Do nothing because of these is not required.
	}

	@Override
	public Validator getValidator() {
		// Do nothing because of these is not required.
		return null;
	}

	@Override
	public MessageCodesResolver getMessageCodesResolver() {
		// Do nothing because of these is not required.
		return null;
	}
}
*/