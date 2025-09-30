package Model;

import java.time.LocalDate;

public class KegiatanBiasa extends Aktivitas implements Prioritas {
    private String prioritas; 

    public KegiatanBiasa(String nama, LocalDate tenggat) {
        super(nama, tenggat);
        this.prioritas = "Normal"; 
    }

    public void setPrioritas(String prioritas) {
        this.prioritas = prioritas;
    }

    @Override
    public String tentukanPrioritas() {
        return prioritas;
    }

    @Override
    public void tampilkanKegiatan() {  
        System.out.println("Nama        : " + getNama());
        System.out.println("Tenggat     : " + getTenggat());
        System.out.println("Status      : " + getStatus());
    }
}
