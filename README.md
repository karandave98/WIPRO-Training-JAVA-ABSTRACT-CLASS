# WIPRO-Training-JAVA-ABSTRACT-CLASS
Abstract Class Wipro Training Module.
There is 3 assignments each assignment does as per say
1. -  Create a class called GeneralBank that acts as base class for all banks. This class has getSavingsInterestRate and 
    getFixedDepositInterestRate methods, which returns the savings account interest rate and fixed deposit account interest rate that the     specific bank gives. Since GeneralBank cannot say what percentage which bank would give, make these methods abstract.
  Create two subclasses of GeneralBank called ICICIBank and KotMBank. Override the inherited methods from the base class. The following     are the interest rates of these banks.
  ICICIBank - Savings 4% Fixed 8.5% and 
  KotMBank - Savings 6% Fixed 9%.

  Create a main method to test the above classes and their methods. Try one by one and observe your findings
  a) ICICIBank i=new ICICIBank();
  b) KotMBank k=new KotMBank();
  c) GeneralBank g=new KotMBank();
  d) GeneralBank g=new ICICIBank()
  
2. -  Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class. 
  public abstract String notice();
Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the notice function in each of them to print notice message that is suitable to the specific type of  compartment.
Create a class TestCompartment.Write main function to do the following:
Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
Check the polymorphic behavior of the notice method.
[i.e based on the random  number genererated, the first compartment can be Luggage, the second one could be Ladies and so on..]

3.- Create an abstract class Instrument which is having the abstract function play. 
    Create three more sub classes from Instrument which is Piano, Flute, Guitar. Override the play method inside all three classes printing a message 
“Piano is playing  tan tan tan tan  ”  for Piano class
“Flute is playing  toot toot toot toot”  for Flute class
“Guitar is playing  tin  tin  tin ”  for Guitar class 

Create an array of 10 Instruments.
Assign different type of instrument to Instrument reference.
Check for the polymorphic behavior of  play method.
Use the instanceof operator to print which object is stored at which index of instrument array.
