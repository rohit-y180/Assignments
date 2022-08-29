import java.util.Scanner;

class print{
    void print_ln(String arg){
        System.out.println(arg);
    }
}

class check_prime
{
    public static void main(String args[]) {
        print p=new print();
        p.print_ln("please enter a number to check if it's prime or not");
        Scanner scan=new Scanner(System.in);
        try {
            int num = scan.nextInt();
        int prime_flag=1;
        if (num <= 1)
        prime_flag=0;
        if (num==2)
        prime_flag=1;
        for (int i = 3; i < num/2; i++){
            if (num % i == 0)
            {
            prime_flag=0;
            break;
            }
            else
            prime_flag=1;
        }
  
        if(prime_flag==1)
        p.print_ln("number is prime");
        else
        p.print_ln("number is not prime");
        scan.close();
        } catch (Exception e) {
            p.print_ln("error occured, try again !");
        }
        

    }
}
