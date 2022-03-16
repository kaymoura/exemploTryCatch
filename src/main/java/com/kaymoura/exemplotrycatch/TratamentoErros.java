/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kaymoura.exemplotrycatch;

/** Um índice sempre começa com 0 e termina com o número de
*elementos na matriz -1. Por exemplo, a matriz acima  
*consiste em 7 elementos, portanto seus índices começam a 
*partir de 0 e terminam com 6 (7-1). Tentar acessar um 
*elemento com um índice inferior a 0 ou mais de 6 fará 
*com que Java lance um ArrayOutOfBounds.
*/

/**
 *
 * @author devsys-b
 */
public class TratamentoErros {
    public static void main(String args[]) throws Exception{
       try
        {
            // um array de quatro elementos
            int[] valores = {5, 23, 76, 3};     

            // vamos fornecer um índice inválido
            System.out.println(valores[4]); 

            System.exit(0);
        }
        catch (Exception exception) // exceções lançadas de method1
        {
            throw new Exception("erro ao efetuar consulta :" + exception.getMessage());
        
        }
    }
}

    
    
    

