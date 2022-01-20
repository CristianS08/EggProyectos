
package guia1;

import static java.lang.String.valueOf;

public class Ejercicio18 {

    public static void main(String[] args) {
        
        int i,j,k;
        String a,b,c;
        
        for(i=0;i<=9;i++){
            for(j=0;j<=9;j++){
                for(k=0;k<=9;k++){
                    
                    a=valueOf(i);
                    b=valueOf(j);
                    c=valueOf(k);
                    
                    if (a.equals("3") && b.equals("3") && c.equals("3")){
                        a= "E";
                        b="E";
                        c="E";
                    }else if (a.equals("3") && b.equals("3")){
                        b= "E";
                        a="E";
                    } else if(a.equals("3") && c.equals("3")){
                        c= "E";
                        a="E";
                    } else if(b.equals("3") && c.equals("3")){
                        c="E";
                        b="E";
                    } else if(a.equals("3")){
                        a="E";
                    } else if(b.equals("3")){
                        b="E";
                    } else if(c.equals("3")){
                        c="E";
                    }
                    System.out.println(a+"-"+b+"-"+c);
                }
            }
        }
        
    }
    
}
