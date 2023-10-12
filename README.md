# PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK
## POST TEST 2
## NAMA   : REMANDA DHEVA
## NIM    : 2209116034
## KELAS  : A2 SISTEM INFORMASI 2022
## TEMA   : LIBRARY KAKAO WEBTOON

## PENJELASAN TEMA
  Tema dari library "KakaoWebtoon" adalah menyediakan sebuah sistem untuk mengelola dan menyimpan informasi mengenai webtoon-webtoon yang tersedia di platform KakaoWebtoon.
KakaoWebtoon adalah salah satu platform webtoon populer yang menyediakan berbagai macam judul webtoon dari berbagai genre seperti romance, action, comedy, dan lain-lain. Dalam library ini, kita akan fokus pada pengelolaan data webtoon yang ada di platform KakaoWebtoon.
Library KakaoWebtoon akan menyediakan fitur-fitur berikut:
1. Tambah Webtoon
2. Edit Webtoon
3. Hapus Webtoon
4. Tampilkan Webtoon

Dengan adanya library KakaoWebtoon ini, pengguna dapat dengan mudah mengelola dan menyimpan informasi mengenai webtoon yang ada di platform KakaoWebtoon.


## PENJELASAN PADA PACKAGE UTAMA (MAIN)

Dalam package main, terdapat kelas Library yang bertanggung jawab untuk mengelola operasi-operasi terkait dengan webtoon.
<li> Deklarasi </li>

* Pada baris pertama, kita mendeklarasikan package main yang menunjukkan bahwa kelas ini berada dalam package main. Package declaration ini membantu dalam mengorganisir dan mengelompokkan kelas-kelas terkait dalam struktur direktori yang terorganisir.

* Pada baris kedua, kita mengimpor kelas Manhwa dari package webtoon. Ini memungkinkan kita untuk menggunakan kelas Manhwa dalam kelas Library. Dengan mengimpor kelas dari package lain, kita dapat menggunakan fungsionalitas yang ada dalam kelas tersebut.

* Pada baris keempat, kita mendeklarasikan variabel listWebtoon sebagai ArrayList yang berisi objek Manhwa. ArrayList adalah salah satu implementasi dari Collection Framework yang digunakan untuk menyimpan dan mengelola kumpulan objek. Dalam hal ini, kita menggunakan ArrayList untuk menyimpan daftar webtoon.

* Pada baris kelima, kita mendeklarasikan variabel input sebagai objek Scanner. Scanner adalah kelas yang digunakan untuk membaca input dari pengguna. Dalam hal ini, kita menggunakan Scanner untuk membaca input dari pengguna saat melakukan operasi-operasi terkait webtoon.

<li> Kelas Library </li>

* Kelas Library dideklarasikan sebagai final, yang berarti kelas ini tidak dapat diwarisi oleh kelas lain. Ini dapat berguna jika kita ingin mencegah kelas ini diubah atau di-extend oleh kelas lain.

* Kelas Library memiliki konstruktor kosong yang tidak menerima parameter. Konstruktor ini tidak melakukan operasi apapun. Konstruktor kosong ini dapat digunakan jika kita ingin membuat objek Library tanpa melakukan inisialisasi khusus.

* Kelas Library memiliki beberapa method yang digunakan untuk melakukan operasi-operasi terkait webtoon. Method main adalah method utama program yang akan dieksekusi saat program dijalankan. Method ini berfungsi sebagai entry point program. Method createWebtoon digunakan untuk menambahkan webtoon baru ke dalam listWebtoon. Method readWebtoon digunakan untuk menampilkan daftar webtoon yang ada dalam listWebtoon. Method updateWebtoon digunakan untuk mengedit informasi webtoon yang ada dalam Listwebtoon. Method deleteWebtoon digunakan untuk menghapus webtoon dari listWebtoon.

* Perulangan do-while akan terus berjalan selama pengguna tidak memilih menu keluar (0). Setelah pengguna memilih menu keluar, program akan berakhir dan program akan selesai dieksekusi.
  
<li> INPUT MENU CREATE WEBTOON

  Pada awalnya, program akan menampilkan pesan "TAMBAH WEBTOON" untuk memberikan informasi kepada pengguna bahwa mereka sedang melakukan proses penambahan webtoon. Selanjutnya, program akan meminta pengguna untuk memasukkan judul webtoon baru, genre, status, penulis, artist, karya asli, dan penerbit melalui input pengguna. Nilai-nilai yang dimasukkan oleh pengguna akan disimpan dalam variabel yang sesuai. Setelah pengguna memasukkan semua informasi, program akan membuat objek Manhwa baru dengan menggunakan nilai-nilai yang dimasukkan oleh pengguna sebagai argumen konstruktor. Objek Manhwa baru kemudian ditambahkan ke dalam ArrayList listWebtoon. Terakhir, program akan menampilkan pesan "Webtoon telah berhasil ditambahkan!" untuk memberitahu pengguna bahwa proses penambahan webtoon telah berhasil.
  
<li> INPUT MENU READ WEBTOON

  Bagian "Tampilkan Webtoon" pada kode tersebut adalah fitur yang memungkinkan pengguna untuk melihat daftar webtoon yang ada dalam library. Pada awalnya, program akan menampilkan pesan "DAFTAR WEBTOON" untuk memberikan informasi kepada pengguna bahwa mereka akan melihat daftar webtoon. Selanjutnya, program akan melakukan iterasi melalui setiap objek Manhwa dalam ArrayList listWebtoon menggunakan perulangan for-each. Pada setiap iterasi, program akan menampilkan informasi mengenai setiap webtoon seperti judul, genre, status, penulis, artist, karya asli, dan penerbit menggunakan System.out.println(). Setelah selesai menampilkan semua webtoon, program akan kembali ke menu utama.
  
<li> INPUT MENU UPDATE WEBTOON

  Pada bagian update, terdapat beberapa langkah yang dilakukan. Pertama, program akan menampilkan pesan "UPDATE WEBTOON" untuk memberikan informasi kepada pengguna bahwa mereka sedang melakukan proses update. Selanjutnya, program akan meminta pengguna untuk memasukkan judul baru, genre baru, status baru, penulis baru, artist baru, karya asli baru, dan penerbit baru melalui input pengguna. Setelah itu, nilai-nilai baru ini akan diset ke objek webtoon yang ingin diupdate menggunakan metode setJudulWebtoon(), setGenre(), 'setStatus()', setPenulis(), setArtist(), setKaryaAsli(), dan setPenerbit(). Terakhir, program akan menampilkan pesan "Webtoon telah berhasil diupdate!!" untuk memberitahu pengguna bahwa proses update telah berhasil.
  
<li> INPUT MENU DELETE WEBTOON
  
  Pada bagian delete, program akan menampilkan pesan "DELETE WEBTOON" untuk memberikan informasi kepada pengguna bahwa mereka sedang melakukan proses delete. Selanjutnya, program akan memanggil metode readWebtoon() untuk menampilkan daftar webtoon yang ada dalam library. Setelah itu, program akan meminta pengguna untuk memilih nomor webtoon yang ingin dihapus melalui input pengguna. Jika nomor yang dimasukkan valid (antara 1 hingga jumlah webtoon yang ada), maka program akan menghapus webtoon tersebut dari listWebtoon menggunakan metode remove(). Terakhir, program akan menampilkan pesan "Webtoon telah berhasil dihapus!" untuk memberitahu pengguna bahwa proses delete telah berhasil.

