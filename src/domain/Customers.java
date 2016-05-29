package domain;

import java.util.ArrayList;

public class Customers {

		private ArrayList<Customer> customer;

		Customers() {
			this.customer = new ArrayList<Customer>();
		}

		public ArrayList<Customer> getCustomer() {
			return customer;
		}
}
