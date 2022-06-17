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
public class Client implements User{

 private ArrayList<String> namaClient = new ArrayList<String>(); //enkapsulasi karena private
 private ArrayList<String> alamat = new ArrayList<String>(); // new untuk menyatakan objek baru
 private ArrayList<String> telepon = new ArrayList<String>();
 private ArrayList<Integer> saldo = new ArrayList<Integer>();

 public Client() { //constructor
 setNama("Shinta Putri"); //menambahkan isi arraylist
 setAlamat("Jl. Melati No. 12");
 setTelepon("081234562626");
 setSaldo(250000);

 setNama("Jonathan Putra");
 setAlamat("Jl. Merdeka No. 03/A");
 setTelepon("085982506137");
 setSaldo(250000);
 
 setNama("Indah Dewi");
 setAlamat("Jl. Teratai No. 32");
 setTelepon("087194520467");
 setSaldo(250000);

 setNama("Nur Amalia");
 setAlamat("Jl. Tidar No. 2/B");
 setTelepon("081742957104");
 setSaldo(250000);
 }
 public void setSaldo(int saldo){ //method kalo constructor itu namanya sama kyk class
 this.saldo.add(saldo);
 }
 public int getSaldo(int idClient){
 return this.saldo.get(idClient);
 }
 public void editSaldo(int idClient, int saldo){
 this.saldo.set(idClient, saldo);
 }
 public int getJmlClient(){
 return this.saldo.size();
 }
 @Override
 public void setNama(String namaClient ){
 this.namaClient.add(namaClient);
 }

 @Override
 public void setAlamat(String alamat ){
 this.alamat.add(alamat);
 }
 @Override
 public void setTelepon(String telepon ){
 this.telepon.add(telepon);
 }

 
 
 @Override 
 public String getNama(int idClient){
 return this.namaClient.get(idClient);
 }

 @Override
 public String getAlamat(int idClient){
 return this.alamat.get(idClient);
 }

 @Override
 public String getTelepon(int idClient){
 return this.telepon.get(idClient);
 } 
}