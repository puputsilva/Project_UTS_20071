/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Messenger;

/**
 *
 * @author HP
 */
public class Sender {
    public static void main(String[] args) {
        StdMessenger std = new StdMessenger();
        System.out.println("StdMessenger ");
        std.SendMessege("", "Test", "Hai");
        std.SendMessege("Puput", "Bani", "Halo Roni! Apa Kabar?");
        
        MaillMessenger maill = new MaillMessenger();
        System.out.println("MaillMessenger");
        maill.connect();
        maill.SendMessege("", "Secret", "Dont tell anyone");
        maill.SendMessege("Puput", "Rani", "Burned..");
        maill.disconnect();
        maill.SendMessege("Pupyt", "Gift", "Alpin Ring");
    }
}
