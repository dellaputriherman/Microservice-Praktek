/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.della.produk.service;
import com.della.produk.entity.Produk;
import com.della.produk.repository.ProdukRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author ASUS
 */
@Service
public class ProdukService {
    @Autowired
    
    private ProdukRepository ProdukRepository;
    
    public List<Produk> getAll(){
        return ProdukRepository.findAll();
    }
    
    public void insert(Produk produk){
        ProdukRepository.save(produk);
    }
    
    
}
