//package com.medicine.oms.entity;
//
//
//
//
//import java.time.LocalDate;
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "OEDelivery")
//public class DeliveryAgent {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int deliveryAgentId;
//	private String deliveryStatus;
//	private String payment;
//	private String userName;
//	private String medicineName;
//	private String orderDate;
//	
//
////	@OneToMany(cascade = CascadeType.ALL)
////	@JoinColumn(name = "Order")
////	private List<Order> allOrders;
//	
////	@OneToMany(cascade = CascadeType.ALL)
////	@JoinColumn(name = "Medicines")
////	private List<Medicine> allMedicines;
//
//	public DeliveryAgent(String deliveryStatus, String payment, String userName,String medicineName,String orderDate) {
//		super();
//		this.deliveryStatus = deliveryStatus;
//		this.payment = payment;
//		this.userName = userName;
//		this.medicineName=medicineName;
//		this.orderDate=orderDate;
//		
//		
//	}
//
//	
//}