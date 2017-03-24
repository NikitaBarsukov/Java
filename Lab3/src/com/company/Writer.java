package com.company;

class Writer implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 18; i++) {
            Main.write();
        }
    }
}