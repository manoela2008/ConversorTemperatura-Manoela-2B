public class Temperatura {
//Atributo privado para armazenar temo- celsius
    private double tempCelsius;
    
//Contrutor - cria o objeto com uma temp incial
    public Temperatura(double tempInicialCelsius){
    this.tempCelsius = tempInicialCelsius;
    } 
        
        //Getter - para ler temperatura
        public double getTemperaturaCelsius(){
            return tempCelsius;
    }
        // Setter para mudar a temperatura
        public void setTemperaturaCelsius(double mudarTempCelsius){
            this.tempCelsius = mudarTempCelsius;
        }
        //Método para coverter para fahrenheit
        public double converterParaFahrenheit(){
            return (tempCelsius*9/5)+32;
        }
        //Método para converter de celcius para Kelvin
        public double converterParaKelvin(){
            return tempCelsius+273.15;
        }
}
