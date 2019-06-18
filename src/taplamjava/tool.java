/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taplamjava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Hoaidanh
 */
public class tool {

    public void docfile(JTextArea txt, String filename) {
        String sR="";FileInputStream fi=null;
        try { fi = new FileInputStream(filename);
        InputStreamReader isr = new InputStreamReader(fi, "utf-8");
        BufferedReader br = new BufferedReader(isr);
        String  sNewLine;

        while ((sNewLine = br.readLine()) != null){
            sR += sNewLine + "\n";
        }
        } catch (IOException e) {
           e.printStackTrace();
        }
        finally {
            try {
               fi.close();
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
        
        txt.setText(sR);
        
        
 
    }

    public String openfile(JTextArea txt) {//Tạm thời chỉ đọc file txt
        JFileChooser c = new JFileChooser();
        String filename = "";
        //open
        int rVal = c.showOpenDialog(null);
        //rVal == JFileChooser.APPROVE_OPTION // người dùng đã chọn thành công một file.
        //rVal == JFileChooser.CANCEL_OPTION // người dùng không chọn file nào vào nhấn thoát.
        if (rVal == JFileChooser.APPROVE_OPTION) {
            filename = c.getSelectedFile().getName();
            String dir = c.getCurrentDirectory().toString();
            String filePath = dir + "\\" + filename;
            try {
                System.out.print(filename);
                docfile(txt, filePath);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Tạm thời bố mày làm đọc file txt thôi!! OK???");
            }

        }
        return filename;
    }

    public void newfile(JTextArea txt) {
        txt.setText("");
    }

    public void savefile(JTextArea txt) {
        JFileChooser c = new JFileChooser();
        int rVal = c.showSaveDialog(null);
        if (rVal == JFileChooser.APPROVE_OPTION) {
            String filename = (c.getSelectedFile().getName());
            String dir = (c.getCurrentDirectory().toString());
            String filePath = dir + "\\" + filename;
            ghifile(txt, filePath);
        }
    }

    public void ghifile(JTextArea txt, String filename) {
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {

            fw = new FileWriter(filename);
            bw = new BufferedWriter(fw);
            bw.write(txt.getText());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
