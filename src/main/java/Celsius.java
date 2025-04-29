//CLASSE FILHA
public class Celsius extends Temperatura {
    //CONSTRUTOR
    public Celsius(double valorGraus){
    //O SUPER SE REFERE A CLASSE PAI
       super(valorGraus);
    }
     
    //CRIANDO OS METoDOS PARA CONVERTER
    public double paraFahenheit(){
        return(getGraus()*9/5)+32;
    }
    
    //CRIANDO O METODO DE CEUSIUS PARA KELVIN
    public double paraKelvin(){
       return getGraus()+273;
       
    }
}
