/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 31622305
 */
public class Calculos {
    
    int rest, i, j, maior, menor, digito, par, cont, cont1;
    float total, multiplicacaosemzero, aux = 0;  
    
    public float calc(int[] digitos, int modo){
        
        switch (modo){
            case 1:
                aux = 0;
                for(i=0; i<8; i++){
                    aux = aux + digitos[i];
                }
                total = aux;
                break;
                
            case 2:
                aux = 0;
                for(i=0; i<8; i++){
                    aux= aux + digitos[i];
                    cont += 1;
                }
                total = aux/cont;
                break;
                
            case 3:
                maior = digitos[0];
                for(i=0; i<8; i++){
                    if(maior < digitos[i]){
                        maior = digitos[i];
                    }
                }
                total = maior;
                break;
                
            case 4:
                menor = digitos[0];
                for(i=0; i<8; i++){
                    if(menor > digitos[i]){
                        if(digitos[i] != 0){
                            menor = digitos[i];
                        }
                    }
                }
                total = menor;
                break;
            case 5:
                int vetor[] = new int [8];
                int vetor2[] = new int[8];
                cont = 1;
                int num =0;
                for (int i = 0; i < digitos.length; i++) {
                    cont = 0;
                    for (int j = 0; j < digitos.length; j++) {
                        if (digitos[i] == digitos[j]){
                            cont++;
                        }
                        num = digitos[i];
                        
                    }
                    vetor[i] = cont;
                    vetor2[i] = num;
                    
                }
                for (int i = 0; i < digitos.length; i++) {
                    if(rest <= vetor[i]){
                        rest = vetor2[i];
                    }
                    
                }
                total = rest;
                break;
            case 6:
                total = 0;
                cont = 0;
                for(i=0; i<8; i++){
                    if(digitos[i]%2 == 0){
                        if(digitos[i] != 0){
                            cont += 1;
                            
                        }
                    }
                }
                total = cont;
                break;
                
            case 7:
                total = 0;
                cont = 0;
                for(i=0; i<8; i++){
                    if(digitos[i]%2 != 0){
                        if(digitos[i] != 0){
                            cont += 1;
                        }
                    }
                }
                total = cont;
                break;
                
            case 8:
                total = 0;
                cont = 0;
                cont1 = 0;
                for(i=0; i<=3; i++){
                    cont += digitos[i];
                }
                for(j=4; j<=7; j++){
                    cont1 += digitos[j];
                }
                total = cont/cont1;
                break;
                
            case 9:
                total = 0;
                aux = 1;
                for(i=0; i<8; i++){
                    if(digitos[i] > 0){
                        aux = aux * digitos[i];
                    }
                }
                total = aux;
                break;
                
            case 10:
                aux = 1;
                for(i=0; i<8; i++){
                    if(digitos[i] > 0){
                        aux = aux * digitos[i];
                    }
                }
                multiplicacaosemzero = aux;
                maior = digitos[0];
                for(i=0; i<8; i++){
                    if(maior < digitos[i]){
                        maior = digitos[i];
                    }
                }
                total = multiplicacaosemzero * maior;
                break;
        }
    
    return total;
    }
}
