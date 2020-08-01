package com.kasolution.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;

public class Parametrizador {

    private static final Parametrizador instance = new Parametrizador();
    //CAP. 19 - DECLARAR VARIAVEL
    private String pais = "BR";
    private Locale locale = Locale.getDefault();
    private ResourceBundle strings;
    private final Map<String, Locale> localidades = new HashMap<>();
    private Properties properties;

    //bloco anônimo
    {
        localidades.put("FR", Locale.FRANCE);
        localidades.put("US", Locale.US);
        localidades.put("CN", Locale.CHINA);
        localidades.put("RU", new Locale("ru", "RU"));
        localidades.put("BR", Locale.getDefault());

    }

    private Parametrizador() {
        try (
                FileInputStream fis = new FileInputStream("settings.properties");
                BufferedInputStream bis = new BufferedInputStream(fis)
            ) {
            this.properties = new Properties();
            this.properties.load(bis);
            
            this.pais = properties.getProperty("locale");
            this.locale = localidades.get(pais);
            this.strings = ResourceBundle.getBundle("strings", localidades.get(pais));

        } catch (FileNotFoundException e) {
            throw new RuntimeException("Erro ao obter parâmetros: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException("Erro ao obter parâmetros: " + e.getMessage());
        }
    }

    public static Parametrizador getInstance() {
        return instance;
    }

    public ResourceBundle getStrings() {
        return strings;
    }

    public Locale getLocale() {
        return locale;
    }

    public String getProperties(String key) {
        return properties.getProperty(key);
    }
    
}
