/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin24;

import javax.swing.*;

/**
 *
 * @author aparcerozas
 */
public class Componentes {
    JFrame marco;
    JPanel panel1, panel2;
    JButton boton1, boton2, boton3;
    JLabel label1, label2;
    JTextField text1, text2;
    JList list;
    JTextArea area;
    
    public void crearMarco(){
        marco = new JFrame("Boletín 24");
        marco.setSize(450, 700);
        panel1 = crearPanel1();
        panel2 = crearPanel2();
        marco.add(panel1);
        marco.add(panel2);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public JPanel crearPanel1(){
        panel1 = new JPanel();
        panel1.setSize(400, 300);
        label1 = new JLabel("NOME");
        label2 = new JLabel("PASSWORD");
        text1 = new JTextField();
        text2 = new JTextField();
        boton1 = new JButton("PREMER");
        boton2 = new JButton("LIMPAR");
        label1.setBounds(50, 50, 100, 30);
        label2.setBounds(50, 100, 150, 30);
        text1.setBounds(200, 50, 150, 30);
        text2.setBounds(200, 100, 150, 30);
        boton1.setBounds(50, 200, 100, 50);
        boton2.setBounds(250, 200, 100, 50);
        panel1.setLayout(null);
        panel1.add(label1);
        panel1.add(label2);
        panel1.add(text1);
        panel1.add(text2);
        panel1.add(boton1);
        panel1.add(boton2);
        return panel1;
    }
    
    public JPanel crearPanel2(){
        panel2 = new JPanel();
        panel2.setSize(400, 300);
        String[] ele = {"ElementoList1","ElementoList2","ElementoList3"};
        list = new JList(ele);
        boton3 = new JButton("BOTON");
        area = new JTextArea();
        list.setBounds(20, 350, 130, 250);
        boton3.setBounds(175, 380, 100, 50);
        area.setBounds(300, 350, 130, 250);
        panel2.setLayout(null);
        panel2.add(list);
        panel2.add(boton3);
        panel2.add(area);
        return panel2;
    }
}
