/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
<<<<<<< HEAD
 * @author Christoffer
=======
 * @author danielpedersen
>>>>>>> edff1c8c0671cec7a9ce7ec1d3c094cbd1eefe5c
 */
@Entity
public class PhoneEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long phone_id;
    private int number; 
    private String description;
    private Phone phone;

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
    

    public Long getId() {
        return phone_id;
    }

    public PhoneEntity(Long phone_id, int number, String description) {
        this.phone_id = phone_id;
        this.number = number;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    

    public void setId(Long id) {
        this.phone_id = phone_id;
    }


=======
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int number;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   
    
>>>>>>> edff1c8c0671cec7a9ce7ec1d3c094cbd1eefe5c
}
