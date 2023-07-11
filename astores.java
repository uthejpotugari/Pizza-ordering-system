	import java.util.*;
	import java.util.ArrayList;
	import java.util.Iterator;

	public class astores 
	{  Scanner sc=new Scanner(System.in);
	   String psize;
	   int cost;
	  
	     class store1 extends astores
	     {ArrayList<String>pizza;
	    	 public store1()
	      {
	         System.out.println("Welcome to DOMINO'S!!!!!!!");
	         System.out.println("YEH HAI RISHTON KA TIME!");

		  int choice;
		do
	      {
			pizza=new ArrayList<>();
			pizza.add("1] Veggie Delight ");
	                
			pizza.add("2] Cloud 9 ");
			
			pizza.add("3] Olive Garden");
			
			pizza.add("4] Chef's Special");
			
			Iterator<String>i=pizza.iterator();
			while(i.hasNext())
			{
				String var=(String)i.next();
				System.out.println(var);
				 //System.out.println("-------------------------------------------------------------");
			}
			
			System.out.println("Enter your pizza choice");
			choice=sc.nextInt(); 
	                
			
			switch(choice)
			{  
			case 1: System.out.println("Kindly select the size in which you would like your pizza?,We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
	                        psize=sc.next();
	                         if(psize.equals('r')||psize.equals('R'))
	                         cost=92;
	                         else  if(psize.equals('m')||psize.equals('M'))
	                         cost=129;
	                          else  if(psize.equals('l')||psize.equals('L'))
	                         cost=198;
	                       
				break;
			case 2:System.out.println("Kindly select the size in which you would like your pizza?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
	                        psize=sc.next();
	                        if(psize.equals('r')||psize.equals('R'))
	                         cost=92;
	                        else  if(psize.equals('m')||psize.equals('M'))
	                         cost=129;
	                        else  if(psize.equals('l')||psize.equals('L'))
	                         cost=198;
				break;
			case 3:System.out.println("Kindly select the size in which you would like your pizza?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
	                        psize=sc.next();
	                        if(psize.equals('r')||psize.equals('R'))
	                         cost=92;
	                        else  if(psize.equals('m')||psize.equals('M'))
	                         cost=129;
	                        else  if(psize.equals('l')||psize.equals('L'))
	                         cost=198;
				break;
			case 4:System.out.println("Kindly select the size in which you would like your pizza?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
	                        psize=sc.next();
	                        if(psize.equals('r')||psize.equals('R'))
	                         cost=92;
	                        else  if(psize.equals('m')||psize.equals('M'))
	                         cost=129;
	                        else  if(psize.equals('l')||psize.equals('L'))
	                         cost=198;
				break;
			default:
				break;
			}
			
	      }
		  while(choice!=5)	;
		}
		
		
		
	        }
		
	}
	        class store2 extends astores
	        {
	        	Scanner sc=new Scanner(System.in);
	        	String psize;
	        	int cost=0;
	        	 public void store2()
	        	{System.out.println("Welcome to Smokin Jos's!!!!!!!");
	                                                        
	        	int choice1;
				do
	            {
	      		ArrayList<String>a1=new ArrayList<>();
	      		a1.add("1] Golden Corn");
			
	      		a1.add("2] Garden Party");
			
	      		a1.add("3] Hot and Twisted");
			
	      		a1.add("4] Giddy Up BBQ Chicken");
			
	      		Iterator<String>i1=a1.iterator();
	      		while(i1.hasNext())
	      		{
	      			String var1=(String)i1.next();
	      			System.out.println(var1);
	      			 //System.out.println("-------------------------------------------------------------");
	      		}
	      		
	      		System.out.println("Enter your pizza choice");
	      		 choice1= sc.nextInt(); 
	      		
	      		switch(choice1)
	      		{
	      		case 1:System.out.println("Kindly select the size in which you would like your pizza?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
                psize=sc.next();
                if(psize.equals('r')||psize.equals('R'))
                 cost=92;
                else  if(psize.equals('m')||psize.equals('M'))
                 cost=129;
                else  if(psize.equals('l')||psize.equals('L'))
                 cost=198;
	      			break;
	      		case 2:System.out.println("Kindly select the size in which you would like your pizza?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
                psize=sc.next();
                if(psize.equals('r')||psize.equals('R'))
                 cost=92;
                else  if(psize.equals('m')||psize.equals('M'))
                 cost=129;
                else  if(psize.equals('l')||psize.equals('L'))
                 cost=198;
	      			break;
	      		case 3:System.out.println("Kindly select the size in which you would like your pizza?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
                psize=sc.next();
                if(psize.equals('r')||psize.equals('R'))
                 cost=92;
                else  if(psize.equals('m')||psize.equals('M'))
                 cost=129;
                else  if(psize.equals('l')||psize.equals('L'))
                 cost=198;
	      			break;
	      		case 4:System.out.println("Kindly select the size in which you would like your pizza?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
                psize=sc.next();
                if(psize.equals('r')||psize.equals('R'))
                 cost=92;
                else  if(psize.equals('m')||psize.equals('M'))
                 cost=129;
                else  if(psize.equals('l')||psize.equals('L'))
                 cost=198;
	      			break;
	      		default:
	      			break;
	      		}
	      		
	            }
	      	  while(choice1!=5)	;
	      	}
	        	
	        	
	        }	
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	       
		
		
	         class store3
		    {
		    	
		    	Scanner sc=new Scanner(System.in);
		    	 public	void store3()
	        	{  System.out.println("Welcome to Pizza Hut!!!!!!!");
	                                  System.out.println("MAKE !T GREAT");
	        	int choice1;
	        	String psize;
	        	int cost=0;
				do
	            {
	      		ArrayList<String>a1=new ArrayList<>();
	      		a1.add("1] Margherita");

	      		a1.add("2] Zesty Chicken");

	      		a1.add("3] Triple Chicken Feast ");
	      		a1.add("4] Paneer Vegorama ");
	      		Iterator<String>i1=a1.iterator();
	      		while(i1.hasNext())
	      		{
	      			String var1=(String)i1.next();
	      			System.out.println(var1);
	      			 //System.out.println("-------------------------------------------------------------");
	      		}
	      		
	      		System.out.println("Enter your pizza choice");
	      		 choice1= sc.nextInt(); 
	      		
	      		switch(choice1)
	      		{
	      		case 1:System.out.println("Kindly select the size in which you would like your pizza?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
                psize=sc.next();
                if(psize.equals('r')||psize.equals('R'))
                 cost=100;
                else  if(psize.equals('m')||psize.equals('M'))
                 cost=245;
                else  if(psize.equals('l')||psize.equals('L'))
                 cost=320;





	      			break;
	      		case 2:System.out.println("Kindly select the size in which you would like your pizza?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
                psize=sc.next();
                if(psize.equals('r')||psize.equals('R'))
                 cost=160;
                else  if(psize.equals('m')||psize.equals('M'))
                 cost=320;
                else  if(psize.equals('l')||psize.equals('L'))
                 cost=425;
	      			break;
	      		case 3: System.out.println("Kindly select the size in which you would like your pizza?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
                psize=sc.next();
                if(psize.equals('r')||psize.equals('R'))
                 cost=295;
                else  if(psize.equals('m')||psize.equals('M'))
                 cost=395;
                else  if(psize.equals('l')||psize.equals('L'))
                 cost=510;
	      			break;
	      		case 4:System.out.println("Kindly select the size in which you would like your pizza?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
                psize=sc.next();
                if(psize.equals('r')||psize.equals('R'))
                 cost=260;
                else  if(psize.equals('m')||psize.equals('M'))
                 cost=470;
                else  if(psize.equals('l')||psize.equals('L'))
                 cost=595;
	      			break;
	      		default:
	      			break;
	      		}
	      		
	            }
	      	  while(choice1!=5)	;
	      	}
	        	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    }
		
		 class store4
		 
		 
		 {
			 Scanner sc=new Scanner(System.in);
			 public	void store4()
	     	{   System.out.println("Welcome to Eagle Boyz Pizza!!!!!!!");
	              
	     	int choice1;
	     	String psize;
	     	int cost=0;
				do
	         {
	   		ArrayList<String>a1=new ArrayList<>();
	   		a1.add("1]Hot and Spicy Chicken ");
	   		a1.add("2]Super Veg ");
	   		a1.add("3]Italian Treat ");
	   		a1.add("4]Super Chicken Twist ");
	   		Iterator<String>i1=a1.iterator();
	   		while(i1.hasNext())
	   		{
	   			String var1=(String)i1.next();
	   			System.out.println(var1);
	   			 //System.out.println("-------------------------------------------------------------");
	   		}
	   		
	   		System.out.println("Enter your pizza choice");
	   		 choice1= sc.nextInt(); 
	   		
	   		switch(choice1)
	   		{
	   		case 1:

	 			System.out.println("Kindly select the size in which you would like your pizza?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
                psize=sc.next();
                if(psize.equals('r')||psize.equals('R'))
                 cost=299;
                else  if(psize.equals('m')||psize.equals('M'))
                 cost=499;
                else  if(psize.equals('l')||psize.equals('L'))
                 cost=699;
	   			break;
	   		case 2:System.out.println("Kindly select the size in which you would like your pizza?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
            psize=sc.next();
            if(psize.equals('r')||psize.equals('R'))
             cost=92;
            else  if(psize.equals('m')||psize.equals('M'))
             cost=129;
            else  if(psize.equals('l')||psize.equals('L'))
             cost=198;
	   			break;
	   		case 3:System.out.println("Kindly select the size in which you would like your pizza?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
            psize=sc.next();
            if(psize.equals('r')||psize.equals('R'))
             cost=92;
            else  if(psize.equals('m')||psize.equals('M'))
             cost=129;
            else  if(psize.equals('l')||psize.equals('L'))
             cost=198;
	   			break;
	   		case 4:System.out.println("Kindly select the size in which you would like your pizza?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
            psize=sc.next();
            if(psize.equals('r')||psize.equals('R'))
             cost=92;
            else  if(psize.equals('m')||psize.equals('M'))
             cost=129;
            else  if(psize.equals('l')||psize.equals('L'))
             cost=198;
	   			break;
	   		default:
	   			break;
	   		}
	   		
	         }
	   	  while(choice1!=5)	;
	   	}
}
		 
		 




