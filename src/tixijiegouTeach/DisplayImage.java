package tixijiegouTeach;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class DisplayImage extends JFrame {
    public void processUsingMainSubProgram() {
        try {
            // 通过链接加载图片
            URL imageUrl = new URL("https://img-blog.csdnimg.cn/20201209233858758.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80Mzg1MzA5Nw==,size_16,color_FFFFFF,t_70#pic_center");
            BufferedImage image = ImageIO.read(imageUrl);

            int width = image.getWidth();
            int height = image.getHeight();
            int newWidth = width * 2; // 放大两倍
            int newHeight = height * 2;

            Image scaledImage = image.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
            ImageIcon icon = new ImageIcon(scaledImage);
            JLabel imageLabel = new JLabel(icon); // 创建 JLabel 并设置图片

            String text = "<html><div style='font-size: 20px; height: 500px; width: 1200px'>" +
                    "主程序-子程序风格原理：<br/>" +
                    "主程序-子程序风格将一个大型的程序分解成主程序和多个子程序，以组织和管理程序的结构和逻辑。<br/>" +
                    "在主程序-子程序风格中，主程序是程序的入口点，它负责协调和控制整个程序的执行流程。主程序通常负责处理用户输入、调用各个子程序、处理子程序返回的结果等。<br/>" +
                    "子程序是主程序的辅助部分，它们被组织成独立的功能模块，每个子程序负责完成一个具体的任务或功能。子程序可以接受参数，执行相应的计算或操作，并返回结果给主程序。<br/></div></html>";
            JLabel textLabel = new JLabel(text); // 创建包含文字的 JLabel
            textLabel.setFont(textLabel.getFont().deriveFont(20f)); // 放大字体

            JPanel panel = new JPanel(new BorderLayout());
            panel.add(imageLabel, BorderLayout.CENTER);
            panel.add(textLabel, BorderLayout.SOUTH);

            JFrame frame = new JFrame();
            frame.getContentPane().add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void processUsingObjectOriented() {
        try {
            // 通过链接加载图片
            URL imageUrl = new URL("https://img-blog.csdnimg.cn/20201209233922504.png#pic_center");
            BufferedImage image = ImageIO.read(imageUrl);

            int width = image.getWidth();
            int height = image.getHeight();
            int newWidth = width * 2; // 放大两倍
            int newHeight = height * 2;

            Image scaledImage = image.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
            ImageIcon icon = new ImageIcon(scaledImage);
            JLabel imageLabel = new JLabel(icon); // 创建 JLabel 并设置图片
            String text = "<html><div style='font-size: 20px; height: 500px; width: 1200px'>" +
                    "面向对象体系结构风格原理：<br/>" +
                    "面向对象体系结构风格是基于对象的概念来组织和管理软件系统。<br/>" +
                    "在面向对象的体系结构中，系统由一组相互协作的对象组成，每个对象都有自己的状态（属性）和行为（方法）。对象之间通过消息传递来进行通信和交互。<br/></div></html>" ;

            JLabel textLabel = new JLabel(text); // 创建包含文字的 JLabel
            textLabel.setFont(textLabel.getFont().deriveFont(20f)); // 放大字体

            JPanel panel = new JPanel(new BorderLayout());
            panel.add(imageLabel, BorderLayout.CENTER);
            panel.add(textLabel, BorderLayout.SOUTH);

            JFrame frame = new JFrame();
            frame.getContentPane().add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void processUsingEventSystem() {
        try {
            // 通过链接加载图片
            URL imageUrl = new URL("https://img-blog.csdnimg.cn/20201209233936983.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80Mzg1MzA5Nw==,size_16,color_FFFFFF,t_70#pic_center");
            BufferedImage image = ImageIO.read(imageUrl);

            int width = image.getWidth();
            int height = image.getHeight();
            int newWidth = width * 2; // 放大两倍
            int newHeight = height * 2;

            Image scaledImage = image.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
            ImageIcon icon = new ImageIcon(scaledImage);
            JLabel imageLabel = new JLabel(icon); // 创建 JLabel 并设置图片
            String text = "<html><div style='font-size: 20px; height: 500px; width: 1200px'>" +
                    "事件系统体系结构原理：<br/>" +
                    "事件驱动体系结构风格通过将系统中的各个组件（通常是服务或模块）解耦，使得它们之间的通信和交互通过事件的方式进行。<br/>" +
                    "在这种架构中，某个组件的状态变化或者动作触发一个事件，然后其他感兴趣的组件可以通过订阅这个事件来获得相关的信息并采取相应的行动。<br/>"+
                    "这种解耦的方式可以提高系统的可扩展性、可维护性和灵活性，使得系统更容易适应变化和处理复杂的业务逻辑。<br/></div></html>" ;

            JLabel textLabel = new JLabel(text); // 创建包含文字的 JLabel
            textLabel.setFont(textLabel.getFont().deriveFont(20f)); // 放大字体

            JPanel panel = new JPanel(new BorderLayout());
            panel.add(imageLabel, BorderLayout.CENTER);
            panel.add(textLabel, BorderLayout.SOUTH);

            JFrame frame = new JFrame();

            frame.getContentPane().add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void processUsingPipeFilter() {
        try {
            // 通过链接加载图片
            URL imageUrl = new URL("https://img-blog.csdnimg.cn/20201209233949962.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80Mzg1MzA5Nw==,size_16,color_FFFFFF,t_70#pic_center");
            BufferedImage image = ImageIO.read(imageUrl);

            int width = image.getWidth();
            int height = image.getHeight();
            int newWidth = width * 2; // 放大两倍
            int newHeight = height * 2;

            Image scaledImage = image.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
            ImageIcon icon = new ImageIcon(scaledImage);
            JLabel imageLabel = new JLabel(icon); // 创建 JLabel 并设置图片
            String text = "<html><div style='font-size: 20px; height: 500px; width: 1200px'>" +
                    "管道-过滤软件原理：<br/>" +
                    "管道-过滤软件体系结构将数据处理过程划分为一系列的过滤器（Filter），每个过滤器负责对输入数据进行某种特定的处理或转换，并将结果传递给下一个过滤器，最终得到最终的输出结果。<br/>"+"这种架构模式类似于流水线工作方式，每个过滤器都只关注自己的特定任务，而不需要知道整个处理过程的细节。<br/></div></html>" ;

            JLabel textLabel = new JLabel(text); // 创建包含文字的 JLabel
            textLabel.setFont(textLabel.getFont().deriveFont(20f)); // 放大字体

            JPanel panel = new JPanel(new BorderLayout());
            panel.add(imageLabel, BorderLayout.CENTER);
            panel.add(textLabel, BorderLayout.SOUTH);

            JFrame frame = new JFrame();
            frame.getContentPane().add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
