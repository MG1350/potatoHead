public class potatoHead
{ 

//instance variables - to be used in all methods in the class 
private String colorEye;
private String colorNose;
private String colorShoe;
private boolean hasStache;
private boolean hasHat;
/*************************************************************************/ 

//constructors 
//default constructor 
public potatoHead() 
{ 
    colorEye = "black";
    colorNose = "brown";
    colorShoe = "black";
    hasStache = true;
    hasHat = true;
} 
//initializer/ parameterized constructor 
public potatoHead(String eye, String nose, String shoe, boolean stache, boolean hat) 
{ 
    colorEye = eye;
	colorNose = nose;
    colorShoe = shoe;
    hasStache = stache;
    hasHat = hat;
} 
/******************************************************/ 

//Accessor Methods 
public String getColorEye() 
{ 
    return colorEye; 
} 
public String getColorNose() 
{ 
    return colorNose; 
} 
public String getColorShoe() 
{ 
    return colorShoe; 
} 
public boolean getHasStache() 
{ 
    return hasStache; 
} 
public boolean getHasHat() 
{ 
    return hasHat; 
} 
/**********************************************************************/ 

//mutator methods 
public void setColorEye(String color) 
{ 
    colorEye = color;
}
public void setColorNose(String color) 
{ 
    colorNose = color;
} 
public void setColorShoe(String color) 
{ 
    colorShoe = color;
} 
public void setHasStache(boolean state) 
{ 
    hasStache = state;
} 
public void setHasHat(boolean state) 
{ 
    hasHat = state;
} 
/********************************************************************/ 
public void talk()
{
    System.out.println("Hello");
}
public String fight(potatoHead one, potatoHead two)
{
    double win = Math.random();
    if (win > 0.5)
    {
        return "The winner is " + one.toString();
    }
    else
    {
        return "The winner is " + two.toString();
    }
}
public void jump()
{
    double jump = Math.random();

    System.out.println("A potato just jumped " + (int) (jump * 10) + " feet!");
}
//Other methods 
/*****************************************************/


//toString 
public String toString() 
{ 
    return "a potato head with " + colorEye + " eyes, " + colorNose + " nose, " + colorShoe + " shoes.\nHas a mustache? " + hasStache + " Has a hat? " + hasHat;
} 
/*****************************************************/ //main method 
public static void main (String [] args) 
{ 
//create objects or instances
    potatoHead pot = new potatoHead();
    potatoHead pot1 = new potatoHead("red", "orange", "yellow", true, true);
    potatoHead pot2 = new potatoHead("pink", "green", "blue", true, false);
    potatoHead pot3 = new potatoHead("brown", "blue", "orange", false, false);
//call or access constructors
//call or access (test) all of the methods
    System.out.println("Potato is " + pot.toString());
    System.out.println("Potato 1 is " + pot1.toString());
    System.out.println("Potato 2 is " + pot2.toString());
    System.out.println("Potato 3 is " + pot3.toString());
    pot.talk();
    pot.jump();
    System.out.println(pot.fight(pot, pot1));
} 
}
