package com.kce.Dao;

public class LibraryDao {
  private static Connection connect;

	private static PreparedStatement pst;

	private static Statement stat;

	private static ResultSet rst;

	private static Scanner sc = new Scanner(System.in);

	

	public static void create() throws ClassNotFoundException, SQLException {

		connect = DBUtil.getConnection();

		pst = connect.prepareStatement("create table Library (Book_Id number(5) PRIMARY KEY)"+

		"Book_Title varchar(15) NOT NULL"+"gender varchar(10)"+"Book_Author varchar(10)"+

				"Book_Name varchar(75)"+")");

		System.out.println("Library table is created successfully......!");

	}

	public static void insert(int noofbooks) throws ClassNotFoundException, SQLException {

		connect = DBUtil.getConnection();

		pst = connect.prepareStatement("insert into Books values(?,?,?,?,?,?,?)");

		for(int i=0;i<noofbooks;i++) {

			System.out.println("Enter the  id: ");

			pst.setInt(1, sc.nextInt());

			System.out.println("Enter the title: ");

			pst.setString(2, sc.next());

			System.out.println("Enter the author: ");

			pst.setString(3, sc.next());

			System.out.println("Enter the name: ");

			pst.setString(4, sc.next());

			
		}

		System.out.println("Library table is inserted successfully......!");

	}

	public static void display() throws ClassNotFoundException, SQLException {

		connect = DBUtil.getConnection();

		stat=connect.createStatement();

		rst=stat.executeQuery("select * from Books");

		while(rst.next()) {

			System.out.println(rst.getInt(1)+"/t"+rst.getString(2)+"/t"+rst.getString(3)+

					"/t"+rst.getString(4));

		}

	}

	public static void delete(String name) throws ClassNotFoundException, SQLException {

		connect = DBUtil.getConnection();

		stat=connect.createStatement();

		stat.executeUpdate("delete from Library where Book_name="+name);

		System.out.println("Row deleted successfully......!");

	}

	public static void display1() throws ClassNotFoundException, SQLException {

		connect = DBUtil.getConnection();

		stat=connect.createStatement();

		rst=stat.executeQuery("select * from Employees");

		while(rst.next()) {

			System.out.println(rst.getInt(1)+"/t"+rst.getString(2)+"/t"+rst.getString(3)+

					"/t"+rst.getString(4));

		}

	}

	public static void update() throws ClassNotFoundException, SQLException {

	    connect = DBUtil.getConnection();

	    pst = connect.prepareStatement("UPDATE LIBRARY SET Book_id=?, title=?, author=?, name=?,  WHERE Book_id=?");

	  

	    System.out.println("Enter the Book id: ");

	    int BookId = sc.nextInt();

	    

	    System.out.println("Enter the updated title: ");

	    pst.setString(1, sc.next());

	    

	    System.out.println("Enter the updated author: ");

	    pst.setString(2, sc.next());

	    

	    System.out.println("Enter the updated name: ");

	    pst.setString(3, sc.next());

	    

	    System.out.println("Enter the updated email id: ");

	    pst.setString(4, sc.next());

	    pst.setInt(4, BookId);



	    int rowsUpdated = pst.executeUpdate();

	    if (rowsUpdated > 0) {

	        System.out.println("Library record updated successfully!");

	    } else {

	        System.out.println("Failed to update Library record. Please check the Book id.");

	    }

	}

	public static void display2() throws ClassNotFoundException, SQLException {

	    connect = DBUtil.getConnection();

	    stat = connect.createStatement();

	    rst = stat.executeQuery("SELECT * FROM Book");

	    while(rst.next()) {

	    	System.out.println(rst.getInt(1)+"\t"+rst.getString(2)+"\t"+rst.getString(3)+

					"\t"+rst.getString(4));

		}

	}

	public static void truncateTable() throws ClassNotFoundException, SQLException {

	    connect = DBUtil.getConnection();

	    stat = connect.createStatement();

	    stat.executeUpdate("TRUNCATE TABLE LIBRARY");

	    System.out.println("Employee table truncated successfully!");

	}

	public static void deleteTable() throws ClassNotFoundException, SQLException {

	    connect = DBUtil.getConnection();

	    stat = connect.createStatement();

	    stat.executeUpdate("DROP TABLE LIBRARY");

	    System.out.println("Library table deleted successfully........!");

	}

	public static void option() {

		System.out.println("1.Creating table"+"\n"+"2.Inserting data"+"\n"+"3.Displaying the data after inserting the details"+

	"\n"+"4.Deleteing a single row"+"\n"+"5.Updateing a row"+"\n"+"6.Displaying the table after update"+"\n"+

				"7.Deleting the entire rows of the table"+"\n"+"8.Deleting the created table");

	}

}
