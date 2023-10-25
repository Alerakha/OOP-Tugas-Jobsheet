KEMENTERIAN PENDIDIKAN DAN KEBUDAYAAN ![](Aspose.Words.137e04c0-91ee-4226-94ab-6fc7c7323032.001.png)![](Aspose.Words.137e04c0-91ee-4226-94ab-6fc7c7323032.002.png)

POLITEKNIK NEGERI MALANG

JURUSAN TEKNOLOGI INFORMASI

PROGRAM STUDI TEKNIK INFORMATIKA

Jl. Soekarno Hatta No.9 Malang 65141 Telp. 0341404424 Fax. 0341404420 ![](Aspose.Words.137e04c0-91ee-4226-94ab-6fc7c7323032.003.png)

**UJIAN TENGAH SEMESTER GENAP TAHUN AKADEMIK 2023/2024**

**Mata Kuliah : OOP Hari/tanggal : Minggu ke-9 ![](Aspose.Words.137e04c0-91ee-4226-94ab-6fc7c7323032.004.png)Dosen : - Waktu : 5 Hari**

**Prodi / Kelas : TI / 2 Sifat : - ![](Aspose.Words.137e04c0-91ee-4226-94ab-6fc7c7323032.005.png)**

<hr><br>
<b>Identitas Diri :</b><br>
Nama  : Aleron Tsaqif Rakha Rajendra<br>
Kelas : 2C<br>
NIM   : 2241720113<br>
<hr>

**Soal 1: Penulisan Class**

Berdasarkan contoh class ClassA di bawah ini, jelaskan apakah penulisan source code pada contoh class tersebut sudah benar. Jika tidak, apa yang perlu diperbaiki?

```java
|public class ClassA { float f1 = 0.15f;
float hitung() {float x = 2f \* f1; }
}
```

<br>
<br>
<b>JAWAB :</b> Code diatas tidak benar. Fungsi diatas memerlukan adanya return statement untuk mengembalikan nilai, karena fungsi tersebut bertipe float dan bukan void.
<br>
Sehingga codenya akan seperti ini:

```java
float hitung (){
float x = 2f*f1;
return x;
}
```

|**Soal 2: Perhitungan Jumlah Elemen Array 2 Dimensi** |
|Pada class SoalArray1, terdapat array 2 dimensi dengan ukuran 3x3. Tuliskan code Java untuk |
|menghitung jumlah total elemen array tersebut dengan menggunakan perulangan. |

![](Aspose.Words.137e04c0-91ee-4226-94ab-6fc7c7323032.006.png)

```java
public class SoalArray1 {
public static void main(String[] args) {

int[][] arrayInt = {{1, 1, 4}, {2, 1, 2}, {3, 2, 1}};
// hitung jumlah elemen array 2 dimensi
// gunakan perulangan
}
}
```

<b>JAWAB:</b> Untuk menghitung jumlah dari banyaknya elemen dalam array adalah menggunakan kode berikut:

```java
int jumlah=0;
    for(int i=0;i<arrayInt.length;i++){
        for(int j=0;j<arrayInt[i].length;j++){
           jumlah++;
        }
    }
System.out.println("Jumlah Element dari array sebanyak : " + jumlah);
```

Sedangkan jika yang dimaksud dengan jumlah adalah total penjumlahan semua angka dalam array maka kodenya adalah :

```java
int jumlah=0;
    for(int i=0;i<arrayInt.length;i++){
        for(int j=0;j<arrayInt[i].length;j++){
           jumlah+=arrayInt[i][j];
        }
    }
System.out.println("Total Element dari array sebanyak : " + jumlah);
```

<br>
**Soal 3: Pewarisan Atribut dan Method**

Pada source code yang diberikan, class ClassY merupakan turunan dari class Class. Sebutkan atribut dan method apa saja yang diwarisi oleh ClassY dari kelas induknya (class Class). Jelaskan juga apa output dari code yang ditulis pada class ClassY dan bagaimana nilai tersebut diperoleh.

