package com.example.demo.javacode.Sber;

import java.util.Collection;
import java.util.Map;

public class Unknown {
    private static Map<String, Entity> composeMap(Collection<Entity> data) {
        return null;
    }

    static class Entity {
        String key;
        int val;

        public Entity(String key, int val) {
            this.key = key;
            this.val = val;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "Entity{" +
                    "key='" + key + '\'' +
                    ", val=" + val +
                    '}';
        }
    }

}
