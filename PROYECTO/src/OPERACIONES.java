
public class OPERACIONES {
    
    public double result,result2;
  
    public void abso(double abso1, double abso2){
        double valorabsoluto,valorrelativo;
        
        valorabsoluto = abso1- abso2;
     
     if(valorabsoluto < 0){
           valorabsoluto*= -1;
           
     }
    valorrelativo = valorabsoluto/abso1;
     if(valorrelativo < 0){
           valorrelativo *= -1;
       }
     
       result = valorabsoluto;
       result2 = valorrelativo;
       
       
    }
    
    }
