package com.bit.x4.copy;

public class Copy implements Cloneable {
    String name;

    Copy(String name) {
        this.name = name;
    }

    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return obj;
//        return super.clone();
    }
}
