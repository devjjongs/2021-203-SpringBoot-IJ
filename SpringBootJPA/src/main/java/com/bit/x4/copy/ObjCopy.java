package com.bit.x4.copy;

public class ObjCopy {
    public static void main(String[] args) {
        Copy a = new Copy("name");
        Copy b = (Copy) a.clone();
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
