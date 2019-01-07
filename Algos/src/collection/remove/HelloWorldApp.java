package collection.remove;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HelloWorldApp{

   public static void main(String... args){
	  // List<String> listOfBooks = new LinkedList<>();  
       List<String> listOfBooks = new ArrayList<>();  
       listOfBooks.add("Programming Pearls");
       listOfBooks.add("Clean Code");
       listOfBooks.add("Effective Java");
       listOfBooks.add("Code Complete");
       
       // Using forEach loop to iterate and removing 
       // element during iteration will throw 
       // ConcurrentModificationException in Java
    /*   for(String book: listOfBooks){
           if("Code Complete".equals(book)){
               listOfBooks.remove(book);
           }
       }*/
       
      /* 
       Iterator<String> it = listOfBooks.iterator();
       
       while (it.hasNext()){
    	  // System.out.println(it.next());
    	   //listOfBooks.add("Adding new");
    	   if ("Effective Java".equals(it.next()))
    	   it.remove();
       }*/
     System.out.println(listOfBooks);
     
     for(int i = 0; i <=listOfBooks.size();i++ ){
    	 if(i==2)
    	listOfBooks.add("New Java Book");
    	// if(listOfBooks.contains("Clean Code"))
    	// listOfBooks.remove("Clean Code");
     }
    // System.out.println(listOfBooks);
     listOfBooks.removeIf(s ->"Clean Code".equals(s));
     listOfBooks.forEach(System.out::println);
   }

}