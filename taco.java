public class taco {
    //A new class must be made. You should change this to match what your class should be named.

 taco(String rice,String protein, String [] toppings, boolean doubleProtein){
    rice = " ";
    protein = " ";
    toppings = new String [10];
    doubleProtein = false;

    



    }


   
public void addRice(String x){
    
    String y=x.toLowerCase();
    if(y.contains("white")){
    y="white";
    System.out.println("Ok, White Rice, what beans would you like on your burrito");
    
    }
    else if(y.contains("brown rice")){
    y="brown rice";
    System.out.println("Ok,Brown Rice, What beans would you like on your burrito");
  
    }
    else if(y.contains("brown") && y.contains("white")){
    y="Brown and White rice";
    System.out.println("Ok, both rices, What beans would you like on your burrito");
    
    }
    else if(y.contains("no")){
    y="No rice";
    System.out.println("Ok, No rice, What beans would you like on your burrito");
  
    }
    
    }
    


       
    


public void addMeat(String meat,double cost){
    String a=meat.toLowerCase();
        if(a.contains("steak")){
        cost+=2.35;
        a="steak";
       
        System.out.println("Ok, Steak. would you like double protein");
      
        }
        else if (a.contains("chicken")){


          System.out.println("Ok, Chicken. would you like double protein");   
        }else if (a.contains("barbacoa")){
         System.out.println("Ok, Barbacoa. would you like double protein");
        
        }
        else if (a.contains("brisket")){
         System.out.println("Ok, Smoked Brisket. would you like double protein");
          cost += 4.45;
         }else if (a.contains("no")){
         System.out.println("Ok, no protein");
         }
}
public void checkDp(String x, double costdp){

if(x.contains("yes")){
    System.out.println("bigback. Here's your second scoop of protein!! what toppings");
    costdp+=2.0;
}
else{
System.out.print("ok, any toppings you would like to add?");
}




}
public void addToppings(String x){
String a=x.toLowerCase();
if(a.contains("tomato")){  

System.out.println("ok tomato salsa");
}
else if (a.contains("corn")){
    System.out.println("ok corn salsa, would you like to add more toppings?");
}
else if (a.contains("green chili")){
    System.out.println("ok green chili salsa, would you like to add more toppings?");
}
else if (a.contains("red chili")){
    System.out.println("ok red chili salsa, would you like to add more toppings?");
}
else if (a.contains("sour cream")){
    System.out.println("ok sour cream, would you like to add more toppings?");
}else if (a.contains("guac")){
    
    System.out.println("ok guacamole, would you like to add more toppings?");
  
}
else if (a.contains("lettuce")){
    System.out.println("ok lettuce,would you like to add more toppings?");
}    
    
    
}
public void addBeans(String x){
    String a=x.toLowerCase();
    //black, pinto, 
    if(a.contains("black")&& a.contains("pinto")){
     System.out.println("Ok, Both types of beans, what protein would you like on your burrito");

    }
    else if(a.contains("pinto")){
        System.out.println("Ok, Pinto beans, what protein would you like on your burrito");
    }
    else if(a.contains("black")){
    System.out.println("Ok, Black beans, what protien would you like on your burrito");  
    
    }
    else if(a.contains("no")){
        System.out.println("Ok, no beans, what protein would you like");
    }
}
}