class operator{
    public static void main(String a[]){
            // arithmetic operator
            int num1 = 10;
            int num2 = 22;
            int result = num1 + num2; // we can use (- + * /) 
            System.out.println(result);

            // relational operator
            System.out.println(num1 > num2);
            // we can use "== > < <= etc"

            // LOGICAL Operator
            System.out.println(num1 > num2 || num2 > num1);
            //  we can use '&& || !'

            // conditional operator
            if(num2 > num1){
                System.out.println(true);
            }
            // we can use if else and ternary operator
            if(num1 > num2){
                System.out.println("true");
            }else{
                System.out.println(false);
            }
            // ternary 
            System.out.println(num1 > num2 ? "this is good" : "not good");
            //  not like JS it return String

            // switch case
            switch (10) {
                case 10:
                    System.err.println("ten");
                    break;
            
                default:
                    break;
            }
            // same like JS

            
    }

}

