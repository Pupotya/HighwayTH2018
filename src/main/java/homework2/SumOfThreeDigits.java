package homework2;

public class SumOfThreeDigits {


    public static void main(String[] args) {

        int n = 100;
        String nString = String.valueOf(n);
        String g="100";
        Double x = Double.valueOf(g);
        System.out.println(x);
        int answer=0;
        for (int i=0;i<nString.length();i++){
            answer += Character.getNumericValue(nString.charAt(i));
        }
        System.out.println(answer);
        while(true){


            if(true){
                break;
            }

        }
    }

}
