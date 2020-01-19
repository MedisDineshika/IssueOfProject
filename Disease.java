package com.pharmacy.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name ="Disease")
	public class Disease {

		@GeneratedValue @Id
		private int id;
		
		@Column(name="name_Of_Disease")
		private String name_Of_Disease;
		
		
		
		public Disease(int id, String name_Of_Disease) {
			super();
			this.id = id;
			this.name_Of_Disease = name_Of_Disease;
		}

		public Disease() {
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName_Of_Disease() {
			return name_Of_Disease;
		}

		public void setName_Of_Disease(String name_Of_Disease) {
			this.name_Of_Disease = name_Of_Disease;
		}

		
	
}

	
