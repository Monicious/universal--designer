/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group.work;

import java.util.Scanner;
/**
 *
 * @author SmartPC
 */


    import java.util.Scanner;
    /**
     *
     * @author SmartPC
     */
   public class GROUPWORK { 

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {

            // TODO code application logic heresy
            Scanner in=new Scanner(System.in);

            int test1 = 0,test2 = 0,assg = 0,pract = 0,ue,total=0,j=0,cr=0,sup=0,T=0,a=0,cred = 0,ca = 0,J=1,co=0;
            double gp=0,gpas=0;
            int sum []=new int[5];
            String clas ="", carry = "carry over";
            String [] Carry = new String[5];
            System.out.println("ENTER USER NAME");
            String user =in.next().trim().toUpperCase();
            System.out.println("ENTER PASSWORD");
            String password =in.next().trim().toUpperCase();
            if(user.equalsIgnoreCase("admin")&&password.equalsIgnoreCase("admin")){
                System.out.println("COMPUTER SCIENCE");
                System.out.println("ENTER  STUDENT REG NO");
                String std=in.next().trim().toUpperCase();

                int array []=new int [5];
                String name="";
                String names [] = {"PROGRAMMING","SOFTWARE DEV","DATA BASE","NETWORKS","DATA STRUCTURE"};

                int credit[]={10,10,10,10,9};
                int gpa[]= new int[5];

                do{

                    if(std.contains("T/DEG/20")){
                        
                        do{
                            System.out.println("ENTER MARKS FOR"+"   "+names[cr]);
                     do{
                        System.out.println("ENTER TEST 1");
                        a =in.nextInt();
                        if(a>=0&&a<=10) {
                            test1 = a;
                            break;
                        }
                        else {
                            System.out.println("Invalid input!! try again ");
                        }

                     }while(true);
                     do {
                         System.out.println("ENTER TEST 2");
                         int b =in.nextInt();
                         if(b>=0&&b<=10){
                             test2=b;
                             break;
                         }
                         else {
                             System.out.println("Invalid input!! try again ");
                         }
                     }while (true);

                      do {
                          System.out.println("ENTER ASSIGNMENT");
                          int c = in.nextInt();
                          if(c>=0&&c<=5) {
                              assg = c;
                              break;
                          }
                          else {
                              System.out.println("Invalid input!! try again ");
                          }

                      }while (true);

                      do {
                          System.out.println("ENTER PRACTICAL");
                          int d = in.nextInt();
                          if(d>=0&&d<=15){
                              pract=d;
                             
                                      
                              break;
                          }
                          else {
                              System.out.println("Invalid input!! try again ");
                          }
                          
                      }while (true);
                        sum[cr]=test1+test2+assg+pract;
                       
                           System.out.println("********OPTION MENU*******");
                         String arr []={" ------",".ADD NEXT COURSE",".ABOUT EXAM",".VIEW AND UPDATE COURSEWORK"};
                         if(arr.length-1==4){
                             int y=2;
                             int m=1;
                         System.out.println(y+"    "+arr[y]);
                         y++;
                         m++;
                       }
                       else{
                           System.out.println("********OPTION MENU*******");
                      System.out.println(" ------\n "+"1.ADD NEXT COURSE\n"+"2.ABOUT EXAM\n"+"3.VIEW AND UPDATE COURSEWORK\n");
                       
                       
                       }
                            
                        int accept=in.nextInt();
                         
                   if(accept==1){
                       if((cr)==names.length-1){
                       break;}
                       else{
                       cr++;
                       }
                    continue; 
                    }
                   if(accept==2){
                   break;
                   }
                   if(accept==3){
                   System.out.println("1.VIEW COURSEWORK AND UPDATE\n2.ADD NEXT COURSE");
                   cr++;
                   accept =in.nextInt();
                   if(accept==1){
                   System.out.println("      ------------"+std+"-------------"       );
                   System.out.println("COURSE\t"+" \t          COURSEWORK"+ "  GRADE"+ "  CREDITS"+" REMARK"+"     GPA");
                                              for(int i=0;i<array.length;i++){
                                                   if(sum[i]>=18){
                                                     System.out.println(names[i]+"\t            "+sum[i]+ " \t   |"+" \t    "+ " "+ " \t  |");
                                                                   
                                                                   }
                                                   if(sum[i]<18){
                                                       if(sum[i]<=0){
                                                       System.out.println(names[i]+"\t            "+"_"+ " \t   |"+" \t    "+ " "+ " \t  |");
                                                       }
                                                       else{
                                                   System.out.println(names[i]+"\t            "+"CO"+ " \t   |"+" \t    "+ " "+ " \t  |");
                                                       }
                                                   }
                                                                   
                                                               }
                   System.out.println("1.UPDATE\n2.DELETE");
                             int accep =in.nextInt();
                   if(accep==1){
                       System.out.println("ENTER COURSE NUMBER TO UPDATE");
                   int update=in.nextInt();
                   System.out.println("ENTER CORRECT MARKS");
                   sum[update-1]=in.nextInt();
                   
                   }
                    if(accep==2){
                       System.out.println("ENTER COURSE NUMBER TO DELETE");
                   int delete=in.nextInt();
                   sum[delete-1]=0;
                   
                   
                   }
                    else{
                    continue;
                    }
                   }
                   }
                   else{
                   System.out.println("invalid choice");
                   }
                        
                   
                    }while(true);
                        
                       

                        if(false ) {

                        }
                        else{
                            
                            if(false){
                               
                            }
                            else {
                                int I=0;
                                    if(sum[I]>=18){
                                        I++;

                                System.out.println("CHOOSE EXAM TYPE \n1.UE\n2.SPECIAL");
                                int exam=in.nextInt();
                                if(exam==1){
                                    do{
                                        if(!(sum[co]==0)){
                                            co++;
                                    System.out.println("PLEASE ENTER MARKS FOR UE:");
                                    ue =in.nextInt();
                                    if(ue<=60&&ue>=0){
                                        //proper loop is comming dont forget programmer
                                        int inc=0;
                                        total = sum[inc]+ue;
                                   
                                        array[j]=total;
                                         inc++;
                                        j++;
                                        

                                        if((j)==array.length){
                                            System.out.println("                     ------------"+std+"-------------"       );
                                            System.out.println("COURSE\t"+"\t        COURSE/W"+" \t          MARKS"+ "  GRADE"+ "  CREDITS"+" REMARK"+"     GPA");

                                            System.out.println("");
                                            for(int i=0;i<array.length;i++){

                                                if(array[i]<55 && array[i]>=45){
                                                    gpa[i]=credit[i]*2;
                                                    System.out.println(names[i]+"        "+sum[i]+"\t            "+array[i]+ " \t   |C"+" \t    "+ credit[i]+ " \t  |PASS");}
                                                if(array[i]<75 && array[i]>=65){
                                                    gpa[i]=credit[i]*4;
                                                    System.out.println(names[i]+"        "+sum[i]+"\t            "+array[i]+ " \t   |B+"+" \t    "+credit[i]+ " \t  |PASS");}
                                                else if(array[i]<65 && array[i]>=55){
                                                    gpa[i]=credit[i]*3;
                                                    System.out.println(names[i]+"        "+sum[i] +"\t            "+array[i]+ " \t   |B"+" \t     "+credit[i]+ " \t  |PASS");}
                                                else if(array[i]<=100 && array[i]>=75){
                                                    gpa[i]=credit[i]*5;
                                                    System.out.println(names[i]+"        "+sum[i]+"\t            "+array[i]+ " \t   |A"+" \t    "+credit[i]+ " \t   |PASS");}
                                                else if(array[i]<45&&array[i]>=0) {
                                                    sup=1;
                                                    System.out.println(names[i]+"        "+sum+" \t            "+array[i]+ " \t    "+" \t    "+credit[i]+ " \t   |SUP");}

                                            }
                                            if(sup==0){
                                                for(int g=0;g<gpa.length;g++){
                                                    gp += gpa[g];
                                                    cred +=credit[g];
                                                    T +=array[g];
                                                }
                                                 gpas=(gp/cred);
                                                for(int i=0;i<=65;i++){
                                                    System.out.print("_");
                                                }
                                                System.out.println("");
                                                System.out.format("       TOTAL"+" \t           |"+T+ "\t           |"+cred+ "\t          "+"    %.1f ",gpas);
                                                System.out.println("");
                                                if(gpas<=5&&gpas>=4.5){
                                                    clas="FIRST CLASS";
                                                    if(gpas<=4.4&&gpas>=4){
                                                        clas="UPPER SECOND";
                                                    }
                                                    if(gpas<=3.9&&gpas>=3.5){
                                                        clas="LOWER SECOND CLASS";
                                                    }if(gpas<=3.4&&gpas>=2.8){
                                                        clas="THIRD CLASS";
                                                    }
                                                    for(int i=0;i<=65;i++){
                                                        System.out.print("_");
                                                    }
                                                    System.out.println("\n");
                                                    System.out.println(" CLASS     "+"\t"+clas);
                                                }
                                            }
                                            else{

                                                System.out.println("");
                                                 System.out.format("       TOTAL"+" \t           |"+T+ "\t           |"+cred+ "\t          "+"    %.1f ",gpas);
                                            }
                                            System.out.println("ADD ANOTHER STUDENT REG NO && DETAIL (YES/NO)");
                                            String s=in.next();
                                            if(s.equalsIgnoreCase("yes")||s.equalsIgnoreCase("y")){
                                                reg();
                                            }
                                            else if(s.equalsIgnoreCase("no")||s.equalsIgnoreCase("n")){
                                                System.out.println("welcome again");
                                                break;
                                            }
                                            else{
                                                System.out.println("UNKNOWN INPUT");
                                                break;
                                            }


                                        }
                                        
                                    }
                                        }
                                        else{
                                        System.out.println("no course work make sure you fill it");//loooping
                                        break;
                                        }
                                }while(true);

                                }
                                else if(exam==2){
                                    System.out.println(std+" "+" CORSE WORK" +sum+" :-WAIT FOR SPECIAL EXAM");
                                    break;
                                }

        
                            }
                                    else{  
                                        
                                    System.out.println(sum[I]+" ---  IS BELOW 18 "+" your notelligible to seat for ue exam");
                                    cr++;
                                    }
                        }

                               
                        System.out.println("ADD  MARKS FOR -"+names[J]+"- COURSE 1.YES\n2.NO)");
                           J++;
                        int z=in.nextInt();
                        if(z==1){
                            continue;
                        }
                        else if(z==2){
                            System.out.println("welcome again");
                            break;
                        }
                        else{
                            System.out.println("UNKNOWN INPUT");
                            break;
                        }
                        }
                        
                        
                        
                    }
                        
                    else{
                        System.out.println("ENTER VALID REG NO ");
                        reg();
                    }
                
                }
                while(true);
            }
            else{
                System.out.println("incorrect username or password");
                reg();
            }
        }

        public static void reg(){
            main(null);
        }
    }


