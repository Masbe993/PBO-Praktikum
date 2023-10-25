
package tugas3;
import Tugas2.Matematika;
public class Matematika2 extends Matematika{
    
    Matematika mtk1 = new Matematika ();
    
    public int pertambahan (int a ,int b){
        int hasil = a+b;
        return hasil ;   
    }
    
    public double pembagian (int a,int b) {
        
        if (b ==0) {
            return Double.NaN ; 
        }
        return (double)a / b ;
    
    }
    public int modulus (int a , int b) {
        return a % b ;
    }
    
}
