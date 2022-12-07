/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhakaeducationboard;

import java.io.Serializable;

/**
 *
 * @author willi
 */
public class HeadOfExamination extends User implements Serializable {

    public HeadOfExamination() {
    }

    public HeadOfExamination(String userName, String userid, String email, String password) {
        super(userName, userid, email, password);
    }
   
    
}
