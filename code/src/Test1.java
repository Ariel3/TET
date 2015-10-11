
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Student
 */
public class Test1 extends javax.swing.JFrame {

    /**
     * Creates new form Test1
     */
    boolean CB, BSB, flag;
    String ButtonName;

    public Test1() {

        flag = true;
        CB = BSB = false;

        initComponents();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test1().setVisible(true);

            }
        });
    }

    public boolean Contain(JButton b, int x, int y) {
        System.out.println("" + b.getBounds());
        return true;
    }

    public void isClick(JButton b, java.awt.event.MouseEvent evt) {

        int by = b.getBounds().y, bx = b.getBounds().x;

        int x = 0, y = 0;
        try {
            sleep(800);
            if (b.getName() == "Exit") {
                sleep(800);
            }
            if (getMousePosition() != null) {
                x = getMousePosition().x;
                y = getMousePosition().y;

                if (bx < x && bx + b.getWidth() > x) {
                    if (by < y && by + b.getHeight() > y) {
                        b.doClick();
                    }
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Test1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setText(String s) {
        if (s.equals("Enter")) {
            jTextArea1.setText(jTextArea1.getText() + "\n");
        } else if (s.equals("Space")) {
            jTextArea1.setText(jTextArea1.getText() + " ");
        } else if (s.equals("Clear")) {
            jTextArea1.setText("");
        } else if (s.equals("<---")) {
            s = jTextArea1.getText();
            jTextArea1.setText(s.substring(0, s.length() - 1));
        } else {
            jTextArea1.setText(jTextArea1.getText() + s);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        W = new javax.swing.JButton();
        A = new javax.swing.JButton();
        Q = new javax.swing.JButton();
        E = new javax.swing.JButton();
        S = new javax.swing.JButton();
        D = new javax.swing.JButton();
        F = new javax.swing.JButton();
        G = new javax.swing.JButton();
        H = new javax.swing.JButton();
        J = new javax.swing.JButton();
        X = new javax.swing.JButton();
        K = new javax.swing.JButton();
        C = new javax.swing.JButton();
        V = new javax.swing.JButton();
        R = new javax.swing.JButton();
        T = new javax.swing.JButton();
        Y = new javax.swing.JButton();
        U = new javax.swing.JButton();
        I = new javax.swing.JButton();
        O = new javax.swing.JButton();
        L = new javax.swing.JButton();
        Z = new javax.swing.JButton();
        P = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        four = new javax.swing.JButton();
        B = new javax.swing.JButton();
        N = new javax.swing.JButton();
        wink_smiley = new javax.swing.JButton();
        sad_smiley = new javax.swing.JButton();
        M = new javax.swing.JButton();
        comma = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        period = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        space = new javax.swing.JButton();
        three = new javax.swing.JButton();
        happy_smiley = new javax.swing.JButton();
        question = new javax.swing.JButton();
        exclamation = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        Enter = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        W.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        W.setText("W");
        W.setName("W"); // NOI18N
        W.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                WMouseEntered(evt);
            }
        });
        W.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WActionPerformed(evt);
            }
        });

        A.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        A.setText("A");
        A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AMouseEntered(evt);
            }
        });
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        Q.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Q.setText("Q");
        Q.setFocusCycleRoot(true);
        Q.setName("Q"); // NOI18N
        Q.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QMouseEntered(evt);
            }
        });
        Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QActionPerformed(evt);
            }
        });

        E.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        E.setText("E");
        E.setName("E"); // NOI18N
        E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EMouseEntered(evt);
            }
        });
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });

        S.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        S.setText("S");
        S.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SMouseEntered(evt);
            }
        });
        S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SActionPerformed(evt);
            }
        });

        D.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        D.setText("D");
        D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DMouseEntered(evt);
            }
        });
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });

        F.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        F.setText("F");
        F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FMouseEntered(evt);
            }
        });
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });

        G.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        G.setText("G");
        G.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GMouseEntered(evt);
            }
        });
        G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GActionPerformed(evt);
            }
        });

        H.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        H.setText("H");
        H.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HMouseEntered(evt);
            }
        });
        H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HActionPerformed(evt);
            }
        });

        J.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        J.setText("J");
        J.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JMouseEntered(evt);
            }
        });
        J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JActionPerformed(evt);
            }
        });

        X.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        X.setText("X");
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                XMouseEntered(evt);
            }
        });
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });

        K.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        K.setText("K");
        K.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                KMouseEntered(evt);
            }
        });
        K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KActionPerformed(evt);
            }
        });

        C.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        C.setText("C");
        C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CMouseEntered(evt);
            }
        });
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        V.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        V.setText("V");
        V.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VMouseEntered(evt);
            }
        });
        V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VActionPerformed(evt);
            }
        });

        R.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        R.setText("R");
        R.setName("R"); // NOI18N
        R.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RMouseEntered(evt);
            }
        });
        R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RActionPerformed(evt);
            }
        });

        T.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        T.setText("T");
        T.setName("T"); // NOI18N
        T.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TMouseEntered(evt);
            }
        });
        T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TActionPerformed(evt);
            }
        });

        Y.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Y.setText("Y");
        Y.setName("Y"); // NOI18N
        Y.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                YMouseEntered(evt);
            }
        });
        Y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YActionPerformed(evt);
            }
        });

        U.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        U.setText("U");
        U.setName("U"); // NOI18N
        U.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UMouseEntered(evt);
            }
        });
        U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UActionPerformed(evt);
            }
        });

        I.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        I.setText("I");
        I.setName("I"); // NOI18N
        I.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IMouseEntered(evt);
            }
        });
        I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IActionPerformed(evt);
            }
        });

        O.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        O.setText("O");
        O.setName("O"); // NOI18N
        O.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OMouseEntered(evt);
            }
        });
        O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OActionPerformed(evt);
            }
        });

        L.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        L.setText("L");
        L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LMouseEntered(evt);
            }
        });
        L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LActionPerformed(evt);
            }
        });

        Z.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Z.setText("Z");
        Z.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ZMouseEntered(evt);
            }
        });
        Z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZActionPerformed(evt);
            }
        });

        P.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        P.setText("P");
        P.setName("P"); // NOI18N
        P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PMouseEntered(evt);
            }
        });
        P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PActionPerformed(evt);
            }
        });

        seven.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        seven.setText("7");
        seven.setName("7"); // NOI18N
        seven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sevenMouseEntered(evt);
            }
        });
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        four.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        four.setText("4");
        four.setName("4"); // NOI18N
        four.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fourMouseEntered(evt);
            }
        });
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        B.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B.setText("B");
        B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BMouseEntered(evt);
            }
        });
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        N.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        N.setText("N");
        N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NMouseEntered(evt);
            }
        });
        N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NActionPerformed(evt);
            }
        });

        wink_smiley.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        wink_smiley.setText(";)");
        wink_smiley.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                wink_smileyMouseEntered(evt);
            }
        });
        wink_smiley.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wink_smileyActionPerformed(evt);
            }
        });

        sad_smiley.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        sad_smiley.setText(":(");
        sad_smiley.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sad_smileyMouseEntered(evt);
            }
        });
        sad_smiley.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sad_smileyActionPerformed(evt);
            }
        });

        M.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        M.setText("M");
        M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MMouseEntered(evt);
            }
        });
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });

        comma.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        comma.setText(",");
        comma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                commaMouseEntered(evt);
            }
        });
        comma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commaActionPerformed(evt);
            }
        });

        eight.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        eight.setText("8");
        eight.setName("8"); // NOI18N
        eight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eightMouseEntered(evt);
            }
        });
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        nine.setText("9");
        nine.setName("9"); // NOI18N
        nine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nineMouseEntered(evt);
            }
        });
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        five.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        five.setText("5");
        five.setName("5"); // NOI18N
        five.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fiveMouseEntered(evt);
            }
        });
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        six.setText("6");
        six.setName("6"); // NOI18N
        six.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sixMouseEntered(evt);
            }
        });
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        period.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        period.setText(".");
        period.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                periodMouseEntered(evt);
            }
        });
        period.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodActionPerformed(evt);
            }
        });

        backspace.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        backspace.setText("<---");
        backspace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backspaceMouseEntered(evt);
            }
        });
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });

        one.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        one.setText("1");
        one.setName("1"); // NOI18N
        one.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                oneMouseEntered(evt);
            }
        });
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        two.setText("2");
        two.setName("2"); // NOI18N
        two.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                twoMouseEntered(evt);
            }
        });
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        space.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        space.setText("Space");
        space.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                spaceMouseEntered(evt);
            }
        });
        space.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spaceActionPerformed(evt);
            }
        });

        three.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        three.setText("3");
        three.setName("3"); // NOI18N
        three.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                threeMouseEntered(evt);
            }
        });
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        happy_smiley.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        happy_smiley.setText(":)");
        happy_smiley.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                happy_smileyMouseEntered(evt);
            }
        });
        happy_smiley.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                happy_smileyActionPerformed(evt);
            }
        });

        question.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        question.setText("?");
        question.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                questionMouseEntered(evt);
            }
        });
        question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionActionPerformed(evt);
            }
        });

        exclamation.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        exclamation.setText("!");
        exclamation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exclamationMouseEntered(evt);
            }
        });
        exclamation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exclamationActionPerformed(evt);
            }
        });

        zero.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        zero.setText("0");
        zero.setName("0"); // NOI18N
        zero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                zeroMouseEntered(evt);
            }
        });
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        Enter.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Enter.setText("Enter");
        Enter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EnterMouseEntered(evt);
            }
        });
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Clear.setText("Clear");
        Clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ClearMouseEntered(evt);
            }
        });
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        jTextArea1.setRows(3);
        jScrollPane1.setViewportView(jTextArea1);

        Exit.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Exit.setText("Exit");
        Exit.setName("9"); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitMouseEntered(evt);
            }
        });
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Z, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(V, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(exclamation, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(happy_smiley, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(wink_smiley, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(sad_smiley, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(space, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(period, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(backspace, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                    .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Q, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(W, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(T, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Y, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(U, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(I, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(S, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(J, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(K, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(L, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(P, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Q, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(W, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Y, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(U, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(S, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(K, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(L, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(P, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(period, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(space, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Z, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exclamation, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(happy_smiley, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wink_smiley, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sad_smiley, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SActionPerformed
        setText("S");
}//GEN-LAST:event_SActionPerformed

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
        setText("E");
}//GEN-LAST:event_EActionPerformed

    private void QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QActionPerformed
        setText("Q");
}//GEN-LAST:event_QActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        setText("A");
}//GEN-LAST:event_AActionPerformed

    private void WActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WActionPerformed
        setText("W");
    }//GEN-LAST:event_WActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        setText("D");
  }//GEN-LAST:event_DActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
        setText("F");
 }//GEN-LAST:event_FActionPerformed

    private void GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GActionPerformed
        setText("G");
  }//GEN-LAST:event_GActionPerformed

    private void HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HActionPerformed
        setText("H");
  }//GEN-LAST:event_HActionPerformed

    private void JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JActionPerformed
        setText("J");
 }//GEN-LAST:event_JActionPerformed

    private void KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KActionPerformed
        setText("K");
  }//GEN-LAST:event_KActionPerformed

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        setText("X");
  }//GEN-LAST:event_XActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        setText("C");
  }//GEN-LAST:event_CActionPerformed

    private void VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VActionPerformed
        setText("V");
   }//GEN-LAST:event_VActionPerformed

    private void RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RActionPerformed
        setText("R");
  }//GEN-LAST:event_RActionPerformed

    private void TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TActionPerformed
        setText("T");
  }//GEN-LAST:event_TActionPerformed

    private void YActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YActionPerformed
        setText("Y");
 }//GEN-LAST:event_YActionPerformed

    private void UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UActionPerformed
        setText("U");
  }//GEN-LAST:event_UActionPerformed

    private void IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IActionPerformed
        setText("I");
   }//GEN-LAST:event_IActionPerformed

    private void OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OActionPerformed
        setText("O");
  }//GEN-LAST:event_OActionPerformed

    private void LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LActionPerformed
        setText("L");
  }//GEN-LAST:event_LActionPerformed

    private void ZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZActionPerformed
        setText("Z");
 }//GEN-LAST:event_ZActionPerformed

    private void PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PActionPerformed
        setText("P");
  }//GEN-LAST:event_PActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        setText("7");
  }//GEN-LAST:event_sevenActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        setText("4");
  }//GEN-LAST:event_fourActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        setText("B");
  }//GEN-LAST:event_BActionPerformed

    private void NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NActionPerformed
        setText("N");
}//GEN-LAST:event_NActionPerformed

    private void wink_smileyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wink_smileyActionPerformed
        setText(";)");
  }//GEN-LAST:event_wink_smileyActionPerformed

    private void sad_smileyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sad_smileyActionPerformed
        setText(":(");
  }//GEN-LAST:event_sad_smileyActionPerformed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        setText("M");
 }//GEN-LAST:event_MActionPerformed

    private void commaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commaActionPerformed
        setText(",");
   }//GEN-LAST:event_commaActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        setText("8");
 }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        setText("9");
  }//GEN-LAST:event_nineActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        setText("5");
 }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        setText("6");
}//GEN-LAST:event_sixActionPerformed

    private void periodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodActionPerformed
        setText(".");
}//GEN-LAST:event_periodActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
        BSB = true;
        setText("<---");
    }//GEN-LAST:event_backspaceActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        setText("1");
}//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        setText("2");
}//GEN-LAST:event_twoActionPerformed

    private void spaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spaceActionPerformed
        setText("Space");
     }//GEN-LAST:event_spaceActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        setText("3");
}//GEN-LAST:event_threeActionPerformed

    private void happy_smileyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_happy_smileyActionPerformed
        setText(":)");
}//GEN-LAST:event_happy_smileyActionPerformed

    private void questionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionActionPerformed
        setText("?");
}//GEN-LAST:event_questionActionPerformed

    private void exclamationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exclamationActionPerformed
        setText("!");
}//GEN-LAST:event_exclamationActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        setText("0");
}//GEN-LAST:event_zeroActionPerformed

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        setText("Enter");
}//GEN-LAST:event_EnterActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        setText("Clear");
        CB = true;
    }//GEN-LAST:event_ClearActionPerformed

    private void QMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QMouseEntered
        isClick(Q, evt);

    }//GEN-LAST:event_QMouseEntered

    private void WMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WMouseEntered
        isClick(W, evt);

    }//GEN-LAST:event_WMouseEntered

    private void EMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMouseEntered
        isClick(E, evt);
    }//GEN-LAST:event_EMouseEntered

    private void RMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMouseEntered
        isClick(R, evt);
    }//GEN-LAST:event_RMouseEntered

    private void nineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineMouseEntered
        isClick(nine, evt);
    }//GEN-LAST:event_nineMouseEntered

    private void TMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TMouseEntered
        isClick(T, evt);
}//GEN-LAST:event_TMouseEntered

    private void YMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YMouseEntered
        isClick(Y, evt);
}//GEN-LAST:event_YMouseEntered

    private void UMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UMouseEntered
        isClick(U, evt);
}//GEN-LAST:event_UMouseEntered

    private void IMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMouseEntered
        isClick(I, evt);
}//GEN-LAST:event_IMouseEntered

    private void OMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OMouseEntered
        isClick(O, evt);
}//GEN-LAST:event_OMouseEntered
////g/g/g/g/g/g/g/
    private void zeroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zeroMouseEntered
        isClick(zero, evt);
    }//GEN-LAST:event_zeroMouseEntered

    private void oneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneMouseEntered
        isClick(one, evt);
    }//GEN-LAST:event_oneMouseEntered

    private void twoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoMouseEntered
        isClick(two, evt);
    }//GEN-LAST:event_twoMouseEntered

    private void threeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threeMouseEntered
        isClick(three, evt);
    }//GEN-LAST:event_threeMouseEntered

    private void fourMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourMouseEntered
        isClick(four, evt);
    }//GEN-LAST:event_fourMouseEntered

    private void fiveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiveMouseEntered
        isClick(five, evt);
    }//GEN-LAST:event_fiveMouseEntered

    private void sixMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixMouseEntered
        isClick(six, evt);
    }//GEN-LAST:event_sixMouseEntered

    private void AMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseEntered
        isClick(A, evt);
    }//GEN-LAST:event_AMouseEntered

    private void SMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SMouseEntered
        isClick(S, evt);
    }//GEN-LAST:event_SMouseEntered

    private void DMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DMouseEntered
        isClick(D, evt);
    }//GEN-LAST:event_DMouseEntered

    private void FMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FMouseEntered
        isClick(F, evt);
    }//GEN-LAST:event_FMouseEntered

    private void GMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GMouseEntered
        isClick(G, evt);
    }//GEN-LAST:event_GMouseEntered

    private void HMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HMouseEntered
        isClick(H, evt);
    }//GEN-LAST:event_HMouseEntered

    private void ZMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZMouseEntered
        isClick(Z, evt);
    }//GEN-LAST:event_ZMouseEntered

    private void XMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseEntered
        isClick(X, evt);
    }//GEN-LAST:event_XMouseEntered

    private void CMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseEntered
        isClick(C, evt);
    }//GEN-LAST:event_CMouseEntered

    private void VMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VMouseEntered
        isClick(V, evt);
    }//GEN-LAST:event_VMouseEntered

    private void BMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseEntered
        isClick(B, evt);
    }//GEN-LAST:event_BMouseEntered

    private void NMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NMouseEntered
        isClick(N, evt);
    }//GEN-LAST:event_NMouseEntered

    private void MMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MMouseEntered
        isClick(M, evt);
    }//GEN-LAST:event_MMouseEntered

    private void exclamationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exclamationMouseEntered
        isClick(exclamation, evt);
    }//GEN-LAST:event_exclamationMouseEntered

    private void questionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_questionMouseEntered
        isClick(question, evt);
    }//GEN-LAST:event_questionMouseEntered

    private void happy_smileyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_happy_smileyMouseEntered
        isClick(happy_smiley, evt);
    }//GEN-LAST:event_happy_smileyMouseEntered

    private void wink_smileyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wink_smileyMouseEntered
        isClick(wink_smiley, evt);
    }//GEN-LAST:event_wink_smileyMouseEntered

    private void sad_smileyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sad_smileyMouseEntered
        isClick(sad_smiley, evt);
    }//GEN-LAST:event_sad_smileyMouseEntered

    private void spaceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spaceMouseEntered
        isClick(space, evt);
    }//GEN-LAST:event_spaceMouseEntered

    private void sevenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sevenMouseEntered
        isClick(seven, evt);
    }//GEN-LAST:event_sevenMouseEntered

    private void eightMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eightMouseEntered
        isClick(eight, evt);
    }//GEN-LAST:event_eightMouseEntered

    private void PMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMouseEntered
        isClick(P, evt);
    }//GEN-LAST:event_PMouseEntered

    private void JMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMouseEntered
        isClick(J, evt);
    }//GEN-LAST:event_JMouseEntered

    private void KMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KMouseEntered
        isClick(K, evt);
    }//GEN-LAST:event_KMouseEntered

    private void LMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LMouseEntered
        isClick(L, evt);
    }//GEN-LAST:event_LMouseEntered

    private void EnterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnterMouseEntered
        isClick(Enter, evt);
    }//GEN-LAST:event_EnterMouseEntered

    private void backspaceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backspaceMouseEntered
        isClick(backspace, evt);
    }//GEN-LAST:event_backspaceMouseEntered

    private void periodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_periodMouseEntered
        isClick(period, evt);
    }//GEN-LAST:event_periodMouseEntered

    private void commaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commaMouseEntered
        isClick(comma, evt);
    }//GEN-LAST:event_commaMouseEntered

    private void ClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseEntered
        isClick(Clear, evt);
    }//GEN-LAST:event_ClearMouseEntered

    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered
        isClick(Exit, evt);
    }//GEN-LAST:event_ExitMouseEntered

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.JButton C;
    private javax.swing.JButton Clear;
    private javax.swing.JButton D;
    private javax.swing.JButton E;
    private javax.swing.JButton Enter;
    private javax.swing.JButton Exit;
    private javax.swing.JButton F;
    private javax.swing.JButton G;
    private javax.swing.JButton H;
    private javax.swing.JButton I;
    private javax.swing.JButton J;
    private javax.swing.JButton K;
    private javax.swing.JButton L;
    private javax.swing.JButton M;
    private javax.swing.JButton N;
    private javax.swing.JButton O;
    private javax.swing.JButton P;
    private javax.swing.JButton Q;
    private javax.swing.JButton R;
    private javax.swing.JButton S;
    private javax.swing.JButton T;
    private javax.swing.JButton U;
    private javax.swing.JButton V;
    private javax.swing.JButton W;
    private javax.swing.JButton X;
    private javax.swing.JButton Y;
    private javax.swing.JButton Z;
    private javax.swing.JButton backspace;
    private javax.swing.JButton comma;
    private javax.swing.JButton eight;
    private javax.swing.JButton exclamation;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton happy_smiley;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton period;
    private javax.swing.JButton question;
    private javax.swing.JButton sad_smiley;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton space;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton wink_smiley;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
