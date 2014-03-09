/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aliilyas.randomuserjava.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ilyas
 */
public class RandomResponse {

    private List<Result> results;

    public RandomResponse() {
        results = new ArrayList<Result>();
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

}