```java
public class Class {
int a = 2;

    int x = 0;

    int hitung() {

        x = x + 5 \* a; return x;

    }

}

public class ClassY extends Class {
    int b = 5;
    int y = 0;
    int hitungY() {
    y = hitung() \* b;
    return y;
}

public static void main(String[] args) {
    ClassY cy = new ClassY();
    System.out.println(cy.hitungY());
    }
}

```

<b>JAWAB :</b><br>
Dari kode diatas maka dapat dicari turunan dan method dari Class yang diberikan pada ClassY, adalah :<br>
Class menurunkan method hitung() yang digunakan ClassY dalam perhitungan fungsi "int hitungY() nya" dan secara tidak langsung akan mengambil atribut a dan x dari class Class.<br>
Hasilnya adalah <b>50</b> yang diperoleh dari pertama fungsi hitung() dari class Class dan dilanjutkan dalam fungsi hitungY() dalam class ClassY.

| **Soal 4: Class Mahasiswa dengan Constructor** |
| Dalam class Mahasiswa, lengkapi code dengan: |
| a. Menambahkan constructor untuk mengisi atribut nim, nama, alamat, dan jenisKelamin. |
| b. Membuat objek mahasiswa dan mengisi atribut nim, nama, alamat, dan jenisKelamin melalui |
| constructor. |

```java
public class Mahasiswa {

`    `String nim, nama, alamat; char jenisKelamin;

`    `// a. Tambahkan constructor

`    `// Gunakan constructor untuk

`    `// mengisi atribut nim, nama, alamat, jenisKelamin

`    `public static void main(String[] args) {

`        `// b. Buat objek mahasiswa

`        `// Isi atribut nim, nama, alamat, jenisKelamin // lewat constructor

`    `}

}
```

<b>JAWAB :</b><br> Berikut adalah kode untuk mengisi data mahasiswa :<br>

```java
public class Soal4 {
    public class Mahasiswa {
    String nim, nama, alamat;
    char jenisKelamin;

    // a. Tambahkan constructor
    Mahasiswa(String NIM, String Nama, String Alamat, char Jk){
    this.nim    = NIM;
    this.nama   = Nama;
    this.alamat = Alamat;
    this.jenisKelamin = Jk;
    }
    // Gunakan constructor untuk

    // mengisi atribut nim, nama, alamat, jenisKelamin

    public static void main(String[] args) {
        Soal4 soal = new Soal4();

    // b. Buat objek mahasiswa
    // Isi atribut nim, nama, alamat, jenisKelamin // lewat constructor
        Soal4.Mahasiswa mhs = soal.new Mahasiswa("2241720113","Aleron Tsaqif Rakha","Malang",'L');
    }

    }
}
```

**Soal 5: OOP Buku -> Penulis**

Perhatikan class diagaram berikut dan Buatlah Source code dalam Bahasa java berdasarkan class diagram tersebut

![](Aspose.Words.137e04c0-91ee-4226-94ab-6fc7c7323032.009.png)
<br>
<b>JAWAB :</b><br>
Berikut adalah kode untuk diagram penulis :<br>

```java
public class Penulis {
    private String nama;
    private String alamat;


    public void setNama(String nama){
    this.nama=nama;
    }
    String getNama(){
    return this.nama;
    }
    public void setAlamat(String alamat){
    this.alamat=alamat;
    }
    String getAlamat(){
    return this.alamat;
    }
}
```

Dan berikut adalah kode untuk diagram buku :

```java
public class Buku {
    String ISBN,judul;
    int harga;
    Penulis penulis;

    String getISBN(){
    return this.ISBN;
    }
    public void setISBN(String newISBN){
    this.ISBN=newISBN;
    }
    String getJudul(){
    return this.judul;
    }
    public void setJudul(String newJudul){
    this.judul = newJudul;
    }
    int getHarga(){
    return this.harga;
    }
    public void setHarga(int newHarga){
    this.harga = newHarga;
    }
    Penulis getPenulis(){
    return this.penulis;
    }
    public void setPenulis(Penulis newPenulis){
    this.penulis = newPenulis;
    }

}
```
