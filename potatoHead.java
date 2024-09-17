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

//Other methods 
/*****************************************************/


//toString 
public String toString() 
{ 
    return "A message that describes the object and its instance variables"; 
} 
/*****************************************************/ //main method 
public static void main (String [] args) 
{ 
//create objects or instances
    potatoHead pot = new potatoHead();
    potatoHead pot1 = new potatoHead("red", "orange", "yellow", true, true);
//call or access constructors
    String potEye = pot.getColorEye();
    String pot1Eye = pot1.getColorEye();
//call or access (test) all of the methods
    System.out.println(potEye);
    System.out.println(pot1Eye);


} 
}
