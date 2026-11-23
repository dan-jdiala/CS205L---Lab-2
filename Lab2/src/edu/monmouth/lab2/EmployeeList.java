package edu.monmouth.lab2;

import edu.monmouth.employee.*;
import java.util.List;
import java.util.ArrayList;

public class EmployeeList {
	private EmployeeNode head; 

	public EmployeeList() {
		head = null;
	}

	public void add(MuEmployee element) {
		// insert this MUEmployee object into the list
		EmployeeNode newEmployee = new EmployeeNode(element);
		EmployeeNode current = this.head;
		  
		  if (current == null) {
			  this.head = newEmployee;
		  }
		  
		  else {
			  current.setPrevious(newEmployee);
			  newEmployee.setNext(current);
			  this.head = newEmployee;
		  }
	}
	
	public boolean find(MuEmployee employee) {
	    // iterate thru list comparing each node's info to parameter
		EmployeeNode current = this.head;
		
		while (current != null) {
			
			if (current.getInfo().equals(employee)) {
				return true;
			}
			
			current = current.getNext();
		}
		  
		return false;
	}
	
	
	public String printReverse() {
//		StringBuilder sb = new StringBuilder();
		List listOfEmployees = new ArrayList();
		StringBuilder reverseSB = new StringBuilder();
		EmployeeNode current = this.head;
		
		while (current != null) {
//			sb.append(current.toString() + "\n");
			listOfEmployees.add(current);
			current = current.getNext();
		}
		
		for (int i = 1; i < listOfEmployees.size()+1; i++) {
			reverseSB.append(listOfEmployees.get(listOfEmployees.size() - i) + "\n");
		}
		
		return reverseSB.toString();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		EmployeeNode current = this.head;
		
		while (current != null) {
			sb.append(current.toString() + "\n");
			current = current.getNext();
		}
		
		return sb.toString();
	}
}