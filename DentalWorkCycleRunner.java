package com.biprom.terweze;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class DentalWorkCycleRunner {
	
	DentalWorkCycle dwc;
	
	@Autowired
	public DentalWorkCycleRunner(DentalWorkCycle dentalWorkCycle) {
		this.dwc = dentalWorkCycle;
		
	}

	//DentalWorkCycle wc = new DentalWorkCycle(null);
	
	
	
	
	
	@PostConstruct
	public void init() {
		Thread thread= new Thread(dwc);
		thread.start();
	}
	
	@SuppressWarnings("deprecation")
	@PreDestroy
	public void destroy() {
		if (dwc != null) {
			dwc.stop();
		}
	}

}