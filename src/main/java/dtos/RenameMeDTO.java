/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.RenameMe;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tha
 */
public class RenameMeDTO {
    private int id;
    private String email;
    private String firstName;
    private String lastName;
    private int phoneNumber;

    public RenameMeDTO(int id, String email, String firstName, String lastName, int phoneNumber) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    
    
    public static List<RenameMeDTO> getDtos(List<RenameMe> rms){
        List<RenameMeDTO> rmdtos = new ArrayList();
//        rms.forEach(rm->rmdtos.add(new RenameMeDTO(rm)));
        return rmdtos;
    }


    public RenameMeDTO(RenameMe rm) {
        this.id = rm.getId();
        this.phoneNumber = rm.getPhoneNumber();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
   
    
    
    
    
    
    
}
