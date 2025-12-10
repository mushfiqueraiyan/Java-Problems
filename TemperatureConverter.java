class Temperature {
    
    void toCelsius(double fahrenheit){
        double celsius = (fahrenheit - 32) *  5 / 9;
        System.out.println("F = " + celsius + "C");
    }
    
    void toFahrenheit(double Celsius){
        double fahrenheit = (Celsius *  9 / 5) + 32;
        System.out.println("C = " + fahrenheit + "F");
    }
}

class Main {
    public static void main(String[] args) {
        
        Temperature temp = new Temperature();
        
        temp.toCelsius(98.6);
        temp.toFahrenheit(37);
    }
}
