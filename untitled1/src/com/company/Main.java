package com.company;

public class Main {

    public static void main(String[] args) {

        final String src = "D:\\vs.txt";
        FileManager fileManager = null;
        try {
            fileManager = new FileManager();
            long start = System.nanoTime();
            fileManager.copy_l(src, "D:\\vs_copy.txt");
            System.out.println(System.nanoTime() - start);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


}
    }

