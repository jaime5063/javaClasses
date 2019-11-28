package com.Class26;

public class Intro_MethodOverriding {

}
/*
 * Run time polymorphism / dynamic binding / late binding 
 * - can be achieved through method overriding
 * 
 * Method Overriding:
 * 	- same method exist within Superclass(Base class) and Subclass
 * 
 * EXAMPLE:
 * 
 * Employee
 *  int salary;
 *  
 *  void getPaid(){
 *  SOPln("Employee gets paid"+salary);
 *  }
 * 
 * FullTime
 * int bonus;
 * 
 * void getPaid(){
 *  SOPln("Employee gets paid"+salary+bonus);
 *  }
 * 
 * Contractor
 *
 * In method overriding Method Signature(name+parameters) and Return Type MUST BE THE SAME.
 *
 * Without inheritance - method override is not possible
 *
 */
