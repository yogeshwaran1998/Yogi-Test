package testcases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class practise {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("s");
		list.add("a");
		list.add("j");
		
		int a= list.size();
		
		list.add("v");
		list.add("k");
	
	   int b= list.size();
	   
	   int n = b-a;
	   
	   for(int i=1; i<=n; i++)
	   {
		   String last = list.get(list.size() - i);
		   System.out.println(last);
	   }
	   
	   LocalDate today = LocalDate.now();
       
	   int todayDay=today.getDayOfMonth();
	   
		
		
	}
}
