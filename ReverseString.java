// import java.util.*;
class ReverseString{
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);



        //case 1: pwskill==llikwp

        StringBuilder s=new StringBuilder("pwskill java");
       StringBuilder s1=new StringBuilder("");
       for(int i=s.length()-1;i>=0;i--){
            s1.append(s.charAt(i));
       }
        System.out.println(s1);


        // case 2: pwskill java === java pwskill

        String s2="Mohd Azeem";
        String s4="";
        String s3[]=s2.split(" ");
        for(int i=s3.length-1;i>=0;i--){
            s4=s4+ s3[i]+" ";
        }
        System.out.println(s4);



        // 
    }
    

}