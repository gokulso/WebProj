package com.algoes.interview;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test { 
    public static void main(String[] args) { 
        int a = 10; 
        //int b = ++a; 
        int b = a++; 
  
        // uncomment below line to see error  
        // b = 10++; 
  
        System.out.println(b); 
        
        int x = 2; int y = 3;
        if ((y == x++) | (x < ++y)) {
        System.out.println("x = " + x + " y = " + y);
        }
    } 
    
   void  test(){
    	   Map<String, String> map = new HashMap<>();
    	    
    	    Collections.synchronizedMap(map);
    }
    
 
}