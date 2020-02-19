Jawaban 2.3.3

    1. Karakteristik Class dan Objek yaitu 
       	a. class: diawali dengan huruf kapital dan tanpa spasi 
       	b. objek: harus instansiasi di method main
    2. Kata kunci untuk mendeklarasikan class yaitu class
    3. Ada 4 attribut yang dideklarasikan, yaitu : 
	namaBarang: String 
	jenisBarang: String 
	stok: int 
	hargaSatuan: int 
	Pada baris 8 dan 9
    4. Ada 5 method yaitu : 
	tampilBarang(): void 
	tambahStok(n: int): void 
	kurangiStok(n: int): void 
	hitungHargaTotal(jumlah: int): int 
	tampilBarang(): void 
	Pada baris 10, 17, 24, 28 dan 32
    5. Jawaban ada pada source code, class Barang, method kurangStok()
    6. Karena pada method tambahStok() terdapat proses penghitungan yang membutuhkan variabel n bertipe data int
    7. Karena pada method hitungHargaTotal() memerlukan pengembalian nilai dari hasil perhitungan jumlah * hargaSatuan
    8. Karena pada method tambahStok() tidak memerlukan pengembalian nilai dan hanya berfungsi untuk memasukkan nilai ke dalam attribut dari hasil perhitungan stok

Jawaban 2.4.3

    1. Pada baris 8 dan objek yang dihasilkan yaitu b1
    2. Cara mengaksesnya yaitu dengan mengetikkan namaObjek.namaAttribut dan namaObjek.namaMethod

Jawaban 2.5.3

    1. Bisa dilihat di baris 19
    2. Pada baris tersebut dilakukan pengisian pada objek bernama b2 dengan parameter yang telah 	       	      diinputkan
    3. Jawaban pada source code

Jawaban 2.6.3

    1. Maksudnya yaitu membuat Array objek yang namanya ppArray di suatu class class PersegiPanjang dengan panjang array sebanyak 3
    2. yang di,maksud dlm kode tsb adalah menginisiasi pembuatan dan pengisian attribut dalam array ppArray

Jawaban 2.7.3

    1. Karena array yang benar yatu jika array diisi darimulai indeks pertama yang berarti indeks 0, namun pada kode tsb diisi mulai dari kode 5
	   
Jawaban 2.8.3

    1. sebuah method yang namanya sama persis dengan nama class-nya. Constructor sendiri berfungsi untuk memberikan nilai awal pada sebuah class ketika class tersebut dibuat dalam bentuk objek pada class lain. Constructor bisa memiliki parameter bisa juga tidak. Dalam Constructor, tidak boleh pakai keyword void dan tidak boleh memakai 'return'    Jawaban ada pada source code, project ArrayBalok, class ArrayBalok, baris 13
    
    2.Segitiga[] sgArray = new Segitiga[15];
    
    3. public int alas, tinggi;

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling() {
        double hasil = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return hasil + alas + tinggi;
    }
    }
    
    4. Jawaban ada pada source code nomor 2

    5.  public static void main(String[] args) {
        Balok[] blArray = new Balok[3];
        blArray[0] = new Balok(100, 30, 12);
        blArray[1] = new Balok(120, 40, 15);
        blArray[2] = new Balok(210, 50, 25);
        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke-" + i + " : " + blArray[i].hitungVolume());
        }
        Segitiga[] sgArray = new Segitiga[15];
        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);
        for (int i = 0; i < 4; i++) {
            System.out.println("Luas segitiga ke-" + i + " : " + sgArray[i].hitungLuas());
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("Keliling segitiga ke-" + i + " : " + sgArray[i].hitungKeliling());
        }
    	}

	}
