package _02_smurf;

import java.awt.Color;

public class SmurfsRunner {
	public static void main(String[] args) {
		
	
Smurf handysmurf = new Smurf("Handys");
Smurf papa = new Smurf ("papAa");
Smurf smurfette = new Smurf("smurfy");
	handysmurf.getName();
	System.out.println("My name is Handys smurf. I am the handy smurf.");
handysmurf.eat();

papa.eat();
papa.getHatColor();
System.out.println("red");
papa.getName();
System.out.println("My name is papAa smurf");

	System.out.println("PapAa is a boy");
	
	smurfette.eat();
	smurfette.getHatColor();
	System.out.println("white");
smurfette.getName();
System.out.println("My name is Smurfy smurf");

}}
