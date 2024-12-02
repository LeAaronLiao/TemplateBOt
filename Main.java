import java.util.Scanner;
//
public class Main
{

    
    
    //Aaron-I named some of the string after internet refrences because i didnt know what to name it 
    static String[] goodBye = {"bye","adios","later","seeya","goodbye","skibidi"};
    static String text=" ";
static int zero=0;
   
       public static void main(String[] args){
        
        Scanner in = new Scanner (System.in);
        String msgResp=" ";
        double cost=0.0;
        int count=0;
        boolean tf=false;

        String[] protein=new String[2];
        String[] something=new String[10];
        System.out.println("MENU: Burrito, Bowl, Taco");
        System.out.println("Rice: White Rice, Brown Rice");
        System.out.println("Beans: Black Beans, Pinto Beans");
        System.out.println("Protein: Steak, Chicken, Barbacoa, Brisket");
        System.out.println("Toppings: Tomato Salsa (Pico), Green Chilli Salsa (Medium), Red Chilli Salsa (Hot), Corn Salsa, Sour Cream, Cheese, Guac, Lettuce");
        System.out.println("We will only accept up to 10 topping additions, any more requests will be rejected as we need to save toppings fo the other customers");
        System.out.println("hello welcome to Chipotle, my name is burritobot, and i exist to serve digital food items from chipotle to whomever is on the other side ordering,(only ONE order at a time please :)");
        

        while(!(msgResp.contains("bye")||msgResp.contains("goodbye")||msgResp.contains("adios")||msgResp.contains("seeya")||msgResp.contains("later")||msgResp.contains("skibidi")||msgResp.contains("sayonara")||msgResp.contains("ciao"))){
        
        msgResp = in.nextLine();
        System.out.println(msgResp);
        if(msgResp.contains("no")){
        msgResp="bye";
        }
        tf=loopBreaker(msgResp);
        if(tf){
        break;
        }
       System.out.println("What would you like to order?");
        msgResp = in.nextLine();
        System.out.println(msgResp);
        tf=loopBreaker(msgResp);
        if(tf){
        break;
        }
        if(msgResp.contains("what do you do")){
        System.out.println("my name is burritobot, and i exist to serve digital food items from chipotle to whomever is on the other side ordering");
        }
        
        if(msgResp.contains("bowl")){
            cost+=10.0;
            String a= " ";
            String b= " ";
            String[]c= new String[10];
            Boolean d=false;
            burritobowl order= new burritobowl(a,b,c,d);
    
            System.out.println("What rice would you like on your burrito bowl");
            msgResp =in.nextLine();
            System.out.println(msgResp);
            tf=loopBreaker(msgResp);
            if(tf){
            break;
            }
            while(!(msgResp.contains("rice")||msgResp.contains("no"))){
            System.out.println(getRandomResponse("Please order something on our menu", "Please order a valid rice","Please order something i can actually make","Sir I am Kindly requesting you to make a makeable order", "Please order something else", "I cannot make this try agin por favor"));
            msgResp=in.nextLine();
            }
            if(msgResp.contains("rice")){
            order.addRice(msgResp);
            }
            if(msgResp.contains("no")){
            order.addRice(msgResp);
            }
            msgResp=in.nextLine();
            System.out.println(msgResp);
            tf=loopBreaker(msgResp);
            if(tf){
            break;
            }
            while(!(msgResp.contains("pinto")||msgResp.contains("black")||msgResp.contains("no"))){
             System.out.println(getRandomResponse("Please select either black or pinto beans", "I'm sorry, I'm not sure what that means", "Hmm. What type of beans would you like", "If you do not want beans, please type 'no'", "I've never heard of that type of beans", " Please choose either black, pinto, or no beans"));
            msgResp=in.nextLine();
            tf=loopBreaker(msgResp);
            if(tf){
            break;
            }
            }
            tf=loopBreaker(msgResp);
            if(tf){
            break;
            }
            order.addBeans(msgResp);
            msgResp =in.nextLine();
            System.out.println(msgResp);
            tf=loopBreaker(msgResp);
            if(tf){
            break;
            }
            while(!(msgResp.contains("steak")||msgResp.contains("chicken")||msgResp.contains("barbacoa")||msgResp.contains("brisket")||msgResp.contains("no"))){
            System.out.println(getRandomResponse("Please order something on our menu", "Please order a valid protein","Please order something i can actually make","Sir I am Kindly requesting you to make a makeable order", "Please order something else", "I cannot make this try agin por favor"));
            msgResp=in.nextLine();
            tf=loopBreaker(msgResp);
            if(tf){
            break;
            }
            }
            String sigma=msgResp.toLowerCase();
            protein[0]=sigma;
            order.addMeat(msgResp,cost);
            msgResp=in.nextLine();
            System.out.println(msgResp);
            tf=loopBreaker(msgResp);
            if(tf){
            break;
            }
           while(!(msgResp.contains("no")||msgResp.contains("yes"))){
            System.out.println(getRandomResponse("yes or no", "Please select an option","Yes double protien or no double protien","Sir I am Kindly requesting you to make a makeable order", "Select an option please", "I cannot make this try agin por favor"));
            msgResp=in.nextLine();
    }       
            String tuah=msgResp.toLowerCase();
            protein[1]=tuah;
            order.checkDp(msgResp,cost);
            msgResp =in.nextLine();
            System.out.println(msgResp);
            tf=loopBreaker(msgResp);
            if(tf){
            break;
            }
            String strong=msgResp.toLowerCase();
            something[0]=strong;
            
            while(!(msgResp.contains("tomato")||msgResp.contains("corn")||msgResp.contains("green chili")||msgResp.contains("red chili")||msgResp.contains("sour cream")||msgResp.contains("lettuce")||msgResp.contains("guac")||msgResp.contains("no"))){
                    System.out.println(getRandomResponse("yes or no", "Please select an option","More toppings or no","Sir I am Kindly requesting you to make a makeable order", "Select an option please", "I cannot make this try agin por favor"));
             msgResp=in.nextLine();
             System.out.println(msgResp);
             tf=loopBreaker(msgResp);
            if(tf){
            break;
            }
            }
            for(int i=0;i<10;i++){
             if(!(msgResp.contains("no"))){
            order.addToppings(msgResp);
            String j=msgResp.toLowerCase();
            something[i]=j;
            count++;
            msgResp=in.nextLine();
            System.out.println(msgResp);
            tf=loopBreaker(msgResp);
            if(tf){
            break;
            }
            if(msgResp.contains("no")){
            break;
            }
            if(!(msgResp.contains("tomato")||msgResp.contains("corn")||msgResp.contains("green chili")||msgResp.contains("red chili")||msgResp.contains("sour cream")||msgResp.contains("lettuce")||msgResp.contains("guac"))||msgResp.contains("no")){
             System.out.println(getRandomResponse("yes or no", "Please select an option","More toppings or no","Sir I am Kindly requesting you to make a makeable order", "Select an option please", "I cannot make this try agin por favor"));
            }
            if(msgResp.contains("no")){
            break;
            }
    
             }
             
            }
            tf=loopBreaker(msgResp);
            if(tf){
            break;
            }
        }
        else if(msgResp.indexOf("burrito")!=-1){
        cost+=10.0;
        String a= " ";
        String b= " ";
        String[]c= new String[10];
        Boolean d=false;
        burrito order= new burrito(a,b,c,d);

        System.out.println("What rice would you like on your burrito");
        msgResp =in.nextLine();
        System.out.println(msgResp);
        tf=loopBreaker(msgResp);
        if(tf){
        break;
        }
        while(!(msgResp.contains("rice")||msgResp.contains("no"))){
        System.out.println(getRandomResponse("Please order something on our menu", "Please order a valid rice","Please order something i can actually make","Sir I am Kindly requesting you to make a makeable order", "Please order something else", "I cannot make this try agin por favor"));
        msgResp=in.nextLine();
        }
        if(msgResp.contains("rice")){
        order.addRice(msgResp);
        }
        if(msgResp.contains("no")){
        order.addRice(msgResp);
        }
        msgResp=in.nextLine();
        System.out.println(msgResp);
        tf=loopBreaker(msgResp);
        if(tf){
        break;
        }
        while(!(msgResp.contains("pinto")||msgResp.contains("black")||msgResp.contains("no"))){
         System.out.println(getRandomResponse("Please select either black or pinto beans", "I'm sorry, I'm not sure what that means", "Hmm. What type of beans would you like", "If you do not want beans, please type 'no'", "I've never heard of that type of beans", " Please choose either black, pinto, or no beams"));
        msgResp=in.nextLine();
        tf=loopBreaker(msgResp);
        if(tf){
        break;
        }
        }
        tf=loopBreaker(msgResp);
        if(tf){
        break;
        }
        order.addBeans(msgResp);
        msgResp =in.nextLine();
        System.out.println(msgResp);
        tf=loopBreaker(msgResp);
        if(tf){
        break;
        }
        while(!(msgResp.contains("steak")||msgResp.contains("chicken")||msgResp.contains("barbacoa")||msgResp.contains("brisket")||msgResp.contains("no"))){
        System.out.println(getRandomResponse("Please order something on our menu", "Please order a valid protein","Please order something i can actually make","Sir I am Kindly requesting you to make a makeable order", "Please order something else", "I cannot make this try agin por favor"));
        msgResp=in.nextLine();
        tf=loopBreaker(msgResp);
        if(tf){
        break;
        }
        }
        String sigma=msgResp.toLowerCase();
        protein[0]=sigma;
        order.addMeat(msgResp,cost);
        msgResp=in.nextLine();
        System.out.println(msgResp);
        tf=loopBreaker(msgResp);
        if(tf){
        break;
        }
       while(!(msgResp.contains("no")||msgResp.contains("yes"))){
        System.out.println(getRandomResponse("yes or no", "Please select an option","Yes double protien or no double protien","Sir I am Kindly requesting you to make a makeable order", "Select an option please", "I cannot make this try agin por favor"));
        msgResp=in.nextLine();
}       
        String tuah=msgResp.toLowerCase();
        protein[1]=tuah;
        order.checkDp(msgResp,cost);
        msgResp =in.nextLine();
        System.out.println(msgResp);
        tf=loopBreaker(msgResp);
        if(tf){
        break;
        }
        String strong=msgResp.toLowerCase();
        something[0]=strong;
        
        while(!(msgResp.contains("tomato")||msgResp.contains("corn")||msgResp.contains("green chili")||msgResp.contains("red chili")||msgResp.contains("sour cream")||msgResp.contains("lettuce")||msgResp.contains("guac")||msgResp.contains("no"))){
                System.out.println(getRandomResponse("yes or no", "Please select an option","More toppings or no","Sir I am Kindly requesting you to make a makeable order", "Select an option please", "I cannot make this try agin por favor"));
         msgResp=in.nextLine();
         System.out.println(msgResp);
         tf=loopBreaker(msgResp);
        if(tf){
        break;
        }
        }
        for(int i=0;i<10;i++){
         if(!(msgResp.contains("no"))){
        order.addToppings(msgResp);
        String j=msgResp.toLowerCase();
        something[i]=j;
        count++;
        msgResp=in.nextLine();
        System.out.println(msgResp);
        tf=loopBreaker(msgResp);
        if(tf){
        break;
        }
        if(msgResp.contains("no")){
        break;
        }
        if(!(msgResp.contains("tomato")||msgResp.contains("corn")||msgResp.contains("green chili")||msgResp.contains("red chili")||msgResp.contains("sour cream")||msgResp.contains("lettuce")||msgResp.contains("guac"))||msgResp.contains("no")){
         System.out.println(getRandomResponse("yes or no", "Please select an option","More toppings or no","Sir I am Kindly requesting you to make a makeable order", "Select an option please", "I cannot make this try agin por favor"));
        }
        if(msgResp.contains("no")){
        break;
        }

         }
         
        }
        tf=loopBreaker(msgResp);
        if(tf){
        break;
        }

}        




        
        if(msgResp.indexOf("taco")!=-1){
            cost+=10.0;
        String a= " ";
        String b= " ";
        String[]c= new String[10];
        Boolean d=false;
        taco order= new taco(a,b,c,d);

        System.out.println("what beans would you like on your taco");
        msgResp=in.nextLine();
        System.out.println(msgResp);
        tf=loopBreaker(msgResp);
        if(tf){
        break;
        }
        while(!(msgResp.contains("pinto")||msgResp.contains("black")||msgResp.contains("no"))){
         System.out.println(getRandomResponse("Please select either black or pinto beans", "I'm sorry, I'm not sure what that means", "Hmm. What type of beans would you like", "If you do not want beans, please type 'no'", "I've never heard of that type of beans", " Please choose either black, pinto, or no beams"));
        msgResp=in.nextLine();
        tf=loopBreaker(msgResp);
        if(tf){
        break;
        }
        }
        tf=loopBreaker(msgResp);
        if(tf){
        break;
        }
        order.addBeans(msgResp);
        msgResp =in.nextLine();
        System.out.println(msgResp);
        tf=loopBreaker(msgResp);
        if(tf){
        break;
        }
        while(!(msgResp.contains("steak")||msgResp.contains("chicken")||msgResp.contains("barbacoa")||msgResp.contains("brisket")||msgResp.contains("no"))){
        System.out.println(getRandomResponse("Please order something on our menu", "Please order a valid protein","Please order something i can actually make","Sir I am Kindly requesting you to make a makeable order", "Please order something else", "I cannot make this try agin por favor"));
        msgResp=in.nextLine();
        tf=loopBreaker(msgResp);
        if(tf){
        break;
        }
        }
        String sigma=msgResp.toLowerCase();
        protein[0]=sigma;
        order.addMeat(msgResp,cost);
        msgResp=in.nextLine();
        System.out.println(msgResp);
        tf=loopBreaker(msgResp);
        if(tf){
        break;
        }
       while(!(msgResp.contains("no")||msgResp.contains("yes"))){
        System.out.println(getRandomResponse("yes or no", "Please select an option","Yes double protien or no double protien","Sir I am Kindly requesting you to make a makeable order", "Select an option please", "I cannot make this try agin por favor"));
        msgResp=in.nextLine();
}       
        String tuah=msgResp.toLowerCase();
        protein[1]=tuah;
        order.checkDp(msgResp,cost);
        msgResp =in.nextLine();
        System.out.println(msgResp);
        tf=loopBreaker(msgResp);
        if(tf){
        break;
        }
        String strong=msgResp.toLowerCase();
        something[0]=strong;
        
        while(!(msgResp.contains("tomato")||msgResp.contains("corn")||msgResp.contains("green chili")||msgResp.contains("red chili")||msgResp.contains("sour cream")||msgResp.contains("lettuce")||msgResp.contains("guac")||msgResp.contains("no"))){
                System.out.println(getRandomResponse("yes or no", "Please select an option","More toppings or no","Sir I am Kindly requesting you to make a makeable order", "Select an option please", "I cannot make this try agin por favor"));
         msgResp=in.nextLine();
         System.out.println(msgResp);
         tf=loopBreaker(msgResp);
        if(tf){
        break;
        }
        }
        for(int i=0;i<10;i++){
         if(!(msgResp.contains("no"))){
        order.addToppings(msgResp);
        String j=msgResp.toLowerCase();
        something[i]=j;
        count++;
        msgResp=in.nextLine();
        System.out.println(msgResp);
        tf=loopBreaker(msgResp);
        if(tf){
        break;
        }
        if(msgResp.contains("no")){
        break;
        }
        if(!(msgResp.contains("tomato")||msgResp.contains("corn")||msgResp.contains("green chili")||msgResp.contains("red chili")||msgResp.contains("sour cream")||msgResp.contains("lettuce")||msgResp.contains("guac"))||msgResp.contains("no")){
         System.out.println(getRandomResponse("yes or no", "Please select an option","More toppings or no","Sir I am Kindly requesting you to make a makeable order", "Select an option please", "I cannot make this try agin por favor"));
        }
        if(msgResp.contains("no")){
        break;
        }

         }
         
        }
        tf=loopBreaker(msgResp);
        if(tf){
        break;
        }
        
}

        else {
        if(!(msgResp.contains("bye")||msgResp.contains("goodbye")||msgResp.contains("adios")||msgResp.contains("seeya")||msgResp.contains("later")||msgResp.contains("burrito")||msgResp.contains("taco")||msgResp.contains("bowl")||msgResp.contains("no"))){
        System.out.println(getRandomResponse("???", "...", "are you hear to eat or not","stop fooling around", "please stop", "I am not being paid minimum wage for this, just order"));
}
        
        }

         String[] toppings=new String [count];
      msgResp=in.nextLine();
      System.out.println(msgResp);
      int counter=0;
for(int i=0;i<something.length;i++){
        if(something[i]!=null){
         toppings[counter]=something[i];        
         counter++;
        }
    }
        System.out.println("Your order is"+price(protein,toppings,cost)+"dollars");
    
      System.out.println("would you like to add anything to your order");
       
}
System.out.println("come again!");

       
        
}
        

       
       

       

       
       public static String getRandomResponse(String x, String y, String z,String a, String b, String c){
        String [] gibberish = new String [] {x, y, z, a, b, c};
        int skibidi=(int)((6*Math.random()));


            return gibberish[skibidi];
            
       }
       public static double price(String[] a, String[] b, double money) {
        String[] c = new String[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int k = 0; k < b.length; k++) { 
            c[a.length + k] = b[k]; 
        }
        for (String item : c) {
            if (item != null) { 
                if (item.contains("steak") || item.contains("chicken")) {
                    money += 2.35;
                }
                if (item.contains("guac")) {
                    money += 1.25;
                }
                if (item.contains("yes")) {
                    money += 2;
                }
            }
        }
        return money;
    }
    public static boolean loopBreaker(String input) {
        String[] exitKeywords = {"goodbye", "bye", "adios", "seeya", "later", "ciao", "sayonara", "im out"};
        for (String keyword : exitKeywords) {
            if (input.contains(keyword)) {
                return true; 
            }
        }
        return false; 
    }


}