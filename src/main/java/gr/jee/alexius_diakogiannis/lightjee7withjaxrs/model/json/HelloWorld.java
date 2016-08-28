/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.jee.alexius_diakogiannis.lightjee7withjaxrs.model.json;

import java.util.List;

/**
 *
 * @author Alexis-Dionisis
 */
public class HelloWorld {
    
    String myName;
    List<String> myCities;

    public HelloWorld() {
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public List<String> getMyCities() {
        return myCities;
    }

    public void setMyCities(List<String> myCities) {
        this.myCities = myCities;
    }

    
    
    
    
}
