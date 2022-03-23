/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author Asus
 */
public class Laptop {
    
    private String name, brand, namaProcessor, SO, storage;
    private byte procCore, RAM, stok;
    
    Laptop (String name, String brand){
        this.setName(name);
        this.setBrand(brand);
    }
    
    Laptop (String name, String brand, String namaProcessor, String SO, String storage, byte procCore, byte RAM, byte Stok){
        this(name, brand);
        this.setNamaProcessor(namaProcessor);
        this.setSO(SO);
        this.setStorage(storage);
        this.setProcCore(procCore);
        this.setRAM(RAM);
        this.setStok(Stok);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNamaProcessor() {
        return namaProcessor;
    }

    public void setNamaProcessor(String namaProcessor) {
        this.namaProcessor = namaProcessor;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public byte getProcCore() {
        return procCore;
    }

    public void setProcCore(byte procCore) {
        this.procCore = procCore;
    }

    public byte getRAM() {
        return RAM;
    }

    public void setRAM(byte RAM) {
        this.RAM = RAM;
    }

    public byte getStok() {
        return stok;
    }

    public void setStok(byte stok) {
        this.stok = stok;
    }

   
    
}
