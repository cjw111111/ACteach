package KWICObjectOriented;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("请输入您的文件地址（例如：C:/temp/myfile.txt）：");
        Scanner sca=new Scanner(System.in);
        Input input = new Input();
        input.input(sca.nextLine());
        Shift shift = new Shift(input.getLineTxt());
        shift.shift();
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        alphabetizer.sort();
        Output output = new Output(alphabetizer.getKwicList());
        System.out.println("请选择输出文件的保存路径：");
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            String outputPath = fileChooser.getSelectedFile().getAbsolutePath();
            System.out.println("输出文件路径：" + outputPath);
            output.output(outputPath);

            try {
                Desktop.getDesktop().open(new File(outputPath));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

