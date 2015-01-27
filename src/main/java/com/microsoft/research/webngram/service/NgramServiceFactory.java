/*
 * Copyright 2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */
package com.microsoft.research.webngram.service;

import com.microsoft.research.webngram.service.impl.GenerationServiceImpl;
import com.microsoft.research.webngram.service.impl.LookupServiceImpl;

/**
 * A factory for creating NgramService objects.
 */
public class NgramServiceFactory {

	/** The application key. */
	private String applicationKey;

	/**
	 * Instantiates a new ngram service factory.
	 * 
	 * @param applicationKey the application key
	 */
	private NgramServiceFactory(String applicationKey) {
		this.applicationKey = applicationKey;
	}

	/**
	 * New instance.
	 * 
	 * @param applicationKey the application key
	 * 
	 * @return the ngram service factory
	 */
	public static NgramServiceFactory newInstance(String applicationKey) {
		return new NgramServiceFactory(applicationKey);
	}

	/**
	 * New lookup service.
	 * 
	 * @return the lookup service
	 */
	public LookupService newLookupService() {
		return new LookupServiceImpl(applicationKey);
	}
	
	/**
	 * New generation service.
	 * 
	 * @return the generation service
	 */
	public GenerationService newGenerationService() {
		return new GenerationServiceImpl(applicationKey);
	}
}
