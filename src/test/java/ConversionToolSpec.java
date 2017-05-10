import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConversionToolSpec {

    @Test
    public void shouldConvertCentimetersToInches() {
        float inches = ConversionTool.CentimetersToInches(2f);
        assertEquals(0.7874f, inches, 0.001);
    }
    @Test
    public void shouldConvertZeroCentimetersToZeroInches() {
        float inches = ConversionTool.CentimetersToInches(0);
        assertEquals(0, inches, 0.0);
    }
    @Test
    public void shouldConvertNegativeCentimetersToZeroInches() {
        float inches = ConversionTool.CentimetersToInches(-5);
        assertEquals(0, inches, 0.0);
    }

    @Test
    public void shouldConvertInchesToCentimeters() {
        float centimeters = ConversionTool.InchesToCentimeters(4f);
        assertEquals(10.16f, centimeters, 0.001);
    }
    @Test
    public void shouldConvertZeroInchesToZeroCentimeters() {
        float centimeters = ConversionTool.InchesToCentimeters(0);
        assertEquals(0, centimeters, 0.0);
    }
    @Test
    public void shouldConvertNegativeInchesToZeroCentimeters() {
        float centimeters = ConversionTool.InchesToCentimeters(-5);
        assertEquals(0, centimeters, 0.0);
    }

    @Test
    public void shouldConvertFeetToMeters() {
        float meters = ConversionTool.FeetToMeters(5f);
        assertEquals(1.524f, meters, 0.001);
    }
    @Test
    public void shouldConvertZeroFeetToZeroMeters() {
        float meters = ConversionTool.FeetToMeters(0);
        assertEquals(0, meters, 0.0);
    }
    @Test
    public void shouldConvertNegativeFeetToZeroMeters() {
        float meters = ConversionTool.FeetToMeters(-10);
        assertEquals(0, meters, 0.0);
    }

    @Test
    public void shouldConvertMetersToFeet() {
        float feet = ConversionTool.MetersToFeet(9f);
        assertEquals(29.5276f, feet, 0.001);
    }
    @Test
    public void shouldConvertZeroMetersToZeroFeet() {
        float feet = ConversionTool.MetersToFeet(0);
        assertEquals(0, feet, 0.0);
    }
    @Test
    public void shouldConvertNegativeMetersToZeroFeet() {
        float feet = ConversionTool.MetersToFeet(-10);
        assertEquals(0, feet, 0.0);
    }

    @Test
    public void shouldConvertFahrenheitToCelsius() {
        float celsius = ConversionTool.FahrenheitToCelsius(80);
        assertEquals(26.67, celsius, 0.01);
    }
    @Test
    public void shouldConvertCelsiusToFahrenheit() {
        float fahrenheit = ConversionTool.CelsiusToFahrenheit(26.67f);
        assertEquals(80, fahrenheit, 0.01);
    }

    @Test
    public void shouldConvertMphToKph(){
        float kph = ConversionTool.MphToKph(24f);
        assertEquals(38.62, kph, 0.01);
    }
    @Test
    public void shouldConvertZeroMphToZeroKph(){
        float kph = ConversionTool.MphToKph(0f);
        assertEquals(0, kph, 0.0);
    }
    @Test
    public void shouldConvertNegativeMphToZeroKph(){
        float kph = ConversionTool.MphToKph(-50f);
        assertEquals(0, kph, 0.0);
    }

    @Test
    public void shouldConvertKphToMph(){
        float mph = ConversionTool.KphToMph(6.44f);
        assertEquals(4, mph, 0.01);
    }
    @Test
    public void shouldConvertZeroKphToZeroMph(){
        float mph = ConversionTool.KphToMph(0f);
        assertEquals(0, mph, 0.0);
    }
    @Test
    public void shouldConvertNegativeKphToZeroMph(){
        float mph = ConversionTool.KphToMph(-50f);
        assertEquals(0, mph, 0.0);
    }

}
