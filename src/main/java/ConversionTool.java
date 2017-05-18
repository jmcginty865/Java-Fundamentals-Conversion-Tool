public class ConversionTool {

    public static void main(String[] args){}



    public static float CentimetersToInches(float centimeters){

        float finalConversion = (float) (centimeters * .3937);

        if(finalConversion < 0){
            return 0;
        }

        return finalConversion;
    }


    public static float InchesToCentimeters(float inches){
        float finalConversion =(float)( inches * 2.54);

        if(finalConversion < 0){
            return 0;
        }

        return finalConversion;
    }

    public static float FeetToMeters(float feet){
        float finalConversion = (float)(feet/3.28);

        if(finalConversion < 0){
            return 0;
        }

        return finalConversion;
    }

    public static float MetersToFeet(float meters){
        float finalCounversion = (float)(meters/.3048);

        if(finalCounversion < 0){
            return 0;
        }

        return finalCounversion;
    }

    public static float CelsiusToFahrenheit(float celsius){
        float finalConversion = (float)(celsius * 1.8 + 32);
        return finalConversion;
    }

    public static float FahrenheitToCelsius(float fahrenheit){
        float finalConversion = (float)((fahrenheit - 32) / 1.8);
        return finalConversion;
    }

    public static float MphToKph(float mph){
        float finalConversion = (float)(mph * 1.609);

        if(finalConversion < 0){
            return 0;
        }

        return finalConversion;
    }

    public static float KphToMph(float kph){
        float finalConversion = (float)(kph/1.609);

        if(finalConversion < 0){
            return 0;
        }

        return finalConversion;
    }
}
