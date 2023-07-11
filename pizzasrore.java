//package pizza
import java.util.*;


	public class pizzasrore extends astores

	{ 
		Scanner sc=new Scanner(System.in);
		String Store_name;
		String location;
		int schoice;
		int i=0;
		void get_location()
		{
		
		
			do
			{
				System.out.println("Enter Your Location: ");
				System.out.println("1]NIBM");
				System.out.println("2]Kondhwa");
				System.out.println("3]Wanaorie");
				System.out.println("4]Koregaon park");
				System.out.println("5]Viman Nagar");
				
				
				int a= sc.nextInt();
				
			  switch(a)
			  {
			    case 1:	System.out.println("These Pizza Outlet's are available at  NIBM");
			            do
			            {
			            	System.out.println("1]Domino's");
			    			System.out.println("2]Pizza Hut");
			    			System.out.println("3]Eagle Boyz");
			    			System.out.println("Enter the store of your choice");
			            	int schoice=sc.nextInt();
			            	//schoice=0;
			            	switch(schoice)
			            	{
			            	
			            	
			            	case 1:store1 s1=new store1();
			            	
			            		break;
			            	
			            	case 2:store3 s3=new store3();
		            		break;
			            	
			            	case 3:store4 s4=new store4();
		            		break;
			            	
			            	default:schoice=4;
			            	System.out.println("Entered wrong choice");
			            	break;
			            	}
			            	
			            }
			            while(schoice!=4);
			    break;
			    
			    case 2:System.out.println("These Pizza Outlet's are available at Kondhwa");
	            do
	            {
	            	System.out.println("1]Domino's");
	                System.out.println("2]Smokin Jones");
	    			System.out.println("3]Pizza Hut");
	    			System.out.println("4]Eagle Boyz");
	    			System.out.println("Enter the store of your choice");
	            	int schoice=sc.nextInt();
	            	schoice=0;
	            	switch(schoice)
	            	{
	            	
	            	
	            	case 1:store1 s1=new store1();
	            		break;
	            	
	            	case 2:store2 s2=new store2();
	        		break;
	            	
	            	case 3:store3 s3=new store3();
	        		break;

	            	case 4:store4 s4=new store4();
	        		break;
	            	default:
	            	}
	            	
	            }
	            while(schoice!=4);
	   
			    break;
			    case 3:System.out.println("These Pizza Outlet's are available at  Wanowrie");
	            do
	            {
	            	        System.out.println("1]Domino's");
	                        System.out.println("2]Smokin Jones");
	    			System.out.println("3]Eagle Boyz");

	    			System.out.println("Enter the store of your choice");
	            	int schoice=sc.nextInt();
	            	schoice=0;
	            	switch(schoice)
	            	{
	            	
	            	
	            	case 1:store1 s1=new store1();
	            		break;
	            	
	            	case 2:store2 s2=new store2();
	        		break;
	            	
	            	case 3:store4 s4=new store4();
	        		break;

	            	
	            	default:
	            	}
	            	
	            }
	            while(schoice!=6);
	   
			    break;
			    case 4:
			    System.out.println("These Pizza Outlet's are available at  Koregaon Park");
	            do
	            {
	            	        System.out.println("1]Domino's");
	                        System.out.println("2]Smokin Jones");
	    			System.out.println("3]Pizza Hut");
	    			System.out.println("4]Eagle Boyz");

	    			System.out.println("Enter the store of your choice");
	            	int schoice=sc.nextInt();
	            	schoice=0;
	            	switch(schoice)
	            	{
	            	
	            	
	            	case 1:store1 s1=new store1();
	            		break;
	            	
	            	case 2:store2 s2=new store2();
	        		break;
	            	
	            	case 3:store3 s3=new store3();
	        		break;

	            	case 4:store4 s4=new store4();
	        		break;
	            	default:
	            	}
	            	
	            }
	            while(schoice!=4);
	   
			    break;
			    case 5:System.out.println("These Pizza Outlet's are available at  Viman Nagar");
	            do
	            {
	            	        System.out.println("1]Domino's");
	                        System.out.println("2]Smokin Jones");
	    			System.out.println("3]Pizza Hut");
	    			
	    			System.out.println("Enter the store of your choice");
	            	int schoice=sc.nextInt();
	            	schoice=0;
	            	switch(schoice)
	            	{
	            	
	            	
	            	case 1:store1 s1=new store1();
	            		break;
	            	
	            	case 2:store2 s2=new store2();
	        		break;
	            	
	            	case 3:store3 s3=new store3();
	        		break;

	            	
	            	default:
	            	}
	            	
	            }
			 while(schoice!=4);
	   
			    break;
			
			    default:
			    break;
			   
			
			}
		}
			while( i!=5);
	}
	}
		
		
		
		
		
		
		
		
		
	
