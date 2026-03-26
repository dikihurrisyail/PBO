/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak.pertemuan1;

/**
 *
 * @author Pongo
 */
public class ListMhs {
    public static void main(String[] args) {
        
        String nama[] = {
            "Diki Hurrisyail", "Kepin Kiting Jambi", "Atha Ketangtingtung",
            "Yowen Org Besar.", "Celvin Amin Nur Cahyadi"
        };
        
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Mahasiswa ke-" + (i+1) + ": " + nama[i]);
        }
    }
}
