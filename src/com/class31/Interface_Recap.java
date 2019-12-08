package com.class31;

public class Interface_Recap {
	
/* Parent cannot access methods to the child
 * naming convention for variables in interface class is all caps. 
 * 		If you want to ad special character, only can add: _ and $
 * 
 * Can you have a constructor in interface? No. will not be useful in interface
 * 	- inside interface you cannot have instance variables
 *  - inside constructor you can have an instance variables
 *  
 *  Abstract vs Interface
 *  - interface is 100% abstraction
 *  - abstract is partial abstraction
 *  
 *  implement multiple interfaces to on class
 *  - implements interName1, interName2, interName3{} ---> etc
 *  
 *  Classes
 *  - as a class you can only have one parent class
 *  
 *  Java
 *  - most popular Java is JDK 8 (Java Development Kit)
 *  	- Now we can add implemented DEFAULT or STATIC methods into interface
 *  	 NO ONE CAN OVERRIDE IT
 *  	: static void methodOne(){
 *  			SYSO"test";
 *  		}
 *  	 SETTING A DEFAULT METHOD (YOU CAN OVERRIDE)
 *  	: default void takePictures(){
 *  			SYSO"test 2";
 *  		}
 *  
 *  	- due to this new rule you will not achieve 100% abstraction but still through implements
 *  
 *  Abstract vs Interface Summary:
 *  - you can have undefined and defined methods
 *  - we can implement multiple interfaces but we can extend only 1 class
 *  - To create a relationship to the interface we use implements keyword.
 *  	for classes we use extends.
 *  - Interface does not have a constructor while abstract class does
 *  - Interface does not have instance variables, by default each variable is STATIC FINAL
 *  	and it MUST BE INITIALIZED 
 *  	 in ABSTRACT class we can have both static and instance variables and we do need to 
 *  	 initialize them
 *  - inside INTERFACE abstract methods can be only public
 *  	in abtract class can be any access modifier except PRIVATE(does not participate in inheritance)
 *  - in INTERFACE we have only abstract method, but since Java 8 we can have default static implemented
 *  	mwthods, while no restrictions in abstract class (defined and undefined)
 *  - Both help to achieve abstractions
 *  	- both can have implemented and unimplemented methods
 *  	- both must participate in inheritance
 *  	- for both you cannot create an Object 
 *  
 *  
 *  
 * 	
 */

}
