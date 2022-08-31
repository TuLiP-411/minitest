package views;

import controller.MaterialManager;
import model.Material;

import java.util.Scanner;

public class Main {
    static MaterialManager materialManager = new MaterialManager();

    public static void main(String[] args) {
        Material material = creatNewMaterial();
        materialManager.addNewMaterial(material);
    }

    public static Material creatNewMaterial(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return null;
    }
}