

public class Main  {

    
    public static void main(String[] args) {
        Integer number1= 10;
        Integer number2 = 5;
        Integer number3 = 6;
        if (number1 > number2 && number1 > number3){
            System.out.println(number1 + " es el número mayor");
            if(number2<number3){
                System.out.println("y el " + number2 + " es el menor");
            }else{
                System.out.println("y el " + number3 + " es el menor");
            }
            
        }
        if (number2 > number1 && number2 > number3){
            System.out.println(number2 + " es el número mayor");
            if(number1<number3){
                System.out.println("y el " + number1 + " es el menor");
            }else{
                System.out.println("y el " + number3 + " es el menor");
            }
        }
        if (number3 > number1 && number3 > number2){
            System.out.println(number3 + " es el número mayor");
            if(number2<number1){
                System.out.println("y el " + number2 + " es el menor");
            }else{
                System.out.println("y el " + number1 + " es el menor");
        
    }
}
}
}
