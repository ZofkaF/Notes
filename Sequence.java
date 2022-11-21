 
import javax.swing.JOptionPane;

public class Sequence {

    static void Matrix1(){

        int i = 1;
        while(i<10){

            if(i%3 == 1){
                System.out.print(i + " ");
                i+=1;
            }
            System.out.println();

        }
    }

    static void Matrix2(){
        int i = 1;
        while(i<151){

            if(i%3 == 1){
            System.out.println();
            }

            System.out.print(i + " ");
            i+=1; 
        }

    }

    static void Matrix3(){
        int i = 1;
        while(i<101){

            if(i%6 == 1){
            System.out.println();
            }

            System.out.print(i + " ");
            i+=1; 
        }

    }

    static void Matrix4(){
        int i = 1;
        while(i<10){

            if(i%5 == 0){
                break;
            }

            if(i%3 == 1){
            System.out.println();
            }

            System.out.print(i + " ");
            i+=1; 
        }
        
        i+=1;
        while (i<11){
            if(i%3 == 2){
                System.out.println();
                }
    
                System.out.print(i + " ");
                i+=1; 
        }
    } 

    static void WeirdSequence(){

        for(int i = 1; i<5; i = 2*i+1){
    
            for(int j = 1; j < 5; j++){
    
            if(i%2 == 0){
                System.out.print(2*i + " ");
            }else{
                System.out.print(i + " ");
            }
    
        }
        
        System.out.println("");

        }
    }

    static void SecondPower(){
        for(int g = 1; g < 11; g++) {        
            System.out.println((Math.pow(g, 2)));   //put the current g value to the second power
        }
    }

    static void Fibonacci(){
        int l = 1;
        int u = 1;
        
        for(int r = 1; r < 50;) {   
            System.out.println(r);  //print the lower-bound
            r = u + l;
            l = u;  
            u = r;   


        }
    } 

    static void NotSeven(){
            for(int i = 1; i < 100; i++) {   

                if (i%7!=0){ 
                System.out.println(i);   
                  
                }
            }
    }

    static void FifthOne(){
        for (int i = 5; i < 101; i+=5){
            if(i%3 != 0){
                System.out.print(i + " ");
            }
        }
    }

    static void Test(){
        for(int i = 100; i>-101; i-=2){
            if(i%10 != 0){
                System.out.println(i);
            }
        }
    }
    
    static void Stars(){
        int i = 1;
        int g = 1;
        while(i<=3){

            for(g = 1; g<i+1; g++){
            System.out.print("* ");

            }
            System.out.println();
            i++;

        }
    }

    static void Stars2(){
        int i = 1;
        int g = 3;
        while(i<4){

            for(g = 3; g>i-1; g--){
            System.out.print("* ");

            }
            System.out.println();
            i++;

        }
    }

    static void Stars3(){
        int i = 1; //amount of stars we begin with
        int g = 3; //amount of stars we print in the last line
        int n = 0; //amount of spaces we print
        while(i<4){

            for(g = 3; g>i-1; g--){
                for(n = 0; n<=3;){
                    System.out.print(" ");
                }
                System.out.print("* ");

            }
            System.out.println();
            i++;
            n++;

        }
    }

    static void RandomMatrix(){
            
            int i = 10;
            int j = 1;
            int g = 0;
            while(g<151){
                
                j = (int) Math.floor(Math.random())*9;

                if(j%i== 1){
                System.out.println();
                }
    
                System.out.print(j);
                g+=1; 
            }
    
    }




static void CountCode(){

    char c = 'c'; 
    char o = 'o';
    char m = 'm';
    char u = 'u';
    char n = 'n';    
    char i = 'i';
    char t = 't';
    char y = 'y';


    int a = 0; //count that keeps the value of how many symbols were correct
    int b = 0; //the amount of cd*e we found in the string

    String In = JOptionPane.showInputDialog("Give me a string"); //asking for a string to use
    String[] Array = In.split(""); //convert our string to array so we can go trough every character in the array


    for (int k = 0; k < Array.length; k++) { //go trough every character in the array
        
        char ch = In.charAt(k);
 
        if(ch == c){ //is character with index k 'c'? 
            a++; 
            char ch2 = In.charAt(k+1); 
            
            if(ch2 == o){ //is character with index k+1 'o'?
                a++;
                char ch3 = In.charAt(k+2);

                if(ch3 == m){ //is character with index k+2 'm'?
                a++;
                char ch4 = In.charAt(k+3);

                    if(ch4 == m){ //is character with index  k+3 'm'?
                    a++;
                    char ch5 = In.charAt(k+4);
                        if(ch5 == u){ //is character with index k+4 'u'?
                        a++;
                        char ch6 = In.charAt(k+5);
                            if(ch6 == n){ //is character with index k+5 'n'?
                            a++;
                            char ch7 = In.charAt(k+6);
                                if(ch7 == i){ //is character with index k+6 'i'?
                                a++;
                                char ch8 = In.charAt(k+7);
                                    if(ch8 == t){ //is character with index k+7 't'?
                                    a++;
                                    char ch9 = In.charAt(k+8);
                                        if(ch9 == y){ //is character with index k+8 'y'?
                                        a++;
                                        }
                                    }
                                }
                            }
                        }
                    } 
                }
            }
        }
        if(a == 9){ //if all three conditions are met then add one to b
            b++;
        }
        
        a = 0; //flush down a
    }
    System.out.println(b); //print how many times our conditions were met
}

static void VowelsCount(){
    int c = 0; //keeps count of the vowels
    String In = JOptionPane.showInputDialog("Give me a string"); //asking for a string to use
    String[] Array = In.split(""); //convert our string to array so we can go trough every character in the array


    for (int i = 0; i < Array.length; i++) { //go trough every character in the array
            
        char ch = In.charAt(i);
 
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y'){ //is character with index i a vowel? 
            c++; 
        }
        
    }
    System.out.println(c); //print the amount of vowels
}

    public static void main(String[] args){
     
        //SecondPower(); //calls the method

        //Fibonacci();

        //NotSeven();

        //WeirdSequence();

        //FifthOne();

        //Test();

        //Stars();

        //CountCode(); 

        VowelsCount();
        
    }
}