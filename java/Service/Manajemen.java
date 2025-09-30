package Service;

import Model.Aktivitas;
import Model.KegiatanBiasa;
import Model.Prioritas;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Manajemen {
    private ArrayList<Aktivitas> daftarKegiatan = new ArrayList<>();

    public void tambahKegiatan(Aktivitas a) {
        daftarKegiatan.add(a);
        System.out.println("\nKegiatan '" + a.getNama() + "' berhasil ditambahkan!");
    }

    public void tambahKegiatan(String nama, LocalDate tgl) {
        Aktivitas a = new KegiatanBiasa(nama, tgl);
        daftarKegiatan.add(a);
        System.out.println("\nKegiatan '" + a.getNama() + "' berhasil ditambahkan!");
    }

    public void tampilkanKegiatan() {
        if (daftarKegiatan.isEmpty()) {
            System.out.println("Kegiatan kamu kosong.");
        } else {
            System.out.println("\n==============================");
            System.out.println("    DAFTAR KEGIATAN KAMU    ");
            System.out.println("==============================");
            for (int i = 0; i < daftarKegiatan.size(); i++) {
                System.out.println("No          : " + (i + 1));
                Aktivitas kegiatan = daftarKegiatan.get(i);
                kegiatan.tampilkanKegiatan(); 

                if (kegiatan instanceof Prioritas p) {
                    p.tampilkanPrioritas();
                }
                System.out.println("-----------------------------");
            }
        }
    }


    public void tandaiSelesai(int index) {
        if (index >= 0 && index < daftarKegiatan.size()) {
            Aktivitas kegiatan = daftarKegiatan.get(index);
            kegiatan.setStatus("Selesai");
            System.out.println("\nKegiatan " + kegiatan.getNama() + " berhasil diselesaikan!");
        } else {
            System.out.println("Input tidak valid.");
        }
    }

    public void updateTenggat(int index, LocalDate tenggatBaru) {
        if (index >= 0 && index < daftarKegiatan.size()) {
            Aktivitas kegiatan = daftarKegiatan.get(index);
            kegiatan.setTenggat(tenggatBaru);
            System.out.println("\nTenggat kegiatan " + kegiatan.getNama() + " diperbarui menjadi " + tenggatBaru + "!");
        } else {
            System.out.println("Input tidak valid.");
        }
    }

    public void hapusKegiatan(int index) {
        if (index >= 0 && index < daftarKegiatan.size()) {
            String nama = daftarKegiatan.get(index).getNama();
            daftarKegiatan.remove(index);
            System.out.println("\nKegiatan " + nama + " berhasil dihapus!");
        } else {
            System.out.println("Input tidak valid.");
        }
    }
    public ArrayList<Aktivitas> getDaftarKegiatan() { return daftarKegiatan; }
    public void setDaftarKegiatan(ArrayList<Aktivitas> daftarKegiatan) { this.daftarKegiatan = daftarKegiatan; }
    public List<Aktivitas> cariKegiatan(String keyword) {
        List<Aktivitas> hasil = new ArrayList<>();
        for (Aktivitas a : daftarKegiatan) {
            if (a.getNama().toLowerCase().contains(keyword.toLowerCase())) {
                hasil.add(a);
            }
        }
        return hasil;
}

}
