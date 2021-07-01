package day3core;

class Bike extends Cycle{ 
    String bikeDesc(){ 
        return "a cycle with an engine."; 
    } 
     
    Bike(){ 
    	// calls bikeDesc from Bike class
        System.out.println("Hello I am a Motorcycle I am "+ bikeDesc()); 
        // calls cycleDesc from parent cycle class which it inherited
        String temp=cycleDesc(); 
        System.out.println("My ancestor is a cycle who is "+ temp ); 
    } 
     
} 

