public class loops {
    public static void main(String[] args) {
        // for Each loop in java is very 
        int[] arr = {0,1,3,3,5,6};
        for (int elm : arr ) {
            // System.out.println(elm);
        }
        // loop for string
        String[] alpha = {"A","B","C","D","E","F","G","H"};
        for (String elm : alpha ) {
            // System.out.println(elm);
        }
        // for loop
        for(int i = 0; i < 5; i++){
            System.out.println(alpha[i]);
        }

        // while loop
        int i = 0;
        while(i<2){
            System.out.println(arr[i]);
            i++;
        }

        // do while loop
        do{
            System.out.println(arr[i]);
            i++;
        }while(i<2);
    }
}
