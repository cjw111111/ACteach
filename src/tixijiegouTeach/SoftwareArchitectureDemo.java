package tixijiegouTeach;


import KWICMainSubProgram.demo1;
import KWICObjectOriented.Main;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class SoftwareArchitectureDemo{

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("欢迎使用软件体系结构教学软件！");
        System.out.println("请选择要使用的软件体系结构风格：");
        System.out.println("1. 主程序-子程序");
        System.out.println("2. 面向对象");
        System.out.println("3. 事件系统");
        System.out.println("4. 管道-过滤器");
        System.out.print("请选择（输入数字 1-4）：");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                demo1 demo01 =new demo1();
                demo01.main(args);
                new DisplayImage().processUsingMainSubProgram();
                break;
            case 2:
                Main demo02 =new Main();
                demo02.main(args);
                new DisplayImage().processUsingObjectOriented();
                break;
            case 3:
                KWICEventSystem.Main demo03= new KWICEventSystem.Main();
                demo03.main(args);
                new DisplayImage().processUsingEventSystem();
                break;
            case 4:
                KWICPipeFilter.Main demo04 = new KWICPipeFilter.Main();
                demo04.main(args);
                new DisplayImage().processUsingPipeFilter();
                break;
            default:
                System.out.println("输入错误，请重新运行程序并选择正确的选项。");
        }

        scanner.close();
    }

}