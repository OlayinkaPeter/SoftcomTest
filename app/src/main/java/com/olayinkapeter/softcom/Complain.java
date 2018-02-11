package com.olayinkapeter.softcom;

import java.io.StringReader;

/**
 * Created by Olayinka_Peter on 2/10/2018.
 */

public class Complain {
    private String complain;
    private String username;

    public Complain(String complain, String username) {
        this.complain = complain;
        this.username = username;
    }

    public String getComplain() {
        return complain;
    }

    public String getUsername() {
        return username;
    }

    public void setComplain (String complain) {
        this.complain = complain;
    }

    public void setUsername (String username) {
        this.username = username;
    }
}
