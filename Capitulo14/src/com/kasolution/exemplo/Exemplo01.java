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
public class Exemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("/home/product/java/97275/curso.pdf");
        System.out.println("getFileName(): " + p.getFileName());
        System.out.println("getParent(): " + p.getParent());
        System.out.println("getNameCount(): " + p.getNameCount());
        System.out.println("isAbsolute(): " + p.isAbsolute());
        System.out.println("toAbsolutePath(): " + p.toAbsolutePath());
        System.out.println("toURI(): " + p.toUri());
        
        Path subP = p.subpath(1, 3);
        System.out.println("subPath(): " + subP);
    }
    
}
