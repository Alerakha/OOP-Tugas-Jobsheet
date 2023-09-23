/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aleron.relasiclass.percobaan4;

/**
 *
 * @author Rakha
 */
public class ImmutableArray {
    private final String[] array;
    private boolean isFilled;

    public ImmutableArray(int size) {
        this.array = new String[size];
        this.isFilled = false;
    }

    public void fillArray(int index, String value) {
        if (!isFilled) {
            array[index] = value;
            isFilled = true;
        } else {
            System.out.println("Array sudah terisi sebelumnya.");
        }
    }

    public String getValue(int index) {
        return array[index];
    }
    
    public boolean isFilled() {
        return isFilled;
    }
    
    public static void main(String[] args) {
        ImmutableArray immutableArray = new ImmutableArray(5);

        // Isi array pada indeks ke-1
        immutableArray.fillArray(1, "Contoh String");
        immutableArray.fillArray(2, "String 2");
        // Coba mengisi ulang array
        immutableArray.fillArray(1, "String yang berbeda");
        
        // Cek apakah array sudah diisi
        if (immutableArray.isFilled()) {
            System.out.println("Array sudah diisi.");
        } else {
            System.out.println("Array belum diisi.");
        }
        
        // Mendapatkan nilai dari array
        System.out.println("Nilai pada indeks 1: " + immutableArray.getValue(1));
        System.out.println("Nilai pada indeks 2: " + immutableArray.getValue(2));
    }
}
