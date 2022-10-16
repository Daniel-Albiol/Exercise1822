import java.util.Scanner;
public class Exercise1822 {
    public static void main(String[] argv) {
        int hoursWorked;
        int priceHour;
        int extraHour = 0;
        int extraSalary;
        double netPay = 0;
        int grossPay;
        int standarPay;
        double extraPay;
        double tax;


        System.out.print("Enter a hour worked:");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        hoursWorked = inputValue.nextInt();
        System.out.println("This month you have worked " + hoursWorked + " hours");
        //////////////////////////
        System.out.print("Enter a price hour:");
        Scanner priceH;
        priceH = new Scanner(System.in);
        priceHour = priceH.nextInt();
        System.out.println("El precio por hora es:  " + priceHour + "€");
        System.out.println("El sueldo bruto es: " + (priceHour * hoursWorked));
        //////////////////
        System.out.println("Este mes el trabajador ha hecho " + (hoursWorked - 35) + " horas extra");
        // Cálculo del sueldo de las horas extra
        if (hoursWorked > 35) {
            extraHour = hoursWorked - 35;
        }
        netPay = netPay + extraHour * priceHour * 1.5;
        System.out.println("El sueldo neto sumaría : " + (netPay));

        //Cálculo tasas
        extraPay = 0;
        if (netPay >= 500) {
            extraPay = netPay - 500.0;
            System.out.println("Descontando los 500 libres de impuestos, has cobrado: " + extraPay);
        }
        if (extraPay <= 400) {
            System.out.println("Las tasas suman: " + (extraPay * 25 / 100));
        } else {
            if (extraPay > 400) {
                //extraPay = extraPay - 400;
                System.out.println("extrapay vale " + extraPay);
                tax = (extraPay * 25 / 100);
                System.out.println("The first taxes are " + tax + "€");
                tax = tax + (extraPay * 45 / 100);
                System.out.println("Las tasas son: " + tax);

            }
        }
    }
}
