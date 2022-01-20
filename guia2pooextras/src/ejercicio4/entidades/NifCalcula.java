
package ejercicio4.entidades;

public class NifCalcula {
    
    
    public static String calculaNif(long dni){
        int resto;

        String []v = new String [23];
        
        v[0] = "T";
        v[1] = "R";
        v[2] = "W";
        v[3] = "A";
        v[4] = "G";
        v[5] = "M";
        v[6] = "Y";
        v[7] = "F";
        v[8] = "P";
        v[9] = "D";
        v[10] = "X";
        v[11] = "B";
        v[12] = "N";
        v[13] = "J";
        v[14] = "Z";
        v[15] = "S";
        v[16] = "Q";
        v[17] = "V";
        v[18] = "H";
        v[19] = "L";
        v[20] = "C";
        v[21] = "K";
        v[22] = "E";
        
        resto = (int) (dni%23);
        
        return v[resto-1];
    }
     
    

    
}
