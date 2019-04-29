/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumping_on_the_clouds;

/**
 *
 * @author sergio
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //int c[]= {0,0,1,0,0,0,0,1,0,0};
        //int c[] = {0,1,0,1,0,1,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,1,0,1,0,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,1,0,1,0,0,0,1,0,0,0,0,0,1,0,1,0,1,0,0,1,0,1,0,1,0,0,1,0,0,0,0,1,0,0,1,0,0,0,1,0,0,1,0,1,0};
        int c[] = {0,0, 0, 1, 0, 0};
                
        System.out.println(jumpingOnClouds(c));
    }
    
    static int jumpingOnClouds(int[] c) {
        int result = 0;
        
        for (int i = 0; i < c.length-1; i++) {           
                       
            //System.out.println("ID: "+ i);
            
            if(i+2<c.length && c[i+2]==0)
            {
                i++;            
                
                //System.out.println("jump to: "+ i);
            }
            
            result++;
                
        }
        
        return result;

    }
    
}
