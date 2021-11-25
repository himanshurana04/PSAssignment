package zoo;
import org.animals.*;
public class Display {
public void display() {
	Deer deer=new Deer();
	Elephant elephant = new Elephant();
	Lion lion =new Lion();
	Giraffe giraffe=new Giraffe();
	Tiger tiger=new Tiger();
	Monkey monkey=new Monkey();
	System.out.println("DEER : age  "+deer.age+"  weight  "+deer.weight+"  color  "+deer.color+" isVegetarian: "+lion.isVegeterian()+" canClimb: "+lion.canClimb());
	System.out.println("MONKEY : age "+monkey.age+" weight  "+monkey.weight+" color  "+monkey.color+" isVegetarian "+monkey.isVegeterian()+" canClimb:"+monkey.canClimb());
	System.out.println("TIGER age: "+tiger.age+"  weight "+tiger.weight+" color "+tiger.color+" isVegetarian: "+tiger.isVegeterian());
	System.out.println("LION : "+lion.age+" "+lion.weight+" "+lion.color);
	System.out.println("giraffe age: "+giraffe.age+" weight "+giraffe.weight+" color "+giraffe.color);
	System.out.println("Elephant age: "+elephant.age+" weight "+elephant.weight+" color "+elephant.color);
	
}
}
