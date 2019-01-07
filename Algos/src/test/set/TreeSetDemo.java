
package test.set;

import java.util.Set;
import java.util.TreeSet;

class TreeSetDemo { 
  
    public static void main(String[] args) 
    { 
       // Set<StringBuffer> setBuff = new TreeSet<StringBuffer>(); 
    	PersonNameSort pernamesort = new PersonNameSort();
        Set<Person> ts = new TreeSet<>();
  
        // Elements are added using add() method 
        /*setBuff.add(new StringBuffer("A")); 
        setBuff.add(new StringBuffer("Z")); 
        setBuff.add(new StringBuffer("L")); 
        setBuff.add(new StringBuffer("B")); 
        setBuff.add(new StringBuffer("O")); 
  
       
        
        setBbuild.add(new StringBuilder("A")); 
        setBbuild.add(new StringBuilder("Z")); 
        setBbuild.add(new StringBuilder("L")); 
        setBbuild.add(new StringBuilder("B")); 
        setBbuild.add(new StringBuilder("O"));
        
        // We will get RunTimeException :ClassCastException 
        // As StringBuffer does not implements Comparable interface */
        
        ts.add(new Person(1,"ONe"));
        ts.add(new Person(4,"Four"));
        ts.add(new Person(6,"Six"));
        ts.add(new Person(2,"Two"));
        ts.add(new Person(5,"Five"));
        ts.add(new Person(0,"AAA"));
        
        System.out.print(ts); 
    } 
} 