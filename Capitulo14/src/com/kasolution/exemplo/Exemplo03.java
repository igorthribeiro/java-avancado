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
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;
import static java.lang.System.out;

/**
 *
 * @author 130955800299
 */
public class Exemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Path dirO = Paths.get("C:/Temp/");
        Path dirD = Paths.get("C:/Temp2/destino");
        Files.createDirectories(dirD);
        //Files.copy(dirO, dirD, StandardCopyOption.REPLACE_EXISTING);
        Stream<Path> files = Files.list(dirO);
        files.peek(p -> out.println(dirO.resolve(p.getFileName()) + " ==> " + dirD.resolve(p.getFileName())))
                .forEach(p -> {
                    try {
                        Files.copy(
                                dirO.resolve(p.getFileName()),
                                dirD.resolve(p.getFileName()),
                                StandardCopyOption.REPLACE_EXISTING
                        );
                    } catch (IOException ex) {
                        out.println("Erro ao copiar: " + ex.getMessage());
                    }
                });
        out.println("Sucesso!");
    }
}
