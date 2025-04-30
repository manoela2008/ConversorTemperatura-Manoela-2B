public class kelvin extends Temperatura{
    //Contrutor
    public kelvin(double grausTemp) {
        super(grausTemp);
    }
    
    //Converter dde Kelvin para Celsios
    public double coverterParaCelsios(){
        return getGraus()-273.15;
    }
    
    //converter de Kelvin para Fahrenheit
    public double converterParaFahrenheit(){
        return ((getGraus()-273.15)*9/5)+32; 
    }
}
