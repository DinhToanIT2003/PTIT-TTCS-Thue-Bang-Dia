/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vduct
 */
public class Acount {
    String id;
    String pass;
    int role;

    public void setRole(int role) {
        this.role = role;
    }

    public int getRole() {
        return role;
    }

    public String getId() {
        return id;
    }

    public String getPass() {
        return pass;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPass(String pass) {
        this.pass = pass;
    } 
}
