package KWICPipeFilter;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入您的文件地址（例如：C:/temp/myfile.txt）：");
        Scanner sca=new Scanner(System.in);
        File inFile = new File(sca.nextLine());
        System.out.println("请选择输出文件的保存路径：");
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            String outputPath = fileChooser.getSelectedFile().getAbsolutePath();
            System.out.println("输出文件路径：" + outputPath);
            File outFile = new File(outputPath);

            try {
                Desktop.getDesktop().open(new File(outputPath));
            } catch (IOException e) {
                e.printStackTrace();
            }

            Pipe pipe1 = new Pipe();
            Pipe pipe2 = new Pipe();
            Pipe pipe3 = new Pipe();
            Input input = new Input(inFile, pipe1);
            Shift shift = new Shift(pipe1, pipe2);
            Alphabetizer alphabetizer  = new Alphabetizer(pipe2, pipe3);
            Output output = new Output(outFile,pipe3);
            input.transform();
            shift.transform();
            alphabetizer.transform();
            output.transform();
        }


    }
}

