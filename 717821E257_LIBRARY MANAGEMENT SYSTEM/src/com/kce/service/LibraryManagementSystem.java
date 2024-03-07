package com.kce.service;

public class LibraryManagementSystem {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		boolean exit = false;
		while (!exit) {
		LibraryDao.option();
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
		LibraryDao.create();
		break;
		case 2:
		System.out.println("Enter the number of books to insert:");
		int noOfBooks = sc.nextInt();
		LibraryDao.insert(noOfBooks);
		break;
		case 3:
		LibraryDao.display();
		break;

		case 4:
		System.out.println("Enter the books name to delete:");
		String bookName = sc.next();
		LibraryDao.delete(bookName);
		break;
		case 5:
		LibraryDao.update();
		break;
		case 6:
		LibraryDao.display2();
		break;
		case 7:
		LibraryDao.truncateTable();
		break;
		case 8:
		LibraryDao.deleteTable();
		break;
		default:
		System.out.println("Invalid choice. Please enter a valid option.");
		break;
		}
		System.out.println("Do you want to continue (Yes/No)?:");
		String continueChoice = sc.next();
		if (continueChoice.equalsIgnoreCase("No")) {
		exit = true;
		}
		}
		}
		catch (ClassNotFoundException e) {
		System.out.println(e);
		} catch(SQLException e) {
		System.out.println(e);
		}
		}
}



  

}
