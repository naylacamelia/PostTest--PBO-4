package Model;

import java.time.LocalDate;

public class Organisasi extends Aktivitas implements Prioritas {
    private String namaOrganisasi;
    private String prioritas;

    public Organisasi(String nama, LocalDate tenggat, String namaOrganisasi) {
        super(nama, tenggat);
        this.namaOrganisasi = namaOrganisasi;
        this.prioritas = "Normal"; 
    }

    public String getNamaOrganisasi() { return namaOrganisasi; }
    public void setNamaOrganisasi(String namaOrganisasi) { this.namaOrganisasi = namaOrganisasi; }

    public void setPrioritas(String prioritas) { this.prioritas = prioritas; }

    @Override
    public String tentukanPrioritas() { 
        return prioritas; 
    }

    @Override
    public void tampilkanKegiatan() {
        System.out.println("Nama        : " + getNama());
        System.out.println("Tenggat     : " + getTenggat());
        System.out.println("Organisasi  : " + namaOrganisasi);
        System.out.println("Status      : " + getStatus());
    }
}
