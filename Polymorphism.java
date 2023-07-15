package dynamic;

public class Polymorphism {
public static void main(String[] args) {
	Cat c =new Cat();
	Dog d =new Dog();
	Snake s=new Snake();
	
	Stimulator.ansim(c);
	Stimulator.ansim(d);
	Stimulator.ansim(s);
}
}

class Animal
{
	void noise()
	{
		System.out.println("animal noise ");
	}
}
class Cat extends Animal
{
	void noise()
	{
		System.out.println("cat noise");
	}
}
class Dog extends Animal
{
	void noise()
	{
		System.out.println("dog noise");
	}
}
class Snake extends Animal
{
	void noise()
	{
		System.out.println("snake noise");
	}
}
class Stimulator
{
	static void ansim(Animal a)
	{
		a.noise();
	}
}