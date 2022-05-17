package com.interfaces2.app;

import com.interfaces2.dominio.Antivirus;
import com.interfaces2.dominio.Aplicacion;
import com.interfaces2.dominio.DocumentoPDF;
import com.interfaces2.dominio.DocumentoWord;

public class AppAntivirus {
    public static void main(String[] args) {
        Antivirus norton = new Antivirus();
        DocumentoPDF pdf = new DocumentoPDF("Tesis.pdf", true);
        DocumentoWord word = new DocumentoWord("Carta.docx", 2);
        Aplicacion app = new Aplicacion("los_sims.jar");

        norton.agregar(app);
        norton.agregar(pdf);
        norton.agregar(word);

        norton.escanear();
    }
}
