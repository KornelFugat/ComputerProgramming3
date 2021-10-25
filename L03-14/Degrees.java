
public class Degrees{
    static void CelsiusToKelvin(float deg){
        float result = deg + 273.15f;
        System.out.println(result);
    }
    static void KelvinToCelsius(float deg){
        float result = deg - 273.15f;
        System.out.println(result);
    }
    static void CelsiusToFahrenheit(float deg){
        float result = deg*1.8f+32;
        System.out.println(result);
    }
    static void FahrenheitToCelsius(float deg){
        float result = (deg-32)/1.8f;
        System.out.println(result);
    }
    static void FahrenheitToKelvin(float deg){
        float result = (deg-32)/1.8f + 273.15f;
        System.out.println(result);
    }
    static void KelvinToFahrenheit(float deg){
        float result = (deg-273.15f)*1.8f+32f;
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        CelsiusToKelvin(25);
        CelsiusToFahrenheit(25);
        FahrenheitToKelvin(100);
        FahrenheitToCelsius(100);
        KelvinToCelsius(0);
        KelvinToFahrenheit(0);
    }

}
