package contacts1;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final ContactDAO contactDAO = new ContactDAO();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请选择操作:");
            System.out.println("1. 查看所有联系人");
            System.out.println("2. 添加联系人");
            System.out.println("3. 修改联系人");
            System.out.println("4. 删除联系人");
            System.out.println("0. 退出");
            System.out.print("请选择操作编号: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // 查看所有联系人
                    List<Contact> contacts = contactDAO.getAllContacts();
                    System.out.println("所有联系人:");
                    for (Contact contact : contacts) {
                        System.out.println(contact);
                    }
                    break;
                case 2:
                    // 添加联系人
                    System.out.print("请输入联系人姓名: ");
                    String name = scanner.next();
                    System.out.print("请输入联系人电话: ");
                    String phone = scanner.next();
                    System.out.print("请输入联系人邮箱: ");
                    String email = scanner.next();
                    System.out.print("请输入联系人地址: ");
                    String address = scanner.next();
                    Contact newContact = new Contact(name, phone, email, address);
                    contactDAO.addContact(newContact);
                    System.out.println("联系人添加成功!");
                    break;
                case 3:
                    // 修改联系人

                    System.out.print("请输入新的联系人姓名: ");
                    String newName = scanner.next();
                    System.out.print("请输入新的联系人电话: ");
                    String newPhone = scanner.next();
                    System.out.print("请输入新的联系人邮箱: ");
                    String newEmail = scanner.next();
                    System.out.print("请输入新的联系人地址: ");
                    String newAddress = scanner.next();
                    Contact targetContact = new Contact();
                    targetContact.setName(newName);
                    targetContact.setPhone(newPhone);
                    targetContact.setEmail(newEmail);
                    targetContact.setAddress(newAddress);
                    contactDAO.updateContact(targetContact);
                    System.out.println("联系人修改成功!");
                    break;
                case 4:
                    // 删除联系人
                    System.out.print("请输入要删除的联系人姓名: ");
                    String deleteName = scanner.next();
                    contactDAO.deleteContact(deleteName);
                    System.out.println("联系人删除成功!");
                    break;
                case 0:
                    // 退出程序
                    System.exit(0);
                default:
                    System.out.println("无效的选择!");
                    break;
            }

            System.out.println(); // 输出一个空行，以便与下一轮循环进行区分
        }
    }
}
