package org.gerdoc.pixup.gui.consola;

import org.gerdoc.pixup.model.Disquera;
import org.gerdoc.pixup.util.ReadUtil;

import java.io.File;

public class DisqueraCatalogos extends Catalogos<Disquera>
{
    private static DisqueraCatalogos disqueraCatalogos;
    public DisqueraCatalogos() {

    }
    public static DisqueraCatalogos getInstance() {
        if (disqueraCatalogos == null) {
            disqueraCatalogos = new DisqueraCatalogos();
        }
        return disqueraCatalogos;
    }

    @Override
    public Disquera newT() {
        return new Disquera();
    }

    @Override
    public boolean processNewT(Disquera disquera) {
        System.out.println("Escriba el nombre de la Disquera");
        disquera.setDisquera(ReadUtil.read());
        return true;
    }

    @Override
    public void processEditT(Disquera disquera) {
        System.out.println("El nombre de la Disquera es: " + disquera.getDisquera());
        System.out.println("Escriba el nuevo nombre de la Disquera: ");;
        disquera.setDisquera(ReadUtil.read());
    }
    @Override
    public File getFile(){
        return new File("Disquera.list");
    }
}
