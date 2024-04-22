/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jdk;
//import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AKASH
 */
public class StudentWork extends javax.swing.JFrame {

    /**
     * Creates new form StudentWork
     */
    public StudentWork() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        myparttable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        expEvent = new javax.swing.JTable();
        exploreevents = new javax.swing.JButton();
        myparticipation = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        eventid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cuserid = new javax.swing.JTextField();
        ceventid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        chkuserid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));

        myparttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "EventID", "EventName", "EventDate", "Time ", "Location", "Description", "Fees", "Capacity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(myparttable);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        expEvent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "EventID", "EventName", "EventDate", "Time ", "Location", "Description", "Fees", "Capacity", "Organiser"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(expEvent);

        exploreevents.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exploreevents.setText("Explore Events");
        exploreevents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exploreeventsActionPerformed(evt);
            }
        });

        myparticipation.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        myparticipation.setText("My Participation");
        myparticipation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myparticipationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(exploreevents, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(myparticipation)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exploreevents, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(myparticipation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        jPanel3.setForeground(new java.awt.Color(255, 204, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Register for Event");

        jLabel2.setText("User ID");

        userid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridActionPerformed(evt);
            }
        });

        jLabel3.setText("Event ID");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Cancel Registration");

        jLabel6.setText("User ID");

        jLabel7.setText("Event ID");

        cuserid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuseridActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Enter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 153, 0));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Check Your Participation");

        jLabel10.setText("Enter Your User ID");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(85, 85, 85)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eventid)
                                    .addComponent(userid)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(69, 69, 69)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ceventid, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cuserid, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jButton1))
                    .addComponent(jButton3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel10)
                        .addGap(79, 79, 79)
                        .addComponent(chkuserid, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(54, 54, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(eventid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(53, 53, 53)
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cuserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ceventid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(chkuserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    private void useridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useridActionPerformed

    private void cuseridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuseridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuseridActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
       homepage sr=new homepage();
        sr.show();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        String url="jdbc:mysql://localhost:3306/miniproject?useSSL=false";
	String User_name="root";
	String pass_word="Mysql@123";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection(url,User_name,pass_word);
            String query="insert into registration(eid,uid) values(?,?)";
            int uid=Integer.parseInt(userid.getText());
            int eveid=Integer.parseInt(eventid.getText());
            PreparedStatement prep_stmt=con.prepareStatement(query);
            prep_stmt.setInt(1, eveid);
            prep_stmt.setInt(2, uid);
            prep_stmt.execute();
             
            JOptionPane.showMessageDialog(this,"Registered successefully !");
             userid.setText("");
             eventid.setText("");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentWork.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this,"No seats are availabel !");
            Logger.getLogger(StudentWork.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void myparticipationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myparticipationActionPerformed
        // TODO add your handling code here:
          DefaultTableModel abc=(DefaultTableModel) myparttable.getModel();

       
            String EveID,fees,Cap;
            String EveName,EveDate,time,Loc,Desc;
            try {
                abc.setRowCount(0);
                String url="jdbc:mysql://localhost:3306/miniproject?useSSL=false";
	String User_name="root";
	String pass_word="Mysql@123";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con =DriverManager.getConnection(url,User_name,pass_word);
        int uid=Integer.parseInt(chkuserid.getText());
        String Queryy="select event.eid,ename,edate,time,location,edesc,fees,capacity from event inner join registration on event.eid=" +
"registration.eid and uid="+uid;
       // String Queryy="SELECT event.eid, event.ename, edate, time, location, edesc, fees, capacity" +
             //  "FROM event INNER JOIN registration ON registration.eid = event.eid";
             
                java.sql.Statement st=con.createStatement();
              ResultSet rs=  st.executeQuery(Queryy);
               // ResultSetMetaData rsmd=rs.getMetaData();
             // String[] colName=new String[9];
              while(rs.next()){
             EveID=rs.getString(1);
             EveName=rs.getString(2);
             EveDate=rs.getString(3);
             time=rs.getString(4);
             Loc=rs.getString(5);
             Desc=rs.getString(6);
             fees=rs.getString(7);
             Cap=rs.getString(8);
            // Organiser=rs.getString(9);
             String[] row={EveID,EveName,EveDate,time,Loc,Desc,fees,Cap};
             abc.addRow(row);
              }
              st.close();
             con.close();
       //ResultSet rs=st.executeQuery();
       /* while(rs.next()){
            EventID=rs.getInt(1);
             EventName=rs.getString(2);
             EventDate=rs.getString(3);
             Time=rs.getString(4);
             Location=rs.getString(5);
             Description=rs.getString(6);
             Fees=rs.getInt(7);
             Capacity=rs.getInt(8);
             Organiser=rs.getString(8);
            
             //tblModel.addRow(EventID,EventName,EventDate,Time,Location,Description,Fees,Capacity,Organiser);
        }*/
         
        
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(StudentWork.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(StudentWork.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           // Connection con =DriverManager.getConnection(url,User_name,pass_word);
         
    }//GEN-LAST:event_myparticipationActionPerformed

    private void exploreeventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exploreeventsActionPerformed
        // TODO add your handling code here:
                DefaultTableModel tblModel=(DefaultTableModel) expEvent.getModel();

       
            String EventID,Fees,Capacity;
            String EventName,EventDate,Time,Location,Description,Organiser;
            try {
                tblModel.setRowCount(0);
                String url="jdbc:mysql://localhost:3306/miniproject?useSSL=false";
	String User_name="root";
	String pass_word="Mysql@123";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con =DriverManager.getConnection(url,User_name,pass_word);
        String query="select eid,ename,edate,time,location,edesc,fees,capacity,customer.cust_name from event inner join customer on event.custid=customer.custid ";
                java.sql.Statement st=con.createStatement();
              ResultSet rs=  st.executeQuery(query);
               // ResultSetMetaData rsmd=rs.getMetaData();
             // String[] colName=new String[9];
              while(rs.next()){
                  EventID=rs.getString(1);
             EventName=rs.getString(2);
             EventDate=rs.getString(3);
             Time=rs.getString(4);
             Location=rs.getString(5);
             Description=rs.getString(6);
             Fees=rs.getString(7);
             Capacity=rs.getString(8);
             Organiser=rs.getString(9);
             String[] rows={EventID,EventName,EventDate,Time,Location,Description,Fees,Capacity,Organiser};
             tblModel.addRow(rows);
              }
              st.close();
              con.close();
       //ResultSet rs=st.executeQuery();
       /* while(rs.next()){
            EventID=rs.getInt(1);
             EventName=rs.getString(2);
             EventDate=rs.getString(3);
             Time=rs.getString(4);
             Location=rs.getString(5);
             Description=rs.getString(6);
             Fees=rs.getInt(7);
             Capacity=rs.getInt(8);
             Organiser=rs.getString(8);
            
             //tblModel.addRow(EventID,EventName,EventDate,Time,Location,Description,Fees,Capacity,Organiser);
        }*/
         
        
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(StudentWork.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(StudentWork.class.getName()).log(Level.SEVERE, null, ex);
            }
           // Connection con =DriverManager.getConnection(url,User_name,pass_word);
            
        
    }//GEN-LAST:event_exploreeventsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
        String url="jdbc:mysql://localhost:3306/miniproject?useSSL=false";
	String User_name="root";
	String pass_word="Mysql@123";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection(url,User_name,pass_word);
            String query="delete from registration where uid=? and eid=?";
            int uid=Integer.parseInt(cuserid.getText());
            int eveid=Integer.parseInt(ceventid.getText());
            PreparedStatement prep_stmt=con.prepareStatement(query);
            prep_stmt.setInt(1, uid);
            prep_stmt.setInt(2, eveid);
          //  prep_stmt.setInt(1, uid);
            prep_stmt.execute();
             
            JOptionPane.showMessageDialog(this,"canceled registration successefully ! !");
             userid.setText("");
             eventid.setText("");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentWork.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(this,"No seats are available ! !");
            Logger.getLogger(StudentWork.class.getName()).log(Level.SEVERE, null, ex);
        }
      
       
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentWork().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ceventid;
    private javax.swing.JTextField chkuserid;
    private javax.swing.JTextField cuserid;
    private javax.swing.JTextField eventid;
    private javax.swing.JTable expEvent;
    private javax.swing.JButton exploreevents;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton myparticipation;
    private javax.swing.JTable myparttable;
    private javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables
}
