package com.java.dailyAssignmentsday4;

import java.util.Random;

//Abstract class Compartment
abstract class Compartment4 {
//Abstract method notice
abstract void notice();
}

//Subclass FirstClass
class FirstClass extends Compartment4 {
@Override
void notice() {
   System.out.println("Notice: This is a First Class compartment.");
}
}

//Subclass Ladies
class Ladies extends Compartment4 {
@Override
void notice() {
   System.out.println("Notice: This is a Ladies compartment.");
}
}

//Subclass General
class General extends Compartment4{
@Override
void notice() {
   System.out.println("Notice: This is a General compartment.");
}
}

//Subclass Luggage
class Luggage extends Compartment4 {
@Override
void notice() {
   System.out.println("Notice: This is a Luggage compartment.");
}
}
