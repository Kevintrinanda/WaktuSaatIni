         /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10117008latihan26;

/**
 *
 * @author ASUS
 * Nama         : Kevin Trinanda
 * Kelas        : IF-1 V
 * NIM          : 10117008
 * Deskripsi    : Program ini akan membantu kita melihat tanggal dan jam
 */
import java.util.Date;  
import java.text.DateFormat;  
import java.text.SimpleDateFormat;

public class PBO10117008Latihan26 {

private String hari(){
        DateFormat dateFormat = new SimpleDateFormat("EEEE");
        Date date = new Date();
        return dateFormat.format(date);
        
        
        
    }
   
    private String tanggal() {  
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }  
     
    private String waktu() {  
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");  
        Date date = new Date();  
        return dateFormat.format(date);  
    } 
       
    public static void main(String Args[]){  
        PBO10117008Latihan26 tgl = new PBO10117008Latihan26();  
        System.out.println("Hari ini adalah hari  : "+tgl.hari()     +tgl.tanggal() +tgl.waktu());
        
        
    }  

    
}
