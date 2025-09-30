package Model;

import java.time.LocalDate;

public class Kuliah extends Aktivitas implements Prioritas {
    private String matkul;
    private String prioritas;

    public Kuliah(String nama, LocalDate tenggat, String matkul) {
        super(nama, tenggat);
        this.matkul = matkul;
        this.prioritas = "Normal";
    }

    public String getMatkul() { return matkul; }
    public void setMatkul(String matkul) { this.matkul = matkul; }

    public void setPrioritas(String prioritas) { this.prioritas = prioritas; }

    @Override
    public String tentukanPrioritas() { 
        return prioritas; 
    }

    @Override
    public void tampilkanKegiatan() {
        System.out.println("Nama        : " + getNama());
        System.out.println("Tenggat     : " + getTenggat());
        System.out.println("Mata Kuliah : " + matkul);
        System.out.println("Status      : " + getStatus());
    }
}
