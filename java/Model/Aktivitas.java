package Model;

import java.time.LocalDate;

public abstract class Aktivitas {
    private String nama;
    private LocalDate tenggat;
    private String status;

    public Aktivitas(String nama, LocalDate tenggat) {
        this.nama = nama;
        this.tenggat = tenggat;
        this.status = "Belum selesai";
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public LocalDate getTenggat() { return tenggat; }
    public void setTenggat(LocalDate tenggat) { this.tenggat = tenggat; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public abstract void tampilkanKegiatan();
}
