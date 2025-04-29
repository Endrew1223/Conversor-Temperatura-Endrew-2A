
public class Fahrenheit extends Temperatura {
    
    public Fahrenheit(double valorGraus){
        
        super(valorGraus);
    
    }
    
    //METODO QUE CONVERTER FAHRENHEIT PARA KELVIN
    public double paraCelsius(){
       return(getGraus()-32)*5/9;
       
    }
    
    //matodo que converter fahrenheint
    
}
