package com.biprom.terweze;

import com.biprom.terweze.Data.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component("dentalWorkCycle")
@Scope("prototype")
public class DentalWorkCycle extends Thread {
	
	Data sharedData1;
	
	//get shared data from Bean
		
		
		@Autowired
		public DentalWorkCycle(Data dt){
			this.sharedData1 = dt;
		}
		
		//initialisatie outputs
			
					
					
				
	
//		Initialisatie digitale outputs	
//		DigOutput_PCF digital_output_card_1 = new DigOutput_PCF(1, 0X27);
//		DigOutput_PCF digital_output_card_2 = new DigOutput_PCF(1, 0X26);
//		DigOutput_PCF digital_output_card_3 = new DigOutput_PCF(1, 0X25);
		
		
		private void setOutputsToVariables() {
			try{
//			digital_output_card_1.d1.setState(!sharedData1.isBoolVoordeurBuiten());
			}
			catch (Exception e) {
			}
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
//				digital_output_card_1.d2.setState(!sharedData1.zoneLandscape1a);
			}
			catch (Exception e) {
			}
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
//			digital_output_card_1.d3.setState(!sharedData1.zoneLandscape1b);
			}
			catch (Exception e) {
			}
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
//			digital_output_card_1.d4.setState(!sharedData1.secretZone);
			}
			catch (Exception e) {
			}
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
//			digital_output_card_1.d5.setState(!sharedData1.zoneStaal1a);
			}
			catch (Exception e) {
			}
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
//			digital_output_card_1.d6.setState(!sharedData1.garageStockage);
			}
			catch (Exception e) {
			}
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
//			digital_output_card_1.d7.setState(!sharedData1.uitbereiding1);
			}
			catch (Exception e) {
			}
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
//				digital_output_card_1.d8.setState(!sharedData1.gebouw1);
			}
			catch (Exception e) {
			}
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
//			digital_output_card_2.d1.setState(!sharedData1.zoneMeten);
			}
			catch (Exception e) {
			}
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
//			digital_output_card_2.d2.setState(!sharedData1.zoneSpray);
			}
			catch (Exception e) {
			}
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
//			digital_output_card_2.d3.setState(!sharedData1.zoneZirkonium);
			}
			catch (Exception e) {
			}
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
//			digital_output_card_2.d4.setState(!sharedData1.zonePorcelein1);
			}
			catch (Exception e) {
			}
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
//			digital_output_card_2.d5.setState(!sharedData1.zoneGieten);
			}
			catch (Exception e) {
			}
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
//			digital_output_card_2.d6.setState(!sharedData1.zoneMetaal2);
			}
			catch (Exception e) {
			}
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
//			digital_output_card_2.d7.setState(!sharedData1.zoneMetaal1);
			}
			catch (Exception e) {
			}
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
//			digital_output_card_2.d8.setState(!sharedData1.zoneStaal1b);
			}
			catch (Exception e) {
			}
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
//			digital_output_card_3.d1.setState(!sharedData1.zonePorcelein2);
			}
			catch (Exception e) {
			}
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
//			digital_output_card_3.d2.setState(!sharedData1.kitchenette);
			}
			catch (Exception e) {
			}
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
//			digital_output_card_3.d3.setState(!sharedData1.zoneInkom);
			}
			catch (Exception e) {
			}
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
//						digital_output_card_3.d4.setState(!sharedData1.outdoor);
			}
			catch (Exception e) {
			}
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
//			digital_output_card_3.d5.setState(!sharedData1.uitbereiding2StaalOpslTechn);
			}
			catch (Exception e) {
			}
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
//			digital_output_card_3.d6.setState(!sharedData1.uitbereiding2GietMetZand);
			}
			catch (Exception e) {
			}
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
//			digital_output_card_3.d7.setState(!sharedData1.zoneGarage);
			}
			catch (Exception e) {
			}
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
//			digital_output_card_3.d8.setState(!sharedData1.zoneKronen);
			}
			catch (Exception e) {
			}
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		

	public void run(){
		while(true){
			
			
			setOutputsToVariables();
						
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
		
	}
	

}
