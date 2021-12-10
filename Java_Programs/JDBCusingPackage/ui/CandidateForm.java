package com.mkpits.ui;
import com.mkpits.service.CandidateService;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CandidateForm extends JFrame {
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1,b2,b3,b4;
    public CandidateForm(){
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        l1=new JLabel("FirstName: ");
        l1.setBounds(30,50,100,35);
        add(l1);
        t1=new JTextField();
        t1.setBounds(130,50,150,35);
        add(t1);

        l2=new JLabel("LastName: ");
        l2.setBounds(30,100,100,35);
        add(l2);
        t2=new JTextField();
        t2.setBounds(130,100,150,35);
        add(t2);

        b1=new JButton("Save");
        b1.setBounds(40,160,100,35);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CandidateService cs=new CandidateService();
                String res=cs.insertCandidate(t1.getText(),t2.getText());
                l3.setText(res);
            }
        });
        add(b1);

        b2=new JButton("Update");
        b2.setBounds(150,160,100,35);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CandidateService cs=new CandidateService();
                String res=cs.updateCandidate(t1.getText(),t2.getText());
                l3.setText(res);
            }
        });
        add(b2);

        b3=new JButton("Delete");
        b3.setBounds(40,210,100,35);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CandidateService cs=new CandidateService();
                String res=cs.deleteCandidate(t1.getText());
                l3.setText(res);
            }
        });
        add(b3);

        l3=new JLabel("Info");
        l3.setBounds(30,250,200,35);
        add(l3);
    }
    public static void main(String[] args){
        CandidateForm c=new CandidateForm();
    }
}
