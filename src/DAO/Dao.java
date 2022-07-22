/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;

/**
 *
 * @author vomin
 */
public interface Dao<T> {
   
    boolean checkIDValid(String idTable);
    void them(T t);
    boolean xoa(String id);
    void sua(T t);
    T timkiemtheoID(String id);
    ArrayList<T> toanbodanhsach();
}
