
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.ArrayList;
import java.io.*;
public class EmployeeDetails {
	public static void main(String[] args)  {
        ArrayList<EmpDetail> list = new ArrayList<EmpDetail>();
        Scanner sc = new Scanner(System.in);
        System.out.println("*******Menu********"+"\n"+"1. Add Employee" + "\n" + "2. Display All" + "\n" + "3. Add to File"
                             + "\n" + "4. Read from File" + "\n" + "5. Exit");
        boolean flag = true;
        
        while(flag){
            System.out.println("Enter Your Choice: ");
            int choice = sc.nextInt();    
            switch(choice)
            {
                case 1:
                    {
                        System.out.println("Enter Employee ID: ");
                        int id = sc.nextInt();
                        System.out.println("Enter Employee Name: ");
                        String name = sc.next();
                        System.out.println("Enter Employee Age: ");
                        int age = sc.nextInt();
                        System.out.println("Enter Employee Salary: ");
                        int salary = sc.nextInt();

                        list.add(new EmpDetail(id, name, age, salary));
                        System.out.println("Data Successfully Entered");
                        break;
                    }
                case 2:
                    {
                        for (EmpDetail employeeData : list) {
                            System.out.println(employeeData);
                        }
                        break;
                    }                     
                case 3:
                    {   
                        System.out.println("Enter File Name to Write the Objects: ");
                        String File_Name = sc.next(); 
                        try
                        {   
                            FileOutputStream fname = new FileOutputStream(File_Name);
                            ObjectOutputStream Oname = new ObjectOutputStream(fname);
                            Oname.writeObject(list);
                            Oname.close();
                            fname.close();
                            System.out.println("Data Has Been Stored In File");
                        }
                        catch (IOException ioe) 
                        {
                            ioe.printStackTrace();
                        }
                        break;
                    }
                case 4:
                    {
                        ArrayList<EmpDetail> emp = new ArrayList<>();
                        System.out.println("Enter File Name to Read Employee Data: ");
                        String File_Name = sc.next();    
                        try
                        {
                            FileInputStream finput = new FileInputStream(File_Name);
                            ObjectInputStream Oinput = new ObjectInputStream(finput);
                
                            emp = (ArrayList) Oinput.readObject();
                
                            Oinput.close();
                            finput.close();
                        } 
                        catch (IOException ioe) 
                        {
                            ioe.printStackTrace();
                            return;
                        } 
                        catch (ClassNotFoundException c) 
                        {
                            System.out.println("Class not found");
                            c.printStackTrace();
                            return;
                        }
                        for (EmpDetail employee : emp) 
                        {
                            System.out.println(employee);
                        }
                        break;
                    }
                case 5:
                    { System.out.println("THANK YOU FOR USING");
                        flag = false;
                        break;
                    }
                }    
                
        }
    }

}
