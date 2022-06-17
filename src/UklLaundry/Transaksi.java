/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UklLaundry;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi {

    private ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idClient = new ArrayList<Integer>();

    public void prosesTransaksi(Client client, Transaksi transaksi, JenisLaundry jenisLaundry) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Selamat Datang di Ceria Laundry");
        System.out.print("Masukkan ID Client : ");
        int idClient = myObj.nextInt();
        System.out.println("Halo " + client.getNama(idClient)+" !!");

        int i = 0;
        int temp = 0;
        do {
            System.out.print("Masukkan kode jenis laundry (masukkan kode 99 untuk berhenti):");
            temp = myObj.nextInt();
            if (temp != 99) {
                idJenisLaundry.add(temp);
                System.out.print(jenisLaundry.getNamaJenisLaundry(idJenisLaundry.get(i)) + " sebanyak(kg) : ");
                banyak.add(myObj.nextInt());
                i++;
            }
        } while (temp != 99);

        System.out.println();//jarak
        System.out.println("Transaksi belanja " + client.getNama(idClient) + " sebagai berikut :");
        System.out.println("Nama Barang \t \tBanyak(kg) \tHarga \t\tJumlah \t");

        int total = 0;
        int x = idJenisLaundry.size();
        for (int j = 0; j < x; j++) {
            int jumlah = banyak.get(j) * jenisLaundry.getHarga(idJenisLaundry.get(j));
            total += jumlah;
            System.out.println(jenisLaundry.getNamaJenisLaundry(idJenisLaundry.get(j)) + "\t"
                    + banyak.get(j) + "\t" + "\t" 
                    + jenisLaundry.getHarga(idJenisLaundry.get(j)) + "/kg" + "\t" +"\t"
                    +  jumlah);
            transaksi.setTransaksi(jenisLaundry, idClient, idJenisLaundry.get(j),
                    banyak.get(j));
        }

        System.out.println("Total Laundry : " + total);
        if(total > client.getSaldo(idClient)){
            System.out.println("Maaf Saldo anda tidak mencukupi");
            System.exit(0);
        }
        client.editSaldo(idClient, client.getSaldo(idClient) - total);
        System.out.println("Sisa Saldo " +  client.getNama(idClient) + " = "+  client.getSaldo(idClient));
    }
    public void setTransaksi(JenisLaundry jenisLaundry, int idClient, int idJenisLaundry, int banyaknya) {
        this.idClient.add(idClient);
        this.idJenisLaundry.add(idJenisLaundry);
        this.banyak.add(banyaknya);
        jenisLaundry.editDurasi(idJenisLaundry, jenisLaundry.getDurasi(idJenisLaundry));
    }
    public int getIdJenisLaundry(int id) {
        return this.idJenisLaundry.get(id);
    }
    public int getBanyaknya(int id) {
        return this.banyak.get(id);
    }
    public int getJmlTransaksi() {
        return this.idClient.size();
    }
}