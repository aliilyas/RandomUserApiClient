/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aliilyas.randomuserjava.pojo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ilyas
 */
public class Result {

    private User user;
    private String seed;
    private String version;

    public Result() {
    }

    public Result(User user, String seed, String version) {
        this.user = user;
        this.seed = seed;
        this.version = version;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    
    
}
