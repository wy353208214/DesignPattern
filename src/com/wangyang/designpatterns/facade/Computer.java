package com.wangyang.designpatterns.facade;

/**
 * Created by yang.wang on 2016/4/11.
 */
public class Computer {

    private GPU gpu;
    private CPU cpu;
    private  Disk disk;

    public Computer() {
        gpu = new GPU();
        cpu = new CPU();
        disk = new Disk();
    }

    public void start() {
        System.out.println("电脑启动了");
        gpu.start();
        cpu.start();
        disk.start();
    }
}
