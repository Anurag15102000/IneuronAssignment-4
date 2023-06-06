import java.util.Scanner;
public class Q4{
public static void main(String args[]){ 
    String str;
int vCount=0,cCount=0,spe_Char=0;

str="Thursday@";
for(int i=0; i<=str.length()-1; i++){
char ch=str.charAt(i);
if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u' 
    ||ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U' ){
        vCount++;
    }
    else if((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' )){  
        cCount++;
    }

    else{
        spe_Char++;
    }
}
System.out.println("\nTotal Vowels: "+vCount);
System.out.println("Total consonants: "+cCount);
System.out.println("Total special characters: "+(spe_Char));
}
}