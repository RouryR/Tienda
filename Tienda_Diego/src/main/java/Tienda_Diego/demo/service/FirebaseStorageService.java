/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tienda_Diego.demo.service;

/**
 *
 * @author LABORATORIO 04
 */
import org.springframework.web.multipart.MultipartFile;
public interface FirebaseStorageService {
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "techshop-roury.appspot.com";
    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "TechShop";
    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-roury-firebase-adminsdk-nrp3r-38ed009950.json";
}
