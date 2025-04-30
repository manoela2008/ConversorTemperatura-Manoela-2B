public class Celsios extends Temperatura{
    //Construtor
    public Celsios(double graus){
        super(graus);
    }
    
    //converter para kelvin 
    public double coverterParaKelvin(){
        return getGraus()+273.15;
    }
    
    //Converter para farenheit
    public double coverterParaFahrenheit(){
        return(getGraus()*9/5)+32;
    }
}
