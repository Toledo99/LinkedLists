/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LISTA;

/**
 *
 * @author Alvaro Romo
 */
public interface ListaOrdADT <T extends Comparable<T>> extends ListaADT<T>{
    public boolean agrega(T dato);
    
}
