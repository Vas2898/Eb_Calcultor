import java.util.Scanner;
class EB_Calculator
{
public static void main(String[] args)
{

EB_Calculator reader = new EB_Calculator();

reader.calculate_Units();

}
void calculate_Units(){
System.out.println("Enter Total units: ");
Scanner input = new Scanner(System.in);
int units = input.nextInt();
double price = 0;
if(units > 100)
{
int newunits = (units-100);
price = 2.25;
System.out.println("Total Amount : "+newunits * price);
}
else{

System.out.println("Total Amount : "+ price);
}
}
}
