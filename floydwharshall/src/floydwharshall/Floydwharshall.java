/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floydwharshall;

public class Floydwharshall {
static void floyd_warshall (int grafo[][]){

int n = grafo.length;
int caminos [][]= new int [n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
           caminos[i][j]= j; 
        }
    }
 //ejecutar el metodo flwh
    for (int k = 0; k < n; k++) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
             int   tmp = grafo[i][k]+grafo[k][j];
            }
        }
    }
}
   
   
    
    
    public static void main(String[] args) {

        
        
    }
    
}
