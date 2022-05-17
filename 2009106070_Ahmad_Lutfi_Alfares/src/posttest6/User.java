/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

import java.io.IOException;

/**
 *
 * @author Hp GK
 */
public class User {
    private final Aplikasi user;
    
    public User (Aplikasi user){
        this.user = user;
    }
    
    void bukaAplikasi() throws IOException{
        this.user.bukaAplikasi();
    }
    
    void batalBuka() throws IOException{
        this.user.batalBuka();
    }
}
