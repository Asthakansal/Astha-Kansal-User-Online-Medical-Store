//package com.medicine.oms.service;
//
//
//
//import java.util.List;
//
//import org.apache.catalina.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.medicine.oms.entity.DeliveryAgent;
//import com.medicine.oms.repository.DeliveryAgentRepository;
//import com.medicine.oms.repository.UserRepository;
//@Service
//public class DeliveryAgentServiceImpl implements DeliveryAgentService {
//	@Autowired
//	DeliveryAgentRepository deliveryAgentRepository;
//	
//	@Autowired
//	UserRepository userRepository;
//
//	@Override
//	public DeliveryAgent addDeliveryAgent(DeliveryAgent deliveryAgent)throws Exception {
//		DeliveryAgent savedDeliveryAgent = deliveryAgentRepository.save(deliveryAgent);
//		return savedDeliveryAgent;
//	}
//	
//
//	@Override
//	public List<DeliveryAgent> getAllDeliveryAgentbyUser(String userName) throws Exception {
//	User user = (User) userRepository.getUsersByUsername(userName);
//		
//		
//		return null;
//	}
//
//
//}
