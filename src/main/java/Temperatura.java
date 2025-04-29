//CLASSE PAI -  AS OUTRAS VÃO HERDAR
public class Temperatura {
    //ATRIBUTO
    private double graus;
    
    //CANSTRUTOR
    public Temperatura(double valorGraus){
        this.graus = valorGraus;
    }
    
    //GETTER DO GRAUS
    public double getGraus(){
        return graus;
    }
    
    //SETTER DO GRAUS
    public void setGraus(double novoGraus){
       this.graus = novoGraus;
       
    }
}
