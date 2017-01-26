/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muic.ooc.design.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gigadot
 */
public class InMemoryDatabase {

    private final Map<String, String> dataStore = new HashMap<>();

    private static InMemoryDatabase inMemoryDatabase = null;

    private InMemoryDatabase() {
    }

    public static InMemoryDatabase getInstance() {
        if (null == inMemoryDatabase) {
            inMemoryDatabase = new InMemoryDatabase();
        }
        return inMemoryDatabase;
    }

    public void save(String key, String value) {
        dataStore.put(key, value);
    }

    public String find(String key) {
        return dataStore.get(key);
    }
}
