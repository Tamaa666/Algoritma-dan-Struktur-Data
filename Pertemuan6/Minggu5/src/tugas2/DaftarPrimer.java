/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author WINDOWS 10
 */
public class DaftarPrimer {
    LigaPrimer listLiga[] = new LigaPrimer[20];
    int indeks;
    
    void tambah(LigaPrimer L) {
        if (indeks<listLiga.length) {
            listLiga[indeks] = L;
            indeks++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }
    
    void tampil() {
        for (LigaPrimer L : listLiga) {
            L.tampil();
        }
    }
    
    void insertionSortA() {
        int i, j;
        for (i = 1; i < listLiga.length; i++) {
            LigaPrimer temp = listLiga[i];
            j=i;
            while ((j > 0) && (listLiga[j-1].poin > temp.poin)) {
                listLiga[j] = listLiga[j - 1];
                j--;
            }
            listLiga[j] = temp;
        }
    }
    
    void insertionSortD() {
        int i, j;
        for (i = 1; i < listLiga.length; i++) {
            LigaPrimer temp = listLiga[i];
            j=i;
            while ((j > 0) && (listLiga[j-1].poin < temp.poin)) {
                listLiga[j] = listLiga[j - 1];
                j--;
            }
            listLiga[j] = temp;
        }
    }
}

