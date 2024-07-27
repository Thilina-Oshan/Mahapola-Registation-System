///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Classes;
//
//import Interfase.AddAplicant;
//import Interfase.MainInterfase;
//import com.formdev.flatlaf.FlatDarkLaf;
//import javax.swing.JPanel;
//import javax.swing.UIManager;
//
//public class Mpma {
//
//    public static MainInterfase mainFrame;
//    public static AddAplicant adl;
//
//    public static void main(String[] args) {
//        try {
//            UIManager.setLookAndFeel(new FlatDarkLaf());
//        } catch (Exception ex) {
//            System.err.println("Failed to initialize LaF");
//        }
//        System.out.println("Creating Mpma instance...");
//        Mpma instance = new Mpma();
//        System.out.println("Calling goToMainMenu...");
//        instance.goToMainMenu();
//    }
//
//    public Mpma() {
//        // Initialize AddAplicant in the constructor
//        adl = new AddAplicant();
//        System.out.println("adl initialized: " + (adl != null));
//    }
//    
//      public void goToMainMenu() {
//        adl.setVisible(true);
//    }
//    
////  public static void goToMainMenu() {
////        adl = new AddAplicant();
////        System.out.println("adl initialized: " + (adl != null));
////        adl.setVisible(true);
////    }
//    
//       public static void changePanel(JPanel panel) {
//        if (adl != null) {
//            adl.changePanel(panel);
//        } else {
//            System.err.println("adl is not initialized when calling changePanel");
//        }
//    }
//      
////   public static void changePanel(JPanel panel) {
////        if (adl != null) {
////            adl.changePanel(panel);
////        } else {
////            System.err.println("adl is not initialized when calling changePanel");
////        }
////    }
//
////    public static void goToMainMenu() {
////        adl = new AddAplicant();
////        adl.setVisible(true);
////    }
////    public static void changePanel(JPanel panel) {
////        adl.changePanel(panel);
////    }
//}
