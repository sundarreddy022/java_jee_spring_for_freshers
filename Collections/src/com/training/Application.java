package com.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.training.ifaces.Constant;
import com.training.model.Invoice;
import com.training.services.InvoiceService;

public class Application {

	public static void print(List<Invoice> invList) {
		
		 Iterator<Invoice> itr = invList.iterator();
		 
		    while(itr.hasNext()) {
		    	
		    Invoice inv = itr.next();
		    
		     System.out.println(inv);
		    }
		 
	}
	
	public static void main(String[] args) {

		
		Invoice inv1 = new Invoice(101,"Ramesh",6700);
		
		Invoice inv2 = new Invoice(201,"Sumit",1700);
		
		Invoice inv3 = new Invoice(150,"Anoop",7000);
		
		Invoice inv4 = new Invoice(150,"Anoop",7000);
		
				
		
		InvoiceService service = new InvoiceService();
		
		 service.add(inv1);
		 service.add(inv2);
		 service.add(inv3);
		 
		 
		 List<Invoice> list = service.findAll();
		 
		
		 System.out.println("Sorted By Name");
		 
		 List<Invoice> list1 = service.getSortedListBy(Constant.CUSTOMERNAME);

		 print(list1);
		 
		 System.out.println("======================");
		 
		 System.out.println("Sorted By Invoice Number");

		 List<Invoice> list2 = service.getSortedListBy(Constant.INVOICENUMBER);
		
		 print(list2);
		 
		 
         System.out.println("======================");
		 
		 System.out.println("Sorted By Amount");

		 List<Invoice> list3 = service.getSortedListBy(Constant.AMOUNT);
		
		 print(list3);
		 
		    
	}

}
