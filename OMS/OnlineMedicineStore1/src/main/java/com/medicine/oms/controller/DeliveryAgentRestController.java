//package com.oms.controller;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.oms.dto.ErrorDTO;
//import com.oms.dto.MyDTO;
//import com.oms.service.DeliveryAgentService;
//import com.oms.util.UserDTOConvertor;
//import com.oms.dto.UserDeliveryAgentCreatedResponseDTO;
//import com.oms.entity.DeliveryAgent;
//import com.oms.entity.User;
//import com.oms.entity.Order;
//import com.oms.entity.Medicine;
//import com.oms.entity.Review;
//import com.oms.service.UserService;
//import com.oms.service.OrderService;
//import com.oms.dto.UserDefaultResponseDTO;
//
////import com.oms.dto.UserReviewCreatedResponseDTO;
////import com.oms.service.ProfileService;
////import com.oms.service.ReviewService;
//
//
//@RestController
//@RequestMapping("/ms/deliveryAgent")
//public class DeliveryAgentRestController {
//	@Autowired
//	DeliveryAgentService deliveryAgentService;
//	
//	@Autowired
//	UserService userService;
//	
//	@Autowired
//	OrderService onlineOrderService;
//	
////	@Autowired
////	ProfileService profileService;
//	
//
//	//http://localhost:8001/ms/deliveryAgent/user/sachi/deliveryAgent/shipped/cash on delivery
//	@PostMapping("/user/{username}/status/{deliveryStatus}/{payment}/{medicineName}/{orderDate}")
//	public ResponseEntity<MyDTO> addDeliveryAgentByUser(@PathVariable String username,@PathVariable String deliveryStatus,@PathVariable String payment,@PathVariable String medicineName,@PathVariable String orderDate)
//	{
//		
//		User savedUser = null; 
//		try {
//		    savedUser = userService.getUserByUserName(username);
//			if(savedUser != null)
//			{
//				DeliveryAgent deliveryAgent = new DeliveryAgent(username, deliveryStatus,payment, medicineName, LocalDate.now().toString());
//			//	Review post = new Review(description, LocalDate.now().toString(), 0, 0);
//				DeliveryAgent savedDeliveryAgent = deliveryAgentService.addDeliveryAgent(deliveryAgent);
//				
//				if(savedDeliveryAgent.getDeliveryAgentId() != 0)
//				{
//					// code to link post with user
//					User updatedUserWithDeliveryAgent = userService.addDeliveryAgent(savedDeliveryAgent, savedUser);
//					
//					UserDeliveryAgentCreatedResponseDTO dto = UserDTOConvertor.getDeliveryAgentCreatedDTO(updatedUserWithDeliveryAgent,deliveryAgent);
//					
//					return new ResponseEntity<MyDTO>(dto, HttpStatus.OK);
//				}
//				
//			}
//			else
//			{
//				throw new Exception("User not found "+savedUser+" for "+username);
//			}
//			
//		} catch (Exception e) {
//			System.out.println(savedUser+" is not");
//			
//			ErrorDTO errorDto = new ErrorDTO(e.getMessage());
//			return new ResponseEntity<MyDTO>(errorDto, HttpStatus.INTERNAL_SERVER_ERROR);
//			
//		}
//		
//		
//		
//		return null;
//		
//	}
////	http://localhost:8001/es/deliveryAgent/Orders
//	@GetMapping("/Orders")
//	public List<Order> getAllOrders()
//	{
//
//		try {
//			List<Order>  allExtractedUsers = userService.getAllOrders();
//			
//			return allExtractedUsers;
//			
//		} catch (Exception e) {
//		
//			System.out.println(e);
//			
//		}
//		
//		return null;
//	}
//	
//
//	@GetMapping("/Medicines")
//	public List<Medicine> getAllMedicines()
//	{
//
//		try {
//			List<Medicine>  allExtractedUsers = userService.getAllMedicines();
//			
//			return allExtractedUsers;
//			
//		} catch (Exception e) {
//		
//			System.out.println(e);
//			
//		}
//		
//		return null;
//	}
//
//	@GetMapping("/sort/Orders")
//	public 
//	List<Order> sortOnlineOrderbyOrderDate()throws Exception
//	{
//		
//		return onlineOrderService.sortOrderbyOrderDate();
//	}
//	
//	
//} 