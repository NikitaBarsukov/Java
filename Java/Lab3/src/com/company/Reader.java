package com.company;

import static java.lang.Thread.*;

class Reader implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 18; i++) {
            Main.read();

        }

    }
}