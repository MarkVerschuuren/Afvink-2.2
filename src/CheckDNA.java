import java.util.Arrays;

/**
 * Created by Mark Verschuuren on 27-12-2016.
 */
public class CheckDNA {
    public void Iteration(String DNA){
        for(char c: DNA.toCharArray()){
            if (Character.toString(c).equals("A") || Character.toString(c).equals("C") || Character.toString(c).equals("G") || Character.toString(c).equals("T")){
                System.out.println("DNA!");
            }
            else{
                System.out.println("This is not DNA!");
            }
        }
    }
    public void Recursion(String DNA, int index){
        if(index+1 <= DNA.length()) {
            System.out.println(Character.toString(DNA.charAt(index)));

            if (Character.toString(DNA.charAt(index)).equals("A") || Character.toString(DNA.charAt(index)).equals("G") || Character.toString(DNA.charAt(index)).equals("C") || Character.toString(DNA.charAt(index)).equals("T")) {
                System.out.println(index);
                Recursion(DNA, index + 1);
            } else {
                System.out.println("Not DNA!");
            }
        }
        


        }




    }

