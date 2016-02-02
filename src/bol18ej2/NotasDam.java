/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol18ej2;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablite5
 */
public class NotasDam {
    
    int [] notas = new int [3];
    
    public void notas(){
        for(int i=0;i<notas.length;i++){
            notas [i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce notas"));
            
        }
    }
    
    public void visualizarNotas(){
        int aprobados=0;
        int suspensos=0;
      
        for(int i=0;i<notas.length;i++){
            if (notas[i] >= 5){
                JOptionPane.showMessageDialog(null,"APROBADO IJOEEEPUTA");
                aprobados=aprobados+1;
            }else{
                JOptionPane.showMessageDialog(null,"SUSPENSO IJOEEEPUTA" );
                suspensos=suspensos+1;
            }
            JOptionPane.showMessageDialog(null,"Aprobados"+ aprobados);
            JOptionPane.showMessageDialog(null,"Suspensos"+ suspensos);
            
        }
    }
        public void notaMedia(){
            int note=0;
            for(int i=0;i<notas.length;i++){
                note += notas[i];
                 }
            JOptionPane.showMessageDialog(null, "nota media :" + (note / notas.length));
        }
        public void visualizarNotaAlta(){
            int nA=0;
            for(int i=0;i<notas.length;i++){
                if(notas[i]>nA){
                    nA=notas[i];
                }
            }
            JOptionPane.showMessageDialog(null,"Nota más alta" + nA);
        }
    }
   
            
        
    

        
        
    

