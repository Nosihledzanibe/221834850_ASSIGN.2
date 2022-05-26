/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NOSIHLE DZANIBE
 */
import javax.swing.*;
public class Computer extends JFrame
{
    public Computer() 
    { 
        super("IP address");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    String IPAddress;
    float Value;

    public Computer(String ip,float value )
    {
    this.IPAddress=ip;
    this.Value=value;
    }
  
    public String toString()
    {
    String s= this.IPAddress+this.Value+"\n";
    return s;
    }
}
     
 