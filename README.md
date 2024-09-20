# Manajemen Tiket Bioskop dengan Decorator Pattern

Proyek ini adalah implementasi dari **Decorator Pattern** dalam konteks sistem tiket bioskop menggunakan bahasa pemrograman **Java**. Aplikasi ini dikembangkan sebagai bagian dari mata kuliah **Rekayasa Perangkat Lunak Berbasis Komponen (RPLBK)**. Aplikasi ini memungkinkan pengguna untuk membeli tiket bioskop dasar dan menambahkan fitur tambahan seperti popcorn, minuman, dan snack menggunakan pola desain dekorator.

## Deskripsi Proyek

Proyek ini mengikuti prinsip **Decorator Pattern** dengan memisahkan tanggung jawab komponen utama menjadi kelas dasar dan beberapa dekorator yang menambahkan fungsi tambahan. Berikut adalah komponen utama dari proyek ini:

- **`MovieTicket`**: Sebuah interface yang mendefinisikan deskripsi dan harga tiket bioskop.
- **`BasicMovieTicket`**: Kelas dasar yang mengimplementasikan `MovieTicket` untuk membuat tiket bioskop dasar tanpa tambahan.
- **`TicketDecorator`**: Kelas abstrak yang mengimplementasikan `MovieTicket` dan digunakan untuk menambahkan fitur tambahan ke tiket.
- **`PopcornDecorator`**, **`DrinkDecorator`**, dan **`SnackDecorator`**: Dekorator yang masing-masing menambahkan fitur popcorn, minuman, dan snack ke tiket bioskop.

Aplikasi ini memungkinkan pengguna untuk membeli tiket dasar dan menambahkan satu atau lebih fitur tambahan sesuai dengan kebutuhan, dengan setiap fitur memiliki biaya tambahan yang ditambahkan ke total biaya tiket.

Proyek ini dikembangkan oleh **Verry Kurniawan** (NIM: 21120122130062) sebagai bagian dari mata kuliah **Rekayasa Perangkat Lunak Berbasis Komponen (RPLBK)**.

## Fitur

- **Pola Desain Decorator**: Menggunakan Decorator Pattern untuk menambahkan fitur tambahan ke tiket tanpa mengubah kelas dasar.
- **Tiket Bioskop dengan Fitur Tambahan**: Pengguna dapat menambahkan popcorn, minuman, atau snack ke tiket bioskop mereka dengan biaya tambahan.
- **Kode yang Modular dan Mudah Diperluas**: Setiap dekorator ditulis sebagai kelas terpisah yang mudah dipahami dan diuji.

## Instalasi

1. Clone repository:

   ```bash
   git clone https://github.com/princeofverry/RPLBK-DecoratorPattern-MovieTicket.git

   ```

2. Masuk repository:

   ```bash
   cd RPLBK-DecoratorPattern-MovieTicket
   ```

3. Compile dan jalankan proyek:
   ```bash
   javac Main.java
   java Main
   ```

## Output

```bash
Basic Movie Ticket $10.0
Basic Movie Ticket, Popcorn $15.0
Basic Movie Ticket, Popcorn, Drink $18.0
Basic Movie Ticket, Popcorn, Drink, Snack $22.0
```
