import java.util.Scanner;

class TempConverter{
    float celsius;
    float kelvin;
    float fahrenheit;

    public float getCelsius() {
        return celsius;
    }

    public void setCelsius(float celsius) {
        this.celsius = celsius;
    }

    public float getKelvin() {
        return kelvin;
    }

    public void setKelvin(float kelvin) {
        this.kelvin = kelvin;
    }

    public float getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(float fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    Scanner sc = new Scanner(System.in);
     void menu(){
         char option;
         Scanner scanner = new Scanner(System.in);
         System.out.println("Welcome !");
         System.out.println("a. Celsius to Fahrenheit");
         System.out.println("b. Fahrenheit to Celsius ");
         System.out.println("c. Celsius to Kelvin");
         System.out.println("d. Kelvin to Celsius");
         System.out.println("e. Fahrenheit to Kelvin");
         System.out.println("f. Kelvin to Fahrenheit");
         System.out.println("g. Exit");
         do{
             System.out.println("Please choose an option:");
             option = sc.next().charAt(0);
            switch (option){
                case 'a':celsiusToFahrenheit();
                break;
                case 'b':fahrenheitToCelsius();
                break;
                case 'c':celsiusToKelvin();
                break;
                case 'd': kelvinToCelsius();
                break;
                case 'e': fahrenheitToKelvin();
                break;
                case 'f': kelvinToFahrenheit();
                break;
                case 'g': System.exit(0);
            }
         }while(true);
     }

    //  converting Celsius to Fahrenheit
    public void celsiusToFahrenheit() {
        System.out.println("Enter temperature in celsius :");
        setCelsius(sc.nextFloat());
        System.out.println("you entered: " + getCelsius() + " degree celsius");
        setFahrenheit((celsius * 1.8f) + 32);
        String strDouble = String.format("%.2f", getFahrenheit());
        System.out.println(getCelsius() +" Celsius converted to Fahrenheit is "+ strDouble);
        System.out.println("****************************************");
    }
    // converting Fahrenheit to celsius
    public void fahrenheitToCelsius(){
        System.out.println("Enter temperature in Fahrenheit:");
        setFahrenheit(sc.nextFloat());
        System.out.println("you entered: "+getFahrenheit() +" Fahrenheit");
        setCelsius((getFahrenheit() -32) * 0.5556f);
        String strDouble = String.format("%.2f", getCelsius());
        System.out.println(getFahrenheit() +" Fahrenheit converted to Celsius is "+ strDouble);
        System.out.println("****************************************");

    }
    // Converting Celsius to Kelvin
    public void celsiusToKelvin(){
        System.out.println("Enter temperature in Celsius:");
        setCelsius(sc.nextFloat());
        System.out.println("you entered: "+getCelsius() +" Celsius");
        setKelvin((getCelsius()+273.15f));
        String strDouble = String.format("%.2f", getKelvin());
        System.out.println(getCelsius() +" Celsius converted to Kelvin is "+ strDouble);
        System.out.println("****************************************");
    }
    // Converting Kelvin to Celsius
    public void kelvinToCelsius() {
        System.out.println("Enter temperature in Kelvin:");
        setKelvin(sc.nextFloat());
        System.out.println("you entered: "+getKelvin() +" Kelvin");
        setCelsius(getKelvin() - 273.15f);
        String strDouble = String.format("%.2f", getCelsius());
        System.out.println(getKelvin() +" Kelvin converted to Celsius is "+ strDouble);
        System.out.println("****************************************");
    }
    // Convert Fahrenheit to Kelvin
    public void fahrenheitToKelvin(){
        System.out.println("Enter temperature in Fahrenheit:");
        setFahrenheit(sc.nextFloat());
        System.out.println("you entered: "+getFahrenheit() +" Fahrenheit");
        setKelvin(((getFahrenheit()+459.67f)*(5/9f)));
        String strDouble = String.format("%.2f", getKelvin());
        System.out.println(getFahrenheit() +" Fahrenheit converted to Kelvin is "+ strDouble);
        System.out.println("****************************************");
    }
    // Converting Kelvin to Fahrenheit
    public void kelvinToFahrenheit(){
        System.out.println("Enter temperature in Kelvin:");
        setKelvin(sc.nextFloat());
        System.out.println("you entered: "+getKelvin() +" Kelvin");
        setFahrenheit(1.8f* (getKelvin()-273.15f) + 32);
        String strDouble = String.format("%.2f", getFahrenheit());
        System.out.println(getKelvin() +" Kelvin  converted to Fahrenheit is "+ strDouble);
        System.out.println("****************************************");
    }


}



public class TemperatureConverter {
    public static void main(String[] args) {

        TempConverter t1= new TempConverter();
        t1.menu();
    }
}
