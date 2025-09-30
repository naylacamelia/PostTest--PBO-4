# PostTest--PBO-4

Nayla Camelia Indraswari | A | 2409116009

# Sistem Manajemen Aktivitas Harian (Activity Log)
## Deskripsi Tema
Program ini merupakan sistem pencatat aktivitas harian sederhana yang dirancang untuk membantu pengguna dalam menyusun dan memantau tugas atau kegiatannya sehari-hari. Melalui program ini, setiap kegiatan penting dapat dicatat dengan detail, diberi tenggat waktu, diperbarui statusnya, hingga dihapus jika sudah tidak diperlukan. Dengan begitu, pengguna dapat lebih mudah mengelola aktivitas dan memastikan setiap tugas terselesaikan tepat waktu.
## Penjelasan Struktur Packages

<img width="267" height="231" alt="image" src="https://github.com/user-attachments/assets/e033f418-942d-47ca-8711-431330ced692" />

**1. Package Model**

Package ini berisi struktur data kegiatan. Class Aktivitas berperan sebagai abstract class yang menjadi dasar bagi subclass Kuliah dan Organisasi, yang masing-masing menambahkan atribut khusus. Selain itu, interface Prioritas digunakan untuk menerapkan abstraction tambahan. Di package ini juga terdapat penerapan polymorphism melalui method overriding pada subclass.

**2. Package Service**

Package ini berisi class Manajemen yang bertugas mengatur seluruh logika pengelolaan kegiatan. Class ini menggunakan ArrayList untuk menyimpan data kegiatan serta menyediakan berbagai method seperti tambah, hapus, update, tandai selesai, dan cari. Konsep overloading juga diterapkan pada method tambahKegiatan untuk mendukung input berbeda.

**3. Package Main**

Package ini berisi class Main sebagai titik masuk program. class ini menyediakan menu, menerima input dari pengguna, dan memanggil method di Manajemen untuk menjalankan perintah.

## Penjelasan Alur Program
### Menu Utama

<img width="491" height="203" alt="image" src="https://github.com/user-attachments/assets/04b73305-8699-4984-9f21-a0c08f62f56e" />

program ini memiliki 7 fitur, diantaranya yakni pilihan untuk menambah kegiatan, menampilkan kegiatan, memperbarui deadline kegiatan, menghapus kegiatan, mencari kegiatan dan pilihan untuk keluar dari program.

### 1. Fitur Tambah Kegiatan 📝
<img width="491" height="155" alt="image" src="https://github.com/user-attachments/assets/83e17563-b26b-429a-86bc-8177950a0daf" />

User dapat memilih jenis kegiatan secara spesifik (biasa, kuliah, atau organisasi). Pengklasifikasian aktivitas dilakukan dengan menerapkan abstract class sebagai superclass pada program, sehingga semua jenis kegiatan dapat disimpan dan dikelola dengan cara yang terstruktur menggunakan konsep inheritance.
-  **Ketika User memilih 1**, maka ia menambah kegiatan biasa.

<img width="486" height="278" alt="image" src="https://github.com/user-attachments/assets/6d98c502-81d7-4849-a329-7d57e9a55edd" />

Kegiatan biasa hanya akan meminta User untuk menginput nama, tenggat dan tingkat prioritas kegiatan. User akan menerima keterangan "Kegiatan berhasil ditambahkan!" ketika berhasil menambahkan kegiatan baru.

- **Ketika User memilih 2**, maka ia menambah kegiatan khusus kuliah.

<img width="485" height="289" alt="image" src="https://github.com/user-attachments/assets/9b62ce43-7dc2-46dd-894b-c497f3cc3bb7" />

Kegiatan kuliah akan meminta User untuk menginput nama, tenggat, mata kuliah, dan tingkat prioritas kegiatan tersebut. User akan menerima keterangan "Kegiatan berhasil ditambahkan!" ketika berhasil menambahkan kegiatan baru.

- **Ketika User memilih 3**, maka ia menambah kegiatan khusus organisasi.

<img width="493" height="292" alt="image" src="https://github.com/user-attachments/assets/0a3e7eaf-b300-43b7-876f-d0c008b18ea4" />

Kegiatan organisasi akan meminta User untuk menginput nama, tenggat, organisasi dan tingkat prioritas kegiatan tersebut. User akan menerima keterangan "Kegiatan berhasil ditambahkan!" ketika berhasil menambahkan kegiatan baru.

Seluruh kegiatan yang baru ditambah, secara otomatis akan memiliki status "belum selesai".

- **Validasi Input**

<img width="410" height="270" alt="image" src="https://github.com/user-attachments/assets/cbac42a7-a3cc-4068-9cbb-2e9040d97436" />

Ketika User memasukan format tanggal yang salah atau tidak sesuai, maka program akan muncul keterangan bahwa format tanggal salah dan otomatis kembali ke menu utama.

<img width="410" height="157" alt="image" src="https://github.com/user-attachments/assets/83000e0a-9d3e-4013-917f-bb5ae93f76bd" />

User akan menerima pesan "Input harus berupa angka! coba lagi" dan kembali ke menu utama, apabila ia menginputkan selain angka.

<img width="410" height="143" alt="image" src="https://github.com/user-attachments/assets/fe642575-a507-4d52-8a52-3ac3144cb1ec" />

User akan menerima pesan "Jenis kegiatan tidak tersedia", apabila ia menginputkan angka selain 1-3.

### 2. Fitur Menampilkan Daftar Kegiatan 📃

