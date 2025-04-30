public class Temperatura {
//Atributo privado para armazenar temo- celsius
    private double graus;
    
//Contrutor - cria o objeto com uma temp incial
    public Temperatura(double grausTemp){
    this.graus = grausTemp;
    } 
        
        //Getter - para ler temperatura
        public double getGraus(){
            return graus;
    }
        // Setter para mudar a temperatura
        public void setGraus(double novoGraus){
            this.graus = novoGraus;
        }
        //Método para coverter para fahrenheit
        
}
