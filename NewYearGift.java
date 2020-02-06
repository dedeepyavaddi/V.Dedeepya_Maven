package com.epam.Dedeepya;
import java.util.*;
public class NewYearGift {
	public static void main( String[] args )
    { 
        int total_weight = 0,quantity = 0,weight = 0,totalbox_wt = 0,total_candies = 0;
        char n1;
        sweets collect;
        Boolean n=true;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Select the sweets from below : ");
        while(n) {
        System.out.println("1.snickers");
        System.out.println("2.perk");
        System.out.println("3.munch");
        System.out.println("4.candies");
        System.out.println("5.rasmalai");
        System.out.println("6.kajubarfi");
        System.out.println("Enter an item(1-6)");
        
        try {
        	
        switch(sc.next().charAt(0))
        {
        case '1':
        	   System.out.println("Enter the quantity");
        	   quantity=sc.nextInt();
        	   System.out.println("Enter the weight in grams");
        	   weight=sc.nextInt();
        	   collect= new snickers();
        	   total_weight=collect.calculateweight( quantity, weight);
        	   totalbox_wt=totalbox_wt+total_weight;
        	   System.out.println("total weight of snickers : "+total_weight+"grams");
        	   System.out.println("Total weight of gift box : "+totalbox_wt+"grams");
               
        	   System.out.println("do you need another one (y/n)");
        	   n1=sc.next().charAt(0);
        	      if(n1=='y'|| n1=='Y')
        	        { 
        	    	  n=true;
        	          break;
        	        }
        	     else
        		    {
        	    	 n=false;
                     System.out.println("Total weight of gift box : "+totalbox_wt+"grams");
                     System.out.println("Total number of candies in the giftbox : "+total_candies);
                     break;
                    }
        case '2':
        	   System.out.println("Enter the quantity");
        	   quantity=sc.nextInt();
        	   System.out.println("Enter the weight in grams");
        	   weight=sc.nextInt();
        	   collect=new perk();
        	   total_weight=collect.calculateweight(quantity, weight);
        	   totalbox_wt=totalbox_wt+total_weight;

        	   System.out.println("Total weight of perk : "+total_weight+"grams");
        	   System.out.println("Total weight of gift box : "+totalbox_wt+"grams");
        	   System.out.println("do you need another one (y/n)");
        	   n1=sc.next().charAt(0);
        	      if(n1=='y'|| n1=='Y')
        	        { 
        	    	  n=true;
        	          break; 
        	        }
        	      else
        		    {
        	    	  n=false;
        	          System.out.println("Total gift box weight : "+totalbox_wt+"grams");
        	          System.out.println("Total number of candies in the giftbox : "+total_candies);
        	          break;
        	        }
        case '3':
        	System.out.println("Enter the quantity");
        	quantity=sc.nextInt();
        	System.out.println("Enter the weight in grams");
        	weight=sc.nextInt();
        	collect=new munch();
        	total_weight=collect.calculateweight(quantity, weight);
        	totalbox_wt=totalbox_wt+total_weight;

        	System.out.println("Total weight of munch : "+total_weight+"grams");
        	System.out.println("Total weight of gift box : "+totalbox_wt+"grams");
        	System.out.println("do you need another one (y/n)");
        	n1=sc.next().charAt(0);
        	if(n1=='y'|| n1=='Y')
        	    {n=true;
        	break;}
        	else
        		{n=false;
        		System.out.println("Total weight of gift box : "+totalbox_wt+"grams");
        		System.out.println("Total number of candies in the giftbox : "+total_candies);
        	break;}
        case '4':
        	System.out.println("Enter the quantity");
        	quantity=sc.nextInt();
        	System.out.println("Enter the weight in grams");
        	weight=sc.nextInt();
        	collect=new candies();
        	total_weight=collect.calculateweight(quantity, weight);
        	totalbox_wt=totalbox_wt+total_weight;
        	total_candies=total_candies+quantity;

        	System.out.println("Total weight of candies : "+total_weight+"grams");
        	System.out.println("Total weight of gift box : "+totalbox_wt+"grams");
        	System.out.println("do you need another one (y/n)");
        	n1=sc.next().charAt(0);
        	if(n1=='y'|| n1=='Y')
        	    {n=true;
        	break;}
        	else
        		{n=false;
        		System.out.println("Total weight of gift box : "+totalbox_wt+"grams");
                System.out.println("Total number of candies in the giftbox : "+total_candies);
                
        	break;}
        case '5':
        	System.out.println("Enter the quantity");
        	quantity=sc.nextInt();
        	System.out.println("Enter the weight in grams");
        	weight=sc.nextInt();
        	collect=new rasmalai();
        	total_weight=collect.calculateweight(quantity, weight);
        	totalbox_wt=totalbox_wt+total_weight;

        	System.out.println("Total weight of rasmalai : "+total_weight+"grams");
        	System.out.println("Total weight of gift box : "+totalbox_wt+"grams");
        	System.out.println("do you need another one (y/n)");
        	n1=sc.next().charAt(0);
        	if(n1=='y'|| n1=='Y')
        	    {n=true;
        	break;}
        	else
        		{n=false;
        		System.out.println("Total weight of gift box : "+totalbox_wt+"grams");
        		System.out.println("Total number of candies in the giftbox : "+total_candies);
        	break;}
        case '6':
        	System.out.println("Enter the quantity");
        	quantity=sc.nextInt();
        	System.out.println("Enter the weight in grams");
        	weight=sc.nextInt();
        	collect=new kajubarfi();
        	total_weight=collect.calculateweight(quantity, weight);
        	totalbox_wt=totalbox_wt+total_weight;

        	System.out.println("Total weight of kajubarfi : "+total_weight+"grams");
        	System.out.println("Total weight of gift box : "+totalbox_wt+"grams");
        	System.out.println("do you need another one (y/n)");
        	n1=sc.next().charAt(0);
        	if(n1=='y'|| n1=='Y')
        	    {n=true;
        	    
        	break;}
        	else
        		{n=false;
        		System.out.println("Total weight of gift box : "+totalbox_wt+"grams");
        		System.out.println("Total number of candies in the giftbox : "+total_candies);
        	break;}
        
 
        }}
        catch(Exception e)
        {
        	System.out.println("Select from 1-6 choices only");
            
        
        
    }}
        sc.close();
}
}

