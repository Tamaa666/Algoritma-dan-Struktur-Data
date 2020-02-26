Arjuna Pratama P
TI-1F
1941720155

2.3.3

1) public int faktorialDC (int n){
	if (n==1) {
	   return 1;
	}
	else
	{
		int fakto = n * faktorialDC (n-1);
		return fakto;
	}
Base ini akan mencari nilai faktorial,divide dan conquer dengan cara rekursi
,Kalau nilai n=1 maka akan di return jika salah akan masuk ke pencarian nilai 
fakto = n dikalikan(*) dengan faktorialDc (n-1); Dan akan di return nilai fakto nya. 

2) Divide
	if (n==1) {
	   return 1;
   Conquer
	}
	else
	{
	int fakto = n * faktorialDC (n-1);
   Combine
	return fakto;


3)     public int nilai;
    public int faktorialBF(int n) {
       int fakto = 1;
       int i = 1;
       while (i<fakto){
           fakto=fakto*1;
           i++;
       }
       return fakto;
    }
4 dan 5 bisa dilihat di source code

2.4.3
1) PangkatBF() memakai looping atau perulangan sedangkan PangkatDC() memakai rekursif
2) Dalam kode program tersebut ada penyeleksian angka dimana angka n, jika (n%2) = 1 maka n adalah bilangan ganjil dan akan dikembalikan ke nilai return berupa rekursif yaitu (pangkatDC (a, n/2) * pangkatDC (a, n/2) * a) dan  jika salah maka angka n merupakan bilangan genap sehingga akan mengembalikan nilai return rekursif pada (pangkatDC (a, n/2) * pangkatDC (a, n/2)); 
3) ada pada source code
 Return (pangkatDC(a,n/2) *pangkatDC(a,n/2));
4) public int nilai,Pangkat;
Pangkat(){
	this.nilai=nilai;
	this.Pangkat=Pangkat;
}
5) bisa dilihat di source code
 
2.5.3
1) Perbedaan perhitungan  
 
a)	TotalBF() memakai for agar bisa melakukan loop untuk menghitung keuntungan for (i = 0; i<= elemen; i) akan bertambah sampai terpenuhi yang akan dijabarkan dibawah ini : 
b)	TotalDC() menggunakan Divide and Conquer  
 
Misalnya  bulan yang kita masukan = 5, keuntungan = {1,2,3,4,5}  Jadi perhitungan keuntungan dibagi manjadi 2 bagian bagian kiri lsum dan bagian kanan rsum ,yang akan saya jabarkan sebagai berikut : 
•	Lsum = 1, 2 dan rsum = 4, 5, kemudian nilai mid (tengah) = 3  
•	Di lsum melakukan perhitungan 1+2 = 3  
•	Di rsum melakukan perhitungan 4+5 = 9  
Kemudian direturn dengan menjumlahkan lsum+rsum+arr[mid] = 3+9+3 = 15 (hasil akhir) 

2) Dengan memakai System.out.printf
3) Kode program tersebut adalah combine dari divide and conquer yaitu fungsi TotalDC itu sendiri, dimana fungsi digunakan untuk menggabungkan kembali pemecahan masalah tadi yang telah di conquer sebelumnya.(Hasil akhir dari proses tersebut dan untuk menampilkan outputnya) 
4) Variabel mid berfungsi untuk mengetahui nilai tengah dari array arr[ ] yang dimana fungsi program  mid ini yang mencari keuntungan perbulan yang didapatkan.(keuntungan perbulan yang didapatkan). 
5) bias dilihat di source code

