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
public class Petugas implements User{ //polimorphism
 private ArrayList<String> namaPetugas = new ArrayList<String>(); //object
 private ArrayList<String> alamat = new ArrayList<String>();
 private ArrayList<String> telepon = new ArrayList<String>();
 private ArrayList<Integer> jabatan = new ArrayList<Integer>();

 public Petugas() {
  setNama("Pak Toha");
  setAlamat("Kedung Kandang");
  setTelepon("082835103846");
  setJabatan(0);
 }

 public void setJabatan(int jabatan ){ //method
 this.jabatan.add(jabatan);
 }
 public int getJabatan(int id){
 return this.jabatan.get(id);
 }
 public int getJmlPetugas(){
 return this.namaPetugas.size();
 }

 @Override //memanggil method lebih dari 1
 public void setNama(String namaPetugas ){
 this.namaPetugas.add(namaPetugas);
 }

 @Override
 public void setAlamat(String alamat ){
 this.namaPetugas.add(alamat);
 }
 @Override
 public void setTelepon(String telepon ){
 this.telepon.add(telepon);
 }

 @Override
 public String getNama(int idPetugas){
 return this.namaPetugas.get(idPetugas);
 }

 @Override
 public String getAlamat(int idPetugas){
 return this.alamat.get(idPetugas);
 }

 @Override
 public String getTelepon(int idPetugas){
 return this.telepon.get(idPetugas);
 }

}