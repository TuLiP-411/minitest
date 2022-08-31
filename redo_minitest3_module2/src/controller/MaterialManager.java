package controller;

import model.Discount;
import model.Material;
import storage.ReadWriteFile;

import java.io.IOException;
import java.util.List;

public class MaterialManager {

    public List<Material> materialList;

    {
        try {
            materialList = ReadWriteFile.readFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void getDiscount(){
        for (int i = 0; i < materialList.size(); i++) {
            if (materialList.get(i) instanceof Discount){
                ((Discount)materialList.get(i)).getRealMoney();
            }
        }
    }

    public void addNewMaterial(Material material){
        materialList.add(material);
        ReadWriteFile.writeFile(materialList);
    }

    public void editMaterialByIndex(int index, Material material){
        materialList.set(index, material);
        ReadWriteFile.writeFile(materialList);
    }
}
