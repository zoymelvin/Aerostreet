# Aerostreet (Prototipe UI/UX)

Aerostreet adalah sebuah prototipe aplikasi e-commerce Android (Frontend-Only) yang dirancang untuk mendemonstrasikan alur pemesanan produk dari brand Aerostreet. Aplikasi ini murni berfokus pada desain antarmuka (UI) dan alur pengguna (UX).

**Penting:** Project ini adalah demonstrasi visual (UI/UX) dan **tidak memiliki integrasi backend**. Fungsionalitas seperti login, registrasi, menambah ke keranjang, atau menyimpan favorit tidak terhubung ke server atau database; semua interaksi hanya sebatas navigasi antar layar.

## Fitur Utama (Layar & Alur Pengguna)

Berikut adalah layar-layar dan alur pengguna yang didesain dalam aplikasi ini:

  * **Layar Autentikasi:**
      * Desain antarmuka untuk **Login Pengguna**.
      * Desain antarmuka untuk **Registrasi Pengguna**.
  * **Navigasi Utama (Home):**
      * Halaman utama yang menampilkan banner promosi dan kategori produk.
      * Termasuk navigasi bawah (Bottom Navigation) untuk berpindah ke Home, Favorite, Chart, dan Settings.
  * **Kategori Produk:**
      * Layar terpisah untuk kategori produk **Men**.
      * Layar terpisah untuk kategori produk **Women**.
      * Layar terpisah untuk kategori produk **Kids**.
      * Contoh halaman sub-kategori seperti **T-Shirt Unisex** dan kolaborasi **DragonBall**.
  * **Detail Produk:**
      * Halaman detail produk yang menampilkan gambar, deskripsi, harga, dan pilihan ukuran (hanya UI).
  * **Fitur Pengguna:**
      * Layar **Keranjang (Chart)** untuk menampilkan daftar produk yang (secara visual) ditambahkan.
      * Layar **Favorit (Favorite)** untuk menampilkan produk yang disukai.
      * Layar **Pengaturan (Settings)**.

## Teknologi yang Digunakan

Project ini dibangun murni menggunakan teknologi frontend Android:

  * **Bahasa:** [Kotlin](https://kotlinlang.org/)
  * **Arsitektur UI:**
      * **AndroidX** (AppCompat, ConstraintLayout)
      * **Material Design** (com.google.android.material)
      * **View Binding** (Diaktifkan di `build.gradle.kts`)
      * **Navigation Component** (Untuk mengelola alur navigasi)
  * **Struktur Aplikasi:** Menggunakan arsitektur Multi-Activity, di mana setiap layar utama adalah Activity tersendiri.

## Prasyarat Instalasi

Anda hanya memerlukan lingkungan pengembangan Android standar untuk menjalankan prototipe UI ini.

1.  **Android Studio** (Rekomendasi versi terbaru, misal: Hedgehog atau Iguana).
2.  **JDK 8** atau yang lebih baru (project dikonfigurasi untuk `jvmTarget = "1.8"`).

## Susunan Project

Struktur file utama dalam project ini diatur sebagai berikut:

```
Aerostreet/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/aerostreet/
│   │   │   │   ├── (Kumpulan file Activity seperti Home.kt, Login.kt, Men.kt, LamanProduk.kt, dll.)
│   │   │   ├── res/
│   │   │   │   ├── layout/       (Semua file XML untuk desain antarmuka Activity)
│   │   │   │   ├── drawable/     (Aset gambar, ikon, dan shape)
│   │   │   │   └── font/         (File font kustom, misal: Poppins)
│   │   │   └── AndroidManifest.xml (Deklarasi semua Activity)
│   ├── build.gradle.kts          (Konfigurasi build level aplikasi)
└── (File-file gradle level project)
```

## Contoh Penggunaan (Instalasi)

Untuk menjalankan aplikasi ini secara lokal:

1.  **Clone** repositori ini:
    ```sh
    https://github.com/zoymelvin/Aerostreet
    ```
2.  **Buka** project di Android Studio.
3.  Tunggu hingga proses **Sync Gradle** selesai.
4.  **Run** aplikasi pada emulator atau perangkat Android fisik (Min SDK 24).

**Catatan:** Karena project ini hanya frontend, fungsionalitas seperti login, registrasi, dan penambahan produk tidak akan menyimpan data. Interaksi terbatas pada navigasi antar layar untuk mendemonstrasikan alur pengguna.
