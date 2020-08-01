/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasolution.exemplo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author 130955800299
 */
public class Exemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //hard link
        Path p1 = Paths.get("C:/Temp/teste_igor.lnk");
        Path p2 = Paths.get("C:/Temp/teste_igor.sql");
        Files.createLink(p1, p2);
        
        //criar diretorio
        Path dir1 = Paths.get("C:/Temp/teste");
        Files.createDirectory(dir1);
        System.out.println("Sucesso!");
        Path dir2 = Paths.get("C:/Temp/teste/teste.txt"); //cria um diretorio com o nome teste.txt
        Files.createDirectory(dir2);
        System.out.println("Sucesso!");
    }
    
}
