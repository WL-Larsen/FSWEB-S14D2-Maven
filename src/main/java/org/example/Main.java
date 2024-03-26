package org.example;

import org.example.model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Duvarlar
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        // Tavan
        Ceiling ceiling = new Ceiling(10, PaintColor.WHITE);

        // Yatak
        Bed bed = new Bed("King", 2, 100, 1, 2);

        // Lamba
        Lamp lamp = new Lamp(LampType.NORMAL, true, 5);

        // Gardırop
        Wardrobe wardrobe = new Wardrobe(150, 200, 50.5);

        // Halı
        Carpet carpet = new Carpet(300, 400, PaintColor.GREEN);

        // Bedroom objesi oluşturulması
        Bedroom bedroom = new Bedroom("Master Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);

        // Test işlemleri
        System.out.println("Bedroom Name: " + bedroom.getName());
        System.out.println("Ceiling Height: " + bedroom.getCeiling().getHeight());
        System.out.println("Bed Style: " + bedroom.getBed().getStyle());
        System.out.println("Lamp Type: " + bedroom.getLamp().getStyle());
        System.out.println("Wardrobe Width: " + bedroom.getWardrobe().getWidth());
        System.out.println("Carpet Color: " + bedroom.getCarpet().getColor());
    }
}
