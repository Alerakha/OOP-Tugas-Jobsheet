**KUIS 1 – OOP**

**Aleron Tsaqif Rakha Rajendra/2C**

**2241720113**

1. Class dan Object:
- Apa yang dimaksud dengan "class" dalam pemrograman berorientasi objek?

**Jawab :** 

Class yang dimaksud adalah sebuah tempat atau wadah dari sebuah objek yang akan dibuat. Tempat ini berisikan atribut-atribut dan method dari objek tersebut.

- Bagaimana Anda mendefinisikan objek dari suatu class dalam bahasa pemrograman Java?

**Jawab :**

Untuk mendefinisikan suatu class, perlunya deklarasi terlebih dahulu kemudian dilakukan inisialisasi terhadap objek tersebut.

- Misalkan Anda memiliki class "Barang" dalam sistem informasi inventaris. Bagaimana Anda akan membuat objek "laptop" dari class tersebut?

**Jawab :**

Objek dari suatu class dapat didefinisikan dengan:

NamaClass namaObject(bebas) = new NamaClass(); maka untuk membuat objek “laptop” adalah dengan:

Barang laptop = new Barang();

1. Encapsulation:
- Jelaskan konsep encapsulation dalam pemrograman berorientasi objek dan mengapa hal ini penting dalam pengembangan sistem informasi inventaris barang?

**Jawab :**

Enkaspsulasi digunakan untuk mengendalikan akses dan memanipulasi data dalam kode serta mengamankan atribut dari suatu objek agar tidak dapat dirubah secara sembarangan. Hal ini penting terutama dalam sistem inventaris barang karena informasi dari barang sangat sensitif dan jika terjadi perubahan yang tidak diinginkan akan menyebabkan kebingungan ketika ingin melakukan perbaikan.

- Dalam konteks sistem informasi inventaris, sebutkan contoh atribut (variabel) yang harus di-encapsulate dan mengapa?

**Jawab :**

**id\_barang/kode\_barang** : atribut ini merupakan kunci utama dari suatu barang yang tidak boleh dirubah.

**Nama\_barang** : atribut ini juga merupakan atribut yang penting dalam informasi inventaris karena jika nama barang secara tidak sengaja terubah maka akan menyebabkan kebingungan dalam mencari nama barang yang diinginkan.

1. Relasi Kelas:
- Apa yang dimaksud dengan relasi antara kelas dalam pemrograman berorientasi objek?

**Jawab :**

Maksudnya adalah antara satu kelas dan kelas yang lain saling tersambung melalui suatu atribut khusus.

- Dalam sistem informasi inventaris barang, bagaimana Anda akan menggambarkan relasi antara kelas "Barang" dan kelas "Kategori"?

**Jawab :**

Di dalam kelas Barang harus memuat atribut yang dapat disambungkan dengan kelas Kategori, atribut yang sekiranya memungkinkan adalah id\_kategori dimasukkan ke dalam kelas Barang. Karena kelas barang akan memerlukan id\_kategori jika nantinya akan dikaitkan dalam basis data.

1. PBL:
- Berdasarkan kasus sistem informasi inventaris barang, coba buat sebuah class sederhana beserta atribut dan metodenya yang menggambarkan suatu entitas dalam sistem tersebut (misalnya, class "Barang").

**Jawab:**

Membuat suatu kelas barang dengan beberapa atribut dan metodenya dengan enkapsulasi.

![ref1]

- Bagaimana Anda akan menggunakan encapsulation untuk melindungi atributatribut dalam class tersebut?

**Jawab:**

Menggunakan modifier private pada atribut yang sensitif sehingga akan meningkatkan keamanan.

![ref2]

- Gambarkan hierarki class atau hubungan antar class yang mungkin ada dalam sistem informasi inventaris barang di jurusan Teknologi Informasi. Berikan contoh relasi antar class (misalnya, inheritance atau association) dalam konteks tersebut.

**Jawab :**

Ada dua objek yang akan diasosiasikan yaitu antara mahasiswa dengan barang yang dipinjam. Sementara itu ada inheritance terhadap barang dengan kategori barang elektronik.

**Kode:**

**-Class Barang:**

![](Aspose.Words.be2765c6-59a9-4687-90c9-b914fa551e41.003.png)

**-Class Barang Elektronik:**

![](Aspose.Words.be2765c6-59a9-4687-90c9-b914fa551e41.004.png)

**-Class Mahasiswa**(Sebagai peminjam)**:**

![](Aspose.Words.be2765c6-59a9-4687-90c9-b914fa551e41.005.png)

**-Class Peminjaman**(Tempat Relasi)**:**

![](Aspose.Words.be2765c6-59a9-4687-90c9-b914fa551e41.006.png)
**


**-Main Class:**

![](Aspose.Words.be2765c6-59a9-4687-90c9-b914fa551e41.007.png)

**-Hasil :**

![](Aspose.Words.be2765c6-59a9-4687-90c9-b914fa551e41.008.png)

[ref1]: Aspose.Words.be2765c6-59a9-4687-90c9-b914fa551e41.001.png
[ref2]: Aspose.Words.be2765c6-59a9-4687-90c9-b914fa551e41.002.png
