package org.gerdoc.pixup.gui.consola;

import org.gerdoc.pixup.model.Estado;
import org.gerdoc.pixup.util.ReadUtil;

import java.io.File;

public class EstadoCatalogo extends Catalogos<Estado>
{
    public static EstadoCatalogo estadoCatalogo;
    private EstadoCatalogo( )
    {
        super();
    }

    public static EstadoCatalogo getInstance( )
    {
        if(estadoCatalogo==null)
        {
            estadoCatalogo = new EstadoCatalogo();
        }
        return estadoCatalogo;
    }

    @Override
    public Estado newT()
    {
        return new Estado( );
    }

    @Override
    public boolean processNewT(Estado estado)
    {
        System.out.println("Teclee un estado" );
        estado.setNombre( ReadUtil.read( ) );
        return true;
    }

    @Override
    public void processEditT(Estado estado)
    {
        System.out.println("Id del Estado " + estado.getId( ) );
        System.out.println("Estado a editar: " + estado.getNombre( ) );
        System.out.println("Teclee el valor nuevo del estado" );
        estado.setNombre( ReadUtil.read( ) );
    }

    @Override
    public File getFile() {
        return null;
    }

}
