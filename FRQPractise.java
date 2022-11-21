 
public class FRQPractise{

    static void ReverseString(){
        String OriginalString = "DammitImMad";
        String Result = "";

        for(int i = 1; i<OriginalString.length()+1; i++){
            Result += OriginalString.substring(OriginalString.length()-i, OriginalString.length()-i+1);
        }
        System.out.println(OriginalString + " reversed is " + Result);
    }

    public static void main(String[] args){
        ReverseString();
    }
}

 