<img width="442" height="494" alt="image" src="https://github.com/user-attachments/assets/be7327e5-9909-4dbe-8bba-1690f2c4ed43" />

Ketika User memilih menu dengan menginputkan angka 2 , maka Ia telah masuk ke fitur yang menampilkan seluruh daftar kegiatan beserta detail informasinya, seperti nama kegiatan, tenggat, status kegiatan, prioritas, dan jenis kegiatannya (jika itu merupakan kegiatan khusus).

### 3. Fitur Tandai Selesai ✅

<img width="586" height="557" alt="image" src="https://github.com/user-attachments/assets/8812e77f-f9e3-412d-a71f-d8012e8e7a3e" />

Ketika User memasukkan angka 3 pada menu, maka Ia telah masuk ke fitur Tandai Selesai. Pada fitur ini, User diminta untuk menginputkan nomor kegiatan yang ingin ditandai selesai. Setelah itu, status kegiatan akan diperbarui menjadi "Selesai".

Berikut adalah tampilan daftar kegiatan setelah di perbarui:

<img width="476" height="494" alt="image" src="https://github.com/user-attachments/assets/f97526c1-3e35-48d5-bae1-4a36ed6b03c6" />

Status kegiatan nomor 1 telah berubah menjadi "selesai".

- **Validasi Input**
<img width="481" height="485" alt="image" src="https://github.com/user-attachments/assets/07d8de58-6108-415c-89f9-e75d908290ab" />

Ketika User menginput nomor kegiatan yang tidak tersedia, maka Ia akan menerima pesan berupa "Input tidak valid" dan kembali ke menu utama.

<img width="406" height="492" alt="image" src="https://github.com/user-attachments/assets/88c42b5b-4745-4408-a31f-fe279b643188" />

Ketika User menginput selain angka, maka Ia akan menerima pesan berupa "Input harus angka" dan kembali ke menu utama.

### 4. Fitur Update Tenggat Kegiatan 📆
<img width="626" height="567" alt="image" src="https://github.com/user-attachments/assets/ef2e440f-62ca-42db-a169-8afb4af75a77" />

Ketika User memasukkan angka 4 pada menu, maka Ia telah masuk ke fitur Update Tenggat. Pada fitur ini, User diminta untuk memasukkan nomor kegiatan yang ingin diperbarui, kemudian Ia akan diminta untuk memasukkan tenggat baru dari kegiatan tersebut.

- **Validasi Input**
<img width="485" height="487" alt="image" src="https://github.com/user-attachments/assets/8d0394fe-bc8a-4a31-a487-feb17f2744f9" />

Ketika User menginput nomor kegiatan yang tidak tersedia, maka Ia akan menerima pesan berupa "kegiatan tidak tersedia" dan kembali ke menu utama.

<img width="458" height="484" alt="image" src="https://github.com/user-attachments/assets/21e5146a-6db0-4201-850d-846d00d2d7c6" />

Ketika User menginput selain angka, maka Ia akan menerima pesan berupa "Input harus angka" dan kembali ke menu utama.
  

### 5. Fitur Hapus Kegiatan ✏️

<img width="505" height="511" alt="image" src="https://github.com/user-attachments/assets/4a92809d-a48e-418d-b2c4-61da6a1271ec" />

Ketika User memasukkan angka 5 pada menu, maka Ia telah masuk ke fitur Hapus Kegiatan. Pada fitur ini, User akan diminta untuk memasukkan nomor kegiatan yang ingin dihapus. Setelah itu, kegiatan yang dipilih beserta seluruh detail informasinya akan dihapus dari daftar kegiatan.

- **Validasi Input**
<img width="400" height="378" alt="image" src="https://github.com/user-attachments/assets/f012f4ff-a0e8-4a2e-bc2c-623f466abd48" />

Ketika User menginput nomor kegiatan yang tidak tersedia, maka Ia akan menerima pesan berupa "Input tidak valid" dan kembali ke menu utama.

<img width="391" height="375" alt="image" src="https://github.com/user-attachments/assets/a487d3fc-30a9-4287-8bad-2e6a10052b60" />

Ketika User menginput selain angka, maka Ia akan menerima pesan berupa "Input harus angka" dan kembali ke menu utama.
  

### 6. Fitur Search Kegiatan 🔍
<img width="592" height="154" alt="image" src="https://github.com/user-attachments/assets/94a86c1a-c2f1-4486-b3a6-a3a30f212f05" />

Ketika User menginputkan angka 6 pada menu, maka Ia telah beralih menuju fitur Search program ini. Fitur ini dapat melakukan pencarian kegiatan berdasarkan kata kunci yang diberikan User. Jika kata kunci yang dimasukkan ada di dalam daftar kegiatan, maka program akan menampilkan nama kegiatan tersebut beserta detail informasinya.

- ketika kata kunci yang diinput pengguna tidak terdapat dalam daftar kegiatan, maka akan muncul output berupa informasi bahwa kegiatan tersebut tidak ada.

<img width="441" height="93" alt="image" src="https://github.com/user-attachments/assets/a741be6b-1bfc-449a-91e6-cadcbb1a89fb" />


### 7. Keluar dari Program ❌
<img width="423" height="301" alt="image" src="https://github.com/user-attachments/assets/636b180f-61b0-49fa-bee0-ee4e17f60a39" />

User dapat keluar dari program dengan memasukkan angka 7 pada pilihan menu. Setelah itu, program akan berhenti berjalan dan sesi penggunaan berakhir.




