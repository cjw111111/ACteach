package KWICEventSystem;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("请输入您的文件地址（例如：C:/temp/myfile.txt）：");
        Scanner sca=new Scanner(System.in);
        //创建主题
        KWICSubject kwicSubject = new KWICSubject();
        //创建观察者
        Input input = new Input(sca.nextLine());
        Shift shift = new Shift(input.getLineTxt());
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        System.out.println("请选择输出文件的保存路径：");
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            String outputPath = fileChooser.getSelectedFile().getAbsolutePath();
            System.out.println("输出文件路径：" + outputPath);
            Output output = new Output(alphabetizer.getKwicList(),outputPath );

            try {
                Desktop.getDesktop().open(new File(outputPath));
            } catch (IOException e) {
                e.printStackTrace();
            }

            // 将观察者加入主题
            kwicSubject.addObserver(input);
            kwicSubject.addObserver(shift);
            kwicSubject.addObserver(alphabetizer);
            kwicSubject.addObserver(output);
            // 逐步调用各个观察者
            kwicSubject.startKWIC();
        }

    }
}

