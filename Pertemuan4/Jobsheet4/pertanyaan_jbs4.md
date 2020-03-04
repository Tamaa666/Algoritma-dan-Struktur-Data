# PRAKTIKUM 3

## PERTANYAAN

1. ### Hasil Run
<img src = "pertanyaan1no1.png">

2. ### untuk menginstansiasi array of object ppArray   Dimana :  minMax[] ppArray = new minMax[5] -> sebagai instansiasi  ppArray[0] = new minMax(); -> sebagai inisialisasi atau memberikan nilai kepada object 


3. ### Perhitungan nilai minimal dan maksimal terpisah dari class main
 <img src = "pertanyaan1no3.png">

 4. ### Pada program tersebut berarti bahwa nilai 4 adalah indeks akhir atau batas dari array yang diinputkan oleh user.

 5. ###  Karna menggunakan algoritma divide and conquer dimana array akan di bagi menjadi beberapa bagian, untuk pembagian yang sama antara bagian kanan dan bagian kiri maka memerlukan indeks awal yang merupakan indeks ke-0, indeks akhir merupakan indeks ke-n, dan indeks tengah merupakan batas diantara keduanya  

 6. ### Karena merupakan class tersendiri, dimana deklarasi class tidak boleh dilakukan di dalam class lain. 
 

 7. ### Tidak bisa, karena nilai array pada array objek digunakan sebagai parameter 

 8. ### Perubahan kode program secara keseluruhan
<img src = "pertanyaan1no8.png">

9. ###  BONUS  

10. ###  Yang lebih baik dari segi kecepatan memecah masalah adalah divide and conquer,sedangkan Brute force lebih baik untuk yang ingin simpel dalam pengkodeannya 
 
11. ### Itu dinamakan ternary operation, : adalah sebagai else, Tanda “ : “ berarti pembanding/pembatas antara kondisi jika benar dengan kondisi jika salah  Jika a>b ? maka c(jika benar) : d(jika salah) 
 
12.  ###  Tanda ? merupakan bagian dari operator ternary, yang sama seperti simbolnya menanyakan kondisi  
 
# PRAKTIKUM 4

## PERTANYAAN

1.  ###   Notasi: O(n)*O(n)*O(1) = n*n*1  Penjelasanya : 1+1+(n*n*1)+(n*n*1)= 2+2*(n^2)  Big O(n^2). Tidak ada perubahan operasi dengan praktikum karna sama-sama memiliki 1 intruksi 

2.   ###  Jumlah instruksi: n*n*1 = 100*100*1 = 10000 
  ###  Karena N=100  1+1+(100*100*1)+(100*100*1)= 2+2*(100^2)  2+2*(100^2) = 20002  Big O(n^2) = 10000. 

3.  ###   Kode A, notasi: O(n) *O(n)*1  

  ###  Kode B, notasi: O(n)*O(∞)*O(1)  
  ###  Berbeda karena di for kedua j tidak di iterasi sehingga nilai j selalu 0 sehingga akan terjadi infinity loop 