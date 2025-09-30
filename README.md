# PostTest--PBO-4

Nayla Camelia Indraswari | A | 2409116009

# Sistem Manajemen Aktivitas Harian (Activity Log)
## Deskripsi Tema
Program ini merupakan sistem pencatat aktivitas harian sederhana yang dirancang untuk membantu pengguna dalam menyusun dan memantau tugas atau kegiatannya sehari-hari. Melalui program ini, setiap kegiatan penting dapat dicatat dengan detail, diberi tenggat waktu, diperbarui statusnya, hingga dihapus jika sudah tidak diperlukan. Dengan begitu, pengguna dapat lebih mudah mengelola aktivitas dan memastikan setiap tugas terselesaikan tepat waktu.
## Penjelasan Struktur Packages

<img width="439" height="206" alt="image" src="https://github.com/user-attachments/assets/443527eb-8d7d-476f-a2bc-2f0085bde3c5" />


**1. Package Model**

package ini berisi class Aktivitas (superclass) yang merepresentasikan objek program sehingga pengguna dapat menyimpan data kegiatan, seperti nama, tenggat, dan status. selain itu, terdapat sub class, yakni class Kuliah dan Organisasi. Package ini hanya fokus pada pendefinisian data.

**2. Package Service**

Package ini berisi class Manajemen yang berperan sebagai controller yang mengelola objek. Class ini mengatur semua logika pengelolaan kegiatan, seperti tambah, tampilkan, hapus, update, tandai selesai, dan cari kegiatan.

**3. Package Main**

Package ini berisi class Main yang menjadi kode utama program. class ini menyediakan menu, menerima input dari pengguna, dan memanggil method di Manajemen untuk menjalankan perintah.
## Penjelasan Alur Program
### Menu Utama

<img width="491" height="203" alt="image" src="https://github.com/user-attachments/assets/04b73305-8699-4984-9f21-a0c08f62f56e" />

program ini memiliki 7 fitur, diantaranya yakni pilihan untuk menambah kegiatan, menampilkan kegiatan, memperbarui deadline kegiatan, menghapus kegiatan, mencari kegiatan dan pilihan untuk keluar dari program.

### 1. Fitur Tambah Kegiatan 📝
<img width="491" height="155" alt="image" src="https://github.com/user-attachments/assets/83e17563-b26b-429a-86bc-8177950a0daf" />

User dapat memilih jenis kegiatan secara spesifik (biasa, kuliah, atau organisasi). Pengklasifikasian aktivitas dilakukan dengan menerapkan superclass pada program, sehingga semua jenis kegiatan dapat disimpan dan dikelola dengan cara yang terstruktur menggunakan konsep inheritance.
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

<img width="491" height="270" alt="image" src="https://github.com/user-attachments/assets/cbac42a7-a3cc-4068-9cbb-2e9040d97436" />

Ketika User memasukan format tanggal yang salah atau tidak sesuai, maka program akan muncul keterangan bahwa format tanggal salah dan otomatis kembali ke menu utama.

<img width="491" height="157" alt="image" src="https://github.com/user-attachments/assets/83000e0a-9d3e-4013-917f-bb5ae93f76bd" />

User akan menerima pesan "Input harus berupa angka! coba lagi" dan kembali ke menu utama, apabila ia menginputkan selain angka.

<img width="491" height="143" alt="image" src="https://github.com/user-attachments/assets/fe642575-a507-4d52-8a52-3ac3144cb1ec" />

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

<img width="409" height="320" alt="image" src="https://github.com/user-attachments/assets/38ab413b-8d47-429f-b29c-f5d9a3625b77" />

Ketika User menginput selain angka, maka Ia akan menerima pesan berupa "Input harus angka" dan kembali ke menu utama.

### 4. Fitur Update Tenggat Kegiatan 📆
<img width="603" height="499" alt="image" src="https://github.com/user-attachments/assets/4cf7c097-8214-4d76-8f30-80f235295542" />

Ketika User memasukkan angka 4 pada menu, maka Ia telah masuk ke fitur Update Tenggat. Pada fitur ini, User diminta untuk memasukkan nomor kegiatan yang ingin diperbarui, kemudian Ia akan diminta untuk memasukkan tenggat baru dari kegiatan tersebut.

- **Validasi Input**
<img width="409" height="316" alt="image" src="https://github.com/user-attachments/assets/ab578e3e-8dd6-43f1-b79c-e2cc20ebee71" />

Ketika User menginput nomor kegiatan yang tidak tersedia, maka Ia akan menerima pesan berupa "kegiatan tidak tersedia" dan kembali ke menu utama.

<img width="409" height="315" alt="image" src="https://github.com/user-attachments/assets/02574c88-aff0-4609-89cf-40d7c86291c9" />

Ketika User menginput selain angka, maka Ia akan menerima pesan berupa "Input harus angka" dan kembali ke menu utama.
  

### 5. Fitur Hapus Kegiatan ✏️

<img width="491" height="451" alt="image" src="https://github.com/user-attachments/assets/a4f2062a-1a6d-4d1a-800d-a911cbc1cacb" />

Ketika User memasukkan angka 5 pada menu, maka Ia telah masuk ke fitur Hapus Kegiatan. Pada fitur ini, User akan diminta untuk memasukkan nomor kegiatan yang ingin dihapus. Setelah itu, kegiatan yang dipilih beserta seluruh detail informasinya akan dihapus dari daftar kegiatan.

- **Validasi Input**
<img width="491" height="349" alt="image" src="https://github.com/user-attachments/assets/47ac769e-4d8d-4deb-b595-8b4353e31144" />

Ketika User menginput nomor kegiatan yang tidak tersedia, maka Ia akan menerima pesan berupa "Input tidak valid" dan kembali ke menu utama.

<img width="491" height="346" alt="image" src="https://github.com/user-attachments/assets/81056e43-7eaf-4357-bbdf-6cbe934a457d" />

Ketika User menginput selain angka, maka Ia akan menerima pesan berupa "Input harus angka" dan kembali ke menu utama.
  

### 6. Fitur Search Kegiatan 🔍
<img width="491" height="152" alt="image" src="https://github.com/user-attachments/assets/4fcf61f2-bb3e-4cd4-9a24-f526380c172d" />

Ketika User menginputkan angka 6 pada menu, maka Ia telah beralih menuju fitur Search program ini. Fitur ini dapat melakukan pencarian kegiatan berdasarkan kata kunci yang diberikan User. Jika kata kunci yang dimasukkan ada di dalam daftar kegiatan, maka program akan menampilkan nama kegiatan tersebut beserta detail informasinya.

- ketika kata kunci yang diinput pengguna tidak terdapat dalam daftar kegiatan, maka akan muncul output berupa informasi bahwa kegiatan tersebut tidak ada.

<img width="491" height="241" alt="image" src="https://github.com/user-attachments/assets/6336e987-48b6-41ad-9a63-66c82945532e" />


### 7. Keluar dari Program ❌
<img width="491" height="259" alt="image" src="https://github.com/user-attachments/assets/b8217008-e9aa-4c2f-8d26-8f14f6f0b241" />

Pengguna dapat keluar dari program dengan memasukkan angka 7 pada pilihan menu. Setelah itu, program akan berhenti berjalan dan sesi penggunaan berakhir.




