package ss17_binaryFile_serialization.bai_tap.productManagement.service.impl;


import ss17_binaryFile_serialization.bai_tap.productManagement.model.Product;
import ss17_binaryFile_serialization.bai_tap.productManagement.service.IProductService;
import ss17_binaryFile_serialization.bai_tap.productManagement.utils.DuplicateIDException;
import ss17_binaryFile_serialization.bai_tap.productManagement.utils.ReadWriteFileUtils;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static Scanner scanner = new Scanner(System.in);
    private static final String path = "src/ss17_binary_file_serialization/exercise/data/data.dat";

    @Override
    public void add() {
        List<Product> productList = ReadWriteFileUtils.readDataFromFile(path);

        int id;
        while (true) {
            try {
                System.out.print("Nhập vào Id: ");
                id = Integer.parseInt(scanner.nextLine());

                for (Product product : productList) {
                    if (product.getId() == id) {
                        throw new DuplicateIDException("Id đã tồn tại, nhập lại!");
                    }
                }
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("Nhập chữ số!");
            }
            catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.print("Nhập vào tên sản phẩm: ");
        String name = scanner.nextLine();

        System.out.print("Nhập vào hãng sản xuất: ");
        String manufacturer = scanner.nextLine();

        int price;
        while (true) {
            try {
                System.out.print("Nhập vào giá tiền: ");
                price = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập chữ số!");
            }
        }

        productList.add(new Product(id, name, manufacturer, price));
        ReadWriteFileUtils.writeDataFromFile(path, productList);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void displayMenu() {
        List<Product> productList = ReadWriteFileUtils.readDataFromFile(path);
        System.out.print("Danh sách sản phẩm.");
        for (Product product : productList){
            System.out.println(product);
        }
    }

    @Override
    public void findByName() {
        List<Product> productList = ReadWriteFileUtils.readDataFromFile(path);

        System.out.print("Nhập tên sảm phẩm cầm tìm: ");
        String name = scanner.nextLine();

        boolean isExist = false;

        for (Product product : productList) {
            if (name.equals(product.getName())) {
                System.out.println(product);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.print("Hiện tại chưa có sản phẩm này hoặc bạn đã nhập sai!");
        }
    }

    @Override
    public void findById() {
        List<Product> productList = ReadWriteFileUtils.readDataFromFile(path);

        System.out.print("Nhập vào Id cần tìm: ");
        int id = Integer.parseInt(scanner.nextLine());

        boolean isExist = false;

        for (int i = 0; i < productList.size(); i++){
            if(id == productList.get(i).getId()){
                System.out.print(productList.get(i).toString());
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.print("Id không tồn tại.");
        }
    }

}
